package com.tencent.mm.wallet_core.keyboard;

/* loaded from: classes9.dex */
public class WcPayKeyboardAnimationActionButton extends android.view.View {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public android.graphics.Paint F;
    public android.graphics.Paint G;
    public final android.graphics.RectF H;
    public final android.graphics.Rect I;

    /* renamed from: J, reason: collision with root package name */
    public android.animation.ObjectAnimator f213823J;
    public android.animation.ValueAnimator K;
    public android.animation.ValueAnimator L;
    public android.animation.AnimatorSet M;
    public android.animation.ObjectAnimator N;
    public android.animation.ValueAnimator P;
    public android.animation.AnimatorSet Q;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f213824d;

    /* renamed from: e, reason: collision with root package name */
    public final int f213825e;

    /* renamed from: f, reason: collision with root package name */
    public final int f213826f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.res.ColorStateList f213827g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.res.ColorStateList f213828h;

    /* renamed from: i, reason: collision with root package name */
    public final int f213829i;

    /* renamed from: m, reason: collision with root package name */
    public int f213830m;

    /* renamed from: n, reason: collision with root package name */
    public int f213831n;

    /* renamed from: o, reason: collision with root package name */
    public int f213832o;

    /* renamed from: p, reason: collision with root package name */
    public int f213833p;

    /* renamed from: q, reason: collision with root package name */
    public int f213834q;

    /* renamed from: r, reason: collision with root package name */
    public int f213835r;

    /* renamed from: s, reason: collision with root package name */
    public int f213836s;

    /* renamed from: t, reason: collision with root package name */
    public int f213837t;

    /* renamed from: u, reason: collision with root package name */
    public final int f213838u;

    /* renamed from: v, reason: collision with root package name */
    public final int f213839v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f213840w;

    /* renamed from: x, reason: collision with root package name */
    public float f213841x;

    /* renamed from: y, reason: collision with root package name */
    public float f213842y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f213843z;

    public WcPayKeyboardAnimationActionButton(android.content.Context context) {
        super(context);
        this.f213825e = getResources().getColor(com.tencent.mm.R.color.aaq);
        this.f213826f = getResources().getColor(com.tencent.mm.R.color.f479552ab3);
        this.f213829i = 17;
        this.f213838u = 300;
        this.f213839v = 300;
        this.f213840w = "";
        this.f213843z = true;
        this.A = false;
        this.H = new android.graphics.RectF();
        this.I = new android.graphics.Rect();
        this.M = new android.animation.AnimatorSet();
        this.Q = new android.animation.AnimatorSet();
        a();
    }

