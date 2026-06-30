package com.tencent.mm.plugin.luckymoney.appbrand.ui.receive;

@db5.a(3)
/* loaded from: classes9.dex */
public class WxaLuckyMoneyReceiveUI extends com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI implements pb3.b {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f145046y = 0;

    /* renamed from: m, reason: collision with root package name */
    public pb3.a f145049m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f145050n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f145051o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f145052p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f145053q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.Button f145054r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f145055s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f145056t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f145057u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f145058v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f145059w;

    /* renamed from: h, reason: collision with root package name */
    public int f145047h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f145048i = -1;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f145060x = null;

    public final void U6() {
        if (this.f145054r == null) {
            return;
        }
        java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (o17 == null || o17.length() <= 0 || !(o17.equals("zh_CN") || o17.equals("zh_TW") || o17.equals("zh_HK"))) {
            this.f145054r.setBackgroundResource(com.tencent.mm.R.drawable.amv);
            this.f145054r.setText(com.tencent.mm.R.string.gmm);
        }
    }

    public final void V6(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaLuckyMoneyReceiveUI", "setBackResult cgiType:[%d],errCode:[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 1) {
            setResult(0, new android.content.Intent().putExtra("result_error_code", 10001).putExtra("result_error_msg", "fail:no permission to receive the red packet"));
        } else if (i17 == 4) {
            setResult(0, new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{user cancel}}"));
        }
    }

    public final void W6(android.widget.TextView textView, int i17) {
        int f17 = (int) (i65.a.f(getContext(), i17) * i65.a.w(getContext()));
        int h17 = i65.a.h(getContext(), i17);
        if (h17 <= f17) {
            f17 = h17;
        }
        textView.setTextSize(0, f17);
    }

    public final void X6(boolean z17, boolean z18) {
        if (!z17) {
            android.view.View view = this.f145056t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "showCheckDetailBtnOrImg", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "showCheckDetailBtnOrImg", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f145057u.setVisibility(0);
            return;
        }
        android.view.View view2 = this.f145056t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "showCheckDetailBtnOrImg", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "showCheckDetailBtnOrImg", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z18) {
            this.f145058v.setText(com.tencent.mm.R.string.f492416gk1);
        } else {
            this.f145058v.setText(com.tencent.mm.R.string.gjl);
        }
        this.f145057u.setVisibility(8);
        this.f145056t.setOnClickListener(new pb3.d(this));
    }

    public final void Y6() {
        com.tencent.mm.plugin.luckymoney.model.m5.B(this.f145059w, null);
        android.view.View contentView = getContentView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "showRedPacket", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "showRedPacket", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void Z6(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f145052p.setVisibility(8);
        } else {
            this.f145052p.setText(str);
            this.f145052p.setVisibility(0);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        com.tencent.mm.plugin.luckymoney.model.m5.E(getContext(), this.f145053q, str2);
        this.f145053q.setVisibility(0);
    }

    public void a7() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f145060x;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.f145060x.dismiss();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d_r;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f145059w = findViewById(com.tencent.mm.R.id.f485814j63);
        this.f145050n = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j67);
        this.f145051o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j68);
        this.f145052p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j6_);
        this.f145053q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j6c);
        this.f145054r = (android.widget.Button) findViewById(com.tencent.mm.R.id.j6g);
        this.f145055s = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j6h);
        this.f145058v = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j6d);
        this.f145056t = findViewById(com.tencent.mm.R.id.j6e);
        this.f145057u = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.iy6);
        ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.j6f)).setOnClickListener(new pb3.e(this));
        W6(this.f145051o, com.tencent.mm.R.dimen.a4r);
        W6(this.f145052p, com.tencent.mm.R.dimen.a4s);
        W6(this.f145053q, com.tencent.mm.R.dimen.a4t);
        android.view.View contentView = getContentView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(getContext(), null, getString(com.tencent.mm.R.string.ggc), true, true, new pb3.f(this));
        this.f145060x = Q;
        Q.show();
        U6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        V6(this.f145048i, this.f145047h);
        finish();
    }

    @Override // com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaLuckyMoneyReceiveUI", "WxaLuckyMoneyReceiveUI.onCreate ");
        initView();
        getIntent();
        pb3.k kVar = new pb3.k();
        this.f145049m = kVar;
        android.content.Intent intent = getIntent();
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onCreate ");
        kVar.f353180a = this;
        if (intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onCreate intent == null");
            kVar.a(new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{intent is null}}"));
            return;
        }
        kVar.f353181b = intent.getStringExtra("appId");
        kVar.f353182c = intent.getStringExtra("sendId");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(kVar.f353181b) && !com.tencent.mm.sdk.platformtools.t8.K0(kVar.f353182c)) {
            new lb3.e(kVar.f353181b, kVar.f353182c).a(new pb3.g(kVar));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onCreate appId = [%s] sendId = [%s]", kVar.f353181b, kVar.f353182c);
            kVar.a(new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{appid or send is nil}}"));
        }
    }

    @Override // com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaLuckyMoneyReceiveUI", "WxaLuckyMoneyReceiveUI.onDestroy ");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f145060x;
        if (u3Var != null && u3Var.isShowing()) {
            this.f145060x.dismiss();
        }
        pb3.a aVar = this.f145049m;
        if (aVar != null) {
            pb3.k kVar = (pb3.k) aVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onDestroy ");
            kVar.f353180a = null;
            kVar.f353184e = null;
            kVar.f353185f = null;
            this.f145049m = null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f145054r.setVisibility(0);
        com.tencent.mm.plugin.luckymoney.model.m5.H(this.f145055s);
        this.f145054r.setBackgroundResource(com.tencent.mm.R.drawable.c3t);
        U6();
    }
}
