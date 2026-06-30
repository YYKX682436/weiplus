package kr3;

/* loaded from: classes.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f311419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kr3.q1 f311420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311421f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.tencent.mm.ui.widget.dialog.u3 u3Var, kr3.q1 q1Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f311419d = u3Var;
        this.f311420e = q1Var;
        this.f311421f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kr3.n1(this.f311419d, this.f311420e, this.f311421f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kr3.n1 n1Var = (kr3.n1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f311419d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this.f311420e.getActivity());
        u1Var.g(this.f311421f);
        u1Var.a(true);
        u1Var.m(com.tencent.mm.R.string.f490454vi);
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
