package rc4;

/* loaded from: classes2.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f394129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c50.w0 f394130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f394131f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c50.v0 f394132g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.jb f394133h;

    public b(yz5.a aVar, c50.w0 w0Var, android.content.Context context, c50.v0 v0Var, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        this.f394129d = aVar;
        this.f394130e = w0Var;
        this.f394131f = context;
        this.f394132g = v0Var;
        this.f394133h = jbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Object obj;
        java.lang.String str;
        java.lang.String str2;
        jz5.f0 f0Var;
        boolean z17;
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$attachFinderTierView$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/finder/FinderTierManager$attachFinderTierView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f394129d.invoke();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getReportData$p", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        java.util.ArrayList arrayList2 = rc4.e.f394140e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getReportData$p", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            rc4.a aVar = (rc4.a) obj;
            aVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIndicator", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            long j17 = aVar.f394121a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIndicator", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getFinderTierId$p", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
            long j18 = rc4.e.f394139d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getFinderTierId$p", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
            if (j17 == j18) {
                break;
            }
        }
        rc4.a aVar2 = (rc4.a) obj;
        if (aVar2 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            int i17 = aVar2.f394123c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            aVar2.f394123c = i17 + 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        }
        java.lang.String finderContextId = this.f394132g.f38623d;
        c61.h9 h9Var = (c61.h9) this.f394130e;
        h9Var.getClass();
        android.content.Context context = this.f394131f;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(finderContextId, "finderContextId");
        com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo = this.f394133h;
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        r45.sf6 Ai = h9Var.Ai(ctrlInfo);
        long j19 = Ai.getLong(0);
        android.content.Intent intent = new android.content.Intent();
        r45.xs2 xs2Var = ctrlInfo.N;
        int integer = xs2Var.getInteger(9);
        cl0.g gVar = new cl0.g();
        java.lang.String str3 = ctrlInfo.field_ctrInfo.f388503x;
        if (str3 == null) {
            str3 = "";
        }
        gVar.h("tips_uuid", str3);
        intent.putExtra("key_extra_info", gVar.toString());
        if (integer == 6) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 37, 25, intent);
            intent.putExtra("feed_object_id", Ai.getLong(0));
            intent.putExtra("streamtabtipsinfo", Ai.toByteArray());
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).uk(context, intent, false);
            str2 = "onClick";
            str = "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$attachFinderTierView$3";
        } else {
            pf5.u uVar = pf5.u.f353936a;
            str = "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$attachFinderTierView$3";
            androidx.lifecycle.c1 a17 = uVar.e(c61.l7.class).a(ey2.t0.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ey2.o0 N6 = ((ey2.t0) a17).N6(xs2Var.getInteger(9));
            zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
            str2 = "onClick";
            ey2.h hVar = (ey2.h) uVar.e(c61.l7.class).a(ey2.h.class);
            hVar.getClass();
            com.tencent.mars.xlog.Log.i("Finder.AlternateRedDotVM", "[markNeed] scene=22");
            hVar.f257383f = 22;
            r45.vs2 vs2Var = ctrlInfo.field_ctrInfo;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[markSnsCtrlInfo] ctrlInfo=");
            sb6.append(vs2Var != null ? vs2Var.f388490h : null);
            sb6.append(" show_infos=");
            sb6.append((vs2Var == null || (linkedList = vs2Var.f388489g) == null) ? null : java.lang.Integer.valueOf(linkedList.size()));
            sb6.append(", localCtrlInfo=");
            sb6.append(ctrlInfo.field_tipsId);
            sb6.append('_');
            sb6.append(ctrlInfo.field_tips_uuid);
            com.tencent.mars.xlog.Log.i("Finder.AlternateRedDotVM", sb6.toString());
            if (vs2Var != null) {
                hVar.f257385h = ctrlInfo;
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                hVar.f257385h = null;
            }
            hVar.P6(nk6.L0("FinderEntrance"));
            nk6.N("FinderEntrance");
            nk6.a0(ctrlInfo);
            com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(j19);
            bs2.n1 R6 = ((com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class)).R6(integer);
            if (R6 != null) {
                R6.e(true, "Finder.SnsDeliveryBubbleService");
            }
            N6.a(ey2.q0.f257472e);
            N6.f257448h = 0L;
            if (h17 != null) {
                java.util.List list = N6.f257443c;
                com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p(h17);
                p17.c2(true);
                r45.hl2 client_local_buffer = p17.getFeedObject().getFeedObject().getClient_local_buffer();
                if ((client_local_buffer != null ? client_local_buffer.getLong(0) : 0L) <= 0) {
                    ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).uk(p17.getFeedObject().getFeedObject());
                }
                list.add(0, p17);
                intent.putExtra("isEnableShowUnreadFeed", true);
                com.tencent.mars.xlog.Log.i("Finder.SnsDeliveryBubbleService", "use cached feed to unreadList");
            } else {
                com.tencent.mars.xlog.Log.i("Finder.SnsDeliveryBubbleService", "without cache force to refresh.");
                intent.putExtra("isEnableShowUnreadFeed", false);
            }
            com.tencent.mars.xlog.Log.i("Finder.SnsDeliveryBubbleService", "[enterFinder] " + pm0.v.u(j19) + " tabType=" + integer);
            if (integer == 1) {
                z17 = true;
                intent.putExtra("KEY_FINDER_JUMP_FRIEND_TAB", true);
            } else if (integer != 3) {
                intent.putExtra("KEY_FINDER_JUMP_HOT_TAB", true);
                zy2.fa.y0(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk(), 7, null, null, 6, null);
                z17 = true;
            } else {
                z17 = true;
                intent.putExtra("KEY_FINDER_JUMP_FOLLOW_TAB", true);
            }
            if (h9Var.aj().getInteger(8) == 0) {
                intent.putExtra("KEY_BACK_TO_NORMAL", z17);
            }
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Cj(finderContextId, intent);
            intent.putExtra("KEY_FROM_PATH", "from_sns");
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.ub.L7((c61.ub) c17, context, intent, 0, false, 12, null);
        }
        java.lang.String str4 = str2;
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/finder/FinderTierManager$attachFinderTierView$3", "android/view/View$OnClickListener", str4, "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str);
    }
}
