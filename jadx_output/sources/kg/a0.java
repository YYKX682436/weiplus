package kg;

/* loaded from: classes16.dex */
public enum a0 implements com.google.protobuf.p6 {
    ContentScaleModeCenter(0),
    ContentScaleModeFill(1),
    ContentScaleModeAspectFit(2),
    ContentScaleModeAspectFill(3),
    UNRECOGNIZED(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f307511d;

    static {
        values();
    }

    a0(int i17) {
        this.f307511d = i17;
    }

    @Override // com.google.protobuf.p6
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f307511d;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
