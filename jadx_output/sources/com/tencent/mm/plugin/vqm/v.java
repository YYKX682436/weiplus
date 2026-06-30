package com.tencent.mm.plugin.vqm;

/* loaded from: classes14.dex */
public enum v implements com.tencent.mm.protobuf.h {
    VQMProfileInfoNotificationAuthorizationStatusNull(0),
    VQMProfileInfoNotificationAuthorizationStatusNotDetermined(10000),
    VQMProfileInfoNotificationAuthorizationStatusDenied(10001),
    VQMProfileInfoNotificationAuthorizationStatusAuthorized(10002),
    VQMProfileInfoNotificationAuthorizationStatusProvisional(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL),
    VQMProfileInfoNotificationAuthorizationStatusEphemeral(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID);


    /* renamed from: d, reason: collision with root package name */
    public final int f177503d;

    v(int i17) {
        this.f177503d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f177503d;
    }
}
