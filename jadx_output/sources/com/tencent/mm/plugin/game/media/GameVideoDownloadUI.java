package com.tencent.mm.plugin.game.media;

@db5.a(19)
/* loaded from: classes12.dex */
public class GameVideoDownloadUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String f140070s = com.tencent.mm.plugin.game.commlib.util.m.b(com.tencent.mm.plugin.game.commlib.util.l.ONE_WEEK) + "haowan/";

    /* renamed from: d, reason: collision with root package name */
    public int f140071d;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Context f140073f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f140074g;

    /* renamed from: h, reason: collision with root package name */
    public int f140075h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f140076i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f140077m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f140078n;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.game.commlib.view.CycleProgressView f140080p;

    /* renamed from: q, reason: collision with root package name */
    public i53.w3 f140081q;

    /* renamed from: e, reason: collision with root package name */
    public final i53.i4 f140072e = new i53.m3(this);

    /* renamed from: o, reason: collision with root package name */
    public long f140079o = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f140082r = 0;

    public final void T6(java.lang.String str) {
        i53.t3 t3Var = new i53.t3(this, findViewById(com.tencent.mm.R.id.imn));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        dn.o oVar = new dn.o();
        oVar.f241785d = "task_GameVideoDownloadUI";
        oVar.field_mediaId = this.f140074g;
        oVar.M1 = str;
        oVar.H1 = 0;
        oVar.Z = 3;
        oVar.f241809y0 = 4;
        com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(this.f140078n));
        oVar.field_fullpath = this.f140078n;
        oVar.f241815c2 = new i53.v3(this, currentTimeMillis, str, t3Var);
        this.f140079o = java.lang.System.currentTimeMillis();
        i53.w3 w3Var = new i53.w3(this, oVar);
        this.f140081q = w3Var;
        com.tencent.mm.sdk.platformtools.u3.i(w3Var, 500L);
    }

    public final void U6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoDownloadUI", "cancel video download!");
        com.tencent.mm.game.report.l.f(this.f140073f, 87, 8760, 1, 2, this.f140077m, this.f140082r, lj0.a.a(this.f140075h, V6(0)));
        int i17 = this.f140075h;
        if (i17 == 3) {
            ((kt.s0) ((lt.r0) i95.n0.c(lt.r0.class))).Ai(this.f140076i, "video download cancel", this.f140077m, -2, "video download cancel");
        } else if (i17 == 5) {
            setResult(-1, new android.content.Intent().putExtra("webview_callback_err", 1));
        }
        finish();
    }

    public final java.util.Map V6(int i17) {
        long currentTimeMillis = this.f140079o != 0 ? java.lang.System.currentTimeMillis() - this.f140079o : 0L;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("costtime", java.lang.Long.valueOf(currentTimeMillis));
        hashMap.put("failid", java.lang.Integer.valueOf(i17));
        return hashMap;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bhy;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoDownloadUI", "requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if ((this.f140071d == 11) || i17 != 223) {
            return;
        }
        setResult(i18, intent);
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (this.f140071d == 11) {
            ((i53.m3) this.f140072e).a();
        } else {
            U6();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(2097280);
        getWindow().setFlags(201327616, 201327616);
        this.f140073f = this;
        int intExtra = getIntent().getIntExtra("game_from", -1);
        this.f140071d = intExtra;
        if (intExtra == 11) {
            i53.m3 m3Var = (i53.m3) this.f140072e;
            com.tencent.mm.ui.MMActivity mMActivity = m3Var.f288658a;
            java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("video_url");
            java.lang.String stringExtra2 = mMActivity.getIntent().getStringExtra("thumb_url");
            m3Var.f288661d = (com.tencent.mm.plugin.game.commlib.view.CycleProgressView) mMActivity.findViewById(com.tencent.mm.R.id.f484021cq2);
            mMActivity.findViewById(com.tencent.mm.R.id.f484117d33).setOnClickListener(new i53.e3(m3Var));
            android.widget.ImageView imageView = (android.widget.ImageView) mMActivity.findViewById(com.tencent.mm.R.id.oz8);
            android.widget.ImageView imageView2 = (android.widget.ImageView) mMActivity.findViewById(com.tencent.mm.R.id.oyi);
            int h17 = r53.f.h(mMActivity);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) imageView2.getLayoutParams();
            layoutParams.width = h17;
            layoutParams.height = (h17 * 1080) / 1920;
            imageView2.setLayoutParams(layoutParams);
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
            n11.a b17 = n11.a.b();
            o11.f fVar = new o11.f();
            fVar.f342078b = true;
            b17.i(stringExtra2, imageView, fVar.a(), new i53.g3(m3Var, imageView, imageView2));
            m3Var.f288660c = i53.m3.f288657f + "MMVideo_" + com.tencent.mm.sdk.platformtools.w2.a(stringExtra) + ".mp4";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MMVideo_");
            sb6.append(com.tencent.mm.sdk.platformtools.w2.b(stringExtra.getBytes()));
            m3Var.f288659b = sb6.toString();
            if (com.tencent.mars.comm.NetStatusUtil.isWifi(mMActivity)) {
                m3Var.b(stringExtra);
            } else {
                com.tencent.mm.ui.MMActivity mMActivity2 = m3Var.f288658a;
                db5.e1.C(mMActivity2, mMActivity2.getString(com.tencent.mm.R.string.fpu), "", mMActivity.getString(com.tencent.mm.R.string.fps), mMActivity.getString(com.tencent.mm.R.string.fpr), false, new i53.h3(m3Var, stringExtra), new i53.i3(m3Var));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GameVideoDownloadPerform", "onCreate");
            return;
        }
        this.f140075h = getIntent().getIntExtra("from", -1);
        this.f140076i = getIntent().getStringExtra("business_type");
        this.f140077m = getIntent().getStringExtra("appid");
        java.lang.String stringExtra3 = getIntent().getStringExtra("video_url");
        java.lang.String stringExtra4 = getIntent().getStringExtra("thumb_url");
        this.f140082r = getIntent().getIntExtra("game_haowan_source_scene_id", 0);
        this.f140080p = (com.tencent.mm.plugin.game.commlib.view.CycleProgressView) findViewById(com.tencent.mm.R.id.f484021cq2);
        findViewById(com.tencent.mm.R.id.f484117d33).setOnClickListener(new i53.n3(this));
        android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.oz8);
        android.widget.ImageView imageView4 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.oyi);
        int h18 = r53.f.h(this.f140073f);
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) imageView4.getLayoutParams();
        layoutParams2.width = h18;
        layoutParams2.height = (h18 * 1080) / 1920;
        imageView4.setLayoutParams(layoutParams2);
        imageView3.setVisibility(8);
        imageView4.setVisibility(0);
        n11.a b18 = n11.a.b();
        o11.f fVar2 = new o11.f();
        fVar2.f342078b = true;
        b18.i(stringExtra4, imageView3, fVar2.a(), new i53.p3(this, imageView3, imageView4));
        android.os.Bundle bundleExtra = getIntent().getBundleExtra("ext_data");
        if (bundleExtra != null) {
            this.f140078n = bundleExtra.getString("key_video_cache_path");
            this.f140074g = bundleExtra.getString("key_video_media_id");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoDownloadUI", "video cache path:%s", this.f140078n);
        if (!com.tencent.mm.vfs.w6.j(this.f140078n)) {
            this.f140078n = f140070s + "MMVideo_" + com.tencent.mm.sdk.platformtools.w2.a(stringExtra3) + ".mp4";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f140074g)) {
            this.f140074g = "MMVideo_" + com.tencent.mm.sdk.platformtools.w2.a(stringExtra3);
        }
        if (com.tencent.mars.comm.NetStatusUtil.isWifi(this) || this.f140075h != 3) {
            T6(stringExtra3);
        } else {
            db5.e1.C(this, getString(com.tencent.mm.R.string.fpv), "", getString(com.tencent.mm.R.string.fps), getString(com.tencent.mm.R.string.fpr), false, new i53.q3(this, stringExtra3), new i53.r3(this));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoDownloadUI", "onCreate");
        com.tencent.mm.game.report.l.f(this, 87, 8760, 0, 1, this.f140077m, this.f140082r, lj0.a.a(this.f140075h, null));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!(this.f140071d == 11)) {
            i53.w3 w3Var = this.f140081q;
            if (w3Var != null) {
                com.tencent.mm.sdk.platformtools.u3.l(w3Var);
            }
            ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
            t21.o2.Di().g(this.f140074g, null);
            return;
        }
        i53.m3 m3Var = (i53.m3) this.f140072e;
        i53.l3 l3Var = m3Var.f288662e;
        if (l3Var != null) {
            com.tencent.mm.sdk.platformtools.u3.l(l3Var);
        }
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        t21.o2.Di().g(m3Var.f288659b, null);
    }
}
