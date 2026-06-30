package sr2;

/* loaded from: classes8.dex */
public final class q3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.l f411685e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC, jz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f411684d = postMainUIC;
        this.f411685e = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sr2.q3(this.f411684d, this.f411685e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sr2.q3 q3Var = (sr2.q3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = this.f411684d;
        postMainUIC.w7();
        jz5.l lVar = this.f411685e;
        java.lang.String str = (java.lang.String) lVar.f302834e;
        if (((java.lang.Boolean) lVar.f302833d).booleanValue()) {
            com.tencent.mm.plugin.finder.post.PostMainUIC.U6(postMainUIC, bw5.cr.FinderModifyFeedRetSuc);
            postMainUIC.getActivity().finish();
        } else {
            com.tencent.mm.plugin.finder.post.PostMainUIC.U6(postMainUIC, bw5.cr.FinderModifyFeedRetFail);
            if (str == null || str.length() == 0) {
                str = postMainUIC.getActivity().getResources().getString(com.tencent.mm.R.string.nlz);
            }
        }
        if (!(str == null || str.length() == 0)) {
            db5.t7.m(postMainUIC.getActivity(), str);
        }
        return jz5.f0.f302826a;
    }
}
