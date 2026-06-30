package gr2;

/* loaded from: classes8.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView f274833d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView playTogetherVoiceRoomLinkMicView) {
        super(0);
        this.f274833d = playTogetherVoiceRoomLinkMicView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        r45.nw1 liveInfo;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NearbyLivePreviewView, live url=");
        vp2.i0 i0Var = this.f274833d.f122147i;
        sb6.append((i0Var == null || (feedObject = i0Var.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null || (liveInfo = feedObject2.getLiveInfo()) == null) ? null : liveInfo.getString(3));
        return sb6.toString();
    }
}
