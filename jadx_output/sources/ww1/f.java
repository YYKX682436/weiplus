package ww1;

/* loaded from: classes5.dex */
public final class f extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f450177d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f450178e;

    /* renamed from: f, reason: collision with root package name */
    public ww1.a f450179f;

    /* renamed from: g, reason: collision with root package name */
    public ww1.b f450180g;

    public f(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f450177d = context;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.List list = this.f450178e;
        kotlin.jvm.internal.o.d(list);
        return list.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        ww1.c viewHolder = (ww1.c) k3Var;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        java.util.List list = this.f450178e;
        if (list == null || i17 < 0 || i17 >= list.size()) {
            return;
        }
        java.util.List list2 = this.f450178e;
        kotlin.jvm.internal.o.d(list2);
        y63.a aVar = (y63.a) list2.get(i17);
        android.content.Context context = this.f450177d;
        int b17 = i65.a.b(context, 12);
        int b18 = i65.a.b(context, 64);
        android.view.View view = viewHolder.f450155d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams;
        java.util.List list3 = this.f450178e;
        kotlin.jvm.internal.o.d(list3);
        if (i17 == list3.size() - 1) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = b18;
        } else {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = b17;
        }
        view.setLayoutParams(layoutParams2);
        java.lang.String string = context.getString(com.tencent.mm.R.string.f492138fc5, " ");
        kotlin.jvm.internal.o.f(string, "getString(...)");
        y63.b bVar = (y63.b) aVar.N.get(1);
        java.lang.Long valueOf = bVar != null ? java.lang.Long.valueOf(bVar.f459655d * 1000) : null;
        java.lang.String r17 = valueOf != null ? com.tencent.mm.wallet_core.ui.r1.r(string, valueOf.longValue()) : null;
        android.view.View view2 = viewHolder.f450155d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/collect/model/AAGroupSolitatireEntranceInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/collect/model/AAGroupSolitatireEntranceInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/collect/model/AAGroupSolitatireEntranceInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/collect/model/AAGroupSolitatireEntranceInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setOnClickListener(new ww1.d(this, aVar));
        viewHolder.f450156e.setText(aVar.H);
        viewHolder.f450157f.setText(r17);
        viewHolder.f450158g.setText(context.getString(com.tencent.mm.R.string.f492384ga4, java.lang.Integer.valueOf(h61.o.h(aVar).size())));
        java.lang.String obj = viewHolder.f450159h.getText().toString();
        com.tencent.mm.wallet_core.ui.r1.w0(viewHolder.f450159h, obj, 0, obj.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new ww1.e(this, aVar), true), this.f450177d);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        kotlin.jvm.internal.o.g(viewGroup, "viewGroup");
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f487864a1, viewGroup, false);
        kotlin.jvm.internal.o.d(inflate);
        return new ww1.c(inflate);
    }
}
