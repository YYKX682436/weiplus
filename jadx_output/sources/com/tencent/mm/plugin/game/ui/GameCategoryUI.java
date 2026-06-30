package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class GameCategoryUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f140685d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.d4 f140686e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f140687f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Dialog f140688g;

    /* renamed from: n, reason: collision with root package name */
    public int f140692n;

    /* renamed from: o, reason: collision with root package name */
    public int f140693o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f140694p;

    /* renamed from: h, reason: collision with root package name */
    public boolean f140689h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f140690i = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f140691m = false;

    /* renamed from: q, reason: collision with root package name */
    public int f140695q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.ui.b4 f140696r = new com.tencent.mm.plugin.game.ui.b4();

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.ui.w4 f140697s = new com.tencent.mm.plugin.game.ui.d0(this);

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.AbsListView.OnScrollListener f140698t = new com.tencent.mm.plugin.game.ui.e0(this);

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489137be4;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.game.model.c0 c0Var;
        com.tencent.mm.plugin.game.model.c0 c0Var2;
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameCategoryUI", "requestCode = %d, resultCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameCategoryUI", "error request code");
            return;
        }
        com.tencent.mm.plugin.game.model.b bVar = null;
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("game_app_id") : null;
        if (i18 != 2) {
            if (i18 == 3 && !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                com.tencent.mm.plugin.game.ui.d4 d4Var = this.f140686e;
                d4Var.getClass();
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    return;
                }
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = d4Var.f141881q;
                if (concurrentHashMap.containsKey(stringExtra) && (c0Var2 = (com.tencent.mm.plugin.game.model.c0) concurrentHashMap.get(stringExtra)) != null) {
                    c0Var2.b();
                    return;
                }
                return;
            }
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            return;
        }
        com.tencent.mm.plugin.game.ui.d4 d4Var2 = this.f140686e;
        d4Var2.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = d4Var2.f141881q;
            if (concurrentHashMap2.containsKey(stringExtra) && (c0Var = (com.tencent.mm.plugin.game.model.c0) concurrentHashMap2.get(stringExtra)) != null) {
                c0Var.f140243c = 1;
            }
        }
        com.tencent.mm.plugin.game.ui.d4 d4Var3 = this.f140686e;
        int i19 = 0;
        while (true) {
            if (i19 >= d4Var3.f141353e.size()) {
                break;
            }
            if (((com.tencent.mm.plugin.game.model.b) d4Var3.f141353e.get(i19)).field_appId.equals(stringExtra)) {
                bVar = (com.tencent.mm.plugin.game.model.b) d4Var3.f141353e.get(i19);
                break;
            }
            i19++;
        }
        if (bVar == null) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = d4Var3.f141881q;
        if (concurrentHashMap3.containsKey(bVar.field_appId)) {
            d4Var3.f141883s.a(bVar, (com.tencent.mm.plugin.game.model.c0) concurrentHashMap3.get(bVar.field_appId));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameListAdapter", "No DownloadInfo found");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f140692n = getIntent().getIntExtra("extra_type", 0);
        this.f140693o = getIntent().getIntExtra("extra_category_id", 0);
        this.f140694p = getIntent().getStringExtra("extra_category_name");
        this.f140695q = getIntent().getIntExtra("game_report_from_scene", 0);
        gm0.j1.d().a(1220, this);
        setMMTitle(this.f140694p);
        setBackBtn(new com.tencent.mm.plugin.game.ui.b0(this));
        if (!com.tencent.mm.sdk.platformtools.t8.K0("")) {
            addIconOptionMenu(0, com.tencent.mm.R.string.jzr, com.tencent.mm.R.raw.actionbar_icon_dark_search, new com.tencent.mm.plugin.game.ui.c0(this));
        }
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.tencent.mm.R.id.gix);
        this.f140685d = listView;
        com.tencent.mm.plugin.game.ui.b4 b4Var = this.f140696r;
        listView.setOnItemClickListener(b4Var);
        b4Var.f141046d = this.f140695q;
        this.f140685d.setOnScrollListener(this.f140698t);
        com.tencent.mm.plugin.game.ui.d4 d4Var = new com.tencent.mm.plugin.game.ui.d4(this);
        this.f140686e = d4Var;
        d4Var.f141880p = this.f140695q;
        d4Var.f141884t = this.f140697s;
        android.view.View inflate = ((android.view.LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(com.tencent.mm.R.layout.bgs, (android.view.ViewGroup) this.f140685d, false);
        this.f140687f = inflate;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameCategoryUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/game/ui/GameCategoryUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f140685d.addFooterView(this.f140687f);
        this.f140685d.setAdapter((android.widget.ListAdapter) this.f140686e);
        android.app.Dialog e17 = r53.f.e(this);
        this.f140688g = e17;
        e17.show();
        com.tencent.mm.plugin.game.commlib.util.i.a(this);
        gm0.j1.d().g(new com.tencent.mm.plugin.game.model.h3(this.f140690i, 15, this.f140692n, this.f140693o));
        this.f140689h = true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(1220, this);
        com.tencent.mm.plugin.game.commlib.util.i.f(this);
        this.f140686e.h();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameCategoryUI", "errType: %d, errCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        } else {
            gm0.j1.e().j(new com.tencent.mm.plugin.game.ui.g0(this, ((com.tencent.mm.plugin.game.model.h3) m1Var).f140329e.f70711b.f70700a));
        }
    }
}
