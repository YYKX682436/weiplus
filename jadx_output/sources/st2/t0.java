package st2;

/* loaded from: classes3.dex */
public final class t0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412458d;

    public t0(st2.h1 h1Var) {
        this.f412458d = h1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$setupBlankArea$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "blank area down");
            view.getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1) {
            com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "blank area up");
            view.getParent().requestDisallowInterceptTouchEvent(false);
            this.f412458d.u();
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$setupBlankArea$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
