package rp1;

/* loaded from: classes14.dex */
public class n2 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f398487d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f398488e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f398489f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Path f398490g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Rect f398491h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.RectF f398492i;

    /* renamed from: m, reason: collision with root package name */
    public int f398493m;

    /* renamed from: n, reason: collision with root package name */
    public int f398494n;

    /* renamed from: o, reason: collision with root package name */
    public int f398495o;

    /* renamed from: p, reason: collision with root package name */
    public int f398496p;

    /* renamed from: q, reason: collision with root package name */
    public int f398497q;

    /* renamed from: r, reason: collision with root package name */
    public int f398498r;

    /* renamed from: s, reason: collision with root package name */
    public int f398499s;

    /* renamed from: t, reason: collision with root package name */
    public int f398500t;

    /* renamed from: u, reason: collision with root package name */
    public int f398501u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f398502v;

    /* renamed from: w, reason: collision with root package name */
    public int f398503w;

    /* renamed from: x, reason: collision with root package name */
    public android.animation.AnimatorListenerAdapter f398504x;

    public n2(android.content.Context context, android.graphics.Bitmap bitmap) {
        super(context);
        this.f398501u = -1;
        this.f398488e = new android.graphics.Paint();
        this.f398490g = new android.graphics.Path();
        this.f398489f = new android.graphics.Paint();
        this.f398489f.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        this.f398487d = bitmap;
        this.f398499s = bitmap.getWidth();
        this.f398500t = bitmap.getHeight();
        this.f398491h = new android.graphics.Rect(0, 0, this.f398499s, this.f398500t);
        android.graphics.RectF rectF = new android.graphics.RectF();
        this.f398492i = rectF;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        int i17 = this.f398499s;
        rectF.right = i17;
        rectF.bottom = this.f398500t;
        com.tencent.mars.xlog.Log.i("MicroMsg.TransformToFloatBallAnimationMaskView", java.lang.String.format("init: mWidth:%d mHeight:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f398500t)));
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (this.f398502v) {
            canvas.translate(this.f398493m, 0.0f);
        }
        this.f398490g.reset();
        android.graphics.Path path = this.f398490g;
        android.graphics.RectF rectF = this.f398492i;
        int i17 = this.f398494n;
        path.addRoundRect(rectF, i17, i17, android.graphics.Path.Direction.CW);
        canvas.clipPath(this.f398490g);
        android.graphics.Bitmap bitmap = this.f398487d;
        android.graphics.Rect rect = this.f398491h;
        canvas.drawBitmap(bitmap, rect, rect, this.f398488e);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(this.f398499s, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.f398500t, 1073741824));
    }

    public void setContentStartPosX(int i17) {
        this.f398501u = i17;
    }

    public void setListener(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.f398504x = animatorListenerAdapter;
    }
}
