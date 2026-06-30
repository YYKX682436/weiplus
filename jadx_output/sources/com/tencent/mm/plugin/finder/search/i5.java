package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class i5 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.m5 f125726d;

    public i5(com.tencent.mm.plugin.finder.search.m5 m5Var) {
        this.f125726d = m5Var;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.plugin.finder.search.k5 k5Var = com.tencent.mm.plugin.finder.search.k5.f125747a;
        return com.tencent.mm.plugin.finder.search.k5.f125748b.getList(0).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.tencent.mm.plugin.finder.search.k5 k5Var = com.tencent.mm.plugin.finder.search.k5.f125747a;
        java.lang.Object obj = com.tencent.mm.plugin.finder.search.k5.f125748b.getList(0).get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.finder.search.l5 l5Var;
        com.tencent.mm.plugin.finder.search.m5 m5Var = this.f125726d;
        if (view == null) {
            kotlin.jvm.internal.o.d(viewGroup);
            view = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(m5Var.f125776a ? com.tencent.mm.R.layout.b8f : com.tencent.mm.R.layout.b8e, viewGroup, false);
            l5Var = new com.tencent.mm.plugin.finder.search.l5(m5Var);
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f483931ci2);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            l5Var.f125765a = (android.widget.TextView) findViewById;
            android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.bzh);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            l5Var.f125766b = (android.widget.ImageView) findViewById2;
            l5Var.f125767c = view.findViewById(com.tencent.mm.R.id.g1v);
            view.setTag(l5Var);
        } else {
            java.lang.Object tag = view.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.RingtoneSearchHistoryLogic.HistoryItemHolder");
            l5Var = (com.tencent.mm.plugin.finder.search.l5) tag;
        }
        com.tencent.mm.plugin.finder.search.k5 k5Var = com.tencent.mm.plugin.finder.search.k5.f125747a;
        java.lang.String string = ((r45.ku2) com.tencent.mm.plugin.finder.search.k5.f125748b.getList(0).get(i17)).getString(1);
        android.widget.TextView textView = l5Var.f125765a;
        if (textView == null) {
            kotlin.jvm.internal.o.o("contentTV");
            throw null;
        }
        textView.setText(string);
        android.widget.ImageView imageView = l5Var.f125766b;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("closeIV");
            throw null;
        }
        imageView.setOnClickListener(new com.tencent.mm.plugin.finder.search.h5(m5Var, i17, string));
        android.view.View view2 = l5Var.f125767c;
        if (view2 != null) {
            view2.setTag(com.tencent.mm.R.id.e5o, string);
        }
        return view;
    }
}
