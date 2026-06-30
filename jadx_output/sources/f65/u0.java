package f65;

/* loaded from: classes10.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f259979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f259980e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f259981f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f259982g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f259983h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f259984i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f259985m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(boolean z17, java.lang.String str, long j17, long j18, long j19, boolean z18, long j27) {
        super(1);
        this.f259979d = z17;
        this.f259980e = str;
        this.f259981f = j17;
        this.f259982g = j18;
        this.f259983h = j19;
        this.f259984i = z18;
        this.f259985m = j27;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long j17;
        r45.pz6 videoReportWrapper = (r45.pz6) obj;
        kotlin.jvm.internal.o.g(videoReportWrapper, "videoReportWrapper");
        r45.qz6 qz6Var = videoReportWrapper.f383504d;
        qz6Var.f384385h = this.f259980e;
        qz6Var.f384386i = this.f259981f;
        qz6Var.f384388n = this.f259982g;
        qz6Var.f384387m = this.f259983h;
        if (this.f259984i) {
            f65.x[] xVarArr = f65.x.f260004d;
            j17 = 1;
        } else {
            f65.x[] xVarArr2 = f65.x.f260004d;
            j17 = 2;
        }
        qz6Var.f384384g = j17;
        qz6Var.f384383f = this.f259985m;
        videoReportWrapper.f383517t = this.f259979d ? 1 : 0;
        return videoReportWrapper;
    }
}
