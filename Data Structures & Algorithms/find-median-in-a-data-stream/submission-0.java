class MedianFinder {

    // Max Heap (stores smaller half)
    private PriorityQueue<Integer> small;

    // Min Heap (stores larger half)
    private PriorityQueue<Integer> large;

    public MedianFinder() {
        small = new PriorityQueue<>((a, b) -> b - a); // Max Heap
        large = new PriorityQueue<>();               // Min Heap
    }

    public void addNum(int num) {
        // Step 1: Add to appropriate heap
        if (small.isEmpty() || num <= small.peek()) {
            small.offer(num);
        } else {
            large.offer(num);
        }

        // Step 2: Balance the heaps
        if (small.size() > large.size() + 1) {
            large.offer(small.poll());
        } else if (large.size() > small.size()) {
            small.offer(large.poll());
        }
    }

    public double findMedian() {
        if (small.size() == large.size()) {
            return (small.peek() + large.peek()) / 2.0;
        }
        return small.peek();
    }
}