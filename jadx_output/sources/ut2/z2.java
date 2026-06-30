package ut2;

/* loaded from: classes3.dex */
public final class z2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.n00 f431172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f431173e;

    public z2(bw5.n00 n00Var, ut2.s3 s3Var) {
        this.f431172d = n00Var;
        this.f431173e = s3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$setupAskForOpenPriceGroup$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bw5.n00 n00Var = this.f431172d;
        bw5.x7 x7Var = n00Var.f30450h[3] ? n00Var.f30448f : new bw5.x7();
        if (x7Var != null) {
            i95.m c17 = i95.n0.c(pq.q.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            pq.q qVar = (pq.q) c17;
            android.content.Context context = this.f431173e.H().getContext();
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            kotlin.jvm.internal.o.d(context);
            pq.q.Lb(qVar, new pq.a(context), x7Var, null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$setupAskForOpenPriceGroup$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
