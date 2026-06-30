package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class i6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.r6 f116380d;

    public i6(com.tencent.mm.plugin.finder.live.view.r6 r6Var) {
        this.f116380d = r6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveMicCenterView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.s6 s6Var = this.f116380d.f116632b;
        if (s6Var != null) {
            df2.t2 t2Var = (df2.t2) s6Var;
            com.tencent.mars.xlog.Log.i("FinderLiveMicCenterController", "onMicClick");
            boolean z17 = pm0.v.z(t2Var.d7(), 16);
            android.content.Context O6 = t2Var.O6();
            if (z17) {
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(O6);
                e4Var.d(com.tencent.mm.R.string.nh9);
                e4Var.b(com.tencent.mm.R.raw.icons_filled_mic_off);
                e4Var.c();
            } else {
                boolean z18 = ((mm2.c1) t2Var.business(mm2.c1.class)).O4;
                boolean z19 = !z18;
                ((mm2.c1) t2Var.business(mm2.c1.class)).n9(z19);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("PARAM_FINDER_LIVE_IS_MUTE_MIC", z19);
                t2Var.X6(qo0.b.f365401p4, bundle);
                fj2.s sVar = fj2.s.f263183a;
                sVar.e(ml2.q4.f327853f, !z18 ? ml2.r4.f327911f : ml2.r4.f327910e);
                if (z18) {
                    int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(O6);
                    e4Var2.d(com.tencent.mm.R.string.d4e);
                    e4Var2.b(com.tencent.mm.R.raw.icons_filled_mike);
                    e4Var2.c();
                    sVar.b(ml2.n4.f327757x);
                } else {
                    int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var3 = new com.tencent.mm.ui.widget.dialog.e4(O6);
                    e4Var3.d(com.tencent.mm.R.string.f491460d52);
                    e4Var3.b(com.tencent.mm.R.raw.icons_filled_mic_off);
                    e4Var3.c();
                    sVar.b(ml2.n4.f327754u);
                }
                df2.t2.g7(t2Var, kz5.b0.c(com.tencent.mm.plugin.finder.live.view.n6.f116516d), false, 2, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveMicCenterView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
