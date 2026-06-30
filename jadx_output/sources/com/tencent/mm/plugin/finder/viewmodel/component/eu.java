package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class eu implements com.tencent.mm.plugin.finder.view.ka {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nu f134302d;

    public eu(com.tencent.mm.plugin.finder.viewmodel.component.nu nuVar) {
        this.f134302d = nuVar;
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void G3(int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.finder.viewmodel.component.nu nuVar = this.f134302d;
        android.util.SparseArray sparseArray = nuVar.f135353d;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i28 = 0; i28 < size; i28++) {
                int keyAt = sparseArray.keyAt(i28);
                so2.o4 o4Var = (so2.o4) sparseArray.valueAt(i28);
                if (i19 == keyAt) {
                    so2.a2 a2Var = o4Var.f410524a;
                    r45.qt2 qt2Var = null;
                    so2.s4 s4Var = a2Var != null ? a2Var.f410251h : null;
                    if (s4Var != null) {
                        androidx.appcompat.app.AppCompatActivity context = nuVar.getActivity();
                        kotlin.jvm.internal.o.g(context, "context");
                        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                        if (nyVar != null) {
                            qt2Var = nyVar.W6(keyAt);
                            qt2Var.set(14, java.lang.Integer.valueOf(keyAt));
                        }
                        s4Var.f410595d = qt2Var;
                    }
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void l(int i17, int i18, int i19, int i27) {
        so2.s4 s4Var;
        r45.gp2 gp2Var;
        r45.gz2 gz2Var;
        r45.vs2 vs2Var;
        so2.s4 s4Var2;
        com.tencent.mm.plugin.finder.viewmodel.component.nu nuVar = this.f134302d;
        androidx.appcompat.app.AppCompatActivity activity = nuVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("Finder.FinderPopupUIC", "onFragmentChange from=" + i17 + " to=" + i18 + ",fromType=" + i19 + " toType=" + i27 + ",curTabType=" + ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).S6());
        android.util.SparseArray sparseArray = nuVar.f135353d;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i28 = 0; i28 < size; i28++) {
                sparseArray.keyAt(i28);
                so2.a2 a2Var = ((so2.o4) sparseArray.valueAt(i28)).f410524a;
                com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = null;
                if (((a2Var == null || (s4Var2 = a2Var.f410251h) == null) ? null : s4Var2.f410592a) == so2.r4.f410574d) {
                    com.tencent.mm.plugin.finder.view.ag agVar = com.tencent.mm.plugin.finder.view.ag.f131640h;
                    if (a2Var != null && (s4Var = a2Var.f410251h) != null && (gp2Var = s4Var.f410593b) != null && (gz2Var = (r45.gz2) gp2Var.getCustom(0)) != null && (vs2Var = (r45.vs2) gz2Var.getCustom(0)) != null) {
                        jbVar = new com.tencent.mm.plugin.finder.extension.reddot.jb();
                        jbVar.t0(vs2Var);
                    }
                    nuVar.U6(agVar, jbVar);
                    return;
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void z(boolean z17, int i17, com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
