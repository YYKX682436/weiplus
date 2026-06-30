package j84;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f298180a;

    /* renamed from: b, reason: collision with root package name */
    public final int f298181b;

    /* renamed from: c, reason: collision with root package name */
    public android.animation.ValueAnimator f298182c;

    /* renamed from: d, reason: collision with root package name */
    public android.animation.ValueAnimator f298183d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f298184e;

    /* renamed from: f, reason: collision with root package name */
    public float f298185f;

    /* renamed from: g, reason: collision with root package name */
    public float f298186g;

    /* renamed from: h, reason: collision with root package name */
    public float f298187h;

    /* renamed from: i, reason: collision with root package name */
    public j84.a f298188i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.l f298189j;

    /* renamed from: k, reason: collision with root package name */
    public yz5.a f298190k;

    /* renamed from: l, reason: collision with root package name */
    public yz5.l f298191l;

    public f(int i17, int i18) {
        this.f298180a = i17;
        this.f298181b = i18;
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cancelAllAnimations", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
        android.animation.ValueAnimator valueAnimator = this.f298182c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f298182c = null;
        android.animation.ValueAnimator valueAnimator2 = this.f298183d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f298183d = null;
        this.f298184e = false;
        this.f298188i = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cancelAllAnimations", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager");
    }
}
