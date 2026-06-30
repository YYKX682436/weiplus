package lr;

/* loaded from: classes13.dex */
public final class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lr.j1 f320523d;

    public g1(lr.j1 j1Var) {
        this.f320523d = j1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/emoji/panel/adapter/TitlePanelViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lr.j1 j1Var = this.f320523d;
        lr.k0 k0Var = j1Var.f320580d;
        if (k0Var != null) {
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            k0Var.b(view, context, j1Var.getAdapterPosition(), j1Var.f320581e);
        }
        com.tencent.mm.feature.emoji.api.s5 s5Var = (com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class);
        r45.v75 v75Var = j1Var.f320548s;
        ((com.tencent.mm.feature.emoji.b0) s5Var).Vi(v75Var != null ? v75Var.f387964d : 0);
        yj0.a.h(this, "com/tencent/mm/emoji/panel/adapter/TitlePanelViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
