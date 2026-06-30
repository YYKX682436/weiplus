package hq0;

/* loaded from: classes7.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq0.i0 f282992d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(hq0.i0 i0Var) {
        super(2);
        this.f282992d = i0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String event = (java.lang.String) obj;
        java.lang.String param = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(param, "param");
        this.f282992d.G1(event, param);
        return jz5.f0.f302826a;
    }
}
