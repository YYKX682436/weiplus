package nw4;

/* loaded from: classes8.dex */
public class j1 implements android.webkit.ValueCallback {
    public j1(nw4.k1 k1Var) {
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onSearchWAWidgetReloadDataFinish back %s", (java.lang.String) obj);
    }
}
