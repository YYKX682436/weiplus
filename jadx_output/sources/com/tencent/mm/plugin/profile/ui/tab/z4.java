package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes4.dex */
public final class z4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n3.q f154712d;

    public z4(n3.q qVar) {
        this.f154712d = qVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizInfo$initActionBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f154712d.a(motionEvent);
        yj0.a.i(true, this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizInfo$initActionBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
