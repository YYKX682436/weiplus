package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final /* synthetic */ class SnsCommentDetailUI$$d implements n34.o2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI f166913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f166914b;

    public /* synthetic */ SnsCommentDetailUI$$d(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI, android.view.View view) {
        this.f166913a = snsCommentDetailUI;
        this.f166914b = view;
    }

    public final void a() {
        int i17 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = this.f166913a;
        snsCommentDetailUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$initView$1", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        snsCommentDetailUI.S7(this.f166914b);
        n34.p pVar = snsCommentDetailUI.W1;
        pVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTeachClickCallback", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        pVar.f334704e = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTeachClickCallback", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$initView$1", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }
}
