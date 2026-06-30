package cw1;

/* loaded from: classes7.dex */
public final class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheSubListUI f223345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f223346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean[] f223347f;

    public u1(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheSubListUI cleanCacheSubListUI, java.util.List list, boolean[] zArr) {
        this.f223345d = cleanCacheSubListUI;
        this.f223346e = list;
        this.f223347f = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheSubListUI cleanCacheSubListUI = this.f223345d;
        cw1.s1 s1Var = cleanCacheSubListUI.f95685e;
        if (s1Var == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        java.util.List dataList = this.f223346e;
        kotlin.jvm.internal.o.f(dataList, "$dataList");
        boolean[] checkList = this.f223347f;
        kotlin.jvm.internal.o.g(checkList, "checkList");
        s1Var.f223302d = dataList;
        s1Var.f223303e = checkList;
        s1Var.notifyDataSetChanged();
        androidx.recyclerview.widget.RecyclerView recyclerView = cleanCacheSubListUI.f95684d;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        recyclerView.setVisibility(0);
        android.view.View view = cleanCacheSubListUI.f95686f;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheSubListUI$loadAppBrandList$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheSubListUI$loadAppBrandList$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
