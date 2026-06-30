package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class n2 implements com.tencent.mm.pluginsdk.ui.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190496a;

    public n2(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190496a = chatFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.g1
    public void a(int i17) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190496a;
        if (chatFooter.f189982f2 == null) {
            chatFooter.q0();
        }
        int i18 = chatFooter.f190099y2;
        chatFooter.f190005j2 = i18 + i17;
        com.tencent.mm.pluginsdk.ui.chat.ChattingScrollLayout chattingScrollLayout = chatFooter.f189982f2;
        if (chattingScrollLayout != null) {
            chattingScrollLayout.f190124f = i18 + i17;
            for (int i19 = 0; i19 < chattingScrollLayout.getChildCount(); i19++) {
                android.view.View childAt = chattingScrollLayout.getChildAt(i19);
                if (childAt != chattingScrollLayout.f190130o) {
                    childAt.setTranslationY(-r1);
                }
            }
            chattingScrollLayout.c(false, false);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.g1
    public void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "finished sliding emoji panel, expanded = %s", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190496a;
        chatFooter.X0(chatFooter.getKeyBordHeightPX());
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = chatFooter.f189981f;
        if (chatFooterPanel != null) {
            chatFooterPanel.setExpandedForReport(z17);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.g1
    public void c(int i17, int i18, int i19, int i27) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.g1
    public void d() {
        com.tencent.mm.pluginsdk.ui.chat.ChattingScrollLayout chattingScrollLayout;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190496a;
        chatFooter.f189982f2.getHeight();
        int i17 = chatFooter.f190084w2;
        chatFooter.G.getMeasuredHeight();
        com.tencent.mm.pluginsdk.ui.h1 h1Var = chatFooter.f189999i;
        if (h1Var == null || (chattingScrollLayout = chatFooter.f189982f2) == null || chatFooter.G == null) {
            return;
        }
        ((ym5.f0) h1Var).b(chattingScrollLayout.getHeight(), chatFooter.f190084w2, chatFooter.G.getMeasuredHeight());
    }

    @Override // com.tencent.mm.pluginsdk.ui.g1
    public void e(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.g1
    public void f(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "start sliding emoji panel, expanded = %s", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190496a;
        chatFooter.X0(chatFooter.getKeyBordHeightPX());
    }
}
