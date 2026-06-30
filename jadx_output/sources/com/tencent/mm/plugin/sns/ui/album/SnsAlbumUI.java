package com.tencent.mm.plugin.sns.ui.album;

/* loaded from: classes4.dex */
public class SnsAlbumUI extends com.tencent.mm.ui.MMFragment implements p94.m0, ub4.b {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f167760t = 0;

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f167761d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f167762e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f167763f = null;

    /* renamed from: g, reason: collision with root package name */
    public ub4.i f167764g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f167765h = null;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.statistics.k f167766i = new com.tencent.mm.plugin.sns.statistics.k();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f167767m = null;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f167768n = null;

    /* renamed from: o, reason: collision with root package name */
    public int f167769o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f167770p = false;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.model.d6 f167771q = null;

    /* renamed from: r, reason: collision with root package name */
    public int f167772r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Runnable f167773s = new ub4.r(this);

    public static /* synthetic */ java.lang.String l0(com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI snsAlbumUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        java.lang.String str = snsAlbumUI.f167768n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        return str;
    }

    @Override // p94.m0
    public void B4(java.lang.String str, java.lang.String str2, boolean z17, int i17, p94.d0 d0Var, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ca, code lost:
    
        if (r8 != false) goto L25;
     */
    @Override // p94.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O0(java.lang.String r24, boolean r25, int r26, p94.d0 r27) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI.O0(java.lang.String, boolean, int, p94.d0):void");
    }

