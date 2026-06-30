package kt5;

/* loaded from: classes13.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f312057a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f312058b = new java.lang.Object();

    public static boolean a() {
        boolean booleanValue;
        java.lang.Throwable th6;
        java.io.FileInputStream fileInputStream;
        synchronized (f312058b) {
            if (f312057a == null) {
                java.lang.Boolean bool = null;
                if (new java.io.File("/sys/fs/selinux/enforce").exists()) {
                    try {
                        fileInputStream = new java.io.FileInputStream("/sys/fs/selinux/enforce");
                    } catch (java.lang.Exception unused) {
                        fileInputStream = null;
                    } catch (java.lang.Throwable th7) {
                        th6 = th7;
                        fileInputStream = null;
                    }
                    try {
                        bool = java.lang.Boolean.valueOf(fileInputStream.read() == 49);
                    } catch (java.lang.Exception unused2) {
                    } catch (java.lang.Throwable th8) {
                        th6 = th8;
                        kt5.b.a(fileInputStream);
                        throw th6;
                    }
                    kt5.b.a(fileInputStream);
                }
                if (bool == null) {
                    bool = java.lang.Boolean.FALSE;
                }
                f312057a = bool;
            }
            booleanValue = f312057a.booleanValue();
        }
        return booleanValue;
    }
}
