package sz3;

/* loaded from: classes15.dex */
public final class v0 extends sz3.w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.content.Context context, sz3.q handleCallback) {
        super(handleCallback);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(handleCallback, "handleCallback");
        this.f401811f = context;
        ((jd0.u1) ((kd0.h2) i95.n0.c(kd0.h2.class))).getClass();
        new com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine((com.tencent.mm.ui.MMActivity) context, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0172 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0173  */
    @Override // sz3.w, rz3.a
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(long r25, sz3.c1 r27) {
        /*
            Method dump skipped, instructions count: 1149
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sz3.v0.b(long, sz3.c1):void");
    }

    @Override // sz3.w
    public boolean i(sz3.c1 scanProductResult) {
        sz3.a1 a1Var;
        com.tencent.mm.plugin.scanner.model.ScanProductInfo scanProductInfo;
        kotlin.jvm.internal.o.g(scanProductResult, "scanProductResult");
        boolean i17 = super.i(scanProductResult);
        if (i17) {
            if (scanProductResult.f413987n && (a1Var = scanProductResult.f413982i) != null && (scanProductInfo = a1Var.f413959a) != null) {
                vz3.t.f441710a.c(java.lang.Integer.valueOf(scanProductInfo.getId()).intValue());
            }
            r(scanProductResult);
        }
        return i17;
    }

    @Override // sz3.w
    public boolean j(sz3.c1 scanProductResult, sz3.x0 x0Var) {
        kotlin.jvm.internal.o.g(scanProductResult, "scanProductResult");
        scanProductResult.f413976c = 1002;
        boolean e17 = this.f414127g.e(scanProductResult, x0Var);
        if (e17) {
            sz3.a1 a1Var = scanProductResult.f413982i;
            if (a1Var != null) {
                a1Var.f413963e.f414173n = java.lang.System.currentTimeMillis() - a1Var.f413963e.f414160a;
            }
            sz3.a1 a17 = scanProductResult.a();
            com.tencent.mm.plugin.scanner.model.d.a(2, a17 != null ? a17.f413964f : null);
            r(scanProductResult);
        }
        return e17;
    }

    @Override // sz3.w
    public void k(sz3.x0 result, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(result, "result");
        super.k(result, i17, str);
    }

    @Override // sz3.w
    public void l(sz3.x0 result) {
        kotlin.jvm.internal.o.g(result, "result");
        super.l(result);
    }

    @Override // sz3.w
    public void m(sz3.x0 result, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(result, "result");
        super.m(result, i17, str);
        ((ku5.t0) ku5.t0.f312615d).B(new sz3.t0(this));
    }

    @Override // sz3.w
    public void n(sz3.x0 result) {
        kotlin.jvm.internal.o.g(result, "result");
        super.n(result);
        if (result.f414150d == 1002) {
            return;
        }
        q((sz3.w0) kz5.n0.Z(result.f414151e));
    }

    public final void p(sz3.c1 c1Var) {
        com.tencent.mm.plugin.scanner.model.ScanProductInfo scanProductInfo;
        sz3.a1 a1Var = c1Var.f413982i;
        if (a1Var == null || (scanProductInfo = a1Var.f413959a) == null) {
            return;
        }
        int intValue = java.lang.Integer.valueOf(scanProductInfo.getId()).intValue();
        d(intValue);
        if (c1Var.f413987n) {
            vz3.t.f441710a.c(intValue);
        }
    }

    public final void q(sz3.w0 w0Var) {
        if (w0Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MixScanGoodsImageHandler", "doRetrievalClick trackId: " + w0Var.f414138i + ", reqKey: " + w0Var.f414139j);
        gm0.j1.d().g(new com.tencent.mm.plugin.scanner.model.z(kz5.c0.d(w0Var.f414139j), true, null, 4, null));
    }

    public final void r(sz3.c1 c1Var) {
        sz3.a1 a1Var = c1Var.f413982i;
        if (a1Var != null) {
            sz3.y0 y0Var = a1Var.f413963e;
            java.lang.String valueOf = java.lang.String.valueOf(c1Var.f413975b);
            y0Var.getClass();
            kotlin.jvm.internal.o.g(valueOf, "<set-?>");
            y0Var.f414164e = valueOf;
            int i17 = c1Var.f413977d;
            if (i17 == 1) {
                a1Var.f413963e.f414165f = 1;
            } else if (i17 == 2) {
                a1Var.f413963e.f414165f = 2;
            } else if (i17 == 3) {
                a1Var.f413963e.f414165f = 3;
            }
            a1Var.f413963e.f414176q = e04.j2.a();
            sz3.y0 y0Var2 = a1Var.f413963e;
            com.tencent.mm.sdk.platformtools.o4 o4Var = et5.c.f256672a;
            com.tencent.mm.sdk.platformtools.o4 o4Var2 = et5.c.f256672a;
            y0Var2.f414175p = o4Var2 != null ? o4Var2.getInt("scan_code_last_frame_cost", 0) : 0;
            com.tencent.mm.plugin.scanner.model.e.f158874a.a(a1Var.f413963e);
        }
    }
}
