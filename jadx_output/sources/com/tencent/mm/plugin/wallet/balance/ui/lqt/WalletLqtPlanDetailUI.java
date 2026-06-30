package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class WalletLqtPlanDetailUI extends com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI {
    public static final /* synthetic */ int D = 0;
    public int A;
    public boolean B;
    public boolean C;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f178005f;

    /* renamed from: h, reason: collision with root package name */
    public r45.n85 f178007h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.balance.ui.lqt.q4 f178008i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WalletTextView f178009m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f178010n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f178011o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f178012p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f178013q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f178014r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ListView f178015s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.LinearLayout f178016t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f178017u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f178018v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f178019w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f178020x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f178021y;

    /* renamed from: z, reason: collision with root package name */
    public int f178022z;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet.balance.model.lqt.u1 f178004e = (com.tencent.mm.plugin.wallet.balance.model.lqt.u1) this.f177946d.a(this, com.tencent.mm.plugin.wallet.balance.model.lqt.u1.class);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f178006g = new java.util.ArrayList();

    public static void U6(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI walletLqtPlanDetailUI, int i17) {
        walletLqtPlanDetailUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanDetailUI", "go to check pwd");
        android.content.Intent intent = new android.content.Intent(walletLqtPlanDetailUI, (java.lang.Class<?>) com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI.class);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        intent.putExtra("subtitle", com.tencent.mm.plugin.wallet.balance.model.lqt.e3.a(i17));
        walletLqtPlanDetailUI.startActivityForResult(intent, i17);
    }

    public final void V6(int i17, int i18, int i19) {
        android.app.Dialog e17 = com.tencent.mm.wallet_core.ui.b2.e(getContext(), false, false, null);
        com.tencent.mm.plugin.wallet.balance.model.lqt.t1 t1Var = this.f178004e.f177723d;
        t1Var.getClass();
        ((km5.q) ((km5.q) km5.u.g(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19))).n(t1Var).h(new com.tencent.mm.plugin.wallet.balance.ui.lqt.j4(this, e17))).s(new com.tencent.mm.plugin.wallet.balance.ui.lqt.i4(this, e17));
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.btn;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanDetailUI", "activity result: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 == -1) {
            if (intent != null) {
                intent.putExtra("oper_type", i17);
                intent.putExtra("plan_id", this.f178022z);
                setResult(-1, intent);
            } else {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("oper_type", i17);
                setResult(-1, intent2);
            }
        }
        finish();
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBasePresenterUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("key_plan_item_detail");
        if (parcelableExtra instanceof com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList$PlanItemParcel) {
            this.f178007h = com.tencent.mm.plugin.wallet.balance.model.lqt.u.s((com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList$PlanItemParcel) parcelableExtra);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanDetailUI", "parcelable no instanceof CgiLqtPlanOrderList.PlanItemParcel");
            finish();
        }
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        r45.n85 n85Var = this.f178007h;
        if (n85Var != null) {
            addIconOptionMenu(0, com.tencent.mm.R.raw.actionbar_icon_dark_more, new com.tencent.mm.plugin.wallet.balance.ui.lqt.l4(this, n85Var));
        }
        r45.n85 n85Var2 = this.f178007h;
        if (n85Var2 == null) {
            return;
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.View.inflate(getBaseContext(), com.tencent.mm.R.layout.btl, null);
        this.f178019w = linearLayout;
        this.f178009m = (com.tencent.mm.wallet_core.ui.WalletTextView) linearLayout.findViewById(com.tencent.mm.R.id.jq9);
        this.f178017u = (android.widget.LinearLayout) this.f178019w.findViewById(com.tencent.mm.R.id.nhf);
        this.f178018v = (android.widget.LinearLayout) this.f178019w.findViewById(com.tencent.mm.R.id.o7x);
        this.f178010n = (android.widget.TextView) this.f178019w.findViewById(com.tencent.mm.R.id.o7v);
        this.f178011o = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) this.f178019w.findViewById(com.tencent.mm.R.id.ad9);
        this.f178012p = (android.widget.TextView) this.f178019w.findViewById(com.tencent.mm.R.id.bce);
        this.f178013q = (android.widget.TextView) this.f178019w.findViewById(com.tencent.mm.R.id.o7p);
        this.f178016t = (android.widget.LinearLayout) this.f178019w.findViewById(com.tencent.mm.R.id.o7q);
        this.f178021y = this.f178019w.findViewById(com.tencent.mm.R.id.h08);
        this.f178014r = (android.widget.TextView) this.f178019w.findViewById(com.tencent.mm.R.id.nxi);
        this.f178015s = (android.widget.ListView) findViewById(com.tencent.mm.R.id.cw8);
        this.f178020x = findViewById(com.tencent.mm.R.id.ivn);
        com.tencent.mm.plugin.wallet.balance.ui.lqt.q4 q4Var = new com.tencent.mm.plugin.wallet.balance.ui.lqt.q4(this, null);
        this.f178008i = q4Var;
        this.f178015s.setAdapter((android.widget.ListAdapter) q4Var);
        this.f178015s.addHeaderView(this.f178019w);
        this.f178009m.b();
        java.math.BigDecimal i17 = com.tencent.mm.wallet_core.ui.r1.i("" + n85Var2.f381164e, "100", 2, java.math.RoundingMode.HALF_UP);
        if (i17.intValue() == i17.doubleValue()) {
            com.tencent.mm.wallet_core.ui.WalletTextView walletTextView = this.f178009m;
            java.lang.String str = "" + i17.intValue();
            if (!str.contains(".")) {
                str = str.concat(".00");
            }
            walletTextView.setText(str);
        } else {
            com.tencent.mm.wallet_core.ui.WalletTextView walletTextView2 = this.f178009m;
            java.lang.String bigDecimal = i17.toString();
            if (!bigDecimal.contains(".")) {
                bigDecimal = bigDecimal.concat(".00");
            }
            walletTextView2.setText(bigDecimal);
        }
        this.f178010n.setText(getString(com.tencent.mm.R.string.f493563kq5, "" + n85Var2.f381163d));
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        gt4.c1 c1Var = new gt4.c1(n85Var2.f381175s);
        ((x60.e) fVar).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(c1Var);
        if (d17 != null) {
            this.f178011o.setImageBitmap(d17);
        }
        this.f178012p.setText(java.lang.String.format("%s %s（%s）", n85Var2.f381174r, n85Var2.f381176t, n85Var2.f381166g));
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f178018v.getLayoutParams();
        if (n85Var2.f381173q != 1) {
            this.f178017u.setVisibility(0);
            layoutParams.setMargins(0, i65.a.b(getContext(), 8), 0, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanDetailUI", "params.topMargin:%s", java.lang.Integer.valueOf(layoutParams.topMargin));
        } else {
            this.f178017u.setVisibility(8);
            layoutParams.setMargins(0, i65.a.b(getContext(), 16), 0, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanDetailUI", "params.topMargin:%s", java.lang.Integer.valueOf(layoutParams.topMargin));
        }
        this.f178018v.setLayoutParams(layoutParams);
        this.A = 0;
        this.C = true;
        V6(n85Var2.f381172p, 0, 6);
        this.f178015s.setOnScrollListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.h4(this, n85Var2));
        this.f178021y.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478489a));
    }
}
