package i06;

/* loaded from: classes15.dex */
public final class u3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.w3 f286762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f286763e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(i06.w3 w3Var, yz5.a aVar) {
        super(0);
        this.f286762d = w3Var;
        this.f286763e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        f06.z zVar;
        i06.w3 w3Var = this.f286762d;
        java.util.List u07 = w3Var.f286780d.u0();
        if (u07.isEmpty()) {
            return kz5.p0.f313996d;
        }
        jz5.g a17 = jz5.h.a(jz5.i.f302830e, new i06.t3(w3Var));
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(u07, 10));
        int i17 = 0;
        for (java.lang.Object obj : u07) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            f26.l2 l2Var = (f26.l2) obj;
            if (l2Var.b()) {
                zVar = f06.z.f258459c;
            } else {
                f26.o0 type = l2Var.getType();
                kotlin.jvm.internal.o.f(type, "getType(...)");
                i06.w3 w3Var2 = new i06.w3(type, this.f286763e != null ? new i06.s3(w3Var, i17, a17) : null);
                int ordinal = l2Var.c().ordinal();
                if (ordinal == 0) {
                    zVar = new f06.z(f06.a0.f258435d, w3Var2);
                } else if (ordinal == 1) {
                    zVar = new f06.z(f06.a0.f258436e, w3Var2);
                } else {
                    if (ordinal != 2) {
                        throw new jz5.j();
                    }
                    zVar = new f06.z(f06.a0.f258437f, w3Var2);
                }
            }
            arrayList.add(zVar);
            i17 = i18;
        }
        return arrayList;
    }
}
