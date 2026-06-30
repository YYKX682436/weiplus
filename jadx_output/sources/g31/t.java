package g31;

/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f268117a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f268118b;

    /* renamed from: c, reason: collision with root package name */
    public final int f268119c;

    public t(java.lang.String bizUsername, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        this.f268117a = bizUsername;
        this.f268118b = z17;
        this.f268119c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g31.t)) {
            return false;
        }
        g31.t tVar = (g31.t) obj;
        return kotlin.jvm.internal.o.b(this.f268117a, tVar.f268117a) && this.f268118b == tVar.f268118b && this.f268119c == tVar.f268119c;
    }

    public int hashCode() {
        return (((this.f268117a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f268118b)) * 31) + java.lang.Integer.hashCode(this.f268119c);
    }

    public java.lang.String toString() {
        return "NotifySwitchInfo(bizUsername=" + this.f268117a + ", isOpened=" + this.f268118b + ", importantNotifyNum=" + this.f268119c + ')';
    }
}
