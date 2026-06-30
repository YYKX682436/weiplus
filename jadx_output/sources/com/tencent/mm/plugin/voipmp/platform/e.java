package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes14.dex */
public enum e implements com.tencent.mm.protobuf.h {
    VoIPMPCameraStatusUninitialized(0),
    VoIPMPCameraStatusInitialized(1),
    VoIPMPCameraStatusOpened(2),
    VoIPMPCameraStatusStarted(3),
    VoIPMPCameraStatusClosed(4),
    VoIPMPCameraStatusDisconnected(5);


    /* renamed from: d, reason: collision with root package name */
    public final int f177246d;

    e(int i17) {
        this.f177246d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f177246d;
    }
}
