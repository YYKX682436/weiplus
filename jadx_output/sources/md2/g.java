package md2;

/* loaded from: classes8.dex */
public final class g implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f325844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ md2.h f325845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f325846f;

    public g(long j17, md2.h hVar, yz5.l lVar) {
        this.f325844d = j17;
        this.f325845e = hVar;
        this.f325846f = lVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        bw5.br req = (bw5.br) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        int i17 = req.f25797d;
        int i18 = (int) this.f325844d;
        yz5.l lVar = this.f325846f;
        if (i17 != i18) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
            return;
        }
        if (i17 == 5 || i17 == 2) {
            java.lang.String str = i17 == 5 ? "person_recent_page_close_clear_pop_close" : "person_recent_page_close_pop_close";
            com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            a4Var.b("354", b52.b.b(), str, "");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LIVE_RECENT_WATCH_SETTING_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            android.content.Context context = this.f325845e.f325847d;
            db5.t7.h(context, context.getResources().getString(com.tencent.mm.R.string.mao));
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE)));
    }
}
