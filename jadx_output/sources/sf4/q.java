package sf4;

/* loaded from: classes4.dex */
public final class q extends oj5.y {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f407560a;

    /* renamed from: b, reason: collision with root package name */
    public final sf4.r0 f407561b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.VelocityTracker f407562c;

    /* renamed from: d, reason: collision with root package name */
    public final int f407563d;

    /* renamed from: e, reason: collision with root package name */
    public final int f407564e;

    /* renamed from: f, reason: collision with root package name */
    public float f407565f;

    /* renamed from: g, reason: collision with root package name */
    public float f407566g;

    /* renamed from: h, reason: collision with root package name */
    public float f407567h;

    /* renamed from: i, reason: collision with root package name */
    public float f407568i;

    /* renamed from: j, reason: collision with root package name */
    public int f407569j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f407570k;

    public q(android.view.View galleryView, sf4.r0 galleryScaleListener) {
        kotlin.jvm.internal.o.g(galleryView, "galleryView");
        kotlin.jvm.internal.o.g(galleryScaleListener, "galleryScaleListener");
        this.f407560a = galleryView;
        this.f407561b = galleryScaleListener;
        this.f407563d = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 32);
        this.f407564e = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 96);
    }

    @Override // oj5.y
    public boolean a(android.view.MotionEvent event, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(event, "event");
        if (this.f407562c == null) {
            this.f407562c = android.view.VelocityTracker.obtain();
        }
        android.view.VelocityTracker velocityTracker = this.f407562c;
        if (velocityTracker != null) {
            velocityTracker.addMovement(event);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            sf4.r0 r0Var = this.f407561b;
            android.view.View view = this.f407560a;
            boolean z18 = true;
            if (actionMasked == 1) {
                if (this.f407570k) {
                    android.view.VelocityTracker velocityTracker2 = this.f407562c;
                    if (velocityTracker2 != null) {
                        velocityTracker2.computeCurrentVelocity(1000);
                    }
                    android.view.VelocityTracker velocityTracker3 = this.f407562c;
                    float xVelocity = velocityTracker3 != null ? velocityTracker3.getXVelocity() : 0.0f;
                    android.view.VelocityTracker velocityTracker4 = this.f407562c;
                    float yVelocity = velocityTracker4 != null ? velocityTracker4.getYVelocity() : 0.0f;
                    if (this.f407569j != 2 ? !(this.f407567h > view.getWidth() / 2 || xVelocity > 50.0f) : !(this.f407568i > this.f407564e || yVelocity > 0.0f)) {
                        z18 = false;
                    }
                    if (z18) {
                        mf4.d.f326160a.a(13);
                        ((of4.c) r0Var).a();
                    } else {
                        view.animate().translationY(0.0f).start();
                    }
                }
                this.f407569j = 0;
                this.f407567h = 0.0f;
                this.f407568i = 0.0f;
                this.f407570k = false;
                android.view.VelocityTracker velocityTracker5 = this.f407562c;
                if (velocityTracker5 != null) {
                    velocityTracker5.clear();
                }
                android.view.VelocityTracker velocityTracker6 = this.f407562c;
                if (velocityTracker6 != null) {
                    velocityTracker6.recycle();
                }
                this.f407562c = null;
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    this.f407569j = 0;
                    view.setTranslationY(0.0f);
                    this.f407567h = 0.0f;
                    this.f407568i = 0.0f;
                    this.f407570k = false;
                    android.view.VelocityTracker velocityTracker7 = this.f407562c;
                    if (velocityTracker7 != null) {
                        velocityTracker7.clear();
                    }
                    android.view.VelocityTracker velocityTracker8 = this.f407562c;
                    if (velocityTracker8 != null) {
                        velocityTracker8.recycle();
                    }
                    this.f407562c = null;
                }
            } else if (z17) {
                this.f407569j = i17;
                if ((i17 != 8 || this.f407565f >= this.f407563d) && i17 != 2) {
                    z18 = false;
                }
                this.f407570k = z18;
                float rawX = event.getRawX();
                float rawY = event.getRawY();
                this.f407567h = rawX - this.f407565f;
                this.f407568i = rawY - this.f407566g;
                if (this.f407570k) {
                    view.animate().cancel();
                    float height = this.f407569j == 2 ? this.f407568i : (this.f407567h * view.getHeight()) / view.getWidth();
                    float f17 = height >= 0.0f ? height : 0.0f;
                    view.setTranslationY(f17);
                    float height2 = 0.8f - (f17 / view.getHeight());
                    android.widget.ImageView imageView = ((of4.c) r0Var).f345105a.f171866g;
                    if (imageView != null) {
                        imageView.setAlpha(height2);
                    }
                }
            }
        } else {
            this.f407565f = event.getRawX();
            this.f407566g = event.getRawY();
        }
        return this.f407570k;
    }

    @Override // oj5.y
    public int b() {
        return 10;
    }
}
