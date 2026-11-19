public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int[][] adjacencyMatrix = m;
        int startVertex = i;
        int destinationVertex = j;
        if (startVertex == destinationVertex) {
            return 0;
        }
        int vertexCount = adjacencyMatrix.length;
        int[] distancesFromStart = new int[vertexCount];
        java.util.Arrays.fill(distancesFromStart, -1);
        int[] vertexQueue = new int[vertexCount];
        int queueReadIndex = 0;
        int queueWriteIndex = 0;
        vertexQueue[queueWriteIndex++] = startVertex;
        distancesFromStart[startVertex] = 0;

        while (queueReadIndex < queueWriteIndex) {
            int currentVertex = vertexQueue[queueReadIndex++];
            for (int neighborVertex = 0; neighborVertex < vertexCount; neighborVertex++) {
                if (adjacencyMatrix[currentVertex][neighborVertex] == 1
                        && distancesFromStart[neighborVertex] == -1) {
                    distancesFromStart[neighborVertex] = distancesFromStart[currentVertex] + 1;
                    if (neighborVertex == destinationVertex) {
                        return distancesFromStart[neighborVertex];
                    }
                    vertexQueue[queueWriteIndex++] = neighborVertex;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
                findShortestPath(new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }, 0, 1)); // -1
        System.out.println(
                findShortestPath(new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }, 1, 1)); // 0
        System.out.println(
                findShortestPath(new int[][] { { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 }, { 1, 0, 0, 0 } }, 0, 2)); // 2
        System.out.println(
                findShortestPath(new int[][] { { 0, 1, 0, 1 }, { 0, 0, 0, 1 }, { 0, 0, 0, 0 }, { 0, 0, 1, 0 } }, 0, 2)); // 2
    }
}
