package com.tencent.mm.plugin.game.media.background;

@db5.a(3)
/* loaded from: classes10.dex */
public class GameFakeVideoUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.pluginsdk.ui.tools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f140101d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.f4 f140102e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f140103f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f140104g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f140105h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f140106i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.tools.s4 f140107m;

    /* renamed from: n, reason: collision with root package name */
    public ru3.c f140108n;

    /* renamed from: o, reason: collision with root package name */
    public long f140109o;

    /* renamed from: p, reason: collision with root package name */
    public long f140110p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f140111q = new com.tencent.mm.sdk.platformtools.b4(new j53.f(this), true);

    /* renamed from: r, reason: collision with root package name */
    public int f140112r = 0;

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bfr;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameFakeVideoUI", "on completion, startTime:%d", java.lang.Long.valueOf(this.f140109o));
        ((com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) this.f140102e).a(this.f140109o, true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        hideTitleView();
        getWindow().setFlags(1024, 1024);
        if (com.tencent.mm.booter.b.d() != null) {
            com.tencent.mm.booter.b.d().a();
        }
        this.f140101d = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.p0w);
        this.f140103f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ght);
        this.f140104g = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.f487563p06);
        this.f140105h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.oyr);
        com.tencent.mm.plugin.game.media.background.GameFakeVideoView gameFakeVideoView = new com.tencent.mm.plugin.game.media.background.GameFakeVideoView(this);
        this.f140102e = gameFakeVideoView;
        gameFakeVideoView.setVideoCallback(this);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.f140104g.addView((android.view.View) this.f140102e, layoutParams);
        java.lang.String stringExtra = getIntent().getStringExtra("game_bg_mix_fake_local_id");
        if (stringExtra == null || !stringExtra.startsWith("weixin://bgmixid/")) {
            setResult(101);
            finish();
            return;
        }
        java.lang.String taskId = stringExtra.replace("weixin://bgmixid/", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameFakeVideoUI", "bgMixTaskId:%s", taskId);
        ((pc0.m2) ((qc0.j1) i95.n0.c(qc0.j1.class))).getClass();
        kotlin.jvm.internal.o.g(taskId, "taskId");
        lt3.g b17 = lt3.n.f321260a.b(taskId);
        if (b17 == null || b17.t0() == null) {
            setResult(102);
            finish();
            return;
        }
        java.lang.String str = b17.t0().f382371n;
        this.f140106i = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameFakeVideoUI", "videoPath:%s", str);
        r45.hi0 hi0Var = new r45.hi0();
        byte[] bArr = b17.field_baseItemData;
        if (bArr != null) {
            try {
                hi0Var.parseFrom(bArr);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        this.f140109o = hi0Var.f376181e;
        this.f140110p = hi0Var.f376182f;
        ((pc0.c) ((qc0.x0) i95.n0.c(qc0.x0.class))).getClass();
        lt3.e eVar = lt3.e.f321209a;
        com.tencent.mm.plugin.recordvideo.ui.FakeVideoViewLayer fakeVideoViewLayer = new com.tencent.mm.plugin.recordvideo.ui.FakeVideoViewLayer(this);
        this.f140108n = fakeVideoViewLayer;
        this.f140104g.addView(fakeVideoViewLayer, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f140108n.setFakeVideoInfo(b17);
        this.f140102e.setMute(((com.tencent.mm.plugin.recordvideo.ui.FakeVideoViewLayer) this.f140108n).f155890h);
        this.f140104g.setOnTouchListener(new j53.e(this));
        this.f140107m = new com.tencent.mm.ui.tools.s4(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ((com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) this.f140102e).stop();
        com.tencent.mm.plugin.recordvideo.ui.FakeVideoViewLayer fakeVideoViewLayer = (com.tencent.mm.plugin.recordvideo.ui.FakeVideoViewLayer) this.f140108n;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LogStory: stopFakeLayer ");
        r45.hi0 hi0Var = fakeVideoViewLayer.f155887e;
        sb6.append(hi0Var != null ? java.lang.Long.valueOf(hi0Var.f376196w) : null);
        com.tencent.mars.xlog.Log.i(fakeVideoViewLayer.f155886d, sb6.toString());
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = fakeVideoViewLayer.f155888f;
        if (iTPPlayer != null) {
            iTPPlayer.stop();
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = fakeVideoViewLayer.f155888f;
        if (iTPPlayer2 != null) {
            iTPPlayer2.release();
        }
        fakeVideoViewLayer.f155888f = null;
        int childCount = fakeVideoViewLayer.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = fakeVideoViewLayer.getChildAt(i17);
            if (childAt instanceof com.tencent.mm.plugin.gif.MMAnimateView) {
                ((com.tencent.mm.plugin.gif.MMAnimateView) childAt).y();
            } else if (childAt instanceof zu3.v) {
                ((zu3.v) childAt).Q = false;
            }
        }
        fakeVideoViewLayer.f155893n = false;
        android.widget.ImageView imageView = fakeVideoViewLayer.f155891i;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        android.widget.ImageView imageView2 = fakeVideoViewLayer.f155891i;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        zv3.g gVar = fakeVideoViewLayer.f155892m;
        if (gVar != null) {
            gVar.c();
        }
        fakeVideoViewLayer.f155892m = null;
        this.f140111q.d();
        super.onDestroy();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
        setResult(0);
        this.f140102e.stop();
        com.tencent.mars.xlog.Log.e("MicroMsg.Haowan.GameFakeVideoUI", "play video error what %d extra %d.", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        ((com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) this.f140102e).pause();
        com.tencent.mm.plugin.recordvideo.ui.FakeVideoViewLayer fakeVideoViewLayer = (com.tencent.mm.plugin.recordvideo.ui.FakeVideoViewLayer) this.f140108n;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LogStory: pauseFakeLayer ");
        r45.hi0 hi0Var = fakeVideoViewLayer.f155887e;
        sb6.append(hi0Var != null ? java.lang.Long.valueOf(hi0Var.f376196w) : null);
        com.tencent.mars.xlog.Log.i(fakeVideoViewLayer.f155886d, sb6.toString());
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = fakeVideoViewLayer.f155888f;
        if (iTPPlayer != null) {
            iTPPlayer.pause();
        }
        int childCount = fakeVideoViewLayer.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = fakeVideoViewLayer.getChildAt(i17);
            if (childAt instanceof com.tencent.mm.plugin.gif.MMAnimateView) {
                ((com.tencent.mm.plugin.gif.MMAnimateView) childAt).pause();
            } else if (childAt instanceof zu3.v) {
                ((zu3.v) childAt).Q = false;
            }
        }
        fakeVideoViewLayer.f155893n = false;
        android.widget.ImageView imageView = fakeVideoViewLayer.f155891i;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        android.widget.ImageView imageView2 = fakeVideoViewLayer.f155891i;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        zv3.g gVar = fakeVideoViewLayer.f155892m;
        if (gVar != null) {
            gVar.c();
        }
        fakeVideoViewLayer.f155892m = null;
        super.onPause();
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f140102e;
        if (f4Var instanceof com.tencent.mm.plugin.game.media.background.GameFakeVideoView) {
            ((com.tencent.mm.plugin.game.media.background.GameFakeVideoView) f4Var).setKeepScreenOn(false);
        }
        qp1.h0.b();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        setResult(-1);
        ((com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) this.f140102e).start();
        this.f140112r = ((int) (this.f140110p - this.f140109o)) / 1000;
        this.f140111q.c(500L, 500L);
        ((com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) this.f140102e).a(this.f140109o, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameFakeVideoUI", "onPrepared videoView.start duration:%d", java.lang.Integer.valueOf(this.f140112r));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c3  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, android.graphics.Matrix] */
    /* JADX WARN: Type inference failed for: r6v15 */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.media.background.GameFakeVideoUI.onResume():void");
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        if (!this.f140102e.isPlaying()) {
            return 0;
        }
        long currentPosition = this.f140102e.getCurrentPosition();
        long j17 = this.f140110p;
        if (currentPosition < j17 || j17 >= this.f140102e.getDuration()) {
            return 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameFakeVideoUI", "currentPosition:%d reach endTime:%d, seekTo startTime:%d", java.lang.Integer.valueOf(this.f140102e.getCurrentPosition()), java.lang.Long.valueOf(this.f140110p), java.lang.Long.valueOf(this.f140109o));
        this.f140102e.a(this.f140109o, true);
        return 0;
    }
}
