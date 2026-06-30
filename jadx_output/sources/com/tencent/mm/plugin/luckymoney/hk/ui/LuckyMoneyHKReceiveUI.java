package com.tencent.mm.plugin.luckymoney.hk.ui;

@db5.a(7)
/* loaded from: classes9.dex */
public class LuckyMoneyHKReceiveUI extends com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI {
    public static final java.lang.String B = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.l0g);
    public wb3.c A;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f145136g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f145137h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f145138i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f145139m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f145140n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f145141o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f145142p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f145143q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f145144r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f145145s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f145146t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f145147u = null;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewGroup f145148v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f145149w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f145150x;

    /* renamed from: y, reason: collision with root package name */
    public int f145151y;

    /* renamed from: z, reason: collision with root package name */
    public long f145152z;

    public static void V6(com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI, r45.r43 r43Var) {
        com.tencent.mm.plugin.luckymoney.model.e1 e1Var;
        luckyMoneyHKReceiveUI.getClass();
        if (r43Var == null) {
            e1Var = null;
        } else {
            com.tencent.mm.plugin.luckymoney.model.e1 e1Var2 = new com.tencent.mm.plugin.luckymoney.model.e1();
            e1Var2.f145234d = r43Var.f384530o;
            e1Var2.f145235e = r43Var.f384534s;
            e1Var2.f145236f = r43Var.f384535t;
            e1Var2.f145238h = r43Var.f384536u;
            e1Var2.f145241n = r43Var.f384524f;
            e1Var2.f145245q = r43Var.f384525g;
            e1Var2.U = r43Var.M;
            e1Var2.f145246r = r43Var.f384526h;
            e1Var2.f145247s = r43Var.f384527i;
            e1Var2.f145248t = r43Var.f384528m;
            e1Var2.f145249u = r43Var.f384529n;
            e1Var2.f145250v = r43Var.f384537v;
            e1Var2.f145252x = r43Var.f384531p;
            e1Var2.f145253y = r43Var.f384532q;
            e1Var2.f145254z = r43Var.f384538w;
            e1Var2.A = r43Var.f384533r;
            e1Var2.D = r43Var.f384541z;
            e1Var2.E = r43Var.A;
            e1Var2.N = r43Var.C;
            java.lang.String str = r43Var.B;
            e1Var2.Q = str;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str2 = e1Var2.Q;
                ((sg3.a) v0Var).getClass();
                e1Var2.f145239i = c01.a2.e(str2);
            }
            e1Var2.R = r43Var.G;
            e1Var2.S = r43Var.H;
            e1Var2.F = new java.util.LinkedList();
            java.util.LinkedList linkedList = r43Var.f384539x;
            if (!linkedList.isEmpty()) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.s43 s43Var = (r45.s43) it.next();
                    com.tencent.mm.plugin.luckymoney.model.o6 o6Var = new com.tencent.mm.plugin.luckymoney.model.o6();
                    o6Var.f145520g = s43Var.f385495f;
                    o6Var.f145523m = s43Var.f385499m;
                    o6Var.f145517d = s43Var.f385496g;
                    o6Var.f145522i = s43Var.f385497h;
                    o6Var.f145518e = s43Var.f385493d;
                    o6Var.f145521h = s43Var.f385498i;
                    int i17 = s43Var.f385494e;
                    if (i17 == 1) {
                        o6Var.f145519f = "Appid";
                    } else if (i17 == 2) {
                        o6Var.f145519f = "Text";
                    } else if (i17 == 3) {
                        o6Var.f145519f = "Pic";
                    } else if (i17 == 4) {
                        o6Var.f145519f = "Native";
                    }
                    e1Var2.F.add(o6Var);
                }
            }
            if (r43Var.Q != null) {
                com.tencent.mm.plugin.luckymoney.model.o6 o6Var2 = new com.tencent.mm.plugin.luckymoney.model.o6();
                e1Var2.G = o6Var2;
                r45.s43 s43Var2 = r43Var.Q;
                o6Var2.f145520g = s43Var2.f385495f;
                o6Var2.f145523m = s43Var2.f385499m;
                o6Var2.f145517d = s43Var2.f385496g;
                o6Var2.f145522i = s43Var2.f385497h;
                o6Var2.f145518e = s43Var2.f385493d;
                o6Var2.f145521h = s43Var2.f385498i;
                int i18 = s43Var2.f385494e;
                if (i18 == 1) {
                    o6Var2.f145519f = "Appid";
                } else if (i18 == 2) {
                    o6Var2.f145519f = "Text";
                } else if (i18 == 3) {
                    o6Var2.f145519f = "Pic";
                } else if (i18 == 4) {
                    o6Var2.f145519f = "Native";
                }
            }
            e1Var2.W = com.tencent.mm.plugin.luckymoney.model.g5.a(r43Var.P);
            e1Var2.M = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = r43Var.f384540y;
            if (!linkedList2.isEmpty()) {
                java.util.Iterator it6 = linkedList2.iterator();
                while (it6.hasNext()) {
                    r45.n43 n43Var = (r45.n43) it6.next();
                    com.tencent.mm.plugin.luckymoney.model.h5 h5Var = new com.tencent.mm.plugin.luckymoney.model.h5();
                    h5Var.f145318m = n43Var.f381072h;
                    h5Var.f145317i = n43Var.f381070f;
                    h5Var.f145314f = n43Var.f381068d;
                    h5Var.f145315g = n43Var.f381069e;
                    h5Var.f145319n = n43Var.f381073i;
                    h5Var.f145320o = n43Var.f381074m;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(h5Var.f145312d) && !com.tencent.mm.sdk.platformtools.t8.K0(h5Var.f145319n)) {
                        tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                        java.lang.String str3 = h5Var.f145319n;
                        ((sg3.a) v0Var2).getClass();
                        h5Var.f145312d = c01.a2.e(str3);
                    }
                    e1Var2.M.add(h5Var);
                }
            }
            e1Var = e1Var2;
        }
        if (e1Var.A != 2) {
            luckyMoneyHKReceiveUI.f145141o.setBackgroundResource(com.tencent.mm.R.drawable.caz);
            luckyMoneyHKReceiveUI.f145141o.setText(com.tencent.mm.R.string.gmj);
            luckyMoneyHKReceiveUI.f145141o.setOnClickListener(null);
            luckyMoneyHKReceiveUI.f145141o.setVisibility(8);
            luckyMoneyHKReceiveUI.f145142p.setVisibility(8);
            if (com.tencent.mm.sdk.platformtools.t8.K0(e1Var.L)) {
                luckyMoneyHKReceiveUI.f145139m.setVisibility(8);
            } else {
                luckyMoneyHKReceiveUI.f145139m.setText(e1Var.L);
                luckyMoneyHKReceiveUI.f145139m.setVisibility(0);
            }
            luckyMoneyHKReceiveUI.f145140n.setText(e1Var.f145236f);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) luckyMoneyHKReceiveUI.f145143q.getLayoutParams();
            layoutParams.bottomMargin = com.tencent.mm.sdk.platformtools.j.d(luckyMoneyHKReceiveUI.getContext(), 30.0f);
            luckyMoneyHKReceiveUI.f145143q.setLayoutParams(layoutParams);
            if (!c01.z1.r().equals(null) && e1Var.f145234d != 1) {
                android.view.View view = luckyMoneyHKReceiveUI.f145143q;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/protocal/protobuf/ForeignHbOpenResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/protocal/protobuf/ForeignHbOpenResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                luckyMoneyHKReceiveUI.f145144r.setVisibility(0);
                return;
            }
            android.view.View view2 = luckyMoneyHKReceiveUI.f145143q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/protocal/protobuf/ForeignHbOpenResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/protocal/protobuf/ForeignHbOpenResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            luckyMoneyHKReceiveUI.f145143q.setOnClickListener(new xb3.i(luckyMoneyHKReceiveUI, r43Var));
            luckyMoneyHKReceiveUI.f145144r.setVisibility(8);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(luckyMoneyHKReceiveUI.getContext(), com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKBeforeDetailUI.class);
        intent.putExtra("key_lucky_money_can_received", true);
        try {
            gb3.l.b(luckyMoneyHKReceiveUI.f145149w, e1Var);
            intent.putExtra("key_jump_from", 2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyHKReceiveUI", "luckyMoneyDetail.toByteArray() fail! " + e17.getLocalizedMessage());
        }
        intent.putExtra("key_native_url", luckyMoneyHKReceiveUI.f145150x);
        intent.putExtra("key_sendid", luckyMoneyHKReceiveUI.f145149w);
        if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("PlayCoinSound", 0) > 0) {
            intent.putExtra("play_sound", true);
        }
        com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch luckyMoneyEmojiSwitch = new com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch();
        luckyMoneyEmojiSwitch.f145155f = r43Var.f384521J;
        luckyMoneyEmojiSwitch.f145156g = r43Var.K;
        intent.putExtra("key_emoji_switch", luckyMoneyEmojiSwitch);
        intent.putExtra("key_username", luckyMoneyHKReceiveUI.getIntent().getStringExtra("key_username"));
        intent.putExtra("key_msgid", luckyMoneyHKReceiveUI.f145152z);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(intent);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(luckyMoneyHKReceiveUI, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/protocal/protobuf/ForeignHbOpenResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyHKReceiveUI.startActivity((android.content.Intent) arrayList3.get(0));
        yj0.a.f(luckyMoneyHKReceiveUI, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/protocal/protobuf/ForeignHbOpenResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyHKReceiveUI.finish();
        at4.k1 k1Var = new at4.k1();
        k1Var.field_mNativeUrl = luckyMoneyHKReceiveUI.f145150x;
        k1Var.field_hbType = e1Var.f145234d;
        k1Var.field_receiveAmount = e1Var.f145245q;
        k1Var.field_receiveTime = java.lang.System.currentTimeMillis();
        k1Var.field_hbStatus = e1Var.f145235e;
        k1Var.field_receiveStatus = e1Var.A;
        if (k1Var.field_receiveAmount > 0) {
            ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().replace(k1Var);
        }
    }

    public final void W6() {
        android.widget.Button button = this.f145141o;
        if (button == null) {
            return;
        }
        fo3.s.INSTANCE.Tc(button.getId());
        java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (o17 == null || o17.length() <= 0 || !(o17.equals("zh_CN") || o17.equals("zh_TW") || o17.equals("zh_HK"))) {
            this.f145141o.setBackgroundResource(com.tencent.mm.R.drawable.amv);
            this.f145141o.setText(com.tencent.mm.R.string.gmm);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bv6;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f145146t = findViewById(com.tencent.mm.R.id.j69);
        this.f145148v = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.j66);
        this.f145136g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j6u);
        this.f145137h = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j67);
        this.f145138i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j68);
        this.f145139m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j6_);
        this.f145140n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j6c);
        this.f145141o = (android.widget.Button) findViewById(com.tencent.mm.R.id.j6g);
        this.f145142p = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j6h);
        this.f145145s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j6d);
        this.f145143q = findViewById(com.tencent.mm.R.id.j6e);
        this.f145144r = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.iy6);
        ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.j6f)).setOnClickListener(new xb3.e(this));
        this.f145139m.setLines(2);
        androidx.core.widget.a0.c(this.f145139m, 1);
        i65.a.f(getContext(), com.tencent.mm.R.dimen.a4t);
        i65.a.h(getContext(), com.tencent.mm.R.dimen.a4t);
        android.view.View contentView = getContentView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        W6();
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        this.f145973e = false;
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        this.f145150x = getIntent().getStringExtra("key_native_url");
        this.f145152z = getIntent().getLongExtra("key_msgid", 0L);
        this.f145151y = getIntent().getIntExtra("key_way", 0);
        java.lang.String str = this.f145150x;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        try {
            this.f145149w = android.net.Uri.parse(str).getQueryParameter("sendid");
        } catch (java.lang.Exception unused) {
            finish();
        }
        initView();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "do receive hb: %s, %s", this.f145150x, this.f145149w);
        wb3.c cVar = this.A;
        if (cVar != null) {
            cVar.j();
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f145147u;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f145147u = db5.e1.O(getContext(), null, 3, com.tencent.mm.R.style.f494256i6, getString(com.tencent.mm.R.string.ggc), true, true, new xb3.j(this));
        wb3.c cVar2 = new wb3.c(this.f145150x, this.f145149w, 1, this.f145151y);
        this.A = cVar2;
        cVar2.l().h(new xb3.m(this)).f(this);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
