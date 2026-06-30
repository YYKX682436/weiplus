package sx5;

/* loaded from: classes13.dex */
public class m implements android.webkit.ValueCallback {
    public m(sx5.a1 a1Var) {
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        by5.c4.b("XWebNativeInterface", "xwebToJS, videoPlay, result:" + ((java.lang.String) obj));
    }
}
