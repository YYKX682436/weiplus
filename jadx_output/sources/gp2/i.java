package gp2;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f274226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f274227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f274228f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(gp2.l0 l0Var, long j17, long j18) {
        super(0);
        this.f274226d = l0Var;
        this.f274227e = j17;
        this.f274228f = j18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = gp2.l0.N;
        gp2.l0 l0Var = this.f274226d;
        com.tencent.mars.xlog.Log.i(l0Var.t(), "[NearbyEndLive] livePlayerView onLiveEndedCallback notify.");
        yz5.p pVar = l0Var.f274257p;
        if (pVar != null) {
            pVar.invoke(java.lang.Long.valueOf(this.f274227e), java.lang.Long.valueOf(this.f274228f));
        }
        return jz5.f0.f302826a;
    }
}
