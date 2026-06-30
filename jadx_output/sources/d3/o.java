package d3;

/* loaded from: classes13.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.Resources f226102a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.res.Resources.Theme f226103b;

    public o(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
        this.f226102a = resources;
        this.f226103b = theme;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d3.o.class != obj.getClass()) {
            return false;
        }
        d3.o oVar = (d3.o) obj;
        return this.f226102a.equals(oVar.f226102a) && m3.c.a(this.f226103b, oVar.f226103b);
    }

    public int hashCode() {
        return m3.c.b(this.f226102a, this.f226103b);
    }
}
