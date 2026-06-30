package kg;

/* loaded from: classes15.dex */
public enum d2 implements com.google.protobuf.p6 {
    TimingFillModeNone(0),
    TimingFillModeLooping(1),
    TimingFillModeLastFrame(2),
    UNRECOGNIZED(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f307537d;

    static {
        values();
    }

    d2(int i17) {
        this.f307537d = i17;
    }

    @Override // com.google.protobuf.p6
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f307537d;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
