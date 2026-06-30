package com.tencent.wechat.aff.ilink_stream;

/* loaded from: classes9.dex */
public enum w implements com.tencent.mm.protobuf.h {
    kStreamNetworkTypeUnknown(0),
    kStreamNetworkTypeCellular(1),
    kStreamNetworkTypeWiFi(2),
    kStreamNetworkTypeEthernet(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f217330d;

    w(int i17) {
        this.f217330d = i17;
    }

    public static com.tencent.wechat.aff.ilink_stream.w a(int i17) {
        if (i17 == 0) {
            return kStreamNetworkTypeUnknown;
        }
        if (i17 == 1) {
            return kStreamNetworkTypeCellular;
        }
        if (i17 == 2) {
            return kStreamNetworkTypeWiFi;
        }
        if (i17 != 3) {
            return null;
        }
        return kStreamNetworkTypeEthernet;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f217330d;
    }
}
