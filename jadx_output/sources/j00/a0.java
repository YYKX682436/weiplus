package j00;

/* loaded from: classes9.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.d0 f296699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f296700e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(j00.d0 d0Var, yz5.l lVar) {
        super(2);
        this.f296699d = d0Var;
        this.f296700e = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bw5.j8 type = (bw5.j8) obj;
        bw5.i8 info = (bw5.i8) obj2;
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(info, "info");
        if (type == bw5.j8.EcsOpenEventType_wxaNavBackToNative) {
            j00.d0 d0Var = this.f296699d;
            java.lang.String b17 = info.b();
            if (b17 == null) {
                b17 = "";
            }
            d0Var.a(0L, "", b17, this.f296700e);
        }
        return jz5.f0.f302826a;
    }
}
