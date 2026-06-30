package yw3;

/* loaded from: classes.dex */
public final class l7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerX2CDemoUI f466800d;

    public l7(com.tencent.mm.plugin.repairer.ui.demo.RepairerX2CDemoUI repairerX2CDemoUI) {
        this.f466800d = repairerX2CDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerX2CDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long c17 = c01.id.c();
        android.view.LayoutInflater.from(this.f466800d.getContext()).inflate(com.tencent.mm.R.layout.cfs, (android.view.ViewGroup) null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Repairer.RepairerX2CDemoUI", "normal x2c resource cost: " + (c01.id.c() - c17));
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerX2CDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
