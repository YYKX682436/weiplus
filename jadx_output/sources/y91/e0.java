package y91;

/* loaded from: classes16.dex */
public class e0 implements r56.b {
    public e0(y91.i0 i0Var) {
    }

    @Override // r56.b
    public void call(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        if (th6 == null || th6.getMessage() == null) {
            int i17 = y91.i0.f460281h;
            v91.b.a("i0", "action send fail");
        } else {
            int i18 = y91.i0.f460281h;
            v91.b.a("i0", "action send fail:" + th6.getMessage());
        }
    }
}
