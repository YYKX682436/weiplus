package dk5;

/* loaded from: classes9.dex */
public class m5 implements zy2.g9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXStateJumpChannelProfileInfo f234734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject f234735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SendAppMessageWrapperUI f234736c;

    public m5(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI, com.tencent.mm.opensdk.modelmsg.WXStateJumpChannelProfileInfo wXStateJumpChannelProfileInfo, com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject wXStateSceneDataObject) {
        this.f234736c = sendAppMessageWrapperUI;
        this.f234734a = wXStateJumpChannelProfileInfo;
        this.f234735b = wXStateSceneDataObject;
    }

    public void a(int i17, int i18, java.lang.Object obj) {
        int i19 = com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.B;
        com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f234736c;
        sendAppMessageWrapperUI.a7();
        if (sendAppMessageWrapperUI.f211035x) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SendAppMessageWrapperUI", "handleSendStatus cancelled");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageWrapperUI", "handleSendStatus getFinderContact errType: %s, errCode: %s, ret: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), obj);
        if (i17 != 0 || i18 != 0 || !(obj instanceof com.tencent.mm.protocal.protobuf.FinderContact)) {
            this.f234736c.c7(this.f234735b, null, null, true, "");
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageWrapperUI", "handleSendStatus getFinderContact success username: %s nickName:%s", finderContact.getUsername(), finderContact.getNickname());
        java.lang.String username = finderContact.getUsername();
        com.tencent.mm.opensdk.modelmsg.WXStateJumpChannelProfileInfo wXStateJumpChannelProfileInfo = this.f234734a;
        wXStateJumpChannelProfileInfo.username = username;
        com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject wXStateSceneDataObject = this.f234735b;
        wXStateSceneDataObject.stateJumpInfo = wXStateJumpChannelProfileInfo;
        sendAppMessageWrapperUI.c7(wXStateSceneDataObject, null, finderContact.getHeadUrl(), false, finderContact.getNickname());
    }
}
