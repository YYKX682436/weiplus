package zl2;

/* loaded from: classes13.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f473680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f473681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473682f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zl2.e f473683g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f473684h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kotlin.jvm.internal.c0 c0Var, long j17, java.lang.String str, zl2.e eVar, kotlinx.coroutines.q qVar) {
        super(0);
        this.f473680d = c0Var;
        this.f473681e = j17;
        this.f473682f = str;
        this.f473683g = eVar;
        this.f473684h = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long t17 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_PERMISSION_DIALOG_SHOWTIME_LONG_SYNC, 0L);
        kotlin.jvm.internal.c0 c0Var = this.f473680d;
        if (!c0Var.f310112d && t17 <= this.f473681e) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCoroutineUtil", "onQuickCheck");
            pm0.z.b(xy2.b.f458155b, this.f473682f + "_notshow_quickcheck", false, null, null, false, false, null, 124, null);
            ((sb0.f) ((tb0.i) i95.n0.c(tb0.i.class))).Vi(this.f473683g);
            zl2.f.a(c0Var, this.f473684h, new com.tencent.mm.plugin.finder.assist.u0(null));
        }
        return jz5.f0.f302826a;
    }
}
