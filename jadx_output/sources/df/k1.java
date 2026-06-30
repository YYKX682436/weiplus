package df;

/* loaded from: classes7.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.w1 f229505d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(df.w1 w1Var) {
        super(0);
        this.f229505d = w1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id:");
        df.w1 w1Var = this.f229505d;
        sb6.append(w1Var.f229580d);
        sb6.append(" attach, reconnectRenderToSurface:");
        sb6.append(w1Var.f229591r);
        com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineView", sb6.toString(), new java.lang.Object[0]);
        df.a0 a0Var = w1Var.f229585i;
        if (a0Var != null) {
            a0Var.f(w1Var.f229599z);
        }
        df.a0 a0Var2 = w1Var.f229585i;
        if (a0Var2 != null) {
            a0Var2.l();
        }
        if (w1Var.f229591r) {
            w1Var.f229591r = false;
            df.a0 a0Var3 = w1Var.f229585i;
            if (a0Var3 != null) {
                a0Var3.m();
            }
        }
        df.w0 w0Var = df.w0.f229569a;
        df.o1 listener = w1Var.f229597x;
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.ArrayList arrayList = df.w0.f229578j;
        if (!arrayList.contains(listener)) {
            arrayList.add(listener);
        }
        return jz5.f0.f302826a;
    }
}
