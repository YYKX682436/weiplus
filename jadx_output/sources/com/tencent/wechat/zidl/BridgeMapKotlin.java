package com.tencent.wechat.zidl;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001J\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tencent/wechat/zidl/BridgeMapKotlin;", "", "()V", "interfaceMap", "", "", "delete", "item", "size", "", "transfer", "handle", "className", "", "zidl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class BridgeMapKotlin {
    private final java.util.Map<java.lang.Object, java.lang.Long> interfaceMap = new java.util.HashMap();

    public final long delete(java.lang.Object item) {
        long longValue;
        kotlin.jvm.internal.o.g(item, "item");
        synchronized (com.tencent.wechat.zidl.BridgeMapKotlin.class) {
            java.lang.Long remove = this.interfaceMap.remove(item);
            kotlin.jvm.internal.o.d(remove);
            longValue = remove.longValue();
        }
        return longValue;
    }

    public final int size() {
        int size;
        synchronized (com.tencent.wechat.zidl.BridgeMapKotlin.class) {
            size = this.interfaceMap.size();
        }
        return size;
    }

    public final java.lang.Object transfer(long handle, java.lang.String className) {
        kotlin.jvm.internal.o.g(className, "className");
        synchronized (com.tencent.wechat.zidl.BridgeMapKotlin.class) {
            try {
                java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
                if (handle == 0) {
                    throw new java.lang.NullPointerException();
                }
                for (java.util.Map.Entry<java.lang.Object, java.lang.Long> entry : this.interfaceMap.entrySet()) {
                    java.lang.Object key = entry.getKey();
                    if (entry.getValue().longValue() == handle) {
                        atomicReference.set(key);
                    }
                }
                if (atomicReference.get() != null) {
                    return atomicReference.get();
                }
                try {
                    java.lang.Object obj = java.lang.Class.forName(className).getConstructor(java.lang.Long.TYPE).newInstance(java.lang.Long.valueOf(handle));
                    java.lang.Long valueOf = java.lang.Long.valueOf(handle);
                    java.util.Map<java.lang.Object, java.lang.Long> map = this.interfaceMap;
                    kotlin.jvm.internal.o.f(obj, "obj");
                    map.put(obj, valueOf);
                    return obj;
                } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                    throw new java.lang.NullPointerException();
                }
            } catch (java.lang.ClassNotFoundException unused2) {
                throw new java.lang.NullPointerException();
            }
        }
    }
}
