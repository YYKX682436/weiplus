package f93;

/* loaded from: classes11.dex */
public class i2 implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelManagerUI f260355d;

    public i2(com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI) {
        this.f260355d = contactLabelManagerUI;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI = this.f260355d;
        com.tencent.mm.sdk.platformtools.n3 n3Var = contactLabelManagerUI.Q;
        if (n3Var != null) {
            n3Var.removeMessages(com.tencent.thumbplayer.api.TPPlayerMsg.TP_PLAYER_INFO_LONG0_PREPARE_TIMEOUT);
            contactLabelManagerUI.Q.sendEmptyMessageDelayed(com.tencent.thumbplayer.api.TPPlayerMsg.TP_PLAYER_INFO_LONG0_PREPARE_TIMEOUT, 400L);
        }
    }
}
