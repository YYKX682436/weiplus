package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v84.b f171248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView f171249e;

    public q0(com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView snsAdSphereAnimView, v84.b bVar) {
        this.f171249e = snsAdSphereAnimView;
        this.f171248d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView$1");
        com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView snsAdSphereAnimView = this.f171249e;
        int a17 = com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.a(snsAdSphereAnimView);
        v84.b bVar = this.f171248d;
        if (a17 == 1) {
            com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.b(snsAdSphereAnimView, new w84.b(com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.c(snsAdSphereAnimView), com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.d(snsAdSphereAnimView), bVar));
        } else if (com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.a(snsAdSphereAnimView) == 2) {
            com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.b(snsAdSphereAnimView, new w84.c(com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.c(snsAdSphereAnimView), com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.d(snsAdSphereAnimView), bVar));
        } else if (com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.a(snsAdSphereAnimView) == 3) {
            com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.b(snsAdSphereAnimView, new w84.e(com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.c(snsAdSphereAnimView), com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.d(snsAdSphereAnimView), bVar));
        } else if (com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.a(snsAdSphereAnimView) == 4) {
            com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.b(snsAdSphereAnimView, new w84.d(com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.c(snsAdSphereAnimView), com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView.d(snsAdSphereAnimView), bVar));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView$1");
    }
}
