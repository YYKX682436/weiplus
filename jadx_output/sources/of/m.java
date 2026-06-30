package of;

/* loaded from: classes14.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f344842a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f344843b = jz5.h.b(new of.l(this));

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f344844c = jz5.h.b(new of.k(this));

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f344845d = jz5.h.b(new of.j(this));

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(virtual memory size=");
        of.n nVar = of.s.f344846c;
        sb6.append(nVar.a(((java.lang.Number) ((jz5.n) this.f344843b).getValue()).intValue() * 1024));
        sb6.append(", rss=");
        sb6.append(nVar.a(((java.lang.Number) ((jz5.n) this.f344844c).getValue()).intValue() * 1024));
        sb6.append(", pss=");
        sb6.append(nVar.a(((java.lang.Number) ((jz5.n) this.f344845d).getValue()).intValue() * 1024));
        sb6.append(", count=");
        java.util.List list = this.f344842a;
        kotlin.jvm.internal.o.d(list);
        sb6.append(list.size());
        sb6.append(')');
        java.lang.String str = sb6.toString() + "\nTop:\n";
        java.util.List list2 = this.f344842a;
        kotlin.jvm.internal.o.d(list2);
        java.util.List list3 = this.f344842a;
        kotlin.jvm.internal.o.d(list3);
        java.util.Iterator it = list2.subList(0, java.lang.Math.min(50, list3.size())).iterator();
        while (it.hasNext()) {
            str = str + "* " + ((of.i) it.next()) + '\n';
        }
        return str;
    }
}
