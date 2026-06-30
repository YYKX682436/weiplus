package com.tencent.wechat.aff;

/* loaded from: classes6.dex */
public enum IlinkAppAuthFlag implements com.tencent.mm.protobuf.h {
    kIlinkAppNoSessionEncrypt(1);

    public static final int kIlinkAppNoSessionEncrypt_VALUE = 1;
    public final int value;

    IlinkAppAuthFlag(int i17) {
        this.value = i17;
    }

    public static com.tencent.wechat.aff.IlinkAppAuthFlag forNumber(int i17) {
        if (i17 != 1) {
            return null;
        }
        return kIlinkAppNoSessionEncrypt;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.wechat.aff.IlinkAppAuthFlag valueOf(int i17) {
        return forNumber(i17);
    }
}
