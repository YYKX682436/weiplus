package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes6.dex */
public enum c implements com.tencent.mm.protobuf.h {
    VoIPMPCameraFacingFront(0),
    VoIPMPCameraFacingBack(1);


    /* renamed from: d, reason: collision with root package name */
    public final int f177231d;

    c(int i17) {
        this.f177231d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f177231d;
    }
}
