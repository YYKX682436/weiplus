package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f155238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f155239e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f155240f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ListViewInScrollView f155241g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f155242h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f155243i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f155244m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ListViewInScrollView f155245n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f155246o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.RechargeUI f155247p;

    public v0(com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI, android.view.View view, android.widget.TextView textView, int i17, com.tencent.mm.ui.ListViewInScrollView listViewInScrollView, android.view.View view2, android.widget.TextView textView2, int i18, com.tencent.mm.ui.ListViewInScrollView listViewInScrollView2, android.widget.TextView textView3) {
        this.f155247p = rechargeUI;
        this.f155238d = view;
        this.f155239e = textView;
        this.f155240f = i17;
        this.f155241g = listViewInScrollView;
        this.f155242h = view2;
        this.f155243i = textView2;
        this.f155244m = i18;
        this.f155245n = listViewInScrollView2;
        this.f155246o = textView3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/RechargeUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f155238d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/recharge/ui/RechargeUI$16", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/recharge/ui/RechargeUI$16", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f155239e.setTextColor(this.f155240f);
        this.f155241g.setVisibility(0);
        android.view.View view3 = this.f155242h;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/recharge/ui/RechargeUI$16", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/recharge/ui/RechargeUI$16", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f155243i.setTextColor(this.f155244m);
        this.f155245n.setVisibility(8);
        int count = this.f155247p.f155131p.getCount();
        android.widget.TextView textView = this.f155246o;
        if (count == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
