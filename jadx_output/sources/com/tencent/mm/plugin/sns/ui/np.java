package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class np implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI f170021d;

    public np(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI) {
        this.f170021d = snsSightPlayerUI;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$11");
        com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI = this.f170021d;
        snsSightPlayerUI.f167381t.getViewTreeObserver().removeOnPreDrawListener(this);
        com.tencent.mm.ui.tools.s4 s4Var = snsSightPlayerUI.f167367J;
        android.view.ViewGroup viewGroup = snsSightPlayerUI.f167381t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        android.widget.ImageView imageView = snsSightPlayerUI.E;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        s4Var.c(viewGroup, imageView, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$11");
        return true;
    }
}
