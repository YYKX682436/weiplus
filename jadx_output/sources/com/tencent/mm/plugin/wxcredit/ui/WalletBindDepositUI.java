package com.tencent.mm.plugin.wxcredit.ui;

/* loaded from: classes9.dex */
public class WalletBindDepositUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f188515d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f188516e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f188517f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f188518g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f188519h = true;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.ElementQuery f188520i = new com.tencent.mm.plugin.wallet_core.model.ElementQuery();

    public final void U6() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f188520i.f179648e)) {
            this.f188517f.setText("");
            return;
        }
        if (2 == this.f188520i.f179658r) {
            this.f188517f.setText(this.f188520i.f179648e + " " + getString(com.tencent.mm.R.string.kki));
            return;
        }
        this.f188517f.setText(this.f188520i.f179648e + " " + getString(com.tencent.mm.R.string.kl8));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d4x;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.kgn);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f487647pb4);
        this.f188515d = walletFormView;
        qp5.p.a(walletFormView);
        this.f188517f = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.pbk);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView2 = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.jms);
        this.f188516e = walletFormView2;
        qp5.p.f(this, walletFormView2);
        this.f188518g = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
        setEditFocusListener(this.f188515d, 0, false);
        setEditFocusListener(this.f188516e, 0, false);
        this.f188517f.setOnClickListener(new e05.a(this));
        this.f188518g.setOnClickListener(new e05.b(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindDepositUI", "onAcvityResult requestCode:" + i17);
        if (i18 == -1 && i17 == 1) {
            com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery = (com.tencent.mm.plugin.wallet_core.model.ElementQuery) intent.getParcelableExtra("elemt_query");
            if (!elementQuery.b()) {
                db5.e1.i(this, com.tencent.mm.R.string.kgl, com.tencent.mm.R.string.f490573yv);
            } else {
                this.f188520i = elementQuery;
                U6();
            }
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if ((r7 & r1) > 0) goto L26;
     */
    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onSceneEnd(int r4, int r5, java.lang.String r6, com.tencent.mm.modelbase.m1 r7) {
        /*
            r3 = this;
            r6 = 0
            if (r4 != 0) goto L8a
            if (r5 != 0) goto L8a
            boolean r4 = r7 instanceof ss4.z
            if (r4 == 0) goto L8a
            ss4.z r7 = (ss4.z) r7
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r4 = r7.f412148e
            if (r4 == 0) goto L8a
            boolean r4 = r4.b()
            r5 = 1
            r0 = 2131756315(0x7f10051b, float:1.9143534E38)
            if (r4 != 0) goto L20
            r4 = 2131779176(0x7f105e68, float:1.9189902E38)
            db5.e1.i(r3, r4, r0)
            return r5
        L20:
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r4 = r7.f412148e
            r3.f188520i = r4
            r3.U6()
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r4 = r3.f188520i
            boolean r7 = r4.f179656p
            if (r7 == 0) goto L3a
            boolean r4 = r4.c()
            if (r4 == 0) goto L3a
            r4 = 2131779144(0x7f105e48, float:1.9189837E38)
            db5.e1.i(r3, r4, r0)
            return r5
        L3a:
            com.tencent.mm.wallet_core.h r4 = com.tencent.mm.wallet_core.a.g(r3)
            if (r4 == 0) goto L86
            com.tencent.mm.plugin.wallet_core.model.ElementQuery r7 = r3.f188520i
            int r7 = r7.I
            android.os.Bundle r1 = r4.f213801c
            java.lang.String r2 = "key_support_bankcard"
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L4f
            goto L57
        L4f:
            android.os.Bundle r1 = r4.f213801c
            int r1 = r1.getInt(r2, r5)
            if (r1 != 0) goto L59
        L57:
            r6 = r5
            goto L5f
        L59:
            l75.e0 r2 = com.tencent.mm.plugin.wallet_core.model.Bankcard.A3
            r7 = r7 & r1
            if (r7 <= 0) goto L5f
            goto L57
        L5f:
            if (r6 != 0) goto L86
            boolean r4 = r4.r()
            java.lang.String r6 = "MicroMsg.WalletBindDepositUI"
            if (r4 == 0) goto L75
            java.lang.String r4 = "Overseas user try to bind domestic card!"
            com.tencent.mars.xlog.Log.w(r6, r4)
            r4 = 2131779067(0x7f105dfb, float:1.918968E38)
            db5.e1.i(r3, r4, r0)
            goto L80
        L75:
            java.lang.String r4 = "Domestic user try to bind international card!"
            com.tencent.mars.xlog.Log.w(r6, r4)
            r4 = 2131779066(0x7f105dfa, float:1.9189679E38)
            db5.e1.i(r3, r4, r0)
        L80:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r4 = r3.f188515d
            r4.d()
            return r5
        L86:
            r3.U6()
            return r5
        L8a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):boolean");
    }
}
