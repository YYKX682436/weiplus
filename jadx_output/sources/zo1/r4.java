package zo1;

/* loaded from: classes5.dex */
public final class r4 implements zo1.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI f474759a;

    public r4(com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI) {
        this.f474759a = selectPackageUI;
    }

    public void a(int i17) {
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI = this.f474759a;
        androidx.recyclerview.widget.RecyclerView recyclerView = selectPackageUI.f92867f;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("packageRecyclerView");
            throw null;
        }
        recyclerView.f1();
        androidx.recyclerview.widget.RecyclerView recyclerView2 = selectPackageUI.f92867f;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("packageRecyclerView");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$onCreate$3", "onItemExpand", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$onCreate$3", "onItemExpand", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }
}
