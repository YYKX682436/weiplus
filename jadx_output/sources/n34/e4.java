package n34;

/* loaded from: classes4.dex */
public final class e4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.SnsStarFeedOperateEvent f334591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.SnsStarListDataUIC f334592e;

    public e4(com.tencent.mm.autogen.events.SnsStarFeedOperateEvent snsStarFeedOperateEvent, com.tencent.mm.plugin.sns.SnsStarListDataUIC snsStarListDataUIC) {
        this.f334591d = snsStarFeedOperateEvent;
        this.f334592e = snsStarListDataUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.storage.SnsInfo g17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$operateListener$1$callback$1");
        com.tencent.mm.autogen.events.SnsStarFeedOperateEvent snsStarFeedOperateEvent = this.f334591d;
        am.yw ywVar = snsStarFeedOperateEvent.f54842g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("event >> ");
        sb6.append(ywVar.f8485a);
        sb6.append(' ');
        sb6.append(ywVar.f8486b);
        sb6.append(' ');
        sb6.append(ywVar.f8487c);
        sb6.append(' ');
        com.tencent.mm.plugin.sns.SnsStarListDataUIC snsStarListDataUIC = this.f334592e;
        sb6.append(com.tencent.mm.plugin.sns.SnsStarListDataUIC.R6(snsStarListDataUIC));
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarListDataUIC", sb6.toString());
        if (!kotlin.jvm.internal.o.b(com.tencent.mm.plugin.sns.SnsStarListDataUIC.R6(snsStarListDataUIC), ywVar.f8487c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$operateListener$1$callback$1");
            return;
        }
        int i17 = snsStarFeedOperateEvent.f54842g.f8485a;
        pb4.e eVar = pb4.e.f353196a;
        if (i17 == 1) {
            java.lang.String snsId = ywVar.f8486b;
            kotlin.jvm.internal.o.f(snsId, "snsId");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$insetStarFeed", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
            snsStarListDataUIC.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insetStarFeed", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
            com.tencent.mm.plugin.sns.storage.SnsInfo g18 = eVar.g(com.tencent.mm.plugin.sns.storage.w2.n(snsId));
            if (g18 != null) {
                java.util.ArrayList arrayList = snsStarListDataUIC.f162528e;
                int size = arrayList.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size) {
                        i18 = -1;
                        break;
                    }
                    java.lang.Object obj = arrayList.get(i18);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    if (((com.tencent.mm.plugin.sns.storage.SnsInfo) obj).getCreateTime() < g18.getCreateTime()) {
                        break;
                    } else {
                        i18++;
                    }
                }
                if (i18 != -1) {
                    arrayList.add(i18, g18);
                    pf5.e.launch$default(snsStarListDataUIC, null, null, new n34.a4(snsStarListDataUIC, null), 3, null);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insetStarFeed", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$insetStarFeed", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        } else if (i17 == 2) {
            java.lang.String snsId2 = ywVar.f8486b;
            kotlin.jvm.internal.o.f(snsId2, "snsId");
            int O6 = com.tencent.mm.plugin.sns.SnsStarListDataUIC.O6(snsStarListDataUIC, snsId2);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarListDataUIC", "update >> " + O6);
            if (O6 != -1 && (g17 = eVar.g(com.tencent.mm.plugin.sns.storage.w2.n(ywVar.f8486b))) != null) {
                com.tencent.mm.plugin.sns.SnsStarListDataUIC.Q6(snsStarListDataUIC).remove(O6);
                com.tencent.mm.plugin.sns.SnsStarListDataUIC.Q6(snsStarListDataUIC).add(O6, g17);
                pf5.e.launch$default(snsStarListDataUIC, null, null, new n34.d4(snsStarListDataUIC, null), 3, null);
            }
        } else if (i17 == 3) {
            java.lang.String snsId3 = ywVar.f8486b;
            kotlin.jvm.internal.o.f(snsId3, "snsId");
            int O62 = com.tencent.mm.plugin.sns.SnsStarListDataUIC.O6(snsStarListDataUIC, snsId3);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarListDataUIC", "Delete >> " + O62);
            if (O62 != -1) {
                com.tencent.mm.plugin.sns.SnsStarListDataUIC.Q6(snsStarListDataUIC).remove(O62);
                com.tencent.mm.plugin.sns.SnsStarListDataUIC snsStarListDataUIC2 = this.f334592e;
                pf5.e.launch$default(snsStarListDataUIC2, null, null, new n34.c4(snsStarListDataUIC2, null), 3, null);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$operateListener$1$callback$1");
    }
}
