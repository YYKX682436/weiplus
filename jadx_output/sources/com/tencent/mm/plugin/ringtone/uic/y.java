package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes5.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f158545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.b0 f158546e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.ringtone.uic.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f158545d = u3Var;
        this.f158546e = b0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.ringtone.uic.y(this.f158545d, this.f158546e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.ringtone.uic.y yVar = (com.tencent.mm.plugin.ringtone.uic.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        yVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f158545d;
        if (u3Var != null) {
            u3Var.hide();
        }
        com.tencent.mm.plugin.ringtone.uic.b0 b0Var = this.f158546e;
        db5.t7.g(b0Var.getActivity(), b0Var.getActivity().getResources().getString(com.tencent.mm.R.string.bol));
        return jz5.f0.f302826a;
    }
}
