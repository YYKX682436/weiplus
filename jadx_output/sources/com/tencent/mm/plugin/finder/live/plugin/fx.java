package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class fx implements com.tencent.mm.plugin.finder.live.plugin.ep0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f112597d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f112598e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f112599f;

    /* renamed from: g, reason: collision with root package name */
    public final cm2.t f112600g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f112601h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f112602i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f112603m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f112604n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f112605o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f112606p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f112607q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f112608r;

    public fx(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112597d = context;
        this.f112598e = buContext;
        this.f112599f = lVar;
        this.f112600g = tVar;
        this.f112601h = "FinderLiveMemberBubble";
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.aub, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f112602i = (android.view.ViewGroup) inflate;
        this.f112603m = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.dx(this));
        this.f112604n = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.ex(this));
        this.f112605o = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.zw(this));
        this.f112606p = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.xw(this));
        this.f112607q = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.yw(this));
        this.f112608r = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.ax(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public cm2.t A() {
        return this.f112600g;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void U() {
    }

    public final void a(cm2.a0 a0Var) {
        ((android.widget.ImageView) ((jz5.n) this.f112603m).getValue()).setImageDrawable(com.tencent.mm.ui.uk.e(this.f112597d, com.tencent.mm.R.raw.vip_filled_new, android.graphics.Color.parseColor("#C4A364")));
        ((android.widget.TextView) ((jz5.n) this.f112604n).getValue()).setText(a0Var.f43329v.getString(0));
        ((android.widget.TextView) ((jz5.n) this.f112605o).getValue()).setText(a0Var.f43329v.getString(1));
        ((android.view.View) ((jz5.n) this.f112607q).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.bx(this, a0Var));
        boolean y17 = zl2.r4.f473950a.y1(this.f112598e);
        jz5.g gVar = this.f112608r;
        jz5.g gVar2 = this.f112606p;
        if (y17) {
            android.view.View view = (android.view.View) ((jz5.n) gVar2).getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteMemberItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteMemberItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) ((jz5.n) gVar).getValue()).setVisibility(8);
            return;
        }
        android.view.View view2 = (android.view.View) ((jz5.n) gVar2).getValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteMemberItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteMemberItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) ((jz5.n) gVar).getValue()).setVisibility(0);
        ((android.view.View) ((jz5.n) gVar2).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.cx(this, a0Var));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int e0() {
        return com.tencent.mm.R.id.eqy;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void f0(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.a0) {
            a((cm2.a0) data);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public android.view.View getView() {
        return this.f112602i;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.a0) {
            cm2.a0 a0Var = (cm2.a0) data;
            a(a0Var);
            bf2.c.c(bf2.c.f19598a, this.f112598e, 1, 10, java.lang.String.valueOf(a0Var.f43385d), 0, null, 0, 0, null, 0, 1008, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l0() {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int p0() {
        return com.tencent.mm.R.id.hhj;
    }
}
