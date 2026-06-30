package fc4;

/* loaded from: classes3.dex */
public final class d implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView f261111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f261112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f261113f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f261114g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f261115h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f261116i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ fc4.g f261117m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f261118n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f261119o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f261120p;

    public d(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView, float f17, boolean z17, int i17, int i18, android.view.View view, fc4.g gVar, int i19, int i27, boolean z18) {
        this.f261111d = flexibleVideoView;
        this.f261112e = f17;
        this.f261113f = z17;
        this.f261114g = i17;
        this.f261115h = i18;
        this.f261116i = view;
        this.f261117m = gVar;
        this.f261118n = i19;
        this.f261119o = i27;
        this.f261120p = z18;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC$runEnterAnimation$1");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f261111d;
        flexibleVideoView.getViewTreeObserver().removeOnPreDrawListener(this);
        int width = flexibleVideoView.getWidth() / 2;
        int height = flexibleVideoView.getHeight() / 2;
        flexibleVideoView.setPivotX(flexibleVideoView.getWidth() / 2.0f);
        flexibleVideoView.setPivotY(flexibleVideoView.getHeight() / 2.0f);
        int width2 = flexibleVideoView.getWidth();
        int height2 = flexibleVideoView.getHeight();
        float width3 = this.f261113f ? (this.f261114g * 1.0f) / (flexibleVideoView.getWidth() / this.f261112e) : (this.f261115h * 1.0f) / width2;
        if (java.lang.Float.isInfinite(width3)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC$runEnterAnimation$1");
            return true;
        }
        android.view.View view = this.f261116i;
        view.clearAnimation();
        view.animate().setDuration(300L).setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f)).alpha(1.0f).setListener(new fc4.b(this.f261117m, view, flexibleVideoView)).setUpdateListener(new fc4.c(width3, this.f261111d, this.f261118n, width, this.f261119o, height, this.f261120p, width2, this.f261115h, height2, this.f261114g, this.f261117m));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC$runEnterAnimation$1");
        return true;
    }
}
