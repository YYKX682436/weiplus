package rf2;

/* loaded from: classes10.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f394969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.n f394970f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f394971g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(java.lang.String str, rf2.v0 v0Var, v65.n nVar, ya2.b2 b2Var) {
        super(1);
        this.f394968d = str;
        this.f394969e = v0Var;
        this.f394970f = nVar;
        this.f394971g = b2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        c61.p2 p2Var = (c61.p2) ((c61.yb) i95.n0.c(c61.yb.class));
        java.lang.String str = this.f394968d;
        boolean rj6 = p2Var.rj(str);
        com.tencent.mars.xlog.Log.i(this.f394969e.f394916c, "follow finder " + str + " cgi success = " + booleanValue + ", isFollow = " + rj6);
        v65.n nVar = this.f394970f;
        if (booleanValue && rj6) {
            com.tencent.mm.autogen.events.FollowUserEvent followUserEvent = new com.tencent.mm.autogen.events.FollowUserEvent();
            java.lang.String D0 = this.f394971g.D0();
            am.zd zdVar = followUserEvent.f54346g;
            zdVar.f8551a = D0;
            zdVar.f8552b = 4;
            zdVar.f8553c = true;
            followUserEvent.e();
            nVar.a(java.lang.Boolean.TRUE);
        } else {
            nVar.a(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f302826a;
    }
}
