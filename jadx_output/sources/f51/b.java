package f51;

/* loaded from: classes11.dex */
public abstract class b {
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public android.view.VelocityTracker E;
    public float F;
    public float G;
    public float H;
    public float I;

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Matrix f259597a = new android.graphics.Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f259598b = new android.graphics.Paint(1);

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Rect f259599c;

    /* renamed from: d, reason: collision with root package name */
    public long f259600d;

    /* renamed from: e, reason: collision with root package name */
    public float f259601e;

    /* renamed from: f, reason: collision with root package name */
    public float f259602f;

    /* renamed from: g, reason: collision with root package name */
    public float f259603g;

    /* renamed from: h, reason: collision with root package name */
    public float f259604h;

    /* renamed from: i, reason: collision with root package name */
    public float f259605i;

    /* renamed from: j, reason: collision with root package name */
    public float f259606j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Float f259607k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Float f259608l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Long f259609m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Long f259610n;

    /* renamed from: o, reason: collision with root package name */
    public float f259611o;

    /* renamed from: p, reason: collision with root package name */
    public float f259612p;

    /* renamed from: q, reason: collision with root package name */
    public float f259613q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Float f259614r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Long f259615s;

    /* renamed from: t, reason: collision with root package name */
    public long f259616t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.animation.Interpolator f259617u;

    /* renamed from: v, reason: collision with root package name */
    public float f259618v;

    /* renamed from: w, reason: collision with root package name */
    public float f259619w;

    /* renamed from: x, reason: collision with root package name */
    public float f259620x;

    /* renamed from: y, reason: collision with root package name */
    public float f259621y;

    /* renamed from: z, reason: collision with root package name */
    public float f259622z;

    public static long a(float f17, float f18, float f19, java.lang.Long l17, java.lang.Float f27, int i17, int i18) {
        if (f19 == 0.0f) {
            if (l17 != null) {
                f18 = f27.floatValue();
            }
            if (f18 > 0.0f) {
                i17 = i18;
            }
            if (f18 == 0.0f) {
                return com.tencent.wcdb.core.Database.DictDefaultMatchValue;
            }
            double d17 = (i17 - f17) / f18;
            return d17 > 0.0d ? (long) d17 : com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        }
        if (f19 > 0.0f) {
            i17 = i18;
        }
        if (l17 != null && l17.longValue() >= 0) {
            double longValue = ((((i17 - f17) - (f18 * ((float) l17.longValue()))) - (((f19 * 0.5d) * l17.longValue()) * l17.longValue())) + (f27.floatValue() * ((float) l17.longValue()))) / f27.floatValue();
            return longValue > 0.0d ? (long) longValue : com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        }
        float f28 = 2.0f * f19;
        double sqrt = java.lang.Math.sqrt(((i17 * f28) - (f28 * f17)) + (f18 * f18));
        double d18 = f18;
        double d19 = f19;
        double d27 = ((-sqrt) - d18) / d19;
        if (d27 > 0.0d) {
            return (long) d27;
        }
        double d28 = (sqrt - d18) / d19;
        return d28 > 0.0d ? (long) d28 : com.tencent.wcdb.core.Database.DictDefaultMatchValue;
    }

    public static java.lang.Long c(java.lang.Float f17, float f18, float f19) {
        if (f17 != null) {
            if (f19 != 0.0f) {
                long floatValue = (f17.floatValue() - f18) / f19;
                return java.lang.Long.valueOf(floatValue > 0 ? floatValue : 0L);
            }
            if (f17.floatValue() < f18) {
                return 0L;
            }
        }
        return null;
    }

    public final float b(long j17, float f17, float f18, float f19, java.lang.Long l17, java.lang.Float f27) {
        if (l17 != null && j17 >= l17.longValue()) {
            return f17 + (f18 * ((float) l17.longValue())) + (f19 * 0.5f * ((float) l17.longValue()) * ((float) l17.longValue())) + (((float) (j17 - l17.longValue())) * f27.floatValue());
        }
        float f28 = (float) j17;
        return f17 + (f18 * f28) + (f19 * 0.5f * f28 * f28);
    }

    public final void d(android.graphics.Canvas canvas, float f17, float f18, float f19, float f27) {
        canvas.save();
        canvas.clipRect(this.f259599c);
        android.graphics.Matrix matrix = this.f259597a;
        matrix.reset();
        android.graphics.Paint paint = this.f259598b;
        paint.setAlpha(this.A);
        e(canvas, matrix, paint, f17, f18, f19, f27);
        canvas.restore();
    }

    public abstract void e(android.graphics.Canvas canvas, android.graphics.Matrix matrix, android.graphics.Paint paint, float f17, float f18, float f19, float f27);

    public abstract int f();

    public abstract int g();

    public void h(android.graphics.Rect rect) {
        this.f259599c = rect;
        this.f259609m = c(this.f259607k, this.f259603g, this.f259605i);
        this.f259610n = c(this.f259608l, this.f259604h, this.f259606j);
        this.f259615s = c(this.f259614r, this.f259612p, this.f259613q);
        if (this.f259618v == 0.0f) {
            long j17 = this.f259616t;
            this.f259618v = j17 >= 0 ? (float) j17 : 9.223372E18f;
            this.f259618v = java.lang.Math.min((float) a(this.f259601e, this.f259603g, this.f259605i, this.f259609m, this.f259607k, rect.left - g(), rect.right), this.f259618v);
            this.f259618v = java.lang.Math.min((float) a(this.f259602f, this.f259604h, this.f259606j, this.f259610n, this.f259608l, rect.top - f(), rect.bottom), this.f259618v);
        }
        this.f259598b.setAlpha(this.A);
    }

    public void i() {
        this.f259600d = 0L;
        this.f259602f = 0.0f;
        this.f259601e = 0.0f;
        this.f259604h = 0.0f;
        this.f259603g = 0.0f;
        this.f259606j = 0.0f;
        this.f259605i = 0.0f;
        this.f259608l = null;
        this.f259607k = null;
        this.f259610n = null;
        this.f259609m = null;
        this.f259611o = 0.0f;
        this.f259612p = 0.0f;
        this.f259613q = 0.0f;
        this.f259614r = null;
        this.f259615s = null;
        this.f259616t = 0L;
        this.f259618v = 0.0f;
        this.f259619w = 0.0f;
        this.f259617u = null;
        this.f259621y = 0.0f;
        this.f259620x = 0.0f;
        this.f259622z = 0.0f;
        this.A = 255;
        this.B = false;
        this.C = false;
    }
}
