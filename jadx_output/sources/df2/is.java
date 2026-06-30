package df2;

/* loaded from: classes10.dex */
public final class is implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f230428d;

    public is(df2.lt ltVar) {
        this.f230428d = ltVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        df2.lt ltVar = this.f230428d;
        if (action == 0) {
            java.lang.String str = df2.lt.W;
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "bannerRv action down");
            kotlinx.coroutines.r2 r2Var = ltVar.B;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
        } else if (action == 1) {
            java.lang.String str2 = df2.lt.W;
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "bannerRv action up");
            ltVar.x7();
            ltVar.N = true;
        } else if (action == 3) {
            java.lang.String str3 = df2.lt.W;
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "bannerRv action cancel");
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
