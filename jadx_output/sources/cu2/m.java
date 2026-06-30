package cu2;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final cu2.m f222420a = new cu2.m();

    public static final void e(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, zy2.gc gcVar) {
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        hb2.b0.f280025e.q(baseFinderFeed.getFeedObject().getId(), baseFinderFeed.getFeedObject().getFeedObject(), baseFinderFeed.getFeedObject().getObjectNonceId(), true, gcVar);
    }

    public final void a(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, zy2.gc gcVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(context);
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentLogic", "anchorModifyFeedComment feed:" + java.lang.System.identityHashCode(feed) + " FinderItem:" + java.lang.System.identityHashCode(feed.getFeedObject()) + " FinderObject:" + java.lang.System.identityHashCode(feed.getFeedObject().getFeedObject()) + ",id:" + pm0.v.u(feed.getItemId()) + ",commentClose=" + feed.getFeedObject().getFeedObject().getCommentClose() + ",isClose=" + feed.getFeedObject().isCommentClose() + ",funcFlag:" + feed.getFeedObject().getFeedObject().getFunc_flag() + ",isChoose:" + feed.getFeedObject().isChosenComment());
        e3Var.a();
        e3Var.f(com.tencent.mm.R.layout.e6y);
        android.widget.TextView textView = (android.widget.TextView) e3Var.f131959f.findViewById(com.tencent.mm.R.id.obc);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        android.view.View findViewById = e3Var.f131959f.findViewById(com.tencent.mm.R.id.lcp);
        android.view.View findViewById2 = findViewById.findViewById(com.tencent.mm.R.id.uve);
        android.view.View findViewById3 = e3Var.f131959f.findViewById(com.tencent.mm.R.id.v2k);
        android.view.View findViewById4 = findViewById3.findViewById(com.tencent.mm.R.id.f486806v26);
        android.view.View findViewById5 = e3Var.f131959f.findViewById(com.tencent.mm.R.id.q3w);
        android.view.View findViewById6 = findViewById5.findViewById(com.tencent.mm.R.id.f483763st4);
        findViewById.setOnClickListener(new cu2.c(feed, findViewById2, findViewById4, findViewById6, e3Var, context));
        findViewById3.setOnClickListener(new cu2.e(feed, findViewById2, findViewById4, findViewById6, e3Var, context));
        findViewById5.setOnClickListener(new cu2.g(feed, findViewById2, findViewById4, findViewById6, e3Var, context));
        if (feed.getFeedObject().isCommentClose()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById6, arrayList.toArray(), "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic", "anchorModifyFeedComment", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/findersdk/api/IModifyUserResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic", "anchorModifyFeedComment", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/findersdk/api/IModifyUserResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (feed.getFeedObject().isChosenComment()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic", "anchorModifyFeedComment", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/findersdk/api/IModifyUserResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic", "anchorModifyFeedComment", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/findersdk/api/IModifyUserResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic", "anchorModifyFeedComment", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/findersdk/api/IModifyUserResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic", "anchorModifyFeedComment", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/findersdk/api/IModifyUserResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        e3Var.i();
    }

    public final void b(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, zy2.gc gcVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        if (z17) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.b0.f280025e.o(feed.getFeedObject().getId(), feed.getFeedObject().getFeedObject(), feed.getFeedObject().getObjectNonceId(), r45.uh2.OpenComment, gcVar);
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        k0Var.Z1 = true;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488793ag3, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487334ob5)).setText(context.getResources().getString(com.tencent.mm.R.string.cnw));
        k0Var.s(inflate, false);
        k0Var.f211872n = new cu2.h(context);
        k0Var.f211881s = new cu2.i(feed, gcVar);
        k0Var.v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x020d, code lost:
    
        if ((r0 != null && r0.getInteger(3) == 1) != false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.finder.storage.yj0 c(long r18, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.Long r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, int r29, long r30, boolean r32, com.tencent.mm.protocal.protobuf.FinderCommentInfo r33, r45.qt2 r34, int r35, java.util.List r36, java.util.LinkedList r37, int r38, cu2.a r39, r45.e60 r40) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cu2.m.c(long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, boolean, com.tencent.mm.protocal.protobuf.FinderCommentInfo, r45.qt2, int, java.util.List, java.util.LinkedList, int, cu2.a, r45.e60):com.tencent.mm.plugin.finder.storage.yj0");
    }

    public final void d(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, zy2.gc gcVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        if (!z17) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.b0.f280025e.q(feed.getFeedObject().getId(), feed.getFeedObject().getFeedObject(), feed.getFeedObject().getObjectNonceId(), false, gcVar);
            return;
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_ACCOUNT_FINDER_ANCHOR_HIDE_NOTICE_GUIDE_SHOWN_BOOLEAN_SYNC;
        java.lang.Object m17 = c17.m(u3Var, java.lang.Boolean.FALSE);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        if (((java.lang.Boolean) m17).booleanValue()) {
            e(feed, gcVar);
            return;
        }
        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.finder.view.c cVar = new com.tencent.mm.plugin.finder.view.c(context);
        cVar.f131741h = new cu2.j(feed, gcVar);
        cVar.w();
    }
}
