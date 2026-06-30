package i2;

/* loaded from: classes14.dex */
public final class f extends android.text.TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public l2.g f287861a;

    /* renamed from: b, reason: collision with root package name */
    public e1.z0 f287862b;

    /* renamed from: c, reason: collision with root package name */
    public e1.r f287863c;

    /* renamed from: d, reason: collision with root package name */
    public d1.k f287864d;

    public f(int i17, float f17) {
        super(i17);
        ((android.text.TextPaint) this).density = f17;
        this.f287861a = l2.g.f315117b;
        e1.z0 z0Var = e1.z0.f246326d;
        this.f287862b = e1.z0.f246326d;
    }

    public final void a(e1.r rVar, long j17) {
        if (rVar == null) {
            setShader(null);
            return;
        }
        if (kotlin.jvm.internal.o.b(this.f287863c, rVar)) {
            d1.k kVar = this.f287864d;
            if (kVar == null ? false : d1.k.a(kVar.f225644a, j17)) {
                return;
            }
        }
        this.f287863c = rVar;
        this.f287864d = new d1.k(j17);
        if (rVar instanceof e1.e1) {
            setShader(null);
            b(((e1.e1) rVar).f246251b);
        } else if (rVar instanceof e1.y0) {
            int i17 = d1.k.f225643d;
            if (j17 != d1.k.f225642c) {
                setShader(((e1.y0) rVar).b(j17));
            }
        }
    }

    public final void b(long j17) {
        int h17;
        int i17 = e1.y.f246321l;
        if (!(j17 != e1.y.f246320k) || getColor() == (h17 = e1.a0.h(j17))) {
            return;
        }
        setColor(h17);
    }

    public final void c(e1.z0 z0Var) {
        if (z0Var == null) {
            e1.z0 z0Var2 = e1.z0.f246326d;
            z0Var = e1.z0.f246326d;
        }
        if (kotlin.jvm.internal.o.b(this.f287862b, z0Var)) {
            return;
        }
        this.f287862b = z0Var;
        e1.z0 z0Var3 = e1.z0.f246326d;
        if (kotlin.jvm.internal.o.b(z0Var, e1.z0.f246326d)) {
            clearShadowLayer();
        } else {
            e1.z0 z0Var4 = this.f287862b;
            setShadowLayer(z0Var4.f246329c, d1.e.c(z0Var4.f246328b), d1.e.d(this.f287862b.f246328b), e1.a0.h(this.f287862b.f246327a));
        }
    }

    public final void d(l2.g gVar) {
        if (gVar == null) {
            gVar = l2.g.f315117b;
        }
        if (kotlin.jvm.internal.o.b(this.f287861a, gVar)) {
            return;
        }
        this.f287861a = gVar;
        setUnderlineText(gVar.a(l2.g.f315118c));
        setStrikeThruText(this.f287861a.a(l2.g.f315119d));
    }
}
