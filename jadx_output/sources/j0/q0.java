package j0;

/* loaded from: classes14.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f296501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a2.o1 f296502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0.u4 f296503f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g2.e0 f296504g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g2.t0 f296505h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z0.t f296506i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z0.t f296507m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z0.t f296508n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ z0.t f296509o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g0.f f296510p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f296511q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f296512r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f296513s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f296514t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ yz5.l f296515u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(int i17, a2.o1 o1Var, j0.u4 u4Var, g2.e0 e0Var, g2.t0 t0Var, z0.t tVar, z0.t tVar2, z0.t tVar3, z0.t tVar4, g0.f fVar, j0.c5 c5Var, k0.y0 y0Var, boolean z17, boolean z18, yz5.l lVar) {
        super(2);
        this.f296501d = i17;
        this.f296502e = o1Var;
        this.f296503f = u4Var;
        this.f296504g = e0Var;
        this.f296505h = t0Var;
        this.f296506i = tVar;
        this.f296507m = tVar2;
        this.f296508n = tVar3;
        this.f296509o = tVar4;
        this.f296510p = fVar;
        this.f296511q = c5Var;
        this.f296512r = y0Var;
        this.f296513s = z17;
        this.f296514t = z18;
        this.f296515u = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        z0.t j5Var;
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        z0.p pVar = z0.p.f468921d;
        a2.o1 textStyle = this.f296502e;
        kotlin.jvm.internal.o.g(textStyle, "textStyle");
        androidx.compose.ui.platform.e3 e3Var = androidx.compose.ui.platform.e3.f10553d;
        z0.t a17 = z0.m.a(pVar, e3Var, new j0.z2(this.f296501d, textStyle));
        j0.p0 p0Var = new j0.p0(this.f296511q);
        kotlin.jvm.internal.o.g(a17, "<this>");
        j0.u4 scrollerPosition = this.f296503f;
        kotlin.jvm.internal.o.g(scrollerPosition, "scrollerPosition");
        g2.e0 textFieldValue = this.f296504g;
        kotlin.jvm.internal.o.g(textFieldValue, "textFieldValue");
        g2.t0 visualTransformation = this.f296505h;
        kotlin.jvm.internal.o.g(visualTransformation, "visualTransformation");
        b0.y1 y1Var = (b0.y1) ((n0.q4) scrollerPosition.f296587e).getValue();
        int i17 = a2.m1.f782c;
        long j17 = textFieldValue.f267694b;
        int i18 = (int) (j17 >> 32);
        if (i18 == ((int) (scrollerPosition.f296586d >> 32))) {
            i18 = a2.m1.c(j17) != a2.m1.c(scrollerPosition.f296586d) ? a2.m1.c(j17) : a2.m1.f(j17);
        }
        scrollerPosition.f296586d = j17;
        a2.d text = textFieldValue.f267693a;
        kotlin.jvm.internal.o.g(text, "text");
        g2.r0 r0Var = new g2.r0(text, g2.u.f267748a);
        int ordinal = y1Var.ordinal();
        if (ordinal == 0) {
            j5Var = new j0.j5(scrollerPosition, i18, r0Var, p0Var);
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            j5Var = new j0.x1(scrollerPosition, i18, r0Var, p0Var);
        }
        z0.t k17 = b1.d.b(a17).k(j5Var).k(this.f296506i).k(this.f296507m);
        kotlin.jvm.internal.o.g(k17, "<this>");
        z0.t k18 = z0.m.b(k17, null, new j0.y4(textStyle), 1, null).k(this.f296508n).k(this.f296509o);
        kotlin.jvm.internal.o.g(k18, "<this>");
        g0.f bringIntoViewRequester = this.f296510p;
        kotlin.jvm.internal.o.g(bringIntoViewRequester, "bringIntoViewRequester");
        k0.o0.a(z0.m.a(k18, e3Var, new g0.k(bringIntoViewRequester)), u0.j.b(oVar, 19580180, true, new j0.o0(this.f296512r, this.f296511q, this.f296513s, this.f296514t, this.f296515u)), oVar, 48, 0);
        return jz5.f0.f302826a;
    }
}
