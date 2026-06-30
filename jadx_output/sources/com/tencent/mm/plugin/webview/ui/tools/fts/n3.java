package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes.dex */
public class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.o3 f184537d;

    public n3(com.tencent.mm.plugin.webview.ui.tools.fts.o3 o3Var) {
        this.f184537d = o3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f184537d.f184568d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSWeAppBaseWebViewUI$13$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSWeAppBaseWebViewUI$13$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
