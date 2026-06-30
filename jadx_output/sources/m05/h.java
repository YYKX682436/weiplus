package m05;

/* loaded from: classes.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f322566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f322567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f322568f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f322569g;

    public h(java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2, java.lang.Integer num, java.lang.String str) {
        this.f322566d = weakReference;
        this.f322567e = weakReference2;
        this.f322568f = num;
        this.f322569g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Integer num;
        int intValue;
        try {
            android.app.Activity activity = (android.app.Activity) this.f322566d.get();
            if (activity == null) {
                return;
            }
            android.view.View view = (android.view.View) this.f322567e.get();
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                if (view == null && (num = this.f322568f) != null && (intValue = num.intValue()) != 0) {
                    view = activity.findViewById(intValue);
                }
                java.lang.String resId = this.f322569g;
                if (view == null && (activity.getWindow().getDecorView() instanceof android.view.ViewGroup)) {
                    android.view.View decorView = activity.getWindow().getDecorView();
                    kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                    kotlin.jvm.internal.o.g(resId, "tag");
                    view = m05.e.a((android.view.ViewGroup) decorView, com.tencent.mm.R.id.pgt, resId, 0);
                }
                if (view == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WcPayReport|WcPayBtnDisabledReport", "not find targetview: " + resId);
                } else {
                    kotlin.jvm.internal.o.g(resId, "resId");
                    ((com.tencent.mm.ui.MMFragmentActivity) activity).addDispatchedTouchListener(new m05.g(activity.getClass().getSimpleName() + '-' + resId, view));
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WcPayReport|WcPayBtnDisabledReport", th6, "", new java.lang.Object[0]);
        }
    }
}
