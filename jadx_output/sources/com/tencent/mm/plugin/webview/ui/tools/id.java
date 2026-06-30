package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class id implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f184841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184842e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f184843f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184844g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f184845h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184846i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.ld f184847m;

    public id(com.tencent.mm.plugin.webview.ui.tools.ld ldVar, boolean z17, java.lang.String str, int i17, java.lang.String str2, boolean z18, java.lang.String str3) {
        this.f184847m = ldVar;
        this.f184841d = z17;
        this.f184842e = str;
        this.f184843f = i17;
        this.f184844g = str2;
        this.f184845h = z18;
        this.f184846i = str3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.ld ldVar = this.f184847m;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = ldVar.f185654e;
        if (webViewUI == null || webViewUI.f183849q2 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (android.os.SystemClock.elapsedRealtime() - ldVar.f185666q < 175) {
            ldVar.f185658i.removeCallbacksAndMessages(null);
            ldVar.f185654e.k7();
            yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            ldVar.f185666q = android.os.SystemClock.elapsedRealtime();
            ldVar.f185658i.postDelayed(new com.tencent.mm.plugin.webview.ui.tools.hd(this), 175L);
            yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
