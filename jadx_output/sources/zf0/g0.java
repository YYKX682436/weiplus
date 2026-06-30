package zf0;

/* loaded from: classes11.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472421e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472422f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(java.lang.String str, zf0.v0 v0Var, java.lang.String str2) {
        super(1);
        this.f472420d = str;
        this.f472421e = v0Var;
        this.f472422f = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String reason = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(reason, "reason");
        a82.u1 u1Var = (a82.u1) ((o72.q4) i95.n0.c(o72.q4.class));
        java.lang.String str = this.f472420d;
        u1Var.Ri(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.SendVideoTask", this.f472421e.id() + " stopFavDownload reason:" + reason + " tag:" + this.f472422f + " path:" + str);
        return jz5.f0.f302826a;
    }
}
