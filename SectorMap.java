public class SectorMap {
    void printChannels(int[] readings) {
        for (int i = 0; i < readings.length; i++) {
            System.out.println("Channel " + i + ": " + readings[i]);
        }
    }

    int total(int[] readings) {
        int sum = 0;

        for (int r : readings) {
            sum += r;
        }

        return sum;
    }

    double averageReading(int[] readings) {
        return  (total(readings)*1.0) / readings.length;
    }

    void render(char[][] sector) {
        for (int i = 0; i < sector.length; i++) {
            for (int j = 0; j < sector[i].length; j++) {
                System.out.print(sector[i][j] + " ");
            }

            System.out.println();
        }
    }

    int countStars(char[][] sector) {
        int starCount = 0;
        
        for (int i = 0; i < sector.length; i++) {
            for (int j = 0; j < sector[i].length; j++) {
                if (sector[i][j] == '*') {
                    starCount++;
                }
            }
        }

        return starCount;
    }

    public static void main(String[] args) {
        int[] readings = {44, 91, 0, 12, 88, 7, 60, 33};   // 8 sensor channels

        char[][] sector = {
            {'.', '.', '*', '.', '.'},
            {'.', '@', '.', '.', '*'},
            {'*', '.', '.', '.', '.'},
            {'.', '.', '.', '*', '.'}
        };
        // '.' empty space   '*' star   '@' planet

        SectorMap map = new SectorMap();

        System.out.println();
        map.printChannels(readings);
        System.out.println("Total: " + map.total(readings));
        System.out.println("Average: " + map.averageReading(readings));
        map.render(sector);
        System.out.println("Stars detected: " + map.countStars(sector));
        System.out.println();
    }
}