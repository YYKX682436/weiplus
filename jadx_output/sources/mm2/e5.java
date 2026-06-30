package mm2;

/* loaded from: classes3.dex */
public final class e5 extends mm2.e {

    /* renamed from: o, reason: collision with root package name */
    public static int f329001o = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_SPEED_INT_SYNC, 400);

    /* renamed from: f, reason: collision with root package name */
    public volatile r45.b94 f329002f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f329003g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f329004h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f329005i;

    /* renamed from: m, reason: collision with root package name */
    public final mm2.y4 f329006m;

    /* renamed from: n, reason: collision with root package name */
    public kotlinx.coroutines.r2 f329007n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        r45.b94 b94Var = new r45.b94();
        b94Var.set(0, 100);
        b94Var.set(10, java.lang.Integer.valueOf(gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_INT_SYNC, 400)));
        b94Var.set(11, java.lang.Integer.valueOf(gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_COUNT_INT_SYNC, 1)));
        b94Var.set(12, java.lang.Integer.valueOf(gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_SPEED_INT_SYNC, 400)));
        this.f329002f = b94Var;
        this.f329004h = kz5.c0.i(1, 20002, 20032, 20034, 20035, 20124);
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3("MMFinder.LiveMsgSpeedControlSlice_HANDLER");
        n3Var.setLogging(false);
        this.f329005i = n3Var;
        this.f329006m = new mm2.y4();
    }

    public final void N6(yz5.l onMsgInCacheTimeExpired) {
        kotlin.jvm.internal.o.g(onMsgInCacheTimeExpired, "onMsgInCacheTimeExpired");
        this.f329003g = onMsgInCacheTimeExpired;
    }

    public final void O6() {
        com.tencent.mars.xlog.Log.i("MMFinder.LiveMsgSpeedControlSlice", "[onMiniWindow]");
        kotlinx.coroutines.r2 r2Var = this.f329007n;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f329007n = null;
        this.f329005i.removeCallbacksAndMessages(null);
        this.f329003g = null;
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        com.tencent.mars.xlog.Log.i("MMFinder.LiveMsgSpeedControlSlice", "[onCleared]");
        kotlinx.coroutines.r2 r2Var = this.f329007n;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f329007n = null;
        this.f329005i.removeCallbacksAndMessages(null);
        pm0.v.L("MMFinder.LiveMsgSpeedControlSlice", true, new mm2.d5(this));
        this.f329003g = null;
    }
}
