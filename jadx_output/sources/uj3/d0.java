package uj3;

/* loaded from: classes14.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.l0 f428256d;

    public d0(uj3.l0 l0Var) {
        this.f428256d = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uj3.l0 l0Var = this.f428256d;
        if (!l0Var.f428328m) {
            yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout = l0Var.f428320e;
        if (multiTalkSmallControlIconLayout != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProjectReportHelper", "markClickDoodle");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1538L, 6L, 1L);
            if (multiTalkSmallControlIconLayout.isChceked) {
                uj3.b.a(l0Var.f428317b, uj3.a.f428196g, null, 2, null);
                multiTalkSmallControlIconLayout.setChecked(false);
                com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout2 = l0Var.f428322g;
                if (multiTalkSmallControlIconLayout2 != null) {
                    multiTalkSmallControlIconLayout2.setVisibility(0);
                }
                com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout3 = l0Var.f428323h;
                if (multiTalkSmallControlIconLayout3 != null) {
                    multiTalkSmallControlIconLayout3.setVisibility(0);
                }
                if (l0Var.f428325j && (weImageView = l0Var.f428327l) != null) {
                    weImageView.setVisibility(0);
                }
            } else {
                uj3.b.a(l0Var.f428317b, uj3.a.f428195f, null, 2, null);
                multiTalkSmallControlIconLayout.setChecked(true);
                com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout4 = l0Var.f428322g;
                if (multiTalkSmallControlIconLayout4 != null) {
                    multiTalkSmallControlIconLayout4.setVisibility(8);
                }
                com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout5 = l0Var.f428323h;
                if (multiTalkSmallControlIconLayout5 != null) {
                    multiTalkSmallControlIconLayout5.setVisibility(8);
                }
                if (l0Var.f428325j && (weImageView2 = l0Var.f428327l) != null) {
                    weImageView2.setVisibility(8);
                }
                com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout6 = l0Var.f428320e;
                if (multiTalkSmallControlIconLayout6 != null) {
                    multiTalkSmallControlIconLayout6.setVisibility(8);
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = l0Var.f428321f;
                if (weImageView3 != null) {
                    weImageView3.setVisibility(0);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
