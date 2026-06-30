package mx2;

/* loaded from: classes2.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f332490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.image.FinderImageBanner f332491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f332492f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f332493g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f332494h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner, int i17, boolean z17, java.util.LinkedList linkedList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332490d = baseFinderFeed;
        this.f332491e = finderImageBanner;
        this.f332492f = i17;
        this.f332493g = z17;
        this.f332494h = linkedList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx2.j(this.f332490d, this.f332491e, this.f332492f, this.f332493g, this.f332494h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx2.j jVar = (mx2.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f332490d;
        if (baseFinderFeed != null) {
            android.content.Context context = this.f332491e.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
                nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            } else {
                nyVar = null;
            }
            if (nyVar != null) {
                int i17 = this.f332492f;
                boolean z17 = this.f332493g;
                java.util.LinkedList linkedList = this.f332494h;
                r45.mb4 mb4Var = (r45.mb4) kz5.n0.a0(baseFinderFeed.getFeedObject().getMediaList(), i17);
                if (mb4Var != null) {
                    fc2.c n17 = zy2.ra.n1(nyVar, 0, 1, null);
                    long id6 = baseFinderFeed.getFeedObject().getId();
                    java.lang.String objectNonceId = baseFinderFeed.getFeedObject().getObjectNonceId();
                    java.util.LinkedList linkedList2 = new java.util.LinkedList(baseFinderFeed.getFeedObject().getMediaList());
                    kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
                    com.tencent.mm.plugin.finder.report.y5 y5Var = new com.tencent.mm.plugin.finder.report.y5(id6, mb4Var, objectNonceId, i17, linkedList2, baseFinderFeed, z17, linkedList);
                    if (n17 != null) {
                        n17.b(y5Var);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
