package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class zc implements com.tencent.mm.ui.widget.snackbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186717b;

    public zc(java.lang.String str, nw4.k kVar) {
        this.f186716a = str;
        this.f186717b = kVar;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.g
    public final void a() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = this.f186716a;
        kotlin.jvm.internal.o.e(str, "null cannot be cast to non-null type kotlin.String");
        hashMap.put(dm.i4.COL_ID, str);
        nw4.g gVar = this.f186717b.f340863d;
        kotlin.jvm.internal.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
        ((nw4.n) gVar).o("onClickBottomToast", hashMap);
    }
}