    @Override // p94.m0
    public void S0(java.lang.String str, boolean z17, int i17, p94.d0 d0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        com.tencent.mm.plugin.sns.model.l4.Tj().removeCallbacks(this.f167773s);
        if (this.f167767m.equals(this.f167768n) && d0Var.f() != 0) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SNS_RECENT_LIMITED_ID_LONG_SYNC, java.lang.Long.valueOf(d0Var.f()));
            ub4.i iVar = this.f167764g;
            long f17 = d0Var.f();
            iVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRecentLimitedID", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            if (0 != iVar.f426174n) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRecentLimitedID", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            } else {
                iVar.f426174n = f17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRecentLimitedID", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            }
        }
        if (d0Var.h()) {
            ub4.i iVar2 = this.f167764g;
            java.lang.String m17 = d0Var.m();
            iVar2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onIsAll", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            iVar2.f426176p = true;
            iVar2.f426177q = m17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onIsAll", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            if (this.f167764g.getItemCount() > 0) {
                this.f167764g.notifyItemChanged(r10.getItemCount() - 1);
            }
        } else {
            ub4.i iVar3 = this.f167764g;
            if (iVar3 != null) {
                boolean q17 = d0Var.q();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPrivacy", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                iVar3.f426173m = q17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPrivacy", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                ub4.i iVar4 = this.f167764g;
                iVar4.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRespMinSeq", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                iVar4.f426169f = str;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRespMinSeq", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                this.f167764g.z();
                this.f167764g.B("");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
    }

    @Override // com.tencent.mm.ui.MMFragment
    public void dealContentView(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealContentView", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        super.dealContentView(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        this.f167771q = com.tencent.mm.plugin.sns.model.l4.Kj();
        this.f167769o = getActivity().getIntent().getIntExtra("sns_source", 0);
        this.f167768n = getActivity().getIntent().getStringExtra("sns_userName");
        this.f167767m = c01.z1.r();
        java.lang.String str = this.f167767m + "_" + java.lang.System.currentTimeMillis();
        this.f167765h = str;
        com.tencent.mm.plugin.sns.statistics.k kVar = this.f167766i;
        kVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsAlbumSessionId", "com.tencent.mm.plugin.sns.statistics.SnsAlbumReporter");
        kotlin.jvm.internal.o.g(str, "<set-?>");
        kVar.f164865a = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsAlbumSessionId", "com.tencent.mm.plugin.sns.statistics.SnsAlbumReporter");
        ub4.i iVar = new ub4.i(getContext(), this.f167768n, this);
        this.f167764g = iVar;
        ub4.t tVar = new ub4.t(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnGridItemClickListener", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        iVar.f426180t = tVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnGridItemClickListener", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        ub4.i iVar2 = this.f167764g;
        java.lang.String str2 = this.f167765h;
        iVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAlbumSessionId", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        iVar2.f426178r = str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAlbumSessionId", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        this.f167762e = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f482899r7);
        this.f167763f = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f482898r6);
        this.f167761d = (androidx.recyclerview.widget.RecyclerView) view.findViewById(com.tencent.mm.R.id.f482901r9);
        this.f167763f.setOnClickListener(new ub4.u(this));
        this.f167761d.setAdapter(this.f167764g);
        this.f167761d.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        this.f167761d.i(new ub4.v(this));
        this.f167761d.postDelayed(new ub4.w(this), 500L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealContentView", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
    }

    @Override // p94.m0
    public void e6(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
    }

    @Override // com.tencent.mm.ui.MMFragment
    /* renamed from: getLayoutId */
    public int getF72225d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        return com.tencent.mm.R.layout.cqo;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.List list;
        java.util.ArrayList arrayList;
        int i19;
        com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI snsAlbumUI = this;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        super.onActivityResult(i17, i18, intent);
        if (i17 == 8 && intent != null && intent.getParcelableExtra("sns_cmd_list") != null && (intent.getParcelableExtra("sns_cmd_list") instanceof com.tencent.mm.plugin.sns.data.SnsCmdList)) {
            java.util.Iterator it = ((com.tencent.mm.plugin.sns.data.SnsCmdList) intent.getParcelableExtra("sns_cmd_list")).c().iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Integer) it.next()).intValue();
                ub4.i iVar = snsAlbumUI.f167764g;
                androidx.recyclerview.widget.RecyclerView recyclerView = snsAlbumUI.f167761d;
                iVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyDeleteByLocalId", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findAdapterPositionByLocalId", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                int i27 = 0;
                while (true) {
                    list = iVar.f426167d;
                    if (i27 >= list.size()) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findAdapterPositionByLocalId", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                        i27 = -1;
                        break;
                    }
                    java.util.Iterator it6 = ((ub4.c) list.get(i27)).f426152a.iterator();
                    while (it6.hasNext()) {
                        if (intValue == ((com.tencent.mm.plugin.sns.storage.SnsInfo) it6.next()).localid) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findAdapterPositionByLocalId", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                            break;
                        }
                    }
                    i27++;
                }
                if (i27 != -1) {
                    androidx.recyclerview.widget.k3 p07 = recyclerView.p0(i27);
                    if (p07 instanceof ub4.h) {
                        int i28 = ub4.h.f426160m;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
                        ub4.p pVar = ((ub4.h) p07).f426161d;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
                        pVar.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyDeleteByLocalId", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
                        int i29 = 1;
                        int i37 = -1;
                        int i38 = 0;
                        while (true) {
                            arrayList = (java.util.ArrayList) pVar.f426194d;
                            if (i38 >= arrayList.size()) {
                                break;
                            }
                            if (((ub4.e) arrayList.get(i38)).f426156a == intValue) {
                                if (i37 == -1) {
                                    i37 = i38;
                                } else {
                                    i29++;
                                }
                            }
                            i38++;
                        }
                        if (i37 != -1) {
                            for (int i39 = 0; i39 < i29; i39++) {
                                arrayList.remove(i37);
                            }
                            int size = arrayList.size();
                            pVar.notifyItemRangeRemoved(i37, i29);
                            i19 = size;
                        } else {
                            i19 = 0;
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyDeleteByLocalId", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
                        if (i19 <= 0) {
                            list.remove(i27);
                            iVar.notifyItemRemoved(i27);
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyDeleteByLocalId", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                snsAlbumUI = this;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        com.tencent.mm.ui.bk.u0(getActivity());
        super.onCreate(bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initActionBar", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        setMMTitle(com.tencent.mm.R.string.f489984hg);
        setBackBtn(new ub4.s(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initActionBar", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        com.tencent.mm.plugin.sns.model.d6 d6Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        super.onDestroy();
        this.f167770p = true;
        com.tencent.mm.plugin.sns.model.l4.Kj().b(this.f167768n);
        com.tencent.mm.plugin.sns.model.l4.Tj().removeCallbacks(this.f167773s);
        gm0.j1.i();
        if (gm0.j1.b().m() && (d6Var = this.f167771q) != null) {
            d6Var.c(this, 10);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        super.onPause();
        com.tencent.mm.plugin.sns.statistics.k kVar = this.f167766i;
        kVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pageOut", "com.tencent.mm.plugin.sns.statistics.SnsAlbumReporter");
        java.util.HashMap i17 = kz5.c1.i(new jz5.l("associate_username", kVar.f164867c), new jz5.l("snsalbumsid", kVar.f164865a), new jz5.l("feeddepth", 0), new jz5.l("is_zoom", 0), new jz5.l("stay_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - kVar.f164866b)), new jz5.l("sns_page_scene", 3));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportPageEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
        com.tencent.mm.plugin.sns.statistics.w.f164988a.a();
        java.util.Objects.toString(ri.l0.a(i17));
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.statistics.u(1137, "page_out", i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPageEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pageOut", "com.tencent.mm.plugin.sns.statistics.SnsAlbumReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        super.onResume();
        com.tencent.mm.plugin.sns.statistics.k kVar = this.f167766i;
        kVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pageIn", "com.tencent.mm.plugin.sns.statistics.SnsAlbumReporter");
        kVar.f164866b = java.lang.System.currentTimeMillis();
        java.util.HashMap i17 = kz5.c1.i(new jz5.l("associate_username", kVar.f164867c), new jz5.l("snsalbumsid", kVar.f164865a), new jz5.l("sns_page_scene", 3));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportPageEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
        com.tencent.mm.plugin.sns.statistics.w.f164988a.a();
        java.util.Objects.toString(ri.l0.a(i17));
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.statistics.u(1137, "page_in", i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPageEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pageIn", "com.tencent.mm.plugin.sns.statistics.SnsAlbumReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewCreated", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        super.onViewCreated(view, bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewCreated", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
    }

    @Override // com.tencent.mm.ui.MMFragment
    public boolean supportNavigationSwipeBack() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("supportNavigationSwipeBack", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supportNavigationSwipeBack", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        return false;
    }
}
