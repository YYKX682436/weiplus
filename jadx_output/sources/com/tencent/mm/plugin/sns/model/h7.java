package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class h7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.i7 f164242d;

    public h7(com.tencent.mm.plugin.sns.model.i7 i7Var) {
        this.f164242d = i7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$9");
        if (this.f164242d.f164308a != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "download video finish cdnmediaId %s", this.f164242d.f164308a.f164813b);
            com.tencent.mm.plugin.sns.model.i7 i7Var = this.f164242d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            java.util.Map map = i7Var.f164310c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            ((java.util.concurrent.ConcurrentHashMap) map).remove(this.f164242d.f164308a.f164813b);
        }
        this.f164242d.f164308a = null;
        this.f164242d.w();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$9");
    }
}
