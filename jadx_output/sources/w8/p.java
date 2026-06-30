package w8;

/* loaded from: classes15.dex */
public final class p implements w8.h {

    /* renamed from: a, reason: collision with root package name */
    public final w8.y f443726a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f443727b;

    /* renamed from: c, reason: collision with root package name */
    public q8.o f443728c;

    /* renamed from: d, reason: collision with root package name */
    public w8.o f443729d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f443730e;

    /* renamed from: l, reason: collision with root package name */
    public long f443737l;

    /* renamed from: m, reason: collision with root package name */
    public long f443738m;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f443731f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final w8.s f443732g = new w8.s(32, 128);

    /* renamed from: h, reason: collision with root package name */
    public final w8.s f443733h = new w8.s(33, 128);

    /* renamed from: i, reason: collision with root package name */
    public final w8.s f443734i = new w8.s(34, 128);

    /* renamed from: j, reason: collision with root package name */
    public final w8.s f443735j = new w8.s(39, 128);

    /* renamed from: k, reason: collision with root package name */
    public final w8.s f443736k = new w8.s(40, 128);

    /* renamed from: n, reason: collision with root package name */
    public final t9.p f443739n = new t9.p();

    public p(w8.y yVar) {
        this.f443726a = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03a2  */
    @Override // w8.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(t9.p r43) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.p.a(t9.p):void");
    }

    @Override // w8.h
    public void b() {
        t9.n.a(this.f443731f);
        this.f443732g.c();
        this.f443733h.c();
        this.f443734i.c();
        this.f443735j.c();
        this.f443736k.c();
        w8.o oVar = this.f443729d;
        oVar.f443718f = false;
        oVar.f443719g = false;
        oVar.f443720h = false;
        oVar.f443721i = false;
        oVar.f443722j = false;
        this.f443737l = 0L;
    }

    @Override // w8.h
    public void c() {
    }

    @Override // w8.h
    public void d(long j17, boolean z17) {
        this.f443738m = j17;
    }

    @Override // w8.h
    public void e(q8.g gVar, w8.g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f443727b = g0Var.f443645e;
        g0Var.b();
        q8.o l17 = gVar.l(g0Var.f443644d, 2);
        this.f443728c = l17;
        this.f443729d = new w8.o(l17);
        this.f443726a.a(gVar, g0Var);
    }

    public final void f(byte[] bArr, int i17, int i18) {
        if (this.f443730e) {
            w8.o oVar = this.f443729d;
            if (oVar.f443718f) {
                int i19 = oVar.f443716d;
                int i27 = (i17 + 2) - i19;
                if (i27 < i18) {
                    oVar.f443719g = (bArr[i27] & 128) != 0;
                    oVar.f443718f = false;
                } else {
                    oVar.f443716d = i19 + (i18 - i17);
                }
            }
        } else {
            this.f443732g.a(bArr, i17, i18);
            this.f443733h.a(bArr, i17, i18);
            this.f443734i.a(bArr, i17, i18);
        }
        this.f443735j.a(bArr, i17, i18);
        this.f443736k.a(bArr, i17, i18);
    }
}
