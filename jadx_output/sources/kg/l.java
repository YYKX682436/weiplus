package kg;

/* loaded from: classes15.dex */
public enum l implements com.google.protobuf.p6 {
    CanvasOriginTypeTopLeft(0),
    CanvasOriginTypeBottomLeft(1),
    UNRECOGNIZED(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f307575d;

    static {
        values();
    }

    l(int i17) {
        this.f307575d = i17;
    }

    @Override // com.google.protobuf.p6
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f307575d;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
