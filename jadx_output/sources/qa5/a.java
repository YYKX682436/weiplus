package qa5;

/* loaded from: classes3.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f361108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f361109e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.anim.content.AnimTextView f361110f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f361111g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f361112h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f361113i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f361114m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f361115n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f361116o;

    public a(int i17, int i18, com.tencent.mm.ui.anim.content.AnimTextView animTextView, int i19, int i27, int i28, int i29, int i37, int i38) {
        this.f361108d = i17;
        this.f361109e = i18;
        this.f361110f = animTextView;
        this.f361111g = i19;
        this.f361112h = i27;
        this.f361113i = i28;
        this.f361114m = i29;
        this.f361115n = i37;
        this.f361116o = i38;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        float f17 = this.f361108d + ((this.f361109e - r0) * animatedFraction);
        com.tencent.mm.ui.anim.content.AnimTextView animTextView = this.f361110f;
        android.view.ViewGroup.LayoutParams layoutParams = animTextView.getLayoutParams();
        layoutParams.width = (int) f17;
        animTextView.setLayoutParams(layoutParams);
        float f18 = this.f361111g + ((this.f361112h - r1) * animatedFraction);
        float f19 = this.f361113i + ((this.f361114m - r1) * animatedFraction);
        float f27 = this.f361115n + ((this.f361116o - r1) * animatedFraction);
        animTextView.setPadding((int) f18, animTextView.getPaddingTop(), (int) f19, animTextView.getPaddingBottom());
        android.graphics.drawable.Drawable background = animTextView.getBackground();
        if (background == null) {
            return;
        }
        background.setAlpha((int) f27);
    }
}
