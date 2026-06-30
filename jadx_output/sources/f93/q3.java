package f93;

/* loaded from: classes11.dex */
public class q3 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelSelectUI f260439d;

    public q3(com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI) {
        this.f260439d = contactLabelSelectUI;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI;
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (n3Var = (contactLabelSelectUI = this.f260439d).Z) == null) {
            return;
        }
        n3Var.removeMessages(com.tencent.thumbplayer.api.TPPlayerMsg.TP_PLAYER_INFO_LONG0_PREPARE_TIMEOUT);
        contactLabelSelectUI.Z.sendEmptyMessageDelayed(com.tencent.thumbplayer.api.TPPlayerMsg.TP_PLAYER_INFO_LONG0_PREPARE_TIMEOUT, 400L);
    }
}
