package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.core.m3 f181886a = new com.tencent.mm.plugin.webview.core.m3();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f181887b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final int f181888c = 3;

    public final void a(boolean z17, java.lang.Class stubService, com.tencent.mm.plugin.webview.core.y0 binder) {
        com.tencent.mm.plugin.webview.core.l3 l3Var;
        kotlin.jvm.internal.o.g(stubService, "stubService");
        kotlin.jvm.internal.o.g(binder, "binder");
        if (z17 && (!b(stubService).isEmpty())) {
            l3Var = (com.tencent.mm.plugin.webview.core.l3) b(stubService).pop();
            jz5.g gVar = cx4.s.f224654a;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1200L, 102L, 1L);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUIConnectionPool", "reuse service");
        } else {
            com.tencent.mm.plugin.webview.core.l3 l3Var2 = new com.tencent.mm.plugin.webview.core.l3(z17, stubService);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) stubService);
            kotlin.jvm.internal.o.d(context);
            boolean z18 = l85.j1.f317187a;
            l85.s0.f317208d.a(intent, l3Var2);
            context.bindService(intent, l3Var2, 1);
            if (z17) {
                jz5.g gVar2 = cx4.s.f224654a;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1200L, 101L, 1L);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUIConnectionPool", "bind new service");
            l3Var = l3Var2;
        }
        l3Var.getClass();
        l3Var.f181879f = binder;
        if (l3Var.f181880g != null) {
            binder.a(new com.tencent.mm.plugin.webview.core.k3(l3Var));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUIConnectionPool", "attach service");
    }

    public final java.util.LinkedList b(java.lang.Class cls) {
        java.lang.String canonicalName = cls.getCanonicalName();
        kotlin.jvm.internal.o.d(canonicalName);
        java.util.Map map = f181887b;
        java.util.LinkedList linkedList = (java.util.LinkedList) ((java.util.HashMap) map).get(canonicalName);
        if (linkedList != null) {
            return linkedList;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        ((java.util.HashMap) map).put(canonicalName, linkedList2);
        return linkedList2;
    }
}
