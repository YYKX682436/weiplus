package sw2;

/* loaded from: classes3.dex */
public final class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f413447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f413448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout f413449f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f413450g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout.LayoutParams f413451h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout.LayoutParams f413452i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout.LayoutParams f413453m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.View f413454n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f413455o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.view.View f413456p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.view.View f413457q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ android.view.View f413458r;

    public a(android.view.View view, int i17, com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout finderRecordPluginLayout, int i18, android.widget.RelativeLayout.LayoutParams layoutParams, android.widget.RelativeLayout.LayoutParams layoutParams2, android.widget.RelativeLayout.LayoutParams layoutParams3, android.view.View view2, android.graphics.Rect rect, android.view.View view3, android.view.View view4, android.view.View view5) {
        this.f413447d = view;
        this.f413448e = i17;
        this.f413449f = finderRecordPluginLayout;
        this.f413450g = i18;
        this.f413451h = layoutParams;
        this.f413452i = layoutParams2;
        this.f413453m = layoutParams3;
        this.f413454n = view2;
        this.f413455o = rect;
        this.f413456p = view3;
        this.f413457q = view4;
        this.f413458r = view5;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View view = this.f413447d;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int height = (this.f413448e - view.getHeight()) / 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderRecordLayoutUtil", "blackHeight " + height);
        com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout finderRecordPluginLayout = this.f413449f;
        int h17 = i65.a.h(finderRecordPluginLayout.getContext(), com.tencent.mm.R.dimen.f479704cz);
        android.view.View view2 = this.f413456p;
        android.view.View view3 = this.f413454n;
        android.widget.RelativeLayout.LayoutParams layoutParams = this.f413453m;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = this.f413452i;
        android.widget.RelativeLayout.LayoutParams layoutParams3 = this.f413451h;
        if (height < h17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderRecordLayoutUtil", "blackHeight <3A");
        } else {
            int h18 = i65.a.h(finderRecordPluginLayout.getContext(), com.tencent.mm.R.dimen.f479723df);
            int i17 = this.f413450g;
            if (height < h18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderRecordLayoutUtil", "blackHeight 3A - 6A");
                layoutParams3.bottomMargin = i65.a.h(finderRecordPluginLayout.getContext(), com.tencent.mm.R.dimen.f479688cn);
                layoutParams2.bottomMargin = (height - i17) + i65.a.h(finderRecordPluginLayout.getContext(), com.tencent.mm.R.dimen.f479646bl);
                layoutParams.topMargin = height;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderRecordLayoutUtil", "blackHeight  >6A");
                int h19 = (height - i65.a.h(finderRecordPluginLayout.getContext(), com.tencent.mm.R.dimen.f479672c9)) - view3.getHeight();
                if (h19 - this.f413455o.top > 0) {
                    layoutParams.topMargin = h19;
                } else {
                    layoutParams.topMargin = i65.a.h(finderRecordPluginLayout.getContext(), com.tencent.mm.R.dimen.f479672c9) + height;
                }
                if (height - i17 >= i65.a.h(finderRecordPluginLayout.getContext(), com.tencent.mm.R.dimen.f479723df)) {
                    layoutParams3.bottomMargin = i65.a.h(finderRecordPluginLayout.getContext(), com.tencent.mm.R.dimen.f479718db);
                    layoutParams2.bottomMargin = (height - view2.getHeight()) - i17;
                } else {
                    layoutParams3.bottomMargin = i65.a.h(finderRecordPluginLayout.getContext(), com.tencent.mm.R.dimen.f479688cn);
                    layoutParams2.bottomMargin = (height - i17) + i65.a.h(finderRecordPluginLayout.getContext(), com.tencent.mm.R.dimen.f479646bl);
                }
            }
        }
        view3.setLayoutParams(layoutParams);
        this.f413457q.setLayoutParams(layoutParams3);
        view2.setLayoutParams(layoutParams2);
        android.view.View view4 = this.f413458r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/util/FinderRecordLayoutUtilKt$reLayoutPluginOnce$1", "onGlobalLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/video/util/FinderRecordLayoutUtilKt$reLayoutPluginOnce$1", "onGlobalLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setFillAfter(true);
        this.f413458r.startAnimation(alphaAnimation);
    }
}
