package df5;

/* loaded from: classes11.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final v11.s f232253a;

    /* renamed from: b, reason: collision with root package name */
    public final v11.s f232254b;

    /* renamed from: c, reason: collision with root package name */
    public final v11.s f232255c;

    public x(v11.s sVar, v11.s sVar2, v11.s sVar3) {
        this.f232253a = sVar;
        this.f232254b = sVar2;
        this.f232255c = sVar3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df5.x)) {
            return false;
        }
        df5.x xVar = (df5.x) obj;
        return kotlin.jvm.internal.o.b(this.f232253a, xVar.f232253a) && kotlin.jvm.internal.o.b(this.f232254b, xVar.f232254b) && kotlin.jvm.internal.o.b(this.f232255c, xVar.f232255c);
    }

    public int hashCode() {
        v11.s sVar = this.f232253a;
        int hashCode = (sVar == null ? 0 : sVar.hashCode()) * 31;
        v11.s sVar2 = this.f232254b;
        int hashCode2 = (hashCode + (sVar2 == null ? 0 : sVar2.hashCode())) * 31;
        v11.s sVar3 = this.f232255c;
        return hashCode2 + (sVar3 != null ? sVar3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CodeBlockCopyRanges(languageRange=" + this.f232253a + ", contentRange=" + this.f232254b + ", closingRange=" + this.f232255c + ')';
    }
}
