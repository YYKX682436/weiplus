package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class so extends sb4.e {
    public java.lang.String C;
    public boolean D;
    public long E;
    public java.lang.String F;
    public final com.tencent.mm.plugin.sns.ui.vo G;
    public final com.tencent.mm.plugin.sns.ui.xo H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f170478J;
    public boolean K;
    public final com.tencent.mm.plugin.sns.ui.qu L;
    public int M;

    public so(boolean z17, android.app.Activity activity, sb4.v vVar, java.lang.String str, com.tencent.mm.plugin.sns.ui.ro roVar) {
        super(z17, activity, vVar, str);
        this.C = "";
        this.D = false;
        this.E = 0L;
        this.F = "";
        this.I = 0L;
        this.f170478J = false;
        this.K = false;
        this.M = 0;
        com.tencent.mm.plugin.sns.ui.qu quVar = new com.tencent.mm.plugin.sns.ui.qu(activity, str, this.f405462n);
        this.L = quVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
        if (cc4.b.f40482a.a()) {
            quVar.f170367j.alive();
        }
        quVar.f170363f = quVar.f170358a.getIntent().getIntExtra("sns_source", 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
        this.G = new com.tencent.mm.plugin.sns.ui.vo(new com.tencent.mm.plugin.sns.ui.po(this, roVar), str, this.f405462n);
        this.H = new com.tencent.mm.plugin.sns.ui.xo(new com.tencent.mm.plugin.sns.ui.qo(this, roVar), str, this.f405462n);
        S(0L);
        P(false);
    }

    public static /* synthetic */ boolean H(com.tencent.mm.plugin.sns.ui.so soVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        boolean z17 = soVar.f170478J;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return z17;
    }

    public static void I(com.tencent.mm.plugin.sns.ui.so soVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        soVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findOutCorrectRecentLimitId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        if (soVar.I != 0) {
            int i17 = 0;
            int i18 = 0;
            while (true) {
                java.util.ArrayList arrayList = (java.util.ArrayList) soVar.f405456e;
                if (i18 >= arrayList.size()) {
                    break;
                }
                long j17 = ((com.tencent.mm.plugin.sns.storage.SnsInfo) arrayList.get(i18)).field_snsId;
                if (j17 <= soVar.I) {
                    soVar.f405465q = j17;
                    i17 = i18;
                    break;
                }
                i18++;
            }
            if (i17 == 0 && !soVar.K) {
                soVar.f405465q = 0L;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findOutCorrectRecentLimitId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.qu J(com.tencent.mm.plugin.sns.ui.so soVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        com.tencent.mm.plugin.sns.ui.qu quVar = soVar.L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return quVar;
    }

    @Override // sb4.e
    public boolean A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSearchModeEnd", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        boolean z17 = this.f170478J;
        boolean z18 = !z17 || (z17 && this.K);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSearchModeEnd", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return z18;
    }

    public void K() {
        long j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addSize", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        java.util.List list = this.f405456e;
        if (((java.util.ArrayList) list).isEmpty()) {
            j17 = 0;
        } else {
            j17 = ((com.tencent.mm.plugin.sns.storage.SnsInfo) ((java.util.ArrayList) list).get(((java.util.ArrayList) list).size() - 1)).field_snsId;
        }
        S(j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSize", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    public java.lang.String L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLimtiSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        java.lang.String str = this.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLimtiSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return str;
    }

    public boolean M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSearchMode", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        boolean z17 = this.f170478J;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSearchMode", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return z17;
    }

    public java.util.ArrayList N(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeGalleryItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.M = i18;
        int i19 = 0;
        while (true) {
            java.util.List list = this.f405456e;
            if (i19 >= ((java.util.ArrayList) list).size()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeGalleryItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                return arrayList;
            }
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) ((java.util.ArrayList) list).get(i19);
            int i27 = snsInfo.localid;
            if (snsInfo.getTimeLine() != null && snsInfo.getTimeLine().ContentObj != null && snsInfo.getTimeLine().ContentObj.f369840h.size() != 0 && (snsInfo.isPhoto() || snsInfo.getTimeLine().ContentObj.f369837e == 15)) {
                if (i27 == i17) {
                    this.M = arrayList.size();
                }
                java.util.Iterator it = snsInfo.getTimeLine().ContentObj.f369840h.iterator();
                int i28 = 0;
                while (it.hasNext()) {
                    r45.jj4 jj4Var = (r45.jj4) it.next();
                    r45.m33 m33Var = new r45.m33();
                    m33Var.f380109d = jj4Var;
                    m33Var.f380110e = com.tencent.mm.plugin.sns.storage.w2.i("sns_table_", i27);
                    m33Var.f380111f = snsInfo.getCreateTime();
                    m33Var.f380112g = i28;
                    arrayList.add(m33Var);
                    i28++;
                }
            }
            i19++;
        }
    }

    public void O(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        P(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    public void P(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        java.lang.String str = this.F;
        com.tencent.mm.plugin.sns.ui.vo voVar = this.G;
        if (voVar != null) {
            if (this.f170478J) {
                com.tencent.mm.plugin.sns.ui.xo xoVar = this.H;
                xoVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                xoVar.a(z17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
            } else {
                boolean z18 = this.D;
                voVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                voVar.f170703h = str;
                voVar.f170704i = z18;
                voVar.a(z17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    public void Q(com.tencent.mm.plugin.sns.statistics.b0 b0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setReporter", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setReporter", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        this.A = b0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setReporter", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        b0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSourcePath50330", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        int i17 = b0Var.f164831a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourcePath50330", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        com.tencent.mm.plugin.sns.ui.qu quVar = this.L;
        quVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSourcePath", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
        quVar.f170366i = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSourcePath", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setReporter", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void R(java.util.List r14, java.util.Map r15, java.util.Map r16, java.util.Map r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.so.R(java.util.List, java.util.Map, java.util.Map, java.util.Map, int, int):void");
    }

    public final void S(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
        com.tencent.mm.plugin.sns.model.d6 Kj = com.tencent.mm.plugin.sns.model.l4.Kj();
        java.lang.String str = this.f405467s;
        java.lang.String s07 = ca4.z0.s0(Fj.F2(j17, Kj.j(str), this.f405467s, this.f405462n));
        if (this.C.equals("")) {
            this.F = s07;
        } else {
            if (s07.compareTo(this.C) >= 0) {
                s07 = this.C;
            }
            this.F = s07;
        }
        long j18 = com.tencent.mm.plugin.sns.model.l4.Ej().J0(str).t0().f371760e;
        if (j18 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return;
        }
        java.lang.String s08 = ca4.z0.s0(j18);
        if (this.F.equals("")) {
            this.F = s08;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        } else {
            if (s08.compareTo(this.F) <= 0) {
                s08 = this.F;
            }
            this.F = s08;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        }
    }

    @Override // sb4.e
    public void c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("browseFeed", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        s0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("browseFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (snsInfo != null) {
            java.lang.String s07 = ca4.z0.s0(snsInfo.field_snsId);
            java.util.ArrayList arrayList = (java.util.ArrayList) s0Var.f164965r;
            if (!arrayList.contains(s07)) {
                arrayList.add(s07);
            }
            if (com.tencent.mm.plugin.sns.model.s5.f(snsInfo).NewWithTaListCount > 0) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) s0Var.f164966s;
                if (!arrayList2.contains(s07)) {
                    arrayList2.add(s07);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("browseFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.plugin.sns.statistics.b0 b0Var = this.A;
        if (b0Var != null && snsInfo != null) {
            b0Var.c(snsInfo);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("browseFeed", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        int i17 = this.f405466r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return i17;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        java.lang.Object obj = ((java.util.ArrayList) this.f405456e).get(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        if (cc4.b.f40482a.a() && i17 == 0 && A()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 7;
        }
        if (z(i17) && A()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 0;
        }
        java.util.Map map = this.f405459h;
        int intValue = ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17)) != null ? ((java.lang.Integer) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17))).intValue() : -1;
        if (intValue == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsphotoAdapter", "unknow error " + intValue);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 0;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) getItem(intValue);
        if (snsInfo.isPhoto()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 0;
        }
        if (snsInfo.getTimeLine().ContentObj.f369837e == 15) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 2;
        }
        if (snsInfo.getTimeLine().ContentObj.f369837e == 21) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 3;
        }
        if (snsInfo.getTimeLine().ContentObj.f369837e == 28 || snsInfo.getTimeLine().ContentObj.f369837e == 50 || snsInfo.getTimeLine().ContentObj.f369837e == 59 || snsInfo.getTimeLine().ContentObj.f369837e == 29 || snsInfo.getTimeLine().ContentObj.f369837e == 37 || snsInfo.getTimeLine().ContentObj.f369837e == 38 || snsInfo.getTimeLine().ContentObj.f369837e == 53 || snsInfo.getTimeLine().ContentObj.f369837e == 34 || snsInfo.getTimeLine().ContentObj.f369837e == 45 || snsInfo.getTimeLine().ContentObj.f369837e == 43 || snsInfo.getTimeLine().ContentObj.f369837e == 36 || snsInfo.getTimeLine().ContentObj.f369837e == 44 || snsInfo.getTimeLine().ContentObj.f369837e == 46 || snsInfo.getTimeLine().ContentObj.f369837e == 51 || snsInfo.getTimeLine().ContentObj.f369837e == 52 || snsInfo.getTimeLine().ContentObj.f369837e == 55 || snsInfo.getTimeLine().ContentObj.f369837e == 56) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 4;
        }
        if (snsInfo.getTimeLine().ContentObj.f369837e == 33) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 5;
        }
        if (snsInfo.getTimeLine().ContentObj.f369837e == 4) {
            if (kotlin.jvm.internal.o.b("wx5aa333606550dfd5", snsInfo.getTimeLine().AppInfo != null ? snsInfo.getTimeLine().AppInfo.f390846d : "")) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                return 6;
            }
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_new_music_type_flag, bm5.h0.RepairerConfig_Mv_CardDownLevel_Int, 0) == 1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                return 1;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 1;
        }
        if (snsInfo.getTimeLine().ContentObj.f369837e == 47) {
            if (je4.g.d(this.f405455d, snsInfo.getTimeLine())) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                return 6;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 1;
        }
        if (snsInfo.getTimeLine().ContentObj.f369837e == 42) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 6;
        }
        if (snsInfo.getTimeLine().ContentObj.f369837e == 39 && ((i18 = snsInfo.getTimeLine().ContentObj.f369850u) == 3 || i18 == 100000000)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 4;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return 1;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View p17;
        com.tencent.mm.plugin.sns.ui.dw dwVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        int itemViewType = getItemViewType(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsphotoAdapter", "position " + itemViewType);
        if (itemViewType == 7) {
            com.tencent.mm.plugin.sns.ui.qu quVar = this.L;
            quVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserStarSlotHelper", "createViews >> position: " + i17);
            java.lang.Object tag = view != null ? view.getTag() : null;
            android.app.Activity activity = quVar.f170358a;
            if (tag == null || !(view.getTag() instanceof com.tencent.mm.plugin.sns.ui.dw)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserStarSlotHelper", "createViews >> convert view is null");
                p17 = com.tencent.mm.ui.id.b(activity).inflate(com.tencent.mm.R.layout.cuw, (android.view.ViewGroup) null);
                kotlin.jvm.internal.o.f(p17, "inflate(...)");
                dwVar = new com.tencent.mm.plugin.sns.ui.dw(p17);
                p17.setTag(dwVar);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserStarSlotHelper", "createViews >> convert view is no null");
                java.lang.Object tag2 = view.getTag();
                kotlin.jvm.internal.o.e(tag2, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.StarSlotViewHolder");
                dwVar = (com.tencent.mm.plugin.sns.ui.dw) tag2;
                p17 = view;
            }
            if (quVar.f170362e.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserStarSlotHelper", "starFeed is empty");
                android.view.View a17 = dwVar.a();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsUserStarSlotHelper", "createView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(a17, "com/tencent/mm/plugin/sns/ui/SnsUserStarSlotHelper", "createView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
            } else {
                if (dwVar.a().getVisibility() == 8) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserStarSlotHelper", "createViews >> parentView is gone to notify view");
                    androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(activity);
                    linearLayoutManager.Q(0);
                    android.view.View a18 = dwVar.a();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(a18, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsUserStarSlotHelper", "createView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    a18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(a18, "com/tencent/mm/plugin/sns/ui/SnsUserStarSlotHelper", "createView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSlotList", "com.tencent.mm.plugin.sns.ui.StarSlotViewHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSlotList", "com.tencent.mm.plugin.sns.ui.StarSlotViewHolder");
                    androidx.recyclerview.widget.RecyclerView recyclerView = dwVar.f168213b;
                    recyclerView.setLayoutManager(linearLayoutManager);
                    java.util.ArrayList arrayList3 = quVar.f170362e;
                    sb4.y yVar = quVar.f170361d;
                    yVar.x(arrayList3);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSlotList", "com.tencent.mm.plugin.sns.ui.StarSlotViewHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSlotList", "com.tencent.mm.plugin.sns.ui.StarSlotViewHolder");
                    recyclerView.setAdapter(yVar);
                    dwVar.a().setOnClickListener(new com.tencent.mm.plugin.sns.ui.mu(quVar));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        } else if (itemViewType == 0) {
            p17 = q(i17, view);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        } else if (itemViewType == 2) {
            p17 = r(i17, view);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        } else if (itemViewType == 3) {
            p17 = m(i17, view);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        } else if (itemViewType == 4) {
            p17 = l(i17, view);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        } else if (itemViewType == 5) {
            p17 = n(i17, view);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        } else if (itemViewType == 6) {
            p17 = o(i17, view);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        } else {
            p17 = p(i17, view);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return p17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewTypeCount", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewTypeCount", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return 8;
    }

    @Override // sb4.e
    public boolean h(int i17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkDateTvDisplay", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        boolean z17 = true;
        if (!this.f170478J) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDateTvDisplay", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return true;
        }
        if ((i17 != 1 || this.E != j17) && i17 <= 0 && !this.K) {
            z17 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDateTvDisplay", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return z17;
    }

    @Override // sb4.e
    public boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkToShowStarIcon", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        boolean z17 = cc4.b.f40482a.a() && this.f405462n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkToShowStarIcon", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return z17;
    }

    @Override // sb4.e
    public void k(android.widget.TextView textView, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkYearTvView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        int i19 = i17 / 10000;
        int i27 = i18 / 10000;
        d(textView);
        boolean z17 = this.f170478J;
        android.app.Activity activity = this.f405455d;
        if (z17) {
            if (i19 != 0 && i27 != i19) {
                B(textView);
                textView.setText(java.lang.String.format(activity.getResources().getString(com.tencent.mm.R.string.jh6), java.lang.Integer.valueOf(i27)));
                textView.setVisibility(0);
                d(textView);
            }
        } else if (i19 == 0) {
            if (com.tencent.mm.plugin.sns.ui.os.f() != i27) {
                B(textView);
                textView.setText(java.lang.String.format(activity.getResources().getString(com.tencent.mm.R.string.jh6), java.lang.Integer.valueOf(i27)));
                textView.setVisibility(0);
                d(textView);
            }
        } else if (i27 != i19) {
            B(textView);
            textView.setText(java.lang.String.format(activity.getResources().getString(com.tencent.mm.R.string.jh6), java.lang.Integer.valueOf(i27)));
            textView.setVisibility(0);
            d(textView);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkYearTvView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        super.notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    @Override // sb4.e
    public com.tencent.mm.plugin.sns.storage.SnsInfo t(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLastestSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        if (this.f405468t != snsInfo.localid) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastestSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return null;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.storage.l1.b(snsInfo.getLocalid());
        this.f405468t = -1;
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsphotoAdapter", "getLastestSnsInfo failed to sight update snsInfo, fixPos:%d, localId:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(snsInfo.localid));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastestSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsphotoAdapter", "getLastestSnsInfo success to update snsInfo, fixPos:%d, localId:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(snsInfo.localid));
        ((java.util.ArrayList) this.f405456e).set(i17, b17);
        com.tencent.mm.plugin.sns.ui.vo voVar = this.G;
        voVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        int i18 = 0;
        while (true) {
            if (i18 >= voVar.f170699d.size()) {
                break;
            }
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) voVar.f170699d.get(i18);
            if (snsInfo2.localid == b17.localid && snsInfo2.getCreateTime() == b17.getCreateTime() && b17.field_snsId > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsSelfHelper", "updateItem %d >> ", java.lang.Integer.valueOf(b17.localid));
                voVar.f170699d.set(i18, b17);
                break;
            }
            i18++;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastestSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return b17;
    }

    @Override // sb4.e
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPositionTop", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        if (cc4.b.f40482a.a()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPositionTop", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 1;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPositionTop", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return 0;
    }

    @Override // sb4.e
    public boolean z(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPositionGoToPhoto", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        boolean z17 = false;
        if (cc4.b.f40482a.a()) {
            if (this.f405462n && i17 == 1) {
                z17 = true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPositionGoToPhoto", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return z17;
        }
        if (this.f405462n && i17 == 0) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPositionGoToPhoto", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return z17;
    }
}
