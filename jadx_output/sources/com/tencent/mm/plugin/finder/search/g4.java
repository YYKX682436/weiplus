package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class g4 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.k4 f125704d;

    public g4(com.tencent.mm.plugin.finder.search.k4 k4Var) {
        this.f125704d = k4Var;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.plugin.finder.search.i4 i4Var = com.tencent.mm.plugin.finder.search.i4.f125723a;
        return com.tencent.mm.plugin.finder.search.i4.f125724b.getList(0).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.tencent.mm.plugin.finder.search.i4 i4Var = com.tencent.mm.plugin.finder.search.i4.f125723a;
        java.lang.Object obj = com.tencent.mm.plugin.finder.search.i4.f125724b.getList(0).get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.finder.search.j4 j4Var;
        com.tencent.mm.plugin.finder.search.k4 k4Var = this.f125704d;
        if (view == null) {
            kotlin.jvm.internal.o.d(viewGroup);
            view = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(k4Var.f125745d ? k4Var.f125746e ? com.tencent.mm.R.layout.ajf : com.tencent.mm.R.layout.aje : k4Var.f125746e ? com.tencent.mm.R.layout.b8f : com.tencent.mm.R.layout.b8e, viewGroup, false);
            j4Var = new com.tencent.mm.plugin.finder.search.j4(k4Var);
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f483931ci2);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            j4Var.f125732a = (android.widget.TextView) findViewById;
            android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.bzh);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            j4Var.f125733b = (android.widget.ImageView) findViewById2;
            j4Var.f125734c = view.findViewById(com.tencent.mm.R.id.g1v);
            view.setTag(j4Var);
        } else {
            java.lang.Object tag = view.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderSearchHistoryLogic.HistoryItemHolder");
            j4Var = (com.tencent.mm.plugin.finder.search.j4) tag;
        }
        com.tencent.mm.plugin.finder.search.i4 i4Var = com.tencent.mm.plugin.finder.search.i4.f125723a;
        java.lang.String string = ((r45.ku2) com.tencent.mm.plugin.finder.search.i4.f125724b.getList(0).get(i17)).getString(1);
        android.widget.TextView textView = j4Var.f125732a;
        if (textView == null) {
            kotlin.jvm.internal.o.o("contentTV");
            throw null;
        }
        textView.setText(string);
        android.widget.ImageView imageView = j4Var.f125733b;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("closeIV");
            throw null;
        }
        imageView.setOnClickListener(new com.tencent.mm.plugin.finder.search.f4(i17, k4Var));
        android.view.View view2 = j4Var.f125734c;
        if (view2 != null) {
            view2.setTag(com.tencent.mm.R.id.e5o, string);
        }
        return view;
    }
}
