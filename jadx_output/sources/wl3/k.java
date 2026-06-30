package wl3;

/* loaded from: classes.dex */
public final class k implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public static final wl3.k f447071d = new wl3.k();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/music/ui/view/MusicMainSeekBar$initView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        if (action == 0) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        view.onTouchEvent(motionEvent);
        yj0.a.i(true, this, "com/tencent/mm/plugin/music/ui/view/MusicMainSeekBar$initView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
