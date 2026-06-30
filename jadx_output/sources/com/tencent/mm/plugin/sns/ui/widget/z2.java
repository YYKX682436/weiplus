package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class z2 implements com.tencent.mm.plugin.sns.ui.widget.y2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f171327a = new java.util.LinkedList();

    @Override // com.tencent.mm.plugin.sns.ui.widget.y2
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(if1.o.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
        java.util.Iterator it = this.f171327a.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.sns.ui.widget.y2) it.next()).a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.o.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.y2
    public void b(boolean z17, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
        java.util.Iterator it = this.f171327a.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.sns.ui.widget.y2) it.next()).b(z17, i17, i18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.y2
    public void c(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOpenStateChange", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
        java.util.Iterator it = this.f171327a.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.sns.ui.widget.y2) it.next()).c(i17, z17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOpenStateChange", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.y2
    public void d(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(if1.q.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
        java.util.Iterator it = this.f171327a.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.sns.ui.widget.y2) it.next()).d(z17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.q.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.y2
    public void e(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
        java.util.Iterator it = this.f171327a.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.sns.ui.widget.y2) it.next()).e(z17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
    }
}
