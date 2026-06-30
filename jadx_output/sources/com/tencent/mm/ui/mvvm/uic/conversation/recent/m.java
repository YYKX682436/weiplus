package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class m implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.t f209345d;

    public m(com.tencent.mm.ui.mvvm.uic.conversation.recent.t tVar) {
        this.f209345d = tVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        wi5.n0 n0Var;
        java.util.HashMap hashMap;
        j75.f stateCenter;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.ui.mvvm.uic.conversation.recent.t tVar = this.f209345d;
        com.tencent.mm.ui.contact.w8 w8Var = ((com.tencent.mm.ui.contact.v8) tVar.f209365d.get(i17)).f207220d;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecentForwardListViewUIC", "onItemClick() called with: adapter = " + adapter + ", view = " + view + ", position = " + i17 + ", holder = " + holder);
        if (((com.tencent.mm.ui.contact.v8) tVar.f209365d.get(i17)).f207221e == 1) {
            tVar.X6(!w8Var.f207235e);
            if (w8Var.f207235e) {
                com.tencent.mm.ui.mvvm.uic.conversation.recent.e.t();
            }
            adapter.notifyDataSetChanged();
            return;
        }
        boolean z17 = w8Var.f207235e;
        java.lang.String str = w8Var.f207231a;
        if (z17) {
            com.tencent.mm.ui.mvvm.uic.conversation.recent.t.T6(tVar, str, i17);
            com.tencent.mm.ui.mvvm.uic.conversation.recent.e.r(i17, str);
            return;
        }
        int i18 = i17 < b95.b.a() ? 4 : 3;
        if (w8Var.f207234d) {
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = tVar.P6();
            if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
                return;
            }
            java.lang.Object obj = tVar.f209369h.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            stateCenter.B3(new wi5.t0((ri5.j) obj, -1, i18));
            return;
        }
        j75.f Q6 = tVar.Q6();
        if (Q6 != null && (n0Var = (wi5.n0) Q6.getState()) != null && (hashMap = n0Var.E) != null) {
            wi5.l0 l0Var = new wi5.l0();
            l0Var.f446305a = i18;
        }
        j75.f Q62 = tVar.Q6();
        if (Q62 != null) {
            if (str == null) {
                str = "";
            }
            Q62.B3(new wi5.c0(kz5.b0.c(str), -1));
        }
    }
}
