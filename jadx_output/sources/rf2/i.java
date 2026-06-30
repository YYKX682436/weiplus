package rf2;

/* loaded from: classes10.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf2.q f394764d;

    public i(rf2.q qVar) {
        this.f394764d = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rf2.q qVar = this.f394764d;
        android.view.View view = qVar.f394854e.f230681r;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultWinnerPage$doFreeGiftAnim$2$1$1$onAnimationEnd$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultWinnerPage$doFreeGiftAnim$2$1$1$onAnimationEnd$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ImageView imageView = qVar.B;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
