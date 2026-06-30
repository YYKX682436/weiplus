package dk2;

/* loaded from: classes3.dex */
public final class e9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.x4 f233362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f233364f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f233365g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f233366h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f233367i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(dk2.x4 x4Var, android.content.Context context, kotlin.jvm.internal.h0 h0Var, android.content.Intent intent, boolean z17, kotlin.jvm.internal.f0 f0Var) {
        super(1);
        this.f233362d = x4Var;
        this.f233363e = context;
        this.f233364f = h0Var;
        this.f233365g = intent;
        this.f233366h = z17;
        this.f233367i = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kn0.p pVar;
        r45.nw1 nw1Var;
        r45.nw1 nw1Var2;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.live.api.LiveConfig d17 = this.f233362d.d();
        if (d17 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("curConfig liveId: ");
            sb6.append(d17.f68537e);
            sb6.append(" lastLiveId: ");
            gk2.e eVar = gk2.e.f272471n;
            sb6.append((eVar == null || (nw1Var2 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? null : java.lang.Long.valueOf(nw1Var2.getLong(0)));
            com.tencent.mars.xlog.Log.i("Finder.LiveJumpChecker", sb6.toString());
            if (d17.f68537e != 0) {
                gk2.e eVar2 = gk2.e.f272471n;
                if ((eVar2 == null || (nw1Var = ((mm2.e1) eVar2.a(mm2.e1.class)).f328988r) == null || d17.f68537e != nw1Var.getLong(0)) ? false : true) {
                    dk2.r9 r9Var = dk2.r9.f234025a;
                    android.content.Context context = this.f233363e;
                    dk2.x4 x4Var = this.f233362d;
                    java.lang.String str = (java.lang.String) this.f233364f.f310123d;
                    android.content.Intent intent = this.f233365g;
                    boolean z17 = this.f233366h;
                    dk2.ef efVar = dk2.ef.f233372a;
                    tn0.w0 w0Var = dk2.ef.f233378d;
                    if ((w0Var == null || (pVar = w0Var.D) == null || !pVar.f()) ? false : true) {
                        java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0)) : null;
                        if (valueOf != null && valueOf.intValue() == 8) {
                            gk2.e eVar3 = gk2.e.f272471n;
                            mm2.f6 f6Var = eVar3 != null ? (mm2.f6) eVar3.a(mm2.f6.class) : null;
                            if (f6Var != null) {
                                f6Var.T6(true);
                            }
                        }
                        com.tencent.mars.xlog.Log.i("Finder.LiveJumpChecker", "enterSameVisitorLive performClickMiniWin");
                        ik1.h0.b(dk2.he.f233585d);
                    } else {
                        r9Var.k(context, x4Var, (r16 & 4) != 0 ? "" : str, (r16 & 8) != 0 ? "" : null, (r16 & 16) != 0 ? null : intent, (r16 & 32) != 0 ? false : z17);
                    }
                }
            }
            long j17 = d17.f68537e;
            kotlin.jvm.internal.f0 f0Var = this.f233367i;
            android.content.Context context2 = this.f233363e;
            if (j17 == 0 || booleanValue) {
                ym5.a1.f(new dk2.d9(context2));
                f0Var.f310116d = 2;
                com.tencent.mars.xlog.Log.i("Finder.LiveJumpChecker", java.lang.String.valueOf(context2.getResources().getString(com.tencent.mm.R.string.day)));
            } else {
                dk2.ef efVar2 = dk2.ef.f233372a;
                tn0.w0 w0Var2 = dk2.ef.f233378d;
                if (w0Var2 != null && w0Var2.X()) {
                    java.lang.String string = context2.getResources().getString(com.tencent.mm.R.string.e2h);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    ym5.a1.f(new dk2.b9(context2, string));
                    f0Var.f310116d = 2;
                    com.tencent.mars.xlog.Log.i("Finder.LiveJumpChecker", string);
                } else {
                    ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                    ml2.e4 e4Var = ml2.e4.f327381m;
                    r0Var.Qk(e4Var);
                    dk2.ef.T(efVar2, false, null, 3, null);
                    pm0.v.X(new dk2.c9(this.f233363e, this.f233362d, this.f233364f, this.f233365g, this.f233366h));
                    i95.m c17 = i95.n0.c(ml2.r0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ml2.r0.Ck((ml2.r0) c17, this.f233363e, e4Var, null, false, null, 28, null);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.w("Finder.LiveJumpChecker", "jumpVisitorLiveUI Fail! liveConfig == null !!!");
        }
        return jz5.f0.f302826a;
    }
}
