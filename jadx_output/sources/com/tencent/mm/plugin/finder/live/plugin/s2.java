package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f114207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f114208e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.plugin.v3 v3Var) {
        super(2, continuation);
        this.f114207d = hVar;
        this.f114208e = v3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.s2(this.f114207d, continuation, this.f114208e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.s2 s2Var = (com.tencent.mm.plugin.finder.live.plugin.s2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        s2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.h32 h32Var;
        java.util.LinkedList list;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.v71 v71Var = (r45.v71) ((xg2.i) this.f114207d).f454393b;
        r45.j32 j32Var = (r45.j32) v71Var.getCustom(4);
        if (j32Var == null || (list = j32Var.getList(0)) == null || (h32Var = (r45.h32) kz5.n0.Z(list)) == null) {
            h32Var = (r45.h32) v71Var.getCustom(1);
        }
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f114208e;
        android.view.View view = v3Var.B;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareNoticePanel$1$invokeSuspend$$inlined$success$default$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareNoticePanel$1$invokeSuspend$$inlined$success$default$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prepareNoticePanel: noticeId=");
        sb6.append(h32Var != null ? h32Var.getString(4) : null);
        com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", sb6.toString());
        if (h32Var == null) {
            v3Var.B.setOnClickListener(null);
            v3Var.C.setVisibility(0);
            android.view.View view2 = v3Var.D;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareNoticePanel$1$invokeSuspend$$inlined$success$default$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareNoticePanel$1$invokeSuspend$$inlined$success$default$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            v3Var.E.setText(v3Var.f113324f.getContext().getResources().getString(com.tencent.mm.R.string.f491441mi2));
            v3Var.C.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.p2(v3Var));
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            java.lang.String username = ((mm2.c1) v3Var.P0(mm2.c1.class)).f328852o;
            long j17 = ((mm2.e1) v3Var.P0(mm2.e1.class)).f328988r.getLong(0);
            r0Var.getClass();
            kotlin.jvm.internal.o.g(username, "username");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("finder_username", username);
            hashMap.put("liveId", java.lang.String.valueOf(j17));
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.u1 u1Var = ml2.u1.f328034b2;
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            if (b17 == null) {
                b17 = "";
            }
            zy2.zb.I8(zbVar, u1Var, hashMap, b17, "1002", null, null, false, 112, null);
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndLiveCreateNextNoticeExposed report23057, liveid = " + ((java.lang.String) hashMap.get("liveId")));
        } else {
            com.tencent.mm.plugin.finder.assist.a4.f102002a.a("", "", "", "notice_show", "");
            v3Var.C.setVisibility(8);
            android.view.View view3 = v3Var.D;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareNoticePanel$1$invokeSuspend$$inlined$success$default$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareNoticePanel$1$invokeSuspend$$inlined$success$default$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            v3Var.E.setText(zl2.q4.t(zl2.q4.f473933a, h32Var, com.tencent.mm.R.string.csf, false, false, true, 12, null));
            v3Var.B.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.q2(v3Var, h32Var));
        }
        v3Var.P1(true);
        return jz5.f0.f302826a;
    }
}
