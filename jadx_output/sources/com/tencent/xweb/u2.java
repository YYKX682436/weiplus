package com.tencent.xweb;

/* loaded from: classes13.dex */
public class u2 extends com.tencent.xweb.i0 {
    @Override // com.tencent.xweb.i0
    public void a(com.tencent.xweb.e0 e0Var, java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        java.util.List unmodifiableList = java.util.Collections.unmodifiableList(e0Var.f220258a);
        java.lang.String[][] strArr = (java.lang.String[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.String.class, unmodifiableList.size(), 2);
        for (int i17 = 0; i17 < unmodifiableList.size(); i17++) {
            strArr[i17][0] = ((com.tencent.xweb.d0) unmodifiableList.get(i17)).f220237a;
            strArr[i17][1] = ((com.tencent.xweb.d0) unmodifiableList.get(i17)).f220238b;
        }
        java.lang.String[] strArr2 = (java.lang.String[]) java.util.Collections.unmodifiableList(e0Var.f220259b).toArray(new java.lang.String[0]);
        boolean a17 = com.tencent.xweb.k1.a("PROXY_OVERRIDE");
        com.tencent.xweb.f1 f1Var = com.tencent.xweb.f1.WV_KIND_PINUS;
        if (a17) {
            if (!com.tencent.xweb.WebView.f220193q) {
                by5.s0.e(1749L, 84L, 1L);
                throw new java.lang.IllegalStateException("WebViewFeature.PROXY_OVERRIDE Supported, ReverseBypass Disabled, XWebCore is not inited!");
            }
            tx5.h b17 = tx5.j.b(f1Var);
            if (b17 != null) {
                b17.invokeRuntimeChannel(80026, new java.lang.Object[]{strArr, strArr2, runnable, executor});
                by5.s0.e(1749L, 83L, 1L);
                return;
            }
            return;
        }
        if (!com.tencent.xweb.k1.a("PROXY_OVERRIDE") || !com.tencent.xweb.k1.a(org.chromium.support_lib_boundary.util.Features.PROXY_OVERRIDE_REVERSE_BYPASS)) {
            by5.s0.e(1749L, 84L, 1L);
            throw new java.lang.IllegalStateException("WebViewFeature.PROXY_OVERRIDE Unsupported");
        }
        if (!com.tencent.xweb.WebView.f220193q) {
            by5.s0.e(1749L, 87L, 1L);
            throw new java.lang.IllegalStateException("WebViewFeature.PROXY_OVERRIDE Supported, ReverseBypass Enabled, WebViewFeature.PROXY_OVERRIDE_REVERSE_BYPASS Supported, XWebCore is not inited!");
        }
        tx5.h b18 = tx5.j.b(f1Var);
        if (b18 != null) {
            b18.invokeRuntimeChannel(80028, new java.lang.Object[]{strArr, strArr2, runnable, executor, java.lang.Boolean.FALSE});
            by5.s0.e(1749L, 86L, 1L);
        }
    }
}
