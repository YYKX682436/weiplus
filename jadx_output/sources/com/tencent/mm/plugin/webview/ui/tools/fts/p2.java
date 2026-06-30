package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class p2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSMoreWebViewUI f184583d;

    public p2(com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSMoreWebViewUI fTSSOSMoreWebViewUI) {
        this.f184583d = fTSSOSMoreWebViewUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSMoreWebViewUI fTSSOSMoreWebViewUI = this.f184583d;
        fTSSOSMoreWebViewUI.J4.d();
        fTSSOSMoreWebViewUI.hideVKB();
        yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
