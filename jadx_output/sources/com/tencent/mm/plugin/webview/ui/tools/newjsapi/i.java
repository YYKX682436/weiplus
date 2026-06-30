package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class i implements vg3.h3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186240b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186241c;

    public i(java.lang.String str, nw4.k kVar, nw4.y2 y2Var) {
        this.f186239a = str;
        this.f186240b = kVar;
        this.f186241c = y2Var;
    }

    @Override // vg3.h3
    public final void a(boolean z17, java.lang.String str, java.lang.String str2) {
        nw4.y2 y2Var = this.f186241c;
        nw4.k kVar = this.f186240b;
        if (z17) {
            if (str2 == null || str2.length() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAppBindGroup.", "success:" + this.f186239a);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("openId", str2);
                kVar.f340863d.e(y2Var.f341013c, "bindGroup:success", hashMap);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAppBindGroup.", "fail:" + str);
        kVar.f340863d.e(y2Var.f341013c, "bindGroup:fail", null);
    }
}
