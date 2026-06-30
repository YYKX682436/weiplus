package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class h4 implements r01.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI f207716a;

    public h4(com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI) {
        this.f207716a = enterpriseConversationFmUI;
    }

    @Override // r01.p
    public void a(r01.o oVar) {
        if (oVar == null || com.tencent.mm.sdk.platformtools.t8.K0(oVar.f368168a)) {
            return;
        }
        java.lang.String str = oVar.f368168a;
        com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI = this.f207716a;
        if (str.equals(enterpriseConversationFmUI.f207351m)) {
            int i17 = enterpriseConversationFmUI.f207352n;
            enterpriseConversationFmUI.f207352n = com.tencent.mm.ui.h4.a(enterpriseConversationFmUI.getContext(), enterpriseConversationFmUI.f207351m);
            if (enterpriseConversationFmUI.f207352n != i17) {
                enterpriseConversationFmUI.m0();
            }
        }
    }
}
