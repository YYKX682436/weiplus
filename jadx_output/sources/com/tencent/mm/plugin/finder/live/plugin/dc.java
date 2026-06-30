package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class dc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.bd5 f112250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.gc f112251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.i0 f112252f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f112253g;

    public dc(r45.bd5 bd5Var, com.tencent.mm.plugin.finder.live.plugin.gc gcVar, cm2.i0 i0Var, android.widget.TextView textView) {
        this.f112250d = bd5Var;
        this.f112251e = gcVar;
        this.f112252f = i0Var;
        this.f112253g = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.ce0 ce0Var;
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveBulkBuyBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = false;
        r45.bd5 bd5Var = this.f112250d;
        if (bd5Var != null && (string = bd5Var.getString(7)) != null) {
            if (string.length() > 0) {
                z17 = true;
            }
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = null;
        com.tencent.mm.plugin.finder.live.plugin.gc gcVar = this.f112251e;
        if (z17) {
            com.tencent.mm.plugin.finder.live.util.y.m(gcVar.f112678e, null, null, new com.tencent.mm.plugin.finder.live.plugin.cc(gcVar, bd5Var, null), 3, null);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveBulkBuyBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (bd5Var != null && (ce0Var = (r45.ce0) bd5Var.getCustom(2)) != null) {
            finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) ce0Var.getCustom(9);
        }
        if (finderJumpInfo != null) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context = gcVar.f112677d;
            r45.ac4 ac4Var = new r45.ac4();
            ac4Var.set(1, finderJumpInfo);
            c61.yb.Yi((c61.yb) c17, context, ac4Var, null, null, 8, null);
        }
        com.tencent.mm.plugin.finder.live.plugin.gc.a(gcVar, this.f112252f.f43354v, this.f112253g.getText().toString());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveBulkBuyBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
