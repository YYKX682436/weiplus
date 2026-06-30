package nv2;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nv2.v f340584d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(nv2.v vVar) {
        super(1);
        this.f340584d = vVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        ya2.b2 contact;
        so2.j5 it = (so2.j5) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = it instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) it : null;
        java.lang.String D0 = (baseFinderFeed == null || (contact = baseFinderFeed.getContact()) == null) ? "" : contact.D0();
        com.tencent.mars.xlog.Log.i("Finder.FeedCleaner", "cleanFeed username:".concat(D0));
        nv2.v vVar = this.f340584d;
        nv2.x xVar = vVar.f340594e;
        if (xVar == null) {
            kotlin.jvm.internal.o.o("followRecorder");
            throw null;
        }
        if (!xVar.f340623a.contains(D0)) {
            nv2.x xVar2 = vVar.f340595f;
            if (xVar2 == null) {
                kotlin.jvm.internal.o.o("noSeeAuthorRecorder");
                throw null;
            }
            if (!xVar2.f340623a.contains(D0)) {
                z17 = false;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = true;
        return java.lang.Boolean.valueOf(z17);
    }
}
