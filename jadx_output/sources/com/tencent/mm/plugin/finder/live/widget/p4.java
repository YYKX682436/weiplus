package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class p4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q4 f119353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f119354e;

    public p4(com.tencent.mm.plugin.finder.live.widget.q4 q4Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        this.f119353d = q4Var;
        this.f119354e = finderObject;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterReplayWidget$showUIV2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f119354e;
        com.tencent.mm.plugin.finder.live.widget.q4 q4Var = this.f119353d;
        com.tencent.mm.plugin.finder.live.widget.q4.a(q4Var, finderObject);
        com.tencent.mars.xlog.Log.i(q4Var.f119486c, "report v2 clicked");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("liveid", java.lang.String.valueOf(q4Var.f119485b.Y().f410659n.getLong(0)));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.U2;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        java.lang.String str = b17;
        ml2.q1 q1Var = ml2.q1.f327812e;
        zy2.zb.T8(zbVar, t1Var, hashMap, str, "temp_30", null, null, false, 112, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterReplayWidget$showUIV2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
