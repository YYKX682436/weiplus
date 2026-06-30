package h4;

/* loaded from: classes11.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final u26.y0 f278670a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f278671b;

    public j(u26.y0 channel, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 2) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(channel, "channel");
        this.f278670a = channel;
        this.f278671b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4.j)) {
            return false;
        }
        h4.j jVar = (h4.j) obj;
        return kotlin.jvm.internal.o.b(this.f278670a, jVar.f278670a) && this.f278671b == jVar.f278671b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        u26.y0 y0Var = this.f278670a;
        int hashCode = (y0Var != null ? y0Var.hashCode() : 0) * 31;
        boolean z17 = this.f278671b;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        return hashCode + i17;
    }

    public java.lang.String toString() {
        return "ChannelEntry(channel=" + this.f278670a + ", _receivedValue=" + this.f278671b + ")";
    }
}
