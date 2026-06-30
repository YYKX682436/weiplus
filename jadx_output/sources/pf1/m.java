package pf1;

/* loaded from: classes7.dex */
public final class m extends com.tencent.xweb.internal.ProxyWebViewClientExtension {
    @Override // com.tencent.xweb.internal.ProxyWebViewClientExtension
    public java.lang.Object onMiscCallBack(java.lang.String str, android.os.Bundle bundle) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || bundle == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HTMLVConsoleView", "method = %s", str);
        if (kotlin.jvm.internal.o.b("onJavascriptCloseWindow", str)) {
            return java.lang.Boolean.TRUE;
        }
        return null;
    }
}
