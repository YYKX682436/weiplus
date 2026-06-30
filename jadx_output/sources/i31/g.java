package i31;

/* loaded from: classes9.dex */
public final class g implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i31.i f288103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f288104e;

    public g(i31.i iVar, int i17) {
        this.f288103d = iVar;
        this.f288104e = i17;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        i31.i iVar = this.f288103d;
        if (i17 == iVar.f288108b && i18 == -1) {
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) intent.getParcelableExtra("key_data");
            boolean booleanExtra = intent.getBooleanExtra("key_status_subscribed", false);
            if (subscribeMsgTmpItem == null) {
                return;
            }
            j31.a aVar = iVar.f288112f;
            aVar.getClass();
            java.lang.String str = subscribeMsgTmpItem.f71803f;
            kotlin.jvm.internal.o.g(str, "<set-?>");
            aVar.f297360g = str;
            java.lang.String str2 = subscribeMsgTmpItem.f71802e;
            kotlin.jvm.internal.o.g(str2, "<set-?>");
            aVar.f297361h = str2;
            aVar.f297359f = subscribeMsgTmpItem.f71820z;
            iVar.i(!booleanExtra ? 5 : subscribeMsgTmpItem.f71818x ? 4 : 3);
            iVar.f288111e = true;
            com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData = iVar.f288110d;
            kotlin.jvm.internal.o.d(subscribeMsgSettingData);
            java.util.Iterator it = subscribeMsgSettingData.f71836f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem2 = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) it.next();
                if (android.text.TextUtils.equals(str, subscribeMsgTmpItem2.f71803f)) {
                    subscribeMsgTmpItem2.f71807m = booleanExtra ? 1 : 0;
                    subscribeMsgTmpItem2.f71815u = subscribeMsgTmpItem.f71815u;
                    subscribeMsgTmpItem2.f71818x = subscribeMsgTmpItem.f71818x;
                    break;
                }
            }
            i31.d dVar = iVar.f288100a;
            if (dVar == null) {
                kotlin.jvm.internal.o.o("view");
                throw null;
            }
            m31.f fVar = ((com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI) dVar).f71852f;
            if (fVar != null) {
                fVar.notifyItemChanged(this.f288104e);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaSubscribeMsgSettingPagePresenter", "goDetailUI  mmSetOnActivityResultCallback");
        }
    }
}
