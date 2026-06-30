package sv2;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sv2.m f413305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f413306e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f413307f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderMediaReportObject f413308g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f413309h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413310i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.i70 f413311m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcontrol.VideoTransPara f413312n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r45.h70 f413313o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f413314p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f413315q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(sv2.m mVar, kotlin.jvm.internal.f0 f0Var, int i17, com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject, long j17, java.lang.String str, r45.i70 i70Var, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, r45.h70 h70Var, java.lang.Object obj, kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f413305d = mVar;
        this.f413306e = f0Var;
        this.f413307f = i17;
        this.f413308g = finderMediaReportObject;
        this.f413309h = j17;
        this.f413310i = str;
        this.f413311m = i70Var;
        this.f413312n = videoTransPara;
        this.f413313o = h70Var;
        this.f413314p = obj;
        this.f413315q = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int f17;
        com.tencent.mm.plugin.vlog.model.z result = (com.tencent.mm.plugin.vlog.model.z) obj;
        kotlin.jvm.internal.o.g(result, "result");
        sv2.m mVar = this.f413305d;
        mVar.f413334n = null;
        kotlin.jvm.internal.f0 f0Var = this.f413306e;
        if (result.f175793a) {
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject = this.f413308g;
            long j17 = this.f413309h;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            finderMediaReportObject.setRemuxTime((int) (android.os.SystemClock.elapsedRealtime() - j17));
            this.f413308g.setRemuxRetCode(0);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1718L, 1L, android.os.SystemClock.elapsedRealtime() - this.f413309h);
            com.tencent.mars.xlog.Log.i(this.f413305d.f413332i, "remuxer succ " + this.f413307f + ", cost: " + (android.os.SystemClock.elapsedRealtime() - this.f413309h) + ", path:" + this.f413310i + " localId:" + this.f413305d.f413331h.field_localId);
            long k17 = com.tencent.mm.vfs.w6.k(this.f413310i);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            uv2.e eVar = uv2.e.f431376a;
            java.lang.String str = this.f413310i;
            r45.i70 i70Var = this.f413311m;
            f17 = eVar.f(str, i70Var.f376780i, i70Var.f376781m, this.f413312n, false);
            if (k17 > uv2.e.f431377b) {
                this.f413308g.setZipTime((int) (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                if (f17 == 0) {
                    this.f413308g.setZipRetCode(1);
                } else {
                    this.f413308g.setZipRetCode(2);
                }
            }
            if (!android.text.TextUtils.isEmpty(this.f413313o.f375901h) || this.f413313o.f375897d.size() > 1 || this.f413313o.f375904n.f374939e.size() > 0 || this.f413313o.f375904n.f374940f) {
                ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).bj(this.f413310i);
            }
        } else {
            com.tencent.mars.xlog.Log.i(mVar.f413332i, "remuxer failed " + this.f413307f + " localId:" + this.f413305d.f413331h.field_localId);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1718L, 2L, 1L);
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject2 = this.f413308g;
            long j18 = this.f413309h;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            finderMediaReportObject2.setRemuxTime((int) (android.os.SystemClock.elapsedRealtime() - j18));
            f17 = -1;
            this.f413308g.setRemuxRetCode(-1);
        }
        f0Var.f310116d = f17;
        java.lang.Object obj2 = this.f413314p;
        kotlin.jvm.internal.c0 c0Var = this.f413315q;
        synchronized (obj2) {
            c0Var.f310112d = true;
            obj2.notify();
        }
        return jz5.f0.f302826a;
    }
}
