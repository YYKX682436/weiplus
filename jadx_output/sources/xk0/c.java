package xk0;

/* loaded from: classes10.dex */
public class c implements java.lang.Cloneable {

    /* renamed from: i, reason: collision with root package name */
    public static final float f454921i;

    /* renamed from: m, reason: collision with root package name */
    public static final float f454922m;

    /* renamed from: n, reason: collision with root package name */
    public static final android.graphics.Path f454923n;

    /* renamed from: o, reason: collision with root package name */
    public static final android.graphics.Path f454924o;

    /* renamed from: p, reason: collision with root package name */
    public static final android.graphics.Paint f454925p;

    /* renamed from: q, reason: collision with root package name */
    public static final android.graphics.Paint f454926q;

    /* renamed from: r, reason: collision with root package name */
    public static final android.graphics.Paint f454927r;

    /* renamed from: s, reason: collision with root package name */
    public static final android.graphics.Paint f454928s;

    /* renamed from: t, reason: collision with root package name */
    public static final android.graphics.Paint f454929t;

    /* renamed from: u, reason: collision with root package name */
    public static final android.graphics.Rect f454930u;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Rect f454931d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f454932e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Matrix f454933f;

    /* renamed from: g, reason: collision with root package name */
    public int f454934g;

    /* renamed from: h, reason: collision with root package name */
    public int f454935h;

    static {
        int dimension = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f480148pn);
        int dimension2 = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f480147pm);
        float dimension3 = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f480256sp);
        f454921i = dimension3;
        f454922m = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f480255so);
        f454923n = new android.graphics.Path();
        f454924o = new android.graphics.Path();
        android.graphics.Paint paint = new android.graphics.Paint();
        f454925p = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        f454926q = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        f454927r = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        f454928s = paint4;
        android.graphics.Paint paint5 = new android.graphics.Paint();
        f454929t = paint5;
        f454930u = new android.graphics.Rect();
        paint3.setColor(-16777216);
        paint.setColor(-1);
        paint.setStrokeWidth(dimension);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint4.set(paint);
        paint4.setStrokeWidth(dimension2);
        paint5.set(paint);
        paint5.setStrokeWidth(dimension3);
        paint2.set(paint);
        paint2.setStrokeWidth(dimension * 7);
        paint2.setColor(549174203);
    }

    public c(android.graphics.Rect rect) {
        new android.graphics.Rect();
        this.f454932e = new android.graphics.Rect();
        this.f454933f = new android.graphics.Matrix();
        this.f454934g = 1;
        this.f454935h = 1;
        this.f454931d = rect;
    }

    public java.lang.Object clone() {
        return super.clone();
    }

    public c() {
        new android.graphics.Rect();
        this.f454932e = new android.graphics.Rect();
        this.f454933f = new android.graphics.Matrix();
        this.f454934g = 1;
        this.f454935h = 1;
    }
}
