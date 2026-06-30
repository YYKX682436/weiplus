package sz3;

/* loaded from: classes15.dex */
public final class a0 implements com.tencent.mm.plugin.scanner.model.e1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f413951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.RectF f413952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f413953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f413954g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f413955h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sz3.x0 f413956i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ tz3.c f413957m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ sz3.a1 f413958n;

    public a0(byte[] bArr, android.graphics.RectF rectF, int i17, int i18, int i19, sz3.x0 x0Var, tz3.c cVar, sz3.a1 a1Var) {
        this.f413951d = bArr;
        this.f413952e = rectF;
        this.f413953f = i17;
        this.f413954g = i18;
        this.f413955h = i19;
        this.f413956i = x0Var;
        this.f413957m = cVar;
        this.f413958n = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.RectF rectF;
        sz3.x0 x0Var;
        if (!sz3.d0.f413997g) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanGoodsNoModelDetectManager", "decodeFullImage not inited");
            return;
        }
        byte[] bArr = this.f413951d;
        if (bArr == null || (rectF = this.f413952e) == null) {
            tz3.c cVar = sz3.d0.f414003m;
            if (cVar != null) {
                cVar.b(null);
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("decodeFullImage localTrackId: ");
        int i17 = this.f413953f;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsNoModelDetectManager", sb6.toString());
        sz3.c1 i18 = com.tencent.mm.plugin.scanner.model.d1.i(i17, rectF, bArr, this.f413954g, this.f413955h);
        if (i18 != null) {
            if (i18.f413984k == sz3.d1.f414007e) {
                i18.f413987n = true;
                i18.f413985l = 2;
            }
            i18.f413974a = 3;
            i18.f413975b = java.lang.System.currentTimeMillis();
            i18.f413976c = 1002;
            i18.f413977d = 3;
            java.util.ArrayList arrayList = i18.f413981h;
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                x0Var = this.f413956i;
                if (!hasNext) {
                    break;
                }
                sz3.a1 a1Var = (sz3.a1) it.next();
                sz3.a1 a1Var2 = this.f413958n;
                sz3.y0 y0Var = a1Var2.f413963e;
                y0Var.f414166g = a1Var.f413963e.f414166g;
                sz3.b1 b1Var = a1Var2.f413962d;
                a1Var.f413961c = b1Var;
                a1Var.f413962d = b1Var;
                a1Var.f413963e = y0Var;
                a1Var.f413964f = x0Var.f414152f;
            }
            java.util.Iterator it6 = x0Var.f414151e.iterator();
            int i19 = 0;
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                sz3.w0 w0Var = (sz3.w0) next;
                sz3.a1 a1Var3 = (sz3.a1) kz5.n0.a0(arrayList, i19);
                if (a1Var3 != null) {
                    com.tencent.mm.plugin.scanner.model.ScanProductInfo scanProductInfo = a1Var3.f413959a;
                    w0Var.f414138i = scanProductInfo.getId();
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsNoModelDetectManager", "decodeFullImage set origin trackId: %s", java.lang.Integer.valueOf(scanProductInfo.getId()));
                }
                i19 = i27;
            }
            i18.f413986m = x0Var;
            if (i18.f413982i == null) {
                i18.f413982i = i18.a();
            }
        }
        com.tencent.mm.plugin.scanner.model.d1.o(false);
        tz3.c cVar2 = this.f413957m;
        if (cVar2 != null) {
            cVar2.a();
        }
        tz3.c cVar3 = sz3.d0.f414003m;
        if (cVar3 != null) {
            cVar3.b(i18);
        }
    }
}
