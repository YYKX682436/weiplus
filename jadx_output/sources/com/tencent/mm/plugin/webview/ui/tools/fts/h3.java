package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes15.dex */
public final class h3 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.j3 f184430d;

    public h3(com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var) {
        this.f184430d = j3Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var = this.f184430d;
        z21.e eVar = j3Var.A;
        if (eVar != null) {
            eVar.stop(true);
        }
        j3Var.B.removeMessages(1);
        j3Var.B.sendMessageDelayed(j3Var.B.obtainMessage(1, 99, 0), 500);
        j3Var.c();
        j3Var.d();
        android.view.ViewGroup viewGroup = j3Var.f184467q;
        kotlin.jvm.internal.o.d(viewGroup);
        viewGroup.setVisibility(0);
        android.view.View view = j3Var.f184474x;
        kotlin.jvm.internal.o.d(view);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSVoiceSearchHelper", "resetNewVoice2SearchWindow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSVoiceSearchHelper", "resetNewVoice2SearchWindow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = j3Var.f184463m;
        kotlin.jvm.internal.o.d(view2);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSVoiceSearchHelper", "resetNewVoice2SearchWindow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSVoiceSearchHelper", "resetNewVoice2SearchWindow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
