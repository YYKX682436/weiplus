package com.tencent.mm.plugin.game.media;

/* loaded from: classes8.dex */
public class GamePublishGalleryUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.game.media.TextViewWithBottomLine f140055d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.media.TextViewWithBottomLine f140056e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.viewpager.widget.ViewPager f140057f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.game.media.GameLocalGalleryView f140058g;

    /* renamed from: h, reason: collision with root package name */
    public i53.a2 f140059h;

    /* renamed from: i, reason: collision with root package name */
    public int f140060i;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v14 */
    public final void T6() {
        int i17;
        android.view.View view;
        ?? r27;
        android.widget.TextView textView;
        getController().W0(this, getResources().getColor(com.tencent.mm.R.color.aaw));
        com.tencent.mm.plugin.game.media.TextViewWithBottomLine textViewWithBottomLine = (com.tencent.mm.plugin.game.media.TextViewWithBottomLine) findViewById(com.tencent.mm.R.id.gnq);
        this.f140055d = textViewWithBottomLine;
        textViewWithBottomLine.setOnClickListener(new i53.l1(this));
        com.tencent.mm.plugin.game.media.TextViewWithBottomLine textViewWithBottomLine2 = (com.tencent.mm.plugin.game.media.TextViewWithBottomLine) findViewById(com.tencent.mm.R.id.gn7);
        this.f140056e = textViewWithBottomLine2;
        textViewWithBottomLine2.setOnClickListener(new i53.m1(this));
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.glb)).setOnClickListener(new i53.n1(this));
        this.f140057f = (androidx.viewpager.widget.ViewPager) findViewById(com.tencent.mm.R.id.gpk);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int intExtra = getIntent().getIntExtra("query_media_type", 3);
        boolean booleanExtra = getIntent().getBooleanExtra("game_haowan_force_select", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("game_straight_to_publish", false);
        this.f140060i = getIntent().getIntExtra("game_haowan_source_scene_id", 0);
        com.tencent.mm.plugin.game.media.GameGalleryFragment gameGalleryFragment = new com.tencent.mm.plugin.game.media.GameGalleryFragment();
        int i18 = com.tencent.mm.sdk.platformtools.o4.M(i53.t.b("game_haowan_mmkv_key")).getInt("game_last_choose_gallery", 0);
        if (intExtra == 1) {
            gameGalleryFragment.f140043d = new android.widget.FrameLayout(this);
            i17 = 1;
        } else {
            int intExtra2 = getIntent().getIntExtra("game_media_default_type", 0);
            if (intExtra2 == 1 || intExtra2 == 2) {
                i18 = intExtra2;
            }
            i17 = (i18 != 1 && i18 == 2) ? 1 : 0;
            this.f140059h = new i53.a2(this);
            getIntent().getBooleanExtra("game_haowan_ignore_video_preview", true);
            i53.a2 a2Var = this.f140059h;
            int i19 = this.f140060i;
            a2Var.f288507r = booleanExtra;
            if (booleanExtra && (view = a2Var.f288503n) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "setConfig", "(ZZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "setConfig", "(ZZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            a2Var.f288508s = booleanExtra2;
            a2Var.f288509t = i19;
            java.lang.String stringExtra = getIntent().getStringExtra("game_haowan_local_albums_info");
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                try {
                    jSONArray = new org.json.JSONArray(stringExtra);
                } catch (org.json.JSONException unused) {
                }
            }
            if (jSONArray.length() == 0) {
                jSONArray = com.tencent.mm.plugin.game.commlib.i.d();
            }
            this.f140059h.setLocalAlbumInfos(jSONArray);
            this.f140059h.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aaw));
            gameGalleryFragment.f140043d = this.f140059h;
        }
        arrayList.add(gameGalleryFragment);
        com.tencent.mm.plugin.game.media.GameGalleryFragment gameGalleryFragment2 = new com.tencent.mm.plugin.game.media.GameGalleryFragment();
        com.tencent.mm.plugin.game.media.GameLocalGalleryView gameLocalGalleryView = new com.tencent.mm.plugin.game.media.GameLocalGalleryView(this);
        this.f140058g = gameLocalGalleryView;
        int i27 = this.f140060i;
        gameLocalGalleryView.f140051m = booleanExtra;
        if (booleanExtra && (textView = gameLocalGalleryView.f140047f) != null) {
            textView.setVisibility(8);
        }
        gameLocalGalleryView.f140052n = booleanExtra2;
        gameLocalGalleryView.f140053o = i27;
        this.f140058g.setQueryType(intExtra);
        this.f140058g.setSelectLimitCount(getIntent().getIntExtra("max_select_count", 9));
        gameGalleryFragment2.f140043d = this.f140058g;
        arrayList.add(gameGalleryFragment2);
        this.f140057f.setAdapter(new i53.w0(getSupportFragmentManager(), arrayList));
        this.f140057f.addOnPageChangeListener(new i53.o1(this));
        g53.i iVar = g53.i.f268912a;
        if (g53.i.b() != 4) {
            r27 = 1;
        } else {
            r27 = 1;
            if (i17 % 2 != 1) {
                this.f140055d.setSelected(true);
                this.f140056e.setSelected(false);
                U6(i17, false);
                com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 87, 8767, 0, 1, 87, nj0.a.c(new java.util.HashMap()));
            }
        }
        this.f140055d.setSelected(false);
        this.f140056e.setSelected(r27);
        U6(r27, false);
        com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 87, 8767, 0, 1, 87, nj0.a.c(new java.util.HashMap()));
    }

    public void U6(int i17, boolean z17) {
        i53.a2 a2Var;
        int i18 = i17 % 2;
        if (i18 != 0 || (a2Var = this.f140059h) == null) {
            com.tencent.mm.plugin.game.media.GameLocalGalleryView gameLocalGalleryView = this.f140058g;
            if (!gameLocalGalleryView.f140050i) {
                gameLocalGalleryView.c(0, 1, null);
            }
            gameLocalGalleryView.f140050i = true;
            i53.a2 a2Var2 = this.f140059h;
            if (a2Var2 != null) {
                a2Var2.f288505p.dismiss();
                com.tencent.mm.sdk.platformtools.b4 b4Var = a2Var2.f288511v;
                if (b4Var != null) {
                    b4Var.d();
                }
            }
        } else {
            if (!a2Var.f288506q) {
                a2Var.f(0, 1, new java.util.HashMap());
            }
            a2Var.f288506q = true;
            this.f140059h.d();
        }
        this.f140057f.setCurrentItem(i17);
        if (z17) {
            com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 87, i18 == 0 ? 8762 : 8767, 0, 1, this.f140060i, lj0.a.a(7, new java.util.HashMap()));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bgb;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean noActionBar() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0195 A[RETURN] */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r22, int r23, android.content.Intent r24) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.media.GamePublishGalleryUI.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 145, getString(com.tencent.mm.R.string.hht), getString(android.os.Build.VERSION.SDK_INT < 33 ? com.tencent.mm.R.string.fm9 : com.tencent.mm.R.string.msl))) {
            T6();
        }
        com.tencent.mm.plugin.game.commlib.util.i.a(this);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        supportRequestWindowFeature(10);
        supportRequestWindowFeature(1);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.game.media.TextViewWithBottomLine textViewWithBottomLine = this.f140055d;
        if (textViewWithBottomLine == null || !textViewWithBottomLine.isSelected()) {
            i53.t.g(2);
        } else {
            i53.t.g(1);
        }
        super.onDestroy();
        com.tencent.mm.plugin.game.media.GameLocalGalleryView gameLocalGalleryView = this.f140058g;
        if (gameLocalGalleryView != null) {
            gameLocalGalleryView.getClass();
            ((d60.y) ((e60.c1) i95.n0.c(e60.c1.class))).getClass();
            t23.p0.k().f(gameLocalGalleryView);
        }
        com.tencent.mm.plugin.game.commlib.util.i.f(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        qp1.h0.b();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GamePublishGalleryUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GamePublishGalleryUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 145) {
            return;
        }
        if (iArr[0] == 0) {
            T6();
        } else {
            db5.e1.C(this, getString(com.tencent.mm.R.string.fot), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.fic), false, new i53.p1(this), new i53.q1(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        qp1.h0.a(true, true, true);
    }
}
