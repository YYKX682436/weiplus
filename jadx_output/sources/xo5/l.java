package xo5;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xo5.n f455791d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(xo5.n nVar) {
        super(0);
        this.f455791d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MVR.RenderComponentManager", "triger remote render ");
        xo5.n nVar = this.f455791d;
        yo5.e eVar = new yo5.e(0, "remote_render", 1, null);
        xo5.n nVar2 = this.f455791d;
        kotlinx.coroutines.l.d(nVar2.f455795f, null, null, new xo5.k(eVar, nVar2, null), 3, null);
        xo5.n.b(nVar, eVar, null, 0, 3, null);
        return eVar;
    }
}
