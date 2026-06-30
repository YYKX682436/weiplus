package com.tencent.mm.plugin.mall.ui;

@db5.a(8192)
/* loaded from: classes8.dex */
public class MallFunctionSettingsUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f148229o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f148230d;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f148232f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f148233g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.mall.ui.r f148234h;

    /* renamed from: i, reason: collision with root package name */
    public int f148235i;

    /* renamed from: n, reason: collision with root package name */
    public ef3.b f148237n;

    /* renamed from: e, reason: collision with root package name */
    public final int f148231e = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 40);

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f148236m = new java.util.ArrayList();

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bvx;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f148230d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.jip);
        this.f148234h = new com.tencent.mm.plugin.mall.ui.r(this, null);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(this, com.tencent.mm.R.layout.bvu, null);
        this.f148230d.addHeaderView(viewGroup, null, false);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setMinimumHeight(i65.a.b(getContext(), 80));
        this.f148230d.addFooterView(linearLayout, null, false);
        this.f148230d.setAdapter((android.widget.ListAdapter) this.f148234h);
        this.f148232f = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.jih);
        this.f148233g = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.jig);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        this.f148235i = intValue;
        com.tencent.mars.xlog.Log.i("MicroMsg.MallFunctionSettingsUI", "wallet region: %s", java.lang.Integer.valueOf(intValue));
        initView();
        setMMTitle("");
        com.tencent.mars.xlog.Log.i("MicroMsg.MallFunctionSettingsUI", "do get function list");
        com.tencent.mars.xlog.Log.i("MicroMsg.MallFunctionSettingsUI", " walletMallV2 is ：%s", java.lang.Boolean.TRUE);
        ef3.b bVar = new ef3.b(this.f148235i, 0, 1, 1);
        this.f148237n = bVar;
        bVar.l().h(new com.tencent.mm.plugin.mall.ui.p(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f148237n.j();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(gf3.c.class);
    }
}
