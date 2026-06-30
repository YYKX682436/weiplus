package me1;

/* loaded from: classes11.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ me1.g f325912d;

    public f(me1.g gVar) {
        this.f325912d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.MMActivity activityContext;
        su4.j2 j2Var = new su4.j2();
        j2Var.f412939b = 201;
        j2Var.f412940c = 262208;
        j2Var.A = !((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).wi(201, 262208);
        su4.a1 a1Var = (su4.a1) i95.n0.c(su4.a1.class);
        me1.g gVar = this.f325912d;
        activityContext = gVar.getActivityContext();
        ((com.tencent.mm.plugin.websearch.h2) a1Var).Bi(activityContext, j2Var);
        gVar.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.ui.launcher.API_openWeAppSearch$OpenSearchResponse(true));
    }
}
