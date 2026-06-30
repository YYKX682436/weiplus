package ox1;

/* loaded from: classes12.dex */
public class b extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f349569d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.RectF f349570e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f349571f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.RectF f349572g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.RectF f349573h;

    /* renamed from: i, reason: collision with root package name */
    public final int f349574i;

    /* renamed from: m, reason: collision with root package name */
    public final int f349575m;

    /* renamed from: n, reason: collision with root package name */
    public final int f349576n;

    /* renamed from: o, reason: collision with root package name */
    public final int f349577o;

    /* renamed from: p, reason: collision with root package name */
    public final int f349578p;

    /* renamed from: q, reason: collision with root package name */
    public final int f349579q;

    /* renamed from: r, reason: collision with root package name */
    public final ox1.a f349580r;

    public b(android.content.Context context, int i17, int i18, int i19, int i27, ox1.a aVar) {
        super(context);
        this.f349579q = 2;
        this.f349579q = i17;
        this.f349575m = i18;
        this.f349576n = i19;
        int i28 = (i18 * 2) / 5;
        this.f349574i = i28;
        this.f349577o = i28;
        this.f349578p = (i28 * 3) / 4;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f349569d = paint;
        paint.setColor(i27);
        this.f349580r = aVar;
        this.f349570e = new android.graphics.RectF(i28, i18, (i28 * 2) + i28, (i28 * 2) + i18);
        this.f349571f = new android.graphics.RectF(r0 - i28, i18, r0 + i28, (i28 * 2) + i18);
        this.f349572g = new android.graphics.RectF(i28, i18, (i28 * 2) + i28, (i28 * 2) + i18);
        this.f349573h = new android.graphics.RectF(i28 + i19, i18, i19 + i28 + (i28 * 2), i18 + (i28 * 2));
    }

    public int getOffsetForCursorMid() {
        return this.f349577o + this.f349574i + 1;
    }

    public int getType() {
        return this.f349579q;
    }

    public int getViewHeight() {
        return this.f349575m + (this.f349574i * 2) + this.f349577o;
    }

    public int getViewPadding() {
        return this.f349577o;
    }

    public int getViewWidth() {
        int i17 = this.f349574i;
        int i18 = this.f349577o;
        int i19 = this.f349579q;
        if (i19 == 3 || i19 == 4) {
            return i18 + i17 + this.f349578p;
        }
        return this.f349576n + ((i18 + i17) * 2);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17 = this.f349576n;
        int i18 = this.f349577o;
        int i19 = this.f349574i;
        int i27 = this.f349575m;
        android.graphics.Paint paint = this.f349569d;
        int i28 = this.f349579q;
        if (i28 == 2) {
            canvas.drawRect(i18 + i19, 0.0f, i18 + i19 + i17, i27 + (i19 * 2), paint);
            canvas.drawArc(this.f349572g, 90.0f, 180.0f, true, paint);
            canvas.drawArc(this.f349573h, 270.0f, 180.0f, true, paint);
            return;
        }
        int i29 = this.f349578p;
        if (i28 == 3) {
            canvas.drawRect(((i18 + i19) + i29) - i17, 0.0f, i18 + i19 + i29, i27, paint);
            canvas.drawArc(this.f349570e, 90.0f, 180.0f, true, paint);
            canvas.drawRect(i18 + i19, i27, i18 + i19 + i29, i27 + (i19 * 2), paint);
        } else {
            if (i28 != 4) {
                return;
            }
            canvas.drawRect(0.0f, 0.0f, i17, i27, paint);
            canvas.drawRect(0.0f, i27, i29, i27 + (i19 * 2), paint);
            canvas.drawArc(this.f349571f, 270.0f, 180.0f, true, paint);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (r2 != 3) goto L50;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox1.b.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
