package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public final class a5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.a5 f183894a = new com.tencent.mm.plugin.webview.ui.tools.a5();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f183895b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f183896c = new java.util.concurrent.ConcurrentHashMap();

    public final synchronized void a(java.lang.String str) {
        java.util.ArrayList arrayList = (java.util.ArrayList) f183896c.get(str);
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
        }
        f183896c.clear();
    }
}
