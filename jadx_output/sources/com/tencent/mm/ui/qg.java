package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class qg implements com.tencent.mm.plugin.newtips.model.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f209556d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.og f209557e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f209558f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f209559g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f209560h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f209561i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f209562m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f209563n;

    public qg(android.content.Context context, com.tencent.mm.ui.og ogVar) {
        this.f209556d = context;
        this.f209557e = ogVar;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean T1(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean W5() {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Y3(boolean z17) {
        if (z17) {
            this.f209561i.setVisibility(0);
            return true;
        }
        this.f209561i.setVisibility(8);
        return true;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        if (!z17) {
            this.f209562m.setVisibility(8);
            return true;
        }
        this.f209562m.setVisibility(0);
        if (pm6Var.f383186d > 99) {
            this.f209562m.setText("");
            this.f209562m.setBackgroundResource(com.tencent.mm.R.raw.badge_count_more);
            return true;
        }
        this.f209562m.setText("" + pm6Var.f383186d);
        this.f209562m.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(this.f209556d, pm6Var.f383186d));
        return true;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void c1(boolean z17, com.tencent.mm.plugin.newtips.model.r rVar) {
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void e5(com.tencent.mm.plugin.newtips.model.r rVar, boolean z17) {
        com.tencent.mm.plugin.newtips.model.i.b(this, rVar, z17);
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        return this.f209557e.f209476b.f209510e;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.f209558f;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean o0(boolean z17) {
        return com.tencent.mm.plugin.newtips.model.i.l(z17, this);
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean q3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean u6(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean y(boolean z17) {
        if (z17) {
            android.view.View view = this.f209563n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        android.view.View view2 = this.f209563n;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/PlusSubMenuHelper$MenuItemView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }
}
