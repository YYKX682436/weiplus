package qs3;

/* loaded from: classes13.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public int f366363a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f366364b;

    /* renamed from: c, reason: collision with root package name */
    public final qs3.m0 f366365c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarViewController f366366d;

    public n0(com.tencent.mm.plugin.radar.ui.RadarViewController radarViewController) {
        this.f366366d = radarViewController;
        android.content.Context context = radarViewController.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f366364b = context.getResources().getDisplayMetrics().densityDpi <= 240;
        this.f366365c = new qs3.m0(this);
    }

    public final android.view.animation.Animation a() {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this.f366366d.getContext(), com.tencent.mm.R.anim.f8do);
        kotlin.jvm.internal.o.f(loadAnimation, "loadAnimation(...)");
        return loadAnimation;
    }

    public final void b(int i17, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        qs3.m0 m0Var = this.f366365c;
        android.os.Message obtainMessage = m0Var.obtainMessage();
        java.lang.Object tag = view.getTag(this.f366366d.f155049u);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        obtainMessage.what = num != null ? num.intValue() : -1;
        obtainMessage.obj = view;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/radar/ui/RadarViewController$AvatarAnimator", "show", "(ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/radar/ui/RadarViewController$AvatarAnimator", "show", "(ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m0Var.sendMessageDelayed(obtainMessage, (i17 + 1) * 500);
    }
}
