package uj3;

/* loaded from: classes14.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.l0 f428282d;

    public h0(uj3.l0 l0Var) {
        this.f428282d = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uj3.l0 l0Var = this.f428282d;
        if (!l0Var.f428328m) {
            yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout = l0Var.f428323h;
        if (multiTalkSmallControlIconLayout != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProjectReportHelper", "markClickSpeakerOn");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1538L, 8L, 1L);
            zj3.g.f473302a.b(6, 1);
            if (multiTalkSmallControlIconLayout.isEnabled()) {
                if (multiTalkSmallControlIconLayout.isChceked) {
                    android.content.Context context = l0Var.f428316a;
                    l0Var.b(context, context.getResources().getString(com.tencent.mm.R.string.ibu));
                    com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout2 = l0Var.f428323h;
                    if (multiTalkSmallControlIconLayout2 != null) {
                        multiTalkSmallControlIconLayout2.setContentDescription(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.h28));
                    }
                    multiTalkSmallControlIconLayout.setChecked(false);
                } else {
                    android.content.Context context2 = l0Var.f428316a;
                    l0Var.b(context2, context2.getResources().getString(com.tencent.mm.R.string.ibv));
                    com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout3 = l0Var.f428323h;
                    if (multiTalkSmallControlIconLayout3 != null) {
                        multiTalkSmallControlIconLayout3.setContentDescription(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.h29));
                    }
                    multiTalkSmallControlIconLayout.setChecked(true);
                }
                ((ku5.t0) ku5.t0.f312615d).g(new uj3.g0(multiTalkSmallControlIconLayout));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
