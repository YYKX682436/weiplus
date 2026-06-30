package com.tencent.mm.plugin.finder.search;

/* loaded from: classes8.dex */
public final class r4 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f125839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.u4 f125840e;

    public r4(com.tencent.mm.plugin.finder.search.u4 u4Var) {
        this.f125840e = u4Var;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f125839d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.List list = this.f125839d;
        android.text.SpannableString spannableString = list != null ? (android.text.SpannableString) list.get(i17) : null;
        kotlin.jvm.internal.o.d(spannableString);
        return spannableString;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.finder.search.s4 s4Var;
        if (view == null) {
            kotlin.jvm.internal.o.d(viewGroup);
            android.view.LayoutInflater from = android.view.LayoutInflater.from(viewGroup.getContext());
            com.tencent.mm.plugin.finder.search.u4 u4Var = this.f125840e;
            view = from.inflate(u4Var.f125884e ? u4Var.f125885f ? com.tencent.mm.R.layout.ajh : com.tencent.mm.R.layout.ajg : u4Var.f125885f ? com.tencent.mm.R.layout.b8j : com.tencent.mm.R.layout.b8i, viewGroup, false);
            s4Var = new com.tencent.mm.plugin.finder.search.s4(u4Var);
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f483931ci2);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            s4Var.f125850a = (android.widget.TextView) findViewById;
            android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f487176ns3);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            view.setTag(s4Var);
        } else {
            java.lang.Object tag = view.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderSearchSuggestionManager.SuggestionItemHolder");
            s4Var = (com.tencent.mm.plugin.finder.search.s4) tag;
        }
        android.widget.TextView textView = s4Var.f125850a;
        android.text.SpannableString spannableString = null;
        if (textView == null) {
            kotlin.jvm.internal.o.o("contentTV");
            throw null;
        }
        java.util.List list = this.f125839d;
        if (list != null) {
            if (!(i17 < list.size())) {
                list = null;
            }
            if (list != null) {
                spannableString = (android.text.SpannableString) list.get(i17);
            }
        }
        textView.setText(spannableString);
        return view;
    }
}
