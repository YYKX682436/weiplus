package f26;

/* loaded from: classes14.dex */
public final class r1 extends l26.g {

    /* renamed from: e, reason: collision with root package name */
    public static final f26.q1 f259214e = new f26.q1(null);

    /* renamed from: f, reason: collision with root package name */
    public static final f26.r1 f259215f = new f26.r1(kz5.p0.f313996d);

    public r1(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            f26.o1 o1Var = (f26.o1) it.next();
            ((f26.o) o1Var).getClass();
            f06.d tClass = kotlin.jvm.internal.i0.a(f26.o.class);
            kotlin.jvm.internal.o.g(tClass, "tClass");
            java.lang.String d17 = tClass.d();
            kotlin.jvm.internal.o.d(d17);
            int a17 = f259214e.a(d17);
            int d18 = this.f315227d.d();
            if (d18 != 0) {
                if (d18 == 1) {
                    l26.d dVar = this.f315227d;
                    kotlin.jvm.internal.o.e(dVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                    l26.c0 c0Var = (l26.c0) dVar;
                    int i17 = c0Var.f315219e;
                    if (i17 == a17) {
                        this.f315227d = new l26.c0(o1Var, a17);
                    } else {
                        l26.f fVar = new l26.f();
                        this.f315227d = fVar;
                        fVar.e(i17, c0Var.f315218d);
                    }
                }
                this.f315227d.e(a17, o1Var);
            } else {
                this.f315227d = new l26.c0(o1Var, a17);
            }
        }
    }
}
