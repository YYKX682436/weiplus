package dk5;

/* loaded from: classes9.dex */
public class o5 implements n13.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMediaMessage f234777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234778b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SendAppMessageWrapperUI f234779c;

    public o5(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str) {
        this.f234779c = sendAppMessageWrapperUI;
        this.f234777a = wXMediaMessage;
        this.f234778b = str;
    }

    @Override // n13.x
    public void a(boolean z17, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f234779c;
        if (z17) {
            sendAppMessageWrapperUI.f211036y = bundle.getBoolean("is_group_to_do");
            sendAppMessageWrapperUI.Y6(this.f234777a, str, 0);
            com.tencent.mm.plugin.base.stub.e0.r(26);
        } else {
            com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.U6(sendAppMessageWrapperUI);
        }
        java.lang.String str2 = this.f234778b;
        if (str2.isEmpty()) {
            return;
        }
        com.tencent.mm.vfs.w6.h(str2);
    }
}
