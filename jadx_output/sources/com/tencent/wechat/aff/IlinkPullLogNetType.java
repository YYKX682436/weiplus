package com.tencent.wechat.aff;

/* loaded from: classes.dex */
public enum IlinkPullLogNetType implements com.tencent.mm.protobuf.h {
    kIlinkLan(0),
    kIlinkAny(1);

    public static final int kIlinkAny_VALUE = 1;
    public static final int kIlinkLan_VALUE = 0;
    public final int value;

    IlinkPullLogNetType(int i17) {
        this.value = i17;
    }

    public static com.tencent.wechat.aff.IlinkPullLogNetType forNumber(int i17) {
        if (i17 == 0) {
            return kIlinkLan;
        }
        if (i17 != 1) {
            return null;
        }
        return kIlinkAny;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.wechat.aff.IlinkPullLogNetType valueOf(int i17) {
        return forNumber(i17);
    }
}
