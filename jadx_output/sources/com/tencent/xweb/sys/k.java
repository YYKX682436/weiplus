package com.tencent.xweb.sys;

/* loaded from: classes7.dex */
public abstract class k {
    public static android.webkit.WebResourceResponse a(com.tencent.xweb.y0 y0Var) {
        java.lang.String str;
        if (y0Var == null) {
            return null;
        }
        if (y0Var.f220627g) {
            try {
                return new android.webkit.WebResourceResponse(y0Var.f220621a, y0Var.f220622b, y0Var.f220623c, y0Var.f220624d, y0Var.f220625e, y0Var.f220626f);
            } catch (java.lang.Throwable th6) {
                by5.c4.d("SysWebDataTrans", "create webkit WebResourceResponse error", th6);
            }
        }
        android.webkit.WebResourceResponse webResourceResponse = new android.webkit.WebResourceResponse(y0Var.f220621a, y0Var.f220622b, y0Var.f220626f);
        if (y0Var.f220623c > 100 && (str = y0Var.f220624d) != null && !str.isEmpty()) {
            webResourceResponse.setStatusCodeAndReasonPhrase(y0Var.f220623c, y0Var.f220624d);
        }
        webResourceResponse.setResponseHeaders(y0Var.f220625e);
        return webResourceResponse;
    }
}
