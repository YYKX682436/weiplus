package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes3.dex */
public final class d2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI f171113d;

    public d2(com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI snsCommentEmoticonDetailUI) {
        this.f171113d = snsCommentEmoticonDetailUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$longClickToShowAddEmoticonSheet$2");
        if (menuItem.getItemId() == 1) {
            com.tencent.mm.feature.emoji.api.y5 y5Var = (com.tencent.mm.feature.emoji.api.y5) i95.n0.c(com.tencent.mm.feature.emoji.api.y5.class);
            int i18 = com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI.f170868m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getIEmojiInfo$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
            com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI snsCommentEmoticonDetailUI = this.f171113d;
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = snsCommentEmoticonDetailUI.f170874i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getIEmojiInfo$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
            kotlin.jvm.internal.o.d(iEmojiInfo);
            ((com.tencent.mm.feature.emoji.s0) y5Var).wi(snsCommentEmoticonDetailUI, iEmojiInfo, 1000078, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$longClickToShowAddEmoticonSheet$2");
    }
}
