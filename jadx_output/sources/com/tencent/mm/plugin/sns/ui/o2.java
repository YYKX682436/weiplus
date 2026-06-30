package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class o2 extends com.tencent.mm.plugin.sns.ui.n1 {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f170064g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f170065h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f170066i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f170067j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f170068k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f170069l;

    /* renamed from: m, reason: collision with root package name */
    public final int f170070m;

    /* renamed from: n, reason: collision with root package name */
    public m21.h f170071n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f170072o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f170073p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f170074q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f170075r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(com.tencent.mm.ui.MMActivity context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f170064g = "";
        this.f170070m = 34;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x00cd, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00cb, code lost:
    
        if (r3 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b0, code lost:
    
        if (r3 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ce, code lost:
    
        r13 = r3;
     */
    @Override // com.tencent.mm.plugin.sns.ui.z4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View b() {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.o2.b():android.view.View");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.tencent.mm.pointers.PInt pInt, java.lang.String str2, int i27, int i28) {
        r45.g92 b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        int o17 = o();
        com.tencent.mm.ui.MMActivity context = this.f169957c;
        com.tencent.mm.plugin.sns.model.y7 y7Var = new com.tencent.mm.plugin.sns.model.y7(o17, context);
        m21.h hVar = this.f170071n;
        if (hVar != null) {
            y7Var.L(hVar);
        }
        kotlin.jvm.internal.o.d(pInt);
        pInt.value = y7Var.l();
        if (i19 > q94.a.f360928a) {
            y7Var.u(1, 4);
        }
        y7Var.C(this.f170064g);
        y7Var.t(str);
        kotlin.jvm.internal.o.d(context);
        java.lang.String stringExtra = context.getIntent().getStringExtra("ksnsupload_link_desc");
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
            java.util.List b18 = k35.c.b();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                if (!((java.util.ArrayList) b18).contains(str3)) {
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
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f170065h)) {
            y7Var.J(this.f170065h);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f170066i)) {
            java.lang.String str4 = this.f170066i;
            y7Var.I(str4 != null ? str4 : "");
        }
        y7Var.A(ed4Var);
        y7Var.s(str2);
        y7Var.H(this.f170067j);
        y7Var.K(this.f170068k);
        m(y7Var);
        kotlin.jvm.internal.o.f(context, "context");
        p(context, y7Var);
        int i29 = y7Var.i();
        if (this.f170069l) {
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.P = i29;
        }
        m21.h hVar2 = this.f170071n;
        if (hVar2 != null && (b17 = hVar2.b()) != null) {
            ((b92.y0) ((m40.i0) i95.n0.c(m40.i0.class))).Ai(false, b17);
        }
        com.tencent.mm.plugin.sns.model.l4.Nj().d();
        context.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        super.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        boolean z17 = this.f170071n != null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        r45.g92 b17;
        java.util.Map d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        super.i(bundle);
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        kotlin.jvm.internal.o.d(mMActivity);
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("Ksnsupload_title");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f170064g = stringExtra;
        java.lang.String stringExtra2 = mMActivity.getIntent().getStringExtra("KPublisherId");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f170067j = stringExtra2;
        java.lang.String stringExtra3 = mMActivity.getIntent().getStringExtra("reportSessionId");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f170068k = stringExtra3;
        java.lang.String stringExtra4 = mMActivity.getIntent().getStringExtra("Ksnsupload_appid");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f170065h = stringExtra4;
        java.lang.String stringExtra5 = mMActivity.getIntent().getStringExtra("Ksnsupload_appname");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.f170066i = stringExtra5;
        this.f170069l = mMActivity.getIntent().getBooleanExtra("ksnsupload_finder_need_report", false);
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.Q = mMActivity.getIntent().getLongExtra("finder_feed_id", 0L);
        java.lang.String stringExtra6 = mMActivity.getIntent().getStringExtra("ksnsupload_finder_live_xml");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra6) && (d17 = com.tencent.mm.sdk.platformtools.aa.d(stringExtra6, "finderLive", null)) != null) {
            m21.h hVar = new m21.h();
            this.f170071n = hVar;
            hVar.d("", d17);
        }
        m21.h hVar2 = this.f170071n;
        if (hVar2 != null && (b17 = hVar2.b()) != null) {
            ((b92.y0) ((m40.i0) i95.n0.c(m40.i0.class))).Ai(true, b17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        return true;
    }

    public int o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsType", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsType", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        return this.f170070m;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        return false;
    }

    public void p(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.sns.model.y7 packHelper) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepareCommitPack", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(packHelper, "packHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareCommitPack", "com.tencent.mm.plugin.sns.ui.FinderLiveWidget");
    }
}
