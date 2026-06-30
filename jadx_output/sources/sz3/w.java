package sz3;

/* loaded from: classes15.dex */
public class w extends rz3.g {

    /* renamed from: g, reason: collision with root package name */
    public final sz3.q f414127g;

    /* renamed from: h, reason: collision with root package name */
    public final sz3.m f414128h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f414129i;

    public w(sz3.q handleCallback) {
        kotlin.jvm.internal.o.g(handleCallback, "handleCallback");
        this.f414127g = handleCallback;
        this.f414129i = jz5.h.b(sz3.t.f414119d);
        this.f414128h = new sz3.m(new sz3.s(this));
    }

    public final void d(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewAiImageHandler", "addTrackId: %s", java.lang.Integer.valueOf(i17));
        sz3.o g17 = g();
        synchronized (g17.f414083c) {
            g17.f414083c.add(java.lang.Integer.valueOf(i17));
        }
    }

    @Override // rz3.a
    public void destroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewAiImageHandler", "destroy NewAiImageHandler");
        sz3.m mVar = this.f414128h;
        mVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageGetProductManager", "getProduct cancel");
        mVar.f414071g = true;
        ((ku5.t0) ku5.t0.f312615d).h(new sz3.c(mVar), "AiScanImageGetProductManager");
        sz3.o g17 = g();
        synchronized (g17.f414083c) {
            g17.f414083c.clear();
        }
        synchronized (java.lang.Integer.valueOf(g17.f414081a)) {
            g17.f414081a = 0;
        }
    }

    public final boolean e(int i17) {
        boolean contains;
        sz3.o g17 = g();
        synchronized (g17.f414083c) {
            contains = g17.f414083c.contains(java.lang.Integer.valueOf(i17));
        }
        return contains;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.l f(byte[] r30, int r31, int r32, android.graphics.Point r33) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sz3.w.f(byte[], int, int, android.graphics.Point):jz5.l");
    }

    public final sz3.o g() {
        return (sz3.o) ((jz5.n) this.f414129i).getValue();
    }

    @Override // rz3.a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(long j17, sz3.c1 c1Var) {
        if (c1Var == null) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 245);
        if (c1Var.f413983j) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            dz3.i.p(new sz3.u(c1Var, this));
            return;
        }
        sz3.a1 a17 = c1Var.a();
        if (a17 == null) {
            return;
        }
        c1Var.f413982i = a17;
        if (a17.f413964f == null) {
            a17.f413964f = new com.tencent.mm.plugin.scanner.model.c(0);
        }
        int i17 = c1Var.f413974a;
        int i18 = 3;
        if (i17 != 3) {
            if (i17 == 4) {
                o(c1Var, a17);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.scanner.model.ScanProductInfo scanProductInfo = a17.f413959a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewAiImageHandler", "uploadNormalImage shouldShow: %s, source: %s, session: %s, tracId: %s", java.lang.Boolean.valueOf(scanProductInfo.getShouldShow()), java.lang.Integer.valueOf(c1Var.f413974a), java.lang.Long.valueOf(c1Var.f413975b), java.lang.Integer.valueOf(scanProductInfo.getId()));
        if (!scanProductInfo.getShouldShow() || e(scanProductInfo.getId())) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative e17 = com.tencent.mm.plugin.scanner.model.d1.e(scanProductInfo.getId(), scanProductInfo.getX1(), scanProductInfo.getY1(), scanProductInfo.getX2(), scanProductInfo.getY2());
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        if ((e17 != null ? e17.bestImageData : null) != null) {
            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
            byte[] bestImageData = e17.bestImageData;
            kotlin.jvm.internal.o.f(bestImageData, "bestImageData");
            jz5.l f17 = f(bestImageData, 4, 1, new android.graphics.Point(e17.width, e17.height));
            byte[] bArr = (byte[]) f17.f302833d;
            int intValue = ((java.lang.Number) f17.f302834e).intValue();
            long currentTimeMillis4 = java.lang.System.currentTimeMillis() - currentTimeMillis3;
            if (bArr == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NewAiImageHandler", "handleResult get jpg failed");
                com.tencent.mm.plugin.scanner.model.d.a(11, a17.f413964f);
                ((ku5.t0) ku5.t0.f312615d).B(new sz3.v(this, c1Var, scanProductInfo));
                return;
            }
            sz3.y0 y0Var = a17.f413963e;
            y0Var.f414167h = currentTimeMillis2;
            y0Var.f414168i = currentTimeMillis4;
            y0Var.f414169j = bArr.length;
            if (intValue == 1) {
                i18 = 2;
            } else if (intValue == 2) {
                i18 = 1;
            } else if (intValue != 3) {
                i18 = -1;
            }
            y0Var.f414174o = i18;
            java.util.Iterator it = c1Var.f413981h.iterator();
            while (it.hasNext()) {
                sz3.a1 a1Var = (sz3.a1) it.next();
                if (a1Var.f413959a.getId() == scanProductInfo.getId()) {
                    scanProductInfo.getShouldShow();
                    scanProductInfo.getId();
                    sz3.b1 b1Var = new sz3.b1(bArr);
                    b1Var.f413968c = intValue;
                    a1Var.f413961c = b1Var;
                }
            }
            com.tencent.mm.plugin.scanner.model.c cVar = a17.f413964f;
            if (cVar != null) {
                cVar.f158829f = 1;
                sz3.y0 y0Var2 = a17.f413963e;
                cVar.f158824a = y0Var2.f414174o;
                cVar.f158825b = y0Var2.f414169j;
            }
            if (!i(c1Var)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NewAiImageHandler", "uploadNormalImage addScanProduct failed");
                return;
            }
            com.tencent.mm.plugin.scanner.model.d.a(10, a17.f413964f);
            d(scanProductInfo.getId());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 247);
            sz3.p pVar = new sz3.p(a17, 1, bArr, e17.width, e17.height);
            pVar.f413947d = c1Var.f413974a;
            pVar.f413946c = c1Var.f413975b;
            pVar.f413948e = 0;
            this.f414128h.n(pVar);
        }
    }

    public boolean i(sz3.c1 scanProductResult) {
        kotlin.jvm.internal.o.g(scanProductResult, "scanProductResult");
        boolean d17 = this.f414127g.d(scanProductResult);
        if (d17) {
            sz3.a1 a1Var = scanProductResult.f413982i;
            if (a1Var != null) {
                a1Var.f413963e.f414173n = java.lang.System.currentTimeMillis() - a1Var.f413963e.f414160a;
            }
            sz3.a1 a17 = scanProductResult.a();
            com.tencent.mm.plugin.scanner.model.d.a(2, a17 != null ? a17.f413964f : null);
        }
        return d17;
    }

    public boolean j(sz3.c1 scanProductResult, sz3.x0 x0Var) {
        kotlin.jvm.internal.o.g(scanProductResult, "scanProductResult");
        boolean d17 = this.f414127g.d(scanProductResult);
        if (d17) {
            sz3.a1 a17 = scanProductResult.a();
            com.tencent.mm.plugin.scanner.model.d.a(2, a17 != null ? a17.f413964f : null);
        }
        return d17;
    }

    public void k(sz3.x0 result, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(result, "result");
        this.f414127g.b(result, i17, str);
    }

    public void l(sz3.x0 result) {
        kotlin.jvm.internal.o.g(result, "result");
        this.f414127g.c(result);
    }

    public void m(sz3.x0 result, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(result, "result");
        this.f414127g.a(result, i17, str);
    }

    public void n(sz3.x0 result) {
        kotlin.jvm.internal.o.g(result, "result");
        this.f414127g.f(result);
    }

    public final void o(sz3.c1 scanProductResult, sz3.a1 scanProductInfo) {
        kotlin.jvm.internal.o.g(scanProductResult, "scanProductResult");
        kotlin.jvm.internal.o.g(scanProductInfo, "scanProductInfo");
        sz3.b1 b1Var = scanProductInfo.f413962d;
        byte[] a17 = b1Var != null ? b1Var.a() : null;
        if (a17 != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 248);
            sz3.b1 b1Var2 = scanProductInfo.f413962d;
            sz3.p pVar = new sz3.p(scanProductInfo, 2, a17, b1Var2 != null ? b1Var2.f413969d : 0, b1Var2 != null ? b1Var2.f413970e : 0);
            pVar.f413947d = scanProductResult.f413974a;
            pVar.f413946c = scanProductResult.f413975b;
            pVar.f413948e = scanProductResult.f413976c;
            pVar.f414089k = false;
            pVar.f414090l = false;
            this.f414128h.n(pVar);
        }
    }
}
