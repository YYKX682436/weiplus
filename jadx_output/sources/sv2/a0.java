package sv2;

/* loaded from: classes10.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f413242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sv2.b0 f413243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f413244f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderMediaReportObject f413245g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413246h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.i70 f413247i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcontrol.VideoTransPara f413248m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r45.h70 f413249n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f413250o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f413251p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(kotlin.jvm.internal.f0 f0Var, sv2.b0 b0Var, long j17, com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject, java.lang.String str, r45.i70 i70Var, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, r45.h70 h70Var, java.lang.Object obj, kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f413242d = f0Var;
        this.f413243e = b0Var;
        this.f413244f = j17;
        this.f413245g = finderMediaReportObject;
        this.f413246h = str;
        this.f413247i = i70Var;
        this.f413248m = videoTransPara;
        this.f413249n = h70Var;
        this.f413250o = obj;
        this.f413251p = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        com.tencent.mm.plugin.vlog.model.z result = (com.tencent.mm.plugin.vlog.model.z) obj;
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.f0 f0Var = this.f413242d;
        if (result.f175793a) {
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject = this.f413245g;
            long j17 = this.f413244f;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            finderMediaReportObject.setRemuxTime((int) (android.os.SystemClock.elapsedRealtime() - j17));
            this.f413245g.setRemuxRetCode(0);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1718L, 1L, android.os.SystemClock.elapsedRealtime() - this.f413244f);
            com.tencent.mars.xlog.Log.i(this.f413243e.f413255i, "remuxer succ, cost: " + (android.os.SystemClock.elapsedRealtime() - this.f413244f) + ", path:" + this.f413246h + " localId:" + this.f413243e.f413254h.field_localId);
            long k17 = com.tencent.mm.vfs.w6.k(this.f413246h);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            uv2.e eVar = uv2.e.f431376a;
            java.lang.String str = this.f413246h;
            r45.i70 i70Var = this.f413247i;
            int f17 = eVar.f(str, i70Var.f376780i, i70Var.f376781m, this.f413248m, false);
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (k17 > t70Var.N2() && t70Var.k() != 1) {
                this.f413245g.setZipTime((int) (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                if (f17 == 0) {
                    this.f413245g.setZipRetCode(1);
                } else {
                    this.f413245g.setZipRetCode(2);
                }
            }
            if (!android.text.TextUtils.isEmpty(this.f413249n.f375901h) || this.f413249n.f375897d.size() > 1 || this.f413249n.f375904n.f374939e.size() > 0 || this.f413249n.f375904n.f374940f) {
                ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).bj(this.f413246h);
            }
            i17 = f17;
        } else {
            java.lang.String str2 = this.f413243e.f413255i;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remuxer failed localId:");
            sb6.append(this.f413243e.f413254h.field_localId);
            sb6.append(", cost:");
            long j18 = this.f413244f;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(android.os.SystemClock.elapsedRealtime() - j18);
            com.tencent.mars.xlog.Log.i(str2, sb6.toString());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1718L, 2L, 1L);
            this.f413245g.setRemuxTime((int) (android.os.SystemClock.elapsedRealtime() - this.f413244f));
            i17 = -1;
            this.f413245g.setRemuxRetCode(-1);
        }
        f0Var.f310116d = i17;
        java.lang.Object obj2 = this.f413250o;
        kotlin.jvm.internal.c0 c0Var = this.f413251p;
        synchronized (obj2) {
            c0Var.f310112d = true;
            obj2.notify();
        }
        return jz5.f0.f302826a;
    }
}
