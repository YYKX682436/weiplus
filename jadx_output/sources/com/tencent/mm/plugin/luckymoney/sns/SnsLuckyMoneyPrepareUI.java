package com.tencent.mm.plugin.luckymoney.sns;

@db5.a(19)
/* loaded from: classes9.dex */
public class SnsLuckyMoneyPrepareUI extends com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI implements com.tencent.mm.plugin.luckymoney.ui.ik {
    public static final /* synthetic */ int I = 0;
    public int A;
    public java.lang.String B;
    public int C;
    public boolean D;
    public com.tencent.mm.plugin.luckymoney.model.c1 E;
    public java.lang.String F;
    public int G;

    /* renamed from: p, reason: collision with root package name */
    public com.tenpay.android.wechat.MyKeyboardWindow f145762p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f145763q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f145764r;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f145766t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f145767u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewGroup f145768v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ScrollView f145769w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f145770x;

    /* renamed from: z, reason: collision with root package name */
    public int f145772z;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView f145756g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView f145757h = null;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView f145758i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f145759m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f145760n = null;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f145761o = null;

    /* renamed from: s, reason: collision with root package name */
    public android.app.Dialog f145765s = null;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.luckymoney.ui.c6 f145771y = new com.tencent.mm.plugin.luckymoney.ui.c6();
    public com.tencent.mm.sdk.platformtools.b4 H = null;

