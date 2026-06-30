package gv2;

/* loaded from: classes9.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f276000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f276001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jv2.i f276002f;

    public d0(in5.s0 s0Var, java.lang.String str, jv2.i iVar) {
        this.f276000d = s0Var;
        this.f276001e = str;
        this.f276002f = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).rl(this.f276000d, this.f276001e, this.f276002f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
