package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.CollapsibleTextView f170439d;

    public s1(com.tencent.mm.plugin.sns.ui.CollapsibleTextView collapsibleTextView) {
        this.f170439d = collapsibleTextView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView$2");
        com.tencent.mm.plugin.sns.ui.CollapsibleTextView collapsibleTextView = this.f170439d;
        com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView snsPostDescPreloadTextView = collapsibleTextView.f166256f;
        if (snsPostDescPreloadTextView != null && (snsPostDescPreloadTextView.getTag() instanceof com.tencent.mm.plugin.sns.ui.go)) {
            java.lang.String str = ((com.tencent.mm.plugin.sns.ui.go) collapsibleTextView.f166256f.getTag()).f168445a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
            java.lang.String str2 = collapsibleTextView.f166265r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
            if (str.equals(str2)) {
                collapsibleTextView.f166256f.setMaxLines(6);
                collapsibleTextView.f166258h.setVisibility(0);
                android.widget.TextView textView = collapsibleTextView.f166258h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
                java.lang.String str3 = collapsibleTextView.f166260m;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
                textView.setText(str3);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView$2");
    }
}
