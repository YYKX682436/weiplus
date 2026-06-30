package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public class a3 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f131614d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewParent f131615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f131616f;

    public a3(com.tencent.mm.plugin.finder.view.e3 e3Var, android.view.ViewParent viewParent) {
        this.f131616f = e3Var;
        this.f131615e = viewParent;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderBottomSheet$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f131615e.getParent().requestDisallowInterceptTouchEvent(true);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f131614d = true;
        } else if (action == 1) {
            if (this.f131614d) {
                this.f131616f.h();
            }
            this.f131614d = false;
        } else if (action == 3) {
            this.f131614d = false;
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/view/FinderBottomSheet$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
