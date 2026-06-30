package dk5;

/* loaded from: classes9.dex */
public class k5 implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject f234707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SendAppMessageWrapperUI f234708b;

    public k5(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI, com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject wXStateSceneDataObject) {
        this.f234708b = sendAppMessageWrapperUI;
        this.f234707a = wXStateSceneDataObject;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public void a(k91.v5 v5Var) {
        int i17 = com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.B;
        com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f234708b;
        sendAppMessageWrapperUI.a7();
        if (sendAppMessageWrapperUI.f211035x) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SendAppMessageWrapperUI", "handleSendStatus cancelled");
            return;
        }
        com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject wXStateSceneDataObject = this.f234707a;
        if (v5Var == null) {
            sendAppMessageWrapperUI.c7(wXStateSceneDataObject, null, null, true, "");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageWrapperUI", "onGetWeAppInfo: nickName:%s userName:%s", v5Var.field_nickname, v5Var.field_username);
        java.lang.String str = v5Var.field_smallHeadURL;
        java.lang.String str2 = v5Var.field_bigHeadURL;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sendAppMessageWrapperUI.c7(wXStateSceneDataObject, null, str == null ? str2 : str, false, v5Var.field_nickname);
    }
}
