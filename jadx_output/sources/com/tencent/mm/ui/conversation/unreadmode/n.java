package com.tencent.mm.ui.conversation.unreadmode;

/* loaded from: classes11.dex */
public final class n implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI f208148d;

    public n(com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI unreadConversationFmUI) {
        this.f208148d = unreadConversationFmUI;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        em.e4 e4Var;
        em.e4 e4Var2;
        int ordinal = ((ym3.o) obj).f463177a.ordinal();
        com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI unreadConversationFmUI = this.f208148d;
        if (ordinal == 0) {
            e4Var = unreadConversationFmUI.viewBinding;
            if (e4Var == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            e4Var.c().post(new com.tencent.mm.ui.conversation.unreadmode.l(unreadConversationFmUI));
        } else if (ordinal == 2) {
            e4Var2 = unreadConversationFmUI.viewBinding;
            if (e4Var2 == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            e4Var2.c().post(new com.tencent.mm.ui.conversation.unreadmode.m(unreadConversationFmUI));
        }
        return jz5.f0.f302826a;
    }
}
