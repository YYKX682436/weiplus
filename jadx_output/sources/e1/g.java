package e1;

/* loaded from: classes13.dex */
public final class g implements e1.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f246254a = new android.graphics.Paint(7);

    /* renamed from: b, reason: collision with root package name */
    public int f246255b = 3;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Shader f246256c;

    /* renamed from: d, reason: collision with root package name */
    public e1.z f246257d;

    public int a() {
        android.graphics.Paint paint = this.f246254a;
        kotlin.jvm.internal.o.g(paint, "<this>");
        android.graphics.Paint.Cap strokeCap = paint.getStrokeCap();
        int i17 = strokeCap == null ? -1 : e1.h.f246260a[strokeCap.ordinal()];
        if (i17 != 1) {
            if (i17 == 2) {
                return 1;
            }
            if (i17 == 3) {
                return 2;
            }
        }
        return 0;
    }

    public int b() {
        android.graphics.Paint paint = this.f246254a;
        kotlin.jvm.internal.o.g(paint, "<this>");
        android.graphics.Paint.Join strokeJoin = paint.getStrokeJoin();
        int i17 = strokeJoin == null ? -1 : e1.h.f246261b[strokeJoin.ordinal()];
        if (i17 != 1) {
            if (i17 == 2) {
                return 2;
            }
            if (i17 == 3) {
                return 1;
            }
        }
        return 0;
    }

    public void c(float f17) {
        android.graphics.Paint paint = this.f246254a;
        kotlin.jvm.internal.o.g(paint, "<this>");
        paint.setAlpha((int) java.lang.Math.rint(f17 * 255.0f));
    }

    public void d(int i17) {
        this.f246255b = i17;
        android.graphics.Paint setNativeBlendMode = this.f246254a;
        kotlin.jvm.internal.o.g(setNativeBlendMode, "$this$setNativeBlendMode");
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            e1.j1.f246276a.a(setNativeBlendMode, i17);
        } else {
            setNativeBlendMode.setXfermode(new android.graphics.PorterDuffXfermode(e1.a.b(i17)));
        }
    }

    public void e(long j17) {
        android.graphics.Paint setNativeColor = this.f246254a;
        kotlin.jvm.internal.o.g(setNativeColor, "$this$setNativeColor");
        setNativeColor.setColor(e1.a0.h(j17));
    }

    public void f(e1.z zVar) {
        this.f246257d = zVar;
        android.graphics.Paint paint = this.f246254a;
        kotlin.jvm.internal.o.g(paint, "<this>");
        paint.setColorFilter(zVar != null ? zVar.f246325a : null);
    }

    public void g(int i17) {
        android.graphics.Paint setNativeFilterQuality = this.f246254a;
        kotlin.jvm.internal.o.g(setNativeFilterQuality, "$this$setNativeFilterQuality");
        setNativeFilterQuality.setFilterBitmap(!(i17 == 0));
    }

    public void h(android.graphics.Shader shader) {
        this.f246256c = shader;
        android.graphics.Paint paint = this.f246254a;
        kotlin.jvm.internal.o.g(paint, "<this>");
        paint.setShader(shader);
    }

    public void i(int i17) {
        android.graphics.Paint.Cap cap;
        android.graphics.Paint setNativeStrokeCap = this.f246254a;
        kotlin.jvm.internal.o.g(setNativeStrokeCap, "$this$setNativeStrokeCap");
        if (i17 == 2) {
            cap = android.graphics.Paint.Cap.SQUARE;
        } else {
            if (i17 == 1) {
                cap = android.graphics.Paint.Cap.ROUND;
            } else {
                cap = i17 == 0 ? android.graphics.Paint.Cap.BUTT : android.graphics.Paint.Cap.BUTT;
            }
        }
        setNativeStrokeCap.setStrokeCap(cap);
    }

    public void j(int i17) {
        android.graphics.Paint.Join join;
        android.graphics.Paint setNativeStrokeJoin = this.f246254a;
        kotlin.jvm.internal.o.g(setNativeStrokeJoin, "$this$setNativeStrokeJoin");
        if (i17 == 0) {
            join = android.graphics.Paint.Join.MITER;
        } else {
            if (i17 == 2) {
                join = android.graphics.Paint.Join.BEVEL;
            } else {
                join = i17 == 1 ? android.graphics.Paint.Join.ROUND : android.graphics.Paint.Join.MITER;
            }
        }
        setNativeStrokeJoin.setStrokeJoin(join);
    }

    public void k(float f17) {
        android.graphics.Paint paint = this.f246254a;
        kotlin.jvm.internal.o.g(paint, "<this>");
        paint.setStrokeWidth(f17);
    }

    public void l(int i17) {
        android.graphics.Paint setNativeStyle = this.f246254a;
        kotlin.jvm.internal.o.g(setNativeStyle, "$this$setNativeStyle");
        setNativeStyle.setStyle(i17 == 1 ? android.graphics.Paint.Style.STROKE : android.graphics.Paint.Style.FILL);
    }
}
