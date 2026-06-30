package qi2;

/* loaded from: classes10.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi2.j1 f363515d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(qi2.j1 j1Var) {
        super(0);
        this.f363515d = j1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qi2.j1 j1Var = this.f363515d;
        qf2.c3 c3Var = (qf2.c3) j1Var.f363535h.getController(qf2.c3.class);
        if (c3Var != null) {
            qi2.c1 c1Var = new qi2.c1(j1Var);
            dk2.u4 u4Var = ((mm2.o4) c3Var.business(mm2.o4.class)).Z;
            if (u4Var != null) {
                com.tencent.mm.plugin.finder.live.util.y.d(c3Var, null, null, new qf2.h2(c3Var, u4Var, c1Var, null), 3, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
