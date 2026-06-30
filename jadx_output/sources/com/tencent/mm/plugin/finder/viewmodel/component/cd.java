package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class cd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f134013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC f134014e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd(in5.s0 s0Var, com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC) {
        super(0);
        this.f134013d = s0Var;
        this.f134014e = finderFeedMegaVideoBtnAnimUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        in5.s0 s0Var = this.f134013d;
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.eft);
        if (p17 == null) {
            android.view.ViewStub viewStub = (android.view.ViewStub) s0Var.p(com.tencent.mm.R.id.ipv);
            p17 = viewStub != null ? viewStub.inflate() : null;
        }
        if (p17 != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC = this.f134014e;
            if (finderFeedMegaVideoBtnAnimUIC.f133560h.isRunning() || p17.getVisibility() == 0) {
                com.tencent.mars.xlog.Log.i("FinderFeedMegaVideoBtnAnimUIC", "startAppearAnim: the guide view is showing");
            } else {
                finderFeedMegaVideoBtnAnimUIC.f133557e = p17;
                p17.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.yc(s0Var));
                finderFeedMegaVideoBtnAnimUIC.f133558f = s0Var.p(com.tencent.mm.R.id.ipz).getWidth();
                android.widget.TextView textView = (android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.iqq);
                if (textView != null) {
                    textView.setText(((android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f485709iq1)).getText());
                    textView.setTextColor(p17.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100));
                }
                ((com.tencent.mm.ui.widget.imageview.WeImageView) p17.findViewById(com.tencent.mm.R.id.iqs)).setIconColor(p17.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100));
                ((android.widget.TextView) p17.findViewById(com.tencent.mm.R.id.iqr)).setAlpha(0.0f);
                android.view.View findViewById = p17.findViewById(com.tencent.mm.R.id.f483043v2);
                findViewById.getLayoutParams().width = finderFeedMegaVideoBtnAnimUIC.f133558f;
                findViewById.requestLayout();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMegaVideoBtnAnimUIC$startAppearAnim$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMegaVideoBtnAnimUIC$startAppearAnim$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.content.Context context = s0Var.f293121e;
                int color = context.getResources().getColor(com.tencent.mm.R.color.f479247tz);
                int color2 = context.getResources().getColor(com.tencent.mm.R.color.f479258ua);
                android.animation.ValueAnimator valueAnimator = finderFeedMegaVideoBtnAnimUIC.f133560h;
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.removeAllListeners();
                valueAnimator.addUpdateListener(new com.tencent.mm.plugin.finder.viewmodel.component.zc(finderFeedMegaVideoBtnAnimUIC, p17, findViewById, color, color2));
                valueAnimator.addListener(new com.tencent.mm.plugin.finder.viewmodel.component.ad(findViewById));
                valueAnimator.start();
                pm0.v.V(5000L, new com.tencent.mm.plugin.finder.viewmodel.component.bd(finderFeedMegaVideoBtnAnimUIC));
            }
        }
        return jz5.f0.f302826a;
    }
}
