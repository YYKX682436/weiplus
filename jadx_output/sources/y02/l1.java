package y02;

/* loaded from: classes9.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y02.h1 f458612d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(y02.h1 h1Var) {
        super(2);
        this.f458612d = h1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bw5.j8 type = (bw5.j8) obj;
        bw5.i8 info = (bw5.i8) obj2;
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(info, "info");
        this.f458612d.D8(type, info);
        return jz5.f0.f302826a;
    }
}
