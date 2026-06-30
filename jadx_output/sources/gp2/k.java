package gp2;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f274233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f274234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f274235f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(gp2.l0 l0Var, long j17, long j18) {
        super(0);
        this.f274233d = l0Var;
        this.f274234e = j17;
        this.f274235f = j18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gp2.l0 l0Var = this.f274233d;
        com.tencent.mars.xlog.Log.i(l0Var.t(), "[NearbyEndLive] livePlayerView liveStatus end notify.");
        yz5.p pVar = l0Var.f274257p;
        if (pVar != null) {
            pVar.invoke(java.lang.Long.valueOf(this.f274234e), java.lang.Long.valueOf(this.f274235f));
        }
        return jz5.f0.f302826a;
    }
}
