package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class v extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f156724d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f156725e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f156726f;

    /* renamed from: g, reason: collision with root package name */
    public final int f156727g;

    /* renamed from: h, reason: collision with root package name */
    public final int f156728h;

    /* renamed from: i, reason: collision with root package name */
    public final int f156729i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.remittance.mobile.ui.x f156730m;

    public v(android.content.Context context, boolean z17, java.util.List list, com.tencent.mm.plugin.remittance.mobile.ui.x xVar) {
        this.f156725e = context;
        this.f156724d = z17;
        this.f156726f = list;
        this.f156730m = xVar;
        this.f156727g = context.getResources().getColor(com.tencent.mm.R.color.f478719fa);
        this.f156728h = context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5);
        this.f156729i = context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        boolean z17 = this.f156724d;
        java.util.List list = this.f156726f;
        return z17 ? list.size() : list.size() + 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return (!this.f156724d && i17 == getItemCount() - 1) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        if (!(k3Var instanceof com.tencent.mm.plugin.remittance.mobile.ui.y)) {
            com.tencent.mm.plugin.remittance.mobile.ui.r rVar = (com.tencent.mm.plugin.remittance.mobile.ui.r) k3Var;
            if (this.f156724d) {
                android.view.View view = rVar.f156710d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$HistoryRecordAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$HistoryRecordAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.view.View view2 = rVar.f156710d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$HistoryRecordAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$HistoryRecordAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.List list = this.f156726f;
        if (list == null || i17 < 0 || i17 >= list.size()) {
            return;
        }
        com.tencent.mm.plugin.remittance.mobile.ui.y yVar = (com.tencent.mm.plugin.remittance.mobile.ui.y) k3Var;
        r45.ow3 ow3Var = (r45.ow3) list.get(i17);
        int i18 = ow3Var.f382580i;
        android.view.View view3 = yVar.f156742d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$HistoryRecordAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$HistoryRecordAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yVar.f156743e.post(new com.tencent.mm.plugin.remittance.mobile.ui.s(this, yVar, ow3Var));
        java.lang.String str = ow3Var.f382578g;
        android.widget.TextView textView = yVar.f156746h;
        textView.setText(str);
        int i19 = ow3Var.f382580i;
        android.widget.TextView textView2 = yVar.f156747i;
        android.widget.TextView textView3 = yVar.f156745g;
        android.widget.TextView textView4 = yVar.f156744f;
        if (i19 == 0) {
            int i27 = this.f156727g;
            textView4.setTextColor(i27);
            textView3.setTextColor(i27);
            textView.setTextColor(this.f156728h);
            textView2.setVisibility(8);
        } else {
            int i28 = this.f156729i;
            textView4.setTextColor(i28);
            textView3.setTextColor(i28);
            textView.setTextColor(i28);
            textView2.setVisibility(0);
        }
        android.view.View view4 = yVar.f156742d;
        view4.setTag(ow3Var);
        view4.setOnClickListener(new com.tencent.mm.plugin.remittance.mobile.ui.t(this));
        view4.setOnLongClickListener(new com.tencent.mm.plugin.remittance.mobile.ui.u(this));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return i17 == 0 ? new com.tencent.mm.plugin.remittance.mobile.ui.y(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f489306c25, viewGroup, false)) : new com.tencent.mm.plugin.remittance.mobile.ui.r(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f489307c26, viewGroup, false));
    }
}
