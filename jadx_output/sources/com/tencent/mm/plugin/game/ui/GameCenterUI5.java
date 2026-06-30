package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameCenterUI5 extends com.tencent.mm.plugin.game.ui.GameCenterBaseUI implements com.tencent.mm.modelbase.u0 {
    public boolean A = true;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameNewTopBannerView f140719r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameIndexSearchView f140720s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameIndexWxagView f140721t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameMessageBubbleView f140722u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameBlockView f140723v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameRecomBlockView f140724w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameNewClassifyView f140725x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameIndexListView f140726y;

    /* renamed from: z, reason: collision with root package name */
    public android.app.Dialog f140727z;

    /* JADX WARN: Removed duplicated region for block: B:128:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0a90  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x08b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Z6(com.tencent.mm.plugin.game.ui.GameCenterUI5 r35, com.tencent.mm.plugin.game.model.x1 r36, int r37) {
        /*
            Method dump skipped, instructions count: 3081
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.ui.GameCenterUI5.Z6(com.tencent.mm.plugin.game.ui.GameCenterUI5, com.tencent.mm.plugin.game.model.x1, int):void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.beb;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setBackBtn(new com.tencent.mm.plugin.game.ui.j0(this));
        setMMTitle(com.tencent.mm.R.string.fq7);
        com.tencent.mm.plugin.game.ui.GameIndexListView gameIndexListView = (com.tencent.mm.plugin.game.ui.GameIndexListView) findViewById(com.tencent.mm.R.id.gl8);
        this.f140726y = gameIndexListView;
        gameIndexListView.setVisibility(8);
        android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.bgf, (android.view.ViewGroup) this.f140726y, false);
        this.f140726y.addHeaderView(inflate);
        this.f140719r = (com.tencent.mm.plugin.game.ui.GameNewTopBannerView) inflate.findViewById(com.tencent.mm.R.id.gpe);
        this.f140720s = (com.tencent.mm.plugin.game.ui.GameIndexSearchView) inflate.findViewById(com.tencent.mm.R.id.glr);
        this.f140721t = (com.tencent.mm.plugin.game.ui.GameIndexWxagView) inflate.findViewById(com.tencent.mm.R.id.gls);
        this.f140722u = (com.tencent.mm.plugin.game.ui.GameMessageBubbleView) inflate.findViewById(com.tencent.mm.R.id.gnl);
        this.f140723v = (com.tencent.mm.plugin.game.ui.GameBlockView) inflate.findViewById(com.tencent.mm.R.id.giu);
        this.f140724w = (com.tencent.mm.plugin.game.ui.GameRecomBlockView) inflate.findViewById(com.tencent.mm.R.id.gob);
        this.f140725x = (com.tencent.mm.plugin.game.ui.GameNewClassifyView) inflate.findViewById(com.tencent.mm.R.id.gnx);
    }

    @Override // com.tencent.mm.plugin.game.ui.GameCenterBaseUI, com.tencent.mm.plugin.game.ui.GameCenterActivity, com.tencent.mm.plugin.game.ui.GameBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameCenterUI5", "account not ready");
            finish();
            return;
        }
        com.tencent.mm.plugin.game.ui.GameIndexListView.setSourceScene(this.f140700i);
        gm0.j1.d().a(2994, this);
        initView();
        r53.f.l().postToWorker(new com.tencent.mm.plugin.game.ui.o0(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.GameCenterUI5", "fromScene = %d", java.lang.Integer.valueOf(this.f140700i));
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameCenterUI5", "onDestroy");
        super.onDestroy();
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameCenterUI5", "account not ready");
            return;
        }
        r53.d dVar = r53.b.f392640a;
        synchronized (dVar) {
            java.util.Map map = dVar.f392647a;
            if (map != null) {
                ((java.util.LinkedHashMap) map).clear();
            }
            dVar.f392648b = false;
        }
        gm0.j1.d().q(2994, this);
        com.tencent.mm.plugin.game.model.a wi6 = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).wi();
        wi6.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameAppCacheService", "clear cached apppinfos");
        java.util.LinkedList linkedList = wi6.f140190b;
        if (linkedList != null) {
            linkedList.clear();
        }
        java.util.LinkedList linkedList2 = wi6.f140189a;
        if (linkedList2 != null) {
            linkedList2.clear();
        }
        com.tencent.mm.plugin.game.model.z3.a();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(com.tencent.mm.plugin.game.model.z3.f140571b == null);
        objArr[1] = java.lang.Boolean.valueOf(com.tencent.mm.plugin.game.model.z3.f140570a == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.QQDownloaderSDKWrapper", "destroyQQDownloader, sdk is null : [%b], instance is null : [%b]", objArr);
        com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDK iTMQQDownloaderOpenSDK = com.tencent.mm.plugin.game.model.z3.f140571b;
        if (iTMQQDownloaderOpenSDK != null) {
            iTMQQDownloaderOpenSDK.destroyQQDownloaderOpenSDK();
        }
        com.tencent.mm.plugin.game.model.z3.f140571b = null;
        com.tencent.mm.plugin.game.model.z3.f140570a = null;
    }

    @Override // com.tencent.mm.plugin.game.ui.GameCenterBaseUI, com.tencent.mm.plugin.game.ui.GameBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.game.ui.GameDownloadView gameDownloadView;
        com.tencent.mm.plugin.game.model.c0 c0Var;
        super.onResume();
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameCenterUI5", "account not ready");
            return;
        }
        if (!this.A) {
            ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).wi().a(this);
            com.tencent.mm.plugin.game.ui.GameMessageBubbleView gameMessageBubbleView = this.f140722u;
            gameMessageBubbleView.f140920e.setOnClickListener(null);
            gameMessageBubbleView.setVisibility(8);
            if (this.f140699h) {
                this.f140722u.a();
            }
            com.tencent.mm.plugin.game.ui.a0 a0Var = this.f140723v.f140684h;
            if (a0Var != null && (c0Var = (gameDownloadView = a0Var.f141012e).f140765g) != null) {
                c0Var.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
                gameDownloadView.f140765g.b();
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.game.ui.e3(gameDownloadView));
            }
            com.tencent.mm.plugin.game.ui.GameIndexListView gameIndexListView = this.f140726y;
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) gameIndexListView.getLayoutManager();
            int w17 = linearLayoutManager.w();
            gameIndexListView.f140856j2.notifyItemRangeChanged(w17, (linearLayoutManager.y() - w17) + 1);
        }
        this.A = false;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameCenterUI5", "errType: %d errCode: %d, scene: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(m1Var.hashCode()));
        if (i17 == 0 && i18 == 0) {
            if (m1Var.getType() != 2994) {
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            r53.f.l().postToWorker(new com.tencent.mm.plugin.game.ui.l0(this, ((com.tencent.mm.plugin.game.model.e3) m1Var).f140304e.f70711b.f70700a, currentTimeMillis));
            return;
        }
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        if (!com.tencent.mm.ui.pc.a(this, i17, i18, str, 4)) {
            dp.a.makeText(this, getString(com.tencent.mm.R.string.fna, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
        }
        android.app.Dialog dialog = this.f140727z;
        if (dialog != null) {
            dialog.cancel();
        }
    }
}
