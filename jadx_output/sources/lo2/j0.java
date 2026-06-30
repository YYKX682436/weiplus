package lo2;

/* loaded from: classes8.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI f320140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f320141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f320142f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI finderMemberSearchUI, int i17, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f320140d = finderMemberSearchUI;
        this.f320141e = i17;
        this.f320142f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lo2.j0(this.f320140d, this.f320141e, this.f320142f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        lo2.j0 j0Var = (lo2.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI finderMemberSearchUI = this.f320140d;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = finderMemberSearchUI.f121415z;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter.notifyItemRangeInserted(this.f320141e, this.f320142f.size());
        finderMemberSearchUI.f7().e(true);
        if (finderMemberSearchUI.G != 1) {
            finderMemberSearchUI.f7().E(true);
        }
        return jz5.f0.f302826a;
    }
}
