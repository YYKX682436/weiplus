package jd0;

@j95.b
/* loaded from: classes8.dex */
public final class c extends i95.w implements kd0.e2 {
    public com.tencent.mm.ui.widget.MMWebView wi(android.content.Context context, androidx.lifecycle.y yVar, yz5.q callback) {
        com.tencent.mm.plugin.box.webview.BoxWebView boxWebView;
        boolean z17;
        androidx.lifecycle.o mo133getLifecycle;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (yVar != null && (mo133getLifecycle = yVar.mo133getLifecycle()) != null) {
            mo133getLifecycle.a(new androidx.lifecycle.f() { // from class: com.tencent.mm.feature.scanner.BoxWebViewPreloadManagerService$fetchBoxWebView$1
                @Override // androidx.lifecycle.f, androidx.lifecycle.h
                public void onDestroy(androidx.lifecycle.y owner) {
                    kotlin.jvm.internal.o.g(owner, "owner");
                    uy3.z.a(0L);
                }
            });
        }
        uy3.z zVar = uy3.z.f432002a;
        synchronized (uy3.z.f432004c) {
            boxWebView = null;
            if (uy3.z.f432003b != null) {
                com.tencent.mm.plugin.box.webview.BoxWebView boxWebView2 = uy3.z.f432003b;
                kotlin.jvm.internal.o.d(boxWebView2);
                if (!boxWebView2.f211376y) {
                    com.tencent.mm.plugin.box.webview.BoxWebView boxWebView3 = uy3.z.f432003b;
                    uy3.z.f432003b = null;
                    boxWebView = boxWebView3;
                }
            }
        }
        if (boxWebView == null) {
            boxWebView = new com.tencent.mm.plugin.box.webview.BoxWebView(context);
            z17 = false;
        } else {
            boxWebView.i(context);
            z17 = true;
        }
        callback.invoke(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(z17));
        uy3.z.b(1, 1500L);
        return boxWebView;
    }
}
