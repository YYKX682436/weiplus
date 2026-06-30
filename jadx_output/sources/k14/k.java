package k14;

/* loaded from: classes15.dex */
public class k implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final k14.u f303343d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f303344e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f303345f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f303346g;

    /* renamed from: h, reason: collision with root package name */
    public final int f303347h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f303348i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Runnable f303349m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f303350n;

    /* renamed from: o, reason: collision with root package name */
    public final int f303351o;

    /* renamed from: p, reason: collision with root package name */
    public final long f303352p;

    /* renamed from: q, reason: collision with root package name */
    public final long f303353q;

    /* renamed from: r, reason: collision with root package name */
    public final long f303354r;

    /* renamed from: s, reason: collision with root package name */
    public final long f303355s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f303356t;

    public k(android.content.Context context, int i17, int i18, long j17, long j18, k14.u uVar) {
        this.f303350n = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f303356t = false;
        this.f303344e = context;
        this.f303343d = uVar;
        this.f303345f = null;
        this.f303347h = i17;
        this.f303351o = i18;
        this.f303353q = j17;
        this.f303352p = j18;
    }

    public final void a() {
        if (this.f303346g) {
            java.lang.Runnable runnable = this.f303349m;
            if (runnable != null) {
                com.tencent.mm.sdk.platformtools.u3.l(runnable);
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f303345f;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f303345f = null;
            }
        }
        com.tencent.mm.sdk.platformtools.u3.l(this.f303348i);
        gm0.j1.n().f273288b.q(4071, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckFinderManagerSwithFun", "onSceneEnd, errType = " + i17 + ", errCode = " + i18 + "," + str);
        if (!(m1Var instanceof k14.x) || m1Var.getType() != 4071) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CheckFinderManagerSwithFun", "not expected scene,  type = " + m1Var.getType());
            return;
        }
        a();
        k14.u uVar = this.f303343d;
        android.content.Context context = this.f303344e;
        if (i17 == 0 && i18 == 0) {
            r45.en0 en0Var = (r45.en0) ((k14.x) m1Var).f303401e.f70711b.f70700a;
            if (uVar != null) {
                uVar.a(context, true, en0Var);
                return;
            }
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            db5.e1.s(context, str, "");
        }
        if (uVar != null) {
            uVar.a(context, false, null);
        }
    }

    public k(android.content.Context context, int i17, int i18, long j17, long j18, k14.u uVar, boolean z17) {
        this.f303350n = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f303356t = false;
        this.f303344e = context;
        this.f303343d = uVar;
        this.f303345f = null;
        this.f303347h = i17;
        this.f303351o = i18;
        this.f303355s = j17;
        this.f303354r = j18;
        this.f303356t = z17;
    }
}
