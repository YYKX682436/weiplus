package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class h1 extends android.widget.BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f142844e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI f142845f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f142846g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f142847h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f142843d = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f142848i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f142849m = false;

    public h1(com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI iPCallCountryCodeSelectUI, java.util.List list) {
        this.f142845f = iPCallCountryCodeSelectUI;
        this.f142844e = list;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            this.f142843d.add((com.tencent.mm.plugin.ipcall.ui.a) list.get(i17));
        }
        this.f142845f.f142588q.setVisibility(8);
        c();
    }

    public final java.lang.String a(int i17) {
        char c17 = (char) i17;
        java.lang.String valueOf = java.lang.String.valueOf(c17);
        java.lang.String[] strArr = com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeScrollbar.f142566r;
        for (int i18 = 0; i18 < 26; i18++) {
            if (strArr[i18].equals(java.lang.String.valueOf(c17))) {
                return valueOf;
            }
        }
        return "#";
    }

    public final void c() {
        java.util.List list = this.f142844e;
        this.f142847h = new int[list.size()];
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            this.f142847h[i17] = ((com.tencent.mm.plugin.ipcall.ui.a) list.get(i17)).a();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f142844e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f142844e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.ipcall.ui.g1 g1Var;
        com.tencent.mm.plugin.ipcall.ui.a aVar = (com.tencent.mm.plugin.ipcall.ui.a) getItem(i17);
        com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI iPCallCountryCodeSelectUI = this.f142845f;
        if (view == null) {
            view = android.view.View.inflate(iPCallCountryCodeSelectUI, com.tencent.mm.R.layout.bln, null);
            g1Var = new com.tencent.mm.plugin.ipcall.ui.g1();
            g1Var.f142832a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cfx);
            g1Var.f142833b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483914cg1);
            g1Var.f142834c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cg6);
            view.setTag(g1Var);
        } else {
            g1Var = (com.tencent.mm.plugin.ipcall.ui.g1) view.getTag();
        }
        int i18 = i17 >= 1 ? this.f142847h[i17 - 1] : -1;
        if (i17 == 0) {
            g1Var.f142832a.setVisibility(0);
            if (this.f142849m) {
                g1Var.f142832a.setText(com.tencent.mm.R.string.f492717hl0);
            } else {
                g1Var.f142832a.setText(a(this.f142847h[i17]));
            }
        } else if (i17 <= 0 || this.f142847h[i17] == i18) {
            g1Var.f142832a.setVisibility(8);
        } else {
            g1Var.f142832a.setVisibility(0);
            g1Var.f142832a.setText(a(this.f142847h[i17]));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f142846g)) {
            g1Var.f142833b.setText(aVar.f142741a);
            g1Var.f142834c.setText(" (+" + aVar.f142742b + ")");
        } else {
            g1Var.f142833b.setText(o13.q.c(iPCallCountryCodeSelectUI, aVar.f142741a, this.f142846g));
            g1Var.f142834c.setText(o13.q.c(iPCallCountryCodeSelectUI, " (+" + aVar.f142742b + ")", this.f142846g));
        }
        if (this.f142848i) {
            g1Var.f142834c.setVisibility(0);
        } else {
            g1Var.f142834c.setVisibility(4);
        }
        return view;
    }
}
