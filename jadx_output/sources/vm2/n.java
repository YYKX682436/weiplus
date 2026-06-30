package vm2;

/* loaded from: classes10.dex */
public final class n implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final dk2.rf f438099d;

    /* renamed from: e, reason: collision with root package name */
    public final int f438100e;

    public n(dk2.rf micReplayInfo, int i17) {
        kotlin.jvm.internal.o.g(micReplayInfo, "micReplayInfo");
        this.f438099d = micReplayInfo;
        this.f438100e = i17;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f438099d.f234039d != null ? r0.hashCode() : 0;
    }

    @Override // in5.c
    public int h() {
        return 2;
    }
}
