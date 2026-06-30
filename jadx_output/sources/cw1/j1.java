package cw1;

/* loaded from: classes12.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI f223017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aw1.n f223018e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f223019f;

    public j1(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI, aw1.n nVar, android.view.View view) {
        this.f223017d = cleanCacheNewUI;
        this.f223018e = nVar;
        this.f223019f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f223017d.isDestroyed()) {
            return;
        }
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI = this.f223017d;
        aw1.n nVar = this.f223018e;
        cleanCacheNewUI.f95666q = nVar.f14610a;
        cleanCacheNewUI.f95667r = nVar.f14611b;
        cleanCacheNewUI.f95671v = nVar.f14612c;
        yv1.g1 g1Var = cleanCacheNewUI.f95663n;
        if (g1Var == null) {
            kotlin.jvm.internal.o.o("session");
            throw null;
        }
        synchronized (g1Var) {
            g1Var.f466051j = nVar.f14610a;
            g1Var.f466052k = nVar.f14611b;
            g1Var.f466056o = nVar.f14612c;
        }
        cw1.t0 t0Var = this.f223017d.f95656d;
        if (t0Var == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        t0Var.B();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f223017d.f95657e;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        recyclerView.setVisibility(0);
        android.view.View view = this.f223019f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$loadOriginalMediaData$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$loadOriginalMediaData$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
