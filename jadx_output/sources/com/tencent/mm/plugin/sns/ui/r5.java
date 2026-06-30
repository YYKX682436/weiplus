package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class r5 extends com.tencent.mm.plugin.sns.ui.n1 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f170376g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f170377h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f170378i;

    /* renamed from: j, reason: collision with root package name */
    public int f170379j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f170380k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f170381l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f170382m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f170383n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f170384o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f170385p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f170386q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f170387r;

    /* renamed from: s, reason: collision with root package name */
    public r45.ee f170388s;

    /* renamed from: t, reason: collision with root package name */
    public final int f170389t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f170390u;

    public r5(com.tencent.mm.ui.MMActivity mMActivity) {
        super(mMActivity);
        this.f170376g = "";
        this.f170385p = null;
        this.f170386q = null;
        this.f170387r = null;
        this.f170388s = null;
        this.f170389t = 1;
        this.f170390u = "";
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        android.view.View inflate = com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.d2w, (android.view.ViewGroup) null);
        this.f170385p = inflate;
        inflate.setOnClickListener(new com.tencent.mm.plugin.sns.ui.q5(this));
        this.f170386q = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) this.f170385p.findViewById(com.tencent.mm.R.id.h9t);
        this.f170387r = (android.widget.TextView) this.f170385p.findViewById(com.tencent.mm.R.id.odj);
        android.widget.ImageView imageView = (android.widget.ImageView) this.f170385p.findViewById(com.tencent.mm.R.id.nh7);
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(mMActivity, com.tencent.mm.R.raw.icons_outlined_video_call, -1));
        imageView.setVisibility(0);
        this.f170386q.setVisibility(0);
        r45.ee eeVar = this.f170388s;
        if (eeVar != null) {
            this.f170386q.setUrl(eeVar.f373343h);
            this.f170387r.setText(this.f170388s.f373342g);
        }
        ca4.z0.A0(this.f170386q, mMActivity);
        android.view.View view = this.f170385p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        return view;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.tencent.mm.pointers.PInt pInt, java.lang.String str2, int i27, int i28) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        com.tencent.mm.plugin.sns.model.y7 y7Var = new com.tencent.mm.plugin.sns.model.y7(33, mMActivity);
        pInt.value = y7Var.l();
        if (i19 > q94.a.f360928a) {
            y7Var.u(1, 4);
        }
        y7Var.C(this.f170376g);
        y7Var.t(str);
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("ksnsupload_link_desc");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        y7Var.B(stringExtra);
        r45.ee eeVar = this.f170388s;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = y7Var.f164781f;
        if (eeVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShareMPVideo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            timeLineObject.ContentObj.f369846q = eeVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShareMPVideo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        }
        y7Var.E(this.f170389t, this.f170390u);
        y7Var.N(this.f170379j);
        y7Var.Q(this.f170377h);
        y7Var.P(this.f170378i);
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
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f170382m)) {
            y7Var.J(this.f170382m);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f170383n)) {
            java.lang.String str4 = this.f170383n;
            y7Var.I(str4 != null ? str4 : "");
        }
        y7Var.A(ed4Var);
        y7Var.s(str2);
        y7Var.H(this.f170380k);
        y7Var.K(this.f170381l);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentattr", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        timeLineObject.contentattr = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentattr", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        m(y7Var);
        y7Var.i();
        com.tencent.mm.plugin.sns.model.l4.Nj().d();
        mMActivity.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        super.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        java.util.Map d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        super.i(bundle);
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("Ksnsupload_appid");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f170382m = stringExtra;
        java.lang.String stringExtra2 = mMActivity.getIntent().getStringExtra("Ksnsupload_appname");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f170383n = stringExtra2;
        this.f170379j = mMActivity.getIntent().getIntExtra("Ksnsupload_source", 0);
        java.lang.String stringExtra3 = mMActivity.getIntent().getStringExtra("src_username");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f170377h = stringExtra3;
        java.lang.String stringExtra4 = mMActivity.getIntent().getStringExtra("src_displayname");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f170378i = stringExtra4;
        java.lang.String stringExtra5 = mMActivity.getIntent().getStringExtra("KPublisherId");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.f170380k = stringExtra5;
        java.lang.String stringExtra6 = mMActivity.getIntent().getStringExtra("reportSessionId");
        if (stringExtra6 == null) {
            stringExtra6 = "";
        }
        this.f170381l = stringExtra6;
        java.lang.String stringExtra7 = mMActivity.getIntent().getStringExtra("ksnsupload_mp_video_xml");
        if (stringExtra7 == null) {
            stringExtra7 = "";
        }
        this.f170384o = stringExtra7;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra7) && (d17 = com.tencent.mm.sdk.platformtools.aa.d(this.f170384o, "mmbrandmpvideo", null)) != null) {
            this.f170388s = m21.q.c("", d17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        return false;
    }
}
