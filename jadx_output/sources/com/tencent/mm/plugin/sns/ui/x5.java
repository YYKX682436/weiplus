package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class x5 extends com.tencent.mm.plugin.sns.ui.n1 {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f171481g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f171482h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f171483i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f171484j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f171485k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f171486l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f171487m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f171488n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f171489o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView f171490p;

    /* renamed from: q, reason: collision with root package name */
    public m21.p f171491q;

    static {
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        fVar.a();
    }

    public x5(com.tencent.mm.ui.MMActivity mMActivity) {
        super(mMActivity);
        this.f171481g = "";
        this.f171487m = null;
        this.f171488n = null;
        this.f171489o = null;
        this.f171490p = null;
        this.f171491q = null;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public android.view.View b() {
        r45.ek4 ek4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        android.view.View inflate = com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.cro, (android.view.ViewGroup) null);
        this.f171487m = inflate;
        this.f171488n = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.n8n);
        this.f171489o = (android.widget.ImageView) this.f171487m.findViewById(com.tencent.mm.R.id.n8m);
        this.f171490p = (com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView) this.f171487m.findViewById(com.tencent.mm.R.id.n8k);
        m21.p pVar = this.f171491q;
        if (pVar != null && (ek4Var = pVar.f322997a) != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.L0(ek4Var.getList(6))) {
                r45.dk4 dk4Var = (r45.dk4) ek4Var.getList(6).get(0);
                android.util.Pair k17 = m21.y.k((int) dk4Var.getFloat(2), (int) dk4Var.getFloat(3), mMActivity, false);
                this.f171487m.setLayoutParams(new android.view.ViewGroup.LayoutParams(((java.lang.Integer) k17.first).intValue(), ((java.lang.Integer) k17.second).intValue()));
                this.f171487m.requestLayout();
                if (android.text.TextUtils.isEmpty(dk4Var.getString(4))) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    ya2.l.f460502a.h(dk4Var.getString(1), this.f171488n, mn2.f1.B);
                } else {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    ya2.l.f460502a.h(dk4Var.getString(4), this.f171488n, mn2.f1.B);
                }
            }
            this.f171489o.setVisibility(0);
            this.f171490p.setVisibility(8);
            this.f171487m.setOnClickListener(new com.tencent.mm.plugin.sns.ui.w5(this));
        }
        android.view.View view = this.f171487m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        return view;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.tencent.mm.pointers.PInt pInt, java.lang.String str2, int i27, int i28) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        com.tencent.mm.plugin.sns.model.y7 y7Var = new com.tencent.mm.plugin.sns.model.y7(36, mMActivity);
        m21.p pVar = this.f171491q;
        if (pVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMegaVideoShareObject", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            y7Var.f164781f.ContentObj.f369849t = pVar.f322997a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMegaVideoShareObject", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        }
        pInt.value = y7Var.l();
        if (i19 > q94.a.f360928a) {
            y7Var.u(1, 4);
        }
        y7Var.C(this.f171481g);
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
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f171482h)) {
            y7Var.J(this.f171482h);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f171483i)) {
            java.lang.String str4 = this.f171483i;
            y7Var.I(str4 != null ? str4 : "");
        }
        y7Var.A(ed4Var);
        y7Var.s(str2);
        y7Var.H(this.f171484j);
        y7Var.K(this.f171485k);
        m(y7Var);
        int i29 = y7Var.i();
        if (this.f171486l) {
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.P = i29;
        }
        com.tencent.mm.plugin.sns.model.l4.Nj().d();
        mMActivity.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        super.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        boolean z17 = this.f171491q != null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        java.util.Map d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        super.i(bundle);
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("Ksnsupload_title");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f171481g = stringExtra;
        java.lang.String stringExtra2 = mMActivity.getIntent().getStringExtra("KPublisherId");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f171484j = stringExtra2;
        java.lang.String stringExtra3 = mMActivity.getIntent().getStringExtra("reportSessionId");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f171485k = stringExtra3;
        java.lang.String stringExtra4 = mMActivity.getIntent().getStringExtra("Ksnsupload_appid");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f171482h = stringExtra4;
        java.lang.String stringExtra5 = mMActivity.getIntent().getStringExtra("Ksnsupload_appname");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.f171483i = stringExtra5;
        this.f171486l = mMActivity.getIntent().getBooleanExtra("ksnsupload_finder_need_report", false);
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.Q = mMActivity.getIntent().getLongExtra("finder_feed_id", 0L);
        java.lang.String stringExtra6 = mMActivity.getIntent().getStringExtra("ksnsupload_mega_video_object_xml");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra6) && (d17 = com.tencent.mm.sdk.platformtools.aa.d(stringExtra6, "finderMegaVideo", null)) != null) {
            m21.p pVar = new m21.p();
            this.f171491q = pVar;
            pVar.b("", d17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        return false;
    }
}
