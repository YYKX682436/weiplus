package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f164754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.n3 f164755e;

    public x2(com.tencent.mm.plugin.sns.model.c3 c3Var, boolean z17, r45.k76 k76Var, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f164754d = z17;
        this.f164755e = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$2");
        if (this.f164754d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            java.util.List<c01.x8> list = com.tencent.mm.plugin.sns.model.c3.f164113h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            for (c01.x8 x8Var : list) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewSyncAlbum", "notify list ");
                com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = (com.tencent.mm.ui.FindMoreFriendsUI) x8Var;
                findMoreFriendsUI.getClass();
                if ((c01.z1.n() & 32768) == 0) {
                    findMoreFriendsUI.f196660y++;
                    findMoreFriendsUI.C1();
                    findMoreFriendsUI.f196656w.notifyDataSetChanged();
                }
            }
        }
        this.f164755e.sendEmptyMessage(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$2");
    }
}
