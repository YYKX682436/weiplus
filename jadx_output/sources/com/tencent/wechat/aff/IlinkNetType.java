package com.tencent.wechat.aff;

/* loaded from: classes6.dex */
public enum IlinkNetType implements com.tencent.mm.protobuf.h {
    kIlinkShortlink(0),
    kIlinkLonglink(1);

    public static final int kIlinkLonglink_VALUE = 1;
    public static final int kIlinkShortlink_VALUE = 0;
    public final int value;

    IlinkNetType(int i17) {
        this.value = i17;
    }

    public static com.tencent.wechat.aff.IlinkNetType forNumber(int i17) {
        if (i17 == 0) {
            return kIlinkShortlink;
        }
        if (i17 != 1) {
            return null;
        }
        return kIlinkLonglink;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.wechat.aff.IlinkNetType valueOf(int i17) {
        return forNumber(i17);
    }
}
