package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class NewSnsLabelUI extends com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI implements zd4.p {
    public static final /* synthetic */ int P = 0;
    public com.tencent.mm.plugin.sns.ui.v6 H;
    public com.tencent.mm.plugin.sns.ui.NewSnsLabelUI.ReturnSnsObjectDetailEventListener I;
    public boolean E = false;
    public int F = -1;
    public java.lang.Long G = -1L;

    /* renamed from: J, reason: collision with root package name */
    public long f166406J = 0;
    public boolean K = false;
    public final com.tencent.mm.sdk.event.IListener L = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsPostInfoEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.sns.ui.NewSnsLabelUI.1
        {
            this.__eventId = 1901115748;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.SnsPostInfoEvent snsPostInfoEvent) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$1");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$1");
            long j17 = snsPostInfoEvent.f54830g.f7374b;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on sns post success, postId = ");
            sb6.append(j17);
            sb6.append(", sns local id = ");
            int i17 = com.tencent.mm.plugin.sns.ui.NewSnsLabelUI.P;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            com.tencent.mm.plugin.sns.ui.NewSnsLabelUI newSnsLabelUI = com.tencent.mm.plugin.sns.ui.NewSnsLabelUI.this;
            int i18 = newSnsLabelUI.F;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            sb6.append(i18);
            com.tencent.mars.xlog.Log.i("MicroMsg.NewSnsLabelUI", sb6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            int i19 = newSnsLabelUI.F;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            if (i19 == j17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                boolean z17 = newSnsLabelUI.K;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                if (z17) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                    newSnsLabelUI.m7();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$1");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$1");
            return false;
        }
    };
    public long M = 0;
    public long N = 0;

    /* loaded from: classes4.dex */
    public static class ReturnSnsObjectDetailEventListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ReturnSnsObjectDetailEvent> {

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.ref.WeakReference f166408d;

        public ReturnSnsObjectDetailEventListener(com.tencent.mm.ui.MMActivity mMActivity) {
            super(com.tencent.mm.app.a0.f53288d);
            this.f166408d = new java.lang.ref.WeakReference(mMActivity);
            this.__eventId = -1656522510;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.ReturnSnsObjectDetailEvent returnSnsObjectDetailEvent) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener");
            com.tencent.mm.autogen.events.ReturnSnsObjectDetailEvent returnSnsObjectDetailEvent2 = returnSnsObjectDetailEvent;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener");
            boolean z17 = false;
            if (returnSnsObjectDetailEvent2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener");
            } else {
                java.lang.ref.WeakReference weakReference = this.f166408d;
                com.tencent.mm.plugin.sns.ui.NewSnsLabelUI newSnsLabelUI = (weakReference == null || weakReference.get() == null || !(weakReference.get() instanceof com.tencent.mm.plugin.sns.ui.NewSnsLabelUI)) ? null : (com.tencent.mm.plugin.sns.ui.NewSnsLabelUI) weakReference.get();
                if (newSnsLabelUI == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NewSnsLabelUI", "ReturnSnsObjectDetailEvent callback, but NewSnsLabelUI not alive !!");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener");
                } else {
                    com.tencent.mm.protocal.protobuf.SnsObject snsObject = returnSnsObjectDetailEvent2.f54711g.f6185a;
                    if (snsObject != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NewSnsLabelUI", "ReturnSnsObjectDetailEvent callback, snsobject id:%s", java.lang.Long.valueOf(snsObject.Id));
                        int i17 = com.tencent.mm.plugin.sns.ui.NewSnsLabelUI.P;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                        newSnsLabelUI.o7(snsObject);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshAdapter", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        com.tencent.mm.plugin.sns.ui.xk xkVar = newSnsLabelUI.f170683q;
                        int i18 = newSnsLabelUI.f170685s;
                        xkVar.f171540k = i18;
                        if (newSnsLabelUI.f170684r.o(i18, 2)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "refreshAdapter: SavedSelect:%d, expand INCLUDE", java.lang.Integer.valueOf(newSnsLabelUI.f170685s));
                            newSnsLabelUI.f170674e.expandGroup(newSnsLabelUI.f170684r.i(2));
                        } else if (newSnsLabelUI.f170684r.o(newSnsLabelUI.f170683q.f171540k, 3)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "refreshAdapter: SavedSelect:%d, expand EXCLUDE", java.lang.Integer.valueOf(newSnsLabelUI.f170685s));
                            newSnsLabelUI.f170674e.expandGroup(newSnsLabelUI.f170684r.i(3));
                        }
                        newSnsLabelUI.f170683q.notifyDataSetChanged();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshAdapter", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                    } else {
                        db5.e1.t(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f493213jb4), "", new com.tencent.mm.plugin.sns.ui.w6(this, newSnsLabelUI));
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener");
                    z17 = true;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener");
            return z17;
        }
    }

    @Override // zd4.p
    public boolean A6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initFromFeedInfo", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        gm0.j1.i();
        gm0.j1.n().f273288b.a(218, this.H);
        com.tencent.mm.autogen.events.GetSnsObjectDetailEvent getSnsObjectDetailEvent = new com.tencent.mm.autogen.events.GetSnsObjectDetailEvent();
        getSnsObjectDetailEvent.f54410g.f7247a = this.F;
        getSnsObjectDetailEvent.e();
        com.tencent.mm.protocal.protobuf.SnsObject snsObject = getSnsObjectDetailEvent.f54411h.f7347a;
        if (snsObject == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewSnsLabelUI", "[initFromFeedInfo] get snsObject null,try request objectdetail, show loading");
            n7();
        }
        boolean o76 = o7(snsObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initFromFeedInfo", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        return o76;
    }

    @Override // zd4.p
    public boolean C6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNeedDynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        boolean z17 = this.E;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNeedDynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        return z17;
    }

    @Override // zd4.p
    public boolean I3() {
        boolean z17;
        int i17;
        java.util.Iterator it;
        java.util.Iterator it6;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.NewSnsLabelUI", "dynamicChangeVisibleRange start");
        n7();
        com.tencent.mm.plugin.sns.storage.SnsInfo i18 = com.tencent.mm.plugin.sns.model.l4.Fj().i1(this.F);
        long j17 = i18 == null ? 0L : i18.field_snsId;
        this.G = java.lang.Long.valueOf(j17);
        if (j17 != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeVisible", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            r45.p96 p96Var = new r45.p96();
            if (this.f170684r.o(this.f170683q.f171540k, 2)) {
                p96Var.f382899o = 3;
                p96Var.f382895h = this.f170683q.f171545p.size();
                java.util.Iterator it7 = this.f170683q.f171545p.iterator();
                while (it7.hasNext()) {
                    p96Var.f382896i.add(x51.j1.i((java.lang.String) it7.next()));
                }
                p96Var.f382897m = this.f170683q.f171543n.size();
                java.util.Iterator it8 = this.f170683q.f171543n.iterator();
                i17 = 0;
                while (it8.hasNext()) {
                    java.lang.String str = (java.lang.String) it8.next();
                    try {
                        p96Var.f382898n.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
                        it6 = it8;
                    } catch (java.lang.Exception e17) {
                        it6 = it8;
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NewSnsLabelUI", e17, "SnsObjectOpChangeVisibility parse error", new java.lang.Object[0]);
                    }
                    com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
                    int i19 = this.f170683q.f171540k;
                    s0Var.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSearchLabelOfDynaLabel", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                    java.util.Set w17 = s0Var.w(i19);
                    boolean z18 = w17 != null && w17.contains(str);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSearchLabelOfDynaLabel", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                    if (z18) {
                        i17++;
                    }
                    it8 = it6;
                }
                com.tencent.mm.plugin.sns.statistics.s0.f164937k0.B().M = i17;
            } else if (this.f170684r.o(this.f170683q.f171540k, 3)) {
                p96Var.f382899o = 4;
                p96Var.f382891d = this.f170683q.f171546q.size();
                java.util.Iterator it9 = this.f170683q.f171546q.iterator();
                while (it9.hasNext()) {
                    p96Var.f382892e.add(x51.j1.i((java.lang.String) it9.next()));
                }
                p96Var.f382893f = this.f170683q.f171544o.size();
                java.util.Iterator it10 = this.f170683q.f171544o.iterator();
                i17 = 0;
                while (it10.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it10.next();
                    try {
                        p96Var.f382894g.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2)));
                        it = it10;
                    } catch (java.lang.Exception e18) {
                        it = it10;
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NewSnsLabelUI", e18, "SnsObjectOpChangeVisibility parse error", new java.lang.Object[0]);
                    }
                    com.tencent.mm.plugin.sns.statistics.s0 s0Var2 = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
                    int i27 = this.f170683q.f171540k;
                    s0Var2.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSearchLabelOfDynaLabel", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                    java.util.Set w18 = s0Var2.w(i27);
                    boolean z19 = w18 != null && w18.contains(str2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSearchLabelOfDynaLabel", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                    if (z19) {
                        i17++;
                    }
                    it10 = it;
                }
                com.tencent.mm.plugin.sns.statistics.s0.f164937k0.B().M = i17;
            } else {
                if (this.f170684r.o(this.f170683q.f171540k, 0)) {
                    p96Var.f382899o = 1;
                } else if (this.f170684r.o(this.f170683q.f171540k, 1)) {
                    p96Var.f382899o = 2;
                }
                i17 = 0;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NewSnsLabelUI", "dynamicChangeVisibleRange: selectVisibleState:%d， matchLabelCountFromSearch:%d", java.lang.Integer.valueOf(this.f170683q.f171540k), java.lang.Integer.valueOf(i17));
            com.tencent.mars.xlog.Log.i("MicroMsg.NewSnsLabelUI", "dynamicChangeVisibleRange opChangeVisibility:%s", " OpType:" + p96Var.f382899o + " GroupUserCount:" + p96Var.f382895h + " BlackListCount:" + p96Var.f382891d + " BlackContactTagIdListCount:" + p96Var.f382893f + " GroupContactTagIdListCount:" + p96Var.f382897m);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateInTransform", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            this.f170687u = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateInTransform", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            com.tencent.mm.plugin.sns.model.q2 q2Var = new com.tencent.mm.plugin.sns.model.q2(j17, p96Var);
            oi0.e.f345591d.f(j17, p96Var);
            gm0.j1.i();
            gm0.j1.n().f273288b.g(q2Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeVisible", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            this.K = false;
            z17 = true;
        } else {
            z17 = true;
            this.K = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI
    public zd4.o Z6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSelectVisibleResCollectorInstance", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        zd4.s sVar = new zd4.s();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSelectVisibleResCollectorInstance", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        return sVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI
    public android.content.Intent c7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectLabelIntent", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        android.content.Intent c76 = super.c7();
        c76.putExtra("contact_select_label_from_scene", 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectLabelIntent", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        return c76;
    }

    @Override // com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI
    public void g7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        super.g7();
        this.M = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI
    public void h7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gotoSelectLabel", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        super.h7();
        this.N = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gotoSelectLabel", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o7(com.tencent.mm.protocal.protobuf.SnsObject r14) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.NewSnsLabelUI.o7(com.tencent.mm.protocal.protobuf.SnsObject):boolean");
    }

    @Override // com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        super.onActivityResult(i17, i18, intent);
        if (i17 == 4003) {
            com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            long currentTimeMillis = s0Var.B().I + (java.lang.System.currentTimeMillis() - this.M);
            s0Var.B().I = currentTimeMillis;
            if (this.E && intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    s0Var.T(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(",")));
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NewSnsLabelUI", "setSelectFriendDuration %d", java.lang.Long.valueOf(currentTimeMillis));
        } else if (i17 == 4005) {
            com.tencent.mm.plugin.sns.statistics.s0 s0Var2 = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            long currentTimeMillis2 = s0Var2.B().L + (java.lang.System.currentTimeMillis() - this.N);
            s0Var2.B().L = currentTimeMillis2;
            if (this.E && intent != null) {
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("label_id");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSelectedLabelReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSelectedLabelReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                } else {
                    s0Var2.f164959l.f61256w += stringArrayListExtra.size();
                    com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct = s0Var2.f164959l;
                    timelineGroupUserBehaviorStruct.C = timelineGroupUserBehaviorStruct.b("SelectedLabelidList", com.tencent.mm.sdk.platformtools.t8.c1(stringArrayListExtra, ";"), true);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    for (java.lang.String str : stringArrayListExtra) {
                        java.util.List j17 = ((b93.b) c93.a.a()).j(str);
                        java.lang.String g17 = ((b93.b) c93.a.a()).g(str);
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsReportHelper", "select label:%s name:%s count:%d", str, g17, java.lang.Integer.valueOf(j17.size()));
                        sb6.append(g17);
                        sb6.append("|");
                        sb6.append(j17.size());
                        sb6.append(";");
                    }
                    com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct2 = s0Var2.f164959l;
                    timelineGroupUserBehaviorStruct2.f61257x = timelineGroupUserBehaviorStruct2.b("SelectedLabelList", sb6.toString(), true);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSelectedLabelReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NewSnsLabelUI", "setDynamicLabelDuration %d", java.lang.Long.valueOf(currentTimeMillis2));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        this.E = getIntent().hasExtra("key_from_sns_feed_id");
        this.F = getIntent().getIntExtra("key_from_sns_feed_id", -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.NewSnsLabelUI", "onCreate isFromFeedDialog:%b", java.lang.Boolean.valueOf(this.E));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        this.f170692z = this;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        this.H = new com.tencent.mm.plugin.sns.ui.v6(new java.lang.ref.WeakReference(this));
        com.tencent.mm.plugin.sns.ui.NewSnsLabelUI.ReturnSnsObjectDetailEventListener returnSnsObjectDetailEventListener = new com.tencent.mm.plugin.sns.ui.NewSnsLabelUI.ReturnSnsObjectDetailEventListener(this);
        this.I = returnSnsObjectDetailEventListener;
        returnSnsObjectDetailEventListener.alive();
        super.onCreate(bundle);
        if (this.E) {
            updateOptionMenuText(0, getString(com.tencent.mm.R.string.j_e));
        }
        this.L.alive();
        this.f166406J = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.NewSnsLabelUI", "onDestroy");
        gm0.j1.i();
        gm0.j1.n().f273288b.q(218, this.H);
        this.I.dead();
        this.L.dead();
        super.onDestroy();
        if (C6()) {
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.K();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.NewSnsLabelUI", "onResume");
        super.onResume();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        super.onStop();
        com.tencent.mars.xlog.Log.i("MicroMsg.NewSnsLabelUI", "onStop");
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.B().H = java.lang.System.currentTimeMillis() - this.f166406J;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
    }
}
