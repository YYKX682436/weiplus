package com.tencent.mm.plugin.game.media.preview;

@db5.a(19)
/* loaded from: classes8.dex */
public class GameVideoPreviewUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f140113x = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f140114d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f140115e;

    /* renamed from: f, reason: collision with root package name */
    public k53.c0 f140116f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f140117g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f140118h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.game.media.GameVideoTagContainer f140119i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f140120m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f140121n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f140122o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f140123p;

    /* renamed from: s, reason: collision with root package name */
    public k53.u0 f140126s;

    /* renamed from: q, reason: collision with root package name */
    public int f140124q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f140125r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f140127t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f140128u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f140129v = 0;

    /* renamed from: w, reason: collision with root package name */
    public final androidx.recyclerview.widget.w2 f140130w = new k53.h(this);

    public static void T6(com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI gameVideoPreviewUI, p33.l lVar) {
        if (lVar == null) {
            gameVideoPreviewUI.getClass();
            return;
        }
        gameVideoPreviewUI.f140117g.setText(lVar.f351608m);
        gameVideoPreviewUI.f140118h.setText(lVar.f351615t);
        if (lVar.f351602d) {
            gameVideoPreviewUI.f140119i.setVisibility(8);
            android.view.View view = gameVideoPreviewUI.f140120m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "resetBottomView", "(Lcom/tencent/mm/plugin/game/autogen/ugc/GameVideoItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "resetBottomView", "(Lcom/tencent/mm/plugin/game/autogen/ugc/GameVideoItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            gameVideoPreviewUI.f140119i.setData(lVar.f351610o);
            android.view.View view2 = gameVideoPreviewUI.f140120m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "resetBottomView", "(Lcom/tencent/mm/plugin/game/autogen/ugc/GameVideoItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "resetBottomView", "(Lcom/tencent/mm/plugin/game/autogen/ugc/GameVideoItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int i17 = gameVideoPreviewUI.f140124q + 1;
        if (i17 > 100) {
            i17 = 100;
        }
        com.tencent.mm.game.report.l.f(gameVideoPreviewUI, 87, 8768, i17, 1, lVar.f351614s, gameVideoPreviewUI.f140129v, lj0.a.a(gameVideoPreviewUI.f140125r, gameVideoPreviewUI.X6(lVar)));
    }

    public static void U6(com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI gameVideoPreviewUI, int i17) {
        if (i17 < gameVideoPreviewUI.f140116f.getItemCount() - 2 || !gameVideoPreviewUI.f140127t) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoPreviewUI", "pull next page");
        k53.i iVar = new k53.i(gameVideoPreviewUI);
        i53.t tVar = i53.t.f288715p;
        if (tVar == null) {
            iVar.a(null, false);
        } else {
            tVar.d(new i53.m(iVar));
        }
    }

    public static android.os.Bundle V6(com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI gameVideoPreviewUI, int i17) {
        gameVideoPreviewUI.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.plugin.game.media.preview.GameVideoView W6 = gameVideoPreviewUI.W6(i17);
        if (W6 != null) {
            bundle.putString("key_video_cache_path", W6.getFilePath());
            bundle.putString("key_video_media_id", W6.getMediaId());
        }
        return bundle;
    }

    public final com.tencent.mm.plugin.game.media.preview.GameVideoView W6(int i17) {
        androidx.recyclerview.widget.k3 p07 = this.f140115e.p0(i17);
        if (p07 instanceof k53.b0) {
            return ((k53.b0) p07).f304338e;
        }
        return null;
    }

    public final java.util.Map X6(p33.l lVar) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (lVar == null) {
            return hashMap;
        }
        hashMap.put("videoid", lVar.f351619x);
        hashMap.put("origtime", java.lang.Long.valueOf(lVar.f351612q));
        hashMap.put("origsize", java.lang.Long.valueOf(lVar.f351613r));
        return hashMap;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489158bi1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 19722) {
            if (intent != null && i18 == -1) {
                p33.l x17 = this.f140116f.x(this.f140124q);
                if (x17 != null) {
                    intent.putExtra("key_game_video_appid", x17.f351614s);
                    intent.putExtra("key_game_video_appname", x17.f351615t);
                }
                setResult(i18, intent);
                finish();
                return;
            }
            com.tencent.mm.plugin.game.media.preview.GameVideoView W6 = W6(this.f140124q);
            if (W6 != null) {
                k53.g gVar = W6.f140145u;
                if (gVar != null) {
                    gVar.f304360f = true;
                }
                androidx.recyclerview.widget.k3 p07 = this.f140115e.p0(this.f140124q);
                android.widget.ImageView imageView = p07 instanceof k53.b0 ? ((k53.b0) p07).f304339f : null;
                if (imageView != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    imageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(imageView, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f140123p.getVisibility() != 0) {
            super.onBackPressed();
            com.tencent.mm.game.report.l.c(this, 87, 8768, 0, 4, this.f140129v, lj0.a.a(this.f140125r, null));
            finish();
            return;
        }
        android.view.View view = this.f140123p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onBackPressed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onBackPressed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f140126s.b();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(2097280);
        getWindow().setFlags(201327616, 201327616);
        ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
        ai3.d.f5107a = true;
        getWindow().setFormat(-3);
        this.f140114d = this;
        this.f140117g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.odf);
        this.f140118h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.k3s);
        this.f140119i = (com.tencent.mm.plugin.game.media.GameVideoTagContainer) findViewById(com.tencent.mm.R.id.p0j);
        this.f140120m = findViewById(com.tencent.mm.R.id.bzw);
        this.f140121n = findViewById(com.tencent.mm.R.id.f486896mt0);
        this.f140122o = findViewById(com.tencent.mm.R.id.c9z);
        this.f140123p = findViewById(com.tencent.mm.R.id.imn);
        this.f140126s = new k53.u0(this.f140114d, this.f140123p);
        this.f140115e = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.gpj);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this);
        linearLayoutManager.Q(0);
        this.f140115e.setLayoutManager(linearLayoutManager);
        new androidx.recyclerview.widget.y1().b(this.f140115e);
        this.f140115e.i(this.f140130w);
        this.f140128u = getIntent().getBooleanExtra("game_straight_to_publish", false);
        this.f140129v = getIntent().getIntExtra("game_haowan_source_scene_id", 0);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("game_video_list");
        this.f140124q = getIntent().getIntExtra("game_video_list_current_index", 0);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!com.tencent.mm.sdk.platformtools.t8.M0(byteArrayExtra)) {
            p33.m mVar = new p33.m();
            try {
                mVar.parseFrom(byteArrayExtra);
            } catch (java.io.IOException unused) {
            }
            linkedList.addAll(mVar.f351622d);
        }
        this.f140115e.getViewTreeObserver().addOnGlobalLayoutListener(new k53.j(this, linkedList));
        findViewById(com.tencent.mm.R.id.c9z).setOnClickListener(new k53.k(this));
        this.f140120m.setOnClickListener(new k53.m(this));
        this.f140121n.setOnClickListener(new k53.n(this));
        findViewById(com.tencent.mm.R.id.gph).setOnClickListener(new k53.o(this));
        if (((i53.g4) getIntent().getSerializableExtra("game_video_preview_source")) == i53.g4.FROM_PUBLISH_GALLERY) {
            this.f140125r = 7;
            android.view.View view = this.f140121n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f140122o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            this.f140125r = 6;
            android.view.View view3 = this.f140121n;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f140122o;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.game.report.l.c(this, 87, 8768, 0, 1, this.f140129v, lj0.a.a(this.f140125r, null));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f140115e.V0(this.f140130w);
        com.tencent.mm.plugin.game.media.preview.GameVideoView W6 = W6(this.f140124q);
        if (W6 != null) {
            W6.d();
        }
        this.f140126s.b();
        r53.f.l().postToWorker(new k53.s(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.game.media.preview.GameVideoView W6 = W6(this.f140124q);
        if (W6 != null) {
            W6.e();
        }
        qp1.h0.b();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.game.media.preview.GameVideoView W6 = W6(this.f140124q);
        if (W6 != null) {
            W6.g();
        }
        qp1.h0.a(true, true, true);
    }
}
