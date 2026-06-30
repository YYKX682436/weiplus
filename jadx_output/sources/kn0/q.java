package kn0;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f309593a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f309594b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f309595c;

    public q(java.lang.String sdkUserId, java.lang.String roomId, boolean z17) {
        kotlin.jvm.internal.o.g(sdkUserId, "sdkUserId");
        kotlin.jvm.internal.o.g(roomId, "roomId");
        this.f309593a = sdkUserId;
        this.f309594b = roomId;
        this.f309595c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn0.q)) {
            return false;
        }
        kn0.q qVar = (kn0.q) obj;
        return kotlin.jvm.internal.o.b(this.f309593a, qVar.f309593a) && kotlin.jvm.internal.o.b(this.f309594b, qVar.f309594b) && this.f309595c == qVar.f309595c;
    }

    public int hashCode() {
        return (((this.f309593a.hashCode() * 31) + this.f309594b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f309595c);
    }

    public java.lang.String toString() {
        return "LiveTRTCRoomInfo(sdkUserId=" + this.f309593a + ", roomId=" + this.f309594b + ", isAnchor=" + this.f309595c + ')';
    }
}
