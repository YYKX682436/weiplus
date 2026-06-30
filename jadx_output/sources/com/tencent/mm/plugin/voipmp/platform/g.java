package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes6.dex */
public enum g implements com.tencent.mm.protobuf.h {
    VoIPMPFrameRotation0(0),
    VoIPMPFrameRotation90(1),
    VoIPMPFrameRotation180(2),
    VoIPMPFrameRotation270(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f177259d;

    g(int i17) {
        this.f177259d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f177259d;
    }
}
