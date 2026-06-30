package q01;

/* loaded from: classes9.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final q01.i0 f359294d = new q01.i0();

    public i0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.l it = (jz5.l) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        jz5.l lVar = (jz5.l) it.f302833d;
        sb6.append(((q01.h0) lVar.f302833d).f359290a);
        sb6.append(">>");
        sb6.append(((q01.h0) lVar.f302834e).f359290a);
        sb6.append('(');
        sb6.append(((q01.h0) lVar.f302834e).f359292c);
        sb6.append('-');
        sb6.append(((q01.h0) lVar.f302834e).f359293d);
        sb6.append(")=");
        sb6.append(((java.lang.Number) it.f302834e).longValue());
        sb6.append("ms");
        return sb6.toString();
    }
}
