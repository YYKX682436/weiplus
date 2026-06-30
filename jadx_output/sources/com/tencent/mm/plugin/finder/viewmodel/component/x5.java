package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes5.dex */
public final class x5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC f136399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136400e;

    public x5(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC, in5.s0 s0Var) {
        this.f136399d = finderBulletUIC;
        this.f136400e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC = this.f136399d;
        boolean z17 = finderBulletUIC.f133496f != 2;
        com.tencent.mars.xlog.Log.i("FinderBulletUIC", "onSmileyBtnClick: feedId=" + pm0.v.u(finderBulletUIC.f133506s) + "}, isShowSmiley=" + z17);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) finderBulletUIC.U6().findViewById(com.tencent.mm.R.id.g4v);
        int i17 = com.tencent.mm.R.color.f478714f5;
        int i18 = com.tencent.mm.R.raw.icons_outlined_keyboard;
        if (z17) {
            com.tencent.mars.xlog.Log.i("FinderBulletUIC", "onShowSmileyPanel: feedId=" + pm0.v.u(finderBulletUIC.f133506s) + '}');
            finderBulletUIC.W6().setVisibility(0);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) finderBulletUIC.U6().findViewById(com.tencent.mm.R.id.g4v);
            if (weImageView2 != null) {
                weImageView2.setImageResource(finderBulletUIC.f133508u ? com.tencent.mm.R.raw.icons_outlined_keyboard : com.tencent.mm.R.raw.icons_filled_keyboard);
                weImageView2.setIconColor(finderBulletUIC.getContext().getResources().getColor(finderBulletUIC.f133508u ? com.tencent.mm.R.color.f478714f5 : com.tencent.mm.R.color.f478553an));
            }
            finderBulletUIC.f133496f = 2;
            if (finderBulletUIC.W6().getLayoutParams().height == 0) {
                int c17 = com.tencent.mm.ui.bl.c(finderBulletUIC.getActivity());
                boolean z18 = finderBulletUIC.getActivity().getResources().getConfiguration().orientation == 1;
                int i19 = z18 ? finderBulletUIC.getActivity().getResources().getDisplayMetrics().heightPixels / 3 : finderBulletUIC.getActivity().getResources().getDisplayMetrics().heightPixels / 2;
                com.tencent.mm.pluginsdk.ui.ChatFooterPanel W6 = finderBulletUIC.W6();
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, i19);
                if (z18) {
                    layoutParams.bottomMargin = c17;
                } else {
                    layoutParams.setMarginEnd(c17);
                }
                W6.setLayoutParams(layoutParams);
            }
            finderBulletUIC.W6().setAlpha(0.0f);
            finderBulletUIC.W6().animate().alpha(1.0f).setDuration(220L).setListener(null).start();
            android.content.Context context = this.f136400e.f293121e;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) context).hideVKB();
        } else {
            finderBulletUIC.c7(false);
            finderBulletUIC.k7();
        }
        if (weImageView != null) {
            weImageView.setTag(java.lang.Boolean.valueOf(z17));
            if (z17) {
                if (!finderBulletUIC.f133508u) {
                    i18 = com.tencent.mm.R.raw.icons_filled_keyboard;
                }
                weImageView.setImageResource(i18);
            } else {
                weImageView.setImageResource(finderBulletUIC.f133508u ? com.tencent.mm.R.raw.icons_outlined_sticker : com.tencent.mm.R.raw.icons_filled_sticker);
            }
            android.content.res.Resources resources = finderBulletUIC.getContext().getResources();
            if (!finderBulletUIC.f133508u) {
                i17 = com.tencent.mm.R.color.f478553an;
            }
            weImageView.setIconColor(resources.getColor(i17));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBulletUIC$refreshBulletLayout$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
