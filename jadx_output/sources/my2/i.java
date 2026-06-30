package my2;

/* loaded from: classes3.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my2.u f332736d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(my2.u uVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332736d = uVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new my2.i(this.f332736d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        my2.i iVar = (my2.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        my2.k0 k0Var;
        android.view.ViewGroup viewGroup;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        my2.u uVar = this.f332736d;
        com.tencent.mm.plugin.finder.live.view.k0 c17 = uVar.c();
        if (c17 != null && (k0Var = (my2.k0) c17.getPlugin(my2.k0.class)) != null && (viewGroup = k0Var.f365323d) != null) {
            viewGroup.postDelayed(new my2.h(uVar), 2000L);
        }
        return jz5.f0.f302826a;
    }
}
