package yf2;

/* loaded from: classes3.dex */
public final class k1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.m1 f461736d;

    public k1(yf2.m1 m1Var) {
        this.f461736d = m1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        yf2.m1 m1Var = this.f461736d;
        com.tencent.mars.xlog.Log.i(m1Var.f461748m, "audioModeChangeData changed: " + num);
        if (num != null && num.intValue() == 1 && zl2.r4.f473950a.G1((r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) m1Var.getStore().business(mm2.g1.class)).f329068f).getValue()) && !((mm2.n0) m1Var.business(mm2.n0.class)).Q6(xy2.c.e(m1Var.O6()))) {
            com.tencent.mars.xlog.Log.i(m1Var.f461748m, "[CoLive] reset enableAudioModeFlag from 1 to 0 (anchor side)");
            mm2.c1 c1Var = (mm2.c1) m1Var.business(mm2.c1.class);
            int i17 = (int) c1Var.f328866q;
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            c1Var.p8(i17 & (-257));
            c1Var.D8(0);
        }
        m1Var.f461751p.a((r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) m1Var.getStore().business(mm2.g1.class)).f329068f).getValue());
    }
}
