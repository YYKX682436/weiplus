package nr2;

/* loaded from: classes2.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr2.l f339205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f339206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f339207f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderRefreshLayout f339208g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(nr2.l lVar, int i17, java.util.List list, com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339205d = lVar;
        this.f339206e = i17;
        this.f339207f = list;
        this.f339208g = finderRefreshLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nr2.i(this.f339205d, this.f339206e, this.f339207f, this.f339208g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nr2.i iVar = (nr2.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        nr2.l lVar = this.f339205d;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = lVar.f339255h;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyItemRangeInserted(this.f339206e, this.f339207f.size());
        }
        lVar.getClass();
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = this.f339208g;
        finderRefreshLayout.e(true);
        if (!lVar.f339254g) {
            finderRefreshLayout.E(true);
        }
        return jz5.f0.f302826a;
    }
}
