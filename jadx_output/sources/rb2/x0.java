package rb2;

/* loaded from: classes3.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb2.y0 f393818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393819e;

    public x0(rb2.y0 y0Var, in5.s0 s0Var) {
        this.f393818d = y0Var;
        this.f393819e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageFlowConvert$onCreateViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f393818d.f393833i;
        java.lang.Object obj = this.f393819e.f293125i;
        kotlin.jvm.internal.o.f(obj, "getAssociatedObject(...)");
        lVar.invoke(obj);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageFlowConvert$onCreateViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
