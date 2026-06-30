package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class j9 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f118739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.x9 f118740e;

    public j9(android.content.Context context, com.tencent.mm.plugin.finder.live.widget.x9 x9Var) {
        this.f118739d = context;
        this.f118740e = x9Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f118740e.L.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        int i18;
        jz5.f0 f0Var;
        int i19;
        com.tencent.mm.plugin.finder.live.widget.f9 holder = (com.tencent.mm.plugin.finder.live.widget.f9) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.live.widget.x9 x9Var = this.f118740e;
        java.lang.Object obj = x9Var.L.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.of1 of1Var = (r45.of1) obj;
        int integer = of1Var.getInteger(2);
        android.view.View view = holder.f118334i;
        if (integer == x9Var.M) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            i18 = 0;
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$RoleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$RoleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.h9(this.f118739d, x9Var));
            i19 = 8;
        } else {
            i18 = 0;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$RoleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$RoleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setOnClickListener(null);
            holder.f118330e.setText(of1Var.getString(0));
            java.lang.String g17 = zl2.r4.f473950a.g1(of1Var.getInteger(2));
            if (!(g17.length() > 0)) {
                g17 = null;
            }
            android.widget.TextView textView = holder.f118331f;
            if (g17 != null) {
                textView.setVisibility(0);
                textView.setText(g17);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                i19 = 8;
                textView.setVisibility(8);
            } else {
                i19 = 8;
            }
            int integer2 = of1Var.getInteger(2);
            mn2.g1 g1Var = mn2.g1.f329975a;
            android.widget.ImageView imageView = holder.f118333h;
            if (integer2 == 3) {
                vo0.d a17 = g1Var.a();
                mn2.n nVar = new mn2.n(of1Var.getString(1), null, 2, null);
                kotlin.jvm.internal.o.f(imageView, "<get-avatatView>(...)");
                a17.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
            } else {
                vo0.d l17 = g1Var.l();
                mn2.n nVar2 = new mn2.n(of1Var.getString(1), null, 2, null);
                kotlin.jvm.internal.o.f(imageView, "<get-avatatView>(...)");
                l17.c(nVar2, imageView, g1Var.h(mn2.f1.f329961o));
            }
            android.view.View view2 = holder.f118332g;
            int i27 = of1Var.getInteger(2) == x9Var.R ? 0 : i19;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Integer.valueOf(i27));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$RoleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$RoleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            holder.f118329d.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.i9(x9Var, of1Var, this));
        }
        android.view.View view3 = holder.f118335m;
        int i28 = i18;
        int i29 = i17 == getItemCount() - 1 ? i19 : i28;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(i29));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$RoleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList4.get(i28)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$RoleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f118739d).inflate(com.tencent.mm.R.layout.dqz, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.plugin.finder.live.widget.f9(inflate);
    }
}
