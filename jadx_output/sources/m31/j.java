package m31;

/* loaded from: classes9.dex */
public final class j implements i31.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI f323155a;

    public j(com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI bizSubscribeMsgManagerUI) {
        this.f323155a = bizSubscribeMsgManagerUI;
    }

    public void a(com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizSubscribeMsgManagerUI", "getSubscribeMsgList onSuccess");
        com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI bizSubscribeMsgManagerUI = this.f323155a;
        bizSubscribeMsgManagerUI.runOnUiThread(new m31.i(bizSubscribeMsgManagerUI, data));
    }
}
