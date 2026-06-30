package d04;

/* loaded from: classes8.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.BaseScrollTabView f225409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f225410e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f225411f;

    public f(com.tencent.mm.plugin.scanner.ui.widget.BaseScrollTabView baseScrollTabView, int i17, android.view.View view) {
        this.f225409d = baseScrollTabView;
        this.f225410e = i17;
        this.f225411f = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView$initTabClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.scanner.ui.widget.BaseScrollTabView baseScrollTabView = this.f225409d;
        if (!baseScrollTabView.f159668f) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseScrollTabView", "onTabClick not enableSwitchTab");
            yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView$initTabClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        baseScrollTabView.setCanVibrate(true);
        int i17 = this.f225410e;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseScrollTabView", "onTabClick index: %d", java.lang.Integer.valueOf(i17));
        d04.k kVar = (d04.k) kz5.n0.a0(baseScrollTabView.f159669g, i17);
        if (kVar != null) {
            kVar.getF159808e();
            baseScrollTabView.getClass();
        }
        baseScrollTabView.h(i17, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView$initTabClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
