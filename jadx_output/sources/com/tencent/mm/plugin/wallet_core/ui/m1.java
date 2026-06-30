package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class m1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.LayoutInflater f180485d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f180486e;

    public m1(android.content.Context context, java.util.List list) {
        this.f180485d = null;
        this.f180486e = new java.util.LinkedList();
        this.f180485d = android.view.LayoutInflater.from(context);
        this.f180486e = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f180486e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f180486e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.wallet_core.ui.l1 l1Var;
        if (view == null) {
            view = this.f180485d.inflate(com.tencent.mm.R.layout.d5q, viewGroup, false);
            l1Var = new com.tencent.mm.plugin.wallet_core.ui.l1(this);
            l1Var.f180395a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.par);
            l1Var.f180396b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.paq);
            l1Var.f180397c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.pat);
            l1Var.f180398d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.pas);
            view.setTag(l1Var);
        } else {
            l1Var = (com.tencent.mm.plugin.wallet_core.ui.l1) view.getTag();
        }
        vr4.i1 i1Var = (vr4.i1) getItem(i17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(i1Var.f439747t)) {
            l1Var.f180396b.setVisibility(8);
        } else {
            l1Var.f180396b.setText(i1Var.f439747t);
            l1Var.f180396b.setVisibility(0);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(i1Var.f439739i)) {
            l1Var.f180397c.setVisibility(8);
        } else {
            l1Var.f180397c.setText(i1Var.f439739i);
            l1Var.f180397c.setVisibility(0);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(i1Var.f439741n)) {
            l1Var.f180398d.setVisibility(8);
        } else {
            l1Var.f180398d.setText(i1Var.f439741n);
            l1Var.f180398d.setVisibility(0);
        }
        java.lang.String str = i1Var.f439748u;
        l1Var.f180395a.setImageBitmap(null);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            o11.f fVar = new o11.f();
            fVar.f342083g = lp0.b.D();
            fVar.f342082f = dt4.b.a(str);
            fVar.f342078b = true;
            fVar.f342095s = true;
            n11.a.b().h(str, l1Var.f180395a, fVar.a());
        }
        return view;
    }
}
