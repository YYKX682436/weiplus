package je2;

/* loaded from: classes3.dex */
public final class z extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f299289f;

    /* renamed from: g, reason: collision with root package name */
    public int f299290g;

    /* renamed from: h, reason: collision with root package name */
    public int f299291h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f299289f = "LiveSeiDataSlice";
    }

    public final int N6() {
        return this.f299291h;
    }

    public final int O6() {
        return this.f299290g;
    }

    public final r45.p72 P6() {
        java.lang.String str;
        r45.p72 p72Var = new r45.p72();
        r45.v74 v74Var = ((mm2.e1) business(mm2.e1.class)).f328980g;
        if (v74Var == null || (str = v74Var.getString(3)) == null) {
            str = "";
        }
        if (str.length() == 0) {
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            str = a52.a.f1584l;
        }
        p72Var.set(0, str);
        p72Var.set(1, "LiveCdn_" + ((ml2.r0) i95.n0.c(ml2.r0.class)).Ri(((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0)));
        r45.s7 s7Var = new r45.s7();
        s7Var.set(0, java.lang.Integer.valueOf(this.f299290g));
        s7Var.set(1, java.lang.Integer.valueOf(this.f299291h));
        p72Var.set(2, s7Var);
        p72Var.set(3, java.lang.Long.valueOf(((mm2.e1) business(mm2.e1.class)).f328983m));
        p72Var.set(4, java.lang.Long.valueOf(((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0)));
        p72Var.set(5, 0);
        return p72Var;
    }

    public final void Q6(int i17, java.lang.String str) {
        try {
            long a17 = c01.id.a();
            cl0.d dVar = new cl0.d(str);
            hn0.u uVar = hn0.u.f282437e;
            R6((int) java.lang.Math.abs(a17 - (i17 == 16 ? dVar.f42846a.optLong("st", 0L) : 0L)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f299289f, "recordDelayMs " + e17.getMessage());
        }
    }

    public final void R6(int i17) {
        if (i17 != this.f299291h) {
            com.tencent.mars.xlog.Log.i(this.f299289f, "anchorDelayMs from " + this.f299291h + " to " + i17);
        }
        this.f299291h = i17;
    }

    public final void S6(int i17) {
        if (i17 != this.f299290g) {
            com.tencent.mars.xlog.Log.i(this.f299289f, "anchorStatus from " + this.f299290g + " to " + i17);
        }
        this.f299290g = i17;
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        S6(0);
        R6(0);
    }
}
