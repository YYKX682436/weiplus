package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class g5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186115e;

    public g5(java.lang.String str, nw4.k kVar) {
        this.f186114d = str;
        this.f186115e = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiHandleMPPageAction$showNavShadow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("traceId", this.f186114d);
        nw4.g gVar = this.f186115e.f340863d;
        kotlin.jvm.internal.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
        ((nw4.n) gVar).o("onNavShadowClick", hashMap);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiHandleMPPageAction$showNavShadow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
