package qf2;

/* loaded from: classes10.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f362285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362286e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(qf2.c3 c3Var, java.lang.String str) {
        super(0);
        this.f362285d = c3Var;
        this.f362286e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qf2.c3 c3Var = this.f362285d;
        ((mm2.y2) c3Var.business(mm2.y2.class)).f329566s = null;
        com.tencent.mm.plugin.finder.live.plugin.na naVar = (com.tencent.mm.plugin.finder.live.plugin.na) c3Var.R6(com.tencent.mm.plugin.finder.live.plugin.na.class);
        if (naVar != null) {
            naVar.B1();
        }
        ((mm2.o4) c3Var.business(mm2.o4.class)).Z = null;
        c3Var.d7(this.f362286e);
        com.tencent.mm.plugin.finder.live.view.ub ubVar = c3Var.f291099e;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
        if (k0Var != null) {
            com.tencent.mm.plugin.finder.live.view.k0.fillBlurBg$default(k0Var, ((mm2.c1) c3Var.business(mm2.c1.class)).f328852o, false, 2, null);
        }
        if (((mm2.e1) c3Var.business(mm2.e1.class)).g7()) {
            c3Var.f7(-1);
        } else if (zl2.r4.f473950a.x1()) {
            if (c3Var.f362313o == 2) {
                c3Var.f362313o = 1;
            }
            if (c3Var.f362313o == 4) {
                c3Var.f362313o = 3;
            }
            if (c3Var.f362313o == 10) {
                c3Var.f362313o = 9;
            }
            tn0.w0 Q6 = c3Var.Q6();
            if (Q6 != null) {
                Q6.i0(c3Var.f362313o, "");
            }
        }
        return jz5.f0.f302826a;
    }
}
