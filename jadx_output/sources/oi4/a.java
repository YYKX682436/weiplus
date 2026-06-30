package oi4;

/* loaded from: classes.dex */
public final class a implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oi4.c f345620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f345621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f345622f;

    public a(oi4.c cVar, in5.s0 s0Var, int i17) {
        this.f345620d = cVar;
        this.f345621e = s0Var;
        this.f345622f = i17;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/like/CommentHistoryItemConvert$onBindViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        yz5.q qVar = this.f345620d.f345628g;
        if (qVar != null) {
            android.view.View itemView = this.f345621e.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/textstatus/convert/like/CommentHistoryItemConvert$onBindViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
