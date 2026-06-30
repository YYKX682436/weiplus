package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class i1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI f184436e;

    public i1(com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI, android.view.View view) {
        this.f184436e = fTSSOSHomeWebViewUI;
        this.f184435d = view;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        k75.j jVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f184436e.Q9();
        com.tencent.mm.plugin.webview.ui.tools.fts.o2 o2Var = this.f184436e.f184301p5;
        if (o2Var != null && (jVar = o2Var.f304847e) != null) {
            jVar.sendMessage(android.os.Message.obtain(o2Var.f304847e, 15, motionEvent));
        }
        boolean onTouchEvent = this.f184435d.onTouchEvent(motionEvent);
        yj0.a.i(onTouchEvent, this, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }
}
