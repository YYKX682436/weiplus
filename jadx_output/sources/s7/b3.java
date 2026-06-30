package s7;

/* loaded from: classes16.dex */
public class b3 {

    /* renamed from: a, reason: collision with root package name */
    public final s7.r1 f403594a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f403595b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f403596c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f403597d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f403598e;

    /* renamed from: f, reason: collision with root package name */
    public s7.f0 f403599f;

    /* renamed from: g, reason: collision with root package name */
    public s7.f0 f403600g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f403601h;

    public b3(s7.f3 f3Var) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f403597d = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setTypeface(android.graphics.Typeface.DEFAULT);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f403598e = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setTypeface(android.graphics.Typeface.DEFAULT);
        this.f403594a = s7.r1.a();
    }

    public b3(s7.f3 f3Var, s7.b3 b3Var) {
        this.f403595b = b3Var.f403595b;
        this.f403596c = b3Var.f403596c;
        this.f403597d = new android.graphics.Paint(b3Var.f403597d);
        this.f403598e = new android.graphics.Paint(b3Var.f403598e);
        s7.f0 f0Var = b3Var.f403599f;
        if (f0Var != null) {
            this.f403599f = new s7.f0(f0Var);
        }
        s7.f0 f0Var2 = b3Var.f403600g;
        if (f0Var2 != null) {
            this.f403600g = new s7.f0(f0Var2);
        }
        this.f403601h = b3Var.f403601h;
        try {
            this.f403594a = (s7.r1) b3Var.f403594a.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            this.f403594a = s7.r1.a();
        }
    }
}
