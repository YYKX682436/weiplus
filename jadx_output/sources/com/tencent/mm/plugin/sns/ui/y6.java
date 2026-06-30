package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class y6 extends com.tencent.mm.plugin.sns.ui.n1 {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f171612g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f171613h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f171614i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.opensdk.modelmsg.WXMediaMessage f171615j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f171616k;

    /* renamed from: l, reason: collision with root package name */
    public m21.w f171617l;

    /* renamed from: m, reason: collision with root package name */
    public int f171618m;

    /* renamed from: n, reason: collision with root package name */
    public int f171619n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f171620o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str) {
        super(mMActivity);
        boolean o17 = o(str);
        this.f171612g = "";
        this.f171613h = false;
        this.f171614i = false;
        this.f171615j = null;
        this.f171616k = false;
        this.f171617l = null;
        this.f171619n = 1;
        this.f171620o = "";
        this.f171616k = o17;
    }

    public static boolean o(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkCanPostOnTextWidget", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCanPostOnTextWidget", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
            return false;
        }
        java.lang.String replaceAll = str.replaceAll("[\\p{Cf}]", "");
        boolean f17 = u46.l.f(replaceAll);
        replaceAll.length();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCanPostOnTextWidget", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        return f17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        return null;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.tencent.mm.pointers.PInt pInt, java.lang.String str2, int i27, int i28) {
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        if (mMActivity.isFinishing()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
            return false;
        }
        com.tencent.mm.plugin.sns.model.y7 y7Var = new com.tencent.mm.plugin.sns.model.y7(2, mMActivity);
        pInt.value = y7Var.l();
        if (i19 > q94.a.f360928a) {
            y7Var.u(1, 2);
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
        if (z17) {
            y7Var.z(1);
        } else {
            y7Var.z(0);
        }
        if (iVar != null) {
            y7Var.U(iVar.f316692d, iVar.f316693e);
        }
        y7Var.N(this.f171618m);
        if (this.f171613h) {
            y7Var.N(5);
        }
        if (this.f171614i && (wXMediaMessage = this.f171615j) != null) {
            y7Var.R(wXMediaMessage.mediaTagName);
            java.lang.String str4 = this.f171612g;
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage2 = this.f171615j;
            y7Var.T(str4, wXMediaMessage2.messageExt, wXMediaMessage2.messageAction);
        }
        y7Var.E(this.f171619n, this.f171620o);
        y7Var.O(null, null, null, i27, i28);
        y7Var.t(str);
        y7Var.x(linkedList);
        y7Var.A(ed4Var);
        y7Var.W(linkedList2);
        y7Var.G(i17);
        y7Var.S(i18);
        y7Var.y(list2);
        if (mMActivity instanceof com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI) {
            android.content.Intent intent = mMActivity.getIntent();
            xa4.h[] hVarArr = xa4.h.f452837d;
            y7Var.j(intent.getIntExtra("spring_feed_type", 0));
        }
        m(y7Var);
        int i29 = y7Var.i();
        m21.w wVar = this.f171617l;
        if (wVar != null) {
            wVar.a(i29);
            com.tencent.mm.plugin.sns.statistics.x0.f164998b.b(this.f171617l);
        }
        mMActivity.setResult(-1, new android.content.Intent());
        com.tencent.mm.plugin.sns.model.l4.Nj().d();
        mMActivity.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        super.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        return this.f171616k;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        super.i(bundle);
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        this.f171617l = m21.w.f(mMActivity.getIntent());
        mMActivity.getIntent().getStringExtra("Kdescription");
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("Ksnsupload_appid");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f171612g = stringExtra;
        mMActivity.getIntent().getStringExtra("Ksnsupload_appname");
        this.f171613h = mMActivity.getIntent().getBooleanExtra("KThrid_app", false);
        this.f171614i = mMActivity.getIntent().getBooleanExtra("KSnsAction", false);
        this.f171618m = mMActivity.getIntent().getIntExtra("Ksnsupload_source", 0);
        android.os.Bundle bundleExtra = mMActivity.getIntent().getBundleExtra("Ksnsupload_timeline");
        if (bundleExtra != null) {
            this.f171615j = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req(bundleExtra).message;
        }
        if (mMActivity.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true)) {
            this.f171619n = 1;
        } else {
            this.f171619n = 0;
        }
        java.lang.String stringExtra2 = mMActivity.getIntent().getStringExtra("SendAppMessageWrapper_PkgName");
        this.f171620o = stringExtra2 != null ? stringExtra2 : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.NewTextWidget");
        return false;
    }
}
