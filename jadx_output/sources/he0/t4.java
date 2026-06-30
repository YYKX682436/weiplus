package he0;

/* loaded from: classes11.dex */
public class t4 extends com.tencent.mm.sdk.event.n {
    public t4() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.MusicActionListener");
        com.tencent.mm.autogen.events.MusicActionEvent musicActionEvent = (com.tencent.mm.autogen.events.MusicActionEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.MusicActionListener");
        if (gm0.j1.a()) {
            if (musicActionEvent instanceof com.tencent.mm.autogen.events.MusicActionEvent) {
                int i17 = musicActionEvent.f54509g.f6770a;
                am.hk hkVar = musicActionEvent.f54510h;
                if (i17 == -6) {
                    com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
                    am.gk gkVar = musicActionEvent.f54509g;
                    java.lang.String str = gkVar.f6771b.f17363y;
                    boolean equals = c01.z1.r().equals(gkVar.f6771b.f17363y);
                    Fj.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserMusicTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                    android.database.Cursor f17 = Fj.f165994d.f("select *,rowid from SnsInfo " + Fj.J0(str, equals) + " AND (type = 4 OR type = 42 OR type = 47)", null, 2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (f17.moveToNext()) {
                        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
                        snsInfo.convertFrom(f17);
                        arrayList.add(snsInfo);
                    }
                    f17.close();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserMusicTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                    hkVar.f6839c = new java.util.ArrayList();
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) it.next();
                        t90.e eVar = (t90.e) i95.n0.c(t90.e.class);
                        java.lang.String Bi = com.tencent.mm.plugin.sns.model.l4.Bi();
                        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo2.getTimeLine();
                        ((s90.e) eVar).getClass();
                        ((java.util.ArrayList) hkVar.f6839c).add(b21.u.c(Bi, timeLine, 8, null));
                    }
                } else if (i17 == -5) {
                    com.tencent.mm.plugin.sns.storage.f2 Fj2 = com.tencent.mm.plugin.sns.model.l4.Fj();
                    Fj2.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAllMusicTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                    android.database.Cursor f18 = Fj2.f165994d.f("select *,rowid from SnsInfo where (type = 4 ORtype = 42 ORtype = 47) AND  (sourceType & 2 != 0 ) " + com.tencent.mm.plugin.sns.storage.f2.f165982o, null, 2);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    while (f18.moveToNext()) {
                        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3 = new com.tencent.mm.plugin.sns.storage.SnsInfo();
                        snsInfo3.convertFrom(f18);
                        arrayList2.add(snsInfo3);
                    }
                    f18.close();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllMusicTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                    hkVar.f6839c = new java.util.ArrayList();
                    java.util.Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo4 = (com.tencent.mm.plugin.sns.storage.SnsInfo) it6.next();
                        java.util.List list = hkVar.f6839c;
                        t90.e eVar2 = (t90.e) i95.n0.c(t90.e.class);
                        java.lang.String Bi2 = com.tencent.mm.plugin.sns.model.l4.Bi();
                        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine2 = snsInfo4.getTimeLine();
                        ((s90.e) eVar2).getClass();
                        ((java.util.ArrayList) list).add(b21.u.c(Bi2, timeLine2, 1, null));
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.MusicActionListener");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.MusicActionListener", "MusicActionEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.MusicActionListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.MusicActionListener");
        return false;
    }
}
