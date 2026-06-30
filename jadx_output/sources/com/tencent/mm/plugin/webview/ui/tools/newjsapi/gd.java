package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class gd implements com.tencent.mm.ui.widget.picker.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186207a;

    public gd(nw4.k kVar) {
        this.f186207a = kVar;
    }

    @Override // com.tencent.mm.ui.widget.picker.y
    public final void a(int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("column", 0);
        hashMap.put("current", java.lang.Integer.valueOf(i17));
        nw4.g gVar = this.f186207a.f340863d;
        kotlin.jvm.internal.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
        ((nw4.n) gVar).o("onMultiPickerViewChange", hashMap);
    }
}
