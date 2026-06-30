package qa5;

/* loaded from: classes5.dex */
public final class l implements qa5.g {

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f361126b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f361127c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f361128d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f361129e;

    /* renamed from: f, reason: collision with root package name */
    public int f361130f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f361131g;

    /* renamed from: h, reason: collision with root package name */
    public int f361132h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Integer f361133i;

    /* renamed from: j, reason: collision with root package name */
    public android.animation.ValueAnimator f361134j;

    /* renamed from: k, reason: collision with root package name */
    public qa5.f f361135k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Integer f361136l;

    public l(android.view.View attachView) {
        kotlin.jvm.internal.o.g(attachView, "attachView");
        this.f361126b = attachView;
        this.f361130f = 200;
        this.f361132h = -1;
    }

    @Override // qa5.g
    public void a(boolean z17) {
        this.f361127c = z17;
    }

    @Override // qa5.g
    public void b(qa5.f fVar) {
        this.f361135k = fVar;
    }

    public final jz5.l c(int i17, int i18, boolean z17, yz5.a aVar) {
        android.animation.ValueAnimator valueAnimator = this.f361134j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z17) {
            this.f361129e = true;
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i17, i18);
        int measuredWidth = this.f361126b.getMeasuredWidth();
        this.f361136l = java.lang.Integer.valueOf(i18);
        ofInt.addUpdateListener(new qa5.h(this));
        ofInt.addListener(new qa5.i(this, aVar));
        if (this.f361131g) {
            ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
        } else {
            ofInt.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        }
        ofInt.setDuration(this.f361130f);
        if (this.f361128d) {
            this.f361134j = ofInt;
        } else {
            ofInt.start();
            this.f361134j = ofInt;
        }
        return new jz5.l(java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(i17));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        if (r0.isRunning() == true) goto L11;
     */
    @Override // qa5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void cancel() {
        /*
            r3 = this;
            boolean r0 = r3.f361128d
            if (r0 == 0) goto L5
            return
        L5:
            android.animation.ValueAnimator r0 = r3.f361134j
            r1 = 0
            if (r0 == 0) goto L12
            boolean r0 = r0.isRunning()
            r2 = 1
            if (r0 != r2) goto L12
            goto L13
        L12:
            r2 = r1
        L13:
            if (r2 == 0) goto L30
            android.animation.ValueAnimator r0 = r3.f361134j
            if (r0 == 0) goto L1c
            r0.cancel()
        L1c:
            r0 = 0
            r3.f361134j = r0
            r3.f361129e = r1
            java.lang.Integer r0 = r3.f361136l
            if (r0 == 0) goto L2b
            int r0 = r0.intValue()
            r3.f361132h = r0
        L2b:
            android.view.View r0 = r3.f361126b
            r0.requestLayout()
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qa5.l.cancel():void");
    }

    public void d(boolean z17, int i17, int i18, int i19, int i27) {
        int i28 = i27 - i18;
        android.animation.ValueAnimator valueAnimator = this.f361134j;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f361129e = true;
        } else {
            this.f361129e = false;
            this.f361132h = i28;
        }
    }

    public jz5.l e(int i17, int i18) {
        if (!this.f361127c) {
            return null;
        }
        android.view.View view = this.f361126b;
        view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i19 = this.f361132h;
        if (i19 != -1 && measuredHeight != i19) {
            return c(i19, measuredHeight, false, null);
        }
        android.animation.ValueAnimator valueAnimator = this.f361134j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f361134j = null;
        return null;
    }

    public jz5.l f(int i17, int i18) {
        boolean z17 = this.f361127c;
        if (!z17 || !z17 || this.f361133i == null || !this.f361129e) {
            return null;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f361126b.getMeasuredWidth());
        java.lang.Integer num = this.f361133i;
        kotlin.jvm.internal.o.d(num);
        return new jz5.l(valueOf, num);
    }

    @Override // qa5.g
    public void pause() {
        this.f361128d = true;
    }

    @Override // qa5.g
    public void resume() {
        this.f361128d = false;
        android.animation.ValueAnimator valueAnimator = this.f361134j;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
        this.f361134j = null;
    }
}
