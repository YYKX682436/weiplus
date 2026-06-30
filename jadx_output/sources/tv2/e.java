package tv2;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tv2.f f422289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f422290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderMediaReportObject f422291f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f422292g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422293h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f422294i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f422295m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f422296n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcontrol.VideoTransPara f422297o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f422298p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f422299q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(tv2.f fVar, kotlin.jvm.internal.f0 f0Var, com.tencent.mm.protocal.protobuf.FinderMediaReportObject finderMediaReportObject, long j17, java.lang.String str, boolean z17, kotlin.jvm.internal.f0 f0Var2, kotlin.jvm.internal.f0 f0Var3, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, java.lang.Object obj, kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f422289d = fVar;
        this.f422290e = f0Var;
        this.f422291f = finderMediaReportObject;
        this.f422292g = j17;
        this.f422293h = str;
        this.f422294i = z17;
        this.f422295m = f0Var2;
        this.f422296n = f0Var3;
        this.f422297o = videoTransPara;
        this.f422298p = obj;
        this.f422299q = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        int i18;
        com.tencent.mm.plugin.vlog.model.z result = (com.tencent.mm.plugin.vlog.model.z) obj;
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("Finder.LogPost.FinderMediaProcessStage", "buildFromFilePath: success " + result.f175793a);
        tv2.f fVar = this.f422289d;
        fVar.f422301i = null;
        mv2.f0.f331561a.d(result, fVar.f422300h);
        kotlin.jvm.internal.f0 f0Var = this.f422290e;
        if (result.f175793a) {
            this.f422291f.setRemuxTime((int) (android.os.SystemClock.elapsedRealtime() - this.f422292g));
            i17 = 0;
            this.f422291f.setRemuxRetCode(0);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f422292g;
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.C(1253L, 1L, elapsedRealtime);
            g0Var.C(1523L, 1L, elapsedRealtime);
            long k17 = com.tencent.mm.vfs.w6.k(this.f422293h);
            com.tencent.mars.xlog.Log.i("Finder.LogPost.FinderMediaProcessStage", "remuxer succ longvideo, size:" + k17 + ", cost: " + (android.os.SystemClock.elapsedRealtime() - this.f422292g) + ", path:" + this.f422293h + " localId:" + this.f422289d.f422300h.getLocalId());
            if (!this.f422294i) {
                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                i18 = uv2.e.f431376a.f(this.f422293h, this.f422295m.f310116d, this.f422296n.f310116d, this.f422297o, !this.f422294i);
                if (k17 > uv2.e.f431377b) {
                    this.f422291f.setZipTime((int) (android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
                    if (i18 == 0) {
                        this.f422291f.setZipRetCode(1);
                    } else {
                        this.f422291f.setZipRetCode(2);
                    }
                }
            } else if (k17 > uv2.e.f431377b) {
                com.tencent.mars.xlog.Log.i("Finder.LogPost.FinderMediaProcessStage", "remux longvideo, size out of range");
                g0Var.C(1523L, 101L, 1L);
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = this.f422289d.f422300h.field_reportObject;
                if (finderFeedReportObject != null) {
                    finderFeedReportObject.setLongVideoSizeInvalid(1);
                }
                tv2.f fVar2 = this.f422289d;
                fVar2.getClass();
                cu2.u.f222441a.l(fVar2.f422300h);
                i18 = -4;
            }
            i17 = i18;
        } else {
            com.tencent.mars.xlog.Log.i("Finder.LogPost.FinderMediaProcessStage", "remuxer failed longvideo localId:" + this.f422289d.f422300h.getLocalId() + ", isCancel:" + result.f175795c);
            com.tencent.mm.plugin.finder.report.s4 s4Var = com.tencent.mm.plugin.finder.report.s4.f125348a;
            s4Var.a(true);
            s4Var.a(true);
            this.f422291f.setRemuxTime((int) (android.os.SystemClock.elapsedRealtime() - this.f422292g));
            i17 = -1;
            this.f422291f.setRemuxRetCode(-1);
        }
        f0Var.f310116d = i17;
        java.lang.Object obj2 = this.f422298p;
        kotlin.jvm.internal.c0 c0Var = this.f422299q;
        synchronized (obj2) {
            c0Var.f310112d = true;
            obj2.notifyAll();
        }
        return jz5.f0.f302826a;
    }
}
