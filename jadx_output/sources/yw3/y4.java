package yw3;

/* loaded from: classes.dex */
public final class y4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerNewLifeDebugUI f466936d;

    public y4(com.tencent.mm.plugin.repairer.ui.demo.RepairerNewLifeDebugUI repairerNewLifeDebugUI) {
        this.f466936d = repairerNewLifeDebugUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerNewLifeDebugUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = gm0.j1.u().h() + "/aff_db/newlife_mention.db";
        if (com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.w6.h(str);
        }
        db5.t7.m(this.f466936d, "已经清除");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerNewLifeDebugUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
