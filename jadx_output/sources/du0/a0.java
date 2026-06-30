package du0;

/* loaded from: classes.dex */
public final class a0 implements u60.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f243322a;

    public a0(kotlinx.coroutines.q qVar) {
        this.f243322a = qVar;
    }

    @Override // u60.e
    public void onLocationAddr(com.tencent.mm.modelgeo.Addr addr) {
        com.tencent.mars.xlog.Log.i("LocationUIC", "onLocationAddr: addr " + addr);
        ((i11.g) ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi()).c(this);
        ou0.a.a(this.f243322a, addr);
    }
}
