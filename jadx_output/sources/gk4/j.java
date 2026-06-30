package gk4;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.r f272583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f272584e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hk4.a f272585f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(gk4.r rVar, long j17, hk4.a aVar) {
        super(0);
        this.f272583d = rVar;
        this.f272584e = j17;
        this.f272585f = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i(this.f272583d.f272602g, "seek firstPlayer:" + this.f272584e + " finished, isPlaying:" + this.f272585f.a());
        if (this.f272585f.a()) {
            this.f272583d.f272611p = gk4.e.f272543e;
            this.f272583d.l();
        }
        return jz5.f0.f302826a;
    }
}
