package zo1;

/* loaded from: classes5.dex */
public final class i3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI f474644d;

    public i3(com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI) {
        this.f474644d = selectContactUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int[] iArr = com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI.f92846x;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI = this.f474644d;
        selectContactUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "showSearchView");
        com.tencent.mm.plugin.backup.roambackup.a2.b(com.tencent.mm.plugin.backup.roambackup.a2.f92567a, selectContactUI.f92863w, 2L, null, 4, null);
        jz5.g gVar = selectContactUI.f92859s;
        selectContactUI.addSearchMenu(true, (com.tencent.mm.ui.tools.c9) ((jz5.n) gVar).getValue());
        ((com.tencent.mm.ui.tools.c9) ((jz5.n) gVar).getValue()).c(true);
        android.widget.ListView listView = selectContactUI.f92848e;
        if (listView == null) {
            kotlin.jvm.internal.o.o("searchResultLv");
            throw null;
        }
        listView.setVisibility(0);
        android.widget.RelativeLayout relativeLayout = selectContactUI.f92847d;
        if (relativeLayout == null) {
            kotlin.jvm.internal.o.o("mainContentRl");
            throw null;
        }
        relativeLayout.setVisibility(8);
        android.widget.ListView listView2 = selectContactUI.f92848e;
        if (listView2 == null) {
            kotlin.jvm.internal.o.o("searchResultLv");
            throw null;
        }
        zo1.d3 d3Var = selectContactUI.f92860t;
        if (d3Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "showSearchView, create new SearchResultAdapter");
            d3Var = new zo1.d3(new zo1.q3(selectContactUI), new zo1.s3(selectContactUI));
            selectContactUI.f92860t = d3Var;
        }
        listView2.setAdapter((android.widget.ListAdapter) d3Var);
        android.widget.ListView listView3 = selectContactUI.f92848e;
        if (listView3 == null) {
            kotlin.jvm.internal.o.o("searchResultLv");
            throw null;
        }
        listView3.setOnItemClickListener(new zo1.t3(selectContactUI));
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
