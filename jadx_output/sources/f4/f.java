package f4;

/* loaded from: classes15.dex */
public final class f extends f4.e {

    /* renamed from: g, reason: collision with root package name */
    public final long f259385g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j17, long j18, long j19, long j27, boolean z17, java.util.List states) {
        super(j17, j18, j19, z17, states);
        kotlin.jvm.internal.o.g(states, "states");
        this.f259385g = j27;
    }

    @Override // f4.e, f4.d
    public boolean equals(java.lang.Object obj) {
        if ((obj instanceof f4.f) && super.equals(obj)) {
            if (this.f259385g == ((f4.f) obj).f259385g) {
                return true;
            }
        }
        return false;
    }

    @Override // f4.e, f4.d
    public int hashCode() {
        return (super.hashCode() * 31) + java.lang.Long.hashCode(this.f259385g);
    }

    @Override // f4.e
    public java.lang.String toString() {
        return "FrameData(frameStartNanos=" + this.f259379a + ", frameDurationUiNanos=" + this.f259380b + ", frameDurationCpuNanos=" + this.f259383e + ", frameOverrunNanos=" + this.f259385g + ", isJank=" + this.f259381c + ", states=" + this.f259382d + ')';
    }
}
