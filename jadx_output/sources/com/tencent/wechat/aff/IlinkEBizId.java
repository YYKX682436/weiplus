package com.tencent.wechat.aff;

/* loaded from: classes.dex */
public enum IlinkEBizId implements com.tencent.mm.protobuf.h {
    kBizSns(3);

    public static final int kBizSns_VALUE = 3;
    public final int value;

    IlinkEBizId(int i17) {
        this.value = i17;
    }

    public static com.tencent.wechat.aff.IlinkEBizId forNumber(int i17) {
        if (i17 != 3) {
            return null;
        }
        return kBizSns;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.wechat.aff.IlinkEBizId valueOf(int i17) {
        return forNumber(i17);
    }
}
