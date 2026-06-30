package of1;

/* loaded from: classes8.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f344914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ of1.m2 f344915e;

    public f2(of1.m2 m2Var, android.os.Bundle bundle) {
        this.f344915e = m2Var;
        this.f344914d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.permission.w wVar;
        of1.m2 m2Var = this.f344915e;
        if (m2Var.f344975e == null || (wVar = m2Var.f344976f) == null || !wVar.c().f(42)) {
            return;
        }
        m2Var.f344975e.D(this.f344914d, "download_removed");
    }
}
