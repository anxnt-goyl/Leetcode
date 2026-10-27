class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];
        Arrays.fill(grid, "#".repeat(n));
        char[][] a = new char[m][n];
        for (char[] row : a) Arrays.fill(row, '#');
        for (int j = 0; j < n; j++) a[0][j] = '.';
        for (int i = 1; i < m; i++) a[i][n - 1] = '.';
        for (int i = 0; i < m; i++)
            grid[i] = new String(a[i]);
        return grid;
    }
}