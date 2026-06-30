package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class jj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f134868d;

    public jj(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        this.f134868d = blVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI;
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        in5.s0 s0Var;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f134868d;
        android.widget.LinearLayout W6 = blVar.W6();
        kotlin.jvm.internal.o.f(W6, "access$getBackBtn(...)");
        android.widget.LinearLayout W62 = blVar.W6();
        kotlin.jvm.internal.o.f(W62, "access$getBackBtn(...)");
        com.tencent.mm.plugin.finder.report.d2.k(d2Var, W6, "finder_return", "view_clk", true, com.tencent.mm.plugin.finder.viewmodel.component.bl.i7(blVar, W62), null, 32, null);
        androidx.appcompat.app.AppCompatActivity activity = blVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.e90 e90Var = (com.tencent.mm.plugin.finder.viewmodel.component.e90) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.e90.class);
        e90Var.getClass();
        r45.cx2 cx2Var = com.tencent.mm.plugin.finder.viewmodel.component.e90.f134230p;
        boolean z18 = (cx2Var != null && cx2Var.getBoolean(0)) || (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Vb).getValue()).r()).intValue() == 1);
        boolean O6 = e90Var.O6();
        boolean z19 = e90Var.f134231d ? true : z18 && O6;
        if (z19) {
            e90Var.f134231d = false;
            com.tencent.mm.plugin.finder.viewmodel.component.e90.f134230p = null;
            java.lang.ref.WeakReference weakReference = e90Var.f134233f;
            if (weakReference == null || (s0Var = (in5.s0) weakReference.get()) == null || (baseFinderFeed = e90Var.f134232e) == null) {
                str = "Finder.FinderTingEntryUIC";
                str2 = ", allowShow: ";
                mMFinderUI = null;
                z17 = O6;
            } else {
                com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(e90Var.getActivity(), 1, 0, true);
                z2Var.m(e90Var.getActivity().getResources().getString(com.tencent.mm.R.string.o2t), e90Var.getActivity().getResources().getString(com.tencent.mm.R.string.o2v));
                android.view.View inflate = android.view.LayoutInflater.from(e90Var.getContext()).inflate(com.tencent.mm.R.layout.eet, (android.view.ViewGroup) null, false);
                kotlin.jvm.internal.o.f(inflate, "inflate(...)");
                z2Var.v(e90Var.getActivity().getResources().getColor(com.tencent.mm.R.color.a0c));
                z2Var.o(0);
                int color = e90Var.getActivity().getResources().getColor(com.tencent.mm.R.color.f478763gj);
                android.widget.Button button = z2Var.f212069u;
                if (button != null) {
                    button.setTextColor(color);
                }
                z2Var.j(inflate);
                z2Var.l(new com.tencent.mm.plugin.finder.viewmodel.component.b90(baseFinderFeed, inflate, e90Var));
                com.tencent.mm.plugin.finder.viewmodel.component.c90 c90Var = new com.tencent.mm.plugin.finder.viewmodel.component.c90(z2Var, e90Var, s0Var, baseFinderFeed);
                com.tencent.mm.plugin.finder.viewmodel.component.d90 d90Var = new com.tencent.mm.plugin.finder.viewmodel.component.d90(z2Var, e90Var, s0Var, baseFinderFeed);
                z2Var.D = c90Var;
                z2Var.E = d90Var;
                z2Var.C();
                java.util.Map Q6 = e90Var.Q6(baseFinderFeed);
                str = "Finder.FinderTingEntryUIC";
                str2 = ", allowShow: ";
                mMFinderUI = null;
                z17 = O6;
                com.tencent.mm.plugin.finder.report.d2.k(d2Var, inflate, "findersleephalfpage", "view_exp", true, Q6, null, 32, null);
                com.tencent.mars.xlog.Log.i(str, "showGuide, feedId = " + baseFinderFeed.getItemId());
            }
            com.tencent.wechat.aff.finder.FinderPrefetchManager.getInstance().markShowOnceEduTipsWithKey(bw5.ms0.emFinderNewbieGuideType_TingEntryGuide);
            com.tencent.mars.xlog.Log.i(str, "checkCanShowGuide succ, isInSleepTime: " + z18 + str2 + z17);
        } else {
            mMFinderUI = null;
            com.tencent.mars.xlog.Log.i("Finder.FinderTingEntryUIC", "checkCanShowGuide fail, isInSleepTime: " + z18 + ", allowShow: " + O6);
        }
        if (!z19) {
            if (blVar.getActivity() instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI) {
                androidx.appcompat.app.AppCompatActivity activity2 = blVar.getActivity();
                com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI2 = activity2 instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) activity2 : mMFinderUI;
                if (mMFinderUI2 != null) {
                    mMFinderUI2.f128814p = false;
                    mMFinderUI2.onBackPressed();
                    mMFinderUI2.f128814p = true;
                }
            } else {
                blVar.getActivity().onBackPressed();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
