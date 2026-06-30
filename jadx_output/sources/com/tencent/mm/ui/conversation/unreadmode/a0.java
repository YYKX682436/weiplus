package com.tencent.mm.ui.conversation.unreadmode;

/* loaded from: classes11.dex */
public final class a0 implements com.tencent.mm.ui.conversation.p2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.unreadmode.d0 f208111a;

    public a0(com.tencent.mm.ui.conversation.unreadmode.d0 d0Var) {
        this.f208111a = d0Var;
    }

    @Override // com.tencent.mm.ui.conversation.p2
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.UnreadConversationItemConvert", "requestDismissClickStatus: delay=" + i17);
    }

    @Override // com.tencent.mm.ui.conversation.p2
    public void b(android.view.View view, int i17, java.lang.String key) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mars.xlog.Log.i("MicroMsg.UnreadConversationItemConvert", "onClickItem: position=" + i17 + ", key=" + key);
    }

    @Override // com.tencent.mm.ui.conversation.p2
    public void c(java.lang.String username, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(bundle, "bundle");
        android.app.Activity activity = this.f208111a.f208117e;
        com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI = activity instanceof com.tencent.mm.ui.conversation.BaseConversationUI ? (com.tencent.mm.ui.conversation.BaseConversationUI) activity : null;
        if (baseConversationUI != null) {
            baseConversationUI.startChatting(username, bundle, true);
        }
    }
}
