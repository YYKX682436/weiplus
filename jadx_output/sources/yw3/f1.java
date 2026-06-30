package yw3;

/* loaded from: classes.dex */
public final class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterEmojiBridgeUI f466737d;

    public f1(com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterEmojiBridgeUI repairerFlutterEmojiBridgeUI) {
        this.f466737d = repairerFlutterEmojiBridgeUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterEmojiBridgeUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterEmojiBridgeUI repairerFlutterEmojiBridgeUI = this.f466737d;
        kotlinx.coroutines.l.d(repairerFlutterEmojiBridgeUI.e, null, null, new yw3.e1(repairerFlutterEmojiBridgeUI, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterEmojiBridgeUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
