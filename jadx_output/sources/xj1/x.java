package xj1;

/* loaded from: classes7.dex */
public final class x extends android.widget.ArrayAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f454821d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.sortlist.DragSortListView f454822e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f454823f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f454824g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context, java.util.ArrayList dataList) {
        super(context, com.tencent.mm.R.layout.f488018ej, dataList);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.f454821d = dataList;
        jz5.i iVar = jz5.i.f302830e;
        this.f454823f = jz5.h.a(iVar, xj1.u.f454817d);
        this.f454824g = jz5.h.a(iVar, xj1.v.f454818d);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i17) {
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) getItem(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        kotlin.jvm.internal.o.d(localUsageInfo);
        sb6.append(localUsageInfo.f76361d);
        sb6.append(localUsageInfo.f76363f);
        return sb6.toString().hashCode();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup parent) {
        xj1.a0 a0Var;
        kotlin.jvm.internal.o.g(parent, "parent");
        if (view == null || view.getTag() == null) {
            android.view.LayoutInflater from = android.view.LayoutInflater.from(getContext());
            kotlin.jvm.internal.o.f(from, "from(...)");
            android.view.View inflate = from.inflate(com.tencent.mm.R.layout.f488018ej, parent, false);
            android.view.View inflate2 = ((android.view.ViewStub) inflate.findViewById(com.tencent.mm.R.id.chv)).inflate();
            if (inflate2 != null) {
                inflate2.setBackground(null);
            }
            a0Var = new xj1.a0(inflate);
        } else {
            java.lang.Object tag = view.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.ui.collection.CollectionSortViewHolder");
            a0Var = (xj1.a0) tag;
        }
        java.lang.Object item = getItem(i17);
        kotlin.jvm.internal.o.d(item);
        a0Var.i((com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) item);
        a0Var.itemView.setClickable(false);
        java.lang.String str = (java.lang.String) this.f454823f.getValue();
        android.view.View view2 = a0Var.f454777o;
        view2.setContentDescription(str);
        int i18 = i17 == getCount() + (-1) ? 8 : 0;
        android.view.View view3 = a0Var.f454778p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/collection/CollectionSortViewHolder", "setBottomLineVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/ui/collection/CollectionSortViewHolder", "setBottomLineVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setOnClickListener(new xj1.w(this, i17));
        android.view.View itemView = a0Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        return itemView;
    }
}
