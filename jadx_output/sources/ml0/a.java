package ml0;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ml0.b f327184d;

    public a(ml0.b bVar) {
        this.f327184d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f327184d.a()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = this.f327184d.c() != null ? this.f327184d.c() : "";
            com.tencent.mars.xlog.Log.e("Kara.BaseCollector", "%s no working", objArr);
            return;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        objArr2[0] = this.f327184d.c() != null ? this.f327184d.c() : "";
        com.tencent.mars.xlog.Log.i("Kara.BaseCollector", "%s finish working", objArr2);
        ku5.u0 u0Var = ku5.t0.f312615d;
        ml0.b bVar = this.f327184d;
        java.lang.Runnable runnable = bVar.f327185a;
        long b17 = bVar.b() == 0 ? 1800000L : this.f327184d.b();
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        java.util.Objects.requireNonNull(runnable);
        t0Var.t(runnable, b17, null);
    }
}
