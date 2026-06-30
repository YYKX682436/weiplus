package ja1;

/* loaded from: classes7.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f298603a;

    static {
        ja1.e.class.getClassLoader();
        f298603a = false;
    }

    public static com.tencent.mm.vfs.r6 a(java.lang.String str, java.lang.String str2) {
        java.io.BufferedInputStream bufferedInputStream;
        java.lang.Throwable th6;
        java.io.BufferedOutputStream bufferedOutputStream;
        com.tencent.mm.vfs.r6 j17 = com.tencent.mm.vfs.r6.j(com.tencent.mm.sdk.platformtools.x2.f193071a.getDir("magicbrush", 0));
        if (!j17.m() && !j17.J()) {
            throw new java.lang.IllegalStateException();
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(j17, str);
        try {
            bufferedInputStream = new java.io.BufferedInputStream(com.tencent.mm.vfs.w6.E(str2));
            try {
                bufferedOutputStream = new java.io.BufferedOutputStream(com.tencent.mm.vfs.w6.H(r6Var));
                try {
                    s46.d.b(bufferedInputStream, bufferedOutputStream);
                    s46.d.a(bufferedInputStream);
                    s46.d.a(bufferedOutputStream);
                    return r6Var;
                } catch (java.lang.Throwable th7) {
                    th6 = th7;
                    s46.d.a(bufferedInputStream);
                    s46.d.a(bufferedOutputStream);
                    throw th6;
                }
            } catch (java.lang.Throwable th8) {
                bufferedOutputStream = null;
                th6 = th8;
            }
        } catch (java.lang.Throwable th9) {
            bufferedInputStream = null;
            th6 = th9;
            bufferedOutputStream = null;
        }
    }
}
