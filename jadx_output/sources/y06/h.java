package y06;

/* loaded from: classes16.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final y06.h f458677a = new y06.h();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f458678b = kz5.c1.k(new jz5.l("PACKAGE", java.util.EnumSet.noneOf(p06.u.class)), new jz5.l("TYPE", java.util.EnumSet.of(p06.u.f350782f, p06.u.f350794u)), new jz5.l("ANNOTATION_TYPE", java.util.EnumSet.of(p06.u.f350783g)), new jz5.l("TYPE_PARAMETER", java.util.EnumSet.of(p06.u.f350784h)), new jz5.l("FIELD", java.util.EnumSet.of(p06.u.f350786m)), new jz5.l("LOCAL_VARIABLE", java.util.EnumSet.of(p06.u.f350787n)), new jz5.l("PARAMETER", java.util.EnumSet.of(p06.u.f350788o)), new jz5.l("CONSTRUCTOR", java.util.EnumSet.of(p06.u.f350789p)), new jz5.l("METHOD", java.util.EnumSet.of(p06.u.f350790q, p06.u.f350791r, p06.u.f350792s)), new jz5.l("TYPE_USE", java.util.EnumSet.of(p06.u.f350793t)));

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f458679c = kz5.c1.k(new jz5.l("RUNTIME", p06.t.f350777d), new jz5.l("CLASS", p06.t.f350778e), new jz5.l("SOURCE", p06.t.f350779f));

    public final t16.g a(java.util.List arguments) {
        kotlin.jvm.internal.o.g(arguments, "arguments");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : arguments) {
            if (obj instanceof e16.m) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Iterable iterable = (java.util.EnumSet) f458678b.get(n16.g.k(((u06.c0) ((e16.m) it.next())).f423493b.name()).h());
            if (iterable == null) {
                iterable = kz5.r0.f314002d;
            }
            kz5.h0.u(arrayList2, iterable);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            arrayList3.add(new t16.k(n16.b.l(l06.w.f314941v), n16.g.k(((p06.u) it6.next()).name())));
        }
        return new t16.b(arrayList3, y06.g.f458676d);
    }
}
