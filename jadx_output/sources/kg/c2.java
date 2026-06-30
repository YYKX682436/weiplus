package kg;

/* loaded from: classes16.dex */
public enum c2 implements com.google.protobuf.p6 {
    TimeTypeNumeric(0),
    TimeTypeInvalid(1),
    TimeTypePositiveInfinity(2),
    TimeTypeNegativeInfinity(3),
    UNRECOGNIZED(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f307529d;

    static {
        values();
    }

    c2(int i17) {
        this.f307529d = i17;
    }

    @Override // com.google.protobuf.p6
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f307529d;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
