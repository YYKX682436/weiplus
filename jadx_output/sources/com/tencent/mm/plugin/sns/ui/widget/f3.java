package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView f171130d;

    public f3(com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView snsPostDescPreloadTextView) {
        this.f171130d = snsPostDescPreloadTextView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView$CheckForLongPress");
        int i17 = com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView.f170895r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        this.f171130d.f170898h = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView$CheckForLongPress");
    }
}
