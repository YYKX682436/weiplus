package ix3;

/* loaded from: classes8.dex */
public final class h4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.uic.RepairerUicStateDemo f295432d;

    public h4(com.tencent.mm.plugin.repairer.ui.uic.RepairerUicStateDemo repairerUicStateDemo) {
        this.f295432d = repairerUicStateDemo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerUicStateDemo$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlinx.coroutines.z0.d(this.f295432d.getLifecycleAsyncScope(), "cancel by click!", null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerUicStateDemo$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
