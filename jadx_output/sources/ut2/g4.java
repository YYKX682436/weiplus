package ut2;

/* loaded from: classes3.dex */
public final class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.zv f430891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.h4 f430892e;

    public g4(bw5.zv zvVar, ut2.h4 h4Var) {
        this.f430891d = zvVar;
        this.f430892e = h4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderGuideHolder$refreshGuideLayout$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bw5.zv zvVar = this.f430891d;
        bw5.x7 x7Var = zvVar.f36193m[3] ? zvVar.f36189f : new bw5.x7();
        if (x7Var != null) {
            i95.m c17 = i95.n0.c(pq.q.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            pq.q qVar = (pq.q) c17;
            android.content.Context context = this.f430892e.f430904c.getContext();
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            kotlin.jvm.internal.o.d(context);
            pq.q.Lb(qVar, new pq.a(context), x7Var, null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderGuideHolder$refreshGuideLayout$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
