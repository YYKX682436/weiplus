package os3;

/* loaded from: classes8.dex */
public class d0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ComposeUI f348057d;

    public d0(com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI) {
        this.f348057d = composeUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = this.f348057d;
        composeUI.enableOptionMenu(com.tencent.mm.plugin.qqmail.ui.ComposeUI.T6(composeUI, true));
        return true;
    }
}
