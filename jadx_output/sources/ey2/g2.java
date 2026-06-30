package ey2;

/* loaded from: classes2.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ey2.h2 f257381d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(ey2.h2 h2Var) {
        super(2);
        this.f257381d = h2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        kotlin.jvm.internal.o.g((java.lang.String) obj2, "<anonymous parameter 1>");
        return java.lang.Boolean.valueOf(this.f257381d.f257389b.indexOfKey(longValue) < 0);
    }
}
