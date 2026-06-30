package kr3;

/* loaded from: classes11.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f311350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kr3.q0 f311351e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.ui.widget.dialog.u3 u3Var, kr3.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f311350d = u3Var;
        this.f311351e = q0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kr3.d0(this.f311350d, this.f311351e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kr3.d0 d0Var = (kr3.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        d0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f311350d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.List list = kr3.q0.A;
        kr3.q0 q0Var = this.f311351e;
        q0Var.W6(bool);
        q0Var.getActivity().finish();
        return jz5.f0.f302826a;
    }
}
