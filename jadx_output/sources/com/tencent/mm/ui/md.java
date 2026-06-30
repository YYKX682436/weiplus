package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public final class md {
    public md(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.ui.td a(java.lang.Object tag) {
        java.lang.Object putIfAbsent;
        kotlin.jvm.internal.o.g(tag, "tag");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.ui.td.f209894d;
        java.lang.Object obj = concurrentHashMap.get(tag);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(tag, (obj = new com.tencent.mm.ui.td(null)))) != null) {
            obj = putIfAbsent;
        }
        return (com.tencent.mm.ui.td) obj;
    }
}
