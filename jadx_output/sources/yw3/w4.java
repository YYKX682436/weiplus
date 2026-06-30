package yw3;

/* loaded from: classes.dex */
public final class w4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerNewLifeDebugUI f466920d;

    public w4(com.tencent.mm.plugin.repairer.ui.demo.RepairerNewLifeDebugUI repairerNewLifeDebugUI) {
        this.f466920d = repairerNewLifeDebugUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerNewLifeDebugUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        db5.t7.m(this.f466920d, "已设置");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerNewLifeDebugUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
