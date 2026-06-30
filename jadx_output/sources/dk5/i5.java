package dk5;

/* loaded from: classes9.dex */
public class i5 implements dk5.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject f234676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SendAppMessageWrapperUI f234677b;

    public i5(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI, com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject wXStateSceneDataObject) {
        this.f234677b = sendAppMessageWrapperUI;
        this.f234676a = wXStateSceneDataObject;
    }

    @Override // dk5.h2
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f234677b;
        if (z17) {
            com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject wXStateSceneDataObject = this.f234676a;
            int i17 = com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.B;
            sendAppMessageWrapperUI.c7(wXStateSceneDataObject, str, null, false, "");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SendAppMessageWrapperUI", "thumb img CDN upload fail!");
            com.tencent.mm.pluginsdk.model.app.m5.c(sendAppMessageWrapperUI, com.tencent.mm.pluginsdk.model.app.m5.a(sendAppMessageWrapperUI.getIntent().getExtras(), -1), true, false);
            sendAppMessageWrapperUI.finish();
        }
    }
}
