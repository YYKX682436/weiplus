package wv2;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f449990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wv2.c f449991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f449992f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderMediaReportObject f449993g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449994h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.i70 f449995i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcontrol.VideoTransPara f449996m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r45.h70 f449997n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f449998o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f449999p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kotlin.jvm.internal.f0 f0Var, wv2.c cVar, long j17, com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject, java.lang.String str, r45.i70 i70Var, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, r45.h70 h70Var, java.lang.Object obj, kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f449990d = f0Var;
        this.f449991e = cVar;
        this.f449992f = j17;
        this.f449993g = finderMediaReportObject;
        this.f449994h = str;
        this.f449995i = i70Var;
        this.f449996m = videoTransPara;
        this.f449997n = h70Var;
        this.f449998o = obj;
        this.f449999p = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        com.tencent.mm.plugin.vlog.model.z result = (com.tencent.mm.plugin.vlog.model.z) obj;
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.f0 f0Var = this.f449990d;
        if (result.f175793a) {
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject = this.f449993g;
            long j17 = this.f449992f;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            finderMediaReportObject.setRemuxTime((int) (android.os.SystemClock.elapsedRealtime() - j17));
            this.f449993g.setRemuxRetCode(0);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1253L, 1L, android.os.SystemClock.elapsedRealtime() - this.f449992f);
            com.tencent.mars.xlog.Log.i("LogPost.MvMediaProcessStage", "remuxer succ, cost: " + (android.os.SystemClock.elapsedRealtime() - this.f449992f) + ", path:" + this.f449994h + " localId:" + this.f449991e.f450000h.getLocalId());
            long k17 = com.tencent.mm.vfs.w6.k(this.f449994h);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            uv2.e eVar = uv2.e.f431376a;
            java.lang.String str = this.f449994h;
            r45.i70 i70Var = this.f449995i;
            int f17 = eVar.f(str, i70Var.f376780i, i70Var.f376781m, this.f449996m, false);
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (k17 > t70Var.N2() && t70Var.k() != 1) {
                this.f449993g.setZipTime((int) (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                if (f17 == 0) {
                    this.f449993g.setZipRetCode(1);
                } else {
                    this.f449993g.setZipRetCode(2);
                }
            }
            if (!android.text.TextUtils.isEmpty(this.f449997n.f375901h) || this.f449997n.f375897d.size() > 1 || this.f449997n.f375904n.f374939e.size() > 0 || this.f449997n.f375904n.f374940f) {
                ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).bj(this.f449994h);
            }
            i17 = f17;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remuxer failed localId:");
            sb6.append(this.f449991e.f450000h.getLocalId());
            sb6.append(", cost:");
            long j18 = this.f449992f;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(android.os.SystemClock.elapsedRealtime() - j18);
            com.tencent.mars.xlog.Log.i("LogPost.MvMediaProcessStage", sb6.toString());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1253L, 2L, 1L);
            this.f449993g.setRemuxTime((int) (android.os.SystemClock.elapsedRealtime() - this.f449992f));
            i17 = -1;
            this.f449993g.setRemuxRetCode(-1);
        }
        f0Var.f310116d = i17;
        java.lang.Object obj2 = this.f449998o;
        kotlin.jvm.internal.c0 c0Var = this.f449999p;
        synchronized (obj2) {
            c0Var.f310112d = true;
            obj2.notify();
        }
        return jz5.f0.f302826a;
    }
}
