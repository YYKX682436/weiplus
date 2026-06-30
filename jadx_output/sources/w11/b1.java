package w11;

/* loaded from: classes5.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f441983a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f441984b;

    /* renamed from: c, reason: collision with root package name */
    public long f441985c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f441986d;

    public b1(boolean z17, boolean z18, long j17, boolean z19, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        z18 = (i17 & 2) != 0 ? false : z18;
        j17 = (i17 & 4) != 0 ? -1L : j17;
        z19 = (i17 & 8) != 0 ? true : z19;
        this.f441983a = z17;
        this.f441984b = z18;
        this.f441985c = j17;
        this.f441986d = z19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w11.b1)) {
            return false;
        }
        w11.b1 b1Var = (w11.b1) obj;
        return this.f441983a == b1Var.f441983a && this.f441984b == b1Var.f441984b && this.f441985c == b1Var.f441985c && this.f441986d == b1Var.f441986d;
    }

    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.f441983a) * 31) + java.lang.Boolean.hashCode(this.f441984b)) * 31) + java.lang.Long.hashCode(this.f441985c)) * 31) + java.lang.Boolean.hashCode(this.f441986d);
    }

    public java.lang.String toString() {
        return "MsgRevokeStatus(isSendingMsgCgi=" + this.f441983a + ", isRevokeBeforeSendingMsg=" + this.f441984b + ", revokeStartTime=" + this.f441985c + ", isRevokeAfterSend=" + this.f441986d + ')';
    }
}
