package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class v implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f185452c;

    public v(nw4.k kVar, nw4.y2 y2Var, int i17) {
        this.f185450a = kVar;
        this.f185451b = y2Var;
        this.f185452c = i17;
    }

    @Override // j35.b0
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRequestPermissionsResult: requestCode=");
        sb6.append(i17);
        sb6.append(", grantResults=");
        java.lang.String arrays = java.util.Arrays.toString(grantResults);
        kotlin.jvm.internal.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePassport", sb6.toString());
        if (i17 != 151) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiChoosePassport", "Unexpected requestCode: " + i17);
            return;
        }
        boolean z17 = !(grantResults.length == 0);
        nw4.y2 y2Var = this.f185451b;
        nw4.k kVar = this.f185450a;
        if (z17 && grantResults[0] == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePassport", "Storage permission granted, proceeding with image selection");
            com.tencent.mm.plugin.webview.ui.tools.jsapi.b0.f184939d.i(kVar, y2Var, this.f185452c);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePassport", "Storage permission denied");
            kVar.f340863d.e(y2Var.f341013c, "choosePassport:fail", null);
        }
    }
}
