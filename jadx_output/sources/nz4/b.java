package nz4;

/* loaded from: classes12.dex */
public class b extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f341584d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.RectF f341585e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f341586f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.RectF f341587g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.RectF f341588h;

    /* renamed from: i, reason: collision with root package name */
    public final int f341589i;

    /* renamed from: m, reason: collision with root package name */
    public final int f341590m;

    /* renamed from: n, reason: collision with root package name */
    public final int f341591n;

    /* renamed from: o, reason: collision with root package name */
    public final int f341592o;

    /* renamed from: p, reason: collision with root package name */
    public final int f341593p;

    /* renamed from: q, reason: collision with root package name */
    public final int f341594q;

    /* renamed from: r, reason: collision with root package name */
    public final nz4.a f341595r;

    public b(android.content.Context context, int i17, int i18, int i19, int i27, nz4.a aVar) {
        super(context);
        this.f341594q = 2;
        this.f341594q = i17;
        this.f341590m = i18;
        this.f341591n = i19;
        int i28 = (i18 * 2) / 5;
        this.f341589i = i28;
        this.f341592o = i28;
        this.f341593p = (i28 * 3) / 4;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f341584d = paint;
        paint.setColor(i27);
        this.f341595r = aVar;
        this.f341585e = new android.graphics.RectF(i28, i18, (i28 * 2) + i28, (i28 * 2) + i18);
        this.f341586f = new android.graphics.RectF(r0 - i28, i18, r0 + i28, (i28 * 2) + i18);
        this.f341587g = new android.graphics.RectF(i28, i18, (i28 * 2) + i28, (i28 * 2) + i18);
        this.f341588h = new android.graphics.RectF(i28 + i19, i18, i19 + i28 + (i28 * 2), i18 + (i28 * 2));
    }

    public int getOffsetForCursorMid() {
        return this.f341592o + this.f341589i + 1;
    }

    public int getType() {
        return this.f341594q;
    }

    public int getViewHeight() {
        return this.f341590m + (this.f341589i * 2) + this.f341592o;
    }

    public int getViewPadding() {
        return this.f341592o;
    }

    public int getViewWidth() {
        int i17 = this.f341589i;
        int i18 = this.f341592o;
        int i19 = this.f341594q;
        if (i19 == 3 || i19 == 4) {
            return i18 + i17 + this.f341593p;
        }
        return this.f341591n + ((i18 + i17) * 2);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17 = this.f341591n;
        int i18 = this.f341592o;
        int i19 = this.f341589i;
        int i27 = this.f341590m;
        android.graphics.Paint paint = this.f341584d;
        int i28 = this.f341594q;
        if (i28 == 2) {
            canvas.drawRect(i18 + i19, 0.0f, i18 + i19 + i17, i27 + (i19 * 2), paint);
            canvas.drawArc(this.f341587g, 90.0f, 180.0f, true, paint);
            canvas.drawArc(this.f341588h, 270.0f, 180.0f, true, paint);
            return;
        }
        int i29 = this.f341593p;
        if (i28 == 3) {
            canvas.drawRect(((i18 + i19) + i29) - i17, 0.0f, i18 + i19 + i29, i27, paint);
            canvas.drawArc(this.f341585e, 90.0f, 180.0f, true, paint);
            canvas.drawRect(i18 + i19, i27, i18 + i19 + i29, i27 + (i19 * 2), paint);
        } else {
            if (i28 != 4) {
                return;
            }
            canvas.drawRect(0.0f, 0.0f, i17, i27, paint);
            canvas.drawRect(0.0f, i27, i29, i27 + (i19 * 2), paint);
            canvas.drawArc(this.f341586f, 270.0f, 180.0f, true, paint);
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
        throw new UnsupportedOperationException("Method not decompiled: nz4.b.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
