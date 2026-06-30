package com.tencent.mm.plugin.recordvideo.ui.editor;

/* loaded from: classes15.dex */
public class MMEditorRecordButton extends android.widget.FrameLayout {
    public static final int B = android.view.ViewConfiguration.getTapTimeout();
    public static final float C = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.by) / com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn);
    public final java.lang.Runnable A;

    /* renamed from: d, reason: collision with root package name */
    public long f156036d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f156037e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f156038f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f156039g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f156040h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f156041i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f156042m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f156043n;

    /* renamed from: o, reason: collision with root package name */
    public android.animation.ValueAnimator f156044o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f156045p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f156046q;

    /* renamed from: r, reason: collision with root package name */
    public int f156047r;

    /* renamed from: s, reason: collision with root package name */
    public int f156048s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.drawable.Drawable f156049t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.drawable.Drawable f156050u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.drawable.Drawable f156051v;

    /* renamed from: w, reason: collision with root package name */
    public float f156052w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f156053x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f156054y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.Runnable f156055z;

    public MMEditorRecordButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f156036d = -1L;
        this.f156040h = false;
        this.f156041i = false;
        this.f156042m = false;
        this.f156046q = false;
        this.f156052w = -1.0f;
        this.f156053x = true;
        this.f156054y = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f156055z = new wu3.o1(this);
        this.A = new wu3.p1(this);
        b();
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecordButton", "init, longPressTimeout: %s, tapTimeout: %s", 500, java.lang.Integer.valueOf(B));
        this.f156049t = getContext().getResources().getDrawable(com.tencent.mm.R.drawable.ap7);
        this.f156050u = getContext().getResources().getDrawable(com.tencent.mm.R.drawable.ap8);
        this.f156051v = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_mike, getResources().getColor(com.tencent.mm.R.color.f478526a7));
        this.f156047r = android.graphics.Color.parseColor("#FFDDDDDD");
        this.f156048s = android.graphics.Color.parseColor("#4CFA9D3B");
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.c1r, (android.view.ViewGroup) this, true);
        this.f156039g = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.hd6);
        this.f156037e = findViewById(com.tencent.mm.R.id.f485343hd2);
        this.f156038f = findViewById(com.tencent.mm.R.id.kn_);
        this.f156039g.setImageDrawable(this.f156051v);
        this.f156037e.setBackground(this.f156049t);
        this.f156038f.setBackground(this.f156050u);
        this.f156053x = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r0 != 3) goto L38;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setErrorPressCallback(wu3.r1 r1Var) {
    }

    public void setHighLightOuter(int i17) {
        this.f156048s = i17;
        android.graphics.drawable.Drawable drawable = this.f156050u;
        if (drawable instanceof android.graphics.drawable.GradientDrawable) {
            ((android.graphics.drawable.GradientDrawable) drawable).setColor(i17);
        }
    }

    public void setInnerColor(int i17) {
        android.graphics.drawable.Drawable drawable = this.f156049t;
        if (drawable instanceof android.graphics.drawable.GradientDrawable) {
            ((android.graphics.drawable.GradientDrawable) drawable).setColor(i17);
        }
    }

    public void setLongPressCallback(wu3.s1 s1Var) {
    }

    public void setLongPressScrollCallback(wu3.t1 t1Var) {
    }

    public void setSimpleTapCallback(wu3.u1 u1Var) {
    }

    public void setTouchEnable(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecordButton", "setTouchEnable: %s", java.lang.Boolean.valueOf(z17));
        this.f156053x = z17;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecordButton", "setVisibility, isAnimating: %s", java.lang.Boolean.valueOf(this.f156042m));
        if (this.f156042m) {
            postDelayed(new wu3.n1(this, i17), 150L);
        } else {
            super.setVisibility(i17);
        }
    }

    public MMEditorRecordButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f156036d = -1L;
        this.f156040h = false;
        this.f156041i = false;
        this.f156042m = false;
        this.f156046q = false;
        this.f156052w = -1.0f;
        this.f156053x = true;
        this.f156054y = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f156055z = new wu3.o1(this);
        this.A = new wu3.p1(this);
        b();
    }
}
