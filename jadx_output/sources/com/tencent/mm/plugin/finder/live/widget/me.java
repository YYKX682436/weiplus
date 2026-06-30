package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class me implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.se f119066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f119067e;

    public me(com.tencent.mm.plugin.finder.live.widget.se seVar, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f119066d = seVar;
        this.f119067e = finderJumpInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$showContent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context = this.f119066d.f119753a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r45.ac4 ac4Var = new r45.ac4();
        ac4Var.set(1, this.f119067e);
        ac4Var.set(4, 1);
        c61.yb.Yi((c61.yb) c17, context, ac4Var, null, null, 8, null);
        com.tencent.mm.plugin.finder.live.widget.se.f(2);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$showContent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
