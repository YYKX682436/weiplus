package gf5;

/* loaded from: classes11.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.n f271432a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f271433b;

    public p(gf5.n definition, java.util.List aliases) {
        kotlin.jvm.internal.o.g(definition, "definition");
        kotlin.jvm.internal.o.g(aliases, "aliases");
        this.f271432a = definition;
        this.f271433b = aliases;
    }

    public final java.util.List a() {
        return this.f271433b;
    }

    public final gf5.n b() {
        return this.f271432a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.p)) {
            return false;
        }
        gf5.p pVar = (gf5.p) obj;
        return kotlin.jvm.internal.o.b(this.f271432a, pVar.f271432a) && kotlin.jvm.internal.o.b(this.f271433b, pVar.f271433b);
    }

    public int hashCode() {
        return (this.f271432a.hashCode() * 31) + this.f271433b.hashCode();
    }

    public java.lang.String toString() {
        return "LanguagePackageEntry(definition=" + this.f271432a + ", aliases=" + this.f271433b + ')';
    }

    public /* synthetic */ p(gf5.n nVar, java.util.List list, int i17, kotlin.jvm.internal.i iVar) {
        this(nVar, (i17 & 2) != 0 ? kz5.p0.f313996d : list);
    }
}
