package of1;

/* loaded from: classes8.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f344899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ of1.m2 f344900e;

    public c2(of1.m2 m2Var, android.os.Bundle bundle) {
        this.f344900e = m2Var;
        this.f344899d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        of1.m2 m2Var = this.f344900e;
        if (m2Var.f344975e != null) {
            m2Var.f344975e.X(this.f344899d.getString("webview_network_type"));
        }
    }
}
