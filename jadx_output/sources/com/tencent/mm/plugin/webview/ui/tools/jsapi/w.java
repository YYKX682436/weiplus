package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f185484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185485f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185486g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185487h;

    public w(java.lang.String str, java.util.HashMap hashMap, java.lang.String str2, nw4.k kVar, nw4.y2 y2Var) {
        this.f185483d = str;
        this.f185484e = hashMap;
        this.f185485f = str2;
        this.f185486g = kVar;
        this.f185487h = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f185483d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        java.util.HashMap hashMap = this.f185484e;
        if (!K0) {
            hashMap.put("originalImageLocalIdArr", new org.json.JSONArray(new java.lang.String[]{str}));
        }
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePassport", "choosePassport callback localId:%s hasOriginal:%b originalCount:%d", this.f185485f, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(z17 ? 1 : 0));
        this.f185486g.f340863d.e(this.f185487h.f341013c, "choosePassport:ok", hashMap);
    }
}
