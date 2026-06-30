package ut2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ko f430809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.p f430810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.hw0 f430811f;

    public a(r45.ko koVar, ut2.p pVar, r45.hw0 hw0Var) {
        this.f430809d = koVar;
        this.f430810e = pVar;
        this.f430811f = hw0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveBulkBuyViewHolder$bind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.ko koVar = this.f430809d;
        r45.ce0 ce0Var = (r45.ce0) koVar.getCustom(6);
        if (ce0Var != null) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.yb ybVar = (c61.yb) c17;
            ut2.p pVar = this.f430810e;
            android.content.Context context = pVar.itemView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            r45.ac4 ac4Var = new r45.ac4();
            ac4Var.set(1, (com.tencent.mm.protocal.protobuf.FinderJumpInfo) ce0Var.getCustom(9));
            c61.yb.Yi(ybVar, context, ac4Var, null, null, 8, null);
            long j17 = koVar.getLong(0);
            java.lang.String string = koVar.getString(2);
            if (string == null) {
                string = "";
            }
            pVar.s(this.f430811f, j17, string);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveBulkBuyViewHolder$bind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
