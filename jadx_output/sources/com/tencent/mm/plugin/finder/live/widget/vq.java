package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class vq implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.wq f120081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f120082e;

    public vq(com.tencent.mm.plugin.finder.live.widget.wq wqVar, r45.h32 h32Var) {
        this.f120081d = wqVar;
        this.f120082e = h32Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivePostNoticeInfoPanel$show$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.wq wqVar = this.f120081d;
        r45.h32 h32Var = wqVar.T;
        if (h32Var == null) {
            kotlin.jvm.internal.o.o("noticeInfo");
            throw null;
        }
        int integer = h32Var.getInteger(18);
        com.tencent.mm.plugin.finder.live.widget.c80 c80Var = (com.tencent.mm.plugin.finder.live.widget.c80) ((jz5.n) wqVar.S).getValue();
        r45.h32 h32Var2 = wqVar.T;
        if (h32Var2 == null) {
            kotlin.jvm.internal.o.o("noticeInfo");
            throw null;
        }
        c80Var.e0(h32Var2, 2, new com.tencent.mm.plugin.finder.live.widget.uq(wqVar, integer, this.f120082e));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivePostNoticeInfoPanel$show$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
