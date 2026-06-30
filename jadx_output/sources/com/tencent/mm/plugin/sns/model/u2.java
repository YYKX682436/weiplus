package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164704d;

    public u2(com.tencent.mm.plugin.sns.model.v2 v2Var, java.lang.String str) {
        this.f164704d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkUpdate avatar:");
        java.lang.String str = this.f164704d;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsPreTimeLine", sb6.toString());
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(str);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.wi().b(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine$1");
    }
}
