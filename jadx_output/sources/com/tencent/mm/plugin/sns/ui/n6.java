package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class n6 implements com.tencent.mm.plugin.sns.ui.o9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.i6 f169980a;

    public n6(com.tencent.mm.plugin.sns.ui.i6 i6Var) {
        this.f169980a = i6Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.o9
    public void c(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.NewSightWidget$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.NewSightWidget$2");
    }

    @Override // com.tencent.mm.plugin.sns.ui.o9
    public void d(int i17, o55.a aVar, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.NewSightWidget$2");
        com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "handleBackgroundVideo getRemuxVideoWork >> workType: %d, workTagId: %s", java.lang.Integer.valueOf(i17), str);
        com.tencent.mm.plugin.sns.ui.i6 i6Var = this.f169980a;
        if (!android.text.TextUtils.equals(str, com.tencent.mm.plugin.sns.ui.i6.o(i6Var)) || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewSightWidget", "handleBackgroundVideo getRemuxVideoWork >> workTagId is error, backgroundRemuxWorkId: %s, workTagId: %s", com.tencent.mm.plugin.sns.ui.i6.o(i6Var), str);
        } else if (aVar == null) {
            com.tencent.mm.plugin.sns.ui.i6.q(i6Var);
            com.tencent.mars.xlog.Log.e("MicroMsg.NewSightWidget", "handleBackgroundVideo getRemuxVideoWork >> isError: %s", str);
        } else if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "handleBackgroundVideo getRemuxVideoWork >> isSuccess workTagId: %s", str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            i6Var.v();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        } else if (i17 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "handleBackgroundVideo getRemuxVideoWork >> isFailed workTagId: %s", str);
            com.tencent.mm.plugin.sns.ui.i6.q(i6Var);
        } else if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "work is running");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            boolean z17 = i6Var.P;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            if (z17) {
                ((yy0.g8) ((pp0.o0) i95.n0.c(pp0.o0.class))).Di(com.tencent.mm.plugin.sns.ui.i6.o(i6Var), 9);
            } else {
                ((wp4.x) ((n55.f) i95.n0.c(n55.f.class))).Di(com.tencent.mm.plugin.sns.ui.i6.o(i6Var), 9);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.NewSightWidget$2");
    }
}
