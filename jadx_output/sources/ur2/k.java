package ur2;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ur2.o f430400d;

    public k(ur2.o oVar) {
        this.f430400d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        ur2.o oVar = this.f430400d;
        android.view.View decorView = oVar.f430407d.getWindow().getDecorView();
        android.widget.FrameLayout frameLayout = decorView instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) decorView : null;
        if (frameLayout != null) {
            frameLayout.addView(oVar.f430414n, layoutParams);
        }
        android.view.View view = oVar.f430414n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/post/shorttitle/PostShortTitleHalfScreen$6", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/post/shorttitle/PostShortTitleHalfScreen$6", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
