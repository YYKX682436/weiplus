package dk2;

/* loaded from: classes3.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    public final r45.bd5 f233197a;

    /* renamed from: b, reason: collision with root package name */
    public final long f233198b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f233199c;

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f233200d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.ya2 f233201e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f233202f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f233203g;

    public ac(r45.bd5 bd5Var, long j17, android.content.Context context, gk2.e eVar, r45.ya2 scene, yz5.a refresher) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(refresher, "refresher");
        this.f233197a = bd5Var;
        this.f233198b = j17;
        this.f233199c = context;
        this.f233200d = eVar;
        this.f233201e = scene;
        this.f233202f = refresher;
        this.f233203g = "Finder.FinderLiveProductSubscribePresenter";
    }

    public final void a() {
        r45.ld2 ld2Var;
        r45.za2 za2Var = new r45.za2();
        r45.bd5 bd5Var = this.f233197a;
        int i17 = 1;
        za2Var.set(1, java.lang.Integer.valueOf(bd5Var != null ? bd5Var.getInteger(13) : 0));
        za2Var.set(0, java.lang.Long.valueOf(this.f233198b));
        za2Var.set(2, java.lang.Integer.valueOf(this.f233201e.f390923d));
        r45.bd5 bd5Var2 = this.f233197a;
        za2Var.set(3, java.lang.Integer.valueOf(bd5Var2 != null ? bd5Var2.getInteger(15) : 0));
        gk2.e eVar = this.f233200d;
        if (eVar == null) {
            ld2Var = new r45.ld2();
        } else {
            r45.ld2 ld2Var2 = new r45.ld2();
            ld2Var2.set(3, ((mm2.c1) eVar.a(mm2.c1.class)).f328852o);
            ld2Var2.set(1, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0)));
            ld2Var2.set(0, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f328983m));
            mm2.c1 c1Var = (mm2.c1) eVar.a(mm2.c1.class);
            if (!c1Var.N7()) {
                if (c1Var.T) {
                    i17 = 3;
                } else {
                    i17 = ((mm2.n0) eVar.a(mm2.n0.class)).f329273r ? 16 : 2;
                }
            }
            ld2Var2.set(2, java.lang.Integer.valueOf(java.lang.Integer.valueOf(i17).intValue()));
            ld2Var = ld2Var2;
        }
        new ke2.o0("/cgi-bin/mmbiz-bin/finderlivesubscribeproductsaleremind", 24942, za2Var, ld2Var, null).l().K(new dk2.vb(this));
    }

    public final boolean b() {
        yg2.b bVar;
        yg2.b bVar2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type ");
        r45.bd5 bd5Var = this.f233197a;
        sb6.append(bd5Var != null ? java.lang.Integer.valueOf(bd5Var.getInteger(13)) : null);
        com.tencent.mars.xlog.Log.i(this.f233203g, sb6.toString());
        boolean z17 = bd5Var != null && bd5Var.getInteger(13) == 1;
        gk2.e eVar = this.f233200d;
        if (z17) {
            if (eVar == null || (bVar2 = eVar.f272475i) == null) {
                a();
            } else {
                kotlinx.coroutines.l.d(bVar2, null, null, new dk2.wb(this, null), 3, null);
            }
            return true;
        }
        if (!(bd5Var != null && bd5Var.getInteger(13) == 2)) {
            return false;
        }
        if (eVar == null || (bVar = eVar.f272475i) == null) {
            c();
        } else {
            kotlinx.coroutines.l.d(bVar, null, null, new dk2.xb(this, null), 3, null);
        }
        return true;
    }

    public final void c() {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(this.f233199c, 1, true);
        k0Var.t(false);
        k0Var.f211872n = new dk2.yb(this);
        k0Var.f211881s = new dk2.zb(this);
        k0Var.v();
    }

    public /* synthetic */ ac(r45.bd5 bd5Var, long j17, android.content.Context context, gk2.e eVar, r45.ya2 ya2Var, yz5.a aVar, int i17, kotlin.jvm.internal.i iVar) {
        this(bd5Var, j17, context, eVar, (i17 & 16) != 0 ? r45.ya2.SUBSCRIBE_SCENE_DEFAULT : ya2Var, aVar);
    }
}
