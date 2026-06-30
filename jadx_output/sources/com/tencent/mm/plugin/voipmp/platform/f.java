package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes6.dex */
public enum f implements com.tencent.mm.protobuf.h {
    VoIPMPDeviceLevelVeryLowEnd(0),
    VoIPMPDeviceLevelLowEnd(1),
    VoIPMPDeviceLevelHighEnd(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f177252d;

    f(int i17) {
        this.f177252d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f177252d;
    }
}
