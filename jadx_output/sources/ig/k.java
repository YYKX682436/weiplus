package ig;

/* loaded from: classes5.dex */
public enum k implements com.google.protobuf.p6 {
    IMAGE(1),
    VIDEO(2),
    LIVE_PHOTO(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f291279d;

    static {
        values();
    }

    k(int i17) {
        this.f291279d = i17;
    }

    public static ig.k a(int i17) {
        if (i17 == 1) {
            return IMAGE;
        }
        if (i17 == 2) {
            return VIDEO;
        }
        if (i17 != 3) {
            return null;
        }
        return LIVE_PHOTO;
    }

    @Override // com.google.protobuf.p6
    public final int getNumber() {
        return this.f291279d;
    }
}
