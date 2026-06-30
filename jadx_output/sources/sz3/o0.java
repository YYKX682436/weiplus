package sz3;

/* loaded from: classes15.dex */
public final class o0 implements com.tencent.mm.plugin.scanner.model.e1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.c1 f414084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.v0 f414085e;

    public o0(sz3.c1 c1Var, sz3.v0 v0Var) {
        this.f414084d = c1Var;
        this.f414085e = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.tencent.mm.plugin.scanner.model.c cVar;
        jz5.l lVar;
        boolean z17;
        boolean z18;
        int i18;
        sz3.c1 c1Var = this.f414084d;
        c1Var.f413976c = 1002;
        int i19 = bz3.h.f36783j;
        vz3.t tVar = vz3.t.f441710a;
        tVar.a();
        sz3.d1 d1Var = c1Var.f413984k;
        sz3.d1 d1Var2 = sz3.d1.f414007e;
        if (d1Var == d1Var2) {
            i17 = 10;
            i19 = 2;
        } else {
            i17 = 3;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MixScanGoodsImageHandler", "handleFullImage fullImageData: %s, source: %s, session: %s, originImageType: %d, targetImageType: %d", c1Var.f413978e, java.lang.Integer.valueOf(c1Var.f413974a), java.lang.Long.valueOf(c1Var.f413975b), 4, java.lang.Integer.valueOf(i19));
        boolean z19 = c1Var.f413978e == null;
        com.tencent.mm.plugin.scanner.model.c cVar2 = new com.tencent.mm.plugin.scanner.model.c(0);
        cVar2.f158830g = bz3.h.f36792s ? 1 : 0;
        cVar2.f158829f = i17;
        com.tencent.mm.plugin.scanner.model.d.a(50, cVar2);
        byte[] bArr = c1Var.f413978e;
        if (bArr != null) {
            sz3.v0 v0Var = this.f414085e;
            int a17 = v0Var.g().a();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (com.tencent.mm.plugin.scanner.model.d1.f158853k == com.tencent.mm.plugin.scanner.model.y0.f159103e || com.tencent.mm.plugin.scanner.model.d1.f158853k == com.tencent.mm.plugin.scanner.model.y0.f159104f) {
                com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative scanFastFocusEngineNative = com.tencent.mm.plugin.scanner.model.d1.f158852j;
                scanFastFocusEngineNative.fullImageData = null;
                android.graphics.Point g17 = com.tencent.mm.plugin.scanner.model.d1.g(com.tencent.mm.plugin.scanner.model.d1.f158857o, com.tencent.mm.plugin.scanner.model.d1.f158858p, com.tencent.mm.plugin.scanner.model.d1.f158859q);
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanFastFocusEngineManager", "getUploadFullYUVImageAndResize localTrackId: " + a17 + ", resizeImageSize: " + g17);
                com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative uploadFullYUVImageAndResize = scanFastFocusEngineNative.getUploadFullYUVImageAndResize(bArr, a17, false, 30.0f, g17.x, g17.y);
                lVar = new jz5.l(uploadFullYUVImageAndResize != null ? uploadFullYUVImageAndResize.fullImageData : null, g17);
            } else {
                lVar = null;
            }
            byte[] bArr2 = lVar != null ? (byte[]) lVar.f302833d : null;
            android.graphics.Point point = lVar != null ? (android.graphics.Point) lVar.f302834e : null;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            if (bArr2 != null) {
                if (c1Var.f413984k == d1Var2) {
                    a17 = v0Var.g().b();
                }
                long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                kotlin.jvm.internal.o.d(point);
                jz5.l f17 = v0Var.f(bArr2, 4, i19, point);
                long currentTimeMillis4 = java.lang.System.currentTimeMillis() - currentTimeMillis3;
                byte[] bArr3 = (byte[]) f17.f302833d;
                int intValue = ((java.lang.Number) f17.f302834e).intValue();
                if (bArr3 != null) {
                    c1Var.f413978e = null;
                    com.tencent.mm.plugin.scanner.model.ScanProductInfo scanProductInfo = new com.tencent.mm.plugin.scanner.model.ScanProductInfo();
                    scanProductInfo.setId(a17);
                    scanProductInfo.getId();
                    sz3.a1 a1Var = new sz3.a1(scanProductInfo);
                    sz3.y0 y0Var = a1Var.f413963e;
                    y0Var.f414167h = currentTimeMillis2;
                    y0Var.f414168i = currentTimeMillis4;
                    int length = bArr3.length;
                    y0Var.f414169j = length;
                    if (intValue == 1) {
                        i18 = 2;
                    } else if (intValue != 2) {
                        i18 = 3;
                        if (intValue != 3) {
                            i18 = -1;
                        }
                    } else {
                        i18 = 1;
                    }
                    y0Var.f414174o = i18;
                    cVar2.f158824a = i18;
                    cVar2.f158825b = length;
                    a1Var.f413964f = cVar2;
                    sz3.b1 b1Var = new sz3.b1(bArr3);
                    b1Var.f413969d = point.x;
                    b1Var.f413970e = point.y;
                    b1Var.f413968c = intValue;
                    a1Var.f413962d = b1Var;
                    c1Var.f413982i = a1Var;
                    com.tencent.mm.plugin.scanner.model.d.a(20, a1Var.f413964f);
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var.A(1259, 246);
                    g0Var.A(1259, c1Var.f413984k == d1Var2 ? com.tencent.mm.plugin.appbrand.jsapi.cd.CTRL_INDEX : 250);
                    cVar = cVar2;
                    sz3.p pVar = new sz3.p(a1Var, i17, bArr3, point.x, point.y);
                    pVar.f414091m = a17;
                    pVar.f413947d = c1Var.f413974a;
                    pVar.f413946c = c1Var.f413975b;
                    pVar.f413948e = c1Var.f413976c;
                    pVar.f414092n = bArr2;
                    pVar.f414093o = point;
                    pVar.f414089k = false;
                    pVar.f414090l = true;
                    v0Var.f414128h.n(pVar);
                    z18 = z19;
                    z19 = z18;
                } else {
                    cVar = cVar2;
                    z17 = true;
                    tVar.j();
                }
            } else {
                cVar = cVar2;
                z17 = true;
                tVar.j();
            }
            z18 = z17;
            z19 = z18;
        } else {
            cVar = cVar2;
        }
        if (z19) {
            com.tencent.mm.plugin.scanner.model.d.a(21, cVar);
        }
    }
}
