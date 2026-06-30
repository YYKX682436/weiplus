package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class ih extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f199230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.nh f199231e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.ui.chatting.component.nh nhVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f199230d = u3Var;
        this.f199231e = nhVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.component.ih(this.f199230d, this.f199231e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.chatting.component.ih ihVar = (com.tencent.mm.ui.chatting.component.ih) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        ihVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f199230d.dismiss();
        com.tencent.mm.ui.chatting.component.nh nhVar = this.f199231e;
        db5.t7.i(nhVar.f199592a.g(), nhVar.f199592a.s().getString(com.tencent.mm.R.string.d48), com.tencent.mm.R.raw.icons_outlined_done);
        return jz5.f0.f302826a;
    }
}
