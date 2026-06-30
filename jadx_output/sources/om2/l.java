package om2;

/* loaded from: classes3.dex */
public final class l extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public boolean f346341f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f346342g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f346343h;

    /* renamed from: i, reason: collision with root package name */
    public r45.gw1 f346344i;

    /* renamed from: m, reason: collision with root package name */
    public r45.xw1 f346345m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f346346n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f346342g = kotlinx.coroutines.flow.r2.b(0, 1, null, 5, null);
        this.f346346n = jz5.h.b(om2.j.f346338d);
    }

    public final int N6() {
        ae2.in inVar = ae2.in.f3688a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3759h0).getValue()).r()).intValue();
    }

    public final int O6() {
        r45.xw1 xw1Var = this.f346345m;
        if (xw1Var == null) {
            return 1;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(xw1Var.getInteger(1));
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 1;
    }

    public final int P6() {
        r45.xw1 xw1Var = this.f346345m;
        if (xw1Var == null) {
            return 1;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(xw1Var.getInteger(0));
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 1;
    }

    public final int Q6() {
        r45.xw1 xw1Var = this.f346345m;
        if (xw1Var != null) {
            return xw1Var.getInteger(2);
        }
        return 1;
    }

    public final boolean R6() {
        kn0.g gVar;
        kn0.i iVar = ((mm2.e1) business(mm2.e1.class)).f328990t;
        return (((mm2.e1) business(mm2.e1.class)).b7() && (iVar != null && (gVar = iVar.f309558b) != null && gVar.f309536c == 1) && ((java.lang.Boolean) ((jz5.n) this.f346346n).getValue()).booleanValue()) && !this.f346341f;
    }

    public final boolean S6() {
        java.lang.Boolean bool = ((mm2.c1) business(mm2.c1.class)).f328847n2;
        if (!(bool != null ? bool.booleanValue() : false)) {
            return false;
        }
        r45.xw1 xw1Var = this.f346345m;
        return (xw1Var != null ? xw1Var.getInteger(4) : 0) == 1;
    }

    public final void T6(r45.gw1 gw1Var) {
        this.f346344i = gw1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set guide data: ");
        sb6.append(gw1Var != null ? gw1Var.getString(2) : null);
        sb6.append(" limitation: ");
        sb6.append(gw1Var != null ? java.lang.Integer.valueOf(gw1Var.getInteger(4)) : null);
        com.tencent.mars.xlog.Log.i("LiveKTVSlice", sb6.toString());
    }

    public final void U6(r45.xw1 xw1Var) {
        this.f346345m = xw1Var;
        zl2.q4 q4Var = zl2.q4.f473933a;
        if (q4Var.E()) {
            ae2.in inVar = ae2.in.f3688a;
            jz5.g gVar = ae2.in.f3689a0;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() > 0) {
                if (this.f346345m == null) {
                    this.f346345m = new r45.xw1();
                }
                r45.xw1 xw1Var2 = this.f346345m;
                if (xw1Var2 != null) {
                    xw1Var2.set(0, java.lang.Integer.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue()));
                }
            }
        }
        if (q4Var.E()) {
            ae2.in inVar2 = ae2.in.f3688a;
            jz5.g gVar2 = ae2.in.f3719d0;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).getValue()).r()).intValue() > 0) {
                if (this.f346345m == null) {
                    this.f346345m = new r45.xw1();
                }
                r45.xw1 xw1Var3 = this.f346345m;
                if (xw1Var3 != null) {
                    xw1Var3.set(1, java.lang.Integer.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).getValue()).r()).intValue()));
                }
            }
        }
        if (q4Var.E()) {
            ae2.in inVar3 = ae2.in.f3688a;
            jz5.g gVar3 = ae2.in.f3699b0;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).getValue()).r()).intValue() > 0) {
                if (this.f346345m == null) {
                    this.f346345m = new r45.xw1();
                }
                r45.xw1 xw1Var4 = this.f346345m;
                if (xw1Var4 != null) {
                    xw1Var4.set(2, java.lang.Integer.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).getValue()).r()).intValue()));
                }
            }
        }
        if (q4Var.E()) {
            ae2.in inVar4 = ae2.in.f3688a;
            jz5.g gVar4 = ae2.in.f3709c0;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).getValue()).r()).intValue() > 0) {
                if (this.f346345m == null) {
                    this.f346345m = new r45.xw1();
                }
                r45.xw1 xw1Var5 = this.f346345m;
                if (xw1Var5 != null) {
                    xw1Var5.set(3, java.lang.Integer.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).getValue()).r()).intValue()));
                }
            }
        }
        if (q4Var.E()) {
            if (this.f346345m == null) {
                this.f346345m = new r45.xw1();
            }
            r45.xw1 xw1Var6 = this.f346345m;
            if (xw1Var6 != null) {
                xw1Var6.set(4, java.lang.Integer.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.V).getValue()).r()).intValue() > 0 ? 1 : 0));
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateFinderLiveKtvExtInfo scoreFlag: ");
        r45.xw1 xw1Var7 = this.f346345m;
        sb6.append(xw1Var7 != null ? java.lang.Integer.valueOf(xw1Var7.getInteger(0)) : null);
        sb6.append(" reverbFlag: ");
        r45.xw1 xw1Var8 = this.f346345m;
        sb6.append(xw1Var8 != null ? java.lang.Integer.valueOf(xw1Var8.getInteger(1)) : null);
        sb6.append(" ktv_volume_strategy_flag: ");
        r45.xw1 xw1Var9 = this.f346345m;
        sb6.append(xw1Var9 != null ? java.lang.Integer.valueOf(xw1Var9.getInteger(2)) : null);
        sb6.append(" bluetoothFlag: ");
        r45.xw1 xw1Var10 = this.f346345m;
        sb6.append(xw1Var10 != null ? java.lang.Integer.valueOf(xw1Var10.getInteger(3)) : null);
        sb6.append(" singingStrategyFlag: ");
        r45.xw1 xw1Var11 = this.f346345m;
        sb6.append(xw1Var11 != null ? java.lang.Integer.valueOf(xw1Var11.getInteger(4)) : null);
        com.tencent.mars.xlog.Log.i("LiveKTVSlice", sb6.toString());
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        T6(null);
    }
}
