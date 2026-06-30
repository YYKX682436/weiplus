package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.eg1 f113049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f113050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113051f;

    public j2(r45.eg1 eg1Var, com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, java.lang.String str) {
        this.f113049d = eg1Var;
        this.f113050e = v3Var;
        this.f113051f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$insertMilestoneInfoPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) this.f113049d.getCustom(1);
        if (finderJumpInfo == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$insertMilestoneInfoPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f113050e;
        android.content.Context context = v3Var.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r45.l34 l34Var = new r45.l34();
        l34Var.set(1, java.lang.Boolean.TRUE);
        xc2.y2 y2Var = xc2.y2.f453343a;
        xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
        p0Var.f453238c = l34Var;
        xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.t1 t1Var = ml2.t1.f327976p2;
        java.lang.String str = ((mm2.c1) v3Var.P0(mm2.c1.class)).f328852o;
        long j17 = ((mm2.e1) v3Var.P0(mm2.e1.class)).f328988r.getLong(0);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("milestone", this.f113051f);
        r0Var.mk(t1Var, str, j17, hashMap);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$insertMilestoneInfoPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
