package s95;

/* loaded from: classes15.dex */
public enum t implements com.google.protobuf.p6 {
    NoneAnimation(0),
    /* JADX INFO: Fake field, exist only in values array */
    AnimationStart(1),
    /* JADX INFO: Fake field, exist only in values array */
    AnimationProgress(2),
    /* JADX INFO: Fake field, exist only in values array */
    AnimationFinish(3),
    UNRECOGNIZED(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f405211d;

    static {
        values();
    }

    t(int i17) {
        this.f405211d = i17;
    }

    @Override // com.google.protobuf.p6
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f405211d;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
