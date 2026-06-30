package nr2;

/* loaded from: classes2.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr2.l f339189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderRefreshLayout f339190e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(nr2.l lVar, com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339189d = lVar;
        this.f339190e = finderRefreshLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nr2.g(this.f339189d, this.f339190e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nr2.g gVar = (nr2.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        nr2.l lVar = this.f339189d;
        if (!lVar.f339252e.isEmpty()) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = lVar.f339255h;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            }
            if (!lVar.f339254g) {
                this.f339190e.k();
            }
        }
        return jz5.f0.f302826a;
    }
}
