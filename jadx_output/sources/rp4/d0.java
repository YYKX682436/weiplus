package rp4;

/* loaded from: classes10.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp4.f0 f398619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(rp4.f0 f0Var) {
        super(0);
        this.f398619d = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notice: configProvider is null  ");
        rp4.f0 f0Var = this.f398619d;
        sb6.append(f0Var.f398634i);
        sb6.append("  ");
        sb6.append(f0Var.f398632g);
        com.tencent.mars.xlog.Log.e("MicroMsg.VideoCompositionRemuxPlugin", sb6.toString());
        nu3.m.f340229a.n(2000);
        f0Var.e(2000);
        return jz5.f0.f302826a;
    }
}
