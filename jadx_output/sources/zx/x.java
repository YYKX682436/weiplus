package zx;

/* loaded from: classes5.dex */
public class x extends android.graphics.drawable.Drawable {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f476974j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f476975a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f476976b;

    /* renamed from: c, reason: collision with root package name */
    public final int f476977c;

    /* renamed from: d, reason: collision with root package name */
    public final int f476978d;

    /* renamed from: e, reason: collision with root package name */
    public final int f476979e;

    /* renamed from: f, reason: collision with root package name */
    public final int f476980f;

    /* renamed from: g, reason: collision with root package name */
    public final int f476981g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f476982h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.RectF f476983i;

    public x(int i17, int[] iArr, int i18, int i19, int i27, int i28, int i29, zx.v vVar) {
        this.f476978d = i17;
        this.f476982h = iArr;
        this.f476979e = i18;
        this.f476977c = i27;
        this.f476980f = i28;
        this.f476981g = i29;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f476975a = paint;
        paint.setColor(0);
        paint.setAntiAlias(true);
        paint.setShadowLayer(i27, i28, i29, i19);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_ATOP));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f476976b = paint2;
        paint2.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = this.f476976b;
        int[] iArr = this.f476982h;
        if (iArr != null) {
            if (iArr.length == 1) {
                paint.setColor(iArr[0]);
            } else {
                android.graphics.RectF rectF = this.f476983i;
                float f17 = rectF.left;
                float height = rectF.height() / 2.0f;
                android.graphics.RectF rectF2 = this.f476983i;
                paint.setShader(new android.graphics.LinearGradient(f17, height, rectF2.right, rectF2.height() / 2.0f, this.f476982h, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
            }
        }
        int i17 = this.f476978d;
        android.graphics.Paint paint2 = this.f476975a;
        if (i17 != 1) {
            canvas.drawCircle(this.f476983i.centerX(), this.f476983i.centerY(), java.lang.Math.min(this.f476983i.width(), this.f476983i.height()) / 2.0f, paint2);
            canvas.drawCircle(this.f476983i.centerX(), this.f476983i.centerY(), java.lang.Math.min(this.f476983i.width(), this.f476983i.height()) / 2.0f, paint);
        } else {
            android.graphics.RectF rectF3 = this.f476983i;
            int i18 = this.f476979e;
            canvas.drawRoundRect(rectF3, i18, i18, paint2);
            canvas.drawRoundRect(this.f476983i, i18, i18, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f476975a.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i17, int i18, int i19, int i27) {
        super.setBounds(i17, i18, i19, i27);
        int i28 = this.f476977c;
        int i29 = this.f476980f;
        int i37 = this.f476981g;
        this.f476983i = new android.graphics.RectF((i17 + i28) - i29, (i18 + i28) - i37, (i19 - i28) - i29, (i27 - i28) - i37);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f476975a.setColorFilter(colorFilter);
    }
}
