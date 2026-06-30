package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.h1 f186445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f186447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.v70 f186448g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.plugin.webview.ui.tools.media.h1 h1Var, nw4.k kVar, android.app.Activity activity, bw5.v70 v70Var) {
        super(0);
        this.f186445d = h1Var;
        this.f186446e = kVar;
        this.f186447f = activity;
        this.f186448g = v70Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.String Z;
        bw5.ar0 ar0Var = bw5.ar0.TingScene_MpAudio;
        jm4.i4 Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi();
        if (Zi != null) {
            ((jm4.k4) Zi).d(bw5.yq0.TingReportAction_AddToListenLaterList, ar0Var, this.f186445d.f185780a, null, null);
        }
        nw4.k kVar = this.f186446e;
        zg0.q2 a17 = kVar.a();
        java.lang.String str2 = "";
        if (a17 == null || (str = a17.i()) == null) {
            str = "";
        }
        zg0.q2 a18 = kVar.a();
        if (a18 != null && (Z = ((com.tencent.mm.plugin.webview.core.r0) a18).Z()) != null) {
            str2 = Z;
        }
        if (!(str2.length() == 0)) {
            str = str2;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "tyt_listen_later");
        hashMap.put("currscene", 1101);
        hashMap.put("which_button", 22);
        hashMap.put("actionbizinfo", rk4.j5.f(str));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_clk", null, hashMap, 5, false);
        i95.m c17 = i95.n0.c(qk.a8.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.app.Activity activity = this.f186447f;
        bw5.v70 listenItem = this.f186448g;
        kotlin.jvm.internal.o.f(listenItem, "$listenItem");
        qk.a8.E8((qk.a8) c17, activity, ar0Var, listenItem, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.p0(), 0, 0, null, null, null, com.tencent.mm.plugin.appbrand.jsapi.storage.e0.CTRL_INDEX, null);
        return jz5.f0.f302826a;
    }
}
