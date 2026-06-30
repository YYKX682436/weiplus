package vd2;

/* loaded from: classes3.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f435630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f435631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f435632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vd2.f1 f435633g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f435634h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f435635i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ss5.d0 f435636m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f435637n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.protocal.protobuf.FinderObject finderObject, boolean z17, android.content.Context context, vd2.f1 f1Var, android.content.Intent intent, java.lang.Object obj, ss5.d0 d0Var, com.tencent.mm.modelbase.f fVar) {
        super(0);
        this.f435630d = finderObject;
        this.f435631e = z17;
        this.f435632f = context;
        this.f435633g = f1Var;
        this.f435634h = intent;
        this.f435635i = obj;
        this.f435636m = d0Var;
        this.f435637n = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ss5.d0 d0Var = this.f435636m;
        vd2.f1 f1Var = this.f435633g;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f435630d;
        if (finderObject != null) {
            boolean z17 = this.f435631e;
            android.content.Context context = this.f435632f;
            if (!z17 || !sl2.h.f409251a.c(context, finderObject)) {
                java.lang.String username = finderObject.getUsername();
                if ((username == null || username.length() == 0) || !kotlin.jvm.internal.o.b(finderObject.getUsername(), xy2.c.e(context))) {
                    com.tencent.mars.xlog.Log.i(f1Var.f435725d, "enterLiveC2 visitor");
                    com.tencent.mm.plugin.finder.report.q5 q5Var = new com.tencent.mm.plugin.finder.report.q5();
                    q5Var.f125268a = java.lang.System.currentTimeMillis();
                    q5Var.f125273f = false;
                    com.tencent.mm.plugin.finder.report.r5.f125336b = q5Var;
                    com.tencent.mm.plugin.finder.report.q1.f125258d = null;
                    com.tencent.mm.plugin.finder.report.q1.f125256b = 0L;
                    com.tencent.mm.plugin.finder.report.q1.f125257c = 0L;
                    com.tencent.mm.plugin.finder.report.q1.f125259e = false;
                    com.tencent.mm.plugin.finder.report.q1.f125261g = true;
                    com.tencent.mm.plugin.finder.report.p1 p1Var = new com.tencent.mm.plugin.finder.report.p1();
                    p1Var.f125230a = android.os.SystemClock.elapsedRealtime();
                    com.tencent.mm.plugin.finder.report.q1.f125258d = p1Var;
                    com.tencent.mm.plugin.finder.report.q1.f125256b = 1L;
                    com.tencent.mm.plugin.finder.report.q1.f125257c = 1L;
                    p1Var.f125231b = 0L;
                    p1Var.f125232c = 0L;
                    p1Var.f125233d = 0L;
                    p1Var.f125234e = 0L;
                    p1Var.f125235f = 0L;
                    dk2.x4 x4Var = (dk2.x4) this.f435635i;
                    x4Var.f234315i = 0;
                    x4Var.A = finderObject.getId();
                    x4Var.f234318l.clear();
                    x4Var.f234318l.add(zl2.l.c(zl2.l.f473865a, this.f435630d, 0, false, 6, null));
                    i95.m c17 = i95.n0.c(c61.zb.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    int N8 = c61.zb.N8((c61.zb) c17, this.f435632f, x4Var, "", "", this.f435634h, false, null, 64, null);
                    if (N8 == 0) {
                        if (d0Var != null) {
                            d0Var.a();
                        }
                    } else if (d0Var != null) {
                        d0Var.onFailed(N8);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i(f1Var.f435725d, "enterLiveC2 anchor");
                    s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                    android.content.Intent intent = this.f435634h;
                    android.content.Context context2 = this.f435632f;
                    long id6 = finderObject.getId();
                    r45.nw1 liveInfo = finderObject.getLiveInfo();
                    java.lang.Long valueOf = java.lang.Long.valueOf(liveInfo != null ? liveInfo.getLong(0) : 0L);
                    java.lang.String objectNonceId = finderObject.getObjectNonceId();
                    if (objectNonceId == null) {
                        objectNonceId = "";
                    }
                    ((com.tencent.mm.feature.finder.live.v4) w0Var).oj(intent, context2, id6, valueOf, objectNonceId, "", "", finderObject.getSessionBuffer(), "");
                }
            }
        } else {
            java.lang.String str = f1Var.f435725d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enterLiveC2 error ");
            com.tencent.mm.modelbase.f fVar = this.f435637n;
            sb6.append(fVar.f70615a);
            sb6.append(", ");
            sb6.append(fVar.f70616b);
            com.tencent.mars.xlog.Log.w(str, sb6.toString());
            if (d0Var != null) {
                d0Var.onFailed(-1);
            }
        }
        return jz5.f0.f302826a;
    }
}
