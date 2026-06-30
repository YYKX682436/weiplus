package dk5;

/* loaded from: classes9.dex */
public class t4 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMediaMessage f234916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SendAppMessageWrapperUI f234917b;

    public t4(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage) {
        this.f234917b = sendAppMessageWrapperUI;
        this.f234916a = wXMediaMessage;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f234917b;
        if (!z17) {
            com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.U6(sendAppMessageWrapperUI);
            return;
        }
        int i18 = com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.B;
        sendAppMessageWrapperUI.Y6(this.f234916a, str, i17);
        com.tencent.mm.plugin.base.stub.e0.r(26);
    }
}
