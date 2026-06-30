package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class y3 extends android.widget.BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI f143084e;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f143083d = null;

    /* renamed from: f, reason: collision with root package name */
    public r45.rr3 f143085f = null;

    public y3(com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI iPCallRechargeUI) {
        this.f143084e = null;
        iz5.a.g(null, iPCallRechargeUI != null);
        this.f143084e = iPCallRechargeUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f143083d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.List list = this.f143083d;
        if (list != null) {
            return list.get(i17);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.ipcall.ui.x3 x3Var;
        t83.d dVar;
        java.lang.String str = null;
        com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI iPCallRechargeUI = this.f143084e;
        if (view == null) {
            view = ((android.view.LayoutInflater) iPCallRechargeUI.getSystemService("layout_inflater")).inflate(com.tencent.mm.R.layout.bm7, viewGroup, false);
            x3Var = new com.tencent.mm.plugin.ipcall.ui.x3(this, null);
            x3Var.f143070a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.okn);
            x3Var.f143071b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.okl);
            x3Var.f143072c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.okk);
            x3Var.f143073d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.okj);
            x3Var.f143074e = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.azl);
            view.setTag(x3Var);
        } else {
            x3Var = (com.tencent.mm.plugin.ipcall.ui.x3) view.getTag();
        }
        r45.l57 l57Var = (r45.l57) getItem(i17);
        if (l57Var == null) {
            return view;
        }
        x3Var.f143070a.setText(l57Var.f379164h);
        x3Var.f143071b.setText(l57Var.f379165i);
        x3Var.f143072c.setText(l57Var.f379166m);
        if (com.tencent.mm.sdk.platformtools.t8.K0(l57Var.f379166m)) {
            x3Var.f143072c.setVisibility(8);
        } else {
            x3Var.f143072c.setVisibility(0);
        }
        if (this.f143085f != null) {
            android.widget.TextView textView = x3Var.f143073d;
            java.lang.String string = iPCallRechargeUI.getString(com.tencent.mm.R.string.g4f);
            java.lang.Object[] objArr = new java.lang.Object[2];
            java.lang.String str2 = this.f143085f.f385137g;
            java.util.HashMap hashMap = t83.c.f416412b;
            if (hashMap.size() == 0) {
                t83.c.k();
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && (dVar = (t83.d) hashMap.get(str2)) != null) {
                str = dVar.f416419c;
            }
            objArr[0] = str;
            objArr[1] = java.lang.String.valueOf(l57Var.f379162f);
            textView.setText(java.lang.String.format(string, objArr));
        }
        x3Var.f143074e.setTag(java.lang.Integer.valueOf(i17));
        x3Var.f143074e.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.w3(this));
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }
}
