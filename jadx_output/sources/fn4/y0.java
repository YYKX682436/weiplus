package fn4;

/* loaded from: classes15.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f264625d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f264626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn4.z0 f264627f;

    public y0(fn4.z0 z0Var, fn4.t0 t0Var) {
        this.f264627f = z0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        fn4.z0 z0Var = this.f264627f;
        try {
            fn4.z0.a(z0Var, new org.json.JSONObject(this.f264625d), this.f264626e);
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            z0Var.f264632b = false;
            throw th6;
        }
        z0Var.f264632b = false;
    }
}
