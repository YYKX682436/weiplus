package tm2;

/* loaded from: classes3.dex */
public final class o2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420563d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(tm2.s2 s2Var) {
        super(1);
        this.f420563d = s2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.plugin.ga0 ga0Var;
        st2.h1 h1Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        tm2.s2 s2Var = this.f420563d;
        com.tencent.mars.xlog.Log.i(s2Var.f420587g, "prepare shopping:" + booleanValue + ",list empty:" + ((mm2.f6) s2Var.c(mm2.f6.class)).f329039o.f364680a.isEmpty());
        if (booleanValue) {
            if (((mm2.f6) s2Var.c(mm2.f6.class)).P6() && (ga0Var = s2Var.f420612w) != null && (h1Var = ga0Var.f112668r) != null) {
                h1Var.A();
            }
            st2.f2.d(st2.f2.f412287a, s2Var.f19609a, zl2.r4.f473950a.W(((mm2.f6) s2Var.c(mm2.f6.class)).f329038n), false, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
