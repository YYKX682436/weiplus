package yg5;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f462335a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f462336b;

    /* renamed from: c, reason: collision with root package name */
    public final yg5.a f462337c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f462338d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f462339e;

    public b(java.lang.String uniqueId, java.lang.CharSequence charSequence, yg5.a selectMode, java.util.List optionList, yz5.l lVar) {
        kotlin.jvm.internal.o.g(uniqueId, "uniqueId");
        kotlin.jvm.internal.o.g(selectMode, "selectMode");
        kotlin.jvm.internal.o.g(optionList, "optionList");
        this.f462335a = uniqueId;
        this.f462336b = charSequence;
        this.f462337c = selectMode;
        this.f462338d = optionList;
        this.f462339e = lVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg5.b)) {
            return false;
        }
        yg5.b bVar = (yg5.b) obj;
        return kotlin.jvm.internal.o.b(this.f462335a, bVar.f462335a) && kotlin.jvm.internal.o.b(this.f462336b, bVar.f462336b) && this.f462337c == bVar.f462337c && kotlin.jvm.internal.o.b(this.f462338d, bVar.f462338d) && kotlin.jvm.internal.o.b(this.f462339e, bVar.f462339e);
    }

    public int hashCode() {
        int hashCode = this.f462335a.hashCode() * 31;
        java.lang.CharSequence charSequence = this.f462336b;
        int hashCode2 = (((((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + this.f462337c.hashCode()) * 31) + this.f462338d.hashCode()) * 31;
        yz5.l lVar = this.f462339e;
        return hashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "Group(uniqueId=" + this.f462335a + ", name=" + ((java.lang.Object) this.f462336b) + ", selectMode=" + this.f462337c + ", optionList=" + this.f462338d + ", onOptionSelectedListener=" + this.f462339e + ')';
    }
}
