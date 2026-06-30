package ml5;

/* loaded from: classes10.dex */
public final class g0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f328423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.cropview.RoundCropLayout f328424e;

    public g0(com.tencent.mm.ui.widget.cropview.RoundCropLayout roundCropLayout) {
        this.f328424e = roundCropLayout;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/cropview/RoundCropLayout$SimpleTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getActionMasked()) : null;
        com.tencent.mm.ui.widget.cropview.RoundCropLayout roundCropLayout = this.f328424e;
        java.lang.String str = roundCropLayout.f211669d;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f328423d = false;
        } else if (valueOf != null && valueOf.intValue() == 5 && motionEvent.getPointerCount() == 2) {
            this.f328423d = true;
        }
        android.view.ScaleGestureDetector scaleGestureDetector = roundCropLayout.f211680r;
        kotlin.jvm.internal.o.d(motionEvent);
        scaleGestureDetector.onTouchEvent(motionEvent);
        if (!this.f328423d) {
            android.view.GestureDetector gestureDetector = roundCropLayout.f211679q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(motionEvent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/ui/widget/cropview/RoundCropLayout$SimpleTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0)), "com/tencent/mm/ui/widget/cropview/RoundCropLayout$SimpleTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/widget/cropview/RoundCropLayout$SimpleTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
