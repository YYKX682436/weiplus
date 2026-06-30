package com.tencent.mm.ui.bizchat;

/* loaded from: classes11.dex */
public class i implements s01.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI f197965a;

    public i(com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f197965a = bizChatConversationFmUI;
    }

    @Override // s01.l
    public void a(s01.k kVar) {
        s01.h hVar;
        if (kVar == null || (hVar = kVar.f401891c) == null) {
            return;
        }
        com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI = this.f197965a;
        if (bizChatConversationFmUI.f197903m.equals(hVar.field_brandUserName)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatConversationFmUI", "bizChatExtension bizChat change");
            bizChatConversationFmUI.f197901h.u(kVar.f401890b);
            if (bizChatConversationFmUI.f197906p) {
                bizChatConversationFmUI.f197901h.q();
            }
        }
    }
}
