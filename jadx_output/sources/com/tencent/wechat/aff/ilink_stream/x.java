package com.tencent.wechat.aff.ilink_stream;

/* loaded from: classes5.dex */
public enum x implements com.tencent.mm.protobuf.h {
    kIlinkStreamStateOK(0),
    kIlinkStreamStateNotExist(1),
    kIlinkStreamStateEnding(2),
    kIlinkStreamStateFragmentTooLarge(3),
    kIlinkStreamStateError(100),
    kIlinkStreamStateCancel(101),
    kIlinkStreamStateDataSyncError(102),
    kIlinkStreamStateDataLostError(103),
    kIlinkStreamStateAccountChanged(104),
    kIlinkStreamStateServerAbort(400);


    /* renamed from: d, reason: collision with root package name */
    public final int f217342d;

    x(int i17) {
        this.f217342d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f217342d;
    }
}
