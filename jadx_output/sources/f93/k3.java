package f93;

/* loaded from: classes11.dex */
public class k3 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelSelectUI f260371a;

    public k3(com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI) {
        this.f260371a = contactLabelSelectUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI = this.f260371a;
        switch (i17) {
            case com.tencent.thumbplayer.api.TPPlayerMsg.TP_PLAYER_INFO_LONG0_PREPARE_TIMEOUT /* 5001 */:
                int i18 = com.tencent.mm.plugin.label.ui.ContactLabelSelectUI.f143271p1;
                contactLabelSelectUI.f7(false);
                return;
            case 5002:
                contactLabelSelectUI.U6(contactLabelSelectUI.getString(com.tencent.mm.R.string.f490604zq));
                return;
            case 5003:
                contactLabelSelectUI.hideLoading();
                return;
            default:
                return;
        }
    }
}
