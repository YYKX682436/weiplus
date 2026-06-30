package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class s7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f164681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f164682e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.o7 f164683f;

    public s7(com.tencent.mm.plugin.sns.model.o7 o7Var, int i17, boolean z17) {
        this.f164683f = o7Var;
        this.f164681d = i17;
        this.f164682e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$4");
        if (com.tencent.mm.plugin.sns.model.l4.Xj()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "is invalid to getSnsInfoStorage");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$4");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.model.UploadManager");
        java.util.Set set = this.f164683f.f164560e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.model.UploadManager");
        java.util.Iterator it = ((java.util.HashSet) set).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.model.v7 v7Var = (com.tencent.mm.plugin.sns.model.v7) it.next();
            if (v7Var != null) {
                v7Var.onPostEnd(this.f164681d, this.f164682e);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$4");
    }
}
