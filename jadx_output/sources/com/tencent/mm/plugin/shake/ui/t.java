package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class t implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeItemListUI f162332d;

    public t(com.tencent.mm.plugin.shake.ui.ShakeItemListUI shakeItemListUI) {
        this.f162332d = shakeItemListUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        bb5.g gVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeItemListUI$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.shake.ui.y yVar = this.f162332d.f162095f;
        if (yVar != null && (gVar = yVar.f162354q) != null) {
            gVar.c(motionEvent);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
