package com.tencent.wechat.aff;

/* loaded from: classes6.dex */
public enum IlinkCdnDownloadMode implements com.tencent.mm.protobuf.h {
    kModeStorage(0),
    kModeStreaming(1),
    kModePreload(2),
    kModeQueryInfo(3);

    public static final int kModePreload_VALUE = 2;
    public static final int kModeQueryInfo_VALUE = 3;
    public static final int kModeStorage_VALUE = 0;
    public static final int kModeStreaming_VALUE = 1;
    public final int value;

    IlinkCdnDownloadMode(int i17) {
        this.value = i17;
    }

    public static com.tencent.wechat.aff.IlinkCdnDownloadMode forNumber(int i17) {
        if (i17 == 0) {
            return kModeStorage;
        }
        if (i17 == 1) {
            return kModeStreaming;
        }
        if (i17 == 2) {
            return kModePreload;
        }
        if (i17 != 3) {
            return null;
        }
        return kModeQueryInfo;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.wechat.aff.IlinkCdnDownloadMode valueOf(int i17) {
        return forNumber(i17);
    }
}
