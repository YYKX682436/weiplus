package com.tencent.mm.ui.bizchat;

/* loaded from: classes11.dex */
public class k implements r01.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI f197967a;

    public k(com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f197967a = bizChatConversationFmUI;
    }

    @Override // r01.p
    public void a(r01.o oVar) {
        int i17 = com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI.f197896y;
        com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI = this.f197967a;
        java.lang.String l07 = bizChatConversationFmUI.l0();
        if (oVar == null || com.tencent.mm.sdk.platformtools.t8.K0(oVar.f368168a) || !oVar.f368168a.equals(l07)) {
            return;
        }
        int i18 = bizChatConversationFmUI.f197908r;
        bizChatConversationFmUI.f197908r = com.tencent.mm.ui.h4.a(bizChatConversationFmUI.getContext(), l07);
        if (bizChatConversationFmUI.f197908r != i18) {
            bizChatConversationFmUI.n0();
        }
    }
}
