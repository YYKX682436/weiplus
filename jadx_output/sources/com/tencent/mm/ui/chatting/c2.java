package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.wc f198513d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(com.tencent.mm.ui.chatting.viewitems.wc wcVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f198513d = wcVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.c2(this.f198513d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.chatting.c2 c2Var = (com.tencent.mm.ui.chatting.c2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.ui.chatting.viewitems.wc wcVar = this.f198513d;
        android.widget.TextView textView = wcVar.f205920d;
        if (textView != null) {
            textView.post(new com.tencent.mm.ui.chatting.b2(wcVar));
        }
        return jz5.f0.f302826a;
    }
}
