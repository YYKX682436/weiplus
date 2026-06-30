package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes15.dex */
public enum f1 implements com.tencent.mm.protobuf.h {
    DEFAULT(1),
    DECODE_SUCCESS(2),
    SWITCH_TRANSLATE_TAB(3),
    SWITCH_GOODS_TAB(4),
    CLICK_GALLERY(5),
    CLICK_MY_QRCODE(6),
    SHOW_PRODUCT_RESULT(7);


    /* renamed from: d, reason: collision with root package name */
    public final int f217013d;

    f1(int i17) {
        this.f217013d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f217013d;
    }
}
