package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class qc0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.nd0 f113988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f113989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f113990f;

    public qc0(com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, kotlin.jvm.internal.h0 h0Var) {
        this.f113988d = nd0Var;
        this.f113989e = finderJumpInfo;
        this.f113990f = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$forceUpdateExpandToEligibilityMode$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context = this.f113988d.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((c61.p2) ybVar).Oj(context, this.f113989e, new com.tencent.mm.plugin.lite.s());
        ((ml2.r0) i95.n0.c(ml2.r0.class)).fk(2, (java.lang.String) this.f113990f.f310123d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$forceUpdateExpandToEligibilityMode$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
