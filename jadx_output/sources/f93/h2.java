package f93;

/* loaded from: classes11.dex */
public class h2 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelManagerUI f260348d;

    public h2(com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI) {
        this.f260348d = contactLabelManagerUI;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI;
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (n3Var = (contactLabelManagerUI = this.f260348d).Q) == null) {
            return;
        }
        n3Var.removeMessages(com.tencent.thumbplayer.api.TPPlayerMsg.TP_PLAYER_INFO_LONG0_PREPARE_TIMEOUT);
        contactLabelManagerUI.Q.sendEmptyMessageDelayed(com.tencent.thumbplayer.api.TPPlayerMsg.TP_PLAYER_INFO_LONG0_PREPARE_TIMEOUT, 400L);
    }
}
