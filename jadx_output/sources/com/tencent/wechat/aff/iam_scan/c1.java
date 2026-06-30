package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes15.dex */
public enum c1 implements com.tencent.mm.protobuf.h {
    UNKNOWN(0),
    SCAN(1),
    SCAN_MERGE(2),
    SCAN_GALLERY(3),
    LONG_PRESS_IMAGE(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f216982d;

    c1(int i17) {
        this.f216982d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f216982d;
    }
}
