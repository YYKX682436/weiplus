package gf5;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f271394a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f271395b;

    public g(java.util.Set extraIdentifierStartChars, java.util.Set extraIdentifierPartChars, int i17, kotlin.jvm.internal.i iVar) {
        int i18 = i17 & 1;
        kz5.r0 r0Var = kz5.r0.f314002d;
        extraIdentifierStartChars = i18 != 0 ? r0Var : extraIdentifierStartChars;
        extraIdentifierPartChars = (i17 & 2) != 0 ? r0Var : extraIdentifierPartChars;
        kotlin.jvm.internal.o.g(extraIdentifierStartChars, "extraIdentifierStartChars");
        kotlin.jvm.internal.o.g(extraIdentifierPartChars, "extraIdentifierPartChars");
        this.f271394a = extraIdentifierStartChars;
        this.f271395b = extraIdentifierPartChars;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.g)) {
            return false;
        }
        gf5.g gVar = (gf5.g) obj;
        return kotlin.jvm.internal.o.b(this.f271394a, gVar.f271394a) && kotlin.jvm.internal.o.b(this.f271395b, gVar.f271395b);
    }

    public int hashCode() {
        return (this.f271394a.hashCode() * 31) + this.f271395b.hashCode();
    }

    public java.lang.String toString() {
        return "IdentifierConfig(extraIdentifierStartChars=" + this.f271394a + ", extraIdentifierPartChars=" + this.f271395b + ')';
    }
}
