package jk4;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final nk4.s f300147a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f300148b;

    public c(nk4.s sVar, java.lang.Object obj) {
        this.f300147a = sVar;
        this.f300148b = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk4.c)) {
            return false;
        }
        jk4.c cVar = (jk4.c) obj;
        return kotlin.jvm.internal.o.b(this.f300147a, cVar.f300147a) && kotlin.jvm.internal.o.b(this.f300148b, cVar.f300148b);
    }

    public int hashCode() {
        nk4.s sVar = this.f300147a;
        int hashCode = (sVar == null ? 0 : sVar.hashCode()) * 31;
        java.lang.Object obj = this.f300148b;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FlutterThumbPlayerPluginParams(reporter=" + this.f300147a + ", requestFocusScene=" + this.f300148b + ')';
    }
}
