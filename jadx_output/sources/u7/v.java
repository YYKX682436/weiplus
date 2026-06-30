package u7;

/* loaded from: classes12.dex */
public abstract class v {
    public static boolean a(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        java.lang.String[] list = file.list();
        if (list != null) {
            for (java.lang.String str2 : list) {
                a(str + java.io.File.separator + str2);
            }
        }
        return file.delete();
    }
}
