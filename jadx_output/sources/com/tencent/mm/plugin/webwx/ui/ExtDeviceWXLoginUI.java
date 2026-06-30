package com.tencent.mm.plugin.webwx.ui;

@db5.a(3)
/* loaded from: classes11.dex */
public class ExtDeviceWXLoginUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f187960J = 0;
    public android.widget.CheckBox A;
    public android.widget.RelativeLayout B;
    public android.widget.CheckBox C;

    /* renamed from: h, reason: collision with root package name */
    public long f187965h;

    /* renamed from: i, reason: collision with root package name */
    public int f187966i;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f187969o;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f187971q;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f187976v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f187977w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f187978x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f187979y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.RelativeLayout f187980z;

    /* renamed from: d, reason: collision with root package name */
    public int f187961d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f187962e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f187963f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f187964g = null;

    /* renamed from: m, reason: collision with root package name */
    public android.app.ProgressDialog f187967m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f187968n = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f187970p = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f187972r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f187973s = false;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f187974t = "";

    /* renamed from: u, reason: collision with root package name */
    public int f187975u = 0;
    public boolean D = false;
    public boolean E = false;
    public int F = 0;
    public java.lang.String G = "";
    public boolean H = true;
    public final com.tencent.mm.sdk.event.IListener I = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WebViewExWindowCloseEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI.11
        {
            this.__eventId = 1684674094;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WebViewExWindowCloseEvent webViewExWindowCloseEvent) {
            com.tencent.mm.autogen.events.WebViewExWindowCloseEvent webViewExWindowCloseEvent2 = webViewExWindowCloseEvent;
            if (webViewExWindowCloseEvent2.f54984g.f7220a.equals("continue_login")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ExtDeviceWXLoginUI", "continue login, only set isStartVerify false");
                com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI.this.D = false;
            } else if (webViewExWindowCloseEvent2.f54984g.f7220a.equals("cancel_login")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ExtDeviceWXLoginUI", "cancel login, but do nothing");
            }
            return false;
        }
    };

    public final boolean U6() {
        c01.d9.e().g(new iy4.x0(this.f187962e));
        this.D = false;
        if (X6()) {
            this.H = false;
            q61.j.e(q61.j.f360268h, 1, 2, 2, 0);
        }
        return true;
    }

    public final boolean V6(boolean z17, boolean z18) {
        if (X6()) {
            this.H = false;
            java.lang.String str = q61.j.f360268h;
            com.tencent.mars.xlog.Log.i("ReportPushLoginURLMainDevice", "reportComfirmPageClk");
            java.util.HashMap d17 = q61.j.d();
            d17.put("page_id", "50368");
            d17.put("page_name", "LoginAssistAgreePage");
            d17.put("login_ticket_id", str);
            d17.put("has_sync_chat_login", java.lang.Integer.valueOf(z17 ? 1 : 0));
            d17.put("view_id", "login_agree_assist");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", d17, 34575);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtDeviceWXLoginUI", "doDeviceWXLogin synchronize:%s, autoLogin:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        iy4.z0 z0Var = new iy4.z0(this.f187962e, this.f187964g, z17, z18, this.f187965h, this.F);
        c01.d9.e().g(z0Var);
        this.f187967m = db5.e1.Q(getContext(), null, getString(com.tencent.mm.R.string.pag), true, true, new com.tencent.mm.plugin.webwx.ui.a(this, z0Var));
        return true;
    }

    public final void W6() {
        int i17 = this.f187961d;
        if (i17 != 0) {
            if (i17 == -2) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("BaseScanUI_select_scan_mode", 1);
                intent.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
                intent.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 2);
                intent.putExtra("key_scan_report_enter_scene", 29);
                intent.putExtra("from_album", false);
                intent.putExtra("show_intro", false);
                intent.setFlags(65536);
                j45.l.j(this, "scanner", ".ui.BaseScanUI", intent, null);
                finish();
                return;
            }
            return;
        }
        boolean isChecked = this.A.isChecked();
        if (!this.f187972r) {
            V6(false, isChecked);
            return;
        }
        boolean isChecked2 = this.C.isChecked();
        this.f187973s = false;
        if (isChecked2) {
            c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_MSG_SYNCHRONIZE_BOOLEAN, java.lang.Boolean.TRUE);
        } else {
            com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_MSG_SYNCHRONIZE_BOOLEAN;
            if (((java.lang.Boolean) p17.m(u3Var, java.lang.Boolean.TRUE)).booleanValue()) {
                this.f187973s = true;
            }
            c01.d9.b().p().x(u3Var, java.lang.Boolean.FALSE);
        }
        V6(this.f187972r && isChecked2, isChecked);
    }

    public final boolean X6() {
        java.lang.String str = this.f187962e;
        if (str == null) {
            return false;
        }
        return str.substring(str.lastIndexOf("/") + 1).equals(q61.j.f360268h);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Y6(int r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            int r0 = i65.a.b(r4, r6)
            int r5 = r5 / r0
            android.widget.TextView r0 = r4.f187978x
            int r0 = r0.getMeasuredWidth()
            android.widget.TextView r1 = r4.f187979y
            int r1 = r1.getVisibility()
            r2 = 0
            if (r1 != 0) goto L2a
            android.widget.TextView r1 = r4.f187979y
            android.text.TextPaint r1 = r1.getPaint()
            float r1 = r1.measureText(r7)
            int r1 = (int) r1
            if (r0 <= 0) goto L2a
            int r3 = r1 / r0
            int r3 = r3 + r2
            int r1 = r1 % r0
            if (r1 <= 0) goto L2b
            int r3 = r3 + 1
            goto L2b
        L2a:
            r3 = r2
        L2b:
            android.widget.TextView r1 = r4.f187978x
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L49
            android.widget.TextView r1 = r4.f187978x
            android.text.TextPaint r1 = r1.getPaint()
            float r7 = r1.measureText(r7)
            int r7 = (int) r7
            if (r0 <= 0) goto L49
            int r1 = r7 / r0
            int r1 = r1 + r2
            int r7 = r7 % r0
            if (r7 <= 0) goto L4a
            int r1 = r1 + 1
            goto L4a
        L49:
            r1 = r2
        L4a:
            int r3 = r3 + r1
            if (r3 <= r5) goto L4e
            return r2
        L4e:
            int r5 = i65.a.b(r4, r6)
            android.widget.TextView r6 = r4.f187979y
            float r5 = (float) r5
            r6.setTextSize(r2, r5)
            android.widget.TextView r6 = r4.f187978x
            r6.setTextSize(r2, r5)
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI.Y6(int, int, java.lang.String):boolean");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        if (X6() && this.H) {
            q61.j.e(q61.j.f360268h, 1, 2, 1, 0);
        }
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488705a43;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.mac);
        setBackBtn(new com.tencent.mm.plugin.webwx.ui.b(this), com.tencent.mm.R.raw.actionbar_icon_close_black);
        hideActionbarLine();
        this.f187962e = getIntent().getStringExtra("intent.key.login.url");
        this.f187963f = getIntent().getStringExtra("intent.key.auto.login.switch.tip.string");
        this.f187961d = getIntent().getIntExtra("intent.key.type", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("intent.key.title.string");
        this.F = getIntent().getIntExtra("intent.key.icon.type", 0);
        java.lang.String stringExtra2 = getIntent().getStringExtra("intent.key.ok.string");
        java.lang.String stringExtra3 = getIntent().getStringExtra("intent.key.cancel.string");
        java.lang.String stringExtra4 = getIntent().getStringExtra("intent.key.content.string");
        this.f187964g = getIntent().getStringExtra("intent.key.ok.session.list");
        this.f187965h = getIntent().getLongExtra("intent.key.login.client.version", 0L);
        this.f187966i = getIntent().getIntExtra("intent.key.function.control", 0);
        this.f187968n = getIntent().getBooleanExtra("intent.key.need.show.syncmsg.btn", false);
        this.G = getIntent().getStringExtra("intent.key.usage.link");
        this.f187974t = getIntent().getStringExtra("intent.key.spam.url");
        this.f187975u = getIntent().getIntExtra("intent.key.multi.device.tips.type", 0);
        this.f187976v = getIntent().getStringExtra("intent.key.multi.device.tips.string");
        this.E = getIntent().getBooleanExtra("intent.key.need.show.privacy.agreement", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtDeviceWXLoginUI", "type:%s title:%s ok:%s content:%s usage:%s iconType:%s multiDeviceTipsType:%s multiDeviceTipsStr:%s, funcCtrl:%s", java.lang.Integer.valueOf(this.f187961d), stringExtra, stringExtra2, stringExtra4, this.G, java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(this.f187975u), com.tencent.mm.sdk.platformtools.t8.G1(this.f187976v), java.lang.Integer.valueOf(this.f187966i));
        this.f187977w = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487099ni1);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.f187977w.setText(stringExtra);
        }
        com.tencent.mm.ui.bk.s0(this.f187977w.getPaint());
        com.tencent.mm.autogen.events.MsgSynchronizeABTestEvent msgSynchronizeABTestEvent = new com.tencent.mm.autogen.events.MsgSynchronizeABTestEvent();
        msgSynchronizeABTestEvent.e();
        am.yj yjVar = msgSynchronizeABTestEvent.f54501g;
        int i17 = yjVar.f8465a;
        int i18 = yjVar.f8466b;
        int i19 = yjVar.f8467c;
        int i27 = this.F;
        if (i27 == 1) {
            c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_LOGIN_EXT_DEVICE_INFO_INT, 3);
        } else if (i27 == 2) {
            c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_LOGIN_EXT_DEVICE_INFO_INT, 4);
        } else if (i27 != 8) {
            c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_LOGIN_EXT_DEVICE_INFO_INT, 0);
        } else {
            c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_LOGIN_EXT_DEVICE_INFO_INT, 2);
        }
        this.f187979y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.juq);
        if (this.f187975u != 0 && com.tencent.mm.sdk.platformtools.t8.K0(this.f187976v)) {
            this.f187975u = 0;
        }
        this.B = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.nuk);
        this.C = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.nuj);
        if (i17 >= 0) {
            boolean z17 = (this.f187966i & 1) > 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.ExtDeviceWXLoginUI", "msgsynchronize needCheckedSync[%b], iconType[%d]", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.F));
            int i28 = this.F;
            if ((i28 == 1 && this.f187965h >= i18) || ((i28 == 2 && this.f187965h >= i19) || i28 == 8 || i28 == 3 || i28 == 11 || i28 == 16 || i28 == 17)) {
                this.f187972r = true;
                this.B.setVisibility(this.f187968n ? 0 : 8);
                if (z17 && ((java.lang.Boolean) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_MSG_SYNCHRONIZE_BOOLEAN, java.lang.Boolean.TRUE)).booleanValue()) {
                    this.C.setChecked(true);
                } else {
                    this.C.setChecked(false);
                }
                this.B.setOnClickListener(new com.tencent.mm.plugin.webwx.ui.c(this));
            }
        }
        this.f187980z = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.a9j);
        this.A = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.a9h);
        if ((this.f187966i & 2) > 0) {
            this.f187980z.setVisibility(0);
            this.A.setChecked((this.f187966i & 4) > 0);
            this.f187980z.setOnClickListener(new com.tencent.mm.plugin.webwx.ui.f(this));
        } else {
            this.f187980z.setVisibility(8);
        }
        this.f187978x = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nhp);
        this.A.post(new com.tencent.mm.plugin.webwx.ui.g(this, stringExtra4));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.G)) {
            int i29 = this.F;
            if (i29 != 1 && i29 != 11 && i29 != 2 && i29 != 8 && i29 != 3 && i29 != 17) {
                addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_help, new com.tencent.mm.plugin.webwx.ui.i(this));
            } else if (this.f187968n) {
                addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_help, new com.tencent.mm.plugin.webwx.ui.h(this));
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.nhu);
        int i37 = this.F;
        if (i37 == 1) {
            imageView.setImageResource(com.tencent.mm.R.raw.connect_pc);
        } else if (i37 == 2) {
            imageView.setImageResource(com.tencent.mm.R.raw.connect_mac);
        } else if (i37 == 3) {
            imageView.setImageResource(com.tencent.mm.R.raw.connect_ipad);
        } else if (i37 == 5) {
            imageView.setImageResource(com.tencent.mm.R.raw.connect_wx_album);
        } else if (i37 == 6) {
            imageView.setImageResource(com.tencent.mm.R.raw.ex_connect_car);
        } else if (i37 == 8) {
            imageView.setImageResource(com.tencent.mm.R.raw.connect_android_pad);
        } else if (i37 == 10) {
            imageView.setImageResource(com.tencent.mm.R.raw.connect_folder);
        } else if (i37 == 14) {
            imageView.setImageResource(com.tencent.mm.R.raw.connect_watch);
        } else if (i37 == 17) {
            imageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_device_phone_large);
        } else {
            imageView.setImageResource(com.tencent.mm.R.raw.connect_pc);
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pjd);
        this.f187971q = textView;
        textView.setText(stringExtra3);
        this.f187971q.setOnClickListener(new com.tencent.mm.plugin.webwx.ui.j(this));
        com.tencent.mm.ui.bk.s0(this.f187971q.getPaint());
        this.f187969o = (android.widget.Button) findViewById(com.tencent.mm.R.id.pjb);
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            this.f187969o.setVisibility(4);
        } else {
            this.f187969o.setText(stringExtra2);
            int i38 = this.f187961d;
            if (i38 == 0) {
                this.f187969o.setEnabled(true);
            } else if (i38 == -1) {
                this.f187969o.setEnabled(false);
                if (this.F == 5) {
                    this.f187971q.setVisibility(8);
                }
            } else if (i38 == -2) {
                this.f187969o.setEnabled(true);
            }
        }
        this.f187969o.setOnClickListener(new com.tencent.mm.plugin.webwx.ui.k(this));
        if (this.E) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(this);
            java.lang.String obj = gm0.j1.u().c().l(274436, "").toString();
            if (com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
                obj = com.tencent.mm.sdk.platformtools.m2.e();
            }
            java.lang.String str = (com.tencent.mm.sdk.platformtools.t8.K0(obj) || com.tencent.mm.sdk.platformtools.t8.x0(obj)) ? obj : "";
            arrayList.add(getString(com.tencent.mm.R.string.l3e, f17, str));
            arrayList.add(getString(com.tencent.mm.R.string.l3n, f17, str));
            java.lang.String string = getString(com.tencent.mm.R.string.ma_);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(getString(com.tencent.mm.R.string.ioe));
            arrayList2.add(getString(com.tencent.mm.R.string.io_));
            ((ke0.e) xVar).sj(this, arrayList, string, arrayList2, (android.widget.TextView) findViewById(com.tencent.mm.R.id.r8b));
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.r8a);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.r8_);
            checkBox.setChecked(false);
            this.f187969o.setEnabled(false);
            checkBox.setOnClickListener(new com.tencent.mm.plugin.webwx.ui.l(this, checkBox));
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nuc);
        iy4.z zVar = (iy4.z) i95.n0.c(iy4.z.class);
        long j17 = this.f187965h;
        int i39 = this.F;
        zVar.getClass();
        boolean b17 = com.tencent.wechat.aff.ext_device.m.f216700c.b(j17, i39);
        ot5.g.c("MicroMsg.ExtDeviceService", "getSyncRecordTrigger: " + b17);
        if (b17) {
            textView2.setText(getString(com.tencent.mm.R.string.pgz));
        } else {
            textView2.setText(getString(com.tencent.mm.R.string.l7u));
        }
        c01.d9.e().a(972, this);
        c01.d9.e().a(973, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 60001) {
            if (intent != null) {
                android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
                if (i18 == -1 && bundleExtra != null) {
                    java.lang.String string = bundleExtra.getString("go_next", "");
                    if (string.equals("continue_login")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ExtDeviceWXLoginUI", "continue login");
                        this.D = false;
                        W6();
                    } else if (string.equals("cancel_login")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ExtDeviceWXLoginUI", "cancel login");
                        U6();
                    }
                }
            }
            if (this.D) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ExtDeviceWXLoginUI", "do cancel for other scenes");
                U6();
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aao));
        initView();
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
        this.I.alive();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.I.dead();
        super.onDestroy();
        c01.d9.e().q(972, this);
        c01.d9.e().q(973, this);
        if (isChangingConfigurations() || !this.f187970p) {
            return;
        }
        gm0.j1.d().g(new iy4.x0(this.f187962e));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        com.tencent.mm.protobuf.g gVar;
        android.app.ProgressDialog progressDialog = this.f187967m;
        java.lang.String str3 = null;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f187967m = null;
        }
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExtDeviceWXLoginUI", "onSceneEnd type[%d], [%d, %d]", java.lang.Integer.valueOf(m1Var.getType()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
            c01.d9.e().q(972, this);
            if (m1Var.getType() == 972) {
                iy4.z0 z0Var = (iy4.z0) m1Var;
                boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_device_to_device_msg_sync, 1) == 1;
                if ((z0Var.f296037f || this.f187973s) && z17) {
                    com.tencent.mm.modelbase.o oVar = z0Var.f296036e;
                    r45.zm0 zm0Var = (r45.zm0) oVar.f70711b.f70700a;
                    byte[] g17 = (zm0Var == null || (gVar = zm0Var.f392207d) == null) ? null : gVar.g();
                    com.tencent.mm.autogen.events.MsgSynchronizeStartEvent msgSynchronizeStartEvent = new com.tencent.mm.autogen.events.MsgSynchronizeStartEvent();
                    am.zj zjVar = msgSynchronizeStartEvent.f54502g;
                    zjVar.f8570a = g17;
                    zjVar.f8571b = this.F;
                    zjVar.f8572c = this.f187973s;
                    r45.zm0 zm0Var2 = (r45.zm0) oVar.f70711b.f70700a;
                    if (zm0Var2 != null && (str2 = zm0Var2.f392208e) != null) {
                        str3 = str2;
                    }
                    zjVar.f8573d = str3;
                    msgSynchronizeStartEvent.e();
                }
            } else {
                m1Var.getType();
            }
            this.f187961d = 0;
            this.f187970p = false;
            finish();
            return;
        }
        if (i18 == -1) {
            this.f187961d = -1;
        } else if (i18 == -2) {
            this.f187961d = -2;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.nhp)).setVisibility(0);
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.nhp)).setText(str);
        }
        int i19 = this.f187961d;
        if (i19 == -1) {
            android.widget.Button button = this.f187969o;
            if (button != null) {
                button.setEnabled(false);
            }
            android.widget.TextView textView = this.f187978x;
            if (textView != null) {
                textView.setVisibility(0);
                this.f187978x.setText(com.tencent.mm.R.string.maa);
            }
        } else if (i19 == -2) {
            android.widget.Button button2 = this.f187969o;
            if (button2 != null) {
                button2.setEnabled(true);
                this.f187969o.setText(com.tencent.mm.R.string.l7v);
            }
            android.widget.TextView textView2 = this.f187978x;
            if (textView2 != null) {
                textView2.setVisibility(0);
                this.f187978x.setText(com.tencent.mm.R.string.mab);
            }
            android.widget.TextView textView3 = this.f187971q;
            if (textView3 != null) {
                textView3.setVisibility(4);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtDeviceWXLoginUI", "[oneliang][onSceneEnd]errType:%s,errCode:%s,errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (X6()) {
            q61.j.e(q61.j.f360268h, 1, 3, 0, 6);
        }
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(my4.c.class);
    }
}
