package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI f184579d;

    public p(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI) {
        this.f184579d = baseSOSWebViewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI = this.f184579d;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.fts.v(baseSOSWebViewUI, baseSOSWebViewUI.w9()));
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
