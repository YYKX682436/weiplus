package y91;

/* loaded from: classes16.dex */
public class g0 implements r56.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y91.i0 f460273d;

    public g0(y91.i0 i0Var) {
        this.f460273d = i0Var;
    }

    @Override // r56.b
    public void call(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        ((java.util.HashSet) this.f460273d.f460288g).clear();
        if (th6 == null || th6.getMessage() == null) {
            int i17 = y91.i0.f460281h;
            v91.b.a("i0", "get mDevice info err");
        } else {
            int i18 = y91.i0.f460281h;
            v91.b.a("i0", "get mDevice info err:" + th6.getMessage());
        }
    }
}
