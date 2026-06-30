package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public class CaraNativeDiscoverViewFeatureCenterBridge extends com.tencent.wechat.zidl2.ZidlBaseBridge {
    private com.tencent.wechat.aff.cara.CaraNativeDiscoverViewFeatureCenterBase stub;

    public java.lang.String anchorOfBadgeAtLiveCell() {
        return this.stub.anchorOfBadgeAtLiveCell();
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        this.stub = (com.tencent.wechat.aff.cara.CaraNativeDiscoverViewFeatureCenterBase) obj;
    }

    public boolean badgeAtChannelsCell() {
        return this.stub.badgeAtChannelsCell();
    }

    public boolean badgeAtDiscover() {
        return this.stub.badgeAtDiscover();
    }

    public boolean badgeAtLiveCell() {
        return this.stub.badgeAtLiveCell();
    }

    public boolean badgeAtMomentsCell() {
        return this.stub.badgeAtMomentsCell();
    }

    public boolean badgeAtTopStoriesCell() {
        return this.stub.badgeAtTopStoriesCell();
    }

    public java.lang.String titleOfBadgeAtLiveCell() {
        return this.stub.titleOfBadgeAtLiveCell();
    }

    public int unreadAtChannelsCell() {
        return this.stub.unreadAtChannelsCell();
    }

    public int unreadAtDiscover() {
        return this.stub.unreadAtDiscover();
    }

    public int unreadAtLiveCell() {
        return this.stub.unreadAtLiveCell();
    }

    public int unreadAtMomentsCell() {
        return this.stub.unreadAtMomentsCell();
    }

    public int unreadAtTopStoriesCell() {
        return this.stub.unreadAtTopStoriesCell();
    }
}
