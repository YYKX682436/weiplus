package cw1;

/* loaded from: classes12.dex */
public final class v5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog f223384d;

    public v5(com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog cleanFilterDialog) {
        this.f223384d = cleanFilterDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog cleanFilterDialog = this.f223384d;
        androidx.recyclerview.widget.RecyclerView recyclerView = cleanFilterDialog.f95765i;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("filterList");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        cw1.n5 n5Var = adapter instanceof cw1.n5 ? (cw1.n5) adapter : null;
        if (n5Var != null && cleanFilterDialog.f95768o.length > 1) {
            int i17 = 0;
            for (java.lang.Object obj : n5Var.f223181d) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                cw1.o5 o5Var = (cw1.o5) obj;
                if (o5Var.f223203c > 0 && o5Var.f223204d == 0) {
                    n5Var.x(i17);
                }
                i17 = i18;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
