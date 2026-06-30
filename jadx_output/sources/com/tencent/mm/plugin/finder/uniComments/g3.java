package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class g3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.q3 f130250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.a5 f130251e;

    public g3(com.tencent.mm.plugin.finder.uniComments.q3 q3Var, com.tencent.mm.plugin.finder.uniComments.a5 a5Var) {
        this.f130250d = q3Var;
        this.f130251e = a5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList linkedList;
        com.tencent.mm.protocal.protobuf.FinderCommentInfo u07;
        jv2.c cVar;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter$onAttach$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f130251e.l().getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String();
        com.tencent.mm.plugin.finder.uniComments.q3 q3Var = this.f130250d;
        com.tencent.mm.plugin.finder.view.FinderCommentEditText p17 = q3Var.p();
        android.text.Editable text = p17 != null ? p17.getText() : null;
        if (!(text == null || text.length() == 0)) {
            if (q3Var.f130371h == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            java.lang.CharSequence u08 = r26.n0.u0(text);
            if (!(u08 == null || u08.length() == 0)) {
                java.lang.String b17 = hc2.l.b(text.toString());
                com.tencent.mm.plugin.finder.view.FinderCommentEditText p18 = q3Var.p();
                if (p18 != null) {
                    if (q3Var.f130371h == null) {
                        kotlin.jvm.internal.o.o("feedObj");
                        throw null;
                    }
                    linkedList = p18.u(r7.f295130f);
                } else {
                    linkedList = null;
                }
                if (linkedList != null) {
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        hc2.l.b((java.lang.String) it.next());
                    }
                }
                com.tencent.mm.plugin.finder.view.FinderCommentEditText p19 = q3Var.p();
                java.lang.Object tag = p19 != null ? p19.getTag() : null;
                android.content.Context context = q3Var.f130367d;
                if (tag == null) {
                    ev2.h hVar = ev2.h.f256910c;
                    long c17 = c01.id.c();
                    iv2.b bVar = q3Var.f130371h;
                    if (bVar == null) {
                        kotlin.jvm.internal.o.o("feedObj");
                        throw null;
                    }
                    long j17 = bVar.f295130f;
                    java.lang.String username = hc2.t.c(context, i17);
                    java.lang.String b18 = hc2.t.b(context, i17);
                    com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer uniCommentDrawer = q3Var.A;
                    int i18 = uniCommentDrawer != null ? uniCommentDrawer.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON java.lang.String() : 0;
                    iv2.b bVar2 = q3Var.f130371h;
                    if (bVar2 == null) {
                        kotlin.jvm.internal.o.o("feedObj");
                        throw null;
                    }
                    hVar.getClass();
                    java.lang.String feedUsername = bVar.f295129e;
                    kotlin.jvm.internal.o.g(feedUsername, "feedUsername");
                    java.lang.String objectNonceId = bVar.f295131g;
                    kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
                    kotlin.jvm.internal.o.g(username, "username");
                    hVar.a(c17, feedUsername, j17, objectNonceId, b17, feedUsername, "", null, null, username, b18, i17, false, null, i18, linkedList, bVar2);
                    com.tencent.mm.plugin.finder.uniComments.a5 a5Var = q3Var.f130373m;
                    if (a5Var != null && (recyclerView = a5Var.s().getRecyclerView()) != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter", "onReply", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                        recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter", "onReply", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                    }
                    com.tencent.mm.plugin.finder.uniComments.a5 a5Var2 = q3Var.f130373m;
                    if (a5Var2 != null) {
                        com.tencent.mm.view.RefreshLoadMoreLayout.r(a5Var2.s(), false, null, com.tencent.mm.plugin.finder.uniComments.j3.f130275d, 3, null);
                    }
                } else {
                    com.tencent.mm.plugin.finder.view.FinderCommentEditText p27 = q3Var.p();
                    java.lang.Object tag2 = p27 != null ? p27.getTag() : null;
                    kotlin.jvm.internal.o.e(tag2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.uniComments.storge.LocalUniCommentObject");
                    jv2.c cVar2 = (jv2.c) tag2;
                    if (cVar2.J0() == 0) {
                        u07 = cVar2.u0();
                    } else {
                        jv2.i s17 = q3Var.s(cVar2.J0());
                        u07 = (s17 == null || (cVar = s17.f302223d) == null) ? null : cVar.u0();
                    }
                    if (u07 != null) {
                        u07.setExpandCommentCount(u07.getExpandCommentCount() + 1);
                        ev2.h hVar2 = ev2.h.f256910c;
                        long c18 = c01.id.c();
                        iv2.b bVar3 = q3Var.f130371h;
                        if (bVar3 == null) {
                            kotlin.jvm.internal.o.o("feedObj");
                            throw null;
                        }
                        java.lang.String str = bVar3.f295129e;
                        long j18 = bVar3.f295130f;
                        java.lang.String str2 = bVar3.f295131g;
                        java.lang.String L0 = cVar2.L0();
                        java.lang.String D0 = cVar2.D0();
                        java.lang.Long valueOf = java.lang.Long.valueOf(cVar2.t0());
                        java.lang.String j19 = cVar2.j();
                        java.lang.String c19 = hc2.t.c(context, i17);
                        java.lang.String b19 = hc2.t.b(context, i17);
                        boolean P0 = cVar2.P0();
                        com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer uniCommentDrawer2 = q3Var.A;
                        int i19 = uniCommentDrawer2 != null ? uniCommentDrawer2.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON java.lang.String() : 0;
                        iv2.b bVar4 = q3Var.f130371h;
                        if (bVar4 == null) {
                            kotlin.jvm.internal.o.o("feedObj");
                            throw null;
                        }
                        hVar2.a(c18, str, j18, str2, b17, L0, D0, valueOf, j19, c19, b19, i17, P0, u07, i19, linkedList, bVar4);
                    }
                }
                com.tencent.mm.plugin.finder.uniComments.a5 a5Var3 = q3Var.f130373m;
                if (a5Var3 != null) {
                    com.tencent.mm.plugin.finder.uniComments.UniCommentFooter l17 = a5Var3.l();
                    int i27 = l17.footerMode;
                    if (i27 == 1) {
                        l17.j(true);
                    } else if (i27 == 2) {
                        l17.m(false);
                    }
                }
                com.tencent.mm.plugin.finder.view.FinderCommentEditText p28 = q3Var.p();
                if (p28 != null) {
                    p28.setText((java.lang.CharSequence) null);
                }
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter$onAttach$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
        if (q3Var.f130378r) {
            com.tencent.mm.plugin.finder.uniComments.a5 a5Var4 = q3Var.f130373m;
            if (a5Var4 != null) {
                a5Var4.h().u();
            }
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer uniCommentDrawer3 = q3Var.A;
            if (uniCommentDrawer3 != null) {
                uniCommentDrawer3.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON java.lang.String();
            }
        } else {
            com.tencent.mm.plugin.finder.uniComments.a5 a5Var5 = q3Var.f130373m;
            if (a5Var5 != null) {
                a5Var5.q().setVisibility(8);
                android.view.View r17 = a5Var5.r();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(r17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                r17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(r17, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "hideAllTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a5Var5.p().setVisibility(8);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawerPresenter$onAttach$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
