package nv2;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nv2.v f340587d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(nv2.v vVar) {
        super(1);
        this.f340587d = vVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ya2.b2 contact;
        so2.j5 it = (so2.j5) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = it instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) it : null;
        java.lang.String D0 = (baseFinderFeed == null || (contact = baseFinderFeed.getContact()) == null) ? "" : contact.D0();
        nv2.x xVar = this.f340587d.f340595f;
        if (xVar != null) {
            return java.lang.Boolean.valueOf(xVar.f340623a.contains(D0));
        }
        kotlin.jvm.internal.o.o("noSeeAuthorRecorder");
        throw null;
    }
}
