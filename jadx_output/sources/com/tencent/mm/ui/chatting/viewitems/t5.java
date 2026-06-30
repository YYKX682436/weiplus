package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class t5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.w5 f205560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.w5 f205561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w05.d f205562f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205563g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(com.tencent.mm.ui.chatting.viewitems.w5 w5Var, com.tencent.mm.ui.chatting.viewitems.w5 w5Var2, w05.d dVar, yb5.d dVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f205560d = w5Var;
        this.f205561e = w5Var2;
        this.f205562f = dVar;
        this.f205563g = dVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.viewitems.t5(this.f205560d, this.f205561e, this.f205562f, this.f205563g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.chatting.viewitems.t5 t5Var = (com.tencent.mm.ui.chatting.viewitems.t5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        t5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.ui.chatting.viewitems.w5 w5Var = this.f205560d;
        android.widget.TextView textView = w5Var.f205898b;
        if (textView != null) {
            textView.setText("");
        }
        android.widget.TextView textView2 = w5Var.f205898b;
        if (textView2 != null) {
            textView2.post(new com.tencent.mm.ui.chatting.viewitems.s5(this.f205561e, w5Var, this.f205562f, this.f205563g));
        }
        return jz5.f0.f302826a;
    }
}
