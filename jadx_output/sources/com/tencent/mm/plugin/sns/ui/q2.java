package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class q2 extends com.tencent.mm.plugin.sns.ui.n1 {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f170296g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f170297h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f170298i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f170299j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f170300k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f170301l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f170302m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f170303n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f170304o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView f170305p;

    /* renamed from: q, reason: collision with root package name */
    public m21.k f170306q;

    /* renamed from: r, reason: collision with root package name */
    public int f170307r;

    /* renamed from: s, reason: collision with root package name */
    public int f170308s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f170309t;

    static {
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        fVar.a();
    }

    public q2(com.tencent.mm.ui.MMActivity mMActivity) {
        super(mMActivity);
        this.f170296g = "";
        this.f170302m = null;
        this.f170303n = null;
        this.f170304o = null;
        this.f170305p = null;
        this.f170306q = null;
        this.f170307r = -1;
        this.f170308s = 0;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f170309t = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderPostStatusEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.FinderMediaWidget$1
            {
                this.__eventId = 1254966226;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderPostStatusEvent finderPostStatusEvent) {
                am.vc vcVar;
                com.tencent.mm.plugin.sns.ui.q2 q2Var;
                m21.k kVar;
                r45.kv2 kv2Var;
                r45.kv2 kv2Var2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget$1");
                com.tencent.mm.autogen.events.FinderPostStatusEvent finderPostStatusEvent2 = finderPostStatusEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget$1");
                if (finderPostStatusEvent2 != null && (vcVar = finderPostStatusEvent2.f54316g) != null && vcVar.f8188a > 0 && (kVar = (q2Var = com.tencent.mm.plugin.sns.ui.q2.this).f170306q) != null && (kv2Var = kVar.f322992a) != null && kv2Var.getLong(9) == vcVar.f8188a) {
                    if (!vcVar.f8189b || (kv2Var2 = vcVar.f8190c) == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
                        q2Var.f170307r = 1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
                    } else {
                        q2Var.f170306q.f322992a = kv2Var2;
                        com.tencent.mm.autogen.mmdata.rpt.FinderShareMomentReportStruct u17 = com.tencent.mm.plugin.sns.statistics.s0.f164937k0.u();
                        u17.f57822e = u17.b("Feedid", q2Var.f170306q.f322992a.getString(0), true);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
                        q2Var.f170307r = 0;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget$1");
                return false;
            }
        };
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public android.view.View b() {
        r45.kv2 kv2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        android.view.View inflate = com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.cro, (android.view.ViewGroup) null);
        this.f170302m = inflate;
        this.f170303n = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.n8n);
        this.f170304o = (android.widget.ImageView) this.f170302m.findViewById(com.tencent.mm.R.id.n8m);
        this.f170305p = (com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView) this.f170302m.findViewById(com.tencent.mm.R.id.n8k);
        m21.k kVar = this.f170306q;
        if (kVar != null && (kv2Var = kVar.f322992a) != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.L0(kv2Var.getList(7))) {
                r45.iv2 iv2Var = (r45.iv2) kv2Var.getList(7).get(0);
                if (kv2Var.getInteger(5) == 4) {
                    android.util.Pair k17 = m21.y.k((int) iv2Var.getFloat(3), (int) iv2Var.getFloat(4), mMActivity, false);
                    this.f170302m.setLayoutParams(new android.view.ViewGroup.LayoutParams(((java.lang.Integer) k17.first).intValue(), ((java.lang.Integer) k17.second).intValue()));
                    this.f170302m.requestLayout();
                } else {
                    android.util.Pair m17 = m21.y.m((int) iv2Var.getFloat(3), (int) iv2Var.getFloat(4), mMActivity);
                    this.f170302m.setLayoutParams(new android.view.ViewGroup.LayoutParams(((java.lang.Integer) m17.first).intValue(), ((java.lang.Integer) m17.second).intValue()));
                    this.f170302m.requestLayout();
                }
                java.lang.String string = (iv2Var.getString(8) == null || iv2Var.getString(8).isEmpty()) ? iv2Var.getString(2) : iv2Var.getString(8);
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                ya2.l.f460502a.h(string, this.f170303n, mn2.f1.B);
            }
            if (kv2Var.getInteger(5) == 4) {
                this.f170304o.setVisibility(0);
                this.f170305p.setVisibility(8);
            } else if (kv2Var.getInteger(5) == 2) {
                this.f170304o.setVisibility(0);
                this.f170305p.setVisibility(8);
                this.f170305p.f170651e = kv2Var.getInteger(6);
            } else {
                this.f170304o.setVisibility(8);
                this.f170305p.setVisibility(8);
                this.f170305p.f170651e = kv2Var.getInteger(6);
            }
            this.f170302m.setOnClickListener(new com.tencent.mm.plugin.sns.ui.p2(this));
        }
        android.view.View view = this.f170302m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        return view;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.tencent.mm.pointers.PInt pInt, java.lang.String str2, int i27, int i28) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        int i29 = this.f170308s;
        int i37 = i29 == 38 ? 50 : i29 == 45 ? 59 : 28;
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        com.tencent.mm.plugin.sns.model.y7 y7Var = new com.tencent.mm.plugin.sns.model.y7(i37, mMActivity);
        m21.k kVar = this.f170306q;
        if (kVar != null) {
            y7Var.M(kVar);
        }
        pInt.value = y7Var.l();
        if (i19 > q94.a.f360928a) {
            y7Var.u(1, 4);
        }
        if (i37 == 59) {
            y7Var.D(mMActivity.getResources().getString(com.tencent.mm.R.string.f492409gj0));
        }
        y7Var.C(this.f170296g);
        y7Var.t(str);
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("ksnsupload_link_desc");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        y7Var.B(stringExtra);
        y7Var.x(linkedList);
        y7Var.G(i17);
        if (z17) {
            y7Var.z(1);
        } else {
            y7Var.z(0);
        }
        y7Var.y(list2);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (list != null) {
            new java.util.LinkedList();
            ((yb0.e) ((zb0.z) i95.n0.c(zb0.z.class))).getClass();
            java.util.List b17 = k35.c.b();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                if (!((java.util.ArrayList) b17).contains(str3)) {
                    r45.jb6 jb6Var = new r45.jb6();
                    jb6Var.f377690d = str3;
                    linkedList2.add(jb6Var);
                }
            }
        }
        if (iVar != null) {
            y7Var.U(iVar.f316692d, iVar.f316693e);
        }
        y7Var.W(linkedList2);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f170297h)) {
            y7Var.J(this.f170297h);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f170298i)) {
            java.lang.String str4 = this.f170298i;
            y7Var.I(str4 != null ? str4 : "");
        }
        y7Var.A(ed4Var);
        y7Var.s(str2);
        y7Var.H(this.f170299j);
        y7Var.K(this.f170300k);
        if (o()) {
            int i38 = this.f170307r;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = y7Var.f164783h;
            if (i38 == -1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPostHolding", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                if (snsInfo != null) {
                    snsInfo.setPostHolding();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPostHolding", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            } else if (i38 == 1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPostDie", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                if (snsInfo != null) {
                    snsInfo.setItemDie();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPostDie", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            }
        }
        m(y7Var);
        int i39 = y7Var.i();
        if (this.f170307r == 1) {
            com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            s0Var.u().f57824g = 1L;
            s0Var.b();
            s0Var.R = 0;
        } else {
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.R = i39;
        }
        if (this.f170301l) {
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.P = i39;
        }
        com.tencent.mm.plugin.sns.model.l4.Nj().d();
        mMActivity.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        super.e();
        this.f170309t.dead();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        boolean z17 = this.f170306q != null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        java.util.Map d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        super.i(bundle);
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("Ksnsupload_title");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f170296g = stringExtra;
        java.lang.String stringExtra2 = mMActivity.getIntent().getStringExtra("KPublisherId");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f170299j = stringExtra2;
        java.lang.String stringExtra3 = mMActivity.getIntent().getStringExtra("reportSessionId");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f170300k = stringExtra3;
        java.lang.String stringExtra4 = mMActivity.getIntent().getStringExtra("Ksnsupload_appid");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f170297h = stringExtra4;
        java.lang.String stringExtra5 = mMActivity.getIntent().getStringExtra("Ksnsupload_appname");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.f170298i = stringExtra5;
        this.f170301l = mMActivity.getIntent().getBooleanExtra("ksnsupload_finder_need_report", false);
        int intExtra = mMActivity.getIntent().getIntExtra("finder_post_from_sns_type", 3);
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        s0Var.Q = mMActivity.getIntent().getLongExtra("finder_feed_id", 0L);
        this.f170308s = mMActivity.getIntent().getIntExtra("Ksnsupload_type", 0);
        java.lang.String stringExtra6 = mMActivity.getIntent().getStringExtra("ksnsupload_finder_object_xml");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra6) && (d17 = com.tencent.mm.sdk.platformtools.aa.d(stringExtra6, "finderFeed", null)) != null) {
            m21.k kVar = new m21.k();
            this.f170306q = kVar;
            kVar.f322992a = zy2.d5.j("", d17);
        }
        java.lang.String l17 = ca4.z0.l();
        s0Var.u().f57821d = intExtra;
        com.tencent.mm.autogen.mmdata.rpt.FinderShareMomentReportStruct u17 = s0Var.u();
        u17.f57825h = u17.b("MonmentSessionId", l17, true);
        m21.k kVar2 = this.f170306q;
        if (kVar2 != null && kVar2.f322992a != null) {
            com.tencent.mm.autogen.mmdata.rpt.FinderShareMomentReportStruct u18 = s0Var.u();
            u18.f57822e = u18.b("Feedid", this.f170306q.f322992a.getString(0), true);
        }
        this.f170309t.alive();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        boolean o17 = o();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        return o17;
    }

    public boolean o() {
        r45.kv2 kv2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLocalFinderFeed", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        m21.k kVar = this.f170306q;
        boolean z17 = false;
        if (kVar != null && (kv2Var = kVar.f322992a) != null && kv2Var.getLong(9) > 0 && ca4.z0.F0(this.f170306q.f322992a.getString(0)) <= 0 && com.tencent.mm.sdk.platformtools.t8.K0(this.f170306q.f322992a.getString(8))) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLocalFinderFeed", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        return false;
    }
}
