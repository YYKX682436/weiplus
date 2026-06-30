package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes13.dex */
public final class pv implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k91.v5 f170283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsWeappView f170284e;

    public pv(k91.v5 v5Var, com.tencent.mm.plugin.sns.ui.SnsWeappView snsWeappView) {
        this.f170283d = v5Var;
        this.f170284e = snsWeappView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsWeappView$setAttrNickname$1");
        k91.v5 v5Var = this.f170283d;
        boolean isEmpty = android.text.TextUtils.isEmpty(v5Var.field_nickname);
        com.tencent.mm.plugin.sns.ui.SnsWeappView snsWeappView = this.f170284e;
        if (isEmpty) {
            int i17 = com.tencent.mm.plugin.sns.ui.SnsWeappView.f167620g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setDefaultName", "com.tencent.mm.plugin.sns.ui.SnsWeappView");
            snsWeappView.b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setDefaultName", "com.tencent.mm.plugin.sns.ui.SnsWeappView");
        } else {
            int i18 = com.tencent.mm.plugin.sns.ui.SnsWeappView.f167620g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTextView$p", "com.tencent.mm.plugin.sns.ui.SnsWeappView");
            android.widget.TextView textView = snsWeappView.f167622e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTextView$p", "com.tencent.mm.plugin.sns.ui.SnsWeappView");
            textView.setText(v5Var.field_nickname);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsWeappView$setAttrNickname$1");
    }
}
