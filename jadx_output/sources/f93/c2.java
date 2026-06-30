package f93;

/* loaded from: classes11.dex */
public class c2 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelManagerUI f260302a;

    public c2(com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI) {
        this.f260302a = contactLabelManagerUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI = this.f260302a;
        switch (i17) {
            case com.tencent.thumbplayer.api.TPPlayerMsg.TP_PLAYER_INFO_LONG0_PREPARE_TIMEOUT /* 5001 */:
                int i18 = com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.X;
                contactLabelManagerUI.f7(false);
                return;
            case 5002:
                contactLabelManagerUI.U6(contactLabelManagerUI.getString(com.tencent.mm.R.string.f490604zq));
                return;
            case 5003:
                contactLabelManagerUI.hideLoading();
                return;
            default:
                return;
        }
    }
}
