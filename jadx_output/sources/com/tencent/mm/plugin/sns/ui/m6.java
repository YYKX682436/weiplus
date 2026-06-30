package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class m6 implements com.tencent.mm.plugin.sns.ui.o9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.i6 f169888a;

    public m6(com.tencent.mm.plugin.sns.ui.i6 i6Var) {
        this.f169888a = i6Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.o9
    public void c(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.NewSightWidget$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.NewSightWidget$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.o9
    public void d(int i17, o55.a aVar, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.NewSightWidget$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "handleBackgroundVideo >> workType: %d, workTagId: %s", java.lang.Integer.valueOf(i17), str);
        com.tencent.mm.plugin.sns.ui.i6 i6Var = this.f169888a;
        if (!android.text.TextUtils.equals(str, com.tencent.mm.plugin.sns.ui.i6.o(i6Var)) || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewSightWidget", "handleBackgroundVideo >> workTagId is error, backgroundRemuxWorkId: %s, workTagId: %s", com.tencent.mm.plugin.sns.ui.i6.o(i6Var), str);
        } else {
            if (i17 != 1 || aVar == null) {
                com.tencent.mm.plugin.sns.ui.i6.q(i6Var);
                com.tencent.mars.xlog.Log.e("MicroMsg.NewSightWidget", "current video failed");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "result is success, go to replace video");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                i6Var.v();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            }
            com.tencent.mm.plugin.sns.statistics.w0.f164989a.d(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.NewSightWidget$1");
    }
}
