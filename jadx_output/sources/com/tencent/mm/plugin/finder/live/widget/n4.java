package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class n4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q4 f119154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f119155e;

    public n4(com.tencent.mm.plugin.finder.live.widget.q4 q4Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        this.f119154d = q4Var;
        this.f119155e = finderObject;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterReplayWidget$showUIV1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.q4 q4Var = this.f119154d;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f119155e;
        com.tencent.mm.plugin.finder.live.widget.q4.a(q4Var, finderObject);
        q4Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.finder.live.plugin.oo0 oo0Var = q4Var.f119485b;
        hashMap.put("finder_username", oo0Var.Y().f410646a);
        hashMap.put("liveid", java.lang.String.valueOf(oo0Var.Y().f410659n.getLong(0)));
        hashMap.put("ref_objectid", java.lang.String.valueOf(finderObject.getId()));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.f328011z2;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        zy2.zb.T8(zbVar, t1Var, hashMap, b17, "1002", null, null, false, 112, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterReplayWidget$showUIV1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
