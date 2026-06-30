package jj4;

/* loaded from: classes11.dex */
public final class c extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final bi4.m0 f300030e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f300031f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f300032g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f300033h;

    public c(bi4.m0 m0Var, java.lang.String str, java.util.ArrayList likeList, android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(likeList, "likeList");
        kotlin.jvm.internal.o.g(context, "context");
        this.f300030e = m0Var;
        this.f300031f = str;
        this.f300032g = likeList;
        this.f300033h = z17;
    }

    @Override // in5.r
    public in5.s0 d(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View convertView) {
        android.view.ViewGroup.LayoutParams layoutParams;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(convertView, "convertView");
        int height = recyclerView.getHeight();
        if (height != 0 && (layoutParams = convertView.getLayoutParams()) != null) {
            layoutParams.height = height - i65.a.b(recyclerView.getContext(), 1);
            convertView.setLayoutParams(layoutParams);
        }
        return new in5.s0(convertView);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dx7;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.Object m521constructorimpl;
        jj4.b item = (jj4.b) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        holder.toString();
        item.toString();
        java.util.Objects.toString(list);
        java.lang.Object obj = holder.f293124h;
        com.tencent.mm.plugin.textstatus.ui.w1 w1Var = obj instanceof com.tencent.mm.plugin.textstatus.ui.w1 ? (com.tencent.mm.plugin.textstatus.ui.w1) obj : null;
        if (w1Var != null) {
            w1Var.setTag(com.tencent.mm.R.id.nwq, java.lang.Integer.valueOf(i17));
        }
        if (w1Var != null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                ej4.c0.f253335a.b(w1Var);
                m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                com.tencent.mars.xlog.Log.e(w1Var.f174390i, "forceRemoveListenDBNotify: e:" + kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
            }
        }
        if (w1Var != null) {
            w1Var.j(item.f300029d);
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        recyclerView.toString();
        holder.toString();
        android.view.View view = holder.itemView;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
        android.content.Context context = recyclerView.getContext();
        java.lang.String str = this.f300031f;
        java.util.ArrayList arrayList = this.f300032g;
        bi4.m0 m0Var = this.f300030e;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f300033h);
        ((we0.j1) l0Var).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.textstatus.ui.w1 w1Var = new com.tencent.mm.plugin.textstatus.ui.w1(context, null, m0Var, str, arrayList, valueOf != null ? valueOf.booleanValue() : false, null, 66, null);
        frameLayout.addView(w1Var, 0);
        holder.f293124h = w1Var;
        android.view.ViewGroup.LayoutParams layoutParams = w1Var.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width = -1;
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        holder.toString();
    }
}
