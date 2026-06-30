package wc5;

/* loaded from: classes10.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f444577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wc5.q f444578e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, wc5.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f444577d = mvvmList;
        this.f444578e = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wc5.i(this.f444577d, this.f444578e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wc5.i iVar = (wc5.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (!this.f444577d.f152062i) {
            wc5.q qVar = this.f444578e;
            androidx.recyclerview.widget.f2 adapter = qVar.getRecyclerView().getAdapter();
            if ((adapter != null ? adapter.getItemCount() : 0) == 0) {
                qVar.Y6();
            }
        }
        return jz5.f0.f302826a;
    }
}
