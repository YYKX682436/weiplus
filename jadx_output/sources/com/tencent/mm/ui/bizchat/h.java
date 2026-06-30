package com.tencent.mm.ui.bizchat;

/* loaded from: classes11.dex */
public class h implements s01.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI f197964d;

    public h(com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f197964d = bizChatConversationFmUI;
    }

    @Override // s01.f
    public void a(s01.e eVar) {
        s01.b bVar;
        if (eVar == null || (bVar = eVar.f401862b) == null) {
            return;
        }
        com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI = this.f197964d;
        if (bizChatConversationFmUI.f197903m.equals(bVar.field_brandUserName)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatConversationFmUI", "bizChatExtension bizChatConv change");
            bizChatConversationFmUI.f197901h.u(eVar.f401861a);
            if (bizChatConversationFmUI.f197906p) {
                bizChatConversationFmUI.f197901h.q();
            }
        }
    }
}
