package com.tencent.mm.plugin.magicbrush;

@j95.b
/* loaded from: classes7.dex */
public final class l6 extends i95.w implements com.tencent.mm.plugin.magicbrush.h4 {
    public jc3.v Ai(java.lang.String bizName, com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key type) {
        jc3.v pVar;
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(type, "type");
        int i17 = com.tencent.mm.plugin.magicbrush.k6.f148060a[type.ordinal()];
        if (i17 == 1) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = ee3.q.f251653a;
            java.util.HashMap hashMap = ee3.q.f251655c;
            if (hashMap.containsKey(bizName)) {
                pVar = (ee3.p) hashMap.get(bizName);
                if (pVar == null) {
                    hashMap.remove(bizName);
                    pVar = new ee3.p(bizName);
                    hashMap.put(bizName, pVar);
                }
            } else {
                pVar = new ee3.p(bizName);
                hashMap.put(bizName, pVar);
            }
        } else {
            if (i17 != 2) {
                return null;
            }
            java.util.concurrent.atomic.AtomicInteger atomicInteger2 = ee3.q.f251653a;
            java.util.HashMap hashMap2 = ee3.q.f251656d;
            if (hashMap2.containsKey(bizName)) {
                pVar = (ee3.m) hashMap2.get(bizName);
                if (pVar == null) {
                    hashMap2.remove(bizName);
                    pVar = new ee3.m(bizName);
                    hashMap2.put(bizName, pVar);
                }
            } else {
                pVar = new ee3.m(bizName);
                hashMap2.put(bizName, pVar);
            }
        }
        return pVar;
    }

    public java.lang.String Bi(com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key type) {
        kotlin.jvm.internal.o.g(type, "type");
        int i17 = com.tencent.mm.plugin.magicbrush.k6.f148060a[type.ordinal()];
        if (i17 == 1) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = ee3.q.f251653a;
            return java.lang.String.valueOf(ee3.q.f251653a.incrementAndGet());
        }
        if (i17 != 2) {
            return null;
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = ee3.q.f251653a;
        return java.lang.String.valueOf(ee3.q.f251654b.incrementAndGet());
    }

    public jc3.v wi(java.lang.String bizName, com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key type) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(type, "type");
        int i17 = com.tencent.mm.plugin.magicbrush.k6.f148060a[type.ordinal()];
        if (i17 == 1) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = ee3.q.f251653a;
            java.util.HashMap hashMap = ee3.q.f251655c;
            if (hashMap.containsKey(bizName)) {
                return (jc3.v) hashMap.get(bizName);
            }
            return null;
        }
        if (i17 != 2) {
            return null;
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = ee3.q.f251653a;
        java.util.HashMap hashMap2 = ee3.q.f251656d;
        if (hashMap2.containsKey(bizName)) {
            return (jc3.v) hashMap2.get(bizName);
        }
        return null;
    }
}
