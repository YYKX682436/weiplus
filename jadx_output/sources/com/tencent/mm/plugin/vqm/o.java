package com.tencent.mm.plugin.vqm;

/* loaded from: classes6.dex */
public enum o implements com.tencent.mm.protobuf.h {
    VQMProfileInfoCommonRoomTypeNull(0),
    VQMProfileInfoCommonRoomTypeVoice(10001),
    VQMProfileInfoCommonRoomTypeVideo(10002),
    VQMProfileInfoCommonRoomTypeUnknown(19999);


    /* renamed from: d, reason: collision with root package name */
    public final int f177422d;

    o(int i17) {
        this.f177422d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f177422d;
    }
}
