package sl0;

/* loaded from: classes11.dex */
public class v0 implements ll0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sl0.b1 f409223a;

    public v0(sl0.b1 b1Var) {
        this.f409223a = b1Var;
    }

    @Override // ll0.b
    public java.lang.Object getData() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        return (str == null || str.length() <= 0) ? java.lang.Boolean.FALSE : java.lang.Boolean.valueOf(!sl0.b1.b(this.f409223a, 512));
    }
}
