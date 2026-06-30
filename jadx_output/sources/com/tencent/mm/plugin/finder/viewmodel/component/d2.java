package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f2 f134071d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.tencent.mm.plugin.finder.viewmodel.component.f2 f2Var) {
        super(0);
        this.f134071d = f2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.f2 f2Var = this.f134071d;
        androidx.appcompat.app.AppCompatActivity activity = f2Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.po poVar = (com.tencent.mm.plugin.finder.viewmodel.component.po) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.po.class);
        boolean z17 = true;
        if (poVar != null) {
            f2Var.Q6(poVar.f135572d.f(), true);
        } else {
            androidx.recyclerview.widget.RecyclerView R6 = f2Var.R6();
            if (R6 != null) {
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = R6.getLayoutManager();
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    androidx.recyclerview.widget.k3 p07 = R6.p0(linearLayoutManager.w());
                    in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
                    if (s0Var != null) {
                        java.lang.Object obj = s0Var.f293125i;
                        so2.j5 j5Var = obj instanceof so2.j5 ? (so2.j5) obj : null;
                        if (j5Var != null && j5Var.h() == 9) {
                            db5.t7.makeText(R6.getContext(), f2Var.S6() ? com.tencent.mm.R.string.nlr : com.tencent.mm.R.string.cvu, 0).show();
                        } else {
                            java.lang.Object obj2 = s0Var.f293125i;
                            so2.j5 j5Var2 = obj2 instanceof so2.j5 ? (so2.j5) obj2 : null;
                            if (j5Var2 != null && j5Var2.h() == 15) {
                                db5.t7.makeText(R6.getContext(), f2Var.S6() ? com.tencent.mm.R.string.nm6 : com.tencent.mm.R.string.cwj, 0).show();
                            } else {
                                f2Var.Q6(s0Var, true);
                            }
                        }
                        z17 = false;
                    }
                }
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
