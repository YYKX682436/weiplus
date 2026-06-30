package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class i2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.q7 f112891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f112892e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f112893f;

    public i2(r45.q7 q7Var, com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f112891d = q7Var;
        this.f112892e = v3Var;
        this.f112893f = finderJumpInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$insertCommonInfoPanel$1$4$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.q7 q7Var = this.f112891d;
        int integer = q7Var.getInteger(0);
        ml2.t1 t1Var = integer != 1 ? integer != 2 ? null : ml2.t1.f327988t2 : ml2.t1.f327976p2;
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f112892e;
        if (t1Var != null) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).kk(t1Var, ((mm2.c1) v3Var.P0(mm2.c1.class)).f328852o, ((mm2.e1) v3Var.P0(mm2.e1.class)).f328988r.getLong(0), q7Var.getString(1));
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.content.Context context = v3Var.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo = this.f112893f;
        kotlin.jvm.internal.o.f(jumpInfo, "$jumpInfo");
        r45.l34 l34Var = new r45.l34();
        l34Var.set(1, java.lang.Boolean.TRUE);
        xc2.y2 y2Var = xc2.y2.f453343a;
        xc2.p0 p0Var = new xc2.p0(jumpInfo);
        p0Var.f453238c = l34Var;
        xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$insertCommonInfoPanel$1$4$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
