package sm2;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409480d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(sm2.o4 o4Var) {
        super(1);
        this.f409480d = o4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        sm2.o4 o4Var = this.f409480d;
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = o4Var.M;
        if (x7Var != null) {
            x7Var.G1(booleanValue, ((mm2.o4) o4Var.c(mm2.o4.class)).l7());
        }
        return jz5.f0.f302826a;
    }
}
