package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class lt implements com.tencent.mm.plugin.sns.ui.bj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUIAction f169876a;

    public lt(com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction) {
        this.f169876a = snsUIAction;
    }

    public boolean a(long j17, boolean z17) {
        boolean z18;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLike", "com.tencent.mm.plugin.sns.ui.SnsUIAction$2");
        com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction = this.f169876a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsActivity", "friend like %s, %s, %s", com.tencent.mm.plugin.sns.ui.SnsUIAction.d(snsUIAction), java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(z17));
        if (com.tencent.mm.storage.z3.m4(com.tencent.mm.plugin.sns.ui.SnsUIAction.d(snsUIAction))) {
            if (z17) {
                com.tencent.mm.plugin.sns.storage.d2 J0 = com.tencent.mm.plugin.sns.model.l4.Ej().J0(com.tencent.mm.plugin.sns.ui.SnsUIAction.d(snsUIAction));
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.o3(com.tencent.mm.plugin.sns.ui.SnsUIAction.d(snsUIAction), J0));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLike", "com.tencent.mm.plugin.sns.storage.SnsExt");
                J0.field_local_flag |= 2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLike", "com.tencent.mm.plugin.sns.storage.SnsExt");
                com.tencent.mm.plugin.sns.model.l4.Ej().u1(J0);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsActivity", "openIM friend like %s", com.tencent.mm.plugin.sns.ui.SnsUIAction.d(snsUIAction));
        } else {
            if (z17) {
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = new com.tencent.mm.plugin.sns.storage.SnsInfo();
                snsInfo2.field_snsId = j17;
                snsInfo2.field_userName = com.tencent.mm.plugin.sns.ui.SnsUIAction.d(snsUIAction);
                com.tencent.mm.protocal.protobuf.TimeLineObject i17 = m21.y.i();
                i17.UserName = com.tencent.mm.plugin.sns.ui.SnsUIAction.d(snsUIAction);
                snsInfo2.setTimeLine(i17);
                java.lang.String d17 = com.tencent.mm.plugin.sns.ui.SnsUIAction.d(snsUIAction);
                int i18 = com.tencent.mm.plugin.sns.model.s5.f164676d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfoByName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
                Fj.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                android.database.Cursor K1 = Fj.K1(true, d17, 1, false, "", 0, 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                if (K1.getCount() == 0) {
                    K1.close();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfoByName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                    snsInfo = null;
                } else {
                    K1.moveToFirst();
                    snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
                    snsInfo.convertFrom(K1);
                    if (!K1.isClosed()) {
                        K1.close();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfoByName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                }
                if (snsInfo == null) {
                    com.tencent.mm.plugin.sns.model.d6.n(snsInfo2, 1, null, 0);
                } else if (snsInfo.isExtFlag()) {
                    com.tencent.mm.plugin.sns.model.d6.n(snsInfo2, 1, null, 0);
                } else {
                    com.tencent.mm.plugin.sns.model.d6.n(snsInfo2, 5, null, 0);
                }
            }
            com.tencent.mm.plugin.sns.storage.x1 L0 = com.tencent.mm.plugin.sns.model.l4.Bj().L0(com.tencent.mm.plugin.sns.ui.SnsUIAction.d(snsUIAction));
            if (L0.field_snsBgId == j17) {
                L0.field_isLike = z17;
                z18 = false;
                com.tencent.mm.plugin.sns.model.l4.Bj().W0(L0, false);
                com.tencent.mm.plugin.sns.statistics.s0.f164937k0.y().f60778k = 1L;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLike", "com.tencent.mm.plugin.sns.ui.SnsUIAction$2");
                return z18;
            }
        }
        z18 = false;
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.y().f60778k = 1L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLike", "com.tencent.mm.plugin.sns.ui.SnsUIAction$2");
        return z18;
    }
}
