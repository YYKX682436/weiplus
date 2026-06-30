package z25;

/* loaded from: classes12.dex */
public class d implements z25.k, p25.e {

    /* renamed from: a, reason: collision with root package name */
    public z25.a f469776a;

    /* renamed from: b, reason: collision with root package name */
    public z25.f f469777b;

    /* renamed from: c, reason: collision with root package name */
    public int f469778c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469779d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469780e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469781f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469782g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f469783h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f469784i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f469785j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f469786k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f469787l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f469788m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f469789n = false;

    public final void a(java.lang.String str, long j17, java.lang.String str2) {
        z25.a aVar = new z25.a(this);
        aVar.f469758a = str;
        aVar.f469759b = j17;
        aVar.f469761d = 5;
        z25.f fVar = this.f469777b;
        aVar.f469760c = fVar.f469791b;
        aVar.f469767j = this.f469783h;
        aVar.f469768k = str2;
        aVar.f469773p = fVar.f469805p;
        this.f469776a = aVar;
        aVar.b();
    }

    public final void b(int i17, java.lang.String str) {
        z25.f fVar = this.f469777b;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        fVar.f469801l = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f469777b.f469791b);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(this.f469777b.f469802m);
        z25.f fVar2 = this.f469777b;
        g0Var.g(20470, true, true, false, valueOf, valueOf2, java.lang.Long.valueOf(fVar2.f469801l - fVar2.f469800k), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.f469777b.f469803n));
        g0Var.A(1431, 2);
        int i18 = this.f469777b.f469791b;
        if (i18 == 1) {
            g0Var.A(1431, 5);
        } else if (i18 == 2) {
            g0Var.A(1431, 8);
        } else if (i18 == 3) {
            g0Var.A(1431, 11);
            if (this.f469777b.f469802m > 26214400) {
                g0Var.A(1431, 14);
            }
        }
        z25.e eVar = this.f469777b.f469792c;
        if (eVar != null) {
            eVar.a(i17, str);
        }
    }

    public void c(z25.b bVar, java.lang.String str, int i17) {
        if (bVar.f469761d != 2 || i17 != -100003 || !this.f469788m) {
            b(i17, str);
        } else {
            this.f469788m = false;
            e(2);
        }
    }

    public boolean d(z25.f fVar) {
        if (fVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CGIParallelUploadMgr", "summersafecdn addSendTask task info is null");
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new z25.c(this, fVar), "MicroMsg.ParallelUpload.ThreadName");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0308  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r14) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z25.d.e(int):void");
    }

    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CGIParallelUploadMgr", "quitVideoSendThread");
        z25.a aVar = this.f469776a;
        if (aVar != null) {
            aVar.c();
        }
    }
}
