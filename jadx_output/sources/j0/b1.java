package j0;

/* loaded from: classes14.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f296217d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(j0.c5 c5Var) {
        super(1);
        this.f296217d = c5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        a2.d it = (a2.d) obj;
        kotlin.jvm.internal.o.g(it, "it");
        yz5.l lVar = this.f296217d.f296247o;
        java.lang.String str = it.f681d;
        int length = str.length();
        ((j0.a5) lVar).invoke(new g2.e0(str, a2.n1.a(length, length), (a2.m1) null, 4, (kotlin.jvm.internal.i) null));
        return java.lang.Boolean.TRUE;
    }
}
