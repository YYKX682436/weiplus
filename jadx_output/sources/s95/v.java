package s95;

/* loaded from: classes10.dex */
public enum v implements com.google.protobuf.p6 {
    Custom(0),
    CenterCrop(1),
    CenterInside(2),
    UNRECOGNIZED(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f405235d;

    static {
        values();
    }

    v(int i17) {
        this.f405235d = i17;
    }

    public static s95.v a(int i17) {
        if (i17 == 0) {
            return Custom;
        }
        if (i17 == 1) {
            return CenterCrop;
        }
        if (i17 != 2) {
            return null;
        }
        return CenterInside;
    }

    @Override // com.google.protobuf.p6
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f405235d;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
