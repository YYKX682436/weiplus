package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class a80 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f117744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.c80 f117745e;

    public a80(android.content.Context context, com.tencent.mm.plugin.finder.live.widget.c80 c80Var) {
        this.f117744d = context;
        this.f117745e = c80Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.LinkedList) ((jz5.n) this.f117745e.I).getValue()).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.finder.live.widget.v70 holder = (com.tencent.mm.plugin.finder.live.widget.v70) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.live.widget.c80 c80Var = this.f117745e;
        java.lang.Object obj = ((java.util.LinkedList) ((jz5.n) c80Var.I).getValue()).get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        com.tencent.mm.plugin.finder.live.widget.w70 w70Var = (com.tencent.mm.plugin.finder.live.widget.w70) obj;
        android.widget.TextView textView = holder.f120050e;
        textView.setText(w70Var.f120159b);
        android.widget.TextView textView2 = holder.f120051f;
        textView2.setText(w70Var.f120160c);
        android.view.View view = holder.f120052g;
        r45.vw4 vw4Var = c80Var.f117975J;
        r45.vw4 vw4Var2 = w70Var.f120158a;
        int i18 = vw4Var2 == vw4Var ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/LiveNoticeSendTypePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/LiveNoticeSendTypePanel$SendTypeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/LiveNoticeSendTypePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/LiveNoticeSendTypePanel$SendTypeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.live.widget.z70 z70Var = new com.tencent.mm.plugin.finder.live.widget.z70(c80Var, w70Var, this);
        android.view.View view2 = holder.f120049d;
        view2.setOnClickListener(z70Var);
        r45.vw4 vw4Var3 = r45.vw4.Manual;
        android.content.Context context = this.f117744d;
        if (vw4Var2 == vw4Var3) {
            r45.h32 h32Var = c80Var.K;
            if ((h32Var == null || zl2.r4.f473950a.e2(h32Var)) ? false : true) {
                android.view.View view3 = holder.f120052g;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/LiveNoticeSendTypePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/LiveNoticeSendTypePanel$SendTypeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/LiveNoticeSendTypePanel$mAdapter$2$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/LiveNoticeSendTypePanel$SendTypeViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setOnClickListener(null);
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
                textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
                return;
            }
        }
        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9));
        textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f117744d).inflate(com.tencent.mm.R.layout.do7, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.plugin.finder.live.widget.v70(inflate);
    }
}
