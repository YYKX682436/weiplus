package xt2;

/* loaded from: classes3.dex */
public final class c4 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xt2.b5 f456662a;

    public c4(xt2.b5 b5Var) {
        this.f456662a = b5Var;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        xt2.b5 b5Var = this.f456662a;
        xt2.b4 b4Var = new xt2.b4(b5Var);
        b5Var.getClass();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.r2 d17 = kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new xt2.x4(h0Var, b5Var, null), 2, null);
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = b5Var.f456637i;
        dk2.xf k17 = efVar.k(eVar);
        if (k17 != null) {
            com.tencent.mm.ui.MMActivity mMActivity = b5Var.f456636h;
            long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0);
            long j18 = ((mm2.e1) eVar.a(mm2.e1.class)).f328983m;
            java.lang.String str = ((mm2.c1) eVar.a(mm2.c1.class)).f328852o;
            r45.hx0 hx0Var = new r45.hx0();
            r45.vv2 vv2Var = new r45.vv2();
            vv2Var.set(0, java.lang.Integer.valueOf(z17 ? 1 : 0));
            hx0Var.set(1, hc2.b.a(vv2Var));
            hx0Var.set(0, 112);
            ((dk2.r4) k17).a0(mMActivity, j17, j18, str, hx0Var, new xt2.w4(d17, h0Var, b4Var, z17));
        }
    }
}
