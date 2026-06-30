package com.tencent.mm.plugin.finder.member.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/member/ui/FinderMemberQAVideoUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lzy2/ub;", "<init>", "()V", "lo2/u", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes8.dex */
public final class FinderMemberQAVideoUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements zy2.ub {
    public static final /* synthetic */ int F = 0;
    public r45.kb4 A;
    public boolean C;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.FrameLayout f121402t;

    /* renamed from: u, reason: collision with root package name */
    public long f121403u;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView f121405w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f121406x;

    /* renamed from: z, reason: collision with root package name */
    public zy2.g5 f121408z;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f121404v = "";

    /* renamed from: y, reason: collision with root package name */
    public final boolean f121407y = true;
    public boolean B = true;
    public final com.tencent.mm.sdk.platformtools.n3 D = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    public final lo2.u E = new lo2.u(this);

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
    }

    @Override // zy2.ub
    public void e3(int i17, int i18) {
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dcd;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        java.util.HashSet Q0 = importUIComponents != null ? kz5.n0.Q0(importUIComponents) : null;
        if (Q0 != null) {
            Q0.add(eo2.b.class);
        }
        return Q0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        zy2.g5 g5Var = this.f121408z;
        long videoDurationMs = g5Var != null ? g5Var.getVideoDurationMs() : 0L;
        com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView finderHeroSeekBarView = this.f121405w;
        if (finderHeroSeekBarView != null) {
            finderHeroSeekBarView.setTotalTimeMs(videoDurationMs);
        }
        int i17 = videoDurationMs > ((long) 16000) ? 0 : 8;
        com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView finderHeroSeekBarView2 = this.f121405w;
        if (finderHeroSeekBarView2 == null || this.f121406x == null || !this.f121407y) {
            return;
        }
        finderHeroSeekBarView2.setVisibility(i17);
        android.widget.ImageView imageView = this.f121406x;
        kotlin.jvm.internal.o.d(imageView);
        imageView.setVisibility(i17);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        byte[] byteArrayExtra;
        super.onCreate(bundle);
        this.f121403u = getIntent().getLongExtra("key_feed_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("key_nonce_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f121404v = stringExtra;
        com.tencent.mars.xlog.Log.i("Finder.FinderMemberQAVideoUI", "feedId %s nonceId %s", java.lang.String.valueOf(this.f121403u), this.f121404v);
        if (this.f121403u == 0 && (byteArrayExtra = getIntent().getByteArrayExtra("key_local_media")) != null) {
            r45.kb4 kb4Var = new r45.kb4();
            this.A = kb4Var;
            try {
                kb4Var.parseFrom(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        this.C = this.A != null;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.p0y);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f121402t = (android.widget.FrameLayout) findViewById;
        this.f121406x = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.gzz);
        this.f121405w = (com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView) findViewById(com.tencent.mm.R.id.p08);
        if (this.C) {
            android.widget.FrameLayout frameLayout = this.f121402t;
            if (frameLayout == null) {
                kotlin.jvm.internal.o.o("videoContainer");
                throw null;
            }
            frameLayout.setOnClickListener(new lo2.v(this));
            addIconOptionMenu(0, com.tencent.mm.R.string.f490367t0, com.tencent.mm.R.raw.icons_outlined_delete, new lo2.y(this));
            setBackBtn(new lo2.z(this));
        } else {
            android.widget.FrameLayout frameLayout2 = this.f121402t;
            if (frameLayout2 == null) {
                kotlin.jvm.internal.o.o("videoContainer");
                throw null;
            }
            frameLayout2.setOnClickListener(new lo2.a0(this));
            android.view.View decorView = getWindow().getDecorView();
            kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
            decorView.setSystemUiVisibility(1280);
            com.tencent.mm.ui.r0.a(this, false);
            getWindow().setFlags(201327616, 201327616);
            androidx.appcompat.app.b supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.w(new android.graphics.drawable.ColorDrawable(0));
                supportActionBar.o();
            }
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new lo2.d0(this, null), 3, null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView finderHeroSeekBarView = this.f121405w;
        if (finderHeroSeekBarView != null) {
            finderHeroSeekBarView.f191139u = false;
            wu5.c cVar = finderHeroSeekBarView.f191137s;
            if (cVar != null) {
                cVar.cancel(false);
            }
        }
        zy2.g5 g5Var = this.f121408z;
        if (g5Var != null) {
            g5Var.d();
        }
        zy2.g5 g5Var2 = this.f121408z;
        if (g5Var2 != null) {
            g5Var2.b();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }
}
