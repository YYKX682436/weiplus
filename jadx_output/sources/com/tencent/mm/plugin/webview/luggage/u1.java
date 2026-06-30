package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public abstract class u1 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f182627b;

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f182626a = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.LinkedList f182628c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f182629d = new java.util.HashMap();

    public static java.lang.String a(sd.u0 u0Var) {
        return "luggage_page_" + u0Var.hashCode();
    }

    public static java.util.LinkedList b() {
        java.util.LinkedList linkedList;
        synchronized (f182626a) {
            linkedList = new java.util.LinkedList(f182628c);
        }
        return linkedList;
    }
}
