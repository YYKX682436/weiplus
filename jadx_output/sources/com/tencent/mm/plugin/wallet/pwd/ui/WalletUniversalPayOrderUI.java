package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class WalletUniversalPayOrderUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f178957s = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.sortlist.DragSortListView f178958d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.pwd.ui.o3 f178959e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f178960f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f178961g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f178962h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f178963i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f178964m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f178965n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f178966o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f178967p;

    /* renamed from: q, reason: collision with root package name */
    public android.app.Dialog f178968q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f178969r = true;

    public static void U6(com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI walletUniversalPayOrderUI) {
        walletUniversalPayOrderUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUniversalPayOrderUI", "do open unipay order");
        walletUniversalPayOrderUI.f178968q = db5.e1.Q(walletUniversalPayOrderUI, walletUniversalPayOrderUI.getString(com.tencent.mm.R.string.f490386tj), walletUniversalPayOrderUI.getString(com.tencent.mm.R.string.kvq), false, false, new com.tencent.mm.plugin.wallet.pwd.ui.j3(walletUniversalPayOrderUI));
        new gs4.b().l().h(new com.tencent.mm.plugin.wallet.pwd.ui.k3(walletUniversalPayOrderUI));
    }

    public static void V6(com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI walletUniversalPayOrderUI) {
        walletUniversalPayOrderUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUniversalPayOrderUI", "do close unipay order");
        walletUniversalPayOrderUI.f178968q = db5.e1.Q(walletUniversalPayOrderUI, walletUniversalPayOrderUI.getString(com.tencent.mm.R.string.f490386tj), walletUniversalPayOrderUI.getString(com.tencent.mm.R.string.kvq), false, false, new com.tencent.mm.plugin.wallet.pwd.ui.l3(walletUniversalPayOrderUI));
        new gs4.a().l().h(new com.tencent.mm.plugin.wallet.pwd.ui.m3(walletUniversalPayOrderUI));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d6b;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f178958d = (com.tencent.mm.ui.widget.sortlist.DragSortListView) findViewById(com.tencent.mm.R.id.f487693ph3);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.d6_, (android.view.ViewGroup) null, false);
        this.f178960f = viewGroup;
        this.f178962h = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.pgz);
        this.f178963i = (android.widget.TextView) this.f178960f.findViewById(com.tencent.mm.R.id.pgv);
        this.f178964m = (android.widget.TextView) this.f178960f.findViewById(com.tencent.mm.R.id.pgx);
        this.f178965n = (com.tencent.mm.ui.widget.MMSwitchBtn) this.f178960f.findViewById(com.tencent.mm.R.id.pgw);
        this.f178966o = (android.widget.TextView) this.f178960f.findViewById(com.tencent.mm.R.id.pgy);
        this.f178958d.addHeaderView(this.f178960f, null, false);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.d69, (android.view.ViewGroup) null, false);
        this.f178961g = viewGroup2;
        this.f178967p = (android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.pgu);
        this.f178958d.addFooterView(this.f178961g, null, false);
        com.tencent.mm.plugin.wallet.pwd.ui.o3 o3Var = new com.tencent.mm.plugin.wallet.pwd.ui.o3(this);
        this.f178959e = o3Var;
        this.f178958d.setAdapter((android.widget.ListAdapter) o3Var);
        this.f178958d.setDropListener(new com.tencent.mm.plugin.wallet.pwd.ui.f3(this));
        this.f178958d.setRemoveListener(new com.tencent.mm.plugin.wallet.pwd.ui.g3(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        setMMTitle("");
        initView();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUniversalPayOrderUI", "do query uni pay order");
        this.f178968q = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490386tj), getString(com.tencent.mm.R.string.kvq), false, false, new com.tencent.mm.plugin.wallet.pwd.ui.h3(this));
        new gs4.c().l().h(new com.tencent.mm.plugin.wallet.pwd.ui.i3(this));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16343, 1);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
