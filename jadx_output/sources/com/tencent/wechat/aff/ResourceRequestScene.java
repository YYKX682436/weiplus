package com.tencent.wechat.aff;

/* loaded from: classes6.dex */
public enum ResourceRequestScene implements com.tencent.mm.protobuf.h {
    kNormal(0),
    kBatch(1),
    kPeriod(2);

    public static final int kBatch_VALUE = 1;
    public static final int kNormal_VALUE = 0;
    public static final int kPeriod_VALUE = 2;
    public final int value;

    ResourceRequestScene(int i17) {
        this.value = i17;
    }

    public static com.tencent.wechat.aff.ResourceRequestScene forNumber(int i17) {
        if (i17 == 0) {
            return kNormal;
        }
        if (i17 == 1) {
            return kBatch;
        }
        if (i17 != 2) {
            return null;
        }
        return kPeriod;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.wechat.aff.ResourceRequestScene valueOf(int i17) {
        return forNumber(i17);
    }
}
