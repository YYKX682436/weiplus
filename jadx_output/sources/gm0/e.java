package gm0;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final gm0.e f273180a = new gm0.e();

    public static /* synthetic */ boolean b(gm0.e eVar, java.io.File file, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            i17 = 0;
        }
        if ((i19 & 4) != 0) {
            i18 = 0;
        }
        return eVar.a(file, i17, i18);
    }

    public final boolean a(java.io.File file, int i17, int i18) {
        java.io.File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return true;
        }
        for (java.io.File file2 : listFiles) {
            if (file2.isFile() && !file2.getName().equals(".nomedia")) {
                return false;
            }
            if (file2.isDirectory() && (i18 >= i17 || !f273180a.a(file2, i17, i18 + 1))) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(java.io.File file) {
        return (b(this, new java.io.File(file, "image2"), 3, 0, 4, null) && b(this, new java.io.File(file, "video"), 3, 0, 4, null) && b(this, new java.io.File(file, "voice2"), 3, 0, 4, null) && b(this, new java.io.File(file, "record"), 3, 0, 4, null) && b(this, new java.io.File(file, "attachment"), 3, 0, 4, null)) ? false : true;
    }
}
