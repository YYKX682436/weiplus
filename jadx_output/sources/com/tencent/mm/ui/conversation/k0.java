package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class k0 implements com.tencent.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI f207793a;

    public k0(com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI) {
        this.f207793a = convBoxServiceConversationFmUI;
    }

    @Override // com.tencent.mm.ui.y9
    public void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.ui.y9
    public void b(java.lang.Object obj) {
        com.tencent.mm.ui.conversation.o2 o2Var;
        com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI = this.f207793a;
        o2Var = convBoxServiceConversationFmUI.adapter;
        convBoxServiceConversationFmUI.setShowView(o2Var.getCount());
    }
}
