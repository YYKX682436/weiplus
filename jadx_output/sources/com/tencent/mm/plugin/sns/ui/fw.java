package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class fw extends com.tencent.mm.plugin.sns.ui.n1 {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f168363g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f168364h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f168365i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f168366j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.opensdk.modelmsg.WXMediaMessage f168367k;

    /* renamed from: l, reason: collision with root package name */
    public m21.w f168368l;

    /* renamed from: m, reason: collision with root package name */
    public int f168369m;

    /* renamed from: n, reason: collision with root package name */
    public int f168370n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f168371o;

    public fw(com.tencent.mm.ui.MMActivity mMActivity) {
        super(mMActivity);
        this.f168363g = "";
        this.f168364h = "";
        this.f168365i = false;
        this.f168366j = false;
        this.f168367k = null;
        this.f168368l = null;
        this.f168370n = 1;
        this.f168371o = "";
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.TextWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.TextWidget");
        return null;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.tencent.mm.pointers.PInt pInt, java.lang.String str2, int i27, int i28) {
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.TextWidget");
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage2 = this.f168367k;
        if (wXMediaMessage2 != null) {
            wXMediaMessage2.description = str;
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage2.mediaObject;
            if (iMediaObject != null && (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXTextObject)) {
                ((com.tencent.mm.opensdk.modelmsg.WXTextObject) iMediaObject).text = str;
            }
        }
        com.tencent.mm.plugin.sns.model.y7 s17 = com.tencent.mm.plugin.sns.model.l4.Nj().s(this.f168367k, str, this.f168363g, this.f168364h);
        if (s17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextWidget", "packHelper == null, %s, %s", this.f168363g, this.f168364h);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.TextWidget");
            return false;
        }
        pInt.value = s17.l();
        if (i19 > q94.a.f360928a) {
            s17.u(1, 4);
        }
        s17.N(this.f168369m);
        if (this.f168365i) {
            s17.N(5);
        }
        s17.x(linkedList);
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
        s17.W(linkedList2);
        if (iVar != null) {
            s17.U(iVar.f316692d, iVar.f316693e);
        }
        s17.A(ed4Var);
        if (z17) {
            s17.z(1);
        } else {
            s17.z(0);
        }
        s17.y(list2);
        s17.G(i17);
        s17.O(null, null, null, i27, i28);
        s17.E(this.f168370n, this.f168371o);
        if (this.f168366j && (wXMediaMessage = this.f168367k) != null) {
            s17.R(wXMediaMessage.mediaTagName);
            java.lang.String str4 = this.f168363g;
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage3 = this.f168367k;
            s17.T(str4, wXMediaMessage3.messageExt, wXMediaMessage3.messageAction);
        }
        m(s17);
        int i29 = s17.i();
        m21.w wVar = this.f168368l;
        if (wVar != null) {
            wVar.a(i29);
            com.tencent.mm.plugin.sns.statistics.x0.f164998b.b(this.f168368l);
        }
        com.tencent.mm.plugin.sns.model.l4.Nj().d();
        this.f169957c.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.TextWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.TextWidget");
        super.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.TextWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.TextWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.TextWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.TextWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.TextWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.TextWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.TextWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.TextWidget");
        super.i(bundle);
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        this.f168368l = m21.w.f(mMActivity.getIntent());
        mMActivity.getIntent().getStringExtra("Kdescription");
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("Ksnsupload_appid");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f168363g = stringExtra;
        java.lang.String stringExtra2 = mMActivity.getIntent().getStringExtra("Ksnsupload_appname");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f168364h = stringExtra2;
        this.f168365i = mMActivity.getIntent().getBooleanExtra("KThrid_app", false);
        this.f168366j = mMActivity.getIntent().getBooleanExtra("KSnsAction", false);
        this.f168369m = mMActivity.getIntent().getIntExtra("Ksnsupload_source", 0);
        this.f168367k = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req(mMActivity.getIntent().getBundleExtra("Ksnsupload_timeline")).message;
        if (mMActivity.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true)) {
            this.f168370n = 1;
        } else {
            this.f168370n = 0;
        }
        java.lang.String stringExtra3 = mMActivity.getIntent().getStringExtra("SendAppMessageWrapper_PkgName");
        this.f168371o = stringExtra3 != null ? stringExtra3 : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.TextWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.TextWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.TextWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.TextWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.TextWidget");
        return false;
    }
}
