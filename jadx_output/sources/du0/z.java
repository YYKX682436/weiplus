package du0;

/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du0.a0 f243458d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(du0.a0 a0Var) {
        super(1);
        this.f243458d = a0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("LocationUIC", "pushLocationAddr: cancel");
        ((i11.g) ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi()).c(this.f243458d);
        return jz5.f0.f302826a;
    }
}
