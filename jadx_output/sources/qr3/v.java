package qr3;

/* loaded from: classes9.dex */
public class v implements e31.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI f366119a;

    public v(com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI newBizInfoSettingUI) {
        this.f366119a = newBizInfoSettingUI;
    }

    @Override // e31.l
    public void d(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.NewBizInfoSettingUI", "updateSubscribeMsgList onError errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
    }

    @Override // e31.l
    public void e(java.lang.String str, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewBizInfoSettingUI", "updateSubscribeMsgList success");
        com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI newBizInfoSettingUI = this.f366119a;
        com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult2 = newBizInfoSettingUI.f154187t;
        if (subscribeMsgRequestResult2 == null) {
            return;
        }
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList = subscribeMsgRequestResult2.f71785h;
            if (i17 >= arrayList.size()) {
                newBizInfoSettingUI.f154187t.f71789o = subscribeMsgRequestResult.f71789o;
                return;
            }
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) arrayList.get(i17);
            if (subscribeMsgTmpItem != null) {
                for (int i18 = 0; i18 < subscribeMsgRequestResult.f71785h.size(); i18++) {
                    com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem2 = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) subscribeMsgRequestResult.f71785h.get(i18);
                    if (subscribeMsgTmpItem2 != null && subscribeMsgTmpItem.f71803f.equals(subscribeMsgTmpItem2.f71803f)) {
                        subscribeMsgTmpItem.f71807m = subscribeMsgTmpItem2.f71807m;
                    }
                }
            }
            i17++;
        }
    }
}
