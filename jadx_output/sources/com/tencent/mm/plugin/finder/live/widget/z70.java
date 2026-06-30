package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class z70 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.c80 f120548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.w70 f120549e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.a80 f120550f;

    public z70(com.tencent.mm.plugin.finder.live.widget.c80 c80Var, com.tencent.mm.plugin.finder.live.widget.w70 w70Var, com.tencent.mm.plugin.finder.live.widget.a80 a80Var) {
        this.f120548d = c80Var;
        this.f120549e = w70Var;
        this.f120550f = a80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/LiveNoticeSendTypePanel$mAdapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.vw4 vw4Var = this.f120549e.f120158a;
        com.tencent.mm.plugin.finder.live.widget.c80 c80Var = this.f120548d;
        c80Var.f117975J = vw4Var;
        this.f120550f.notifyDataSetChanged();
        if (c80Var.L == 2 && (wxRecyclerView = c80Var.H) != null) {
            wxRecyclerView.postDelayed(new com.tencent.mm.plugin.finder.live.widget.y70(c80Var), 500L);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/LiveNoticeSendTypePanel$mAdapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
