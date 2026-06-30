package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes8.dex */
public abstract class k8 {

    /* renamed from: a, reason: collision with root package name */
    public static final android.util.SparseArray f185237a = new android.util.SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185238b = null;

    public static com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a(int i17) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var;
        synchronized (com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.class) {
            android.util.SparseArray sparseArray = f185237a;
            if (sparseArray.get(i17) == null) {
                sparseArray.put(i17, new com.tencent.mm.plugin.webview.ui.tools.jsapi.c1(i17));
            }
            c1Var = (com.tencent.mm.plugin.webview.ui.tools.jsapi.c1) sparseArray.get(i17);
            f185238b = c1Var;
        }
        return c1Var;
    }

    public static com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 b() {
        if (f185238b == null) {
            f185238b = new com.tencent.mm.plugin.webview.ui.tools.jsapi.c1(0);
        }
        return f185238b;
    }
}
