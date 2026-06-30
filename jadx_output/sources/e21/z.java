package e21;

/* loaded from: classes11.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e21.e0 f246602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg3.q0 f246603e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f246604f;

    public z(e21.e0 e0Var, xg3.q0 q0Var, java.lang.String str) {
        this.f246602d = e0Var;
        this.f246603e = q0Var;
        this.f246604f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e21.e0 e0Var = this.f246602d;
        java.util.Map map = e0Var.f246511a;
        xg3.q0 q0Var = this.f246603e;
        if (((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(q0Var.f454423b)) != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OplogReportHelper", "recordFromScene: operation is exist: " + ((java.lang.String) ((java.util.LinkedHashMap) e0Var.f246511a).get(java.lang.Integer.valueOf(q0Var.f454423b))));
        }
        java.util.Map map2 = e0Var.f246511a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(q0Var.f454423b);
        java.lang.String str = this.f246604f;
        map2.put(valueOf, str);
        com.tencent.mars.xlog.Log.i("MicroMsg.OplogReportHelper", "recordFromScene: op: " + e21.a1.a(q0Var) + ", source:" + str);
    }
}
