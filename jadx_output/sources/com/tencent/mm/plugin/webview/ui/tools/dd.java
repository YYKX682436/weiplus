package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class dd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.ld f184111d;

    public dd(com.tencent.mm.plugin.webview.ui.tools.ld ldVar) {
        this.f184111d = ldVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper = this.f184111d.f185656g;
        webViewTransHelper.getClass();
        wd0.z1 z1Var = (wd0.z1) i95.n0.c(wd0.z1.class);
        android.content.Context context = webViewTransHelper.f181741d.getContext();
        kotlin.jvm.internal.o.d(context);
        ((vd0.o3) z1Var).fj(context, null);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
