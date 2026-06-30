package s95;

/* loaded from: classes10.dex */
public enum u implements com.google.protobuf.p6 {
    UnknownType(0),
    Video(1),
    Audio(2),
    Image(3),
    UNRECOGNIZED(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f405222d;

    static {
        values();
    }

    u(int i17) {
        this.f405222d = i17;
    }

    public static s95.u a(int i17) {
        if (i17 == 0) {
            return UnknownType;
        }
        if (i17 == 1) {
            return Video;
        }
        if (i17 == 2) {
            return Audio;
        }
        if (i17 != 3) {
            return null;
        }
        return Image;
    }

    @Override // com.google.protobuf.p6
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f405222d;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
