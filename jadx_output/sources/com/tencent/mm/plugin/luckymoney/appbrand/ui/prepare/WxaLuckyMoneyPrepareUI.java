package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

@db5.a(19)
/* loaded from: classes9.dex */
public class WxaLuckyMoneyPrepareUI extends com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI implements ob3.c, com.tencent.mm.plugin.luckymoney.ui.ik {

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String f145030z = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.f492291fy2) + "/touch/scene_product.html?scene_id=kf7";

    /* renamed from: r, reason: collision with root package name */
    public com.tenpay.android.wechat.MyKeyboardWindow f145038r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f145039s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f145040t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f145041u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f145042v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.MMScrollView f145043w;

    /* renamed from: h, reason: collision with root package name */
    public ob3.a f145031h = null;

    /* renamed from: i, reason: collision with root package name */
    public lb3.i f145032i = lb3.i.RANDOM_LUCK;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView f145033m = null;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView f145034n = null;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView f145035o = null;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f145036p = null;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f145037q = null;

    /* renamed from: x, reason: collision with root package name */
    public int f145044x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.luckymoney.ui.c6 f145045y = new com.tencent.mm.plugin.luckymoney.ui.c6();

    /* JADX WARN: Removed duplicated region for block: B:57:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b4  */
    @Override // com.tencent.mm.plugin.luckymoney.ui.ik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D4(boolean r19, int r20) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI.D4(boolean, int):void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d_q;
    }

    public void hideTenpayKB() {
        android.view.View view = this.f145040t;
        if (view == null || !view.isShown()) {
            return;
        }
        android.view.View view2 = this.f145040t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setBackBtn(new ob3.p(this));
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView luckyMoneyTextInputView = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView) findViewById(com.tencent.mm.R.id.j7e);
        this.f145035o = luckyMoneyTextInputView;
        luckyMoneyTextInputView.setHintText(getString(com.tencent.mm.R.string.gjq));
        java.lang.String stringExtra = getIntent().getStringExtra("defaultWishingWord");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaLuckyMoneyPrepareUI", "initView defaultWishingWord = %s", stringExtra);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.f145035o.setHintText(stringExtra);
        }
        this.f145037q = (android.widget.Button) findViewById(com.tencent.mm.R.id.j58);
        this.f145038r = (com.tenpay.android.wechat.MyKeyboardWindow) findViewById(com.tencent.mm.R.id.tenpay_num_keyboard);
        this.f145040t = findViewById(com.tencent.mm.R.id.o1v);
        this.f145041u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485810j56);
        this.f145033m = (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView) findViewById(com.tencent.mm.R.id.j4z);
        this.f145034n = (com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView) findViewById(com.tencent.mm.R.id.f485754iy1);
        this.f145036p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j5l);
        this.f145043w = (com.tencent.mm.wallet_core.ui.MMScrollView) findViewById(com.tencent.mm.R.id.j6v);
        this.f145039s = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j5n);
        this.f145042v = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j5o);
        setMMTitle(com.tencent.mm.R.string.f492447go4);
        lb3.i iVar = this.f145032i;
        lb3.i iVar2 = lb3.i.RANDOM_LUCK;
        if (iVar == iVar2) {
            this.f145034n.setTitle(getString(com.tencent.mm.R.string.go8));
            this.f145034n.setShowGroupIcon(true);
        } else {
            this.f145034n.setTitle(getString(com.tencent.mm.R.string.go9));
            this.f145034n.setShowGroupIcon(false);
        }
        this.f145034n.setOnInputValidChangerListener(this);
        this.f145034n.setHint(getString(com.tencent.mm.R.string.glu));
        this.f145033m.setOnInputValidChangerListener(this);
        this.f145033m.setHint(getString(com.tencent.mm.R.string.gmc));
        this.f145033m.setNum("");
        this.f145035o.setOnInputValidChangerListener(this);
        android.widget.EditText editText = (android.widget.EditText) this.f145034n.findViewById(com.tencent.mm.R.id.j1d);
        android.widget.EditText editText2 = (android.widget.EditText) this.f145033m.findViewById(com.tencent.mm.R.id.j1d);
        com.tencent.mm.wallet_core.ui.r1.v0(editText);
        ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(editText, 0);
        editText.addTextChangedListener(new ob3.x(this));
        editText.setOnClickListener(new ob3.e(this, editText, editText2));
        editText.requestFocus();
        android.widget.TextView textView = (android.widget.TextView) this.f145034n.findViewById(com.tencent.mm.R.id.f485756iy3);
        if (textView != null) {
            textView.setOnClickListener(new ob3.f(this, editText, editText2));
        }
        com.tencent.mm.wallet_core.ui.r1.v0(editText2);
        ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(editText2, 0);
        editText2.setOnClickListener(new ob3.g(this, editText, editText2));
        ((com.tencent.mm.ui.widget.MMEditText) this.f145035o.findViewById(com.tencent.mm.R.id.j6x)).setOnFocusChangeListener(new ob3.h(this, editText, editText2));
        lb3.h hVar = lb3.h.GLOBAL;
        if (this.f145032i == iVar2) {
            com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView wxaLuckyMoneyMoneyInputView = this.f145034n;
            hVar.getClass();
            wxaLuckyMoneyMoneyInputView.setMaxAmount(2000.0d);
        } else {
            com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView wxaLuckyMoneyMoneyInputView2 = this.f145034n;
            hVar.getClass();
            wxaLuckyMoneyMoneyInputView2.setMaxAmount(200.0d);
        }
        com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView wxaLuckyMoneyMoneyInputView3 = this.f145034n;
        hVar.getClass();
        wxaLuckyMoneyMoneyInputView3.setMinAmount(0.01d);
        this.f145033m.setMaxNum(100);
        if (this.f145032i == iVar2) {
            this.f145033m.setMinNum(1);
        } else {
            this.f145033m.setMinNum(1);
        }
        this.f145034n.setMaxLen(12);
        java.lang.String string = getString(com.tencent.mm.R.string.gky);
        java.lang.String string2 = getString(com.tencent.mm.R.string.glb);
        java.lang.String string3 = getString(com.tencent.mm.R.string.gkt);
        java.lang.String string4 = getString(com.tencent.mm.R.string.glc);
        com.tencent.mm.plugin.wallet_core.ui.b4 b4Var = new com.tencent.mm.plugin.wallet_core.ui.b4(this);
        android.text.SpannableString spannableString = new android.text.SpannableString(string + string2);
        spannableString.setSpan(b4Var, string.length(), string.length() + string2.length(), 33);
        android.text.SpannableString spannableString2 = new android.text.SpannableString(string3 + string4);
        com.tencent.mm.plugin.wallet_core.ui.b4 b4Var2 = new com.tencent.mm.plugin.wallet_core.ui.b4(this);
        spannableString2.setSpan(b4Var2, string3.length(), string3.length() + string4.length(), 33);
        b4Var.f180146d = new ob3.t(this, spannableString2);
        b4Var2.f180146d = new ob3.u(this, spannableString);
        this.f145041u.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        this.f145041u.setText(spannableString);
        this.f145041u.setVisibility(0);
        this.f145037q.setClickable(false);
        this.f145037q.setEnabled(false);
        this.f145037q.setOnClickListener(new ob3.q(this, stringExtra));
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView = this.f145033m;
        com.tencent.mm.plugin.luckymoney.ui.c6 c6Var = this.f145045y;
        c6Var.d(luckyMoneyNumInputView);
        c6Var.d(this.f145034n);
        c6Var.d(this.f145035o);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j5_);
        if (textView2 != null) {
            c6Var.f146781d = textView2;
        } else {
            c6Var.getClass();
        }
        com.tencent.mm.wallet_core.ui.MMScrollView mMScrollView = this.f145043w;
        if (mMScrollView != null) {
            mMScrollView.setOnTouchListener(new ob3.r(this));
        }
        this.f145034n.setType(this.f145032i);
        addIconOptionMenu(0, com.tencent.mm.R.drawable.ama, new ob3.s(this));
        int intExtra = getIntent().getIntExtra("range", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaLuckyMoneyPrepareUI", "initRange range = %d", java.lang.Integer.valueOf(intExtra));
        this.f145039s.setVisibility(8);
        if (intExtra == 0) {
            this.f145044x = 0;
            return;
        }
        if (intExtra == 1) {
            this.f145044x = 1;
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(getString(com.tencent.mm.R.string.lbl));
        arrayList.add(getString(com.tencent.mm.R.string.lbm));
        this.f145039s.setVisibility(0);
        this.f145042v.setText((java.lang.CharSequence) arrayList.get(this.f145044x));
        this.f145039s.setOnClickListener(new ob3.w(this, arrayList));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        setResult(0, new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{user cancel}}"));
        finish();
    }

    @Override // com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        ob3.a0 a0Var = new ob3.a0();
        this.f145031h = a0Var;
        android.content.Intent intent = getIntent();
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "onCreate ");
        a0Var.f344044e = intent.getStringExtra("appId");
        a0Var.f344043d = this;
    }

    @Override // com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.luckymoney.ui.c6 c6Var = this.f145045y;
        ((java.util.LinkedList) c6Var.f146778a).clear();
        c6Var.f146781d = null;
        ob3.a aVar = this.f145031h;
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "onDestroy ");
            ((ob3.a0) aVar).f344043d = null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        android.view.View view;
        if (i17 != 4 || (view = this.f145040t) == null || !view.isShown()) {
            return super.onKeyUp(i17, keyEvent);
        }
        android.view.View view2 = this.f145040t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    public void setEditFocusListener(android.view.View view, int i17, boolean z17) {
        this.f145038r = (com.tenpay.android.wechat.MyKeyboardWindow) findViewById(com.tencent.mm.R.id.tenpay_num_keyboard);
        this.f145040t = findViewById(com.tencent.mm.R.id.o1v);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.tenpay_push_down);
        android.widget.EditText editText = (android.widget.EditText) view.findViewById(com.tencent.mm.R.id.j1d);
        if (this.f145038r == null || editText == null || this.f145040t == null) {
            return;
        }
        com.tencent.mm.wallet_core.ui.r1.v0(editText);
        editText.setOnFocusChangeListener(new ob3.k(this, z17, i17, editText));
        editText.setOnClickListener(new ob3.l(this, z17, i17, editText));
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f485756iy3);
        if (textView != null) {
            textView.setOnClickListener(new ob3.n(this, z17, editText, view, i17));
        }
        findViewById.setOnClickListener(new ob3.o(this));
    }
}
