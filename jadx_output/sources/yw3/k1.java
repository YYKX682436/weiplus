package yw3;

/* loaded from: classes11.dex */
public final class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterHybridNavigatorDemoUI f466783d;

    public k1(com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterHybridNavigatorDemoUI repairerFlutterHybridNavigatorDemoUI) {
        this.f466783d = repairerFlutterHybridNavigatorDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterHybridNavigatorDemoUI$onCreate$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = f50.y.H0;
        e50.z0 z0Var = (e50.z0) ((f50.y) i95.n0.c(f50.y.class));
        z0Var.getClass();
        ((com.tencent.pigeon.mm_foundation.DemoServiceFlutterApi) ((com.tencent.pigeon.MMFlutterApiProvider) ((jz5.n) z0Var.f249563m).getValue()).getApi(com.tencent.pigeon.mm_foundation.DemoServiceFlutterApi.class)).demoGetMsgId("test input", new yw3.j1(this.f466783d));
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterHybridNavigatorDemoUI$onCreate$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
