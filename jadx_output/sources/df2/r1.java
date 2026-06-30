package df2;

/* loaded from: classes3.dex */
public final class r1 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public ts5.d f231208m;

    /* renamed from: n, reason: collision with root package name */
    public ts5.d f231209n;

    /* renamed from: o, reason: collision with root package name */
    public int f231210o;

    /* renamed from: p, reason: collision with root package name */
    public int f231211p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f231212q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f231213r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f231214s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231212q = "";
        this.f231213r = "";
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        ts5.d dVar = this.f231208m;
        if (dVar != null) {
            dVar.cancel();
        }
        ts5.d dVar2 = this.f231209n;
        if (dVar2 != null) {
            dVar2.cancel();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveEnd() {
        super.onLiveEnd();
        ts5.d dVar = this.f231208m;
        if (dVar != null) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("sourceType", java.lang.Integer.valueOf(this.f231210o));
            linkedHashMap.put("subSourceType", java.lang.Integer.valueOf(this.f231211p));
            linkedHashMap.put("gameName", this.f231212q);
            linkedHashMap.put("gamePackage", this.f231213r);
            linkedHashMap.put("isScreenCastSuspend", java.lang.Boolean.valueOf(this.f231214s));
            dVar.a(linkedHashMap);
        }
        this.f231208m = null;
        ts5.d dVar2 = this.f231209n;
        if (dVar2 != null) {
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            linkedHashMap2.put("sourceType", java.lang.Integer.valueOf(this.f231210o));
            linkedHashMap2.put("subSourceType", java.lang.Integer.valueOf(this.f231211p));
            linkedHashMap2.put("gameName", this.f231212q);
            linkedHashMap2.put("gamePackage", this.f231213r);
            linkedHashMap2.put("isScreenCastSuspend", java.lang.Boolean.valueOf(this.f231214s));
            dVar2.a(linkedHashMap2);
        }
        this.f231209n = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        this.f231210o = ((mm2.e1) business(mm2.e1.class)).f328988r.getInteger(12);
        this.f231211p = ((mm2.e1) business(mm2.e1.class)).f328988r.getInteger(75);
        r45.xq1 xq1Var = ((mm2.c1) business(mm2.c1.class)).C2;
        java.lang.String string = xq1Var != null ? xq1Var.getString(3) : null;
        if (string == null) {
            string = "";
        }
        this.f231212q = string;
        r45.xq1 xq1Var2 = ((mm2.c1) business(mm2.c1.class)).C2;
        if (xq1Var2 != null) {
            xq1Var2.getString(2);
        }
        r45.xq1 xq1Var3 = ((mm2.c1) business(mm2.c1.class)).C2;
        java.lang.String string2 = xq1Var3 != null ? xq1Var3.getString(6) : null;
        this.f231213r = string2 != null ? string2 : "";
        ts5.d wi6 = ((nu2.i) ((ts5.n) i95.n0.c(ts5.n.class))).wi(ts5.c.f421732d, ts5.a.f421728m);
        wi6.start();
        this.f231208m = wi6;
        ts5.d wi7 = ((nu2.i) ((ts5.n) i95.n0.c(ts5.n.class))).wi(ts5.c.f421733e, ts5.a.f421729n);
        wi7.start();
        this.f231209n = wi7;
    }
}
