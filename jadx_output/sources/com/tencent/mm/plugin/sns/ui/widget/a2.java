package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes3.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI f170924d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI snsCommentEmoticonDetailUI) {
        super(0);
        this.f170924d = snsCommentEmoticonDetailUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$detailView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$detailView$2");
        android.view.View findViewById = this.f170924d.findViewById(com.tencent.mm.R.id.f484216t82);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$detailView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$detailView$2");
        return findViewById;
    }
}
