package wd3;

/* loaded from: classes7.dex */
public final class a extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "startListenToEvent";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("eventName");
        com.tencent.mars.xlog.Log.i("MBJsApiStartListenToEvent", "eventName:" + optString);
        try {
            kotlin.jvm.internal.o.d(optString);
            u(com.tencent.mm.plugin.magicbrush.z4.valueOf(optString));
            s().invoke(k());
        } catch (java.lang.IllegalArgumentException unused) {
            com.tencent.mars.xlog.Log.e("MBJsApiStartListenToEvent", "eventName error");
            s().invoke(i(lc3.x.f317937d));
        }
    }

    public final void u(com.tencent.mm.plugin.magicbrush.z4 event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.plugin.magicbrush.g4 g4Var = (com.tencent.mm.plugin.magicbrush.g4) i95.n0.c(com.tencent.mm.plugin.magicbrush.g4.class);
        java.lang.String instanceName = e().f344331a;
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this.f317890a);
        com.tencent.mm.plugin.magicbrush.i6 i6Var = (com.tencent.mm.plugin.magicbrush.i6) g4Var;
        synchronized (i6Var) {
            kotlin.jvm.internal.o.g(instanceName, "instanceName");
            com.tencent.mars.xlog.Log.i("MagicBrushJsEventExtFeatureService", "registerEventCallback instanceName:" + instanceName + " eventName:" + event);
            com.tencent.mm.plugin.magicbrush.h6 h6Var = new com.tencent.mm.plugin.magicbrush.h6(instanceName, weakReference);
            i6Var.wi(event);
            if (i6Var.f148025d.get(event) == null) {
                i6Var.f148025d.put(event, new java.util.concurrent.ConcurrentLinkedQueue());
            }
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) i6Var.f148025d.get(event);
            if (concurrentLinkedQueue != null) {
                concurrentLinkedQueue.add(h6Var);
            }
        }
    }
}
