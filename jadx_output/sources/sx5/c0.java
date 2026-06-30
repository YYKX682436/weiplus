package sx5;

/* loaded from: classes13.dex */
public class c0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f413713d;

    public c0(sx5.a1 a1Var) {
        this.f413713d = a1Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        sx5.a1 a1Var = this.f413713d;
        if (!a1Var.M) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 1) {
            a1Var.T = 0;
        } else if (action != 5) {
            if (action == 6) {
                a1Var.T = 0;
            }
        } else if (motionEvent.getPointerCount() == 2) {
            a1Var.T = 1;
        }
        if (motionEvent.getAction() == 1 && a1Var.F1 == 3 && !a1Var.m(a1Var.N)) {
            double d17 = (a1Var.N * a1Var.f413676l1) / 100.0d;
            a1Var.w(new sx5.f0(a1Var, true, d17));
            a1Var.a(d17);
            a1Var.F1 = 0;
        }
        if (a1Var.T == 1) {
            return a1Var.L.onTouchEvent(motionEvent);
        }
        android.view.GestureDetector gestureDetector = a1Var.K;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/xweb/extension/video/XWebNativeInterface$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/xweb/extension/video/XWebNativeInterface$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }
}
