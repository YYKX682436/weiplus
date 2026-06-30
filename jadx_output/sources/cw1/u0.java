package cw1;

/* loaded from: classes12.dex */
public final class u0 extends androidx.recyclerview.widget.k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f223343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI f223344e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI, android.view.View root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
        this.f223344e = cleanCacheNewUI;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.mzv);
        kotlin.jvm.internal.o.d(findViewById);
        this.f223343d = (android.widget.TextView) findViewById;
        root.findViewById(com.tencent.mm.R.id.f483758bz2).setOnClickListener(this);
        dy1.a.c(root);
        dy1.a.i(root, "cache_remove_before_tips");
        java.lang.String str = cleanCacheNewUI.f95664o;
        if (str == null) {
            kotlin.jvm.internal.o.o("cleanSessionID");
            throw null;
        }
        dy1.a.j(root, "cache_remove_sessionid", str);
        dy1.a.l(root, 16, 32903);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$BannerViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cw1.t0 t0Var = this.f223344e.f95656d;
        if (t0Var == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(t0Var.f223324d);
        java.util.Iterator it = arrayList2.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((cw1.v0) it.next()).f223359a == -5) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (i17 >= 0) {
            arrayList2.remove(i17);
            t0Var.f223324d = arrayList2;
            t0Var.notifyItemRemoved(i17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$BannerViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
