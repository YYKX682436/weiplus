package kr3;

/* loaded from: classes8.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f311346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kr3.q1 f311347e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.tencent.mm.ui.widget.dialog.u3 u3Var, kr3.q1 q1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f311346d = u3Var;
        this.f311347e = q1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kr3.c1(this.f311346d, this.f311347e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kr3.c1 c1Var = (kr3.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f311346d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.List list = kr3.q1.A;
        kr3.q1 q1Var = this.f311347e;
        q1Var.W6(bool);
        q1Var.getActivity().finish();
        return jz5.f0.f302826a;
    }
}
