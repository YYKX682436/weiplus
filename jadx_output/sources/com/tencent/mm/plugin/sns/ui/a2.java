package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class a2 extends com.tencent.mm.plugin.sns.ui.n1 {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f167701g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f167702h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f167703i;

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.Bitmap f167704j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f167705k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f167706l;

    /* renamed from: m, reason: collision with root package name */
    public int f167707m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f167708n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f167709o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f167710p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f167711q;

    /* renamed from: r, reason: collision with root package name */
    public int f167712r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f167713s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f167714t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f167715u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f167716v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f167717w;

    /* renamed from: x, reason: collision with root package name */
    public m21.w f167718x;

    /* renamed from: y, reason: collision with root package name */
    public int f167719y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f167720z;

    public a2(com.tencent.mm.ui.MMActivity mMActivity) {
        super(mMActivity);
        this.f167701g = "";
        this.f167702h = "";
        this.f167703i = "";
        this.f167704j = null;
        this.f167708n = null;
        this.f167709o = null;
        this.f167710p = null;
        this.f167711q = false;
        this.f167713s = "";
        this.f167714t = "";
        this.f167715u = "";
        this.f167716v = "";
        this.f167717w = "";
        this.f167718x = null;
        this.f167719y = 1;
        this.f167720z = "";
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        android.view.View inflate = com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.d2w, (android.view.ViewGroup) null);
        this.f167708n = inflate;
        this.f167709o = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) inflate.findViewById(com.tencent.mm.R.id.h9t);
        this.f167710p = (android.widget.TextView) this.f167708n.findViewById(com.tencent.mm.R.id.odj);
        if (this.f167711q) {
            android.view.View findViewById = this.f167708n.findViewById(com.tencent.mm.R.id.nh7);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/EmojiDesignerShareWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/EmojiDesignerShareWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById2 = this.f167708n.findViewById(com.tencent.mm.R.id.nh7);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/EmojiDesignerShareWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/sns/ui/EmojiDesignerShareWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f167710p.setText(this.f167702h);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f167703i)) {
            this.f167709o.setVisibility(0);
            this.f167709o.setUrl(this.f167703i);
        } else if (com.tencent.mm.sdk.platformtools.t8.M0(null)) {
            this.f167709o.setVisibility(8);
        } else {
            this.f167709o.setVisibility(0);
            android.graphics.Bitmap G = com.tencent.mm.sdk.platformtools.x.G(null);
            this.f167704j = G;
            this.f167709o.setImageBitmap(G);
        }
        ca4.z0.A0(this.f167709o, mMActivity);
        android.view.View view = this.f167708n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        return view;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.tencent.mm.pointers.PInt pInt, java.lang.String str2, int i27, int i28) {
        boolean z18;
        k70.v vVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        com.tencent.mm.plugin.sns.model.y7 y7Var = new com.tencent.mm.plugin.sns.model.y7(17, mMActivity);
        pInt.value = y7Var.l();
        if (i19 > q94.a.f360928a) {
            y7Var.u(1, 2);
        }
        if (iVar != null) {
            y7Var.U(iVar.f316692d, iVar.f316693e);
        }
        y7Var.C(this.f167702h);
        y7Var.B(this.f167714t);
        y7Var.D(this.f167701g);
        y7Var.t(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f167717w)) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f167703i) && (vVar = (k70.v) i95.n0.c(k70.v.class)) != null) {
                android.graphics.Bitmap Bi = ((j70.e) vVar).Bi(this.f167703i);
                if (Bi != null) {
                    z18 = y7Var.d(com.tencent.mm.sdk.platformtools.x.c(Bi), this.f167714t, this.f167702h, this.f167712r, this.f167713s);
                }
            }
            z18 = false;
        } else {
            z18 = y7Var.d(com.tencent.mm.vfs.w6.N(this.f167717w, 0, -1), this.f167714t, this.f167702h, this.f167712r, this.f167713s);
        }
        if (!z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiDesignerShareWidget", "set userData user imgurl ");
            java.lang.String str3 = this.f167703i;
            y7Var.b(str3, str3, this.f167714t, this.f167712r, this.f167713s);
            z18 = true;
        }
        if (!z18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EmojiDesignerShareWidget", "set userData faild");
        }
        y7Var.E(this.f167719y, this.f167720z);
        y7Var.N(this.f167707m);
        y7Var.Q(this.f167705k);
        y7Var.P(this.f167706l);
        y7Var.O(null, null, null, i27, i28);
        y7Var.x(linkedList);
        y7Var.G(i17);
        if (z17) {
            y7Var.z(1);
        } else {
            y7Var.z(0);
        }
        y7Var.y(list2);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f167716v)) {
            y7Var.J(this.f167716v);
            y7Var.I(this.f167715u);
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
        m(y7Var);
        y7Var.A(ed4Var);
        int i29 = y7Var.i();
        m21.w wVar = this.f167718x;
        if (wVar != null) {
            wVar.a(i29);
            com.tencent.mm.plugin.sns.statistics.x0.f164998b.b(this.f167718x);
        }
        com.tencent.mm.plugin.sns.model.l4.Nj().d();
        mMActivity.finish();
        s25.a wi6 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
        java.lang.String str5 = this.f167713s;
        ((y12.h) wi6).getClass();
        com.tencent.mm.plugin.emoji.model.EmojiLogic.d(str5);
        s25.a wi7 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
        java.lang.String str6 = this.f167713s;
        ((y12.h) wi7).getClass();
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiLogic", "getDesignerNameBySnsObjData exception. %s", e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        super.e();
        android.graphics.Bitmap bitmap = this.f167704j;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f167704j.recycle();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        super.i(bundle);
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        this.f167718x = m21.w.f(mMActivity.getIntent());
        mMActivity.getIntent().getIntExtra("Ksnsupload_width", -1);
        mMActivity.getIntent().getIntExtra("Ksnsupload_height", -1);
        this.f167707m = mMActivity.getIntent().getIntExtra("Ksnsupload_source", 0);
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("Ksnsupload_link");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f167701g = stringExtra;
        java.lang.String stringExtra2 = mMActivity.getIntent().getStringExtra("Ksnsupload_title");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f167702h = stringExtra2;
        java.lang.String stringExtra3 = mMActivity.getIntent().getStringExtra("Ksnsupload_imgurl");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f167703i = stringExtra3;
        this.f167717w = mMActivity.getIntent().getStringExtra("KsnsUpload_imgPath");
        this.f167711q = mMActivity.getIntent().getBooleanExtra("ksnsis_video", false);
        java.lang.String stringExtra4 = mMActivity.getIntent().getStringExtra("src_username");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f167705k = stringExtra4;
        java.lang.String stringExtra5 = mMActivity.getIntent().getStringExtra("src_displayname");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.f167706l = stringExtra5;
        java.lang.String stringExtra6 = mMActivity.getIntent().getStringExtra("KContentObjDesc");
        if (stringExtra6 == null) {
            stringExtra6 = "";
        }
        this.f167714t = stringExtra6;
        java.lang.String stringExtra7 = mMActivity.getIntent().getStringExtra("KUploadProduct_UserData");
        if (stringExtra7 == null) {
            stringExtra7 = "";
        }
        this.f167713s = stringExtra7;
        java.lang.String stringExtra8 = mMActivity.getIntent().getStringExtra("Ksnsupload_appname");
        if (stringExtra8 == null) {
            stringExtra8 = "";
        }
        this.f167715u = stringExtra8;
        java.lang.String stringExtra9 = mMActivity.getIntent().getStringExtra("Ksnsupload_appid");
        if (stringExtra9 == null) {
            stringExtra9 = "";
        }
        this.f167716v = stringExtra9;
        this.f167712r = mMActivity.getIntent().getIntExtra("KUploadProduct_subType", 0);
        if (mMActivity.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true)) {
            this.f167719y = 1;
        } else {
            this.f167719y = 0;
        }
        java.lang.String stringExtra10 = mMActivity.getIntent().getStringExtra("SendAppMessageWrapper_PkgName");
        this.f167720z = stringExtra10 != null ? stringExtra10 : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.EmojiDesignerShareWidget");
        return false;
    }
}
