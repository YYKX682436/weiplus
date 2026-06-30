package com.tencent.mm.plugin.vqm;

/* loaded from: classes15.dex */
public enum n implements com.tencent.mm.protobuf.h {
    VQMProfileInfoCommonOpenFromNull(0),
    VQMProfileInfoCommonOpenFromUnknown(10000),
    VQMProfileInfoCommonOpenFromBubble(10001),
    VQMProfileInfoCommonOpenFromContact(10002),
    VQMProfileInfoCommonOpenFromInputTool(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL),
    VQMProfileInfoCommonOpenFromSignal(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID),
    VQMProfileInfoCommonOpenFromExceptionTip(10005),
    VQMProfileInfoCommonOpenFromInviteWhenCalling(10007),
    VQMProfileInfoCommonOpenFromIosApns(10100),
    VQMProfileInfoCommonOpenFromIosPushKit(10101),
    VQMProfileInfoCommonOpenFromIosCallKit(10102),
    VQMProfileInfoCommonOpenFromIosOpenIm(10103),
    VQMProfileInfoCommonOpenFromIosRightMenu(10104),
    VQMProfileInfoCommonOpenFromIosWidgetQuickCall(10105),
    VQMProfileInfoCommonOpenFromIosCarPlay(10106);


    /* renamed from: d, reason: collision with root package name */
    public final int f177416d;

    n(int i17) {
        this.f177416d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f177416d;
    }
}
