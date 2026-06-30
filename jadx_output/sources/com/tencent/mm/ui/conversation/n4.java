package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class n4 implements com.tencent.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI f207897a;

    public n4(com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI) {
        this.f207897a = enterpriseConversationFmUI;
    }

    @Override // com.tencent.mm.ui.y9
    public void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.ui.y9
    public void b(java.lang.Object obj) {
        com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI = this.f207897a;
        if (enterpriseConversationFmUI.f207350i.getCount() <= 0) {
            enterpriseConversationFmUI.f207348g.setVisibility(0);
            enterpriseConversationFmUI.f207349h.setVisibility(8);
        } else {
            enterpriseConversationFmUI.f207348g.setVisibility(8);
            enterpriseConversationFmUI.f207349h.setVisibility(0);
        }
    }
}
