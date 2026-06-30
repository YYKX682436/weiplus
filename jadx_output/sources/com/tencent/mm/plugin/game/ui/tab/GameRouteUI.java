package com.tencent.mm.plugin.game.ui.tab;

@db5.a(19)
/* loaded from: classes8.dex */
public class GameRouteUI extends com.tencent.mm.plugin.game.ui.GameCenterActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f141767i = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f141768h;

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity
    public java.lang.String T6() {
        return null;
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity
    public java.lang.String U6() {
        return null;
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity
    public int V6() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity
    public int W6() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity
    public int X6() {
        return 0;
    }

    public final void Z6() {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        finish();
        overridePendingTransition(com.tencent.mm.ui.uc.f211080c, com.tencent.mm.ui.uc.f211081d);
    }

    public final void a7(java.util.List list, boolean z17) {
        com.tencent.mm.plugin.game.model.GameTabData gameTabData;
        java.util.ArrayList arrayList;
        if (isFinishing() || isDestroyed()) {
            return;
        }
        com.tencent.mm.plugin.game.model.GameTabData.TabItem tabItem = null;
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            gameTabData = null;
        } else {
            com.tencent.mm.plugin.game.model.GameTabData gameTabData2 = new com.tencent.mm.plugin.game.model.GameTabData();
            m53.i5 p17 = com.tencent.mm.plugin.game.commlib.i.p();
            if (p17 != null) {
                com.tencent.mm.plugin.game.model.GameTabData.StatusBar statusBar = gameTabData2.f140152e;
                statusBar.f140153d = p17.f323796e;
                statusBar.f140154e = r53.f.z(p17.f323795d);
            }
            java.util.Iterator it = list.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                m53.g1 g1Var = (m53.g1) it.next();
                if (g1Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(g1Var.f323693e)) {
                    com.tencent.mm.plugin.game.model.GameTabData.TabItem tabItem2 = new com.tencent.mm.plugin.game.model.GameTabData.TabItem();
                    tabItem2.f140155d = g1Var.f323693e;
                    tabItem2.f140156e = g1Var.f323692d;
                    tabItem2.f140158g = g1Var.f323695g;
                    boolean z18 = g1Var.f323696h;
                    tabItem2.f140159h = z18;
                    tabItem2.f140157f = g1Var.f323694f;
                    tabItem2.f140162n = g1Var.f323697i;
                    tabItem2.f140163o = g1Var.f323698m;
                    if (z18) {
                        tabItem2.f140164p = com.tencent.mm.plugin.game.ui.tab.GameTabHomeUI.class.getName();
                    } else {
                        int i18 = i17 + 1;
                        int i19 = i17 % 3;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("com.tencent.mm.plugin.game.ui.tab.GameTabWebUI");
                        sb6.append(i19 != 0 ? java.lang.String.valueOf(i19) : "");
                        tabItem2.f140164p = sb6.toString();
                        i17 = i18;
                    }
                    tabItem2.f140165q = false;
                    tabItem2.f140166r = g1Var.f323699n;
                    tabItem2.f140167s = g1Var.f323700o;
                    tabItem2.f140168t = g1Var.f323701p;
                    gameTabData2.f140151d.put(tabItem2.f140155d, tabItem2);
                }
            }
            gameTabData = gameTabData2;
        }
        if (gameTabData == null || com.tencent.mm.sdk.platformtools.t8.L0(gameTabData.a())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameRouteUI", "game tab data is null");
            Z6();
            return;
        }
        java.util.List a17 = gameTabData.a();
        int i27 = 0;
        while (true) {
            arrayList = (java.util.ArrayList) a17;
            if (i27 >= arrayList.size()) {
                break;
            }
            com.tencent.mm.plugin.game.model.GameTabData.TabItem tabItem3 = (com.tencent.mm.plugin.game.model.GameTabData.TabItem) arrayList.get(i27);
            if (tabItem3 != null) {
                com.tencent.mm.plugin.game.model.GameTabData.TabItem tabItem4 = tabItem3.f140158g ? tabItem3 : tabItem;
                n53.a.b(this, 18, tabItem3.f140166r, tabItem3.f140167s, 1, null, this.f141768h, n53.a.e(tabItem3.f140168t));
                tabItem = tabItem4;
            }
            i27++;
        }
        if (tabItem == null) {
            tabItem = (com.tencent.mm.plugin.game.model.GameTabData.TabItem) arrayList.get(0);
        }
        if (tabItem == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameRouteUI", "game tab entry item is null");
            Z6();
            return;
        }
        android.os.Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new android.os.Bundle();
        }
        extras.putParcelable("tab_data", gameTabData);
        getIntent().putExtras(extras);
        com.tencent.mm.plugin.game.ui.tab.GameTabWidget.c(this, tabItem, z17, true, true);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bhk;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setBackBtn(new p53.a(this));
        setMMTitle(com.tencent.mm.R.string.fq7);
    }

    @Override // com.tencent.mm.plugin.game.ui.GameCenterActivity, com.tencent.mm.plugin.game.ui.GameBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        this.f141768h = getIntent().getIntExtra("game_report_from_scene", 0);
        byte[] D0 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().D0("game_index4_tab_nav");
        m53.c2 c2Var = null;
        if (!com.tencent.mm.sdk.platformtools.t8.M0(D0)) {
            try {
                m53.c2 c2Var2 = new m53.c2();
                try {
                    c2Var2.parseFrom(D0);
                } catch (java.io.IOException unused) {
                }
                c2Var = c2Var2;
            } catch (java.io.IOException unused2) {
            }
        }
        if (c2Var != null) {
            java.util.LinkedList linkedList = c2Var.f323598d;
            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameRouteUI", "use cache data");
                java.lang.String str = com.tencent.mm.plugin.game.model.a3.f140200f;
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGameIndex4TabNav", "update gameIndexTabNav data");
                gm0.j1.d().a(2641, com.tencent.mm.plugin.game.model.a3.f140201g);
                gm0.j1.d().g(new com.tencent.mm.plugin.game.model.a3());
                boolean booleanExtra = getIntent().getBooleanExtra("switch_country_no_anim", false);
                getIntent().removeExtra("switch_country_no_anim");
                a7(linkedList, !booleanExtra);
                return;
            }
        }
        gm0.j1.d().a(2641, this);
        gm0.j1.d().g(new com.tencent.mm.plugin.game.model.a3());
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(2641, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        Z6();
        return true;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameRouteUI", "pull gameIndexTabNav data success");
            com.tencent.mm.sdk.platformtools.u3.h(new p53.b(this, (m53.c2) ((com.tencent.mm.plugin.game.model.a3) m1Var).f140203e.f70711b.f70700a));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameRouteUI", "pull gameIndexTabNav data fail");
            Z6();
        }
    }
}
