package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class td implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f186550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186552c;

    public td(com.tencent.mm.ui.widget.picker.c0 c0Var, nw4.k kVar, nw4.y2 y2Var) {
        this.f186550a = c0Var;
        this.f186551b = kVar;
        this.f186552c = y2Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public final void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f186550a;
        c0Var.d();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowPickerView", "picker set hasSetResult=" + z17 + ", result=" + obj);
        nw4.k kVar = this.f186551b;
        nw4.y2 y2Var = this.f186552c;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowPickerView", "picker set cancel");
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":cancel", null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        kotlin.jvm.internal.o.d(obj);
        hashMap.put("value", obj);
        hashMap.put(ya.b.INDEX, java.lang.Integer.valueOf(c0Var.b()));
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
    }
}
