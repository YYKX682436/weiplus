package dk5;

/* loaded from: classes9.dex */
public class w4 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f234977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SendAppMessageWrapperUI f234978e;

    public w4(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI, java.util.List list) {
        this.f234978e = sendAppMessageWrapperUI;
        this.f234977d = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f234978e;
        java.util.LinkedList linkedList = new java.util.LinkedList(this.f234977d);
        int i17 = com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.B;
        sendAppMessageWrapperUI.Z6(2, null, null, "", 0, linkedList);
        return null;
    }
}
