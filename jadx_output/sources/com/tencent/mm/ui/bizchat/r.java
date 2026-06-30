package com.tencent.mm.ui.bizchat;

/* loaded from: classes11.dex */
public class r implements com.tencent.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI f197975a;

    public r(com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f197975a = bizChatConversationFmUI;
    }

    @Override // com.tencent.mm.ui.y9
    public void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.ui.y9
    public void b(java.lang.Object obj) {
        com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI = this.f197975a;
        if (bizChatConversationFmUI.f197901h.getCount() <= 0) {
            bizChatConversationFmUI.f197897d.setVisibility(0);
            bizChatConversationFmUI.f197899f.setVisibility(8);
            return;
        }
        bizChatConversationFmUI.f197897d.setVisibility(8);
        android.widget.ListView listView = bizChatConversationFmUI.f197899f;
        if (listView != null) {
            listView.setVisibility(0);
        }
    }
}
