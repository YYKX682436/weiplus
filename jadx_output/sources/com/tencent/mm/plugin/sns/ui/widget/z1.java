package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes3.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI f171326d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI snsCommentEmoticonDetailUI) {
        super(0);
        this.f171326d = snsCommentEmoticonDetailUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$backgroundView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$backgroundView$2");
        android.view.View findViewById = this.f171326d.findViewById(com.tencent.mm.R.id.f484214t80);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$backgroundView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$backgroundView$2");
        return findViewById;
    }
}
