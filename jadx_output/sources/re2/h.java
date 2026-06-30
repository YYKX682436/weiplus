package re2;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final re2.g f394417a;

    /* renamed from: b, reason: collision with root package name */
    public final int f394418b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f394419c;

    public h(re2.g stage, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(stage, "stage");
        this.f394417a = stage;
        this.f394418b = i17;
        this.f394419c = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re2.h)) {
            return false;
        }
        re2.h hVar = (re2.h) obj;
        return this.f394417a == hVar.f394417a && this.f394418b == hVar.f394418b && kotlin.jvm.internal.o.b(this.f394419c, hVar.f394419c);
    }

    public int hashCode() {
        int hashCode = ((this.f394417a.hashCode() * 31) + java.lang.Integer.hashCode(this.f394418b)) * 31;
        java.lang.String str = this.f394419c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "Failure(stage=" + this.f394417a + ", errCode=" + this.f394418b + ", errMsg=" + this.f394419c + ')';
    }
}
