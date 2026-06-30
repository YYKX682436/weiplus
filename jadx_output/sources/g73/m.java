package g73;

/* loaded from: classes8.dex */
public final class m extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g73.n f269288a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.os.Looper looper, g73.n nVar) {
        super(looper);
        this.f269288a = nVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        java.util.Map map;
        kotlin.jvm.internal.o.g(msg, "msg");
        if (msg.what == 1) {
            g73.n nVar = this.f269288a;
            java.util.Map map2 = nVar.f269307b;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) map2;
            java.util.Iterator it = linkedHashMap2.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                map = nVar.f269308c;
                if (!hasNext) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (kotlin.jvm.internal.o.b(((java.util.LinkedHashMap) map).get((java.lang.String) entry.getKey()), java.lang.Boolean.TRUE)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            try {
                java.util.Iterator it6 = linkedHashMap.values().iterator();
                while (it6.hasNext()) {
                    com.tencent.mm.plugin.handoff.model.HandOff rb6 = ((d73.i) i95.n0.c(d73.i.class)).rb(((com.tencent.mm.plugin.handoff.model.HandOff) it6.next()).getId());
                    if (rb6 != null) {
                        com.tencent.mm.plugin.multitask.model.MultiTaskInfo bj6 = ((com.tencent.mm.plugin.multitask.i1) ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class))).bj(rb6.getKey(), nVar.a(rb6));
                        if (bj6 != null) {
                            com.tencent.mars.xlog.Log.i("HandOff.RequestProcessor", "processDelRequest multiTask");
                            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.multitask.j0.class);
                            kotlin.jvm.internal.o.f(c17, "getService(...)");
                            com.tencent.mm.plugin.multitask.j0.We((com.tencent.mm.plugin.multitask.j0) c17, bj6.field_id, bj6.field_type, false, 4, null);
                            ((d73.i) i95.n0.c(d73.i.class)).k8();
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                e17.getLocalizedMessage();
            }
            java.util.Map map3 = nVar.f269306a;
            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
            java.util.LinkedHashMap linkedHashMap4 = (java.util.LinkedHashMap) map3;
            for (java.util.Map.Entry entry2 : linkedHashMap4.entrySet()) {
                if (kotlin.jvm.internal.o.b(((java.util.LinkedHashMap) map).get((java.lang.String) entry2.getKey()), java.lang.Boolean.FALSE)) {
                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                }
            }
            try {
                for (com.tencent.mm.plugin.handoff.model.HandOff handOff : linkedHashMap3.values()) {
                    jz5.l createMultiTaskInfo = handOff.createMultiTaskInfo();
                    if (createMultiTaskInfo != null) {
                        int a17 = nVar.a(handOff);
                        com.tencent.mars.xlog.Log.i("HandOff.RequestProcessor", "processAddRequest multiTask");
                        ((com.tencent.mm.plugin.multitask.i1) ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class))).wi(handOff.getKey(), a17, (r45.lr4) createMultiTaskInfo.f302833d, (byte[]) createMultiTaskInfo.f302834e, new mk3.a(null, false, false, 7, null));
                        ((d73.i) i95.n0.c(d73.i.class)).k8();
                    }
                }
            } catch (java.lang.Exception e18) {
                e18.getLocalizedMessage();
            }
            linkedHashMap4.clear();
            linkedHashMap2.clear();
            ((java.util.LinkedHashMap) map).clear();
        }
    }
}
