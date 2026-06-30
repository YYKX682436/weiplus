package sx4;

/* loaded from: classes8.dex */
public class s extends com.tencent.mm.plugin.webview.ui.tools.widget.s3 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sx4.t f413656e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(sx4.t tVar, sx4.r rVar) {
        super(tVar);
        this.f413656e = tVar;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.s3, android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameFloatWebViewClient", "onServiceConnected");
        sx4.t tVar = this.f413656e;
        if (tVar.f187549b == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameFloatWebViewClient", "onServiceConnected, activity destroyed");
            return;
        }
        try {
            tVar.f187551d = com.tencent.mm.plugin.webview.stub.t0.d(iBinder);
            tVar.f187551d.rg(tVar.B, tVar.f187549b.hashCode());
            tVar.J();
            com.tencent.mm.plugin.webview.stub.v0 v0Var = tVar.f187551d;
            com.tencent.mm.plugin.webview.permission.w wVar = tVar.f187552e;
            ((sx4.p) tVar).C.f413642f = v0Var;
            tVar.L();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameFloatWebViewClient", "addCallback fail, ex = %s", e17.getMessage());
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.s3, android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        super.onServiceDisconnected(componentName);
    }
}
