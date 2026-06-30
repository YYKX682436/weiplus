package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes3.dex */
public final class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.j3 f184730d;

    public y2(com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var) {
        this.f184730d = j3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f184730d.f184474x;
        kotlin.jvm.internal.o.d(view);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSVoiceSearchHelper$activeNewVoice2txtTrans$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSVoiceSearchHelper$activeNewVoice2txtTrans$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
