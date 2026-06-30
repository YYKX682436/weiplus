package mm2;

/* loaded from: classes3.dex */
public final class c extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f328767f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f328768g;

    /* renamed from: h, reason: collision with root package name */
    public long f328769h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f328770i;

    static {
        new mm2.b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f328767f = "";
        this.f328768g = "";
        this.f328769h = -1L;
    }

    public final java.lang.String N6() {
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3713c4).getValue()).r()).intValue() == 1 ? "debug_id" : this.f328768g;
    }

    public final void O6(r45.tv1 tv1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#updateAllowanceInfo package_id=");
        jz5.f0 f0Var = null;
        sb6.append(tv1Var != null ? tv1Var.getString(0) : null);
        sb6.append(" remain_time=");
        sb6.append(tv1Var != null ? java.lang.Integer.valueOf(tv1Var.getInteger(1)) : null);
        com.tencent.mars.xlog.Log.i("AllowanceGiftSlice", sb6.toString());
        if (tv1Var != null) {
            if (!kotlin.jvm.internal.o.b(this.f328767f, tv1Var.getString(0))) {
                java.lang.String string = tv1Var.getString(0);
                if (string == null) {
                    string = "";
                }
                this.f328768g = string;
                this.f328769h = java.lang.Long.valueOf((tv1Var.getInteger(1) * 1000) + java.lang.System.currentTimeMillis()).longValue();
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            this.f328768g = "";
            this.f328769h = -1L;
        }
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        this.f328768g = "";
        this.f328769h = -1L;
    }
}
