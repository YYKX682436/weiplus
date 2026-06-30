package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class p1 extends android.widget.BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f210630e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f210631f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f210632g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f210633h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f210629d = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f210634i = false;

    public p1(android.content.Context context, java.util.List list) {
        this.f210631f = context;
        this.f210630e = list;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            this.f210629d.add((u11.a) list.get(i17));
        }
        c();
    }

    public final java.lang.String a(int i17) {
        if (!com.tencent.mm.sdk.platformtools.m2.n()) {
            return java.lang.String.valueOf((char) i17);
        }
        return java.lang.Integer.toString(i17) + "劃";
    }

    public final void c() {
        java.util.List list = this.f210630e;
        this.f210633h = new int[list.size()];
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            this.f210633h[i17] = ((u11.a) list.get(i17)).f423731e;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f210630e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f210630e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.tools.o1 o1Var;
        u11.a aVar = (u11.a) getItem(i17);
        if (view == null) {
            boolean n17 = com.tencent.mm.sdk.platformtools.m2.n();
            android.content.Context context = this.f210631f;
            view = !n17 ? android.view.View.inflate(context, com.tencent.mm.R.layout.f488692a30, null) : android.view.View.inflate(context, com.tencent.mm.R.layout.f488693a31, null);
            o1Var = new com.tencent.mm.ui.tools.o1();
            o1Var.f210614a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cfx);
            o1Var.f210615b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483914cg1);
            o1Var.f210616c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cg6);
            view.setTag(o1Var);
        } else {
            o1Var = (com.tencent.mm.ui.tools.o1) view.getTag();
        }
        int i18 = i17 >= 1 ? this.f210633h[i17 - 1] : -1;
        if (i17 == 0) {
            o1Var.f210614a.setVisibility(0);
            o1Var.f210614a.setText(a(this.f210633h[i17]));
        } else if (i17 <= 0 || this.f210633h[i17] == i18) {
            o1Var.f210614a.setVisibility(8);
        } else {
            o1Var.f210614a.setVisibility(0);
            o1Var.f210614a.setText(a(this.f210633h[i17]));
        }
        o1Var.f210615b.setText(aVar.f423729c);
        o1Var.f210616c.setText(aVar.f423728b);
        if (this.f210634i) {
            o1Var.f210616c.setVisibility(0);
        } else {
            o1Var.f210616c.setVisibility(4);
        }
        return view;
    }
}
