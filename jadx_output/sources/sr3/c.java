package sr3;

/* loaded from: classes11.dex */
public final class c implements sr3.g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f411834a;

    /* renamed from: b, reason: collision with root package name */
    public final long f411835b;

    /* renamed from: c, reason: collision with root package name */
    public final int f411836c;

    /* renamed from: d, reason: collision with root package name */
    public final sr3.f f411837d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f411838e;

    /* renamed from: f, reason: collision with root package name */
    public sr3.f f411839f;

    public c(com.tencent.mm.plugin.profile.ui.ContactInfoUI globalContext, boolean z17, long j17, int i17, sr3.f fVar) {
        kotlin.jvm.internal.o.g(globalContext, "globalContext");
        this.f411834a = z17;
        this.f411835b = j17;
        this.f411836c = i17;
        this.f411837d = fVar;
        this.f411838e = new java.lang.ref.WeakReference(globalContext);
    }

    @Override // sr3.g
    public boolean a() {
        return this.f411834a;
    }

    @Override // sr3.g
    public int b() {
        return this.f411836c;
    }

    @Override // sr3.g
    public long c() {
        return this.f411835b;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0165  */
    @Override // sr3.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sr3.d d(com.tencent.mm.plugin.profile.ui.ContactInfoUI r23, com.tencent.mm.storage.z3 r24, r45.wl r25, com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher r26, int r27, boolean r28, com.tencent.mm.plugin.profile.ui.tab.m0 r29, androidx.fragment.app.Fragment r30, java.util.List r31) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sr3.c.d(com.tencent.mm.plugin.profile.ui.ContactInfoUI, com.tencent.mm.storage.z3, r45.wl, com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher, int, boolean, com.tencent.mm.plugin.profile.ui.tab.m0, androidx.fragment.app.Fragment, java.util.List):sr3.d");
    }

    @Override // sr3.g
    public java.util.List e(com.tencent.mm.plugin.profile.ui.ContactInfoUI context, com.tencent.mm.storage.z3 contact, r45.wl wlVar, com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher dataFetcher, int i17, boolean z17, com.tencent.mm.plugin.profile.ui.tab.m0 m0Var, androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.Fragment fragment2;
        java.util.LinkedList linkedList;
        r45.gl glVar;
        java.util.LinkedList linkedList2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contact, "contact");
        kotlin.jvm.internal.o.g(dataFetcher, "dataFetcher");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int intExtra = context.getIntent().getIntExtra("biz_profile_tab_type", 0);
        if (intExtra > 1) {
            intExtra = 0;
        }
        if (intExtra == 1) {
            if (((wlVar == null || (glVar = wlVar.f389237h) == null || (linkedList2 = glVar.f375323d) == null || !linkedList2.isEmpty()) ? false : true) && wlVar.f389246t != 1) {
                return arrayList;
            }
        }
        if (wlVar != null) {
            if (!wlVar.f389232J) {
                arrayList.add(new sr3.e(j(context, contact, wlVar, dataFetcher, i17, z17, m0Var), null, 0));
            }
            r45.tj6 tj6Var = wlVar.D;
            if (tj6Var != null && tj6Var.f386508d) {
                arrayList.add(new sr3.e(k(context, contact, wlVar, dataFetcher, i17, z17, m0Var), null, 1));
            }
            r45.tj6 tj6Var2 = wlVar.C;
            if (tj6Var2 != null && tj6Var2.f386508d) {
                arrayList.add(new sr3.e(h(context, contact, wlVar, dataFetcher, i17, z17, m0Var), null, 2));
            }
            r45.tj6 tj6Var3 = wlVar.E;
            if (tj6Var3 != null && tj6Var3.f386508d) {
                arrayList.add(new sr3.e(i(context, contact, wlVar, dataFetcher, i17, z17, m0Var), null, 3));
            }
            r45.gl glVar2 = wlVar.f389237h;
            boolean z18 = ((glVar2 == null || (linkedList = glVar2.f375323d) == null) ? false : linkedList.isEmpty() ^ true) && wlVar.f389246t == 0;
            boolean z19 = wlVar.f389246t == 1;
            com.tencent.mars.xlog.Log.i("BizAccountTypeConfig", "init, VideoTabType is " + wlVar.f389246t);
            if (z19) {
                if (fragment == null) {
                    zy2.ib ibVar = (zy2.ib) i95.n0.c(zy2.ib.class);
                    java.lang.String d17 = contact.d1();
                    long longExtra = context.getIntent().getLongExtra("finder_feed_id", 0L);
                    boolean z27 = this.f411834a;
                    ((com.tencent.mm.plugin.finder.service.q4) ibVar).getClass();
                    if (d17 == null) {
                        d17 = "";
                    }
                    fragment2 = new com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment(d17, longExtra, i17, z27);
                } else {
                    fragment2 = fragment;
                }
                arrayList.add(new sr3.e(fragment2, context.getString(com.tencent.mm.R.string.m_z), 4));
            } else if (z18) {
                arrayList.add(new sr3.e(l(context, contact, wlVar, dataFetcher, i17, m0Var), context.getString(com.tencent.mm.R.string.f490741ak3), 4));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    @Override // sr3.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sr3.f f(android.content.Context r22, com.tencent.mm.storage.z3 r23) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sr3.c.f(android.content.Context, com.tencent.mm.storage.z3):sr3.f");
    }

    @Override // sr3.g
    public sr3.a g() {
        return sr3.a.f411829e;
    }

    public final com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabArticleFragment h(com.tencent.mm.plugin.profile.ui.ContactInfoUI context, com.tencent.mm.storage.z3 contact, r45.wl bizProfileResp, com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher dataFetcher, int i17, boolean z17, com.tencent.mm.plugin.profile.ui.tab.m0 m0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contact, "contact");
        kotlin.jvm.internal.o.g(bizProfileResp, "bizProfileResp");
        kotlin.jvm.internal.o.g(dataFetcher, "dataFetcher");
        com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabArticleFragment bizProfileTabArticleFragment = new com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabArticleFragment(this.f411834a, i17, this);
        bizProfileTabArticleFragment.f154413f = new r45.wl();
        bizProfileTabArticleFragment.m0().C = bizProfileResp.C;
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String d17 = contact.d1();
        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
        h73.e.d(bundle, "contact", d17);
        bizProfileTabArticleFragment.setArguments(bundle);
        bizProfileTabArticleFragment.B0(dataFetcher);
        bizProfileTabArticleFragment.f154430t = this.f411835b;
        bizProfileTabArticleFragment.f154415h = m0Var;
        bizProfileTabArticleFragment.f154431u = z17;
        return bizProfileTabArticleFragment;
    }

    public final com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabAudioFragment i(com.tencent.mm.plugin.profile.ui.ContactInfoUI context, com.tencent.mm.storage.z3 contact, r45.wl bizProfileResp, com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher dataFetcher, int i17, boolean z17, com.tencent.mm.plugin.profile.ui.tab.m0 m0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contact, "contact");
        kotlin.jvm.internal.o.g(bizProfileResp, "bizProfileResp");
        kotlin.jvm.internal.o.g(dataFetcher, "dataFetcher");
        com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabAudioFragment bizProfileTabAudioFragment = new com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabAudioFragment(this.f411834a, i17, this);
        bizProfileTabAudioFragment.f154413f = new r45.wl();
        bizProfileTabAudioFragment.m0().E = bizProfileResp.E;
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String d17 = contact.d1();
        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
        h73.e.d(bundle, "contact", d17);
        bizProfileTabAudioFragment.setArguments(bundle);
        bizProfileTabAudioFragment.B0(dataFetcher);
        bizProfileTabAudioFragment.f154430t = this.f411835b;
        bizProfileTabAudioFragment.f154415h = m0Var;
        bizProfileTabAudioFragment.f154431u = z17;
        return bizProfileTabAudioFragment;
    }

    public final com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment j(com.tencent.mm.plugin.profile.ui.ContactInfoUI context, com.tencent.mm.storage.z3 contact, r45.wl bizProfileResp, com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher dataFetcher, int i17, boolean z17, com.tencent.mm.plugin.profile.ui.tab.m0 m0Var) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contact, "contact");
        kotlin.jvm.internal.o.g(bizProfileResp, "bizProfileResp");
        kotlin.jvm.internal.o.g(dataFetcher, "dataFetcher");
        com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment bizProfileTabMsgFragment = new com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment(this);
        bizProfileTabMsgFragment.f154437s = z17;
        r45.wl wlVar = new r45.wl();
        wlVar.f389235f = bizProfileResp.f389235f;
        wlVar.f389244r = bizProfileResp.f389244r;
        bizProfileTabMsgFragment.f154413f = wlVar;
        r45.gl glVar = bizProfileResp.f389235f;
        r45.gl glVar2 = bizProfileTabMsgFragment.f154440v;
        if (glVar != null && (linkedList = glVar.f375323d) != null && (linkedList2 = glVar2.f375323d) != null) {
            linkedList2.addAll(linkedList);
        }
        r45.gl glVar3 = bizProfileResp.f389235f;
        glVar2.f375326g = glVar3 != null ? glVar3.f375326g : null;
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String d17 = contact.d1();
        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
        h73.e.d(bundle, "contact", d17);
        bizProfileTabMsgFragment.setArguments(bundle);
        bizProfileTabMsgFragment.f154438t = this.f411834a;
        bizProfileTabMsgFragment.f154412e = dataFetcher;
        com.tencent.mm.ui.MMActivity mMActivity = dataFetcher.f154278f;
        if (mMActivity != null && (mMActivity instanceof com.tencent.mm.plugin.profile.ui.ContactInfoUI)) {
            gr3.c.f274851d.put(gr3.c.f274848a.a((com.tencent.mm.plugin.profile.ui.ContactInfoUI) mMActivity, "msglist"), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        bizProfileTabMsgFragment.n0().f154282m.observe(bizProfileTabMsgFragment, new wr3.d1(bizProfileTabMsgFragment));
        bizProfileTabMsgFragment.n0().f154283n.observe(bizProfileTabMsgFragment, new wr3.e1(bizProfileTabMsgFragment));
        bizProfileTabMsgFragment.n0().f154288s.observe(bizProfileTabMsgFragment, new wr3.f1(bizProfileTabMsgFragment));
        bizProfileTabMsgFragment.n0().f154289t.observe(bizProfileTabMsgFragment, new wr3.j1(bizProfileTabMsgFragment));
        bizProfileTabMsgFragment.n0().f154290u.observe(bizProfileTabMsgFragment, new wr3.k1(bizProfileTabMsgFragment));
        bizProfileTabMsgFragment.f154436r = this.f411835b;
        bizProfileTabMsgFragment.f154415h = m0Var;
        bizProfileTabMsgFragment.f154434p = this;
        return bizProfileTabMsgFragment;
    }

    public final com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabPicFragment k(com.tencent.mm.plugin.profile.ui.ContactInfoUI context, com.tencent.mm.storage.z3 contact, r45.wl bizProfileResp, com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher dataFetcher, int i17, boolean z17, com.tencent.mm.plugin.profile.ui.tab.m0 m0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contact, "contact");
        kotlin.jvm.internal.o.g(bizProfileResp, "bizProfileResp");
        kotlin.jvm.internal.o.g(dataFetcher, "dataFetcher");
        com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabPicFragment bizProfileTabPicFragment = new com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabPicFragment(this.f411834a, i17, this);
        bizProfileTabPicFragment.f154413f = new r45.wl();
        bizProfileTabPicFragment.m0().D = bizProfileResp.D;
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String d17 = contact.d1();
        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
        h73.e.d(bundle, "contact", d17);
        bizProfileTabPicFragment.setArguments(bundle);
        bizProfileTabPicFragment.B0(dataFetcher);
        bizProfileTabPicFragment.f154430t = this.f411835b;
        bizProfileTabPicFragment.f154415h = m0Var;
        bizProfileTabPicFragment.f154431u = z17;
        return bizProfileTabPicFragment;
    }

    public final com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment l(com.tencent.mm.plugin.profile.ui.ContactInfoUI context, com.tencent.mm.storage.z3 contact, r45.wl bizProfileResp, com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher dataFetcher, int i17, com.tencent.mm.plugin.profile.ui.tab.m0 m0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contact, "contact");
        kotlin.jvm.internal.o.g(bizProfileResp, "bizProfileResp");
        kotlin.jvm.internal.o.g(dataFetcher, "dataFetcher");
        com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment bizProfileTabVideoFragment = new com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment(this.f411834a, i17);
        bizProfileTabVideoFragment.f154413f = new r45.wl();
        bizProfileTabVideoFragment.m0().f389237h = bizProfileResp.f389237h;
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String d17 = contact.d1();
        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
        h73.e.d(bundle, "contact", d17);
        bizProfileTabVideoFragment.setArguments(bundle);
        bizProfileTabVideoFragment.f154412e = dataFetcher;
        bizProfileTabVideoFragment.n0().f154282m.observe(bizProfileTabVideoFragment, new wr3.c2(bizProfileTabVideoFragment));
        bizProfileTabVideoFragment.n0().f154284o.observe(bizProfileTabVideoFragment, new wr3.d2(bizProfileTabVideoFragment));
        bizProfileTabVideoFragment.f154415h = m0Var;
        return bizProfileTabVideoFragment;
    }
}
