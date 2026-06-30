package sw4;

/* loaded from: classes7.dex */
public class i implements sw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.ipc.IpcProxyUI f413486a;

    public i(com.tencent.mm.plugin.webview.luggage.ipc.IpcProxyUI ipcProxyUI) {
        this.f413486a = ipcProxyUI;
    }

    @Override // sw4.e
    public void a(android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("input_data", bundle);
        intent.putExtra("event_type", true);
        com.tencent.mm.plugin.webview.luggage.ipc.IpcProxyUI ipcProxyUI = this.f413486a;
        ipcProxyUI.setResult(-1, intent);
        ipcProxyUI.finish();
    }

    @Override // sw4.e
    public void f(android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("input_data", bundle);
        com.tencent.mm.plugin.webview.luggage.ipc.IpcProxyUI ipcProxyUI = this.f413486a;
        ipcProxyUI.setResult(-1, intent);
        ipcProxyUI.finish();
    }
}
