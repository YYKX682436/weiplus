package n06;

/* loaded from: classes15.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final n06.e f333968a = new n06.e();

    public static o06.g b(n06.e eVar, n16.c fqName, l06.o builtIns, java.lang.Integer num, int i17, java.lang.Object obj) {
        n16.b f17;
        if ((i17 & 4) != 0) {
            num = null;
        }
        eVar.getClass();
        kotlin.jvm.internal.o.g(fqName, "fqName");
        kotlin.jvm.internal.o.g(builtIns, "builtIns");
        if (num == null || !kotlin.jvm.internal.o.b(fqName, n06.d.f333959g)) {
            f17 = n06.d.f333953a.f(fqName);
        } else {
            f17 = new n16.b(l06.x.f314956k, n16.g.k("Function" + num.intValue()));
        }
        if (f17 != null) {
            return builtIns.j(f17.b());
        }
        return null;
    }

    public final o06.g a(o06.g readOnly) {
        kotlin.jvm.internal.o.g(readOnly, "readOnly");
        n16.e g17 = r16.i.g(readOnly);
        n06.d dVar = n06.d.f333953a;
        n16.c cVar = (n16.c) n06.d.f333964l.get(g17);
        if (cVar != null) {
            o06.g j17 = v16.f.e(readOnly).j(cVar);
            kotlin.jvm.internal.o.f(j17, "getBuiltInClassByFqName(...)");
            return j17;
        }
        throw new java.lang.IllegalArgumentException("Given class " + readOnly + " is not a read-only collection");
    }
}
