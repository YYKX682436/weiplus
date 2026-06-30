package f65;

/* loaded from: classes10.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f259998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f259999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f260000f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f260001g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f260002h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260003i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(long j17, long j18, long j19, boolean z17, long j27, java.lang.String str) {
        super(1);
        this.f259998d = j17;
        this.f259999e = j18;
        this.f260000f = j19;
        this.f260001g = z17;
        this.f260002h = j27;
        this.f260003i = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long j17;
        r45.pz6 videoReporterWrapper = (r45.pz6) obj;
        kotlin.jvm.internal.o.g(videoReporterWrapper, "videoReporterWrapper");
        r45.qz6 qz6Var = videoReporterWrapper.f383504d;
        long j18 = this.f259998d;
        if (j18 != 0) {
            qz6Var.f384386i = j18;
        }
        long j19 = this.f259999e;
        if (j19 != 0) {
            qz6Var.f384387m = j19;
        }
        long j27 = this.f260000f;
        if (j27 != 0) {
            qz6Var.f384388n = j27;
        }
        if (qz6Var.f384384g == 0) {
            if (this.f260001g) {
                f65.x[] xVarArr = f65.x.f260004d;
                j17 = 1;
            } else {
                f65.x[] xVarArr2 = f65.x.f260004d;
                j17 = 2;
            }
            qz6Var.f384384g = j17;
        }
        long j28 = this.f260002h;
        if (j28 != 0) {
            qz6Var.f384383f = j28;
        }
        java.lang.String str = this.f260003i;
        if (str != null) {
            qz6Var.f384385h = str;
        }
        return videoReporterWrapper;
    }
}
