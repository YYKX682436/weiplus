package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes15.dex */
public class q0 extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f158987d;

    /* renamed from: e, reason: collision with root package name */
    public final kd0.a3 f158988e;

    public q0() {
        super(0);
        this.f158987d = new java.util.HashMap();
        this.f158988e = new com.tencent.mm.plugin.scanner.model.p0(this);
    }

    public boolean b(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (iEvent == null) {
            return false;
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent) {
            zs5.g0 g0Var = zs5.g0.G;
            synchronized (g0Var.E) {
                g0Var.f475368a = 0L;
                g0Var.f475369b = false;
                g0Var.f475370c = 0;
                g0Var.f475373f = null;
                g0Var.f475374g = "";
                g0Var.f475375h = "";
                g0Var.f475376i = "";
                g0Var.f475377j = 0;
                g0Var.f475378k = 0;
                g0Var.f475379l = "";
                g0Var.f475371d = 0L;
                g0Var.f475387t = false;
                g0Var.f475382o = 0;
                g0Var.f475388u = false;
                g0Var.f475380m = 0;
                g0Var.f475381n = 0;
                g0Var.f475389v = "";
                g0Var.f475390w = 0.0f;
                g0Var.f475391x = 0;
                g0Var.f475392y = 0;
                g0Var.f475393z = 0;
                g0Var.A = 0;
                g0Var.f475383p = 0;
                g0Var.f475384q = 0;
                g0Var.f475386s = 0L;
                g0Var.B = "";
                g0Var.C = "";
                g0Var.D = "";
            }
            g0Var.f475372e = 2;
            com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = (com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent) iEvent;
            ((java.util.HashMap) this.f158987d).put(java.lang.Long.valueOf(recogQBarOfImageFileEvent.f54659g.f6174a), recogQBarOfImageFileEvent.f54659g.f6175b);
            kd0.b3 b3Var = new kd0.b3();
            am.aq aqVar = recogQBarOfImageFileEvent.f54659g;
            b3Var.f306604a = aqVar.f6174a;
            b3Var.f306605b = aqVar.f6175b;
            b3Var.f306606c = aqVar.f6176c;
            b3Var.f306607d = new int[]{0};
            b3Var.f306608e = aqVar.f6178e;
            b3Var.f306609f = aqVar.f6179f;
            b3Var.f306610g = aqVar.f6180g;
            b3Var.f306611h = aqVar.f6181h;
            b3Var.f306612i = aqVar.f6182i;
            int i17 = aqVar.f6183j;
            b3Var.f306613j = i17;
            b3Var.f306614k = (i17 == 1 || i17 == 2) ? false : true;
            zs5.u0.f475485h.b(b3Var, this.f158988e);
        } else if (iEvent instanceof com.tencent.mm.autogen.events.CancelRecogImageFileEvent) {
            zs5.g0.G.a();
            com.tencent.mm.autogen.events.CancelRecogImageFileEvent cancelRecogImageFileEvent = (com.tencent.mm.autogen.events.CancelRecogImageFileEvent) iEvent;
            zs5.u0 u0Var = zs5.u0.f475485h;
            long j17 = cancelRecogImageFileEvent.f54026g.f7686a;
            synchronized (u0Var.f475490d) {
                if (((java.util.HashMap) u0Var.f475487a).containsKey(java.lang.Long.valueOf(j17))) {
                    java.lang.String str = (java.lang.String) ((java.util.HashMap) u0Var.f475487a).get(java.lang.Long.valueOf(j17));
                    if (((java.util.HashMap) u0Var.f475489c).containsKey(str)) {
                        ((java.util.List) ((java.util.HashMap) u0Var.f475489c).get(str)).remove(java.lang.Long.valueOf(j17));
                        if (((java.util.List) ((java.util.HashMap) u0Var.f475489c).get(str)).isEmpty()) {
                            ((java.util.HashMap) u0Var.f475489c).remove(str);
                        }
                    }
                    ((java.util.HashMap) u0Var.f475487a).remove(java.lang.Long.valueOf(j17));
                    ((java.util.HashMap) u0Var.f475488b).remove(java.lang.Long.valueOf(j17));
                }
            }
            ((java.util.HashMap) this.f158987d).remove(java.lang.Long.valueOf(cancelRecogImageFileEvent.f54026g.f7686a));
        }
        return false;
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (iEvent instanceof com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent) {
            b(iEvent);
            return false;
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.CancelRecogImageFileEvent) {
            b(iEvent);
        }
        return false;
    }
}
