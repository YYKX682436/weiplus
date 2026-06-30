package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class c2 extends com.tencent.mm.plugin.sns.ui.n1 {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f168067g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f168068h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f168069i;

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.Bitmap f168070j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f168071k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f168072l;

    /* renamed from: m, reason: collision with root package name */
    public int f168073m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f168074n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f168075o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f168076p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f168077q;

    /* renamed from: r, reason: collision with root package name */
    public int f168078r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f168079s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f168080t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f168081u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f168082v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f168083w;

    /* renamed from: x, reason: collision with root package name */
    public m21.w f168084x;

    /* renamed from: y, reason: collision with root package name */
    public int f168085y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f168086z;

    public c2(com.tencent.mm.ui.MMActivity mMActivity) {
        super(mMActivity);
        this.f168067g = "";
        this.f168068h = "";
        this.f168069i = "";
        this.f168070j = null;
        this.f168074n = null;
        this.f168075o = null;
        this.f168076p = null;
        this.f168077q = false;
        this.f168079s = "";
        this.f168080t = "";
        this.f168081u = "";
        this.f168082v = "";
        this.f168083w = "";
        this.f168084x = null;
        this.f168085y = 1;
        this.f168086z = "";
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.EmojiShareWidget");
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        android.view.View inflate = com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.d2w, (android.view.ViewGroup) null);
        this.f168074n = inflate;
        this.f168075o = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) inflate.findViewById(com.tencent.mm.R.id.h9t);
        this.f168076p = (android.widget.TextView) this.f168074n.findViewById(com.tencent.mm.R.id.odj);
        if (this.f168077q) {
            android.view.View findViewById = this.f168074n.findViewById(com.tencent.mm.R.id.nh7);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/EmojiShareWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/EmojiShareWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById2 = this.f168074n.findViewById(com.tencent.mm.R.id.nh7);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/EmojiShareWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/sns/ui/EmojiShareWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f168076p.setText(this.f168068h);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f168069i)) {
            this.f168075o.setVisibility(0);
            this.f168075o.setUrl(this.f168069i);
        } else if (com.tencent.mm.sdk.platformtools.t8.M0(null)) {
            this.f168075o.setVisibility(8);
        } else {
            this.f168075o.setVisibility(0);
            android.graphics.Bitmap G = com.tencent.mm.sdk.platformtools.x.G(null);
            this.f168070j = G;
            this.f168075o.setImageBitmap(G);
        }
        ca4.z0.A0(this.f168075o, mMActivity);
        android.view.View view = this.f168074n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.EmojiShareWidget");
        return view;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.tencent.mm.pointers.PInt pInt, java.lang.String str2, int i27, int i28) {
        boolean z18;
        k70.v vVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.EmojiShareWidget");
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        com.tencent.mm.plugin.sns.model.y7 y7Var = new com.tencent.mm.plugin.sns.model.y7(10, mMActivity);
        pInt.value = y7Var.l();
        if (i19 > q94.a.f360928a) {
            y7Var.u(1, 2);
        }
        if (iVar != null) {
            y7Var.U(iVar.f316692d, iVar.f316693e);
        }
        y7Var.C(this.f168068h);
        y7Var.B(this.f168080t);
        y7Var.D(this.f168067g);
        y7Var.t(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f168083w)) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f168069i) && (vVar = (k70.v) i95.n0.c(k70.v.class)) != null) {
                android.graphics.Bitmap Bi = ((j70.e) vVar).Bi(this.f168069i);
                if (Bi != null) {
                    z18 = y7Var.d(com.tencent.mm.sdk.platformtools.x.c(Bi), this.f168080t, this.f168068h, this.f168078r, this.f168079s);
                }
            }
            z18 = false;
        } else {
            z18 = y7Var.d(com.tencent.mm.vfs.w6.N(this.f168083w, 0, -1), this.f168080t, this.f168068h, this.f168078r, this.f168079s);
        }
        if (!z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiShareWidget", "set userData user imgurl ");
            java.lang.String str3 = this.f168069i;
            y7Var.b(str3, str3, this.f168080t, this.f168078r, this.f168079s);
            z18 = true;
        }
        if (!z18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EmojiShareWidget", "set userData faild");
        }
        y7Var.E(this.f168085y, this.f168086z);
        y7Var.N(this.f168073m);
        y7Var.Q(this.f168071k);
        y7Var.P(this.f168072l);
        y7Var.x(linkedList);
        if (z17) {
            y7Var.z(1);
        } else {
            y7Var.z(0);
        }
        y7Var.y(list2);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f168082v)) {
            y7Var.J(this.f168082v);
            y7Var.I(this.f168081u);
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (list != null) {
            new java.util.LinkedList();
            ((yb0.e) ((zb0.z) i95.n0.c(zb0.z.class))).getClass();
            java.util.List b17 = k35.c.b();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str4 = (java.lang.String) it.next();
                if (!((java.util.ArrayList) b17).contains(str4)) {
                    r45.jb6 jb6Var = new r45.jb6();
                    jb6Var.f377690d = str4;
                    linkedList2.add(jb6Var);
                }
            }
        }
        y7Var.W(linkedList2);
        y7Var.G(i17);
        y7Var.O(null, null, null, i27, i28);
        m(y7Var);
        y7Var.A(ed4Var);
        int i29 = y7Var.i();
        m21.w wVar = this.f168084x;
        if (wVar != null) {
            wVar.a(i29);
            com.tencent.mm.plugin.sns.statistics.x0.f164998b.b(this.f168084x);
        }
        com.tencent.mm.plugin.sns.model.l4.Nj().d();
        mMActivity.finish();
        s25.a wi6 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
        java.lang.String str5 = this.f168079s;
        ((y12.h) wi6).getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10993, 1, com.tencent.mm.plugin.emoji.model.EmojiLogic.r(str5));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.EmojiShareWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.EmojiShareWidget");
        super.e();
        android.graphics.Bitmap bitmap = this.f168070j;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f168070j.recycle();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.EmojiShareWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.EmojiShareWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.EmojiShareWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.EmojiShareWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.EmojiShareWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.EmojiShareWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.EmojiShareWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.EmojiShareWidget");
        super.i(bundle);
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        this.f168084x = m21.w.f(mMActivity.getIntent());
        mMActivity.getIntent().getIntExtra("Ksnsupload_width", -1);
        mMActivity.getIntent().getIntExtra("Ksnsupload_height", -1);
        this.f168073m = mMActivity.getIntent().getIntExtra("Ksnsupload_source", 0);
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("Ksnsupload_link");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f168067g = stringExtra;
        java.lang.String stringExtra2 = mMActivity.getIntent().getStringExtra("Ksnsupload_title");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f168068h = stringExtra2;
        java.lang.String stringExtra3 = mMActivity.getIntent().getStringExtra("Ksnsupload_imgurl");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f168069i = stringExtra3;
        this.f168083w = mMActivity.getIntent().getStringExtra("KsnsUpload_imgPath");
        this.f168077q = mMActivity.getIntent().getBooleanExtra("ksnsis_video", false);
        java.lang.String stringExtra4 = mMActivity.getIntent().getStringExtra("src_username");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f168071k = stringExtra4;
        java.lang.String stringExtra5 = mMActivity.getIntent().getStringExtra("src_displayname");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.f168072l = stringExtra5;
        java.lang.String stringExtra6 = mMActivity.getIntent().getStringExtra("KContentObjDesc");
        if (stringExtra6 == null) {
            stringExtra6 = "";
        }
        this.f168080t = stringExtra6;
        java.lang.String stringExtra7 = mMActivity.getIntent().getStringExtra("KUploadProduct_UserData");
        if (stringExtra7 == null) {
            stringExtra7 = "";
        }
        this.f168079s = stringExtra7;
        java.lang.String stringExtra8 = mMActivity.getIntent().getStringExtra("Ksnsupload_appname");
        if (stringExtra8 == null) {
            stringExtra8 = "";
        }
        this.f168081u = stringExtra8;
        java.lang.String stringExtra9 = mMActivity.getIntent().getStringExtra("Ksnsupload_appid");
        if (stringExtra9 == null) {
            stringExtra9 = "";
        }
        this.f168082v = stringExtra9;
        this.f168078r = mMActivity.getIntent().getIntExtra("KUploadProduct_subType", 0);
        if (mMActivity.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true)) {
            this.f168085y = 1;
        } else {
            this.f168085y = 0;
        }
        java.lang.String stringExtra10 = mMActivity.getIntent().getStringExtra("SendAppMessageWrapper_PkgName");
        this.f168086z = stringExtra10 != null ? stringExtra10 : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.EmojiShareWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.EmojiShareWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.EmojiShareWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.EmojiShareWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.EmojiShareWidget");
        return false;
    }
}
