package com.tencent.wechat.aff;

/* loaded from: classes6.dex */
public enum IlinkEBizScene implements com.tencent.mm.protobuf.h {
    kC2CScene(0),
    kAppScene(2);

    public static final int kAppScene_VALUE = 2;
    public static final int kC2CScene_VALUE = 0;
    public final int value;

    IlinkEBizScene(int i17) {
        this.value = i17;
    }

    public static com.tencent.wechat.aff.IlinkEBizScene forNumber(int i17) {
        if (i17 == 0) {
            return kC2CScene;
        }
        if (i17 != 2) {
            return null;
        }
        return kAppScene;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.wechat.aff.IlinkEBizScene valueOf(int i17) {
        return forNumber(i17);
    }
}
