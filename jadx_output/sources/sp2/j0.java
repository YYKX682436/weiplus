package sp2;

/* loaded from: classes2.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(sp2.o2 o2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f411056d = o2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sp2.j0(this.f411056d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sp2.j0 j0Var = (sp2.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "#[AutoPlayCheck]checkAutoPlayAfterRecyclerViewChanged animation hasn't running.");
        sp2.o2 o2Var = this.f411056d;
        up2.m mVar = o2Var.f411160v;
        if (mVar != null) {
            com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView = o2Var.f411139j;
            if (finderParentRecyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            mVar.a(finderParentRecyclerView);
        }
        return jz5.f0.f302826a;
    }
}
