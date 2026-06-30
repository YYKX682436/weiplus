package nw4;

/* loaded from: classes8.dex */
public class t0 implements android.webkit.ValueCallback {
    public t0(nw4.n nVar) {
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "sys:init back %s\t", (java.lang.String) obj);
    }
}
