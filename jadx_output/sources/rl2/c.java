package rl2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f397184a;

    /* renamed from: b, reason: collision with root package name */
    public int f397185b;

    /* renamed from: c, reason: collision with root package name */
    public int f397186c;

    /* renamed from: d, reason: collision with root package name */
    public int f397187d;

    /* renamed from: e, reason: collision with root package name */
    public int f397188e;

    public c(long j17, int i17, int i18, int i19, int i27) {
        this.f397184a = j17;
        this.f397185b = i17;
        this.f397186c = i18;
        this.f397187d = i19;
        this.f397188e = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl2.c)) {
            return false;
        }
        rl2.c cVar = (rl2.c) obj;
        return this.f397184a == cVar.f397184a && this.f397185b == cVar.f397185b && this.f397186c == cVar.f397186c && this.f397187d == cVar.f397187d && this.f397188e == cVar.f397188e;
    }

    public int hashCode() {
        return (((((((java.lang.Long.hashCode(this.f397184a) * 31) + java.lang.Integer.hashCode(this.f397185b)) * 31) + java.lang.Integer.hashCode(this.f397186c)) * 31) + java.lang.Integer.hashCode(this.f397187d)) * 31) + java.lang.Integer.hashCode(this.f397188e);
    }

    public java.lang.String toString() {
        return "liveId:" + this.f397184a + ",time:(" + this.f397185b + ", " + this.f397186c + "),payForLive:" + this.f397187d + ",invalid:" + this.f397188e;
    }

    public /* synthetic */ c(long j17, int i17, int i18, int i19, int i27, int i28, kotlin.jvm.internal.i iVar) {
        this((i28 & 1) != 0 ? 0L : j17, (i28 & 2) != 0 ? 0 : i17, (i28 & 4) != 0 ? 0 : i18, (i28 & 8) != 0 ? 0 : i19, (i28 & 16) != 0 ? 0 : i27);
    }
}
