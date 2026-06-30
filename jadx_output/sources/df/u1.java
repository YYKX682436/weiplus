package df;

/* loaded from: classes7.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f229558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f229559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df.w1 f229560f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(float f17, float f18, df.w1 w1Var) {
        super(0);
        this.f229558d = f17;
        this.f229559e = f18;
        this.f229560f = w1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateViewport, waitForDone run view size[");
        float f17 = this.f229558d;
        sb6.append(f17);
        sb6.append(" x ");
        float f18 = this.f229559e;
        sb6.append(f18);
        sb6.append(']');
        com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineView", sb6.toString(), new java.lang.Object[0]);
        df.w1 w1Var = this.f229560f;
        com.tencent.skyline.SkylineRuntime skylineRuntime = w1Var.f229582f;
        if (skylineRuntime != null) {
            skylineRuntime.updateWindowViewport(w1Var.f229580d, f17, f18);
        }
        return jz5.f0.f302826a;
    }
}
