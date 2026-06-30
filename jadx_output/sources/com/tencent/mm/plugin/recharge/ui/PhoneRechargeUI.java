package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class PhoneRechargeUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, ws3.u {
    public static final /* synthetic */ int Q = 0;
    public java.util.List M;
    public boolean N;

    /* renamed from: z, reason: collision with root package name */
    public int f155120z;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f155101d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f155102e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f155103f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.recharge.ui.form.MallFormView f155104g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f155105h = null;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f155106i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.GridView f155107m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.GridView f155108n = null;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f155109o = null;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f155110p = null;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f155111q = null;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f155112r = null;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f155113s = null;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f155114t = null;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.recharge.ui.r f155115u = null;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.recharge.ui.r f155116v = null;

    /* renamed from: w, reason: collision with root package name */
    public android.app.Dialog f155117w = null;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.mall.MallFunction f155118x = null;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f155119y = "";
    public java.util.ArrayList A = null;
    public java.util.ArrayList B = null;
    public vr4.e C = null;
    public vr4.e D = null;
    public vr4.e E = null;
    public vr4.e F = null;
    public vr4.e G = null;
    public java.lang.String H = "";
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public ws3.j f155100J = null;
    public vr4.a1 K = null;
    public boolean L = false;
    public final com.tencent.mm.sdk.event.IListener P = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletPayResultEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.22
        {
            this.__eventId = 520089918;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        
            if (r4 == null) goto L15;
         */
        @Override // com.tencent.mm.sdk.event.IListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean callback(com.tencent.mm.autogen.events.WalletPayResultEvent r7) {
            /*
                r6 = this;
                com.tencent.mm.autogen.events.WalletPayResultEvent r7 = (com.tencent.mm.autogen.events.WalletPayResultEvent) r7
                boolean r0 = r7 instanceof com.tencent.mm.autogen.events.WalletPayResultEvent
                r1 = 0
                java.lang.String r2 = "MicroMsg.PhoneRechargeUI"
                if (r0 == 0) goto L53
                am.s10 r7 = r7.f54965g
                boolean r0 = r7.f7865e
                if (r0 == 0) goto L15
                java.lang.String r7 = "WalletPayResultEvent is from kinda, ScanQRCodePay"
                com.tencent.mars.xlog.Log.f(r2, r7)
                goto L58
            L15:
                int r7 = r7.f7863c
                r0 = -1
                r3 = 1
                if (r7 != r0) goto L4c
                com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI r7 = com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.this
                boolean r0 = r7.I
                if (r0 != 0) goto L51
                java.lang.String r0 = "hy: MallRecharge pay result : ok"
                com.tencent.mars.xlog.Log.i(r2, r0)
                vs3.a r0 = new vs3.a
                com.tencent.mm.plugin.recharge.ui.form.MallFormView r2 = r7.f155104g
                java.lang.String r2 = r2.getText()
                ws3.j r4 = r7.f155100J
                vs3.a r4 = r4.f449182b
                if (r4 == 0) goto L3a
                java.lang.String r4 = r4.f439876b
                boolean r5 = com.tencent.mm.sdk.platformtools.t8.f192989a
                if (r4 != 0) goto L3c
            L3a:
                java.lang.String r4 = ""
            L3c:
                r0.<init>(r2, r4, r1)
                us3.e r1 = us3.e.Ai()
                r1.wi(r0)
                r7.finish()
                r7.I = r3
                goto L51
            L4c:
                java.lang.String r7 = "hy: MallRecharge pay result : cancel"
                com.tencent.mars.xlog.Log.i(r2, r7)
            L51:
                r1 = r3
                goto L58
            L53:
                java.lang.String r7 = "hy: mismatched event"
                com.tencent.mars.xlog.Log.f(r2, r7)
            L58:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.AnonymousClass22.callback(com.tencent.mm.sdk.event.IEvent):boolean");
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean T6(com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI r13, vr4.b1 r14) {
        /*
            ws3.j r0 = r13.f155100J
            vs3.a r0 = r0.f449182b
            r1 = 1
            if (r0 == 0) goto Le5
            com.tencent.mm.plugin.recharge.ui.form.MallFormView r2 = r13.f155104g
            java.lang.String r2 = r2.getText()
            int r3 = r13.f155120z
            r4 = 3
            r5 = 0
            if (r3 != r1) goto L1b
            r0 = 2131779963(0x7f10617b, float:1.9191498E38)
            java.lang.String r0 = r13.getString(r0)
            goto L80
        L1b:
            int r6 = r0.f439878d
            r7 = 2131779973(0x7f106185, float:1.9191518E38)
            r8 = 2131771201(0x7f103f41, float:1.9173726E38)
            r9 = 2
            if (r3 != r9) goto L39
            if (r6 == r4) goto L39
            java.lang.String r0 = r13.getString(r7)
            java.lang.String r3 = r14.f439691e
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0, r3}
            java.lang.String r0 = r13.getString(r8, r0)
            r7 = r0
            goto Lb9
        L39:
            r3 = 2131771200(0x7f103f40, float:1.9173724E38)
            if (r6 != r1) goto L5a
            java.lang.String r9 = r0.f439876b
            boolean r9 = com.tencent.mm.sdk.platformtools.t8.K0(r9)
            if (r9 == 0) goto L5a
            com.tencent.mm.plugin.recharge.ui.form.MallFormView r0 = r13.f155104g
            java.lang.String r0 = r0.getText()
            java.lang.String r2 = r13.getString(r7)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.lang.String r0 = r13.getString(r3, r0)
            r4 = 4
            goto L80
        L5a:
            if (r6 != 0) goto L83
            java.lang.String r0 = r0.f439877c
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r0 != 0) goto L70
            r0 = 2131771202(0x7f103f42, float:1.9173728E38)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r0 = r13.getString(r0, r2)
            goto L7f
        L70:
            r0 = 2131779970(0x7f106182, float:1.9191512E38)
            java.lang.String r0 = r13.getString(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.String r0 = r13.getString(r3, r0)
        L7f:
            r4 = 5
        L80:
            r7 = r0
            r9 = r4
            goto Lb9
        L83:
            r3 = 0
            if (r6 == r4) goto Lb7
            int r4 = r14.f439700q
            if (r4 != r1) goto Lb7
            java.lang.String r4 = r0.f439876b
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r4 != 0) goto L95
            java.lang.String r0 = r0.f439876b
            goto La2
        L95:
            java.lang.String r4 = r0.f439877c
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r4 != 0) goto La0
            java.lang.String r0 = r0.f439877c
            goto La2
        La0:
            java.lang.String r0 = ""
        La2:
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r4 != 0) goto Lb3
            java.lang.String r3 = r14.f439691e
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0, r3}
            java.lang.String r0 = r13.getString(r8, r0)
            goto Lb4
        Lb3:
            r0 = r3
        Lb4:
            r7 = r0
            r9 = r1
            goto Lb9
        Lb7:
            r7 = r3
            r9 = r5
        Lb9:
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r7)
            if (r0 != 0) goto Le5
            java.lang.String r8 = ""
            r0 = 2131771203(0x7f103f43, float:1.917373E38)
            java.lang.String r0 = r13.getString(r0)
            r1 = 2131759091(0x7f100ff3, float:1.9149164E38)
            java.lang.String r10 = r13.getString(r1)
            com.tencent.mm.plugin.recharge.ui.n0 r11 = new com.tencent.mm.plugin.recharge.ui.n0
            r11.<init>(r13, r14, r9)
            com.tencent.mm.plugin.recharge.ui.o0 r12 = new com.tencent.mm.plugin.recharge.ui.o0
            r12.<init>(r13, r9)
            r6 = r13
            r9 = r0
            com.tencent.mm.ui.widget.dialog.j0 r13 = db5.e1.A(r6, r7, r8, r9, r10, r11, r12)
            if (r13 == 0) goto Le4
            r13.setCanceledOnTouchOutside(r5)
        Le4:
            r1 = r5
        Le5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.T6(com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI, vr4.b1):boolean");
    }

    public static void U6(com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI, vr4.b1 b1Var) {
        java.lang.String str = phoneRechargeUI.f155119y;
        java.lang.String str2 = phoneRechargeUI.f155118x.f179819d;
        java.lang.String str3 = b1Var.f439690d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mobile=");
        sb6.append(vs3.b.a(phoneRechargeUI.f155104g.getText()));
        sb6.append("&markup=");
        vs3.a aVar = phoneRechargeUI.f155100J.f449182b;
        sb6.append(aVar != null ? aVar.f439876b : "");
        phoneRechargeUI.Y6(new vs3.h(str, str2, str3, sb6.toString()), true);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17620, b1Var.f439691e, b1Var.f439692f, 3);
    }

    public static boolean V6(com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        vs3.a aVar;
        phoneRechargeUI.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return false;
        }
        ws3.j jVar = phoneRechargeUI.f155100J;
        if (jVar == null || (aVar = jVar.f449182b) == null) {
            str5 = "";
            str6 = str5;
            str7 = str6;
        } else {
            str6 = aVar.f439876b;
            int i17 = aVar.f439878d;
            str5 = aVar.f439875a;
            str7 = i17 == 3 ? "1" : "0";
        }
        java.lang.String replace = str2.replace("{phone}", str5).replace("{remark}", str6).replace("{isbind}", str7);
        com.tencent.mars.xlog.Log.i("MicroMsg.PhoneRechargeUI", "weappID: %s, weappPath: %s", str, replace);
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7466a = str;
        nxVar.f7467b = replace != null ? replace : "";
        nxVar.f7469d = 1098;
        nxVar.f7468c = 0;
        startAppBrandUIFromOuterEvent.e();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17620, str3, str4, 2, str);
        return true;
    }

    public static java.lang.String W6(com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI, java.lang.String str) {
        vs3.a aVar;
        phoneRechargeUI.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        try {
            ws3.j jVar = phoneRechargeUI.f155100J;
            java.lang.String str2 = (jVar == null || (aVar = jVar.f449182b) == null || com.tencent.mm.sdk.platformtools.t8.K0(aVar.f439876b)) ? "" : phoneRechargeUI.f155100J.f449182b.f439876b;
            if (str2.equals(phoneRechargeUI.getString(com.tencent.mm.R.string.kxw))) {
                str2 = "WeChatAccountBindNumber";
            }
            java.lang.String text = phoneRechargeUI.f155104g.getText();
            java.lang.String encode = java.net.URLEncoder.encode(java.net.URLEncoder.encode(str2, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            if (!str.startsWith("http://") && !str.startsWith("https://")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PhoneRechargeUI", "old url");
                return java.net.URLDecoder.decode(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding) + java.lang.String.format("?phone=%s&remark=%s", text, encode);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PhoneRechargeUI", "new url");
            java.lang.String replace = str.indexOf("%7Bphone%7D") > 0 ? str.replace("%7Bphone%7D", text) : str.replace("{phone}", text);
            return replace.indexOf("%7Bremark%7D") > 0 ? replace.replace("%7Bremark%7D", encode) : replace.replace("{remark}", encode);
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PhoneRechargeUI", e17, "", new java.lang.Object[0]);
            return str;
        }
    }

    public static void X6(com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        phoneRechargeUI.getClass();
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            com.tencent.mm.wallet_core.ui.r1.T(phoneRechargeUI.getContext(), intent);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17620, str2, str3, 1, str);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PhoneRechargeUI", "hy: url decode failed: raw url: %s", str);
        }
    }

    public final void Y6(com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        android.app.Dialog dialog = this.f155117w;
        if (dialog == null || (dialog != null && !dialog.isShowing())) {
            if (z17) {
                this.f155117w = com.tencent.mm.wallet_core.ui.b2.h(getContext(), true, new com.tencent.mm.plugin.recharge.ui.s(this, m1Var));
            } else {
                this.f155117w = com.tencent.mm.wallet_core.ui.b2.e(getContext(), true, false, new com.tencent.mm.plugin.recharge.ui.t(this, m1Var));
            }
        }
        gm0.j1.d().g(m1Var);
    }

    public final void Z6() {
        this.A = new java.util.ArrayList();
        vr4.b1 b1Var = new vr4.b1();
        b1Var.f439691e = getString(com.tencent.mm.R.string.kxf);
        b1Var.f439693g = 0;
        vr4.b1 b1Var2 = new vr4.b1();
        b1Var2.f439691e = getString(com.tencent.mm.R.string.kxg);
        b1Var2.f439693g = 0;
        vr4.b1 b1Var3 = new vr4.b1();
        b1Var3.f439691e = getString(com.tencent.mm.R.string.kxh);
        b1Var3.f439693g = 0;
        vr4.b1 b1Var4 = new vr4.b1();
        b1Var4.f439691e = getString(com.tencent.mm.R.string.kxi);
        b1Var4.f439693g = 0;
        vr4.b1 b1Var5 = new vr4.b1();
        b1Var5.f439691e = getString(com.tencent.mm.R.string.kxj);
        b1Var5.f439693g = 0;
        vr4.b1 b1Var6 = new vr4.b1();
        b1Var6.f439691e = getString(com.tencent.mm.R.string.kxk);
        b1Var6.f439693g = 0;
        this.A.add(b1Var);
        this.A.add(b1Var2);
        this.A.add(b1Var3);
        this.A.add(b1Var4);
        this.A.add(b1Var5);
        this.A.add(b1Var6);
        this.B = new java.util.ArrayList();
        vr4.b1 b1Var7 = new vr4.b1();
        b1Var7.f439691e = getString(com.tencent.mm.R.string.kxl);
        b1Var7.f439693g = 0;
        vr4.b1 b1Var8 = new vr4.b1();
        b1Var8.f439691e = getString(com.tencent.mm.R.string.kxm);
        b1Var8.f439693g = 0;
        vr4.b1 b1Var9 = new vr4.b1();
        b1Var9.f439691e = getString(com.tencent.mm.R.string.kxn);
        b1Var9.f439693g = 0;
        this.B.add(b1Var7);
        this.B.add(b1Var8);
        this.B.add(b1Var9);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7(boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.a7(boolean, boolean):void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c9j;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            if (i17 == 2) {
                if (i18 != -1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PhoneRechargeUI", "hy: MallRecharge pay result : cancel");
                } else if (!this.I) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PhoneRechargeUI", "hy: MallRecharge pay result : ok");
                    us3.e.Ai().wi(new vs3.a(this.f155104g.getText(), this.f155104g.getTipsTv().getText().toString(), 0));
                    finish();
                    this.I = true;
                }
            }
        } else if (i18 == -1) {
            this.L = true;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.net.Uri data = intent.getData();
            if (data == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.PhoneRechargeUI", "hy: uri == null");
                return;
            }
            try {
                android.database.Cursor query = getContentResolver().query(data, null, null, null, null);
                java.lang.String str = null;
                if (query != null && query.getCount() > 0) {
                    query.moveToFirst();
                    int columnIndex = query.getColumnIndex("has_phone_number");
                    if (columnIndex <= 0 || query.getInt(columnIndex) > 0) {
                        java.lang.String string = query.getString(query.getColumnIndex("_id"));
                        android.database.Cursor query2 = getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = " + string, null, null);
                        if (query2 != null && query2.moveToFirst()) {
                            while (!query2.isAfterLast()) {
                                int columnIndex2 = query2.getColumnIndex("data1");
                                int columnIndex3 = query2.getColumnIndex("display_name");
                                java.lang.String string2 = query2.getString(columnIndex2);
                                java.lang.String string3 = query2.getString(columnIndex3);
                                if (string2 != null) {
                                    java.lang.String a17 = vs3.b.a(string2);
                                    if (android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(a17) && a17.length() == 11) {
                                        arrayList.add(a17);
                                    }
                                }
                                query2.moveToNext();
                                str = string3;
                            }
                        }
                        if (query2 != null) {
                            query2.close();
                        }
                    }
                }
                if (query != null && !query.isClosed()) {
                    query.close();
                }
                if (arrayList.size() > 1) {
                    com.tencent.mm.ui.widget.dialog.j0 S = db5.e1.S(this, getString(com.tencent.mm.R.string.kxy), arrayList, -1, null, new com.tencent.mm.plugin.recharge.ui.g0(this, arrayList, str));
                    if (S != null) {
                        S.setCanceledOnTouchOutside(true);
                    }
                } else if (arrayList.size() == 1) {
                    this.f155100J.b(new vs3.a((java.lang.String) arrayList.get(0), str, 1));
                    gm0.j1.d().g(new vs3.g(this.f155104g.getText(), 0));
                } else {
                    db5.e1.s(this, getString(com.tencent.mm.R.string.gsu), "");
                }
            } catch (java.lang.SecurityException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.PhoneRechargeUI", "hy: permission denied: %s", e17.toString());
                db5.e1.s(this, getString(com.tencent.mm.R.string.gsw), "");
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setActionbarColor(getActionbarColor());
        gm0.j1.d().a(1571, this);
        gm0.j1.d().a(com.tencent.mm.plugin.appbrand.jsapi.storage.m.CTRL_INDEX, this);
        this.f155118x = (com.tencent.mm.plugin.wallet_core.model.mall.MallFunction) getIntent().getParcelableExtra("key_func_info");
        this.N = getIntent().getBooleanExtra("key_need_show_remind_dialog", true);
        Z6();
        com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction = this.f155118x;
        if (mallFunction == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PhoneRechargeUI", "hy: function info is null");
            db5.t7.makeText(this, "function info is null", 1).show();
            finish();
            return;
        }
        setMMTitle(mallFunction.f179820e);
        setBackBtn(new com.tencent.mm.plugin.recharge.ui.c0(this));
        vr4.e eVar = new vr4.e();
        this.G = eVar;
        eVar.f439713e = getString(com.tencent.mm.R.string.kxt);
        this.G.f439712d = "http%3A%2F%2Fkf.qq.com%2Ftouch%2Fproduct%2Fwechatrecharge_app.html";
        this.f155101d = findViewById(com.tencent.mm.R.id.kuv);
        this.f155102e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.kaj);
        this.f155103f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kal);
        com.tencent.mm.plugin.recharge.ui.form.MallFormView mallFormView = (com.tencent.mm.plugin.recharge.ui.form.MallFormView) findViewById(com.tencent.mm.R.id.lmg);
        this.f155104g = mallFormView;
        if (mallFormView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            mallFormView.setLogicDelegate(new ws3.c());
        }
        ws3.j jVar = new ws3.j(this.f155104g);
        this.f155100J = jVar;
        ws3.e eVar2 = new ws3.e(jVar);
        com.tencent.mm.plugin.recharge.ui.form.MallFormView mallFormView2 = jVar.f449183c;
        android.widget.EditText editText = mallFormView2.f155164f;
        if (editText != null) {
            editText.addTextChangedListener(eVar2);
        }
        com.tencent.mm.plugin.recharge.ui.form.InstantAutoCompleteTextView instantAutoCompleteTextView = (com.tencent.mm.plugin.recharge.ui.form.InstantAutoCompleteTextView) mallFormView2.getContentEditText();
        s75.d.b(new ws3.f(jVar), "fetch_phone_book");
        ws3.y yVar = new ws3.y(mallFormView2, jVar.f449181a);
        jVar.f449184d = yVar;
        yVar.f449206p = this;
        instantAutoCompleteTextView.setShowAlways(true);
        instantAutoCompleteTextView.setAdapter(jVar.f449184d);
        instantAutoCompleteTextView.setOnItemClickListener(new ws3.g(jVar, instantAutoCompleteTextView));
        mallFormView2.setOnFocusChangeListener(new ws3.h(jVar, instantAutoCompleteTextView));
        instantAutoCompleteTextView.setOnClickListener(new ws3.i(jVar, instantAutoCompleteTextView));
        this.f155107m = (android.widget.GridView) findViewById(com.tencent.mm.R.id.lmy);
        this.f155109o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ln6);
        this.f155110p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ln7);
        this.f155111q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lme);
        this.f155112r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lmu);
        this.f155105h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486547ln0);
        this.f155106i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486549ln2);
        this.f155108n = (android.widget.GridView) findViewById(com.tencent.mm.R.id.lmh);
        this.f155113s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lmz);
        this.f155114t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486548ln1);
        this.f155104g.setOnInputValidChangeListener(new com.tencent.mm.plugin.recharge.ui.h0(this));
        this.f155104g.getInfoIv().setOnClickListener(new com.tencent.mm.plugin.recharge.ui.i0(this));
        com.tencent.mm.plugin.recharge.ui.r rVar = new com.tencent.mm.plugin.recharge.ui.r();
        this.f155115u = rVar;
        rVar.f155220e = new com.tencent.mm.plugin.recharge.ui.j0(this);
        com.tencent.mm.plugin.recharge.ui.r rVar2 = new com.tencent.mm.plugin.recharge.ui.r();
        this.f155116v = rVar2;
        rVar2.f155220e = new com.tencent.mm.plugin.recharge.ui.k0(this);
        this.f155107m.setAdapter((android.widget.ListAdapter) this.f155115u);
        this.f155108n.setAdapter((android.widget.ListAdapter) this.f155116v);
        this.f155102e.setOnClickListener(new com.tencent.mm.plugin.recharge.ui.l0(this));
        this.f155103f.setOnClickListener(new com.tencent.mm.plugin.recharge.ui.m0(this));
        this.f155104g.c();
        int B = (i65.a.B(this) / 4) - 20;
        com.tencent.mars.xlog.Log.i("MicroMsg.PhoneRechargeUI", "max width: %s", java.lang.Integer.valueOf(B));
        this.f155109o.setMaxWidth(B);
        this.f155110p.setMaxWidth(B);
        this.f155111q.setMaxWidth(B);
        this.f155112r.setMaxWidth(B);
        getResources().getColor(com.tencent.mm.R.color.a0c);
        vs3.a aVar = this.f155100J.f449182b;
        if (aVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(aVar.f439876b)) {
            java.lang.String str = this.f155100J.f449182b.f439876b;
        }
        this.f155104g.getContentEditText().setHintTextColor(getResources().getColor(com.tencent.mm.R.color.a2c));
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f155104g.getText())) {
            Y6(new vs3.g("", 0), false);
        } else {
            Y6(new vs3.g(this.f155104g.getText(), 0), false);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(1571, this);
        gm0.j1.d().q(com.tencent.mm.plugin.appbrand.jsapi.storage.m.CTRL_INDEX, this);
        this.P.dead();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        a7(false, true);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        if (!(m1Var instanceof vs3.g)) {
            if (m1Var instanceof vs3.h) {
                android.app.Dialog dialog = this.f155117w;
                if (dialog != null && dialog.isShowing() && m1Var.getType() != 497) {
                    this.f155117w.dismiss();
                    this.f155117w = null;
                }
                if (i17 == 0 && i18 == 0) {
                    com.tencent.mm.wallet_core.b.a().getClass();
                    ((h45.q) i95.n0.c(h45.q.class)).startWxpayQueryCashierPay(((vs3.h) m1Var).f439922f.f192114m, 6, 0);
                    this.P.alive();
                    return;
                } else {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        str = getString(com.tencent.mm.R.string.l0g);
                    }
                    db5.e1.G(this, str, "", false, new com.tencent.mm.plugin.recharge.ui.b0(this));
                    return;
                }
            }
            return;
        }
        vs3.g gVar = (vs3.g) m1Var;
        android.app.Dialog dialog2 = this.f155117w;
        if (dialog2 != null && dialog2.isShowing() && m1Var.getType() != 497) {
            this.f155117w.dismiss();
            this.f155117w = null;
        }
        if (gVar.f439919y != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PhoneRechargeUI", "do delete phone number");
            return;
        }
        java.lang.String str2 = gVar.f439903f;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !str2.equals(this.f155104g.getText())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PhoneRechargeUI", "hy: mobiel num not match.abourt, %s, %s", str2, this.f155104g.getText());
            return;
        }
        if (gVar.f439905h) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PhoneRechargeUI", "hy: cgi failed.");
            db5.e1.G(this, gVar.f439917w, "", false, new com.tencent.mm.plugin.recharge.ui.b0(this));
            this.f155119y = "";
            Z6();
            return;
        }
        this.f155119y = gVar.f439904g;
        this.f155120z = gVar.f439907m;
        this.A = gVar.f439908n;
        this.C = gVar.f439910p;
        this.D = gVar.f439911q;
        this.E = gVar.f439912r;
        this.F = gVar.f439913s;
        java.lang.String str3 = gVar.f439906i;
        this.H = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.PhoneRechargeUI", "desc: %s, mobile: %s", str3, this.f155104g.getText());
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.H)) {
            getResources().getColor(com.tencent.mm.R.color.a0c);
        } else {
            vs3.a aVar = this.f155100J.f449182b;
            if (aVar != null && aVar.f439875a.trim().equals(this.f155104g.getText())) {
                ws3.j jVar = this.f155100J;
                vs3.a aVar2 = jVar.f449182b;
                aVar2.f439877c = this.H;
                jVar.b(aVar2);
            }
        }
        this.K = gVar.f439915u;
        java.util.ArrayList arrayList = gVar.f439909o;
        this.B = arrayList;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                vr4.b1 b1Var = (vr4.b1) this.B.get(size);
                if (b1Var.f439691e.isEmpty()) {
                    this.B.remove(b1Var);
                }
            }
        }
        vr4.e eVar = gVar.f439914t;
        if (eVar == null || (eVar.f439713e.equals(this.G.f439713e) && gVar.f439914t.f439712d.equals(this.G.f439712d) && gVar.f439914t.f439714f.equals(this.G.f439714f) && gVar.f439914t.f439715g.equals(this.G.f439715g))) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.PhoneRechargeUI", "need to update head");
            this.G = gVar.f439914t;
            z17 = true;
        }
        a7(!this.H.equals(""), z17);
        us3.e.Ai().Ni(gVar.f439918x);
        if (this.f155100J != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f155104g.getText())) {
                this.f155100J.a(true);
            } else {
                this.f155100J.a(false);
            }
        }
        this.f155104g.postDelayed(new com.tencent.mm.plugin.recharge.ui.f0(this), 300L);
    }
}
