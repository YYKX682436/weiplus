package yw3;

/* loaded from: classes8.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerAnimationDemoUI f466725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f466726e;

    public e0(com.tencent.mm.plugin.repairer.ui.demo.RepairerAnimationDemoUI repairerAnimationDemoUI, android.view.View view) {
        this.f466725d = repairerAnimationDemoUI;
        this.f466726e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View view2 = this.f466726e;
        com.tencent.mm.plugin.repairer.ui.demo.RepairerAnimationDemoUI repairerAnimationDemoUI = this.f466725d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerAnimationDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            java.lang.String obj = ((com.tencent.mm.ui.widget.MMEditText) repairerAnimationDemoUI.findViewById(com.tencent.mm.R.id.m_8)).getText().toString();
            float parseFloat = !com.tencent.mm.sdk.platformtools.t8.K0(obj) ? java.lang.Float.parseFloat(obj) : 1.0f;
            java.lang.String obj2 = ((com.tencent.mm.ui.widget.MMEditText) repairerAnimationDemoUI.findViewById(com.tencent.mm.R.id.m7x)).getText().toString();
            float parseFloat2 = !com.tencent.mm.sdk.platformtools.t8.K0(obj2) ? java.lang.Float.parseFloat(obj2) : 0.0f;
            java.lang.String obj3 = ((com.tencent.mm.ui.widget.MMEditText) repairerAnimationDemoUI.findViewById(com.tencent.mm.R.id.ojj)).getText().toString();
            float parseFloat3 = com.tencent.mm.sdk.platformtools.t8.K0(obj3) ? 0.0f : java.lang.Float.parseFloat(obj3);
            oa5.b.b(view2).p(new yw3.c0(view2)).k(yw3.d0.f466713a).g(1000L).e(parseFloat).f(parseFloat).m(parseFloat3).n(parseFloat3).d(parseFloat2).l();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w(repairerAnimationDemoUI.d, "start animation failed " + e17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerAnimationDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
