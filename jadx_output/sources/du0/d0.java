package du0;

/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du0.i0 f243339d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(du0.i0 i0Var) {
        super(1);
        this.f243339d = i0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelgeo.Addr addr = (com.tencent.mm.modelgeo.Addr) obj;
        com.tencent.mars.xlog.Log.i("LocationUIC", "requestClipPoi: result addr " + addr);
        ((du0.q) this.f243339d.f243365g).invoke(addr != null ? by0.h.a(addr) : null);
        return jz5.f0.f302826a;
    }
}
