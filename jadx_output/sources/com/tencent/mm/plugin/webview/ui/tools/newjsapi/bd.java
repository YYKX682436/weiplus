package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes7.dex */
public final class bd implements com.tencent.mm.ui.widget.picker.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185986b;

    public bd(nw4.k kVar, nw4.y2 y2Var) {
        this.f185985a = kVar;
        this.f185986b = y2Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.n
    public final void onResult(boolean z17, int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowDatePickerView", "date set hasSetResult=" + z17 + ", " + i17 + ", " + i18 + ", " + i19);
        nw4.k kVar = this.f185985a;
        nw4.y2 y2Var = this.f185986b;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowDatePickerView", "cancel date set");
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":cancel", null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "%d-%d-%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)}, 3));
        kotlin.jvm.internal.o.f(format, "format(...)");
        hashMap.put("selectTime", format);
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
    }
}
