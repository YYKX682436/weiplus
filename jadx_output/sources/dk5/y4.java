package dk5;

/* loaded from: classes9.dex */
public class y4 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f235005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SendAppMessageWrapperUI f235006e;

    public y4(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI, java.util.List list) {
        this.f235006e = sendAppMessageWrapperUI;
        this.f235005d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.pluginsdk.model.app.a aVar = new com.tencent.mm.pluginsdk.model.app.a();
        int i17 = com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.B;
        this.f235006e.h7(this.f235005d, (com.tencent.mm.opensdk.modelmsg.WXMediaMessage) obj, aVar);
        return null;
    }
}
