package kg;

/* loaded from: classes16.dex */
public enum z implements com.google.protobuf.p6 {
    ContentRotationModeNone(0),
    ContentRotationModeCCW90(1),
    ContentRotationMode180(2),
    ContentRotationModeCW90(3),
    UNRECOGNIZED(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f307668d;

    static {
        values();
    }

    z(int i17) {
        this.f307668d = i17;
    }

    @Override // com.google.protobuf.p6
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f307668d;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
