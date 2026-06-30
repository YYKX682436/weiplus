package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class a8 extends com.tencent.mm.plugin.sns.ui.n1 {
    public java.lang.String A;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f167728g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f167729h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f167730i;

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.Bitmap f167731j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f167732k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f167733l;

    /* renamed from: m, reason: collision with root package name */
    public int f167734m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f167735n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f167736o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f167737p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f167738q;

    /* renamed from: r, reason: collision with root package name */
    public int f167739r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f167740s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f167741t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f167742u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f167743v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f167744w;

    /* renamed from: x, reason: collision with root package name */
    public m21.w f167745x;

    /* renamed from: y, reason: collision with root package name */
    public final int f167746y;

    /* renamed from: z, reason: collision with root package name */
    public int f167747z;

    public a8(com.tencent.mm.ui.MMActivity mMActivity, int i17) {
        super(mMActivity);
        this.f167728g = "";
        this.f167729h = "";
        this.f167730i = "";
        this.f167731j = null;
        this.f167735n = null;
        this.f167736o = null;
        this.f167737p = null;
        this.f167738q = false;
        this.f167740s = "";
        this.f167741t = "";
        this.f167742u = "";
        this.f167743v = "";
        this.f167744w = "";
        this.f167745x = null;
        this.f167746y = 9;
        this.f167747z = 1;
        this.A = "";
        this.f167746y = i17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        android.view.View inflate = com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.d2w, (android.view.ViewGroup) null);
        this.f167735n = inflate;
        this.f167736o = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) inflate.findViewById(com.tencent.mm.R.id.h9t);
        this.f167737p = (android.widget.TextView) this.f167735n.findViewById(com.tencent.mm.R.id.odj);
        if (this.f167738q) {
            android.view.View findViewById = this.f167735n.findViewById(com.tencent.mm.R.id.nh7);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/ProductWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/ProductWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById2 = this.f167735n.findViewById(com.tencent.mm.R.id.nh7);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/ProductWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/sns/ui/ProductWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f167737p.setText(this.f167729h);
        if (this.f167746y == 13) {
            this.f167737p.setText(this.f167729h + "\n" + this.f167741t);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f167730i)) {
            this.f167736o.setVisibility(0);
            this.f167736o.setUrl(this.f167730i);
        } else if (com.tencent.mm.sdk.platformtools.t8.M0(null)) {
            this.f167736o.setVisibility(8);
        } else {
            this.f167736o.setVisibility(0);
            android.graphics.Bitmap G = com.tencent.mm.sdk.platformtools.x.G(null);
            this.f167731j = G;
            this.f167736o.setImageBitmap(G);
        }
        ca4.z0.A0(this.f167736o, mMActivity);
        android.view.View view = this.f167735n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        return view;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.tencent.mm.pointers.PInt pInt, java.lang.String str2, int i27, int i28) {
        k70.v vVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        int i29 = this.f167746y;
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        com.tencent.mm.plugin.sns.model.y7 y7Var = new com.tencent.mm.plugin.sns.model.y7(i29, mMActivity);
        pInt.value = y7Var.l();
        if (i19 > q94.a.f360928a) {
            y7Var.u(1, 2);
        }
        y7Var.C(this.f167729h);
        y7Var.B(this.f167741t);
        y7Var.D(this.f167728g);
        y7Var.t(str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f167744w)) {
            y7Var.d(com.tencent.mm.vfs.w6.N(this.f167744w, 0, -1), this.f167741t, this.f167729h, this.f167739r, this.f167740s);
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f167730i) && (vVar = (k70.v) i95.n0.c(k70.v.class)) != null) {
            android.graphics.Bitmap Bi = ((j70.e) vVar).Bi(this.f167730i);
            if (Bi != null) {
                y7Var.c(com.tencent.mm.sdk.platformtools.x.a(Bi), "", "");
            }
        }
        if (iVar != null) {
            y7Var.U(iVar.f316692d, iVar.f316693e);
        }
        y7Var.E(this.f167747z, this.A);
        y7Var.N(this.f167734m);
        y7Var.Q(this.f167732k);
        y7Var.P(this.f167733l);
        y7Var.x(linkedList);
        y7Var.G(i17);
        y7Var.O(null, null, null, i27, i28);
        if (z17) {
            y7Var.z(1);
        } else {
            y7Var.z(0);
        }
        y7Var.y(list2);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f167743v)) {
            y7Var.J(this.f167743v);
            y7Var.I(this.f167742u);
        }
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
        y7Var.W(linkedList2);
        y7Var.A(ed4Var);
        m(y7Var);
        int i37 = y7Var.i();
        m21.w wVar = this.f167745x;
        if (wVar != null) {
            wVar.a(i37);
            com.tencent.mm.plugin.sns.statistics.x0.f164998b.b(this.f167745x);
        }
        com.tencent.mm.plugin.sns.model.l4.Nj().d();
        mMActivity.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        super.e();
        android.graphics.Bitmap bitmap = this.f167731j;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f167731j.recycle();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.ProductWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        super.i(bundle);
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        this.f167745x = m21.w.f(mMActivity.getIntent());
        mMActivity.getIntent().getIntExtra("Ksnsupload_width", -1);
        mMActivity.getIntent().getIntExtra("Ksnsupload_height", -1);
        this.f167734m = mMActivity.getIntent().getIntExtra("Ksnsupload_source", 0);
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("Ksnsupload_link");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f167728g = stringExtra;
        java.lang.String stringExtra2 = mMActivity.getIntent().getStringExtra("Ksnsupload_title");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f167729h = stringExtra2;
        java.lang.String stringExtra3 = mMActivity.getIntent().getStringExtra("Ksnsupload_imgurl");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f167730i = stringExtra3;
        this.f167744w = mMActivity.getIntent().getStringExtra("KsnsUpload_imgPath");
        this.f167738q = mMActivity.getIntent().getBooleanExtra("ksnsis_video", false);
        java.lang.String stringExtra4 = mMActivity.getIntent().getStringExtra("src_username");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f167732k = stringExtra4;
        java.lang.String stringExtra5 = mMActivity.getIntent().getStringExtra("src_displayname");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.f167733l = stringExtra5;
        java.lang.String stringExtra6 = mMActivity.getIntent().getStringExtra("KContentObjDesc");
        if (stringExtra6 == null) {
            stringExtra6 = "";
        }
        this.f167741t = stringExtra6;
        java.lang.String stringExtra7 = mMActivity.getIntent().getStringExtra("KUploadProduct_UserData");
        if (stringExtra7 == null) {
            stringExtra7 = "";
        }
        this.f167740s = stringExtra7;
        java.lang.String stringExtra8 = mMActivity.getIntent().getStringExtra("Ksnsupload_appname");
        if (stringExtra8 == null) {
            stringExtra8 = "";
        }
        this.f167742u = stringExtra8;
        java.lang.String stringExtra9 = mMActivity.getIntent().getStringExtra("Ksnsupload_appid");
        if (stringExtra9 == null) {
            stringExtra9 = "";
        }
        this.f167743v = stringExtra9;
        this.f167739r = mMActivity.getIntent().getIntExtra("KUploadProduct_subType", 0);
        if (mMActivity.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true)) {
            this.f167747z = 1;
        } else {
            this.f167747z = 0;
        }
        java.lang.String stringExtra10 = mMActivity.getIntent().getStringExtra("SendAppMessageWrapper_PkgName");
        this.A = stringExtra10 != null ? stringExtra10 : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.ProductWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.ProductWidget");
        return false;
    }
}
