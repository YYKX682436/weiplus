package com.tencent.mm.plugin.vqm;

/* loaded from: classes6.dex */
public enum k implements com.tencent.mm.protobuf.h {
    VQMProfileInfoAudioDeviceTypeNull(0),
    VQMProfileInfoAudioDeviceTypeSpeaker(10001),
    VQMProfileInfoAudioDeviceTypeEarpiece(10002),
    VQMProfileInfoAudioDeviceTypeHeadset(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL),
    VQMProfileInfoAudioDeviceTypeBluetooth(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID);


    /* renamed from: d, reason: collision with root package name */
    public final int f177374d;

    k(int i17) {
        this.f177374d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f177374d;
    }
}
