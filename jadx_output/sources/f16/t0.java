package f16;

/* loaded from: classes15.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final f16.t0 f258776d = new f16.t0();

    public t0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        o06.j i17 = ((f26.c3) obj).w0().i();
        if (i17 == null) {
            return java.lang.Boolean.FALSE;
        }
        n16.g name = i17.getName();
        n16.c cVar = n06.d.f333959g;
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(name, cVar.f()) && kotlin.jvm.internal.o.b(v16.f.c(i17), cVar));
    }
}
