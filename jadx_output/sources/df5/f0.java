package df5;

/* loaded from: classes11.dex */
public final class f0 extends df5.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f232093a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(int i17, int i18, kotlin.jvm.internal.i iVar) {
        super(null);
        i17 = (i18 & 1) != 0 ? 0 : i17;
        this.f232093a = i17;
    }

    @Override // df5.j0
    public int a() {
        return this.f232093a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof df5.f0) && this.f232093a == ((df5.f0) obj).f232093a;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f232093a);
    }

    public java.lang.String toString() {
        return "HorizontalRule(contentHash=" + this.f232093a + ')';
    }
}
