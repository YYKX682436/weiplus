package f4;

/* loaded from: classes15.dex */
public class e extends f4.d {

    /* renamed from: e, reason: collision with root package name */
    public final long f259383e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.FrameMetrics f259384f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j17, long j18, long j19, boolean z17, java.util.List states) {
        super(j17, j18, z17, states);
        kotlin.jvm.internal.o.g(states, "states");
        this.f259383e = j19;
    }

    @Override // f4.d
    public boolean equals(java.lang.Object obj) {
        if ((obj instanceof f4.e) && super.equals(obj)) {
            if (this.f259383e == ((f4.e) obj).f259383e) {
                return true;
            }
        }
        return false;
    }

    @Override // f4.d
    public int hashCode() {
        return (super.hashCode() * 31) + java.lang.Long.hashCode(this.f259383e);
    }

    public java.lang.String toString() {
        return "FrameData(frameStartNanos=" + this.f259379a + ", frameDurationUiNanos=" + this.f259380b + ", frameDurationCpuNanos=" + this.f259383e + ", isJank=" + this.f259381c + ", states=" + this.f259382d + ')';
    }
}
