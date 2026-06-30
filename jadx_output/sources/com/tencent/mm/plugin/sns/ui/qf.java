package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class qf implements com.tencent.mm.pluginsdk.ui.chat.v9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentFooter f170340a;

    public qf(com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter) {
        this.f170340a = snsCommentFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void a(boolean z17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSearchDialogShow", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$13");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "onSearchDialogShow");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSearchDialogShow", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$13");
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void b(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSendCustomEmoji", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$13");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "onSendCustomEmoji md5: %s emojiHeight: %d emojiWidth: %d", iEmojiInfo.getMd5(), java.lang.Integer.valueOf(iEmojiInfo.getHeight()), java.lang.Integer.valueOf(iEmojiInfo.getWidth()));
        java.lang.String str = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f170340a.C(iEmojiInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSendCustomEmoji", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$13");
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onHidePanel", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$13");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "onHidePanel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHidePanel", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$13");
    }
}
