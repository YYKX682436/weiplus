package yr2;

/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr2.o f464710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(yr2.o oVar) {
        super(1);
        this.f464710d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.it2 response = (r45.it2) obj;
        kotlin.jvm.internal.o.g(response, "response");
        if (response.getInteger(2) > 0) {
            yr2.o.f464712c = response.getInteger(2) * 1000;
        }
        com.tencent.mars.xlog.Log.i("PreloadGlobalInfoCGIFetcher", "onSceneEnd min_refresh_interval:" + response.getInteger(2));
        yr2.a.f464659a.b((r45.sq2) response.getCustom(1), new java.util.LinkedList(), nd1.p1.CTRL_INDEX);
        this.f464710d.f464714b.set(false);
        return jz5.f0.f302826a;
    }
}
