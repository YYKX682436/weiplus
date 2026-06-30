package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes6.dex */
public enum b implements com.tencent.mm.protobuf.h {
    VoIPMPCameraDefinition480P(0),
    VoIPMPCameraDefinition720P(1),
    VoIPMPCameraDefinition1080P(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f177227d;

    b(int i17) {
        this.f177227d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f177227d;
    }
}
