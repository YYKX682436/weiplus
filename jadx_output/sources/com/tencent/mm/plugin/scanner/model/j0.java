package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes9.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.scanner.model.j0 f158937a = new com.tencent.mm.plugin.scanner.model.j0();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f158938b;

    public final void a(java.lang.String str, java.lang.String resultType, int i17, int i18, int i19, java.lang.String str2) {
        kotlin.jvm.internal.o.g(resultType, "resultType");
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineScanReporter", "OfflineScan report resultType: %s, scene: %d, networkType: %d, actionType: %d, result: %s", resultType, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = resultType;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        objArr[3] = java.lang.Integer.valueOf(i19);
        if (str == null) {
            str = "";
        }
        objArr[4] = str;
        objArr[5] = java.lang.Integer.valueOf(f158938b ? 1 : 0);
        objArr[6] = java.lang.Long.valueOf(str2 != null ? java.lang.Long.parseLong(str2) : 0L);
        g0Var.d(17386, objArr);
    }
}
