package sr2;

/* loaded from: classes.dex */
public final class f4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411564d;

    public f4(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        this.f411564d = postMainUIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/PostMainUIC$initDelMediaBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = this.f411564d;
        postMainUIC.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) postMainUIC.getContext(), 1, true);
        android.view.View inflate = com.tencent.mm.ui.id.b(postMainUIC.getContext()).inflate(com.tencent.mm.R.layout.b5o, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.fvy)).setText(postMainUIC.h7());
        k0Var.s(inflate, false);
        k0Var.f211872n = new sr2.d5(postMainUIC);
        k0Var.f211881s = new sr2.e5(postMainUIC);
        k0Var.f211854d = new sr2.f5(postMainUIC);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/PostMainUIC$initDelMediaBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
