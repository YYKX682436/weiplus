package my3;

/* loaded from: classes13.dex */
public final class p implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my3.q f332818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332820f;

    public p(my3.q qVar, java.lang.String str, java.lang.String str2) {
        this.f332818d = qVar;
        this.f332819e = str;
        this.f332820f = str2;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        int i17 = ((com.tencent.mm.ipcinvoker.type.IPCInteger) obj).f68404d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "try auto login errorCode " + i17);
        if (i17 == -3) {
            rk0.c.a("MicroMsg.Rtos.UnbindReport", "reportUnbindReason: 8", new java.lang.Object[0]);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(26126, 3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 8, 0);
            return;
        }
        my3.q qVar = this.f332818d;
        if (i17 == 0) {
            qVar.f332824g.f313617d = 1;
        } else if (i17 != 1) {
            qVar.f332824g.f313617d = 8;
        } else {
            qVar.f332824g.f313617d = 1;
        }
        if (qVar.f332824g.f313617d == 1) {
            java.lang.String str = this.f332819e;
            my3.q.Bi(qVar, str, this.f332820f);
            qVar.Ri(fy3.i.f267251m);
            qVar.mj();
            fy3.f fVar = qVar.f332833s;
            if (fVar != null) {
                ((oy3.t) fVar).c();
            }
            hy3.a aVar = hy3.b.f286071a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (aVar.b(context)) {
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                qVar.ij(aVar.a(context2, str), "", false);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosServiceImpl", "bluetooth is not enable");
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "try auto login fail, clear");
            if (i17 == -2) {
                qVar.Zi(9);
            } else if (i17 != -1) {
                qVar.Zi(5);
            } else {
                qVar.Zi(7);
            }
        }
        qVar.hj(qVar.f332824g);
    }
}
