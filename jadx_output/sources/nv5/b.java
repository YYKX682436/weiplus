package nv5;

/* loaded from: classes12.dex */
public class b extends nv5.a {
    @Override // nv5.a
    public int a(java.io.InputStream inputStream, java.io.InputStream inputStream2, java.io.File file, boolean z17) {
        if (!z17) {
            if (inputStream == null) {
                return 3;
            }
            if (file == null) {
                return 4;
            }
            if (inputStream2 == null) {
                return 2;
            }
            byte[] a17 = gv5.b.a(inputStream);
            byte[] a18 = gv5.b.a(inputStream2);
            byte[] a19 = gv5.a.a(a17, a17.length, a18, a18.length, 0);
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            try {
                fileOutputStream.write(a19);
                return 1;
            } finally {
                fileOutputStream.close();
            }
        }
        if (inputStream == null) {
            return 3;
        }
        if (file == null) {
            return 4;
        }
        if (inputStream2 == null) {
            return 2;
        }
        byte[] a27 = gv5.b.a(inputStream);
        byte[] a28 = gv5.b.a(inputStream2);
        byte[] a29 = gv5.a.a(a27, a27.length, a28, a28.length, 0);
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            java.io.FileOutputStream fileOutputStream3 = new java.io.FileOutputStream(file);
            try {
                file.setReadOnly();
                fileOutputStream3.write(a29);
                lv5.a.a(fileOutputStream3);
                return 1;
            } catch (java.lang.Throwable th6) {
                th = th6;
                fileOutputStream2 = fileOutputStream3;
                lv5.a.a(fileOutputStream2);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
