package tt2;

/* loaded from: classes2.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f421938d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(xg2.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f421938d = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tt2.i0(this.f421938d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        tt2.i0 i0Var = (tt2.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListAdapter", "FinderLiveGetProductPromoteReplayWidgetRequest failed");
        return jz5.f0.f302826a;
    }
}
