package f93;

/* loaded from: classes11.dex */
public class r3 implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelSelectUI f260449d;

    public r3(com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI) {
        this.f260449d = contactLabelSelectUI;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI = this.f260449d;
        com.tencent.mm.sdk.platformtools.n3 n3Var = contactLabelSelectUI.Z;
        if (n3Var != null) {
            n3Var.removeMessages(com.tencent.thumbplayer.api.TPPlayerMsg.TP_PLAYER_INFO_LONG0_PREPARE_TIMEOUT);
            contactLabelSelectUI.Z.sendEmptyMessageDelayed(com.tencent.thumbplayer.api.TPPlayerMsg.TP_PLAYER_INFO_LONG0_PREPARE_TIMEOUT, 400L);
        }
    }
}
