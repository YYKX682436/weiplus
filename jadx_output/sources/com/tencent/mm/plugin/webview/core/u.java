package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f181988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f181989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181990f;

    public u(int i17, com.tencent.mm.plugin.webview.core.r0 r0Var, java.lang.String str) {
        this.f181988d = i17;
        this.f181989e = r0Var;
        this.f181990f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        com.tencent.mm.plugin.webview.core.r0 r0Var = this.f181989e;
        int i17 = this.f181988d;
        java.lang.String str2 = this.f181990f;
        if (r0Var.F(i17, str2)) {
            com.tencent.mars.xlog.Log.i(r0Var.T(), "checkStatus:" + i17 + ' ' + str2 + " to [" + kz5.n0.g0(r0Var.C0, ",", null, null, 0, null, null, 62, null) + "] [" + kz5.n0.g0(r0Var.B0, ",", null, null, 0, null, null, 62, null) + "] [" + kz5.n0.g0(r0Var.D0, ",", null, null, 0, null, null, 62, null) + ']');
            r0Var.B0.add(java.lang.Integer.valueOf(i17));
            r0Var.a1(r0Var.A0, r0Var.D0, r0Var.D);
            return;
        }
        java.lang.String T = r0Var.T();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkStatus skip: ");
        sb6.append(i17);
        sb6.append(", url=");
        sb6.append(str2);
        sb6.append(", startUrl=");
        sb6.append(r0Var.D);
        sb6.append(' ');
        if (r0Var.f181959v0.contains(java.lang.Integer.valueOf(i17))) {
            str = ", spaUrl=" + r0Var.F;
        } else {
            str = "";
        }
        sb6.append(str);
        com.tencent.mars.xlog.Log.w(T, sb6.toString());
    }
}
