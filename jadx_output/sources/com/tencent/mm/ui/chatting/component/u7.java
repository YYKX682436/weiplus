package com.tencent.mm.ui.chatting.component;

/* JADX INFO: Access modifiers changed from: package-private */
@yn.c(exportInterface = sb5.h0.class)
/* loaded from: classes5.dex */
public class u7 extends com.tencent.mm.ui.chatting.component.a implements sb5.h0 {
    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter;
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel;
        java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f21093a;
        if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_text_state_is_conv_use_smiley_panel_and, bm5.h0.RepairerConfig_TextStatus_ConvSmileyPanelSwitch_Int, 0) == 1) || (chatFooter = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class))).f199263e) == null || !com.tencent.mm.storage.z3.H4(this.f198580d.u().d1()) || (chatFooterPanel = chatFooter.getChatFooterPanel()) == null) {
            return;
        }
        chatFooterPanel.setShowSearch(false);
        chatFooterPanel.j();
    }

    @Override // sb5.h0
    public boolean G() {
        return com.tencent.mm.storage.z3.H4(this.f198580d.x());
    }
}
