package nu4;

/* loaded from: classes7.dex */
public final class d extends com.tencent.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public wu5.c f340246d;

    /* renamed from: e, reason: collision with root package name */
    public transient boolean f340247e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nu4.b0 f340248f;

    public d(nu4.b0 b0Var) {
        this.f340248f = b0Var;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i(this.f340248f.C, "onAppBackground delay pause hashCode: " + hashCode());
        this.f340247e = true;
        wu5.c cVar = this.f340246d;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f340246d = null;
        this.f340246d = ((ku5.t0) ku5.t0.f312615d).k(new nu4.c(this.f340248f, this), 30000L);
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        nu4.b0 b0Var = this.f340248f;
        com.tencent.mars.xlog.Log.i(b0Var.C, "jsEngine resume");
        this.f340247e = false;
        wu5.c cVar = this.f340246d;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f340246d = null;
        if (b0Var.f331459w) {
            return;
        }
        b0Var.resume();
    }
}
