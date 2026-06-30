package uj3;

/* loaded from: classes14.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.l0 f428253d;

    public c0(uj3.l0 l0Var) {
        this.f428253d = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uj3.l0 l0Var = this.f428253d;
        if (!l0Var.f428328m) {
            yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout = l0Var.f428320e;
        if (multiTalkSmallControlIconLayout != null) {
            multiTalkSmallControlIconLayout.setChecked(false);
        }
        com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout2 = l0Var.f428320e;
        if (multiTalkSmallControlIconLayout2 != null) {
            multiTalkSmallControlIconLayout2.setVisibility(0);
        }
        uj3.b.a(l0Var.f428317b, uj3.a.f428196g, null, 2, null);
        com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout3 = l0Var.f428322g;
        if (multiTalkSmallControlIconLayout3 != null) {
            multiTalkSmallControlIconLayout3.setVisibility(0);
        }
        com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout4 = l0Var.f428323h;
        if (multiTalkSmallControlIconLayout4 != null) {
            multiTalkSmallControlIconLayout4.setVisibility(0);
        }
        if (l0Var.f428325j && (weImageView = l0Var.f428327l) != null) {
            weImageView.setVisibility(0);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = l0Var.f428321f;
        if (weImageView2 != null) {
            weImageView2.setVisibility(8);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
