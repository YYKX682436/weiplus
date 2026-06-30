package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class p8 extends wm3.a implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.f4 f161427d;

    /* renamed from: e, reason: collision with root package name */
    public long f161428e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f161429f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void T6() {
        boolean z17 = this.f161429f;
        if (z17) {
            this.f161428e |= 18014398509481984L;
        } else {
            this.f161428e &= -18014398509481985L;
        }
        int i17 = z17 ? 1 : 2;
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 72;
        p53Var.f382762e = i17;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).e(new xg3.p0(23, p53Var));
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(this.f161428e));
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsCareModeCloseUIC", "switch ext change : open = " + this.f161429f + " item value = " + p53Var.f382762e + " functionId = " + p53Var.f382761d + " extStatus = " + this.f161428e);
        android.app.Activity context = getContext();
        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = getString(com.tencent.mm.R.string.f490557bs0);
        e4Var.f211780g = 2;
        this.f161427d = e4Var.c();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        kotlinx.coroutines.y0 b17 = v65.m.b(getActivity());
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(b17, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.setting.ui.setting.m8(this, null), 2, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        super.onCreateBefore(bundle);
        this.f161429f = j65.e.b();
        this.f161428e = c01.z1.j();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.Integer num;
        if (this.f161427d == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd: errType = ");
        sb6.append(i17);
        sb6.append(" errCode = ");
        sb6.append(i18);
        sb6.append(" errMsg = ");
        sb6.append(str);
        sb6.append(' ');
        sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsCareModeCloseUIC", sb6.toString());
        if (m1Var == null || m1Var.getType() != 681) {
            return;
        }
        e21.j jVar = (e21.j) m1Var;
        java.util.List list = jVar.f246538f;
        e21.i iVar = jVar.f246537e.f246521b;
        kotlin.jvm.internal.o.e(iVar, "null cannot be cast to non-null type com.tencent.mm.modeloplog.NetSceneOplog.Resp");
        r45.i25 i25Var = iVar.f246528a;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        int size = arrayList.size();
        for (int i19 = 0; i19 < size; i19++) {
            int b17 = ((xg3.q0) arrayList.get(i19)).b();
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsCareModeCloseUIC", "onSceneEnd oplogsList cmdId:%s", java.lang.Integer.valueOf(b17));
            if (b17 == 23) {
                r45.j25 j25Var = i25Var.f376688e;
                if (j25Var == null || (num = (java.lang.Integer) j25Var.f377518e.get(i19)) == null || num.intValue() != 0) {
                    ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.setting.ui.setting.n8(this, -1));
                    return;
                } else {
                    ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.setting.ui.setting.n8(this, 0));
                    return;
                }
            }
        }
    }
}
