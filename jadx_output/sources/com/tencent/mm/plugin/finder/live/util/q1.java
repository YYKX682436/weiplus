package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.q1 f115653a = new com.tencent.mm.plugin.finder.live.util.q1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f115654b = new java.util.concurrent.ConcurrentHashMap();

    public final java.io.Serializable a(android.content.Intent intent, java.lang.String key) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(key, "key");
        java.io.Serializable serializable = null;
        com.tencent.mm.plugin.finder.live.util.IntentBufferSameProcess$BufferShell intentBufferSameProcess$BufferShell = intent != null ? (com.tencent.mm.plugin.finder.live.util.IntentBufferSameProcess$BufferShell) intent.getParcelableExtra(key) : null;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f115654b;
        if (intentBufferSameProcess$BufferShell != null && (str2 = intentBufferSameProcess$BufferShell.f115432d) != null) {
            serializable = (java.io.Serializable) concurrentHashMap.get(str2);
        }
        if (intentBufferSameProcess$BufferShell != null && (str = intentBufferSameProcess$BufferShell.f115432d) != null) {
        }
        return serializable;
    }

    public final java.lang.String b(android.content.Intent intent, java.lang.String key, java.io.Serializable serializable) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(key, "key");
        if (serializable == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(java.util.UUID.randomUUID());
        sb6.append('_');
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append('_');
        sb6.append(gm0.j1.b().h());
        java.lang.String sb7 = sb6.toString();
        f115654b.put(sb7, serializable);
        intent.putExtra(key, new com.tencent.mm.plugin.finder.live.util.IntentBufferSameProcess$BufferShell(sb7));
        return sb7;
    }
}
