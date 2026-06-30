package x3;

/* loaded from: classes15.dex */
public class r {

    /* renamed from: e, reason: collision with root package name */
    public static final x3.r f451591e = androidx.gridlayout.widget.GridLayout.l(Integer.MIN_VALUE, 1, androidx.gridlayout.widget.GridLayout.f11538w, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f451592a;

    /* renamed from: b, reason: collision with root package name */
    public final x3.o f451593b;

    /* renamed from: c, reason: collision with root package name */
    public final x3.j f451594c;

    /* renamed from: d, reason: collision with root package name */
    public final float f451595d;

    public r(boolean z17, x3.o oVar, x3.j jVar, float f17) {
        this.f451592a = z17;
        this.f451593b = oVar;
        this.f451594c = jVar;
        this.f451595d = f17;
    }

    public x3.j a(boolean z17) {
        x3.j jVar = androidx.gridlayout.widget.GridLayout.f11538w;
        x3.j jVar2 = this.f451594c;
        return jVar2 != jVar ? jVar2 : this.f451595d == 0.0f ? z17 ? androidx.gridlayout.widget.GridLayout.f11541z : androidx.gridlayout.widget.GridLayout.E : androidx.gridlayout.widget.GridLayout.F;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x3.r.class != obj.getClass()) {
            return false;
        }
        x3.r rVar = (x3.r) obj;
        return this.f451594c.equals(rVar.f451594c) && this.f451593b.equals(rVar.f451593b);
    }

    public int hashCode() {
        return (this.f451593b.hashCode() * 31) + this.f451594c.hashCode();
    }
}
