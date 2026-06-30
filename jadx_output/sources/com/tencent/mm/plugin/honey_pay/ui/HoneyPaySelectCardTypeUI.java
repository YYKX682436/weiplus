package com.tencent.mm.plugin.honey_pay.ui;

/* loaded from: classes9.dex */
public class HoneyPaySelectCardTypeUI extends com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f142383i = 0;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f142384f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f142385g;

    /* renamed from: h, reason: collision with root package name */
    public int f142386h;

    public static void V6(com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI honeyPaySelectCardTypeUI, long j17, long j18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        honeyPaySelectCardTypeUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPaySelectCardTypeUI", "go to give card");
        android.content.Intent intent = new android.content.Intent(honeyPaySelectCardTypeUI, (java.lang.Class<?>) com.tencent.mm.plugin.honey_pay.ui.HoneyPayGiveCardUI.class);
        intent.putExtra("key_max_credit_line", j17);
        intent.putExtra("key_min_credit_line", j18);
        intent.putExtra("key_true_name", str);
        intent.putExtra("key_take_message", str2);
        intent.putExtra("key_username", str3);
        intent.putExtra("key_wishing", str4);
        intent.putExtra("key_icon_url", str5);
        intent.putExtra("key_cardtype", honeyPaySelectCardTypeUI.f142386h);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
            intent.putExtra("key_notice_item", str6);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(honeyPaySelectCardTypeUI, arrayList.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPaySelectCardTypeUI", "gotoGiveCardUI", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        honeyPaySelectCardTypeUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(honeyPaySelectCardTypeUI, "com/tencent/mm/plugin/honey_pay/ui/HoneyPaySelectCardTypeUI", "gotoGiveCardUI", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bjy;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f142384f = (android.widget.LinearLayout) $(com.tencent.mm.R.id.h5d);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needExecuteBackListener() {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1) {
            if (i18 == -1) {
                java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPaySelectCardTypeUI", "select friend: %s", stringExtra);
                com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPaySelectCardTypeUI", "do check user: %s", stringExtra);
                r73.b bVar = new r73.b(stringExtra, this.f142386h);
                bVar.K(this);
                doSceneProgress(bVar, true);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPaySelectCardTypeUI", "cancel add friend");
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.View view;
        this.f142261e = com.tencent.mm.R.color.f479234tm;
        super.onCreate(bundle);
        addSceneEndListener(2618);
        addSceneEndListener(2926);
        setMMTitle("");
        java.util.ArrayList<com.tencent.mm.plugin.honey_pay.model.HoneyPayCardType> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key_card_type_list");
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            this.f142385g = new java.util.ArrayList();
            try {
                for (com.tencent.mm.plugin.honey_pay.model.HoneyPayCardType honeyPayCardType : parcelableArrayListExtra) {
                    r45.av3 av3Var = new r45.av3();
                    av3Var.parseFrom(honeyPayCardType.f142259d);
                    this.f142385g.add(av3Var);
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HoneyPaySelectCardTypeUI", e17, "", new java.lang.Object[0]);
            }
        }
        initView();
        this.f142384f.removeAllViews();
        java.util.List list = this.f142385g;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (r45.av3 av3Var2 : this.f142385g) {
            v73.p1 p1Var = new v73.p1(this, null);
            if (av3Var2.f370276i == null) {
                androidx.appcompat.app.AppCompatActivity context = getContext();
                view = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bjw, (android.view.ViewGroup) this.f142384f, false);
                p1Var.a(view, av3Var2);
            } else {
                androidx.appcompat.app.AppCompatActivity context2 = getContext();
                android.view.View inflate = android.view.LayoutInflater.from(context2).inflate(com.tencent.mm.R.layout.bjx, (android.view.ViewGroup) this.f142384f, false);
                p1Var.a(inflate, av3Var2);
                p1Var.f433728d = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) inflate.findViewById(com.tencent.mm.R.id.h5b);
                p1Var.f433729e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.h5c);
                p1Var.f433728d.setUrl(av3Var2.f370276i.f392375g);
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                spannableStringBuilder.append((java.lang.CharSequence) av3Var2.f370276i.f392372d);
                spannableStringBuilder.append((java.lang.CharSequence) av3Var2.f370276i.f392373e);
                spannableStringBuilder.setSpan(new com.tencent.mm.plugin.wallet_core.ui.d7(2, new v73.n1(p1Var, av3Var2, context2)), av3Var2.f370276i.f392372d.length(), spannableStringBuilder.length(), 34);
                p1Var.f433729e.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(context2));
                p1Var.f433729e.setClickable(true);
                p1Var.f433729e.setText(spannableStringBuilder);
                view = inflate;
            }
            this.f142384f.addView(view);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        removeSceneEndListener(2618);
        removeSceneEndListener(2926);
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof r73.b)) {
            return true;
        }
        r73.b bVar = (r73.b) m1Var;
        bVar.O(new v73.m1(this, bVar));
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(v73.s1.class);
    }
}
