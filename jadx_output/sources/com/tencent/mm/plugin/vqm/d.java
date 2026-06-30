package com.tencent.mm.plugin.vqm;

/* loaded from: classes5.dex */
public enum d implements com.tencent.mm.protobuf.h {
    /* JADX INFO: Fake field, exist only in values array */
    WillStartupAudioMicrophone(0),
    /* JADX INFO: Fake field, exist only in values array */
    DidStartupAudioMicrophone(1),
    /* JADX INFO: Fake field, exist only in values array */
    WillStartupAudioSpeaker(2),
    /* JADX INFO: Fake field, exist only in values array */
    DidStartupAudioSpeaker(3),
    /* JADX INFO: Fake field, exist only in values array */
    DidSendAudioDataAtFirst(4),
    /* JADX INFO: Fake field, exist only in values array */
    DidReceiveAudioDataAtFirst(5),
    /* JADX INFO: Fake field, exist only in values array */
    WillStartupCamera(6),
    /* JADX INFO: Fake field, exist only in values array */
    DidStartupCamera(7),
    /* JADX INFO: Fake field, exist only in values array */
    DidReceiveLocalVisualDataAtFirst(8),
    /* JADX INFO: Fake field, exist only in values array */
    DidReceiveRemoteVisualDataAtFirst(9),
    /* JADX INFO: Fake field, exist only in values array */
    DidAppearMainView(10),
    DidAppearFloatingBannerInApp(11),
    /* JADX INFO: Fake field, exist only in values array */
    DidAppearFloatingBannerInAppWithInfos(12),
    /* JADX INFO: Fake field, exist only in values array */
    WillPrewarnAudioUnit(13),
    /* JADX INFO: Fake field, exist only in values array */
    DidPrewarnAudioUnit(14),
    /* JADX INFO: Fake field, exist only in values array */
    DidTalkSuccess(15);


    /* renamed from: d, reason: collision with root package name */
    public final int f177330d;

    d(int i17) {
        this.f177330d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f177330d;
    }
}
