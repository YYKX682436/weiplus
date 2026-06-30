package r45;

/* loaded from: classes8.dex */
public enum vm5 implements com.tencent.mm.protobuf.h {
    CACHE_TIME_HALF_HOUR(1),
    CACHE_TIME_SEVEN_DAY(6),
    CACHE_TIME_THIRTY_DAY(7),
    CACHE_TIME_MORE_THAN_THIRTY_DAY(8),
    CACHE_TIME_THREE_DAY(5),
    CACHE_TIME_SIX_HOUR(3),
    CACHE_TIME_ONE_HOUR(2),
    CACHE_TIME_ONE_DAY(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f388371d;

    vm5(int i17) {
        this.f388371d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f388371d;
    }
}
