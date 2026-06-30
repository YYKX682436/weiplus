package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes10.dex */
public class t0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBaseUI f138185d;

    public t0(com.tencent.mm.plugin.fts.ui.FTSBaseUI fTSBaseUI) {
        this.f138185d = fTSBaseUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBaseUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.fts.ui.FTSBaseUI fTSBaseUI = this.f138185d;
        fTSBaseUI.f137907h.getFtsEditText().d();
        fTSBaseUI.hideVKB();
        yj0.a.i(false, this, "com/tencent/mm/plugin/fts/ui/FTSBaseUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
