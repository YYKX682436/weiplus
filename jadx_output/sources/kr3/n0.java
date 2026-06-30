package kr3;

/* loaded from: classes.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f311417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kr3.q0 f311418e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.ui.widget.dialog.u3 u3Var, kr3.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f311417d = u3Var;
        this.f311418e = q0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kr3.n0(this.f311417d, this.f311418e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kr3.n0 n0Var = (kr3.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f311417d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        kr3.q0 q0Var = this.f311418e;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(q0Var.getActivity());
        u1Var.g(q0Var.getString(com.tencent.mm.R.string.f490910n92));
        u1Var.a(true);
        u1Var.m(com.tencent.mm.R.string.f490454vi);
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
