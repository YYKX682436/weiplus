package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public final class m7 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f210571d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f210572e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f210573f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f210574g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f210575h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f210576i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f210577m;

    public m7(android.content.Context context, java.util.List list) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(list, "list");
        this.f210571d = context;
        this.f210572e = list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f210573f = arrayList;
        this.f210577m = true;
        arrayList.addAll(list);
        c();
    }

    public final int[] a() {
        int[] iArr = this.f210575h;
        if (iArr != null) {
            return iArr;
        }
        kotlin.jvm.internal.o.o("sections");
        throw null;
    }

    public final void c() {
        java.util.List list = this.f210572e;
        this.f210575h = new int[list.size()];
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            a()[i17] = ((u11.a) obj).f423731e;
            i17 = i18;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f210572e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f210572e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup parent) {
        com.tencent.mm.ui.tools.l7 l7Var;
        kotlin.jvm.internal.o.g(parent, "parent");
        if (view == null) {
            view = android.view.View.inflate(this.f210571d, com.tencent.mm.R.layout.ela, null);
            kotlin.jvm.internal.o.f(view, "inflate(...)");
        }
        if (view.getTag() instanceof com.tencent.mm.ui.tools.l7) {
            java.lang.Object tag = view.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.tools.NewCountryCodeAdapter.ViewHolder");
            l7Var = (com.tencent.mm.ui.tools.l7) tag;
        } else {
            l7Var = new com.tencent.mm.ui.tools.l7();
            l7Var.f210548a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cfx);
            l7Var.f210549b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483914cg1);
            l7Var.f210550c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cg6);
            view.setTag(l7Var);
        }
        java.lang.Object item = getItem(i17);
        kotlin.jvm.internal.o.e(item, "null cannot be cast to non-null type com.tencent.mm.modelinternational.CountryCodeUtil.CountryInfo");
        u11.a aVar = (u11.a) item;
        if ((i17 == 0 || (i17 > 0 && a()[i17] != a()[i17 + (-1)])) && this.f210577m) {
            android.widget.TextView textView = l7Var.f210548a;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.widget.TextView textView2 = l7Var.f210548a;
            if (textView2 != null) {
                textView2.setText(java.lang.String.valueOf((char) a()[i17]));
            }
        } else {
            android.widget.TextView textView3 = l7Var.f210548a;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        }
        android.widget.TextView textView4 = l7Var.f210549b;
        if (textView4 != null) {
            textView4.setText(aVar.f423729c);
        }
        android.widget.TextView textView5 = l7Var.f210550c;
        if (textView5 != null) {
            textView5.setText("+" + aVar.f423728b);
        }
        android.widget.TextView textView6 = l7Var.f210550c;
        if (textView6 != null) {
            textView6.setVisibility(this.f210576i ? 0 : 4);
        }
        return view;
    }
}
