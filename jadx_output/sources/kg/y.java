package kg;

/* loaded from: classes16.dex */
public enum y implements com.google.protobuf.p6 {
    ContentFlipModeNone(0),
    ContentFlipModeHorizontal(1),
    ContentFlipModeVertical(2),
    ContentFlipModeHorizontalAndVertical(3),
    UNRECOGNIZED(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f307661d;

    static {
        values();
    }

    y(int i17) {
        this.f307661d = i17;
    }

    @Override // com.google.protobuf.p6
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f307661d;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
