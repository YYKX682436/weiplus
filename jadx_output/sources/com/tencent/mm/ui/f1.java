package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class f1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.LayoutInflater f208407d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f208408e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f208409f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.c1 f208410g = new com.tencent.mm.ui.z0(this);

    /* renamed from: h, reason: collision with root package name */
    public final o11.g f208411h;

    public f1(android.view.LayoutInflater layoutInflater) {
        this.f208407d = layoutInflater;
        o11.f fVar = new o11.f();
        fVar.f342096t = true;
        fVar.f342094r = l01.a.h();
        this.f208411h = fVar.a();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f208408e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.ui.a1) this.f208408e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.e1 e1Var;
        android.view.View view2;
        com.tencent.mm.ui.a1 a1Var = (com.tencent.mm.ui.a1) this.f208408e.get(i17);
        if (view == null) {
            view2 = this.f208407d.inflate(com.tencent.mm.R.layout.f488144id, viewGroup, false);
            e1Var = new com.tencent.mm.ui.e1(null);
            e1Var.f208356a = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.a9o);
            e1Var.f208357b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.obg);
            e1Var.f208358c = (com.tencent.mm.ui.widget.MMSwitchBtn) view2.findViewById(com.tencent.mm.R.id.a2v);
            e1Var.f208359d = view2.findViewById(com.tencent.mm.R.id.a2x);
            view2.setTag(e1Var);
        } else {
            e1Var = (com.tencent.mm.ui.e1) view.getTag();
            view2 = view;
        }
        n11.a.b().h(a1Var.f197113b, e1Var.f208356a, this.f208411h);
        e1Var.f208357b.setText(a1Var.f197114c);
        e1Var.f208358c.setCheck(a1Var.f197115d);
        if (e1Var.f208358c.getTag() == null) {
            com.tencent.mm.ui.d1 d1Var = new com.tencent.mm.ui.d1(null);
            d1Var.f208320a = a1Var;
            d1Var.f208321b = this.f208410g;
            e1Var.f208358c.setSwitchListener(d1Var.f208322c);
            e1Var.f208358c.setTag(d1Var);
        } else {
            ((com.tencent.mm.ui.d1) e1Var.f208358c.getTag()).f208320a = a1Var;
        }
        if (i17 == r2.size() - 1) {
            android.view.View view3 = e1Var.f208359d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/ui/AppBrandNotifySettingsUI$DefaultAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/AppBrandNotifySettingsUI$DefaultAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = e1Var.f208359d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/ui/AppBrandNotifySettingsUI$DefaultAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/ui/AppBrandNotifySettingsUI$DefaultAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return view2;
    }
}
