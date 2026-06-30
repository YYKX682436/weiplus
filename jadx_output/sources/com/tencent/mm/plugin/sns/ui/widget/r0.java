package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v84.b f171256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView f171257e;

    public r0(com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView snsAdSphereAnimView, v84.b bVar) {
        this.f171257e = snsAdSphereAnimView;
        this.f171256d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView$2");
        com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView snsAdSphereAnimView = this.f171257e;
        int a17 = com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.a(snsAdSphereAnimView);
        v84.b bVar = this.f171256d;
        if (a17 == 1) {
            com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.e(snsAdSphereAnimView, new v84.d(com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.c(snsAdSphereAnimView), com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.f(snsAdSphereAnimView), bVar));
        } else if (com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.a(snsAdSphereAnimView) == 2) {
            com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.e(snsAdSphereAnimView, new v84.e(com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.c(snsAdSphereAnimView), com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.f(snsAdSphereAnimView), bVar));
        } else if (com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.a(snsAdSphereAnimView) == 3) {
            com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.e(snsAdSphereAnimView, new v84.g(com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.c(snsAdSphereAnimView), com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.f(snsAdSphereAnimView), bVar));
        } else if (com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.a(snsAdSphereAnimView) == 4) {
            com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.e(snsAdSphereAnimView, new v84.f(com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.c(snsAdSphereAnimView), com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.f(snsAdSphereAnimView), bVar));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView$2");
    }
}
