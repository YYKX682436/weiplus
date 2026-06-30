package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes4.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f185936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185938f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(android.app.Activity activity, nw4.k kVar, nw4.y2 y2Var) {
        super(0);
        this.f185936d = activity;
        this.f185937e = kVar;
        this.f185938f = y2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float b17 = oe1.x1.b(this.f185936d);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, java.lang.Float.valueOf(b17));
        nw4.g gVar = this.f185937e.f340863d;
        nw4.y2 y2Var = this.f185938f;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getScreenBrightness, currentBrightness=");
        sb6.append(b17);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleDeviceInfo", sb6.toString());
        return jz5.f0.f302826a;
    }
}
