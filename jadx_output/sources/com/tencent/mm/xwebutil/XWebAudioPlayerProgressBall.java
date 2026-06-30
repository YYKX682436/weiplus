package com.tencent.mm.xwebutil;

/* loaded from: classes13.dex */
public class XWebAudioPlayerProgressBall extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f214817d;

    /* renamed from: e, reason: collision with root package name */
    public float f214818e;

    /* renamed from: f, reason: collision with root package name */
    public float f214819f;

    /* renamed from: g, reason: collision with root package name */
    public float f214820g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f214821h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f214822i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f214823m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.xwebutil.y f214824n;

    public XWebAudioPlayerProgressBall(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        this.f214817d = 0;
        this.f214818e = 0.0f;
        this.f214819f = 0.0f;
        this.f214820g = 0.0f;
        this.f214821h = false;
        this.f214822i = new int[2];
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f214823m = paint;
        this.f214824n = null;
        android.content.Context context2 = getContext();
        int i17 = 8;
        if (context2 != null && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            i17 = (int) android.util.TypedValue.applyDimension(1, 8, displayMetrics);
        }
        this.f214819f = i17;
        paint.setAntiAlias(true);
        paint.setColor(-1);
    }

    public boolean a(float f17, boolean z17) {
        com.tencent.mm.xwebutil.y yVar;
        long width = this.f214817d - getWidth();
        if (width <= 0) {
            return false;
        }
        if (this.f214821h && !z17) {
            return false;
        }
        if (f17 < 0.0f) {
            this.f214818e = 0.0f;
        } else if (f17 > 1.0f) {
            this.f214818e = 1.0f;
        } else {
            this.f214818e = f17;
        }
        setTranslationX(this.f214818e * ((float) width));
        if (!z17 || (yVar = this.f214824n) == null) {
            return true;
        }
        com.tencent.mm.xwebutil.XWebAudioPlayerProgress xWebAudioPlayerProgress = (com.tencent.mm.xwebutil.XWebAudioPlayerProgress) yVar;
        xWebAudioPlayerProgress.f214810f.setText(xWebAudioPlayerProgress.a(this.f214818e * ((float) xWebAudioPlayerProgress.f214809e)));
        return true;
    }

    public int getTotalLength() {
        return this.f214817d;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.f214819f, this.f214823m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r0 != 6) goto L40;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xwebutil.XWebAudioPlayerProgressBall.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOperationCallback(com.tencent.mm.xwebutil.y yVar) {
        this.f214824n = yVar;
    }

    public void setTotalLength(int i17) {
        if (this.f214817d != i17) {
            com.tencent.mars.xlog.Log.i("XFilesAudioPlayerProgressBall", "setTotalLength " + i17);
            this.f214817d = i17;
            a(this.f214818e, false);
        }
    }

    public XWebAudioPlayerProgressBall(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        this.f214817d = 0;
        this.f214818e = 0.0f;
        this.f214819f = 0.0f;
        this.f214820g = 0.0f;
        this.f214821h = false;
        this.f214822i = new int[2];
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f214823m = paint;
        this.f214824n = null;
        android.content.Context context2 = getContext();
        int i18 = 8;
        if (context2 != null && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            i18 = (int) android.util.TypedValue.applyDimension(1, 8, displayMetrics);
        }
        this.f214819f = i18;
        paint.setAntiAlias(true);
        paint.setColor(-1);
    }
}
