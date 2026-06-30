package er4;

/* loaded from: classes6.dex */
public enum y implements com.tencent.mm.protobuf.h {
    NET_TYPE_NULL(0),
    NET_TYPE_2G(1),
    NET_TYPE_3G(3),
    NET_TYPE_WIFI(4),
    NET_TYPE_4G(5),
    NET_TYPE_5G(6),
    NET_TYPE_WIRED(7);


    /* renamed from: d, reason: collision with root package name */
    public final int f256211d;

    y(int i17) {
        this.f256211d = i17;
    }

    public static er4.y a(int i17) {
        if (i17 == 0) {
            return NET_TYPE_NULL;
        }
        if (i17 == 1) {
            return NET_TYPE_2G;
        }
        if (i17 == 3) {
            return NET_TYPE_3G;
        }
        if (i17 == 4) {
            return NET_TYPE_WIFI;
        }
        if (i17 == 5) {
            return NET_TYPE_4G;
        }
        if (i17 == 6) {
            return NET_TYPE_5G;
        }
        if (i17 != 7) {
            return null;
        }
        return NET_TYPE_WIRED;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f256211d;
    }
}
