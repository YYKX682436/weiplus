package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes.dex */
public class d2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f211762d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewParent f211763e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f211764f;

    public d2(com.tencent.mm.ui.widget.dialog.y1 y1Var, android.view.ViewParent viewParent) {
        this.f211764f = y1Var;
        this.f211763e = viewParent;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f211763e.getParent().requestDisallowInterceptTouchEvent(true);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f211762d = true;
        } else if (action == 1) {
            if (this.f211762d) {
                this.f211764f.q();
            }
            this.f211762d = false;
        } else if (action == 3) {
            this.f211762d = false;
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
