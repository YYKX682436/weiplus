package nw4;

/* loaded from: classes8.dex */
public class l1 implements android.webkit.ValueCallback {
    public l1(nw4.n nVar) {
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "sys:updateRandomStr back %s\t", (java.lang.String) obj);
    }
}
