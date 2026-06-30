package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes3.dex */
public class r3 implements android.view.View.OnLongClickListener {
    public r3(com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI fTSWeAppBaseWebViewUI) {
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/FTSWeAppBaseWebViewUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        yj0.a.i(true, this, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSWeAppBaseWebViewUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
