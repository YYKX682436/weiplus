package cp2;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp2.k f220817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f220818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader f220819f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f220820g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(cp2.k kVar, java.lang.Object obj, com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var) {
        super(1);
        this.f220817d = kVar;
        this.f220818e = obj;
        this.f220819f = nearbyLiveFeedLoader;
        this.f220820g = n0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        cp2.k kVar = this.f220817d;
        java.lang.String tag = kVar.getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[call] pullType=");
        cp2.l lVar = (cp2.l) this.f220818e;
        sb6.append(lVar.f220834a);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        cp2.g gVar = new cp2.g(kVar.f220829d, task);
        cp2.f fVar = kVar.f220830e;
        kotlin.jvm.internal.o.d(fVar);
        fVar.E0(lVar, new cp2.h(kVar, this.f220819f, this.f220820g, task), gVar);
        return jz5.f0.f302826a;
    }
}
