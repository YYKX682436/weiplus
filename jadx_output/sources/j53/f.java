package j53;

/* loaded from: classes10.dex */
public class f implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.background.GameFakeVideoUI f297810d;

    public f(com.tencent.mm.plugin.game.media.background.GameFakeVideoUI gameFakeVideoUI) {
        this.f297810d = gameFakeVideoUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int i17;
        com.tencent.mm.plugin.game.media.background.GameFakeVideoUI gameFakeVideoUI = this.f297810d;
        if (!((com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) gameFakeVideoUI.f140102e).isPlaying()) {
            return true;
        }
        int currentPosition = ((int) (gameFakeVideoUI.f140102e.getCurrentPosition() - gameFakeVideoUI.f140109o)) / 1000;
        android.widget.TextView textView = gameFakeVideoUI.f140105h;
        if (textView == null || (i17 = gameFakeVideoUI.f140112r) <= 0) {
            return true;
        }
        int i18 = i17 - currentPosition;
        if (i18 < 0) {
            i18 = 0;
        }
        textView.setText(i18 + "\"");
        return true;
    }
}
