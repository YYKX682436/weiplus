package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class x1 extends com.tencent.mm.plugin.webview.luggage.w1 {

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f182679u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f182680v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f182681w;

    public x1(android.content.Context context, android.view.View view) {
        super(context);
        this.f182679u = view;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d9x, (android.view.ViewGroup) this, false);
        this.f182680v = inflate;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/webview/luggage/LuggagePullDownWebView", "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/webview/luggage/LuggagePullDownWebView", "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setBackgroundResource(com.tencent.mm.R.color.aak);
        f(inflate, view);
        this.f182681w = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.pip);
    }

    public void g() {
        setPullDownEnabled(false);
        android.view.View view = this.f182680v;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/luggage/LuggagePullDownWebView", "setTransparent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/luggage/LuggagePullDownWebView", "setTransparent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f182679u.setBackgroundColor(0);
        setBackgroundColor(0);
    }

    public void setBgColor(int i17) {
        ((android.view.ViewGroup) this.f182680v.getParent()).setBackgroundColor(i17);
    }

    public void setCurrentUrl(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f182681w.setVisibility(8);
            return;
        }
        java.lang.String host = android.net.Uri.parse(str).getHost();
        if (com.tencent.mm.sdk.platformtools.t8.K0(host) || j62.e.g().c(new com.tencent.mm.repairer.config.webview.RepairerConfigThirdPartyDisclaimer()) == 1) {
            this.f182681w.setVisibility(8);
            return;
        }
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.l6m, host);
        this.f182681w.setVisibility(0);
        this.f182681w.setText(string);
    }

    public void setPullDownViewVisibility(int i17) {
        android.view.View view = this.f182680v;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/luggage/LuggagePullDownWebView", "setPullDownViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/luggage/LuggagePullDownWebView", "setPullDownViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
