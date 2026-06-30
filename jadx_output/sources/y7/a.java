package y7;

/* loaded from: classes7.dex */
public class a implements java.io.FileFilter {
    @Override // java.io.FileFilter
    public boolean accept(java.io.File file) {
        java.lang.String name = file.getName();
        if (!name.startsWith("cpu")) {
            return false;
        }
        for (int i17 = 3; i17 < name.length(); i17++) {
            if (!java.lang.Character.isDigit(name.charAt(i17))) {
                return false;
            }
        }
        return true;
    }
}
