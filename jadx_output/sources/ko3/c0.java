package ko3;

/* loaded from: classes13.dex */
public final class c0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View.OnTouchListener f309937d;

    public c0(android.view.View.OnTouchListener onTouchListener) {
        this.f309937d = onTouchListener;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/normsg/utils/ClickBotCheckHelper$CheckerOnTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        java.util.Map map = ko3.d0.f309938a;
        synchronized (map) {
            if (((java.util.WeakHashMap) map).containsKey(view)) {
                java.util.Map map2 = ko3.d0.f309939b;
                synchronized (map2) {
                    ((java.util.WeakHashMap) map2).put(view, java.lang.Boolean.TRUE);
                }
            }
        }
        android.view.View.OnTouchListener onTouchListener = this.f309937d;
        if (onTouchListener == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/normsg/utils/ClickBotCheckHelper$CheckerOnTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        boolean onTouch = onTouchListener.onTouch(view, motionEvent);
        yj0.a.i(onTouch, this, "com/tencent/mm/plugin/normsg/utils/ClickBotCheckHelper$CheckerOnTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouch;
    }
}
