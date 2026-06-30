package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public abstract class a3 implements com.tencent.mm.plugin.sns.ui.widget.y2 {
    @Override // com.tencent.mm.plugin.sns.ui.widget.y2
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(if1.o.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$SimpleOnScrollCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.o.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$SimpleOnScrollCallback");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.y2
    public void b(boolean z17, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$SimpleOnScrollCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$SimpleOnScrollCallback");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.y2
    public void c(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOpenStateChange", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$SimpleOnScrollCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOpenStateChange", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$SimpleOnScrollCallback");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.y2
    public void d(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(if1.q.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$SimpleOnScrollCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.q.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$SimpleOnScrollCallback");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.y2
    public void e(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$SimpleOnScrollCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$SimpleOnScrollCallback");
    }
}
