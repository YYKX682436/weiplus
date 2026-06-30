package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class g implements com.tencent.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI f207686a;

    public g(com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI appBrandServiceConversationFmUI) {
        this.f207686a = appBrandServiceConversationFmUI;
    }

    @Override // com.tencent.mm.ui.y9
    public void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.ui.y9
    public void b(java.lang.Object obj) {
        com.tencent.mm.ui.conversation.o2 o2Var;
        com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI appBrandServiceConversationFmUI = this.f207686a;
        o2Var = appBrandServiceConversationFmUI.adapter;
        appBrandServiceConversationFmUI.setShowView(o2Var.getCount());
    }
}
