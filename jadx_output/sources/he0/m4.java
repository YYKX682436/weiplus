package he0;

/* loaded from: classes4.dex */
public class m4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderPostStatusEvent f280756d;

    public m4(he0.n4 n4Var, com.tencent.mm.autogen.events.FinderPostStatusEvent finderPostStatusEvent) {
        this.f280756d = finderPostStatusEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine;
        r45.a90 a90Var;
        r45.kv2 kv2Var;
        r45.kv2 kv2Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.feature.sns.listener.FinderPostFinishListener$1");
        com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
        Fj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findoutHoldingFeed", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = Fj.f165994d.f("select *,rowid from SnsInfo  where " + com.tencent.mm.plugin.sns.storage.f2.f165987t, null, 2);
        while (f17.moveToNext()) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
            snsInfo.convertFrom(f17);
            arrayList.add(snsInfo);
        }
        f17.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findoutHoldingFeed", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) it.next();
            if (snsInfo2 != null && (timeLine = snsInfo2.getTimeLine()) != null && (a90Var = timeLine.ContentObj) != null && (kv2Var = a90Var.f369844o) != null) {
                long j17 = kv2Var.getLong(9);
                am.vc vcVar = this.f280756d.f54316g;
                if (j17 == vcVar.f8188a) {
                    if (!vcVar.f8189b || (kv2Var2 = vcVar.f8190c) == null) {
                        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
                        s0Var.u().f57824g = 1L;
                        s0Var.b();
                        s0Var.R = 0;
                        snsInfo2.cleanPostHolding();
                        snsInfo2.setItemDie();
                    } else {
                        timeLine.ContentObj.f369844o = kv2Var2;
                        com.tencent.mm.autogen.mmdata.rpt.FinderShareMomentReportStruct u17 = com.tencent.mm.plugin.sns.statistics.s0.f164937k0.u();
                        u17.f57822e = u17.b("Feedid", timeLine.ContentObj.f369844o.getString(0), true);
                        snsInfo2.setTimeLine(timeLine);
                        snsInfo2.cleanPostHolding();
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18941, "", 5, 1, "", timeLine.ContentObj.f369844o.getString(0));
                    }
                    com.tencent.mm.plugin.sns.model.l4.Fj().V2(snsInfo2);
                    com.tencent.mm.plugin.sns.model.l4.Nj().d();
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.feature.sns.listener.FinderPostFinishListener$1");
    }
}
