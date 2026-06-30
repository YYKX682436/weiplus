package g44;

/* loaded from: classes2.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f268836d;

    public q(kotlin.jvm.internal.h0 h0Var) {
        this.f268836d = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFireworkGuideHalfScreenHelper$showBottomSheet$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/halfscreen/AdFireworkGuideHalfScreenHelper$showBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.h0 h0Var = this.f268836d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = (com.tencent.mm.ui.widget.dialog.k0) h0Var.f310123d;
        boolean z17 = false;
        if (k0Var2 != null && k0Var2.i()) {
            z17 = true;
        }
        if (z17 && (k0Var = (com.tencent.mm.ui.widget.dialog.k0) h0Var.f310123d) != null) {
            k0Var.u();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/halfscreen/AdFireworkGuideHalfScreenHelper$showBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFireworkGuideHalfScreenHelper$showBottomSheet$1");
    }
}
