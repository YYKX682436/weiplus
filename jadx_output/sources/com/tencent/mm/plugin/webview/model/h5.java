package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public final class h5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f182924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.j5 f182925e;

    public h5(android.os.Bundle bundle, com.tencent.mm.plugin.webview.model.j5 j5Var) {
        this.f182924d = bundle;
        this.f182925e = j5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Bundle bundle = this.f182924d;
        java.lang.String string = bundle.getString("host");
        jz5.g gVar = com.tencent.mm.plugin.webview.model.j5.f182970c;
        if (kz5.n0.O((java.util.HashSet) ((jz5.n) com.tencent.mm.plugin.webview.model.j5.f182971d).getValue(), string)) {
            return;
        }
        java.lang.String string2 = bundle.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_CGI_PROXY_IP);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.webview.model.j5 j5Var = this.f182925e;
        sb6.append(j5Var.f182972a);
        sb6.append(',');
        sb6.append(string);
        sb6.append(',');
        sb6.append(string2);
        java.lang.String sb7 = sb6.toString();
        if (j5Var.f182973b.contains(sb7)) {
            return;
        }
        long j17 = j5Var.f182972a;
        if (string == null || string.length() == 0) {
            return;
        }
        if (string2 == null || string2.length() == 0) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(26701, java.lang.Long.valueOf(j5Var.f182972a), string, string2);
        j5Var.f182973b.add(sb7);
    }
}
