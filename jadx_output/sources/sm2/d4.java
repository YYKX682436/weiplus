package sm2;

/* loaded from: classes3.dex */
public final class d4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409426d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(sm2.o4 o4Var) {
        super(1);
        this.f409426d = o4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.plugin.ga0 ga0Var;
        st2.h1 h1Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        sm2.o4 o4Var = this.f409426d;
        java.lang.String str = o4Var.f409610f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prepare shopping:");
        sb6.append(booleanValue);
        sb6.append(",list empty:");
        qm0.a aVar = ((mm2.f6) o4Var.c(mm2.f6.class)).f329039o;
        sb6.append(aVar != null ? java.lang.Boolean.valueOf(aVar.f364680a.isEmpty()) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (booleanValue) {
            if (((mm2.f6) o4Var.c(mm2.f6.class)).P6() && (ga0Var = o4Var.f409637w) != null && (h1Var = ga0Var.f112668r) != null) {
                h1Var.A();
            }
            st2.f2.d(st2.f2.f412287a, o4Var.f19609a, zl2.r4.f473950a.W(((mm2.f6) o4Var.c(mm2.f6.class)).f329038n), false, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
