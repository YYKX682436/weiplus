package z4;

/* loaded from: classes16.dex */
public abstract class n {
    public static void a(android.webkit.WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    public static android.webkit.WebMessage b(y4.h hVar) {
        java.lang.String str = hVar.f459276b;
        y4.j[] jVarArr = hVar.f459275a;
        android.webkit.WebMessagePort[] webMessagePortArr = null;
        if (jVarArr != null) {
            int length = jVarArr.length;
            android.webkit.WebMessagePort[] webMessagePortArr2 = new android.webkit.WebMessagePort[length];
            for (int i17 = 0; i17 < length; i17++) {
                z4.a0 a0Var = (z4.a0) jVarArr[i17];
                if (a0Var.f470055a == null) {
                    z4.k0 k0Var = z4.f0.f470066a;
                    a0Var.f470055a = (android.webkit.WebMessagePort) k0Var.f470072a.convertWebMessagePort(java.lang.reflect.Proxy.getInvocationHandler(null));
                }
                webMessagePortArr2[i17] = a0Var.f470055a;
            }
            webMessagePortArr = webMessagePortArr2;
        }
        return new android.webkit.WebMessage(str, webMessagePortArr);
    }

    public static android.webkit.WebMessagePort[] c(android.webkit.WebView webView) {
        return webView.createWebMessageChannel();
    }

    public static y4.h d(android.webkit.WebMessage webMessage) {
        y4.j[] jVarArr;
        java.lang.String data = webMessage.getData();
        android.webkit.WebMessagePort[] ports = webMessage.getPorts();
        if (ports == null) {
            jVarArr = null;
        } else {
            y4.j[] jVarArr2 = new y4.j[ports.length];
            for (int i17 = 0; i17 < ports.length; i17++) {
                jVarArr2[i17] = new z4.a0(ports[i17]);
            }
            jVarArr = jVarArr2;
        }
        return new y4.h(data, jVarArr);
    }

    public static java.lang.CharSequence e(android.webkit.WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int f(android.webkit.WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    public static boolean g(android.webkit.WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    public static void h(android.webkit.WebMessagePort webMessagePort, android.webkit.WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void i(android.webkit.WebView webView, long j17, y4.l lVar) {
        webView.postVisualStateCallback(j17, new z4.m(lVar));
    }

    public static void j(android.webkit.WebView webView, android.webkit.WebMessage webMessage, android.net.Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static void k(android.webkit.WebSettings webSettings, boolean z17) {
        webSettings.setOffscreenPreRaster(z17);
    }

    public static void l(android.webkit.WebMessagePort webMessagePort, y4.i iVar) {
        webMessagePort.setWebMessageCallback(new z4.k(iVar));
    }

    public static void m(android.webkit.WebMessagePort webMessagePort, y4.i iVar, android.os.Handler handler) {
        webMessagePort.setWebMessageCallback(new z4.l(iVar), handler);
    }
}
