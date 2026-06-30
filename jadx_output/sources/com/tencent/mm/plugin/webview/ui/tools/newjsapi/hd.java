package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class hd implements com.tencent.mm.ui.widget.picker.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186237a;

    public hd(nw4.k kVar) {
        this.f186237a = kVar;
    }

    public final void a(int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("column", 1);
        hashMap.put("current", java.lang.Integer.valueOf(i17));
        nw4.g gVar = this.f186237a.f340863d;
        kotlin.jvm.internal.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
        ((nw4.n) gVar).o("onMultiPickerViewChange", hashMap);
    }
}
