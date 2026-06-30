package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class e4 implements kd0.n2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.c4 f168222a;

    public e4(com.tencent.mm.plugin.sns.ui.c4 c4Var) {
        this.f168222a = c4Var;
    }

    @Override // kd0.n2
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFetchedCodeInfo", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$1");
        com.tencent.mm.plugin.sns.ui.c4 c4Var = this.f168222a;
        if (com.tencent.mm.plugin.sns.ui.c4.a(c4Var) != null && com.tencent.mm.plugin.sns.ui.c4.a(c4Var).g()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            c4Var.f168100t = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            boolean z17 = c4Var.f168093m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = c4Var.f168094n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            r45.jj4 jj4Var = c4Var.f168096p;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            c4Var.l(z17, snsInfo, jj4Var, 2, null, 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFetchedCodeInfo", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$1");
    }
}
