package e21;

/* loaded from: classes11.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e21.e0 f246482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg3.q0 f246483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f246484f;

    public a0(e21.e0 e0Var, xg3.q0 q0Var, int i17) {
        this.f246482d = e0Var;
        this.f246483e = q0Var;
        this.f246484f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e21.e0 e0Var = this.f246482d;
        java.util.Map map = e0Var.f246512b;
        xg3.q0 q0Var = this.f246483e;
        java.util.ArrayList arrayList = (java.util.ArrayList) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(q0Var.f454423b));
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        int i17 = this.f246484f;
        arrayList.add(java.lang.Integer.valueOf(i17));
        e0Var.f246512b.put(java.lang.Integer.valueOf(q0Var.f454423b), arrayList);
        com.tencent.mars.xlog.Log.i("MicroMsg.OplogReportHelper", "recordResult: op: " + e21.a1.a(q0Var) + ", result: " + i17);
    }
}