    static {
        com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.f492291fy2);
    }

    public static void V6(com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI) {
        android.view.View view = snsLuckyMoneyPrepareUI.f145763q;
        if (view == null || view.isShown()) {
            return;
        }
        android.view.View view2 = snsLuckyMoneyPrepareUI.f145763q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "showTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "showTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019a  */
    @Override // com.tencent.mm.plugin.luckymoney.ui.ik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D4(boolean r17, int r18) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.D4(boolean, int):void");
    }

    public final int W6() {
        if (this.D) {
            return getIntent().getIntExtra("key_chatroom_num", 0) > 0 ? 2 : 1;
        }
        return 3;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || this.f145766t.getVisibility() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        android.view.View view = this.f145766t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        U6();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489247bv4;
    }

    public void hideTenpayKB() {
        android.view.View view = this.f145763q;
        if (view == null || !view.isShown()) {
            return;
        }
        android.view.View view2 = this.f145763q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        throw null;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        getResources().getDrawable(com.tencent.mm.R.drawable.f481936c91);
        setBackBtn(new zb3.q(this));
        this.f145766t = findViewById(com.tencent.mm.R.id.j5g);
        this.f145767u = findViewById(com.tencent.mm.R.id.j5k);
        this.f145761o = (android.widget.Button) findViewById(com.tencent.mm.R.id.j5j);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView luckyMoneyTextInputView = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView) findViewById(com.tencent.mm.R.id.j7e);
        this.f145758i = luckyMoneyTextInputView;
        luckyMoneyTextInputView.setHintText(getString(com.tencent.mm.R.string.gjq));
        this.f145760n = (android.widget.Button) findViewById(com.tencent.mm.R.id.j58);
        this.f145762p = (com.tenpay.android.wechat.MyKeyboardWindow) findViewById(com.tencent.mm.R.id.tenpay_num_keyboard);
        this.f145763q = findViewById(com.tencent.mm.R.id.o1v);
        this.f145764r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485810j56);
        this.f145756g = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView) findViewById(com.tencent.mm.R.id.j4z);
        this.f145757h = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView) findViewById(com.tencent.mm.R.id.f485754iy1);
        this.f145759m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j5l);
        this.f145768v = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.j5e);
        this.f145769w = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.j6v);
        this.f145770x = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j5c);
        if (this.f145772z == 1) {
            this.f145757h.setTitle(getString(com.tencent.mm.R.string.go8));
            this.f145757h.setShowGroupIcon(true);
        } else {
            this.f145757h.setTitle(getString(com.tencent.mm.R.string.go9));
            this.f145757h.setShowGroupIcon(false);
        }
        this.f145757h.setOnInputValidChangerListener(this);
        this.f145756g.setOnInputValidChangerListener(this);
        this.f145758i.setOnInputValidChangerListener(this);
        android.widget.EditText editText = (android.widget.EditText) this.f145757h.findViewById(com.tencent.mm.R.id.j1d);
        android.widget.EditText editText2 = (android.widget.EditText) this.f145756g.findViewById(com.tencent.mm.R.id.j1d);
        com.tencent.mm.wallet_core.ui.r1.v0(editText);
        ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(editText, 0);
        editText.setOnClickListener(new zb3.y(this, editText, editText2));
        com.tencent.mm.wallet_core.ui.r1.v0(editText2);
        ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(editText2, 0);
        editText2.setOnClickListener(new zb3.z(this, editText, editText2));
        com.tencent.mm.plugin.luckymoney.model.c1 c1Var = this.E;
        if (c1Var != null) {
            if (this.f145772z == 1) {
                this.f145757h.setMaxAmount(c1Var.f145183e);
            } else {
                this.f145757h.setMaxAmount(c1Var.f145186h);
            }
            this.f145757h.setMinAmount(this.E.f145188m);
        }
        if (!this.D) {
            this.f145756g.setNum("");
        } else if (getIntent().getIntExtra("key_chatroom_num", 0) > 1) {
            this.f145756g.setNum("");
        } else {
            this.f145756g.setNum("1");
        }
        this.f145756g.setMaxNum(this.E.f145182d);
        if (this.f145772z == 1) {
            this.f145756g.setMinNum(1);
        } else {
            this.f145756g.setMinNum(1);
        }
        this.f145756g.getInput();
        this.f145757h.setMaxLen(12);
        if (!this.D) {
            int i17 = this.f145772z;
            if (i17 == 1) {
                this.f145764r.setText(this.E.f145184f);
                this.f145764r.setVisibility(0);
            } else if (i17 == 0) {
                this.f145764r.setText(this.E.f145185g);
                this.f145764r.setVisibility(0);
            }
        } else if (getIntent().getIntExtra("key_chatroom_num", 0) > 0) {
            java.lang.String string = getString(com.tencent.mm.R.string.gle);
            java.lang.String string2 = getString(com.tencent.mm.R.string.glb);
            java.lang.String string3 = getString(com.tencent.mm.R.string.gld);
            java.lang.String string4 = getString(com.tencent.mm.R.string.glc);
            android.text.SpannableString spannableString = new android.text.SpannableString(string + string2);
            com.tencent.mm.plugin.wallet_core.ui.b4 b4Var = new com.tencent.mm.plugin.wallet_core.ui.b4(this);
            spannableString.setSpan(b4Var, string.length(), string.length() + string2.length(), 33);
            android.text.SpannableString spannableString2 = new android.text.SpannableString(string3 + string4);
            com.tencent.mm.plugin.wallet_core.ui.b4 b4Var2 = new com.tencent.mm.plugin.wallet_core.ui.b4(this);
            spannableString2.setSpan(b4Var2, string3.length(), string3.length() + string4.length(), 33);
            b4Var.f180146d = new zb3.s(this, spannableString2);
            b4Var2.f180146d = new zb3.t(this, spannableString);
            this.f145764r.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            this.f145764r.setText(spannableString);
            this.f145764r.setVisibility(0);
        } else {
            this.f145756g.setVisibility(8);
        }
        this.f145760n.setOnClickListener(new zb3.v(this));
        this.f145759m.setText(com.tencent.mm.wallet_core.ui.r1.m(0.0d));
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView = this.f145756g;
        com.tencent.mm.plugin.luckymoney.ui.c6 c6Var = this.f145771y;
        c6Var.d(luckyMoneyNumInputView);
        c6Var.d(this.f145757h);
        c6Var.d(this.f145758i);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j5_);
        if (textView != null) {
            c6Var.f146781d = textView;
        } else {
            c6Var.getClass();
        }
        if (this.D && this.f145772z == 1) {
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j5d);
            textView2.setText(getString(com.tencent.mm.R.string.gmb, java.lang.Integer.valueOf(getIntent().getIntExtra("key_chatroom_num", 8))));
            textView2.setVisibility(0);
        }
        this.H = new com.tencent.mm.sdk.platformtools.b4(new zb3.w(this), false);
        android.widget.ScrollView scrollView = this.f145769w;
        if (scrollView != null) {
            scrollView.setOnTouchListener(new zb3.x(this));
        }
        this.f145757h.setType(this.f145772z);
        if (this.D && getIntent().getIntExtra("key_chatroom_num", 0) == 0) {
            this.f145757h.requestFocus();
        } else {
            this.f145756g.requestFocus();
        }
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            if (i17 == 2) {
                if (i18 == -1 && intent != null) {
                    java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 4, 0, 0, java.lang.Integer.valueOf(W6()), 7, stringExtra);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                        finish();
                    } else {
                        doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.n6(stringExtra.replaceAll(",", "|"), this.B, 1, "v1.0"));
                    }
                } else if (i18 == 0) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.setClass(getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI.class);
                    intent2.putExtra("key_type", 1);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent2);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        } else if (i18 == -1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 4, 0, 0, java.lang.Integer.valueOf(W6()), 5);
            java.lang.String stringExtra2 = getIntent().getStringExtra("key_username");
            if (!this.D || com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                T6();
                new com.tencent.mm.sdk.platformtools.n3().postDelayed(new zb3.i(this), 200L);
                this.f145761o.setOnClickListener(new zb3.k(this));
                ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.j59)).setOnClickListener(new zb3.l(this));
            } else {
                db5.e1.T(this, getString(com.tencent.mm.R.string.fw6));
                java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(this.F, "msg", null);
                if (d17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPrepareUI", "luckymoneyPrepareUI onActivityResult values is null");
                    finish();
                    return;
                }
                java.lang.String str = (java.lang.String) d17.get(".msg.appmsg.wcpayinfo.paymsgid");
                if (hb3.o.Ni().Ui().a(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "insert a local msg for luckymoney");
                    if (!com.tencent.mm.plugin.luckymoney.model.m5.C(this.F, stringExtra2, 1)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPrepareUI", "LuckyMoneyUtil.sendLocalMsg fail!");
                        hb3.o.Ni().Ui().b(str);
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyPrepareUI", "it is a duplicate msg");
                }
                finish();
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f145772z = getIntent().getIntExtra("key_type", 1);
        this.A = getIntent().getIntExtra("key_way", 3);
        this.D = getIntent().getIntExtra("key_from", 0) == 1;
        this.G = getIntent().getIntExtra("pay_channel", -1);
        doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.x5(0, "v1.0", 0), false);
        com.tencent.mm.plugin.luckymoney.model.c1 a17 = hb3.o.Ni().wi().a();
        this.E = a17;
        java.util.Objects.toString(a17);
        initView();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 4, 0, 0, java.lang.Integer.valueOf(W6()), 1);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.luckymoney.ui.c6 c6Var = this.f145771y;
        ((java.util.LinkedList) c6Var.f146778a).clear();
        c6Var.f146781d = null;
        this.H.e();
        android.app.Dialog dialog = this.f145765s;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f145765s.dismiss();
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        android.view.View view;
        if (i17 != 4 || (view = this.f145763q) == null || !view.isShown()) {
            return super.onKeyUp(i17, keyEvent);
        }
        hideTenpayKB();
        return true;
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof com.tencent.mm.plugin.luckymoney.model.h6) {
            android.app.Dialog dialog = this.f145765s;
            if (dialog != null && dialog.isShowing()) {
                this.f145765s.hide();
            }
            if (i17 != 0 || i18 != 0) {
                if (i18 != 401) {
                    db5.e1.T(this, str);
                    return true;
                }
                this.f145760n.setEnabled(false);
                this.f145760n.setClickable(false);
                this.H.c(5000L, 5000L);
                db5.e1.T(this, str);
                return true;
            }
            com.tencent.mm.plugin.luckymoney.model.h6 h6Var = (com.tencent.mm.plugin.luckymoney.model.h6) m1Var;
            this.C = h6Var.f145326n;
            this.B = h6Var.f145323h;
            this.F = h6Var.f145325m;
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
            payInfo.f192114m = h6Var.f145324i;
            payInfo.f192109e = 37;
            payInfo.f192111g = this.G;
            h45.a0.f(this, payInfo, 1);
            return true;
        }
        if (m1Var instanceof com.tencent.mm.plugin.luckymoney.model.n6) {
            if (i17 == 0 && i18 == 0) {
                if (this.D) {
                    db5.e1.T(this, getString(com.tencent.mm.R.string.fw6));
                    finish();
                } else {
                    T6();
                    this.f145767u.postDelayed(new zb3.d(this), 1000L);
                }
                return true;
            }
            if (i18 == 402) {
                db5.e1.A(getContext(), str, "", getString(com.tencent.mm.R.string.gnq), getString(com.tencent.mm.R.string.f490347sg), new zb3.e(this), new zb3.f(this));
                return true;
            }
        } else if (m1Var instanceof com.tencent.mm.plugin.luckymoney.model.x5) {
            if (i17 == 0 && i18 == 0) {
                com.tencent.mm.plugin.luckymoney.model.x5 x5Var = (com.tencent.mm.plugin.luckymoney.model.x5) m1Var;
                com.tencent.mm.plugin.luckymoney.model.c1 a17 = hb3.o.Ni().wi().a();
                this.E = a17;
                java.util.Objects.toString(a17);
                if (this.f145772z == 1) {
                    this.f145757h.setMaxAmount(this.E.f145183e);
                } else {
                    this.f145757h.setMaxAmount(this.E.f145186h);
                }
                this.f145757h.setMinAmount(this.E.f145188m);
                this.f145756g.setMaxNum(this.E.f145182d);
                if (x5Var.f145697i && this.D) {
                    android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j5a);
                    textView.setOnClickListener(new zb3.g(this));
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 4, 0, 0, java.lang.Integer.valueOf(W6()), 8);
                    textView.setVisibility(0);
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(x5Var.f145699n)) {
                    this.f145770x.setVisibility(8);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "Put notice :" + x5Var.f145699n);
                    this.f145770x.setText(x5Var.f145699n);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(x5Var.f145700o)) {
                        this.f145770x.setOnClickListener(new zb3.h(this, x5Var));
                    }
                    this.f145770x.setVisibility(0);
                }
                com.tencent.mm.plugin.luckymoney.ui.ok okVar = new com.tencent.mm.plugin.luckymoney.ui.ok();
                okVar.f147283a = getResources().getColor(com.tencent.mm.R.color.a_w);
                com.tencent.mm.plugin.luckymoney.ui.rk.a(this, this.f145768v, x5Var.f145707v, okVar);
            }
            return true;
        }
        return false;
    }

    public void setEditFocusListener(android.view.View view, int i17, boolean z17) {
        this.f145762p = (com.tenpay.android.wechat.MyKeyboardWindow) findViewById(com.tencent.mm.R.id.tenpay_num_keyboard);
        this.f145763q = findViewById(com.tencent.mm.R.id.o1v);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.tenpay_push_down);
        android.widget.EditText editText = (android.widget.EditText) view.findViewById(com.tencent.mm.R.id.j1d);
        if (this.f145762p == null || editText == null || this.f145763q == null) {
            return;
        }
        com.tencent.mm.wallet_core.ui.r1.v0(editText);
        editText.setOnFocusChangeListener(new zb3.o(this, z17, i17, editText));
        editText.setOnClickListener(new zb3.p(this, z17, i17, editText));
        findViewById.setOnClickListener(new zb3.r(this));
    }
}
