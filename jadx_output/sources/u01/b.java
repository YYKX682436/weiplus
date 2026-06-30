package u01;

/* loaded from: classes9.dex */
public final class b implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbiz.subscribemsg.BizSubscribeMsgSettingPagePresenter f423449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f423450e;

    public b(com.tencent.mm.modelbiz.subscribemsg.BizSubscribeMsgSettingPagePresenter bizSubscribeMsgSettingPagePresenter, int i17) {
        this.f423449d = bizSubscribeMsgSettingPagePresenter;
        this.f423450e = i17;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == -1) {
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) intent.getParcelableExtra("key_data");
            boolean booleanExtra = intent.getBooleanExtra("key_status_subscribed", false);
            if (subscribeMsgTmpItem == null) {
                return;
            }
            com.tencent.mm.modelbiz.subscribemsg.BizSubscribeMsgSettingPagePresenter bizSubscribeMsgSettingPagePresenter = this.f423449d;
            bizSubscribeMsgSettingPagePresenter.getClass();
            com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData = bizSubscribeMsgSettingPagePresenter.f70858d;
            if (subscribeMsgSettingData != null) {
                java.util.Iterator it = subscribeMsgSettingData.f71836f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem2 = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) it.next();
                    if (android.text.TextUtils.equals(subscribeMsgTmpItem.f71803f, subscribeMsgTmpItem2.f71803f)) {
                        subscribeMsgTmpItem2.f71807m = booleanExtra ? 1 : 0;
                        subscribeMsgTmpItem2.C = subscribeMsgTmpItem.C;
                        subscribeMsgTmpItem.f71807m = booleanExtra ? 1 : 0;
                        break;
                    }
                }
            }
            i31.d dVar = bizSubscribeMsgSettingPagePresenter.f288100a;
            if (dVar == null) {
                kotlin.jvm.internal.o.o("view");
                throw null;
            }
            m31.f fVar = ((com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI) dVar).f71852f;
            if (fVar != null) {
                fVar.notifyItemChanged(this.f423450e);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BizSubscribeMsgSettingPagePresenter", "goDetailUI  mmSetOnActivityResultCallback");
        }
    }
}
