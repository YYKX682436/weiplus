package nu4;

/* loaded from: classes7.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu4.b0 f340242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu4.d f340243e;

    public c(nu4.b0 b0Var, nu4.d dVar) {
        this.f340242d = b0Var;
        this.f340243e = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f340242d.C;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAppBackground delay run isBackground: %s, hashCode: ");
        nu4.d dVar = this.f340243e;
        sb6.append(dVar.hashCode());
        com.tencent.mars.xlog.Log.i(str, sb6.toString(), java.lang.Boolean.valueOf(dVar.f340247e));
        if (dVar.f340247e) {
            nu4.b0 b0Var = dVar.f340248f;
            if (b0Var.f331459w) {
                return;
            }
            b0Var.pause();
        }
    }
}
