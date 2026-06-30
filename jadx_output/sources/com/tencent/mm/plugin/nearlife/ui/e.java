package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes3.dex */
public class e implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearlife.ui.f f152318d;

    public e(com.tencent.mm.plugin.nearlife.ui.f fVar) {
        this.f152318d = fVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$5$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f152318d.f152319d.hideVKB();
        yj0.a.i(false, this, "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$5$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
