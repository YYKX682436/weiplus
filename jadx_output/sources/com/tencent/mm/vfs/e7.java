package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class e7 implements com.tencent.mm.vfs.e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.vfs.e7 f212911a = new com.tencent.mm.vfs.e7();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f212912b = com.tencent.mm.sdk.platformtools.x2.n();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f212913c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f212914d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String[] f212915e = new java.lang.String[0];

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f212916f = new java.util.concurrent.ConcurrentHashMap();

    public final void b(java.lang.String fsName, com.tencent.mm.vfs.n1 callback) {
        kotlin.jvm.internal.o.g(fsName, "fsName");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f212916f;
        if (!concurrentHashMap.containsKey(fsName)) {
            concurrentHashMap.put(fsName, new java.util.ArrayList());
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) concurrentHashMap.get(fsName);
        if (arrayList != null) {
            arrayList.add(callback);
        }
    }

    public final java.lang.String c(java.lang.String fsName) {
        kotlin.jvm.internal.o.g(fsName, "fsName");
        com.tencent.mm.vfs.k1 k1Var = (com.tencent.mm.vfs.k1) f212913c.get(fsName);
        if (k1Var == null) {
            return null;
        }
        if (k1Var.f213025b == null) {
            k1Var.f213025b = k1Var.f213024a.a(com.tencent.mm.vfs.a3.f212781a.c());
        }
        return k1Var.f213025b;
    }
}
