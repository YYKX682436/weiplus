package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes15.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.scanner.model.e f158874a = new com.tencent.mm.plugin.scanner.model.e();

    public final void a(sz3.y0 y0Var) {
        if (y0Var == null) {
            return;
        }
        java.lang.String str = y0Var.f414164e;
        int i17 = y0Var.f414165f;
        long j17 = y0Var.f414166g;
        long j18 = y0Var.f414167h;
        long j19 = y0Var.f414168i;
        int i18 = y0Var.f414169j;
        long j27 = y0Var.f414170k;
        long j28 = y0Var.f414171l;
        long j29 = y0Var.f414172m;
        int i19 = y0Var.f414174o;
        int i27 = y0Var.f414175p;
        int i28 = y0Var.f414176q;
        long j37 = y0Var.f414173n;
        int i29 = ((zs5.a0) ((jz5.n) vz3.t.f441711b).getValue()) == zs5.a0.f475317e ? 2 : 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraScanCombineDetectReporter", "report24129 detectSession: " + str + ", itemSource: " + i17 + ", detectDuration: " + j17 + ", imgCropDuration: " + j18 + ", encodeDuration: " + j19 + ", encodeSize: " + i18 + ", queueDuration: " + j27 + ", uploadDuration: " + j28 + ", retrievalDuration: " + j29 + ", uploadEncodeType: " + i19 + ", scanCodeFrameCost: " + i27 + ", scanProductSkipFrameCount: " + i28 + ", frameTotalCost: " + j37 + ", platformType: " + i29);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24129, 0, str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29), java.lang.Integer.valueOf(i19), "", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), 0, 1, java.lang.Long.valueOf(j37), java.lang.Integer.valueOf(i29));
    }
}
