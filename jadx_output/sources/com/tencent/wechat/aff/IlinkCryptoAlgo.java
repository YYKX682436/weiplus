package com.tencent.wechat.aff;

/* loaded from: classes15.dex */
public enum IlinkCryptoAlgo implements com.tencent.mm.protobuf.h {
    kIlinkNoCrypto(0),
    kIlinkSession(1),
    kIlinkHybridEcdh(2),
    kIlinkEcdh(3);

    public static final int kIlinkEcdh_VALUE = 3;
    public static final int kIlinkHybridEcdh_VALUE = 2;
    public static final int kIlinkNoCrypto_VALUE = 0;
    public static final int kIlinkSession_VALUE = 1;
    public final int value;

    IlinkCryptoAlgo(int i17) {
        this.value = i17;
    }

    public static com.tencent.wechat.aff.IlinkCryptoAlgo forNumber(int i17) {
        if (i17 == 0) {
            return kIlinkNoCrypto;
        }
        if (i17 == 1) {
            return kIlinkSession;
        }
        if (i17 == 2) {
            return kIlinkHybridEcdh;
        }
        if (i17 != 3) {
            return null;
        }
        return kIlinkEcdh;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.wechat.aff.IlinkCryptoAlgo valueOf(int i17) {
        return forNumber(i17);
    }
}
