package cp2;

/* loaded from: classes2.dex */
public final class f extends td2.b implements cp2.a {

    /* renamed from: g, reason: collision with root package name */
    public final r45.qt2 f220795g;

    /* renamed from: h, reason: collision with root package name */
    public final im5.c f220796h = new im5.c();

    /* renamed from: i, reason: collision with root package name */
    public cp2.e f220797i;

    public f(r45.qt2 qt2Var) {
        this.f220795g = qt2Var;
    }

    public final void E0(cp2.l request, cp2.e callback, cp2.g gVar) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f220797i = callback;
        tq2.c.f421220i.a(request.f220837d).f421225d = java.lang.System.currentTimeMillis();
        rq2.s sVar = rq2.s.f398879a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPullType: ");
        int i17 = request.f220834a;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("FinderNearbyLiveLoadingReporter", sb6.toString());
        boolean z17 = (i17 == 1 || i17 == 0) ? false : true;
        int i18 = request.f220838e;
        if (z17) {
            rq2.s.f398885g.remove(java.lang.Integer.valueOf(i18));
        } else {
            rq2.q b17 = sVar.b(i18);
            if (b17 != null) {
                com.tencent.mars.xlog.Log.i("FinderNearbyLiveLoadingReporter", "startCgi tabType: " + i18);
                b17.f398861b = c01.id.c();
            }
        }
        new cp2.b(request, this, gVar, this.f220795g).l().f(this.f220796h);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFriendsFeedFetcher", "fetchInternal request:" + request);
    }
}
