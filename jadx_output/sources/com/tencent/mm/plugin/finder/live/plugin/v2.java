package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class v2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km2.b f114638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f114639e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(km2.b bVar, com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114638d = bVar;
        this.f114639e = v3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.v2(this.f114638d, this.f114639e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.v2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        km2.b bVar = this.f114638d;
        r45.nw1 nw1Var = bVar.f309070t;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f114639e;
        if (nw1Var == null) {
            com.tencent.mars.xlog.Log.e("Finder.LiveAnchorAfterPlugin", "prepareReplayPanel:info.liveInfo is null");
            android.view.View view = v3Var.f114648u;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareReplayPanel$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareReplayPanel$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return f0Var;
        }
        if (v3Var.f114648u.getVisibility() != 0) {
            android.view.View view2 = v3Var.f114648u;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareReplayPanel$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareReplayPanel$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        r45.nw1 nw1Var2 = bVar.f309070t;
        java.lang.Integer num = nw1Var2 != null ? new java.lang.Integer(nw1Var2.getInteger(31)) : null;
        r45.sl1 sl1Var = bVar.f309071u;
        java.lang.Integer num2 = sl1Var != null ? new java.lang.Integer(sl1Var.getInteger(0)) : null;
        com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "Setup replay panel with status:" + num + ", canBeCancelled:" + num2);
        v3Var.A.setText(v3Var.C1(true));
        v3Var.G1(((mm2.c1) v3Var.P0(mm2.c1.class)).t7(), v3Var.f114653z, -1);
        if (bVar.f309066p == 0 || (num != null && num.intValue() == 7)) {
            v3Var.f114649v.setVisibility(8);
            v3Var.f114650w.setVisibility(0);
            android.view.View view3 = v3Var.f114652y;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareReplayPanel$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareReplayPanel$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            v3Var.f114651x.setText(v3Var.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.nnx));
        } else if (num != null && num.intValue() == 3) {
            v3Var.f114649v.setVisibility(8);
            v3Var.f114650w.setVisibility(0);
            if (num2 != null && num2.intValue() == 1) {
                android.view.View view4 = v3Var.f114652y;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareReplayPanel$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareReplayPanel$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view5 = v3Var.f114652y;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareReplayPanel$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareReplayPanel$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            v3Var.f114651x.setText(v3Var.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.d3m));
        } else if (num != null && num.intValue() == 1) {
            v3Var.f114649v.setVisibility(8);
            v3Var.f114650w.setVisibility(0);
            android.view.View view6 = v3Var.f114652y;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareReplayPanel$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareReplayPanel$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            v3Var.f114651x.setText(v3Var.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.d3l));
        } else if (num != null && num.intValue() == 0) {
            v3Var.f114649v.setVisibility(0);
            v3Var.f114650w.setVisibility(8);
            ym5.a1.h(v3Var.f114649v, new com.tencent.mm.plugin.finder.live.plugin.u2());
        } else {
            com.tencent.mars.xlog.Log.w("Finder.LiveAnchorAfterPlugin", "Unknown replay status: " + num);
            v3Var.f114649v.setVisibility(8);
            v3Var.f114650w.setVisibility(8);
        }
        return f0Var;
    }
}
