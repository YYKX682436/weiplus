package dk2;

/* loaded from: classes3.dex */
public final class t8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.x4 f234112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f234113e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f234114f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f234115g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234116h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(dk2.x4 x4Var, android.content.Context context, kotlin.jvm.internal.h0 h0Var, android.content.Intent intent, java.lang.String str) {
        super(1);
        this.f234112d = x4Var;
        this.f234113e = context;
        this.f234114f = h0Var;
        this.f234115g = intent;
        this.f234116h = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.nw1 nw1Var;
        ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.live.api.LiveConfig d17 = this.f234112d.d();
        if (d17 != null) {
            long j17 = d17.f68537e;
            dk2.r9 r9Var = dk2.r9.f234025a;
            kotlin.jvm.internal.h0 h0Var = this.f234114f;
            if (j17 != 0) {
                gk2.e eVar = gk2.e.f272471n;
                if ((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null || d17.f68537e != nw1Var.getLong(0)) ? false : true) {
                    dk2.r9.i(r9Var, this.f234113e, this.f234112d, (java.lang.String) h0Var.f310123d, null, this.f234115g, 8, null);
                }
            }
            boolean rk6 = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).rk();
            android.content.Context context = this.f234113e;
            if (rk6) {
                android.content.Intent intent = this.f234115g;
                if (!(intent != null && intent.hasExtra("KEY_PARAMS_POST_CREATE_LIVE"))) {
                    if (!(intent != null && intent.hasExtra("KEY_PARAMS_POST_CREATE_LIVE_FROM_SIDEBAR"))) {
                        db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.cmy), 0).show();
                        com.tencent.mars.xlog.Log.i("Finder.LiveJumpChecker", java.lang.String.valueOf(context.getResources().getString(com.tencent.mm.R.string.cmy)));
                    }
                }
                r9Var.h(this.f234113e, this.f234112d, (java.lang.String) h0Var.f310123d, this.f234116h, this.f234115g);
            } else if (((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk()) {
                db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.day), 0).show();
                com.tencent.mars.xlog.Log.i("Finder.LiveJumpChecker", java.lang.String.valueOf(context.getResources().getString(com.tencent.mm.R.string.day)));
            }
        } else {
            com.tencent.mars.xlog.Log.w("Finder.LiveJumpChecker", "jumpAnchorLiveUI Fail! liveConfig == null !!!");
        }
        return jz5.f0.f302826a;
    }
}
