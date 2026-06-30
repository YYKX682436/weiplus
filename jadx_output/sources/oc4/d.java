package oc4;

/* loaded from: classes4.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView f344336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f344337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f344338f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xc4.p f344339g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC f344340h;

    public d(com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView improveUnreadTierView, int i17, int i18, xc4.p pVar, com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC) {
        this.f344336d = improveUnreadTierView;
        this.f344337e = i17;
        this.f344338f = i18;
        this.f344339g = pVar;
        this.f344340h = improveDataUIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        oc4.v vVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$showUnreadTierView$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/component/unread/ImproveUnreadTierView$showUnreadTierView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView.f169003i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getHolder$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView improveUnreadTierView = this.f344336d;
        in5.s0 s0Var = improveUnreadTierView.f169007g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getHolder$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        i64.u1.a(204, (s0Var != null ? s0Var.getAdapterPosition() : 0) - 1);
        rc4.e eVar = rc4.e.f394136a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUnreadTierClicked", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        rc4.e.f394143h = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUnreadTierClicked", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        int i18 = this.f344337e;
        int i19 = i18 - this.f344338f;
        android.content.Context context = improveUnreadTierView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC improveUnreadUIC = (com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC.class);
        improveUnreadUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unreadBtnClick", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        xc4.p info = this.f344339g;
        kotlin.jvm.internal.o.g(info, "info");
        improveUnreadUIC.f169021q++;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unreadBtnClickReport", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        oc4.v vVar2 = improveUnreadUIC.f169015h;
        if (vVar2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unreadBtnClickReport", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            str = "onClick";
            str2 = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$showUnreadTierView$2";
            vVar = null;
        } else {
            com.tencent.mm.autogen.mmdata.rpt.TimelineMissReadJumpBtnClickActionStruct timelineMissReadJumpBtnClickActionStruct = new com.tencent.mm.autogen.mmdata.rpt.TimelineMissReadJumpBtnClickActionStruct();
            timelineMissReadJumpBtnClickActionStruct.f61260d = timelineMissReadJumpBtnClickActionStruct.b("SessionId", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni(), true);
            timelineMissReadJumpBtnClickActionStruct.f61261e = info.y0();
            timelineMissReadJumpBtnClickActionStruct.f61262f = ca4.z0.F0((java.lang.String) kz5.n0.X(vVar2.a()));
            timelineMissReadJumpBtnClickActionStruct.f61263g = 1L;
            timelineMissReadJumpBtnClickActionStruct.f61264h = i19;
            timelineMissReadJumpBtnClickActionStruct.f61267k = timelineMissReadJumpBtnClickActionStruct.b("JumpBreakLayerExposureFeeds", "", true);
            com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
            if ((Fj != null ? Fj.n1((java.lang.String) kz5.n0.X(vVar2.a())) : null) != null) {
                timelineMissReadJumpBtnClickActionStruct.f61268l = java.lang.System.currentTimeMillis() - r3.getCreateTime();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i27 = 0;
            for (java.lang.Object obj : vVar2.a()) {
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                sb6.append((java.lang.String) obj);
                sb6.append("|");
                if (i27 != 0 && (i27 % 50 == 0 || i27 == improveUnreadUIC.f169018n.size() - 1)) {
                    arrayList2.add(sb6.toString());
                    r26.e0.d(sb6);
                }
                i27 = i28;
            }
            str = "onClick";
            str2 = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$showUnreadTierView$2";
            timelineMissReadJumpBtnClickActionStruct.f61269m = java.lang.System.currentTimeMillis();
            int size = arrayList2.size();
            for (int i29 = 0; i29 < size; i29++) {
                timelineMissReadJumpBtnClickActionStruct.f61265i = timelineMissReadJumpBtnClickActionStruct.b("JumpBreakLayerFeeds", (java.lang.String) arrayList2.get(i29), true);
                kotlin.jvm.internal.o.f(arrayList2.get(i29), "get(...)");
                timelineMissReadJumpBtnClickActionStruct.f61266j = r26.n0.f0((java.lang.CharSequence) r12, new java.lang.String[]{"|"}, false, 0, 6, null).size() - 1;
                timelineMissReadJumpBtnClickActionStruct.f61270n = i29;
                timelineMissReadJumpBtnClickActionStruct.f61271o = size;
                timelineMissReadJumpBtnClickActionStruct.k();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unreadBtnClickReport", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            vVar = null;
        }
        improveUnreadUIC.Z6(vVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unreadBtnClick", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        if (i18 > 0) {
            new com.tencent.mm.autogen.events.SnsClickUnreadBtnEvent().e();
            com.tencent.mm.autogen.events.SnsScrollEvent snsScrollEvent = new com.tencent.mm.autogen.events.SnsScrollEvent();
            snsScrollEvent.f54838g.f8140a = i18 + 1;
            snsScrollEvent.e();
        } else {
            com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC = this.f344340h;
            improveDataUIC.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeToUnreadData", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            java.util.ArrayList b17 = improveDataUIC.f168767e.b();
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataUIC", "changeToUnreadData size:" + b17.size());
            java.util.Iterator it = b17.iterator();
            int i37 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i38 = i37 + 1;
                if (i37 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataUIC", "index:" + i37 + "  value:" + ((zc4.b) next).n());
                i37 = i38;
            }
            if (!b17.isEmpty()) {
                improveDataUIC.T6().d7(com.tencent.mm.plugin.sns.ui.improve.component.p0.f168969e, true);
                com.tencent.mm.plugin.mvvmlist.MvvmList S6 = improveDataUIC.S6();
                lc4.f fVar = new lc4.f(b17);
                S6.getClass();
                v65.i.b(S6.f152060g, null, new xm3.i0(fVar, S6, false, null), 1, null);
                improveDataUIC.S6().d(new lc4.g(improveDataUIC));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeToUnreadData", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/component/unread/ImproveUnreadTierView$showUnreadTierView$2", "android/view/View$OnClickListener", str, "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }
}
