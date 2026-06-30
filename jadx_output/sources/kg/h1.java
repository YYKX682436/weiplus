package kg;

/* loaded from: classes15.dex */
public enum h1 implements com.google.protobuf.p6 {
    StickerDecoderTypePlatform(0),
    StickerDecoderTypeWxAM(1),
    UNRECOGNIZED(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f307553d;

    static {
        values();
    }

    h1(int i17) {
        this.f307553d = i17;
    }

    @Override // com.google.protobuf.p6
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f307553d;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
