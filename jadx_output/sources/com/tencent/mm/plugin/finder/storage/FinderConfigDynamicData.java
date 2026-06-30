package com.tencent.mm.plugin.finder.storage;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/storage/FinderConfigDynamicData;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/DynamicConfigUpdatedEvent;", "<init>", "()V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderConfigDynamicData extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f126368d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f126369e;

    public FinderConfigDynamicData() {
        super(com.tencent.mm.app.a0.f53288d);
        this.f126368d = "FinderConfigDynamicData";
        this.f126369e = jz5.h.b(com.tencent.mm.plugin.finder.storage.v70.f128176d);
        alive();
        this.__eventId = -443124368;
    }

    public final java.util.concurrent.ConcurrentHashMap c() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f126369e).getValue();
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent dynamicConfigUpdatedEvent) {
        com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent event = dynamicConfigUpdatedEvent;
        kotlin.jvm.internal.o.g(event, "event");
        java.util.concurrent.ConcurrentHashMap c17 = c();
        synchronized (c17) {
            for (java.util.Map.Entry entry : c17.entrySet()) {
                java.lang.Object d17 = d((java.lang.String) entry.getKey(), entry.getValue());
                com.tencent.mars.xlog.Log.i(this.f126368d, "dynamic config " + ((java.lang.String) entry.getKey()) + " update to " + d17);
            }
        }
        return false;
    }

    public final java.lang.Object d(java.lang.String str, java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.String str2 = this.f126368d;
        try {
            if (gm0.j1.s(c25.e.class) != null && ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b() != null) {
                if (obj instanceof java.lang.Integer) {
                    ip.j b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b();
                    kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
                    obj3 = java.lang.Integer.valueOf(b17.b(str, ((java.lang.Integer) obj).intValue()));
                } else if (obj instanceof java.lang.Long) {
                    ip.j b18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b();
                    kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
                    obj3 = (java.lang.Long) java.lang.Integer.valueOf(b18.b(str, ((java.lang.Integer) obj).intValue()));
                } else if (obj instanceof java.lang.String) {
                    obj3 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(str);
                    kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                    java.lang.String str3 = (java.lang.String) obj;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (obj3 == null) {
                        obj3 = str3;
                    }
                } else {
                    obj3 = obj;
                }
                java.lang.Object obj4 = obj3 == null ? null : obj3;
                if (obj4 != null) {
                    c().put(str, obj4);
                }
                com.tencent.mars.xlog.Log.i(str2, "update finderDynamicConfValue " + str + " result=" + obj3 + " defaultValue=" + obj);
                return obj3;
            }
            com.tencent.mars.xlog.Log.i(str2, "update finderDynamicConfValue keyName:" + str + ", return default " + obj);
            return obj;
        } catch (c01.c e17) {
            com.tencent.mars.xlog.Log.e(str2, "updateValue " + str + " err,defaultValue=" + obj + ", " + e17.getMessage());
            obj2 = obj != null ? obj : null;
            if (obj2 != null) {
                c().put(str, obj2);
            }
            return obj;
        } catch (java.lang.IllegalStateException e18) {
            obj2 = obj != null ? obj : null;
            if (obj2 != null) {
                c().put(str, obj2);
            }
            com.tencent.mars.xlog.Log.e(str2, "updateValue " + str + " err,defaultValue=" + obj + ", " + e18.getMessage());
            return obj;
        }
    }
}
