package r10;

/* loaded from: classes9.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.x7 f368583d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(bw5.x7 x7Var) {
        super(3);
        this.f368583d = x7Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        y02.h0 service = (y02.h0) obj;
        pq.a context = (pq.a) obj2;
        yz5.l doneCallback = (yz5.l) obj3;
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(doneCallback, "doneCallback");
        y02.d0 c17 = r10.j.c(context);
        bw5.x7 jumpInfo = this.f368583d;
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        byte[] byteArray = jumpInfo.toByteArray();
        y02.o1 o1Var = new y02.o1();
        o1Var.f458621g = doneCallback;
        long cppPointer = ((y02.j0) service).getCppPointer();
        kotlin.jvm.internal.o.d(byteArray);
        urgen.ur_E2DE.UR_4D54.UR_6E69(cppPointer, byteArray, c17, o1Var);
        return jz5.f0.f302826a;
    }
}
