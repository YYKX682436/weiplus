package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class ug implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.tg f133178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133179e;

    public ug(com.tencent.mm.plugin.finder.view.tg tgVar, android.view.View view) {
        this.f133178d = tgVar;
        this.f133179e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderPostFooter$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sr2.w0 w0Var = (sr2.w0) this.f133178d;
        w0Var.getClass();
        w0Var.O6("#", "");
        if (w0Var.X6().getVisibility() == 8) {
            androidx.appcompat.app.AppCompatActivity activity = w0Var.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity).showVKB();
        }
        hc2.p0.d(this.f133179e, "post_topic", "view_clk", null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderPostFooter$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
