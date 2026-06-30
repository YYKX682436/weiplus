package so4;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public uq5.p f410766a;

    /* renamed from: b, reason: collision with root package name */
    public int f410767b;

    public a(uq5.p pVar, int i17, int i18, kotlin.jvm.internal.i iVar) {
        pVar = (i18 & 1) != 0 ? null : pVar;
        i17 = (i18 & 2) != 0 ? 12 : i17;
        this.f410766a = pVar;
        this.f410767b = i17;
    }

    public final long a() {
        uq5.p pVar = this.f410766a;
        if (pVar != null) {
            return pVar.f430267a;
        }
        return 0L;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so4.a)) {
            return false;
        }
        so4.a aVar = (so4.a) obj;
        return kotlin.jvm.internal.o.b(this.f410766a, aVar.f410766a) && this.f410767b == aVar.f410767b;
    }

    public int hashCode() {
        uq5.p pVar = this.f410766a;
        return ((pVar == null ? 0 : pVar.hashCode()) * 31) + java.lang.Integer.hashCode(this.f410767b);
    }

    public java.lang.String toString() {
        return "VideoEnhancementEffectInfo(effect=" + this.f410766a + ", currentScene=" + this.f410767b + ')';
    }
}
