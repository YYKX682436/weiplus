package df;

/* loaded from: classes7.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.w1 f229499d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(df.w1 w1Var) {
        super(0);
        this.f229499d = w1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id:");
        df.w1 w1Var = this.f229499d;
        sb6.append(w1Var.f229580d);
        sb6.append(" appIsResumed");
        com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineView", sb6.toString(), new java.lang.Object[0]);
        com.tencent.skyline.SkylineLogic.appIsResumed(w1Var.f229580d);
        return jz5.f0.f302826a;
    }
}
