package com.tencent.wechat.aff.affroam;

/* loaded from: classes15.dex */
public enum y implements com.tencent.mm.protobuf.h {
    kAffRoamDiskTypeUnknown(0),
    kAffRoamDiskTypeNas(1),
    kAffRoamDiskTypeICloud(2),
    kAffRoamDiskTypeWindows(3),
    kAffRoamDiskTypeMacOS(4),
    kAffRoamDiskTypePortableDisk(5);


    /* renamed from: d, reason: collision with root package name */
    public final int f216021d;

    y(int i17) {
        this.f216021d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f216021d;
    }
}
