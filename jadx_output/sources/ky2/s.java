package ky2;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public boolean f313578a;

    /* renamed from: b, reason: collision with root package name */
    public int f313579b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f313580c;

    public s(boolean z17, int i17, java.lang.String str, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 1) != 0 ? true : z17;
        i17 = (i18 & 2) != 0 ? 3 : i17;
        str = (i18 & 4) != 0 ? null : str;
        this.f313578a = z17;
        this.f313579b = i17;
        this.f313580c = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky2.s)) {
            return false;
        }
        ky2.s sVar = (ky2.s) obj;
        return this.f313578a == sVar.f313578a && this.f313579b == sVar.f313579b && kotlin.jvm.internal.o.b(this.f313580c, sVar.f313580c);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f313578a) * 31) + java.lang.Integer.hashCode(this.f313579b)) * 31;
        java.lang.String str = this.f313580c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "VoteSettingItem(isSingleChoice=" + this.f313578a + ", time=" + this.f313579b + ", question=" + this.f313580c + ')';
    }
}
