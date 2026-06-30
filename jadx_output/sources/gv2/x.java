package gv2;

/* loaded from: classes9.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gv2.n0 f276093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f276094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f276095f;

    public x(gv2.n0 n0Var, android.widget.TextView textView, in5.s0 s0Var) {
        this.f276093d = n0Var;
        this.f276094e = textView;
        this.f276095f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.uniComments.g2 g2Var = this.f276093d.f276047e;
        android.widget.TextView commentFailTV = this.f276094e;
        kotlin.jvm.internal.o.f(commentFailTV, "$commentFailTV");
        ((com.tencent.mm.plugin.finder.uniComments.q3) g2Var).E(commentFailTV, this.f276095f.getAdapterPosition());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
