package dm1;

/* loaded from: classes5.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f241643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f241644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dm1.m f241645f;

    public l(boolean z17, android.view.View view, dm1.m mVar) {
        this.f241643d = z17;
        this.f241644e = view;
        this.f241645f = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f241643d) {
            android.view.View view = this.f241644e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow$show$6$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow$show$6$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f241644e;
        int measuredHeight = view2.getMeasuredHeight();
        dm1.m mVar = this.f241645f;
        mVar.f241650e = measuredHeight;
        android.animation.Animator animator = mVar.f241651f;
        if (animator != null) {
            animator.cancel();
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(-mVar.f241650e, 0);
        android.view.View view3 = mVar.f241648c;
        if (view3 != null) {
            ofInt.addUpdateListener(new dm1.j(view3, mVar));
        }
        ofInt.addListener(new dm1.k(view2, mVar));
        ofInt.setDuration(200L);
        ofInt.start();
        mVar.f241651f = ofInt;
    }
}
