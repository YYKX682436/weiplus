package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes4.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158836d;

    public c1(java.lang.String str) {
        this.f158836d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f158836d;
        if (str.length() > 0) {
            com.tencent.mm.plugin.scanner.model.d1 d1Var = com.tencent.mm.plugin.scanner.model.d1.f158843a;
            java.lang.Integer a17 = com.tencent.mm.plugin.scanner.model.d1.a(d1Var, str, "(.*close=[0-9]+)", "close");
            com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.plugin.scanner.model.d1.f158851i;
            if (o4Var != null) {
                o4Var.putBoolean("scan_config_disable_scan_product", a17 != null && a17.intValue() > 0);
            }
            java.lang.Integer a18 = com.tencent.mm.plugin.scanner.model.d1.a(d1Var, str, "(time_interval=[0-9]+)", "time_interval");
            if (a18 == null || a18.intValue() < 1000) {
                com.tencent.mm.sdk.platformtools.o4 o4Var2 = com.tencent.mm.plugin.scanner.model.d1.f158851i;
                if (o4Var2 != null) {
                    o4Var2.remove("scan_config_request_time_interval");
                }
            } else {
                com.tencent.mm.sdk.platformtools.o4 o4Var3 = com.tencent.mm.plugin.scanner.model.d1.f158851i;
                if (o4Var3 != null) {
                    o4Var3.putInt("scan_config_request_time_interval", a18.intValue());
                }
            }
            java.lang.Integer a19 = com.tencent.mm.plugin.scanner.model.d1.a(d1Var, str, "(upload_timeout=[0-9]+)", "upload_timeout");
            if (a19 == null || a19.intValue() < 5000) {
                com.tencent.mm.sdk.platformtools.o4 o4Var4 = com.tencent.mm.plugin.scanner.model.d1.f158851i;
                if (o4Var4 != null) {
                    o4Var4.remove("scan_config_upload_timeout");
                }
            } else {
                com.tencent.mm.sdk.platformtools.o4 o4Var5 = com.tencent.mm.plugin.scanner.model.d1.f158851i;
                if (o4Var5 != null) {
                    o4Var5.putInt("scan_config_upload_timeout", a19.intValue());
                }
            }
            java.lang.Integer a27 = com.tencent.mm.plugin.scanner.model.d1.a(d1Var, str, "(retrieval_timeout=[0-9]+)", "retrieval_timeout");
            if (a27 == null || a27.intValue() < 5000) {
                com.tencent.mm.sdk.platformtools.o4 o4Var6 = com.tencent.mm.plugin.scanner.model.d1.f158851i;
                if (o4Var6 != null) {
                    o4Var6.remove("scan_config_retrieval_timeout");
                }
            } else {
                com.tencent.mm.sdk.platformtools.o4 o4Var7 = com.tencent.mm.plugin.scanner.model.d1.f158851i;
                if (o4Var7 != null) {
                    o4Var7.putInt("scan_config_retrieval_timeout", a27.intValue());
                }
            }
            java.lang.Integer a28 = com.tencent.mm.plugin.scanner.model.d1.a(d1Var, str, "(wait_max_frame=[0-9]+)", "wait_max_frame");
            if (a28 != null) {
                com.tencent.mm.sdk.platformtools.o4 o4Var8 = com.tencent.mm.plugin.scanner.model.d1.f158851i;
                if (o4Var8 != null) {
                    o4Var8.putInt("scan_config_server_detect_frame_count", a28.intValue());
                }
            } else {
                com.tencent.mm.sdk.platformtools.o4 o4Var9 = com.tencent.mm.plugin.scanner.model.d1.f158851i;
                if (o4Var9 != null) {
                    o4Var9.remove("scan_config_server_detect_frame_count");
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanFastFocusEngineManager", "updateScanProductServerConfig closeScanProduct: %s, requestInterval: %s, uploadTimeout: %s, retrievalTimeout: %s, serverDetectFrame: %s", a17, a18, a19, a27, a28);
        }
    }
}
