package sr3;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f411840a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f411841b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f411842c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f411843d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f411844e;

    public d(java.util.List fragmentsToAdd, java.util.List fragmentsToRemove, java.util.Map fragmentsToUpdate, java.util.Map tabTextsToUpdate, boolean z17) {
        kotlin.jvm.internal.o.g(fragmentsToAdd, "fragmentsToAdd");
        kotlin.jvm.internal.o.g(fragmentsToRemove, "fragmentsToRemove");
        kotlin.jvm.internal.o.g(fragmentsToUpdate, "fragmentsToUpdate");
        kotlin.jvm.internal.o.g(tabTextsToUpdate, "tabTextsToUpdate");
        this.f411840a = fragmentsToAdd;
        this.f411841b = fragmentsToRemove;
        this.f411842c = fragmentsToUpdate;
        this.f411843d = tabTextsToUpdate;
        this.f411844e = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr3.d)) {
            return false;
        }
        sr3.d dVar = (sr3.d) obj;
        return kotlin.jvm.internal.o.b(this.f411840a, dVar.f411840a) && kotlin.jvm.internal.o.b(this.f411841b, dVar.f411841b) && kotlin.jvm.internal.o.b(this.f411842c, dVar.f411842c) && kotlin.jvm.internal.o.b(this.f411843d, dVar.f411843d) && this.f411844e == dVar.f411844e;
    }

    public int hashCode() {
        return (((((((this.f411840a.hashCode() * 31) + this.f411841b.hashCode()) * 31) + this.f411842c.hashCode()) * 31) + this.f411843d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f411844e);
    }

    public java.lang.String toString() {
        return "FragmentUpdateResult(fragmentsToAdd=" + this.f411840a + ", fragmentsToRemove=" + this.f411841b + ", fragmentsToUpdate=" + this.f411842c + ", tabTextsToUpdate=" + this.f411843d + ", shouldNotifyDataSetChanged=" + this.f411844e + ')';
    }
}
