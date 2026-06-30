package yw3;

/* loaded from: classes.dex */
public final class t7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerXmlToJSONDemoUI f466895d;

    public t7(com.tencent.mm.plugin.repairer.ui.demo.RepairerXmlToJSONDemoUI repairerXmlToJSONDemoUI) {
        this.f466895d = repairerXmlToJSONDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerXmlToJSONDemoUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.demo.RepairerXmlToJSONDemoUI repairerXmlToJSONDemoUI = this.f466895d;
        v65.i.b(repairerXmlToJSONDemoUI.getUICScope(), null, new yw3.s7(((com.tencent.mm.ui.widget.MMEditText) repairerXmlToJSONDemoUI.findViewById(com.tencent.mm.R.id.psp)).getText().toString(), null), 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerXmlToJSONDemoUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
