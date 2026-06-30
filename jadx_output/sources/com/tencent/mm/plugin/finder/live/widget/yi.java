package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class yi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.dq1 f120448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.aj f120449e;

    public yi(r45.dq1 dq1Var, com.tencent.mm.plugin.finder.live.widget.aj ajVar) {
        this.f120448d = dq1Var;
        this.f120449e = ajVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansTaskWidget$setContent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) this.f120448d.getCustom(12);
        if (finderJumpInfo != null) {
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            android.content.Context context = this.f120449e.f117774p.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            r45.ac4 ac4Var = new r45.ac4();
            ac4Var.set(1, finderJumpInfo);
            ((c61.p2) ybVar).Bi(context, ac4Var, null, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansTaskWidget$setContent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
