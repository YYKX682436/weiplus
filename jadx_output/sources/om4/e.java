package om4;

/* loaded from: classes11.dex */
public class e implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final om4.d f346414d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f346415e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f346417g;

    /* renamed from: h, reason: collision with root package name */
    public final int f346418h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f346419i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Runnable f346420m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f346421n = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f346416f = null;

    public e(android.content.Context context, int i17, om4.d dVar) {
        this.f346415e = context;
        this.f346414d = dVar;
        this.f346418h = i17;
    }

    public void a() {
        if (this.f346417g) {
            om4.c cVar = new om4.c(this);
            this.f346420m = cVar;
            com.tencent.mm.sdk.platformtools.u3.i(cVar, 200L);
        }
        om4.a aVar = new om4.a(this);
        this.f346419i = aVar;
        com.tencent.mm.sdk.platformtools.u3.i(aVar, 60000L);
        gm0.j1.n().f273288b.a(4071, this);
        gm0.j1.n().f273288b.g(new om4.j(this.f346418h));
    }

    public final void b(boolean z17, r45.wv6 wv6Var) {
        om4.d dVar = this.f346414d;
        if (dVar != null) {
            om4.v vVar = ((om4.u) dVar).f346444a;
            if (wv6Var == null || !z17) {
                vVar.a();
            } else {
                vVar.b(wv6Var);
            }
        }
    }

    public final void c() {
        if (this.f346417g) {
            java.lang.Runnable runnable = this.f346420m;
            if (runnable != null) {
                com.tencent.mm.sdk.platformtools.u3.l(runnable);
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f346416f;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f346416f = null;
            }
        }
        com.tencent.mm.sdk.platformtools.u3.l(this.f346419i);
        gm0.j1.n().f273288b.q(4071, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckFinderManagerSwithFun", "onSceneEnd, errType = " + i17 + ", errCode = " + i18 + "," + str);
        if (!(m1Var instanceof om4.j) || m1Var.getType() != 4071) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CheckFinderManagerSwithFun", "not expected action,  type = " + m1Var.getType());
            return;
        }
        c();
        if (i17 == 0 && i18 == 0) {
            b(true, (r45.wv6) ((om4.j) m1Var).f346426e.f70711b.f70700a);
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            db5.e1.s(this.f346415e, str, "");
        }
        b(false, null);
    }
}
