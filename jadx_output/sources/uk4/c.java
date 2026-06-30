package uk4;

/* loaded from: classes5.dex */
public class c implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f428527d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewParent f428528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uk4.e f428529f;

    public c(uk4.e eVar, android.view.ViewParent viewParent) {
        this.f428529f = eVar;
        this.f428528e = viewParent;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/base/view/FinderBottomSheet$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f428528e.getParent().requestDisallowInterceptTouchEvent(true);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f428527d = true;
        } else if (action == 1) {
            if (this.f428527d) {
                this.f428529f.b();
            }
            this.f428527d = false;
        } else if (action == 3) {
            this.f428527d = false;
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/ting/base/view/FinderBottomSheet$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
