package com.tencent.wechat.aff.favorites;

/* loaded from: classes9.dex */
public enum u implements com.tencent.mm.protobuf.h {
    UNKNOWN(0),
    H264(101),
    H265(102),
    JPEG(103),
    WXAM(104),
    WCG_WXAM(105),
    HTML(106),
    MARKDOWN(107);


    /* renamed from: d, reason: collision with root package name */
    public final int f216871d;

    u(int i17) {
        this.f216871d = i17;
    }

    public static com.tencent.wechat.aff.favorites.u a(int i17) {
        if (i17 == 0) {
            return UNKNOWN;
        }
        switch (i17) {
            case 101:
                return H264;
            case 102:
                return H265;
            case 103:
                return JPEG;
            case 104:
                return WXAM;
            case 105:
                return WCG_WXAM;
            case 106:
                return HTML;
            case 107:
                return MARKDOWN;
            default:
                return null;
        }
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f216871d;
    }
}
