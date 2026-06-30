package com.tencent.mm.ui.conversation.unreadmode;

/* loaded from: classes11.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f208149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI f208150e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI unreadConversationFmUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f208150e = unreadConversationFmUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.conversation.unreadmode.o(this.f208150e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((com.tencent.mm.ui.conversation.unreadmode.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f208149d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI unreadConversationFmUI = this.f208150e;
            mvvmList = unreadConversationFmUI.mvvmList;
            if (mvvmList == null) {
                kotlin.jvm.internal.o.o("mvvmList");
                throw null;
            }
            kotlinx.coroutines.flow.n2 n2Var = mvvmList.f152072v;
            com.tencent.mm.ui.conversation.unreadmode.n nVar = new com.tencent.mm.ui.conversation.unreadmode.n(unreadConversationFmUI);
            this.f208149d = 1;
            kotlinx.coroutines.flow.q2 q2Var = (kotlinx.coroutines.flow.q2) n2Var;
            q2Var.getClass();
            if (kotlinx.coroutines.flow.q2.l(q2Var, nVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
