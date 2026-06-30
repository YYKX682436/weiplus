package com.tencent.mm.plugin.magicbrush;

@j95.b
/* loaded from: classes7.dex */
public final class i6 extends i95.w implements com.tencent.mm.plugin.magicbrush.g4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f148025d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f148026e;

    public i6() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        this.f148026e = concurrentHashMap;
        concurrentHashMap.put(com.tencent.mm.plugin.magicbrush.z4.f148220e, new ad3.b(this));
        concurrentHashMap.put(com.tencent.mm.plugin.magicbrush.z4.f148221f, new ad3.a(this));
    }

    public final void Ai(com.tencent.mm.plugin.magicbrush.z4 z4Var) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f148025d;
        if (concurrentHashMap.get(z4Var) != null) {
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) concurrentHashMap.get(z4Var);
            boolean z17 = false;
            if (concurrentLinkedQueue != null && concurrentLinkedQueue.size() == 0) {
                z17 = true;
            }
            if (!z17) {
                return;
            }
        }
        concurrentHashMap.remove(z4Var);
        com.tencent.mars.xlog.Log.i("MagicBrushJsEventExtFeatureService", "unRegister eventName:" + z4Var);
        com.tencent.mm.plugin.magicbrush.u4 u4Var = (com.tencent.mm.plugin.magicbrush.u4) this.f148026e.get(z4Var);
        if (u4Var != null) {
            u4Var.b();
        }
    }

    public void Bi(com.tencent.mm.plugin.magicbrush.z4 eventName, java.lang.String data) {
        kotlin.jvm.internal.o.g(eventName, "eventName");
        kotlin.jvm.internal.o.g(data, "data");
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) this.f148025d.get(eventName);
        if (concurrentLinkedQueue != null) {
            java.util.Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                lc3.h0 h0Var = (lc3.h0) ((com.tencent.mm.plugin.magicbrush.h6) it.next()).f148022b.get();
                if (h0Var != null) {
                    h0Var.C0(new com.tencent.mm.plugin.magicbrush.base.MBJsEventBase(eventName.name(), data));
                }
            }
        }
    }

    public synchronized void Di(java.lang.String instanceName, com.tencent.mm.plugin.magicbrush.z4 eventName) {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2;
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        kotlin.jvm.internal.o.g(eventName, "eventName");
        com.tencent.mars.xlog.Log.i("MagicBrushJsEventExtFeatureService", "unregisterEventCallback instanceName:" + instanceName + " eventName:" + eventName);
        if (eventName == com.tencent.mm.plugin.magicbrush.z4.f148219d) {
            for (java.util.Map.Entry entry : this.f148025d.entrySet()) {
                for (com.tencent.mm.plugin.magicbrush.h6 h6Var : (java.lang.Iterable) entry.getValue()) {
                    if (kotlin.jvm.internal.o.b(instanceName, h6Var.f148021a) && (concurrentLinkedQueue2 = (java.util.concurrent.ConcurrentLinkedQueue) this.f148025d.get(entry.getKey())) != null) {
                        concurrentLinkedQueue2.remove(h6Var);
                    }
                    Ai((com.tencent.mm.plugin.magicbrush.z4) entry.getKey());
                }
            }
        } else {
            java.util.concurrent.ConcurrentLinkedQueue<com.tencent.mm.plugin.magicbrush.h6> concurrentLinkedQueue3 = (java.util.concurrent.ConcurrentLinkedQueue) this.f148025d.get(eventName);
            if (concurrentLinkedQueue3 != null) {
                for (com.tencent.mm.plugin.magicbrush.h6 h6Var2 : concurrentLinkedQueue3) {
                    if (kotlin.jvm.internal.o.b(h6Var2.f148021a, instanceName) && (concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) this.f148025d.get(eventName)) != null) {
                        concurrentLinkedQueue.remove(h6Var2);
                    }
                }
            }
            Ai(eventName);
        }
    }

    public final void wi(com.tencent.mm.plugin.magicbrush.z4 z4Var) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f148025d;
        if (concurrentHashMap.get(z4Var) != null) {
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) concurrentHashMap.get(z4Var);
            boolean z17 = false;
            if (concurrentLinkedQueue != null && concurrentLinkedQueue.size() == 0) {
                z17 = true;
            }
            if (!z17) {
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MagicBrushJsEventExtFeatureService", "register eventName:" + z4Var);
        com.tencent.mm.plugin.magicbrush.u4 u4Var = (com.tencent.mm.plugin.magicbrush.u4) this.f148026e.get(z4Var);
        if (u4Var != null) {
            u4Var.a();
        }
    }
}
