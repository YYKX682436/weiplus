package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f209333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f209334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.r0 f209335f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wi5.o f209336g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(wi5.n0 n0Var, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.ui.mvvm.uic.conversation.recent.r0 r0Var, wi5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f209333d = n0Var;
        this.f209334e = h0Var;
        this.f209335f = r0Var;
        this.f209336g = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.mvvm.uic.conversation.recent.i0(this.f209333d, this.f209334e, this.f209335f, this.f209336g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.mvvm.uic.conversation.recent.i0 i0Var = (com.tencent.mm.ui.mvvm.uic.conversation.recent.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        wi5.n0 n0Var = this.f209333d;
        boolean e17 = n0Var.e();
        wi5.o oVar = this.f209336g;
        kotlin.jvm.internal.h0 h0Var = this.f209334e;
        if (e17) {
            android.view.View view = (android.view.View) h0Var.f310123d;
            if (view != null) {
                oVar.f446331b.invoke(view);
            }
            h0Var.f310123d = null;
        } else {
            com.tencent.mm.ui.mvvm.uic.conversation.recent.r0 r0Var = this.f209335f;
            android.view.View inflate = com.tencent.mm.ui.id.b(r0Var.getActivity()).inflate(com.tencent.mm.R.layout.f488157ip, (android.view.ViewGroup) oVar.f446332c, false);
            inflate.setOnClickListener(new com.tencent.mm.ui.mvvm.uic.conversation.recent.h0(r0Var, n0Var));
            oVar.f446331b.invoke(inflate);
            h0Var.f310123d = inflate;
        }
        return jz5.f0.f302826a;
    }
}
