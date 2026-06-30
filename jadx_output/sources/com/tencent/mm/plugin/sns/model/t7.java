package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class t7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f164693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164694e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f164695f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f164696g;

    public t7(com.tencent.mm.plugin.sns.model.o7 o7Var, int i17, java.lang.String str, boolean z17, int i18) {
        this.f164693d = i17;
        this.f164694e = str;
        this.f164695f = z17;
        this.f164696g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$5");
        if (com.tencent.mm.plugin.sns.model.l4.Xj()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "is invalid to getSnsInfoStorage");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$5");
            return;
        }
        boolean z17 = this.f164695f;
        int i17 = this.f164696g;
        int i18 = this.f164693d;
        com.tencent.mm.plugin.sns.model.l3 l3Var = new com.tencent.mm.plugin.sns.model.l3(i18, this.f164694e, z17, i17);
        com.tencent.mm.plugin.sns.model.l4.xj().t(i18, l3Var.hashCode());
        gm0.j1.i();
        gm0.j1.n().f273288b.g(l3Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$5");
    }
}
