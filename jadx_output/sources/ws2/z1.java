package ws2;

/* loaded from: classes15.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy f449172d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy) {
        super(0);
        this.f449172d = finderLiveThumbPlayerProxy;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f449172d;
        kk4.c cVar = finderLiveThumbPlayerProxy.f124890f;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("player");
            throw null;
        }
        ((kk4.f0) cVar).release();
        finderLiveThumbPlayerProxy.f(11);
        com.tencent.mars.xlog.Log.i(finderLiveThumbPlayerProxy.getFTPPTag(), "releaseInternal FinderThumbPlayerProxy " + finderLiveThumbPlayerProxy.hashCode() + ' ' + com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.c(finderLiveThumbPlayerProxy));
        return jz5.f0.f302826a;
    }
}
