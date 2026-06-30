package com.tencent.mm.plugin.finder.search;

/* loaded from: classes8.dex */
public final class r5 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f125841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.u5 f125842e;

    public r5(com.tencent.mm.plugin.finder.search.u5 u5Var) {
        this.f125842e = u5Var;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f125841d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.List list = this.f125841d;
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
        com.tencent.mm.plugin.finder.search.s5 s5Var;
        if (view == null) {
            kotlin.jvm.internal.o.d(viewGroup);
            view = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.b8i, viewGroup, false);
            s5Var = new com.tencent.mm.plugin.finder.search.s5(this.f125842e);
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f483931ci2);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            s5Var.f125851a = (android.widget.TextView) findViewById;
            android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f487176ns3);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            view.setTag(s5Var);
        } else {
            java.lang.Object tag = view.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.RingtoneSearchSuggestionManager.SuggestionItemHolder");
            s5Var = (com.tencent.mm.plugin.finder.search.s5) tag;
        }
        android.widget.TextView textView = s5Var.f125851a;
        android.text.SpannableString spannableString = null;
        if (textView == null) {
            kotlin.jvm.internal.o.o("contentTV");
            throw null;
        }
        java.util.List list = this.f125841d;
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
