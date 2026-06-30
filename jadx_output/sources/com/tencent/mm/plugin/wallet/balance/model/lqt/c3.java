package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public abstract class c3 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f177624a = "";

    public static java.lang.String a(java.lang.String str) {
        return android.net.Uri.parse(str).getQueryParameter("operate_id");
    }

    public static void b(java.lang.String str) {
        java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("trace_info");
        if (com.tencent.mm.sdk.platformtools.t8.K0(queryParameter)) {
            return;
        }
        c(queryParameter);
    }

    public static void c(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtTraceInfoStore", "trace info: %s", str);
        f177624a = str;
    }
}
