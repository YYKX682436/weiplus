package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class t8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f190667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.h9 f190668e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(com.tencent.mm.pluginsdk.ui.chat.h9 h9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f190668e = h9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.pluginsdk.ui.chat.t8(this.f190668e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.pluginsdk.ui.chat.t8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f190667d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f190667d = 1;
            if (kotlinx.coroutines.k1.b(5000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean z17 = this.f190668e.L;
        com.tencent.mm.pluginsdk.ui.chat.h9 h9Var = this.f190668e;
        boolean z18 = h9Var.E;
        if (!h9Var.L) {
            if (this.f190668e.f190354J.length() == 0) {
                this.f190668e.L = true;
                if (this.f190668e.f190354J.length() == 0) {
                    this.f190668e.E = false;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.QuickVoice2TxtHelper", "hidePopWindow fallback trigger onSendMsg, textLen=" + this.f190668e.f190354J.length());
                com.tencent.mm.pluginsdk.ui.chat.h9 h9Var2 = this.f190668e;
                com.tencent.mm.pluginsdk.ui.chat.k8 k8Var = h9Var2.M;
                if (k8Var != null) {
                    ((com.tencent.mm.ui.chatting.component.u8) k8Var).a(h9Var2.f190354J);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
