package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class u10 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f136081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f136082e;

    public u10(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f136081d = f50Var;
        this.f136082e = finderJumpInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$accountAbnormal$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f136081d;
        nk6.y("PersonalCenterBanEntry", f50Var.f134338d);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f136082e;
        if (finderJumpInfo != null) {
            xc2.y2.i(xc2.y2.f453343a, f50Var.getContext(), new xc2.p0(finderJumpInfo), 0, null, 12, null);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            m92.b j37 = g92.a.j3(g92.b.f269769e, f50Var.f134338d, false, 2, null);
            if (j37 == null || (string = j37.u0().getString(32)) == null) {
                f0Var2 = null;
            } else {
                com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "[handleJumpError] jumpJson=".concat(string));
                qd2.q qVar = new qd2.q();
                android.content.Context context = view.getContext();
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                qd2.q.e(qVar, (com.tencent.mm.ui.MMActivity) context, 0, string, 0, 8, null);
            }
            if (f0Var2 == null) {
                f50Var.getIntent().putExtra("finder_username", f50Var.f134338d);
                f50Var.getIntent().putExtra("KEY_FINDER_SELF_FLAG", true);
                com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, f50Var.getActivity(), f50Var.getIntent(), 0L, null, 0, 0, false, 0, null, 508, null);
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(f50Var.getActivity(), f50Var.getIntent());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$accountAbnormal$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
