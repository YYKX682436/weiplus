package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class q6 implements ec4.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f170314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f170315b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f170316c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l56.i f170317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f170318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f170319f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.ed4 f170320g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f170321h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f170322i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f170323j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.util.List f170324k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PInt f170325l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f170326m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f170327n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f170328o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.i6 f170329p;

    public q6(com.tencent.mm.plugin.sns.ui.i6 i6Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.tencent.mm.pointers.PInt pInt, java.lang.String str2, int i27, int i28) {
        this.f170329p = i6Var;
        this.f170314a = snsInfo;
        this.f170315b = i17;
        this.f170316c = i18;
        this.f170317d = iVar;
        this.f170318e = str;
        this.f170319f = list;
        this.f170320g = ed4Var;
        this.f170321h = linkedList;
        this.f170322i = i19;
        this.f170323j = z17;
        this.f170324k = list2;
        this.f170325l = pInt;
        this.f170326m = str2;
        this.f170327n = i27;
        this.f170328o = i28;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r13, int r14) {
        /*
            r12 = this;
            java.lang.String r0 = "uploadFinish"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.NewSightWidget$6"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r13)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "commit >> %b, %d"
            java.lang.String r4 = "MicroMsg.NewSightWidget"
            com.tencent.mars.xlog.Log.i(r4, r3, r2)
            r2 = 0
            com.tencent.mm.plugin.sns.ui.i6 r3 = r12.f170329p
            if (r13 == 0) goto Lbd
            oi0.e r13 = oi0.e.f345591d
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r12.f170314a
            r13.c(r14, r4)
            java.lang.String r13 = "sns_table_"
            long r4 = (long) r14
            java.lang.String r13 = com.tencent.mm.plugin.sns.storage.w2.j(r13, r4)
            n34.h3 r4 = n34.h3.f334610d
            java.lang.String r5 = "access$1500"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.NewSightWidget"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            r45.ed4 r7 = r3.f168567h0
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            com.tencent.mm.ui.MMActivity r5 = r3.f169957c
            android.content.Intent r8 = r5.getIntent()
            java.lang.String r9 = "access$1600"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r6)
            boolean r10 = r3.f168590u
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r6)
            r9 = 1
            if (r10 == 0) goto L65
            java.lang.String r10 = "access$1700"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r6)
            java.lang.String r11 = r3.f168584q
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r6)
            java.lang.String r10 = "wxa5e0de08d96cc09d"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L65
            r10 = r9
            goto L66
        L65:
            r10 = r2
        L66:
            r4.l(r13, r7, r8, r10)
            com.tencent.mm.autogen.events.SightSendResultEvent r13 = new com.tencent.mm.autogen.events.SightSendResultEvent
            r13.<init>()
            am.su r4 = r13.f54784g
            r4.f7936a = r2
            r4.f7937b = r9
            r13.e()
            java.lang.String r13 = "access$1800"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r6)
            m21.w r4 = r3.f168580o
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r6)
            if (r4 == 0) goto L9b
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r6)
            m21.w r4 = r3.f168580o
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r6)
            r4.a(r14)
            com.tencent.mm.plugin.sns.statistics.z0 r14 = com.tencent.mm.plugin.sns.statistics.x0.f164998b
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r6)
            m21.w r3 = r3.f168580o
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r6)
            r14.b(r3)
        L9b:
            com.tencent.mm.plugin.sns.ui.f8 r13 = com.tencent.mm.plugin.sns.model.l4.qj()
            r13.a()
            android.content.Intent r13 = new android.content.Intent
            r13.<init>()
            android.content.Intent r14 = r5.getIntent()
            java.lang.String r3 = "is_spring"
            boolean r14 = r14.getBooleanExtra(r3, r2)
            r13.putExtra(r3, r14)
            r14 = -1
            r5.setResult(r14, r13)
            r5.finish()
            goto Lce
        Lbd:
            java.lang.String r13 = "fake video commit is error"
            com.tencent.mars.xlog.Log.i(r4, r13)
            com.tencent.mm.ui.MMActivity r13 = r3.f169957c
            r14 = 2131775217(0x7f104ef1, float:1.9181872E38)
            android.widget.Toast r13 = db5.t7.makeText(r13, r14, r2)
            r13.show()
        Lce:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.q6.a(boolean, int):void");
    }

    public void b(int i17, o55.a aVar, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("workFinish", "com.tencent.mm.plugin.sns.ui.NewSightWidget$6");
        com.tencent.mm.plugin.sns.ui.i6 i6Var = this.f170329p;
        if (android.text.TextUtils.equals(str, com.tencent.mm.plugin.sns.ui.i6.o(i6Var)) && !android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.ui.MMActivity mMActivity = i6Var.f169957c;
            if (aVar != null) {
                if (i17 == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "commit >> handleBackgroundVideo getRemuxVideoWork >> isSuccess workTagId: %s", str);
                    i6Var.Z = null;
                    com.tencent.mm.plugin.sns.ui.i6.p(i6Var, false);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    i6Var.v();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    str2 = "workFinish";
                    str3 = "com.tencent.mm.plugin.sns.ui.NewSightWidget$6";
                    this.f170329p.c(this.f170315b, this.f170316c, this.f170317d, this.f170318e, this.f170319f, this.f170320g, this.f170321h, this.f170322i, this.f170323j, this.f170324k, this.f170325l, this.f170326m, this.f170327n, this.f170328o);
                } else {
                    str2 = "workFinish";
                    str3 = "com.tencent.mm.plugin.sns.ui.NewSightWidget$6";
                    if (i17 == 3) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "commit >> handleBackgroundVideo getRemuxVideoWork >> isFailed workTagId: %s", str);
                        com.tencent.mm.plugin.sns.ui.i6.p(i6Var, false);
                        db5.t7.makeText(mMActivity, com.tencent.mm.R.string.iil, 0).show();
                        com.tencent.mm.plugin.sns.ui.i6.q(i6Var);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str3);
            }
            com.tencent.mm.plugin.sns.ui.i6.p(i6Var, false);
            db5.t7.makeText(mMActivity, com.tencent.mm.R.string.iil, 0).show();
            com.tencent.mm.plugin.sns.ui.i6.q(i6Var);
            com.tencent.mars.xlog.Log.e("MicroMsg.NewSightWidget", "commit >> handleBackgroundVideo getRemuxVideoWork >> isError: %s", str);
        }
        str2 = "workFinish";
        str3 = "com.tencent.mm.plugin.sns.ui.NewSightWidget$6";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str3);
    }
}
