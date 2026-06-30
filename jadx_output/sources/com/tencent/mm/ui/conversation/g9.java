package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class g9 implements com.tencent.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI f207707a;

    public g9(com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f207707a = openImKefuServiceConversationFmUI;
    }

    @Override // com.tencent.mm.ui.y9
    public void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.ui.y9
    public void b(java.lang.Object obj) {
        com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI = this.f207707a;
        com.tencent.mm.ui.conversation.h8 h8Var = openImKefuServiceConversationFmUI.f207402g;
        if ((h8Var != null ? h8Var.getCount() : 0) <= 0) {
            android.widget.TextView textView = openImKefuServiceConversationFmUI.f207400e;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.widget.ListView listView = openImKefuServiceConversationFmUI.f207401f;
            if (listView == null) {
                return;
            }
            listView.setVisibility(8);
            return;
        }
        android.widget.TextView textView2 = openImKefuServiceConversationFmUI.f207400e;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.widget.ListView listView2 = openImKefuServiceConversationFmUI.f207401f;
        if (listView2 == null) {
            return;
        }
        listView2.setVisibility(0);
    }
}
