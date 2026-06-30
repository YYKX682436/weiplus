package zo1;

/* loaded from: classes5.dex */
public final class o3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.v f474719d;

    public o3(wo1.v vVar) {
        this.f474719d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$setupView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wo1.v vVar = this.f474719d;
        if (vVar.isSelectAll()) {
            vVar.unselectAll();
        } else {
            vVar.selectAll();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$setupView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
