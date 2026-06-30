package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public class wa implements com.tencent.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ServiceNotifyConversationUI f208226a;

    public wa(com.tencent.mm.ui.conversation.ServiceNotifyConversationUI serviceNotifyConversationUI) {
        this.f208226a = serviceNotifyConversationUI;
    }

    @Override // com.tencent.mm.ui.y9
    public void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.ui.y9
    public void b(java.lang.Object obj) {
        com.tencent.mm.ui.conversation.ServiceNotifyConversationUI serviceNotifyConversationUI = this.f208226a;
        if (serviceNotifyConversationUI.f207417f.getCount() <= 0) {
            serviceNotifyConversationUI.f207415d.setVisibility(0);
            serviceNotifyConversationUI.f207416e.setVisibility(8);
        } else {
            serviceNotifyConversationUI.f207415d.setVisibility(8);
            serviceNotifyConversationUI.f207416e.setVisibility(0);
        }
    }
}
