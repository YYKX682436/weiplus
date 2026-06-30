package sx4;

/* loaded from: classes8.dex */
public class g extends sx4.v {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sx4.q f413607g;

    public g(sx4.q qVar) {
        this.f413607g = qVar;
    }

    @Override // sx4.v
    public void b(android.os.Bundle bundle) {
        try {
            com.tencent.mm.plugin.webview.stub.v0 v0Var = this.f413607g.f413642f;
            if (v0Var == null || bundle == null) {
                return;
            }
            v0Var.i(96, bundle);
        } catch (android.os.RemoteException unused) {
        }
    }
}
