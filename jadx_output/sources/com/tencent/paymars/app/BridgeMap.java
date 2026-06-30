package com.tencent.paymars.app;

/* loaded from: classes5.dex */
public class BridgeMap {
    protected java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Long> interfaceMap = new java.util.concurrent.ConcurrentHashMap<>();

    public long delete(java.lang.Object obj) {
        long longValue;
        synchronized (com.tencent.paymars.app.BridgeMap.class) {
            longValue = this.interfaceMap.remove(obj).longValue();
        }
        return longValue;
    }

    public void put(long j17, java.lang.Object obj) {
        synchronized (com.tencent.paymars.app.BridgeMap.class) {
            this.interfaceMap.put(obj, java.lang.Long.valueOf(j17));
        }
    }

    public java.lang.Object transfer(long j17, java.lang.String str) {
        synchronized (com.tencent.paymars.app.BridgeMap.class) {
            try {
                try {
                    java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
                    if (j17 == 0) {
                        return null;
                    }
                    for (java.util.Map.Entry<java.lang.Object, java.lang.Long> entry : this.interfaceMap.entrySet()) {
                        java.lang.Object key = entry.getKey();
                        if (entry.getValue().longValue() == j17) {
                            atomicReference.set(key);
                        }
                    }
                    if (atomicReference.get() != null) {
                        return atomicReference.get();
                    }
                    java.lang.Object newInstance = java.lang.Class.forName(str).getConstructor(java.lang.Long.TYPE).newInstance(java.lang.Long.valueOf(j17));
                    this.interfaceMap.put(newInstance, java.lang.Long.valueOf(j17));
                    return newInstance;
                } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                    return null;
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
    }
}
