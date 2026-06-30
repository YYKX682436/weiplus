package nw4;

/* loaded from: classes8.dex */
public class d1 implements android.webkit.ValueCallback {
    public d1(nw4.n nVar) {
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "sys:bridged back %s\t", (java.lang.String) obj);
    }
}
