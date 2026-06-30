package rc5;

/* loaded from: classes5.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc5.x f394189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f394190e;

    public r(rc5.x xVar, int i17) {
        this.f394189d = xVar;
        this.f394190e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rc5.m mVar;
        java.lang.ref.WeakReference weakReference = this.f394189d.A;
        if (weakReference == null || (mVar = (rc5.m) weakReference.get()) == null) {
            return;
        }
        boolean z17 = mVar.f394182u;
        int i17 = this.f394190e;
        if (z17) {
            mVar.getLayoutParams().height = i17;
        } else {
            mVar.f394171g = i17;
            int i18 = (int) (i17 * mVar.f394168d);
            mVar.f394173i = i18;
            mVar.f394174m = (int) (i18 * mVar.f394169e);
            android.view.ViewGroup.LayoutParams layoutParams = mVar.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            layoutParams2.height = mVar.f394173i;
            layoutParams2.gravity = 80;
            mVar.setLayoutParams(layoutParams2);
        }
        mVar.invalidate();
        jz5.g gVar = rc5.x.D;
        com.tencent.mars.xlog.Log.i("MicroMsg.ExpandableHalfScreenChattingUIC", "curHeight: " + i17 + " mFullScreenHeight: " + mVar.f394171g + ", mCollapsedScreenHeight: " + mVar.f394173i);
    }
}