    public final void a() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        this.f213824d = context;
        this.f213832o = i65.a.b(context, 4);
        this.f213833p = i65.a.b(this.f213824d, 16);
        this.f213834q = i65.a.b(this.f213824d, 64);
        this.f213835r = i65.a.b(this.f213824d, 96);
        this.f213827g = getResources().getColorStateList(com.tencent.mm.R.color.aaq);
        this.f213828h = getResources().getColorStateList(com.tencent.mm.R.color.f479552ab3);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.F = paint;
        paint.setStrokeWidth(4.0f);
        this.F.setStyle(android.graphics.Paint.Style.FILL);
        this.F.setAntiAlias(true);
        this.F.setColor(this.f213825e);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.G = paint2;
        paint2.setTextSize(i65.a.b(this.f213824d, this.f213829i) * i65.a.q(this.f213824d));
        this.G.setColor(this.f213826f);
        this.G.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.G.setAntiAlias(true);
        this.G.setFakeBoldText(true);
    }

    public void b(int i17, int i18, int i19, int i27) {
        if (this.f213843z) {
            this.f213843z = false;
            this.B = i17;
            this.C = i18;
            this.D = i19;
            this.E = i27;
            float translationX = getTranslationX();
            this.f213842y = translationX;
            this.f213841x = translationX - this.f213833p;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) getLayoutParams();
        layoutParams.width = i17;
        layoutParams.height = i18;
        layoutParams.bottomMargin = i19;
        setLayoutParams(layoutParams);
        this.f213830m = i17;
        this.f213831n = i18;
        this.f213837t = i17;
        if (this.f213823J == null) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "translationX", this.f213842y, this.f213841x);
            this.f213823J = ofFloat;
            ofFloat.setDuration(this.f213838u);
            this.f213823J.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        }
        int i28 = this.f213831n;
        this.f213836s = i28;
        android.animation.ValueAnimator valueAnimator = this.L;
        int i29 = this.f213839v;
        if (valueAnimator == null) {
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i28, this.f213834q);
            this.L = ofInt;
            ofInt.setDuration(i29);
            this.L.addUpdateListener(new mp5.x(this));
            this.L.addListener(new mp5.y(this));
        }
        int i37 = this.f213830m;
        this.f213837t = i37;
        if (this.K == null) {
            android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(i37, this.f213835r);
            this.K = ofInt2;
            ofInt2.setDuration(i29);
            this.K.addUpdateListener(new mp5.z(this));
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.M = animatorSet;
        animatorSet.play(this.L).with(this.f213823J);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int[] drawableState = getDrawableState();
        int colorForState = this.f213828h.getColorForState(drawableState, this.f213826f);
        int colorForState2 = this.f213827g.getColorForState(drawableState, this.f213825e);
        this.G.setColor(colorForState);
        this.F.setColor(colorForState2);
        boolean z17 = this.A;
        android.graphics.RectF rectF = this.H;
        if (z17) {
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            rectF.right = this.f213837t;
            rectF.bottom = this.f213836s;
        } else {
            rectF.left = 0.0f;
            int i17 = this.f213831n;
            int i18 = this.f213836s;
            rectF.top = (i17 - i18) / 2;
            rectF.right = this.f213837t;
            rectF.bottom = (i17 + i18) / 2;
        }
        float f17 = rectF.left;
        float f18 = this.f213832o;
        canvas.drawRoundRect(rectF, f18, f18, this.F);
        boolean z18 = this.A;
        android.graphics.Rect rect = this.I;
        if (z18) {
            rect.left = 0;
            rect.top = 0;
            rect.right = this.f213837t;
            rect.bottom = this.f213834q;
        } else {
            rect.left = 0;
            rect.top = 0;
            rect.right = this.f213837t;
            rect.bottom = this.f213831n;
        }
        android.graphics.Paint.FontMetricsInt fontMetricsInt = this.G.getFontMetricsInt();
        canvas.drawText(this.f213840w, rect.centerX(), (((rect.bottom + rect.top) - fontMetricsInt.bottom) - fontMetricsInt.top) / 2, this.G);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
    }

    public WcPayKeyboardAnimationActionButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f213825e = getResources().getColor(com.tencent.mm.R.color.aaq);
        this.f213826f = getResources().getColor(com.tencent.mm.R.color.f479552ab3);
        this.f213829i = 17;
        this.f213838u = 300;
        this.f213839v = 300;
        this.f213840w = "";
        this.f213843z = true;
        this.A = false;
        this.H = new android.graphics.RectF();
        this.I = new android.graphics.Rect();
        this.M = new android.animation.AnimatorSet();
        this.Q = new android.animation.AnimatorSet();
        a();
    }

    public WcPayKeyboardAnimationActionButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f213825e = getResources().getColor(com.tencent.mm.R.color.aaq);
        this.f213826f = getResources().getColor(com.tencent.mm.R.color.f479552ab3);
        this.f213829i = 17;
        this.f213838u = 300;
        this.f213839v = 300;
        this.f213840w = "";
        this.f213843z = true;
        this.A = false;
        this.H = new android.graphics.RectF();
        this.I = new android.graphics.Rect();
        this.M = new android.animation.AnimatorSet();
        this.Q = new android.animation.AnimatorSet();
        a();
    }
}
