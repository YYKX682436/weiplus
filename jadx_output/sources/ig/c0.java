package ig;

/* loaded from: classes16.dex */
public enum c0 implements com.google.protobuf.p6 {
    UNKNOWN(0),
    FIXED(1),
    RECOMMEND_V2(2),
    RECOMMEND_V3(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f291274d;

    static {
        values();
    }

    c0(int i17) {
        this.f291274d = i17;
    }

    public static ig.c0 a(int i17) {
        if (i17 == 0) {
            return UNKNOWN;
        }
        if (i17 == 1) {
            return FIXED;
        }
        if (i17 == 2) {
            return RECOMMEND_V2;
        }
        if (i17 != 3) {
            return null;
        }
        return RECOMMEND_V3;
    }

    @Override // com.google.protobuf.p6
    public final int getNumber() {
        return this.f291274d;
    }
}
