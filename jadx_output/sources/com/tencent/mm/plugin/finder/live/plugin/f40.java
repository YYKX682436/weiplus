package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class f40 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.h40 f112499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.c0 f112500e;

    public f40(com.tencent.mm.plugin.finder.live.plugin.h40 h40Var, cm2.c0 c0Var) {
        this.f112499d = h40Var;
        this.f112500e = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLivePayVideoListBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.h40 h40Var = this.f112499d;
        android.content.Context context = h40Var.f112767d;
        cm2.c0 c0Var = this.f112500e;
        r45.do2 item = c0Var.f43334v;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).dk(context, null, null, item, true);
        yz5.l lVar = h40Var.f112770g;
        if (lVar != null) {
            lVar.invoke(c0Var);
        }
        bf2.c.c(bf2.c.f19598a, h40Var.f112768e, 5, 15, pm0.v.u(zl2.r4.f473950a.c0(c0Var.f43334v)), 0, null, 0, 5, null, 0, nd1.y0.CTRL_INDEX, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePayVideoListBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
