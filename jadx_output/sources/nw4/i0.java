package nw4;

/* loaded from: classes.dex */
public class i0 implements android.webkit.ValueCallback {
    public i0(nw4.n nVar) {
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onTingAudioStateChanged ret value: %s", (java.lang.String) obj);
    }
}
