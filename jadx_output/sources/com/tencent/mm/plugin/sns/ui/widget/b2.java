package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes3.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI f171083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI snsCommentEmoticonDetailUI) {
        super(0);
        this.f171083d = snsCommentEmoticonDetailUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$emoticonView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$emoticonView$2");
        com.tencent.mm.emoji.view.EmojiStatusView emojiStatusView = (com.tencent.mm.emoji.view.EmojiStatusView) this.f171083d.findViewById(com.tencent.mm.R.id.f484217t83);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$emoticonView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$emoticonView$2");
        return emojiStatusView;
    }
}
