package yw3;

/* loaded from: classes11.dex */
public final class b2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterHybridNavigatorDemoUI f466698d;

    public b2(com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterHybridNavigatorDemoUI repairerFlutterHybridNavigatorDemoUI) {
        this.f466698d = repairerFlutterHybridNavigatorDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterHybridNavigatorDemoUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.matrix.util.MemInfo memInfo = new com.tencent.matrix.util.MemInfo(null, null, null, null, null, null, com.tencent.matrix.util.PssInfo.f53113s.b(), null, 191, null);
        memInfo.f53096d = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.tencent.mars.xlog.Log.i(this.f466698d.d, "memInfo : " + memInfo);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterHybridNavigatorDemoUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
