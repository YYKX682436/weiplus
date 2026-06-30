package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class v0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI f184660d;

    public v0(com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI fTSBaseWebViewUI) {
        this.f184660d = fTSBaseWebViewUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI fTSBaseWebViewUI = this.f184660d;
        fTSBaseWebViewUI.hideVKB();
        fTSBaseWebViewUI.Q9();
        yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
