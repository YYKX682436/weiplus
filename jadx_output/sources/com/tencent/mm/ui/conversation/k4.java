package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class k4 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI f207805d;

    public k4(com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI) {
        this.f207805d = enterpriseConversationFmUI;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI = this.f207805d;
        if (enterpriseConversationFmUI.f207347f != null) {
            r01.q3.bj().y0(enterpriseConversationFmUI.f207351m);
            android.widget.TextView textView = (android.widget.TextView) enterpriseConversationFmUI.f207347f.findViewById(com.tencent.mm.R.id.odf);
            r01.q bj6 = r01.q3.bj();
            r01.q3.bj();
            java.lang.String z07 = bj6.z0(0);
            if (textView != null && z07 != null && z07.length() > 0 && !textView.getText().equals(z07)) {
                textView.setText(z07);
            }
            int D0 = r01.q3.bj().D0();
            if (textView != null && D0 != 0) {
                textView.setTextColor(D0);
            }
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) enterpriseConversationFmUI.f207347f.findViewById(com.tencent.mm.R.id.h6y);
            r01.q3.bj().getClass();
            if (r01.q.f368186g == null) {
                r01.q.f368186g = new r45.ud();
            }
            java.lang.String str2 = r01.q.f368186g.f387251g;
            if (cdnImageView == null || str2 == null || str2.length() <= 0) {
                return;
            }
            cdnImageView.setUrl(str2);
        }
    }
}
