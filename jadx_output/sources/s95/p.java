package s95;

/* loaded from: classes10.dex */
public enum p implements com.google.protobuf.p6 {
    PbDefault(0),
    /* JADX INFO: Fake field, exist only in values array */
    PbForbidOutside(1),
    PbJumpBack(2),
    UNRECOGNIZED(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f405163d;

    static {
        values();
    }

    p(int i17) {
        this.f405163d = i17;
    }

    @Override // com.google.protobuf.p6
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f405163d;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
