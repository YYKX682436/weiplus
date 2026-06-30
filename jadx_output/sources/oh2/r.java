package oh2;

/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f345410a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f345411b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f345412c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f345413d;

    /* renamed from: e, reason: collision with root package name */
    public final float f345414e;

    /* renamed from: f, reason: collision with root package name */
    public final float f345415f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f345416g;

    /* renamed from: h, reason: collision with root package name */
    public oh2.i f345417h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f345418i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Paint f345419j;

    /* renamed from: k, reason: collision with root package name */
    public final float f345420k;

    /* renamed from: l, reason: collision with root package name */
    public int f345421l;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Rect f345422m;

    /* renamed from: n, reason: collision with root package name */
    public int f345423n;

    /* renamed from: o, reason: collision with root package name */
    public final float f345424o;

    /* renamed from: p, reason: collision with root package name */
    public final float f345425p;

    /* renamed from: q, reason: collision with root package name */
    public final int f345426q;

    /* renamed from: r, reason: collision with root package name */
    public int f345427r;

    public r(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f345410a = context;
        this.f345411b = java.util.Collections.synchronizedList(new java.util.LinkedList());
        this.f345412c = new java.util.LinkedHashMap();
        this.f345413d = new java.util.LinkedHashMap();
        float a17 = a(4.0f);
        this.f345414e = a17;
        this.f345415f = a(4.0f);
        this.f345416g = new java.util.ArrayList();
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(android.graphics.Color.parseColor("#4DFFFFFF"));
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(a17);
        paint.setAntiAlias(true);
        this.f345418i = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setColor(android.graphics.Color.parseColor("#17ABFE"));
        paint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeWidth(a17);
        paint2.setAntiAlias(true);
        this.f345419j = paint2;
        this.f345420k = a(100.0f) / 1000.0f;
        this.f345422m = new android.graphics.Rect();
        this.f345423n = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        this.f345424o = a(48.0f);
        a(40.0f);
        a(40.0f);
        this.f345425p = 0.1f;
        this.f345426q = 100;
    }

    public final float a(float f17) {
        return i65.a.a(this.f345410a, f17);
    }
}
