package um2;

/* loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f429010d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(um2.x5 x5Var) {
        super(2);
        this.f429010d = x5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.modelbase.i cgi = (com.tencent.mm.modelbase.i) obj;
        kotlin.jvm.internal.o.g(cgi, "cgi");
        kotlin.jvm.internal.o.g((com.tencent.mm.protocal.protobuf.FinderUserPageResponse) obj2, "<anonymous parameter 1>");
        this.f429010d.Q(cgi);
        return jz5.f0.f302826a;
    }
}
