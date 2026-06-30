package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes15.dex */
public enum a0 implements com.tencent.mm.protobuf.h {
    ScanPageCreate(1),
    ScanPageDestroy(2),
    InitFromNative(3),
    /* JADX INFO: Fake field, exist only in values array */
    InitCalledInCpp(4),
    /* JADX INFO: Fake field, exist only in values array */
    InitSuccess(5),
    /* JADX INFO: Fake field, exist only in values array */
    InitFailed(6),
    /* JADX INFO: Fake field, exist only in values array */
    InitHasInited(7),
    StartSessionFromNative(11),
    /* JADX INFO: Fake field, exist only in values array */
    StartSessionCalledInCpp(12),
    /* JADX INFO: Fake field, exist only in values array */
    StartSessionInvalid(13),
    /* JADX INFO: Fake field, exist only in values array */
    StartSessionFinished(14),
    StopSessionFromNative(21),
    /* JADX INFO: Fake field, exist only in values array */
    StopSessionCalledInCpp(22),
    /* JADX INFO: Fake field, exist only in values array */
    StopSessionCalledInCpp(23),
    /* JADX INFO: Fake field, exist only in values array */
    ShowNotSupportBizView(24),
    /* JADX INFO: Fake field, exist only in values array */
    ShowNotSupportBizView(25),
    ReleaseFromNative(31),
    /* JADX INFO: Fake field, exist only in values array */
    ShowNotSupportBizView(32),
    /* JADX INFO: Fake field, exist only in values array */
    ShowNotSupportBizView(33),
    /* JADX INFO: Fake field, exist only in values array */
    ShowNotSupportBizView(41),
    DecodeSuccessCalledInNative(42),
    /* JADX INFO: Fake field, exist only in values array */
    ShowNotSupportBizView(51),
    CameraPermissionAllow(52),
    CameraPermissionDeny(53),
    /* JADX INFO: Fake field, exist only in values array */
    ShowNotSupportBizView(61),
    /* JADX INFO: Fake field, exist only in values array */
    ShowNotSupportBizView(62),
    SelectGallery(71),
    SelectGalleryCancel(72),
    SelectGalleryOk(73),
    SelectGalleryDecodeSuccess(74),
    /* JADX INFO: Fake field, exist only in values array */
    ErrorNotLoggedIn(81);


    /* renamed from: d, reason: collision with root package name */
    public final int f216946d;

    a0(int i17) {
        this.f216946d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f216946d;
    }
}
