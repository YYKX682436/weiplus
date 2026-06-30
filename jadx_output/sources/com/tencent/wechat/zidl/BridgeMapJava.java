package com.tencent.wechat.zidl;

/* loaded from: classes5.dex */
public class BridgeMapJava {
    private java.util.Map<java.lang.Object, java.lang.Long> interfaceMap = new java.util.HashMap();

    public long delete(java.lang.Object obj) {
        long longValue;
        synchronized (com.tencent.wechat.zidl.BridgeMapJava.class) {
            longValue = this.interfaceMap.remove(obj).longValue();
        }
        return longValue;
    }

    public java.lang.Object transfer(long j17, java.lang.String str) {
        synchronized (com.tencent.wechat.zidl.BridgeMapJava.class) {
            try {
                java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
                if (j17 == 0) {
                    throw new java.lang.NullPointerException();
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
                try {
                    java.lang.Object newInstance = java.lang.Class.forName(str).getConstructor(java.lang.Long.TYPE).newInstance(java.lang.Long.valueOf(j17));
                    this.interfaceMap.put(newInstance, java.lang.Long.valueOf(j17));
                    return newInstance;
                } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                    throw new java.lang.NullPointerException();
                }
            } catch (java.lang.ClassNotFoundException unused2) {
                throw new java.lang.NullPointerException();
            }
        }
    }
}
