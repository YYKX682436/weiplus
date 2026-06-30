package wu0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ru0.h f449657a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.ne4 f449658b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f449659c;

    public e(ru0.h uniqueHexKey, r45.ne4 ne4Var, boolean z17) {
        kotlin.jvm.internal.o.g(uniqueHexKey, "uniqueHexKey");
        this.f449657a = uniqueHexKey;
        this.f449658b = ne4Var;
        this.f449659c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu0.e)) {
            return false;
        }
        wu0.e eVar = (wu0.e) obj;
        return kotlin.jvm.internal.o.b(this.f449657a, eVar.f449657a) && kotlin.jvm.internal.o.b(this.f449658b, eVar.f449658b) && this.f449659c == eVar.f449659c;
    }

    public int hashCode() {
        int hashCode = this.f449657a.hashCode() * 31;
        r45.ne4 ne4Var = this.f449658b;
        return ((hashCode + (ne4Var == null ? 0 : ne4Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f449659c);
    }

    public java.lang.String toString() {
        return "SubtitleResultData(uniqueHexKey=" + this.f449657a + ", subtitleData=" + this.f449658b + ", isGroupCompleted=" + this.f449659c + ')';
    }
}
