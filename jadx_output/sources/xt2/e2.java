package xt2;

/* loaded from: classes3.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f456698d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(xt2.e3 e3Var) {
        super(0);
        this.f456698d = e3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xt2.e3 e3Var = this.f456698d;
        com.tencent.mars.xlog.Log.i(e3Var.f456706h, "mock subsidy countdown finished, refresh via getProductJumpInfo");
        e3Var.getPlugin().x1(null);
        return jz5.f0.f302826a;
    }
}
