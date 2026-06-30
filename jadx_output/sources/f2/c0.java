package f2;

/* loaded from: classes14.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final f2.h f258792a;

    /* renamed from: b, reason: collision with root package name */
    public final f2.r f258793b;

    /* renamed from: c, reason: collision with root package name */
    public final int f258794c;

    /* renamed from: d, reason: collision with root package name */
    public final int f258795d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f258796e;

    public c0(f2.h hVar, f2.r rVar, int i17, int i18, java.lang.Object obj, kotlin.jvm.internal.i iVar) {
        this.f258792a = hVar;
        this.f258793b = rVar;
        this.f258794c = i17;
        this.f258795d = i18;
        this.f258796e = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2.c0)) {
            return false;
        }
        f2.c0 c0Var = (f2.c0) obj;
        if (!kotlin.jvm.internal.o.b(this.f258792a, c0Var.f258792a) || !kotlin.jvm.internal.o.b(this.f258793b, c0Var.f258793b)) {
            return false;
        }
        if (this.f258794c == c0Var.f258794c) {
            return (this.f258795d == c0Var.f258795d) && kotlin.jvm.internal.o.b(this.f258796e, c0Var.f258796e);
        }
        return false;
    }

    public int hashCode() {
        f2.h hVar = this.f258792a;
        int hashCode = (((((((hVar == null ? 0 : hVar.hashCode()) * 31) + this.f258793b.f258825d) * 31) + java.lang.Integer.hashCode(this.f258794c)) * 31) + java.lang.Integer.hashCode(this.f258795d)) * 31;
        java.lang.Object obj = this.f258796e;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TypefaceRequest(fontFamily=");
        sb6.append(this.f258792a);
        sb6.append(", fontWeight=");
        sb6.append(this.f258793b);
        sb6.append(", fontStyle=");
        int i17 = this.f258794c;
        if (i17 == 0) {
            str = "Normal";
        } else {
            str = i17 == 1 ? "Italic" : "Invalid";
        }
        sb6.append((java.lang.Object) str);
        sb6.append(", fontSynthesis=");
        sb6.append((java.lang.Object) f2.q.a(this.f258795d));
        sb6.append(", resourceLoaderCacheKey=");
        sb6.append(this.f258796e);
        sb6.append(')');
        return sb6.toString();
    }
}
