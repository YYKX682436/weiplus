package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public final class qi extends com.tencent.mm.ui.chatting.component.a implements yn.e {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.component.oi f199786f = new com.tencent.mm.ui.chatting.component.oi(null);

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar f199787e;

    @Override // yn.d
    public void U(long j17, java.lang.String str) {
        boolean contains = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f198580d.f460708c.a(sb5.z.class))).W.contains(new com.tencent.mm.plugin.msg.MsgIdTalker(j17, str));
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgComponent", "onEditModeItemClick msgId:" + j17 + " isSelected:" + contains);
        fb0.k kVar = (fb0.k) i95.n0.c(fb0.k.class);
        java.lang.String x17 = this.f198580d.x();
        gb0.n nVar = (gb0.n) kVar;
        if (!nVar.isEnable()) {
            fb0.j jVar = nVar.f269970e;
            if (jVar != null) {
                ((com.tencent.mm.ui.chatting.component.pi) jVar).a(false);
                return;
            }
            return;
        }
        java.util.HashMap hashMap = nVar.f269969d;
        if (!contains) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgService", "updateMsgMultiSelect remove msgId:" + j17);
            hashMap.remove(java.lang.Long.valueOf(j17));
            return;
        }
        if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenMsgService", "updateMsgMultiSelect warning, msgId:" + j17);
            return;
        }
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(x17, j17);
        com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel b17 = db0.g.f227828a.b(n17);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgService", "updateMsgMultiSelect msgId:" + j17 + " msgInfo:" + n17 + " materialModel:" + b17);
        if (b17 != null) {
            hashMap.put(java.lang.Long.valueOf(j17), b17);
            com.tencent.mm.plugin.appbrand.service.k5 k5Var = (com.tencent.mm.plugin.appbrand.service.k5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k5.class);
            java.util.Collection values = hashMap.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            java.util.List S0 = kz5.n0.S0(values);
            zh1.p pVar = (zh1.p) k5Var;
            pVar.getClass();
            java.lang.String a17 = S0.isEmpty() ? "" : ai1.b.f5081a.a(S0);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = nVar.f269971f;
            if (concurrentHashMap.containsKey(a17)) {
                java.lang.Object obj = concurrentHashMap.get(a17);
                kotlin.jvm.internal.o.d(obj);
                if (((java.lang.Boolean) obj).booleanValue()) {
                    fb0.j jVar2 = nVar.f269970e;
                    if (jVar2 != null) {
                        ((com.tencent.mm.ui.chatting.component.pi) jVar2).a(true);
                        return;
                    }
                    return;
                }
                fb0.j jVar3 = nVar.f269970e;
                if (jVar3 != null) {
                    ((com.tencent.mm.ui.chatting.component.pi) jVar3).a(false);
                    return;
                }
                return;
            }
            java.util.Collection values2 = hashMap.values();
            kotlin.jvm.internal.o.f(values2, "<get-values>(...)");
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection Di = pVar.Di(kz5.n0.S0(values2));
            if (Di == null || java.lang.System.currentTimeMillis() - Di.f86253h > ((java.lang.Number) ((jz5.n) db0.d.f227824b).getValue()).longValue()) {
                java.util.Collection values3 = hashMap.values();
                kotlin.jvm.internal.o.f(values3, "<get-values>(...)");
                pVar.Bi(kz5.n0.S0(values3), new gb0.m(nVar, a17));
            }
            if (Di != null) {
                if (Di.f86252g.size() > 0) {
                    fb0.j jVar4 = nVar.f269970e;
                    if (jVar4 != null) {
                        ((com.tencent.mm.ui.chatting.component.pi) jVar4).a(true);
                        return;
                    }
                    return;
                }
                fb0.j jVar5 = nVar.f269970e;
                if (jVar5 != null) {
                    ((com.tencent.mm.ui.chatting.component.pi) jVar5).a(false);
                }
            }
        }
    }

    @Override // yn.d
    public void V(long j17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgComponent", "onEnterEditMode");
        fb0.k kVar = (fb0.k) i95.n0.c(fb0.k.class);
        com.tencent.mm.ui.chatting.component.pi piVar = new com.tencent.mm.ui.chatting.component.pi(this);
        gb0.n nVar = (gb0.n) kVar;
        nVar.getClass();
        if (nVar.isEnable()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgService", "enableMultiSelect callback:" + piVar);
            nVar.f269969d.clear();
            nVar.f269970e = piVar;
        }
    }

    @Override // yn.d
    public void X() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgComponent", "onExitLongClickMode");
        gb0.n nVar = (gb0.n) ((fb0.k) i95.n0.c(fb0.k.class));
        nVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgService", "disableMultiSelect");
        nVar.f269969d.clear();
        nVar.f269970e = null;
        nVar.f269971f.clear();
    }
}
