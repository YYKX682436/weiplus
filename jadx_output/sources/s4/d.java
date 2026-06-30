package s4;

/* loaded from: classes15.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.RectF f402851a = new android.graphics.RectF();

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f402852b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Paint f402853c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f402854d;

    /* renamed from: e, reason: collision with root package name */
    public float f402855e;

    /* renamed from: f, reason: collision with root package name */
    public float f402856f;

    /* renamed from: g, reason: collision with root package name */
    public float f402857g;

    /* renamed from: h, reason: collision with root package name */
    public float f402858h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f402859i;

    /* renamed from: j, reason: collision with root package name */
    public int f402860j;

    /* renamed from: k, reason: collision with root package name */
    public float f402861k;

    /* renamed from: l, reason: collision with root package name */
    public float f402862l;

    /* renamed from: m, reason: collision with root package name */
    public float f402863m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f402864n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Path f402865o;

    /* renamed from: p, reason: collision with root package name */
    public float f402866p;

    /* renamed from: q, reason: collision with root package name */
    public float f402867q;

    /* renamed from: r, reason: collision with root package name */
    public int f402868r;

    /* renamed from: s, reason: collision with root package name */
    public int f402869s;

    /* renamed from: t, reason: collision with root package name */
    public int f402870t;

    /* renamed from: u, reason: collision with root package name */
    public int f402871u;

    public d() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f402852b = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f402853c = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f402854d = paint3;
        this.f402855e = 0.0f;
        this.f402856f = 0.0f;
        this.f402857g = 0.0f;
        this.f402858h = 5.0f;
        this.f402866p = 1.0f;
        this.f402870t = 255;
        paint.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public void a(int i17) {
        this.f402860j = i17;
        this.f402871u = this.f402859i[i17];
    }
}
