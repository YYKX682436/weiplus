package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class pu implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.SnsStarFeedOperateEvent f170281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.qu f170282e;

    public pu(com.tencent.mm.autogen.events.SnsStarFeedOperateEvent snsStarFeedOperateEvent, com.tencent.mm.plugin.sns.ui.qu quVar) {
        this.f170281d = snsStarFeedOperateEvent;
        this.f170282e = quVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$operateListener$1$callback$1");
        if (cc4.b.f40482a.a()) {
            com.tencent.mm.autogen.events.SnsStarFeedOperateEvent snsStarFeedOperateEvent = this.f170281d;
            am.yw ywVar = snsStarFeedOperateEvent.f54842g;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("event >> ");
            sb6.append(ywVar.f8485a);
            sb6.append(' ');
            sb6.append(ywVar.f8486b);
            sb6.append(' ');
            sb6.append(ywVar.f8487c);
            sb6.append(' ');
            com.tencent.mm.plugin.sns.ui.qu quVar = this.f170282e;
            sb6.append(quVar.a());
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserStarSlotHelper", sb6.toString());
            if (!kotlin.jvm.internal.o.b(quVar.a(), ywVar.f8487c)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$operateListener$1$callback$1");
                return;
            }
            int i17 = snsStarFeedOperateEvent.f54842g.f8485a;
            pb4.e eVar = pb4.e.f353196a;
            sb4.y yVar = quVar.f170361d;
            if (i17 == 1) {
                java.lang.String snsId = ywVar.f8486b;
                kotlin.jvm.internal.o.f(snsId, "snsId");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$insetStarFeed", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insetStarFeed", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                com.tencent.mm.plugin.sns.storage.SnsInfo g17 = eVar.g(com.tencent.mm.plugin.sns.storage.w2.n(snsId));
                if (g17 != null) {
                    int size = quVar.f170362e.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 >= size) {
                            i18 = -1;
                            break;
                        }
                        java.lang.Object obj = quVar.f170362e.get(i18);
                        kotlin.jvm.internal.o.f(obj, "get(...)");
                        if (((com.tencent.mm.plugin.sns.storage.SnsInfo) obj).getCreateTime() < g17.getCreateTime()) {
                            break;
                        } else {
                            i18++;
                        }
                    }
                    if (i18 != -1) {
                        if (quVar.f170362e.size() == quVar.f170364g) {
                            fp.l.b(quVar.f170362e);
                        }
                        quVar.f170362e.add(i18, g17);
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserStarSlotHelper", "insert star feed position -1 to notify");
                        yVar.x(quVar.f170362e);
                    } else if (quVar.f170362e.size() < quVar.f170364g) {
                        quVar.f170362e.add(g17);
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserStarSlotHelper", "insert star feed slotSnsList.size < slotItemNum to notify");
                        yVar.x(quVar.f170362e);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insetStarFeed", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$insetStarFeed", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
            } else if (i17 == 3) {
                java.lang.String snsId2 = ywVar.f8486b;
                kotlin.jvm.internal.o.f(snsId2, "snsId");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$findPosition", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findPosition", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                java.util.Iterator it = quVar.f170362e.iterator();
                int i19 = -1;
                while (true) {
                    if (!it.hasNext()) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findPosition", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                        i19 = -1;
                        break;
                    } else {
                        i19++;
                        if (((com.tencent.mm.plugin.sns.storage.SnsInfo) it.next()).getSnsId().equals(snsId2)) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findPosition", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                            break;
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$findPosition", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserStarSlotHelper", "Delete >> " + i19);
                if (i19 != -1) {
                    java.lang.String a17 = quVar.a();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSlotItemNum$p", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                    int i27 = quVar.f170364g;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSlotItemNum$p", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                    java.util.ArrayList h17 = eVar.h(a17, i27);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setSlotSnsList$p", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                    quVar.f170362e = h17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setSlotSnsList$p", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSlotAdapter$p", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSlotAdapter$p", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSlotSnsList$p", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                    java.util.ArrayList arrayList = quVar.f170362e;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSlotSnsList$p", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
                    yVar.x(arrayList);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$operateListener$1$callback$1");
    }
}
