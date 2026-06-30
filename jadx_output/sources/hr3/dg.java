package hr3;

/* loaded from: classes.dex */
public final class dg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.gg f283492d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(hr3.gg ggVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f283492d = ggVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hr3.dg(this.f283492d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        hr3.dg dgVar = (hr3.dg) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dgVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        hr3.gg ggVar = this.f283492d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(ggVar.getActivity());
        u1Var.g(ggVar.getString(com.tencent.mm.R.string.f490910n92));
        u1Var.a(true);
        u1Var.m(com.tencent.mm.R.string.f490454vi);
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
