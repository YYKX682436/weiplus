package yw3;

/* loaded from: classes.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI f466843d;

    public p0(com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI repairerDBSelectDemoUI) {
        this.f466843d = repairerDBSelectDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerDBSelectDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI repairerDBSelectDemoUI = this.f466843d;
        repairerDBSelectDemoUI.getClass();
        if (com.tencent.mm.sdk.platformtools.x2.n() && (obj = ((com.tencent.mm.ui.widget.MMEditText) repairerDBSelectDemoUI.findViewById(com.tencent.mm.R.id.h7y)).getText().toString()) != null && obj.length() > 0) {
            gm0.j1.e().j(new yw3.n0(obj, repairerDBSelectDemoUI));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDBSelectDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
