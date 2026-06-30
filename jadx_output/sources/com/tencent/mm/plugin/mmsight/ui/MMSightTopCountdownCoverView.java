package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes3.dex */
public class MMSightTopCountdownCoverView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f149217d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f149218e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f149219f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f149220g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f149221h;

    /* renamed from: i, reason: collision with root package name */
    public long f149222i;

    /* renamed from: m, reason: collision with root package name */
    public long f149223m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f149224n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f149225o;

    /* renamed from: p, reason: collision with root package name */
    public final android.animation.ObjectAnimator f149226p;

    public MMSightTopCountdownCoverView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f149217d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f149224n = new com.tencent.mm.plugin.mmsight.ui.t0(this);
        this.f149225o = new com.tencent.mm.plugin.mmsight.ui.u0(this);
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.c1u, (android.view.ViewGroup) this, true);
        this.f149218e = findViewById(com.tencent.mm.R.id.bdq);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.cjt);
        this.f149219f = imageView;
        this.f149220g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cju);
        this.f149221h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cjq);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.0f, 1.0f);
        this.f149226p = ofFloat;
        ofFloat.setDuration(2000L);
        ofFloat.setInterpolator(new android.view.animation.AccelerateInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        setBackgroundColor(android.graphics.Color.argb(java.lang.Math.round(127.5f), 0, 0, 0));
        a();
        setVisibility(4);
    }

    public void a() {
        android.content.Context context = getContext();
        if (context instanceof android.app.Activity) {
            android.graphics.Rect m17 = com.tencent.mm.ui.bk.m((android.app.Activity) context);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            if (m17 != null) {
                paddingTop += m17.top;
            }
            setPadding(paddingLeft, paddingTop, getPaddingRight(), getPaddingBottom());
        }
    }

    public void b() {
        if (this.f149223m > 0) {
            java.lang.Runnable runnable = this.f149225o;
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f149217d;
            n3Var.removeCallbacks(runnable);
            n3Var.removeCallbacks(this.f149224n);
            this.f149226p.cancel();
            this.f149219f.setAlpha(1.0f);
            this.f149220g.setText(java.lang.String.format(java.util.Locale.US, "%02d:%02d", 0, 0));
            this.f149223m = 0L;
            this.f149222i = 0L;
        }
        setVisibility(4);
    }

    public void c(long j17) {
        setVisibility(0);
        this.f149222i = 0L;
        long j18 = 1000 * j17;
        this.f149223m = j18;
        java.lang.Runnable runnable = this.f149225o;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f149217d;
        n3Var.removeCallbacks(runnable);
        java.lang.Runnable runnable2 = this.f149224n;
        n3Var.removeCallbacks(runnable2);
        android.view.View view = this.f149218e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/ui/MMSightTopCountdownCoverView", "switchToNormalState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mmsight/ui/MMSightTopCountdownCoverView", "switchToNormalState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f149221h.setVisibility(8);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f149220g.getLayoutParams();
        layoutParams.removeRule(2);
        layoutParams.addRule(13);
        requestLayout();
        invalidate();
        this.f149226p.start();
        ((com.tencent.mm.plugin.mmsight.ui.u0) runnable).run();
        n3Var.postDelayed(runnable2, java.lang.Math.max(0L, j18 - 5000));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        java.lang.Runnable runnable = this.f149225o;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f149217d;
        n3Var.removeCallbacks(runnable);
        n3Var.removeCallbacks(this.f149224n);
        this.f149226p.cancel();
    }

    public MMSightTopCountdownCoverView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f149217d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f149224n = new com.tencent.mm.plugin.mmsight.ui.t0(this);
        this.f149225o = new com.tencent.mm.plugin.mmsight.ui.u0(this);
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.c1u, (android.view.ViewGroup) this, true);
        this.f149218e = findViewById(com.tencent.mm.R.id.bdq);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.cjt);
        this.f149219f = imageView;
        this.f149220g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cju);
        this.f149221h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cjq);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.0f, 1.0f);
        this.f149226p = ofFloat;
        ofFloat.setDuration(2000L);
        ofFloat.setInterpolator(new android.view.animation.AccelerateInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        setBackgroundColor(android.graphics.Color.argb(java.lang.Math.round(127.5f), 0, 0, 0));
        a();
        setVisibility(4);
    }
}
