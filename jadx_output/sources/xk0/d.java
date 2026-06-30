package xk0;

/* loaded from: classes10.dex */
public class d implements java.lang.Cloneable {

    /* renamed from: o, reason: collision with root package name */
    public static final android.graphics.Paint f454936o;

    /* renamed from: p, reason: collision with root package name */
    public static final android.graphics.Paint f454937p;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Path f454938d;

    /* renamed from: e, reason: collision with root package name */
    public final int f454939e;

    /* renamed from: f, reason: collision with root package name */
    public final float f454940f;

    /* renamed from: g, reason: collision with root package name */
    public final float f454941g = cm5.h.b(5.0f);

    /* renamed from: h, reason: collision with root package name */
    public final float f454942h = cm5.h.b(9.0f);

    /* renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f454943i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f454944m = false;

    /* renamed from: n, reason: collision with root package name */
    public long f454945n;

    static {
        android.graphics.Paint paint = new android.graphics.Paint();
        f454936o = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        f454937p = paint2;
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint2.setColor(-1);
    }

    public d(android.graphics.Path path, float f17, int i17) {
        this.f454940f = 1.0f;
        this.f454938d = path;
        this.f454940f = f17;
        this.f454939e = i17;
    }

    public void a(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = f454936o;
        paint.setColor(this.f454939e);
        float f17 = this.f454941g;
        float f18 = this.f454940f;
        paint.setStrokeWidth(f17 * f18);
        android.graphics.Paint paint2 = f454937p;
        paint2.setStrokeWidth(this.f454942h * f18);
        boolean z17 = this.f454944m;
        android.graphics.Path path = this.f454938d;
        if (z17) {
            paint.setAlpha(150);
            canvas.drawPath(path, paint2);
        } else {
            paint.setAlpha(255);
        }
        if (path.isEmpty()) {
            return;
        }
        canvas.drawPath(path, paint);
    }
}
