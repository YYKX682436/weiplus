package cw1;

/* loaded from: classes12.dex */
public final class a6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f222781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog f222782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f222783f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long[] f222784g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f222785h;

    public a6(com.tencent.mm.ui.widget.dialog.y1 y1Var, com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog cleanFilterDialog, boolean z17, long[] jArr, int i17) {
        this.f222781d = y1Var;
        this.f222782e = cleanFilterDialog;
        this.f222783f = z17;
        this.f222784g = jArr;
        this.f222785h = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$showTimePickerDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f222781d.q();
        boolean z17 = this.f222783f;
        long[] jArr = this.f222784g;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog cleanFilterDialog = this.f222782e;
        cleanFilterDialog.f95767n = (z17 && java.util.Arrays.equals(jArr, cleanFilterDialog.f95769p)) ? false : true;
        cleanFilterDialog.f95768o[cleanFilterDialog.f95770q] = cleanFilterDialog.f95771r;
        long[] copyOf = java.util.Arrays.copyOf(jArr, 2);
        kotlin.jvm.internal.o.f(copyOf, "copyOf(...)");
        cleanFilterDialog.f95769p = copyOf;
        androidx.recyclerview.widget.RecyclerView recyclerView = cleanFilterDialog.f95765i;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("filterList");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        cw1.n5 n5Var = adapter instanceof cw1.n5 ? (cw1.n5) adapter : null;
        if (n5Var != null) {
            n5Var.x(this.f222785h);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$showTimePickerDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
