package f12;

/* loaded from: classes5.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.eggspring.ui.SpringCardActivity f258567d;

    public a(com.tencent.mm.plugin.eggspring.ui.SpringCardActivity springCardActivity) {
        this.f258567d = springCardActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/eggspring/ui/SpringCardActivity$boundView$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick: ");
        com.tencent.mm.plugin.eggspring.ui.SpringCardActivity springCardActivity = this.f258567d;
        sb6.append(springCardActivity.f97434g);
        com.tencent.mars.xlog.Log.i("MicroMsg.SpringCardActivity", sb6.toString());
        if (springCardActivity.f97434g) {
            yj0.a.h(this, "com/tencent/mm/plugin/eggspring/ui/SpringCardActivity$boundView$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        springCardActivity.f97434g = true;
        pm0.v.C(springCardActivity.f97436i);
        pm0.v.U(1000L, springCardActivity.f97436i);
        int color = springCardActivity.getContext().getResources().getColor(com.tencent.mm.R.color.a6x);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("customize_status_bar_color", color);
        intent.putExtra("webview_bg_color_rsID", com.tencent.mm.R.color.a6x);
        intent.putExtra("from_shortcut", true);
        intent.putExtra("disable_minimize", true);
        intent.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477728p);
        intent.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477855dd);
        j45.l.n(springCardActivity, "webview", ".ui.tools.WebViewUI", intent, 1001);
        springCardActivity.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
        yj0.a.h(this, "com/tencent/mm/plugin/eggspring/ui/SpringCardActivity$boundView$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
