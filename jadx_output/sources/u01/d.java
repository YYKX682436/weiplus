package u01;

/* loaded from: classes9.dex */
public final class d implements e31.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbiz.subscribemsg.BizSubscribeMsgSettingPagePresenter f423453a;

    public d(com.tencent.mm.modelbiz.subscribemsg.BizSubscribeMsgSettingPagePresenter bizSubscribeMsgSettingPagePresenter) {
        this.f423453a = bizSubscribeMsgSettingPagePresenter;
    }

    @Override // e31.l
    public void d(int i17, int i18, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.e("MicroMsg.BizSubscribeMsgSettingPagePresenter", "updateSubscribeMsgListAsync onError errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg);
    }

    @Override // e31.l
    public void e(java.lang.String bizUsername, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult result) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizSubscribeMsgSettingPagePresenter", "updateSubscribeMsgListAsync onSuccess");
        com.tencent.mm.modelbiz.subscribemsg.BizSubscribeMsgSettingPagePresenter bizSubscribeMsgSettingPagePresenter = this.f423453a;
        bizSubscribeMsgSettingPagePresenter.getClass();
        java.util.ArrayList<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> arrayList = result.f71785h;
        if (arrayList != null) {
            for (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem : arrayList) {
                com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem2 = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) bizSubscribeMsgSettingPagePresenter.f70859e.get(subscribeMsgTmpItem.f71803f);
                if (subscribeMsgTmpItem2 != null) {
                    subscribeMsgTmpItem2.f71807m = subscribeMsgTmpItem.f71807m;
                }
            }
        }
    }
}
