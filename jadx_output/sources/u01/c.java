package u01;

/* loaded from: classes9.dex */
public final class c implements e31.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbiz.subscribemsg.BizSubscribeMsgSettingPagePresenter f423451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i31.b f423452b;

    public c(com.tencent.mm.modelbiz.subscribemsg.BizSubscribeMsgSettingPagePresenter bizSubscribeMsgSettingPagePresenter, i31.b bVar) {
        this.f423451a = bizSubscribeMsgSettingPagePresenter;
        this.f423452b = bVar;
    }

    @Override // e31.l
    public void d(int i17, int i18, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        ((m31.j) this.f423452b).getClass();
        com.tencent.mars.xlog.Log.e("MicroMsg.BizSubscribeMsgManagerUI", "getSubscribeMsgList ERROR");
    }

    @Override // e31.l
    public void e(java.lang.String bizUsername, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult result) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData = new com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData(result, false, 2, null);
        com.tencent.mm.modelbiz.subscribemsg.BizSubscribeMsgSettingPagePresenter bizSubscribeMsgSettingPagePresenter = this.f423451a;
        bizSubscribeMsgSettingPagePresenter.f70858d = subscribeMsgSettingData;
        bizSubscribeMsgSettingPagePresenter.f70856b = subscribeMsgSettingData.f71835e;
        bizSubscribeMsgSettingPagePresenter.i(result.f71785h);
        com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData2 = bizSubscribeMsgSettingPagePresenter.f70858d;
        kotlin.jvm.internal.o.d(subscribeMsgSettingData2);
        ((m31.j) this.f423452b).a(subscribeMsgSettingData2);
        bizSubscribeMsgSettingPagePresenter.j(bizSubscribeMsgSettingPagePresenter.f70858d);
        j31.e.d(1, bizSubscribeMsgSettingPagePresenter.f70862h);
    }
}
