package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class f4 implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.g4 f164191d;

    public f4(com.tencent.mm.plugin.sns.model.g4 g4Var) {
        this.f164191d = g4Var;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1");
        com.tencent.mm.plugin.sns.model.g4 g4Var = this.f164191d;
        if (com.tencent.mm.plugin.sns.model.g4.f(g4Var) != null && com.tencent.mm.plugin.sns.model.g4.g(g4Var).equals(str)) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.model.d4(this, str, j17, j18));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1");
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1");
        com.tencent.mm.plugin.sns.model.g4 g4Var = this.f164191d;
        if (com.tencent.mm.plugin.sns.model.g4.f(g4Var) != null && com.tencent.mm.plugin.sns.model.g4.g(g4Var).equals(str)) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.model.e4(this, str, i17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1");
    }

    @Override // dn.n
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDataAvailable", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1");
        com.tencent.mm.plugin.sns.model.g4 g4Var = this.f164191d;
        if (com.tencent.mm.plugin.sns.model.g4.f(g4Var) != null && com.tencent.mm.plugin.sns.model.g4.g(g4Var).equals(str)) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.model.c4(this, str, j17, j18));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDataAvailable", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1");
    }

    @Override // dn.n
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onM3U8Ready", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onM3U8Ready", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1");
    }

    @Override // dn.n
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1");
        com.tencent.mm.plugin.sns.model.g4 g4Var = this.f164191d;
        if (com.tencent.mm.plugin.sns.model.g4.f(g4Var) != null && com.tencent.mm.plugin.sns.model.g4.g(g4Var).equals(str)) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.model.b4(this, str, j17, j18, videoInfo));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1");
    }
}
