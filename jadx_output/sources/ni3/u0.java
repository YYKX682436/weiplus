package ni3;

/* loaded from: classes8.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final cw2.wa f337743a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f337744b;

    public u0(cw2.wa mediaSource, java.lang.String action) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        kotlin.jvm.internal.o.g(action, "action");
        this.f337743a = mediaSource;
        this.f337744b = action;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.u0)) {
            return false;
        }
        ni3.u0 u0Var = (ni3.u0) obj;
        return kotlin.jvm.internal.o.b(this.f337743a, u0Var.f337743a) && kotlin.jvm.internal.o.b(this.f337744b, u0Var.f337744b);
    }

    public int hashCode() {
        return (this.f337743a.hashCode() * 31) + this.f337744b.hashCode();
    }

    public java.lang.String toString() {
        return "PlayFeed(mediaSource=" + this.f337743a + ", action=" + this.f337744b + ')';
    }
}
