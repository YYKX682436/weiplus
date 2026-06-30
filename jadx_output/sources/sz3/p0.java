package sz3;

/* loaded from: classes15.dex */
public final class p0 implements tz3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f414094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sz3.c1 f414095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f414096c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.v0 f414097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f414098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f414099f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f414100g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.c f414101h;

    public p0(long j17, sz3.c1 c1Var, kotlin.jvm.internal.f0 f0Var, sz3.v0 v0Var, int i17, kotlin.jvm.internal.f0 f0Var2, kotlin.jvm.internal.f0 f0Var3, kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.scanner.model.c cVar) {
        this.f414094a = j17;
        this.f414095b = c1Var;
        this.f414096c = f0Var;
        this.f414097d = v0Var;
        this.f414098e = f0Var2;
        this.f414099f = f0Var3;
        this.f414100g = c0Var;
        this.f414101h = cVar;
    }

    public void a(boolean z17, java.nio.ByteBuffer byteBuffer, int i17, int i18) {
        kotlin.jvm.internal.c0 c0Var;
        byte[] f17 = (!z17 || byteBuffer == null) ? null : et5.h.f(byteBuffer);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f414094a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MixScanGoodsImageHandler", "handleFullImageForAff rotateAndResizeImage onResult success: " + z17 + ", rgbaImage: " + byteBuffer + ", width: " + i17 + ", height: " + i18 + ", resizeRgbaImageData: " + f17);
        com.tencent.mm.plugin.scanner.model.c cVar = this.f414101h;
        kotlin.jvm.internal.c0 c0Var2 = this.f414100g;
        if (f17 != null) {
            sz3.c1 c1Var = this.f414095b;
            sz3.d1 d1Var = c1Var.f413984k;
            sz3.d1 d1Var2 = sz3.d1.f414007e;
            kotlin.jvm.internal.f0 f0Var = this.f414096c;
            sz3.v0 v0Var = this.f414097d;
            if (d1Var == d1Var2) {
                f0Var.f310116d = v0Var.g().b();
            }
            android.graphics.Point point = new android.graphics.Point(i17, i18);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            jz5.l f18 = v0Var.f(f17, 5, this.f414098e.f310116d, point);
            long currentTimeMillis3 = java.lang.System.currentTimeMillis() - currentTimeMillis2;
            byte[] bArr = (byte[]) f18.f302833d;
            int intValue = ((java.lang.Number) f18.f302834e).intValue();
            if (bArr != null) {
                c1Var.f413978e = null;
                com.tencent.mm.plugin.scanner.model.ScanProductInfo scanProductInfo = new com.tencent.mm.plugin.scanner.model.ScanProductInfo();
                scanProductInfo.setId(f0Var.f310116d);
                scanProductInfo.getId();
                sz3.a1 a1Var = new sz3.a1(scanProductInfo);
                sz3.y0 y0Var = a1Var.f413963e;
                y0Var.f414167h = currentTimeMillis;
                y0Var.f414168i = currentTimeMillis3;
                int length = bArr.length;
                y0Var.f414169j = length;
                int i19 = 2;
                if (intValue != 1) {
                    if (intValue != 2) {
                        i19 = 3;
                        if (intValue != 3) {
                            i19 = -1;
                        }
                    } else {
                        i19 = 1;
                    }
                }
                y0Var.f414174o = i19;
                cVar.f158824a = i19;
                cVar.f158825b = length;
                a1Var.f413964f = cVar;
                sz3.b1 b1Var = new sz3.b1(bArr);
                b1Var.f413969d = point.x;
                b1Var.f413970e = point.y;
                b1Var.f413968c = intValue;
                a1Var.f413962d = b1Var;
                c1Var.f413982i = a1Var;
                com.tencent.mm.plugin.scanner.model.d.a(20, a1Var.f413964f);
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.A(1259, 246);
                g0Var.A(1259, c1Var.f413984k == d1Var2 ? com.tencent.mm.plugin.appbrand.jsapi.cd.CTRL_INDEX : 250);
                sz3.p pVar = new sz3.p(a1Var, this.f414099f.f310116d, bArr, point.x, point.y);
                pVar.f414091m = f0Var.f310116d;
                pVar.f413947d = c1Var.f413974a;
                pVar.f413946c = c1Var.f413975b;
                pVar.f413948e = c1Var.f413976c;
                pVar.f414092n = f17;
                pVar.f414093o = point;
                pVar.f414089k = false;
                pVar.f414090l = true;
                v0Var.f414128h.n(pVar);
                c0Var = c0Var2;
            } else {
                c0Var = c0Var2;
                c0Var.f310112d = true;
                vz3.t.f441710a.j();
            }
        } else {
            c0Var = c0Var2;
        }
        if (c0Var.f310112d) {
            com.tencent.mm.plugin.scanner.model.d.a(21, cVar);
        }
    }
}
