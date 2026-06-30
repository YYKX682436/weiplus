package sv2;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sv2.m f413320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f413321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderMediaReportObject f413322f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f413323g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413324h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f413325i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f413326m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f413327n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcontrol.VideoTransPara f413328o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f413329p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f413330q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(sv2.m mVar, kotlin.jvm.internal.f0 f0Var, com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject, long j17, java.lang.String str, boolean z17, kotlin.jvm.internal.f0 f0Var2, kotlin.jvm.internal.f0 f0Var3, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, java.lang.Object obj, kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f413320d = mVar;
        this.f413321e = f0Var;
        this.f413322f = finderMediaReportObject;
        this.f413323g = j17;
        this.f413324h = str;
        this.f413325i = z17;
        this.f413326m = f0Var2;
        this.f413327n = f0Var3;
        this.f413328o = videoTransPara;
        this.f413329p = obj;
        this.f413330q = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        int i18;
        com.tencent.mm.plugin.vlog.model.z result = (com.tencent.mm.plugin.vlog.model.z) obj;
        kotlin.jvm.internal.o.g(result, "result");
        sv2.m mVar = this.f413320d;
        mVar.f413334n = null;
        com.tencent.mars.xlog.Log.i(mVar.f413332i, "buildFromFilePath: success " + result.f175793a);
        kotlin.jvm.internal.f0 f0Var = this.f413321e;
        if (result.f175793a) {
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject = this.f413322f;
            long j17 = this.f413323g;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            finderMediaReportObject.setRemuxTime((int) (android.os.SystemClock.elapsedRealtime() - j17));
            i17 = 0;
            this.f413322f.setRemuxRetCode(0);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f413323g;
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.C(1718L, 1L, elapsedRealtime);
            g0Var.C(1719L, 1L, elapsedRealtime);
            long k17 = com.tencent.mm.vfs.w6.k(this.f413324h);
            com.tencent.mars.xlog.Log.i(this.f413320d.f413332i, "remuxer succ longvideo, size:" + k17 + ", cost: " + (android.os.SystemClock.elapsedRealtime() - this.f413323g) + ", path:" + this.f413324h + " localId:" + this.f413320d.f413331h.field_localId);
            if (!this.f413325i) {
                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                i18 = uv2.e.f431376a.f(this.f413324h, this.f413326m.f310116d, this.f413327n.f310116d, this.f413328o, !this.f413325i);
                if (k17 > uv2.e.f431377b) {
                    this.f413322f.setZipTime((int) (android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
                    if (i18 == 0) {
                        this.f413322f.setZipRetCode(1);
                    } else {
                        this.f413322f.setZipRetCode(2);
                    }
                }
            } else if (k17 > uv2.e.f431377b) {
                com.tencent.mars.xlog.Log.i(this.f413320d.f413332i, "remux longvideo, size out of range");
                g0Var.C(1719L, 101L, 1L);
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = this.f413320d.f413333m.field_reportObject;
                if (finderFeedReportObject != null) {
                    finderFeedReportObject.setLongVideoSizeInvalid(1);
                }
                cu2.o.f222430a.b(this.f413320d.f413331h);
                i18 = -4;
            }
            i17 = i18;
        } else {
            com.tencent.mars.xlog.Log.i(this.f413320d.f413332i, "remuxer failed longvideo localId:" + this.f413320d.f413331h.field_localId);
            com.tencent.mm.plugin.finder.report.d0 d0Var = com.tencent.mm.plugin.finder.report.d0.f124987a;
            d0Var.a(true);
            d0Var.a(true);
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject2 = this.f413322f;
            long j18 = this.f413323g;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            finderMediaReportObject2.setRemuxTime((int) (android.os.SystemClock.elapsedRealtime() - j18));
            i17 = -1;
            this.f413322f.setRemuxRetCode(-1);
        }
        f0Var.f310116d = i17;
        java.lang.Object obj2 = this.f413329p;
        kotlin.jvm.internal.c0 c0Var = this.f413330q;
        synchronized (obj2) {
            c0Var.f310112d = true;
            obj2.notifyAll();
        }
        return jz5.f0.f302826a;
    }
}
