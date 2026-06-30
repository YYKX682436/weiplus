package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class c4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI f184371d;

    public c4(com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI mMFTSSearchTabWebViewUI) {
        this.f184371d = mMFTSSearchTabWebViewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI mMFTSSearchTabWebViewUI = this.f184371d;
        if (mMFTSSearchTabWebViewUI.isDestroyed()) {
            return;
        }
        int i17 = com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI.f184324h5;
        if (mMFTSSearchTabWebViewUI.f183815f == null) {
            return;
        }
        if (mMFTSSearchTabWebViewUI.P9().length() > 0) {
            android.view.View view = mMFTSSearchTabWebViewUI.f184327f5;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/MMFTSSearchTabWebViewUI$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/MMFTSSearchTabWebViewUI$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            androidx.appcompat.app.AppCompatActivity activity = mMFTSSearchTabWebViewUI.getContext();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((rx4.h2) pf5.z.f353948a.a(activity).a(rx4.h2.class)).w7(8);
            return;
        }
        android.view.View view2 = mMFTSSearchTabWebViewUI.f184327f5;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/MMFTSSearchTabWebViewUI$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/MMFTSSearchTabWebViewUI$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.appcompat.app.AppCompatActivity activity2 = mMFTSSearchTabWebViewUI.getContext();
        kotlin.jvm.internal.o.g(activity2, "activity");
        pf5.z zVar = pf5.z.f353948a;
        ((rx4.h2) zVar.a(activity2).a(rx4.h2.class)).w7(0);
        if (mMFTSSearchTabWebViewUI.P4.isEmpty()) {
            androidx.appcompat.app.AppCompatActivity activity3 = mMFTSSearchTabWebViewUI.getContext();
            kotlin.jvm.internal.o.g(activity3, "activity");
            ((rx4.h2) zVar.a(activity3).a(rx4.h2.class)).f401168g = mMFTSSearchTabWebViewUI.I4;
        }
        androidx.appcompat.app.AppCompatActivity activity4 = mMFTSSearchTabWebViewUI.getContext();
        kotlin.jvm.internal.o.g(activity4, "activity");
        ((rx4.h2) zVar.a(activity4).a(rx4.h2.class)).c7(java.lang.System.currentTimeMillis() + "_native", false);
        androidx.appcompat.app.AppCompatActivity activity5 = mMFTSSearchTabWebViewUI.getContext();
        kotlin.jvm.internal.o.g(activity5, "activity");
        ((rx4.h2) zVar.a(activity5).a(rx4.h2.class)).b7();
    }
}
