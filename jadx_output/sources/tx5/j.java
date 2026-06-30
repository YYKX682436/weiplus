package tx5;

/* loaded from: classes13.dex */
public abstract class j {
    public static tx5.f a(com.tencent.xweb.f1 f1Var, com.tencent.xweb.WebView webView) {
        int i17;
        tx5.i c17;
        by5.c4.a("XWebViewProviderWrapper", "getWebView, try to create webview type = " + f1Var);
        by5.q c18 = by5.q.c("CREATE_WEBVIEW", f1Var);
        c18.g();
        tx5.f fVar = null;
        try {
            c17 = c(f1Var);
        } catch (java.lang.Throwable th6) {
            com.tencent.xweb.n1 n1Var = by5.s0.f36595c;
            if (n1Var != null) {
                if (f1Var != com.tencent.xweb.f1.WV_KIND_CW && f1Var != com.tencent.xweb.f1.WV_KIND_PINUS) {
                    i17 = f1Var == com.tencent.xweb.f1.WV_KIND_SYS ? 84 : 86;
                }
                n1Var.b(577L, i17, 1L);
            }
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(th6);
            by5.q.a(stackTraceString);
            by5.c4.a("XWebViewProviderWrapper", "getWebView, create webview error:" + stackTraceString);
            xx5.g.a(2, stackTraceString, f1Var.ordinal(), "");
        }
        if (c17 == null) {
            by5.c4.a("XWebViewProviderWrapper", "getWebView, provider not exist");
            return null;
        }
        fVar = c17.b(webView);
        if (fVar != null) {
            by5.c4.a("XWebViewProviderWrapper", "getWebView, create webview success");
            c18.f();
        } else {
            by5.c4.a("XWebViewProviderWrapper", "getWebView, create webview failed");
        }
        return fVar;
    }

    public static tx5.h b(com.tencent.xweb.f1 f1Var) {
        tx5.i c17 = c(f1Var);
        if (c17 != null) {
            return c17.g();
        }
        by5.c4.c("XWebViewProviderWrapper", "Get core failed, provider is null.");
        return null;
    }

    public static tx5.i c(com.tencent.xweb.f1 f1Var) {
        if (f1Var == com.tencent.xweb.f1.WV_KIND_SYS) {
            return com.tencent.xweb.sys.p.f220568a;
        }
        if (f1Var == com.tencent.xweb.f1.WV_KIND_PINUS) {
            return vx5.w.f441395a;
        }
        return null;
    }

    public static java.lang.Object d(int i17, java.lang.Object[] objArr) {
        try {
            tx5.h b17 = b(com.tencent.xweb.WebView.getCurrentModuleWebCoreType());
            if (b17 != null) {
                return b17.invokeRuntimeChannel(i17, objArr);
            }
            by5.c4.c("XWebViewProviderWrapper", "Invoke current runtime failed, core is null.");
            return null;
        } catch (java.lang.Throwable unused) {
            by5.c4.c("XWebViewProviderWrapper", "Invoke current runtime failed. [cmd:" + i17 + "][params:" + java.util.Arrays.toString(objArr) + "]");
            return null;
        }
    }
}
