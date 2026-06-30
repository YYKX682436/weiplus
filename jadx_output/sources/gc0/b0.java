package gc0;

/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f270099a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f270100b;

    public b0(java.lang.String talker, java.lang.String str) {
        kotlin.jvm.internal.o.g(talker, "talker");
        this.f270099a = talker;
        this.f270100b = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc0.b0)) {
            return false;
        }
        gc0.b0 b0Var = (gc0.b0) obj;
        return kotlin.jvm.internal.o.b(this.f270099a, b0Var.f270099a) && kotlin.jvm.internal.o.b(this.f270100b, b0Var.f270100b);
    }

    public int hashCode() {
        int hashCode = this.f270099a.hashCode() * 31;
        java.lang.String str = this.f270100b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "RecommendProfile(talker=" + this.f270099a + ", nickname=" + this.f270100b + ')';
    }
}
