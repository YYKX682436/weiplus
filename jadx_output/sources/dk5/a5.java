package dk5;

/* loaded from: classes9.dex */
public class a5 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SendAppMessageWrapperUI f234496d;

    public a5(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI) {
        this.f234496d = sendAppMessageWrapperUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f234496d;
        if (sendAppMessageWrapperUI.getWindow() != null && sendAppMessageWrapperUI.getWindow().getDecorView() != null && sendAppMessageWrapperUI.getWindow().getDecorView().getWindowToken() != null) {
            com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.T6(sendAppMessageWrapperUI);
            return false;
        }
        int i17 = sendAppMessageWrapperUI.f211032u;
        if (i17 >= 10) {
            return false;
        }
        sendAppMessageWrapperUI.f211032u = i17 + 1;
        return true;
    }
}
