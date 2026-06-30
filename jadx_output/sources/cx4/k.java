package cx4;

/* loaded from: classes5.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f224620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cx4.m f224621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224623g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224624h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f224625i;

    public k(android.graphics.Bitmap bitmap, cx4.m mVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        this.f224620d = bitmap;
        this.f224621e = mVar;
        this.f224622f = str;
        this.f224623g = str2;
        this.f224624h = str3;
        this.f224625i = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2 = this.f224624h;
        java.lang.String str3 = this.f224623g;
        java.lang.String str4 = this.f224622f;
        cx4.m mVar = this.f224621e;
        try {
            dk0.j jVar = (dk0.j) i95.n0.c(dk0.j.class);
            android.graphics.Bitmap bitmap = this.f224620d;
            kotlin.jvm.internal.o.f(bitmap, "$bitmap");
            float[] Ai = ((oy4.b0) jVar).Ai(bitmap);
            com.tencent.mars.xlog.Log.i(mVar.f224634a, "doReportWeCLIPV2Result currentUrl=" + str4 + " rawUrl=" + str3 + " a8KeyReqUrl=" + str2);
            if (Ai.length == 0) {
                return;
            }
            int length = Ai.length / 4;
            e06.k m17 = e06.p.m(0, 4);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
            java.util.Iterator it = m17.iterator();
            while (true) {
                str = "";
                if (!it.hasNext()) {
                    break;
                }
                int b17 = ((kz5.x0) it).b();
                int i17 = b17 * length;
                int length2 = b17 == 3 ? Ai.length : (b17 + 1) * length;
                if (i17 < Ai.length) {
                    e06.k indices = e06.p.m(i17, length2);
                    kotlin.jvm.internal.o.g(indices, "indices");
                    str = kz5.z.b0(indices.isEmpty() ? new float[0] : kz5.v.r(Ai, indices.h().intValue(), indices.g().intValue() + 1), ",", null, null, 0, null, cx4.j.f224619d, 30, null);
                }
                arrayList.add(str);
            }
            com.tencent.mars.xlog.Log.i(mVar.f224634a, "doReportWeCLIPV2Result featureSize=" + Ai.length);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[9];
            objArr[0] = str3;
            objArr[1] = str2;
            objArr[2] = str4;
            ((oy4.b0) ((dk0.j) i95.n0.c(dk0.j.class))).getClass();
            objArr[3] = oy4.b0.f350059e;
            objArr[4] = kz5.c0.h(arrayList) >= 0 ? arrayList.get(0) : "";
            objArr[5] = 1 <= kz5.c0.h(arrayList) ? arrayList.get(1) : "";
            objArr[6] = 2 <= kz5.c0.h(arrayList) ? arrayList.get(2) : "";
            objArr[7] = 3 <= kz5.c0.h(arrayList) ? arrayList.get(3) : "";
            objArr[8] = java.lang.Integer.valueOf(this.f224625i);
            g0Var.d(25226, objArr);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(mVar.f224634a, "doReportWeCLIPV2Result execute error: " + e17.getMessage(), e17);
        }
    }
}
