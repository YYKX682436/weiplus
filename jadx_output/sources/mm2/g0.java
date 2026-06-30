package mm2;

/* loaded from: classes3.dex */
public final class g0 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public int f329062f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f329063g;

    /* renamed from: h, reason: collision with root package name */
    public mm2.f0 f329064h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329065i;

    /* renamed from: m, reason: collision with root package name */
    public r45.td2 f329066m;

    /* renamed from: n, reason: collision with root package name */
    public int f329067n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f329065i = kotlinx.coroutines.flow.i3.a(java.lang.Boolean.FALSE);
    }

    public static boolean Q6(mm2.g0 g0Var, r45.o52 o52Var, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            o52Var = g0Var.P6();
        }
        g0Var.getClass();
        if (o52Var != null && o52Var.getInteger(0) == 2) {
            return true;
        }
        if (o52Var != null && o52Var.getInteger(0) == 8) {
            return true;
        }
        return o52Var != null && o52Var.getInteger(0) == 16;
    }

    public static boolean R6(mm2.g0 g0Var, r45.o52 o52Var, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            o52Var = g0Var.P6();
        }
        g0Var.getClass();
        return o52Var != null && o52Var.getInteger(0) == 8;
    }

    public final int N6(int i17) {
        if (i17 == 1) {
            r45.td2 td2Var = this.f329066m;
            if (td2Var != null) {
                return td2Var.getInteger(1);
            }
            return 0;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("anchorPreviewDuration type:");
        sb6.append(i17);
        sb6.append(",startTime:");
        sb6.append(((mm2.e1) business(mm2.e1.class)).f328988r.getInteger(4));
        sb6.append(",end_time:");
        r45.td2 td2Var2 = this.f329066m;
        sb6.append(td2Var2 != null ? java.lang.Integer.valueOf(td2Var2.getInteger(3)) : null);
        com.tencent.mars.xlog.Log.i("LiveChargeSlice", sb6.toString());
        r45.td2 td2Var3 = this.f329066m;
        int integer = (td2Var3 != null ? td2Var3.getInteger(3) : 0) - ((mm2.e1) business(mm2.e1.class)).f328988r.getInteger(4);
        if (integer < 0) {
            return 0;
        }
        return integer;
    }

    public final boolean O6() {
        if (zl2.q4.f473933a.E()) {
            com.tencent.mars.xlog.Log.i("LiveChargeSlice", "freeTimeWatchChargeLive " + this.f329067n);
        }
        return this.f329067n > 0;
    }

    public final r45.o52 P6() {
        return (r45.o52) ((mm2.e1) business(mm2.e1.class)).f328988r.getCustom(28);
    }

    public final boolean S6() {
        r45.o52 P6 = P6();
        return P6 != null && P6.getBoolean(1);
    }

    public final boolean T6() {
        return Q6(this, null, 1, null) && !S6();
    }

    public final boolean U6() {
        return !((mm2.c1) business(mm2.c1.class)).e8() || ((mm2.g0) business(mm2.g0.class)).O6();
    }

    public final void V6(java.lang.String source, r45.td2 td2Var) {
        kotlin.jvm.internal.o.g(source, "source");
        r45.td2 td2Var2 = this.f329066m;
        boolean z17 = false;
        if (td2Var2 != null && td2Var != null && ((td2Var2.getInteger(1) > 0 && td2Var.getInteger(1) > td2Var2.getInteger(1)) || (td2Var2.getInteger(3) > 0 && td2Var.getInteger(3) > td2Var2.getInteger(3)))) {
            z17 = true;
        }
        kotlinx.coroutines.flow.j2 j2Var = this.f329065i;
        if (td2Var != null) {
            this.f329066m = td2Var;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(source);
            sb6.append(" update trialInfo to:");
            sb6.append("FinderLiveUrlOption:[" + td2Var.getInteger(1) + ',' + td2Var.getInteger(3) + ']');
            sb6.append(",increaseChargeFreeTimeDuration:");
            sb6.append(((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) j2Var).getValue()).booleanValue());
            sb6.append(",notify:");
            sb6.append(z17);
            sb6.append('!');
            com.tencent.mars.xlog.Log.i("LiveChargeSlice", sb6.toString());
        }
        mm2.f0 f0Var = this.f329064h;
        if (f0Var != null) {
            df2.j0 j0Var = ((df2.c0) f0Var).f229837a;
            com.tencent.mars.xlog.Log.i(j0Var.f230440m, "increaseChargeFreeTimeDuration:" + z17 + '!');
            if (z17) {
                pm0.v.X(new df2.b0(j0Var));
            }
        }
        ((kotlinx.coroutines.flow.h3) j2Var).k(java.lang.Boolean.valueOf(z17));
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        this.f329067n = 0;
        this.f329064h = null;
    }
}
