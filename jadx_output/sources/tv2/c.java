package tv2;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tv2.f f422274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f422275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f422276f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderMediaReportObject f422277g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f422278h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422279i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.i70 f422280m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcontrol.VideoTransPara f422281n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r45.h70 f422282o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f422283p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f422284q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(tv2.f fVar, kotlin.jvm.internal.f0 f0Var, int i17, com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject, long j17, java.lang.String str, r45.i70 i70Var, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, r45.h70 h70Var, java.lang.Object obj, kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f422274d = fVar;
        this.f422275e = f0Var;
        this.f422276f = i17;
        this.f422277g = finderMediaReportObject;
        this.f422278h = j17;
        this.f422279i = str;
        this.f422280m = i70Var;
        this.f422281n = videoTransPara;
        this.f422282o = h70Var;
        this.f422283p = obj;
        this.f422284q = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        com.tencent.mm.plugin.vlog.model.z result = (com.tencent.mm.plugin.vlog.model.z) obj;
        kotlin.jvm.internal.o.g(result, "result");
        tv2.f fVar = this.f422274d;
        fVar.f422301i = null;
        fVar.f422300h.getLocalId();
        mv2.f0.f331561a.d(result, this.f422274d.f422300h);
        kotlin.jvm.internal.f0 f0Var = this.f422275e;
        if (result.f175793a) {
            this.f422277g.setRemuxTime((int) (android.os.SystemClock.elapsedRealtime() - this.f422278h));
            boolean z17 = false;
            this.f422277g.setRemuxRetCode(0);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1253L, 1L, android.os.SystemClock.elapsedRealtime() - this.f422278h);
            com.tencent.mars.xlog.Log.i("Finder.LogPost.FinderMediaProcessStage", "remuxer succ " + this.f422276f + ", cost: " + (android.os.SystemClock.elapsedRealtime() - this.f422278h) + ", path:" + this.f422279i + " localId:" + this.f422274d.f422300h.getLocalId());
            long k17 = com.tencent.mm.vfs.w6.k(this.f422279i);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            uv2.e eVar = uv2.e.f431376a;
            java.lang.String str = this.f422279i;
            r45.i70 i70Var = this.f422280m;
            int f17 = eVar.f(str, i70Var.f376780i, i70Var.f376781m, this.f422281n, false);
            if (k17 > uv2.e.f431377b) {
                this.f422277g.setZipTime((int) (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                if (f17 == 0) {
                    this.f422277g.setZipRetCode(1);
                } else {
                    this.f422277g.setZipRetCode(2);
                }
            }
            if (!android.text.TextUtils.isEmpty(this.f422282o.f375901h) || this.f422282o.f375897d.size() > 1 || this.f422282o.f375904n.f374939e.size() > 0 || this.f422282o.f375904n.f374940f) {
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = this.f422274d.f422300h.field_reportObject;
                java.lang.Integer valueOf = finderFeedReportObject != null ? java.lang.Integer.valueOf(finderFeedReportObject.getEnterScene()) : null;
                if ((valueOf != null && valueOf.intValue() == 16) || (valueOf != null && valueOf.intValue() == 27)) {
                    z17 = true;
                }
                if (!z17) {
                    ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).bj(this.f422279i);
                }
            }
            i17 = f17;
        } else {
            com.tencent.mars.xlog.Log.i("Finder.LogPost.FinderMediaProcessStage", "remuxer failed " + this.f422276f + " localId:" + this.f422274d.f422300h.getLocalId() + " isCancel:" + result.f175795c);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1253L, 2L, 1L);
            this.f422277g.setRemuxTime((int) (android.os.SystemClock.elapsedRealtime() - this.f422278h));
            i17 = -1;
            this.f422277g.setRemuxRetCode(-1);
        }
        f0Var.f310116d = i17;
        java.lang.Object obj2 = this.f422283p;
        kotlin.jvm.internal.c0 c0Var = this.f422284q;
        synchronized (obj2) {
            c0Var.f310112d = true;
            obj2.notify();
        }
        return jz5.f0.f302826a;
    }
}
