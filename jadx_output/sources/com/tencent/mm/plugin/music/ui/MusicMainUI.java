package com.tencent.mm.plugin.music.ui;

@db5.a(32)
/* loaded from: classes11.dex */
public class MusicMainUI extends com.tencent.mm.ui.MMActivity implements androidx.viewpager.widget.ViewPager.OnPageChangeListener, com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int I = 0;
    public long A;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.CheckBox f150702d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageButton f150703e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageButton f150704f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.music.MusicSeekBar f150705g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.music.ui.MusicViewPager f150706h;

    /* renamed from: i, reason: collision with root package name */
    public q35.d f150707i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.music.ui.u f150708m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f150709n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f150710o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f150711p;

    /* renamed from: q, reason: collision with root package name */
    public int f150712q;

    /* renamed from: r, reason: collision with root package name */
    public int f150713r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f150714s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f150715t;

    /* renamed from: u, reason: collision with root package name */
    public long f150716u = 0;

    /* renamed from: v, reason: collision with root package name */
    public long f150717v = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f150718w = false;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f150719x = "";

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f150720y = "";

    /* renamed from: z, reason: collision with root package name */
    public boolean f150721z = false;
    public int B = 0;
    public final com.tencent.mm.sdk.event.IListener C = new com.tencent.mm.plugin.music.ui.MusicMainUI.AnonymousClass4(com.tencent.mm.app.a0.f53288d);
    public java.util.concurrent.Future D = null;
    public final com.tencent.mm.sdk.platformtools.n3 E = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    public int F = -1;
    public final com.tencent.mm.plugin.music.player.base.k G = new com.tencent.mm.plugin.music.ui.k0(this);
    public final com.tencent.mm.sdk.platformtools.n3 H = new com.tencent.mm.plugin.music.ui.v(this, android.os.Looper.getMainLooper());

    /* renamed from: com.tencent.mm.plugin.music.ui.MusicMainUI$4, reason: invalid class name */
    /* loaded from: classes11.dex */
    public class AnonymousClass4 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent> {
        public AnonymousClass4(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = -1155728636;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
            com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent2 = musicPlayerEvent;
            int i17 = musicPlayerEvent2.f54512g.f7036b;
            if (i17 != 13) {
                if (i17 != 14) {
                    com.tencent.mm.plugin.music.ui.MusicMainUI musicMainUI = com.tencent.mm.plugin.music.ui.MusicMainUI.this;
                    switch (i17) {
                        case 0:
                        case 1:
                            musicMainUI.f150702d.setChecked(false);
                            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.music.ui.a0(this, musicPlayerEvent2));
                            break;
                        case 2:
                        case 3:
                        case 4:
                            musicMainUI.f150702d.setChecked(true);
                            break;
                        case 5:
                            com.tencent.mm.sdk.platformtools.v5.b(musicMainUI.getContext(), com.tencent.mm.R.string.j2u);
                            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.music.ui.c0(this));
                            break;
                        case 6:
                            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.music.ui.d0(this, musicPlayerEvent2));
                            break;
                        case 7:
                            if (((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).f308854c != 2) {
                                musicMainUI.f150702d.setChecked(true);
                                break;
                            } else {
                                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.music.ui.b0(this));
                                break;
                            }
                        case 8:
                            musicMainUI.f150705g.a(false);
                            break;
                    }
                } else if (((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).f308854c == 2) {
                    com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.music.ui.f0(this));
                }
            } else if (((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).f308854c == 2) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.music.ui.e0(this));
            }
            return false;
        }
    }

    public final void T6(int i17, b21.r rVar, boolean z17) {
        com.tencent.mm.autogen.mmdata.rpt.ShakeActionReport2Struct shakeActionReport2Struct = new com.tencent.mm.autogen.mmdata.rpt.ShakeActionReport2Struct();
        shakeActionReport2Struct.f60308d = i17;
        shakeActionReport2Struct.f60309e = java.lang.System.currentTimeMillis();
        shakeActionReport2Struct.f60314j = shakeActionReport2Struct.b("SessionID", getIntent().getStringExtra("session_id"), true);
        int i18 = ll3.j2.f319185a;
        shakeActionReport2Struct.f60322r = !com.tencent.mm.sdk.platformtools.t8.K0(rVar.f17353o) || !com.tencent.mm.sdk.platformtools.t8.K0(rVar.f17354p) || !com.tencent.mm.sdk.platformtools.t8.K0(rVar.f17352n) ? 1L : 3L;
        shakeActionReport2Struct.f60319o = shakeActionReport2Struct.b("ToSongDataurl", rVar.f17352n, true);
        shakeActionReport2Struct.f60316l = shakeActionReport2Struct.b("ToSongName", rVar.f17348g, true);
        shakeActionReport2Struct.f60311g = shakeActionReport2Struct.b("ToSongOrTv", rVar.f17346e, true);
        shakeActionReport2Struct.f60317m = shakeActionReport2Struct.b("ToSongSinger", rVar.f17349h, true);
        shakeActionReport2Struct.f60318n = shakeActionReport2Struct.b("ToSongWeburl", rVar.f17354p, true);
        shakeActionReport2Struct.f60320p = z17 ? 1L : 2L;
        shakeActionReport2Struct.k();
    }

    public final void U6(android.view.View view) {
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin + com.tencent.mm.ui.bk.p(getContext()), layoutParams.rightMargin, layoutParams.bottomMargin);
        view.setLayoutParams(layoutParams);
    }

    public void V6(ql3.a aVar) {
        android.widget.ImageButton imageButton;
        ql3.a z17 = ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).z();
        if (z17 == null) {
            return;
        }
        if (!(aVar == null ? false : z17.field_musicId.equals(aVar.field_musicId)) || (imageButton = this.f150704f) == null || this.f150703e == null || this.f150702d == null || imageButton.getBackground() == null || this.f150703e.getBackground() == null || this.f150702d.getBackground() == null || this.f150705g == null) {
            return;
        }
        if (!aVar.t0()) {
            this.f150704f.getBackground().setColorFilter(-1, android.graphics.PorterDuff.Mode.MULTIPLY);
            this.f150703e.getBackground().setColorFilter(-1, android.graphics.PorterDuff.Mode.MULTIPLY);
            this.f150702d.getBackground().setColorFilter(-1, android.graphics.PorterDuff.Mode.MULTIPLY);
            this.f150705g.setColor(-1);
            this.f150710o.setTextColor(-1);
            this.f150711p.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.MULTIPLY);
            return;
        }
        int i17 = aVar.field_songLyricColor;
        this.f150704f.getBackground().setColorFilter(i17, android.graphics.PorterDuff.Mode.MULTIPLY);
        this.f150703e.getBackground().setColorFilter(i17, android.graphics.PorterDuff.Mode.MULTIPLY);
        this.f150702d.getBackground().setColorFilter(i17, android.graphics.PorterDuff.Mode.MULTIPLY);
        this.f150705g.setColor(i17);
        this.f150710o.setTextColor(i17);
        this.f150711p.getDrawable().setColorFilter(i17, android.graphics.PorterDuff.Mode.MULTIPLY);
    }

    public final void W6() {
        com.tencent.mm.plugin.music.ui.u uVar = this.f150708m;
        uVar.f150801i = 200000;
        uVar.notifyDataSetChanged();
        if (((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).y()) {
            this.f150706h.setCanSlide(true);
        } else {
            this.f150706h.setCanSlide(false);
        }
    }

    public final void X6(ql3.a aVar) {
        if (!ll3.j2.h(aVar) || this.f150715t) {
            this.f150702d.setVisibility(4);
            this.f150704f.setVisibility(4);
        } else {
            this.f150702d.setVisibility(0);
            this.f150704f.setVisibility(0);
        }
    }

    public final void Y6() {
        int a17 = kl3.t.g().a().a();
        int duration = kl3.t.g().a().getDuration();
        if (a17 <= 0 || duration <= 0) {
            return;
        }
        this.f150705g.setProgress(a17);
        this.f150705g.setMaxProgress(duration);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c4j;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.graphics.Bitmap bitmap;
        if (-1 != i18 || 1 != i17) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        b21.r j17 = kl3.t.g().j();
        int i19 = ll3.j2.f319185a;
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        com.tencent.mm.opensdk.modelmsg.WXMusicObject wXMusicObject = new com.tencent.mm.opensdk.modelmsg.WXMusicObject();
        wXMusicObject.musicUrl = j17.f17354p;
        wXMusicObject.musicDataUrl = j17.f17352n;
        java.lang.String str = j17.f17353o;
        wXMusicObject.musicLowBandUrl = str;
        wXMusicObject.musicLowBandDataUrl = str;
        wXMusicObject.songAlbumUrl = j17.f17362x;
        wXMusicObject.songLyric = j17.f17355q;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
        wXMediaMessage.mediaObject = wXMusicObject;
        wXMediaMessage.title = j17.f17348g;
        wXMediaMessage.description = j17.f17349h;
        java.lang.String f17 = ll3.j2.f(j17);
        if (f17 == null || !com.tencent.mm.vfs.w6.j(f17)) {
            bitmap = null;
        } else {
            int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479890i3);
            bitmap = com.tencent.mm.sdk.platformtools.x.j0(f17, dimension, dimension, 0.0f);
        }
        if (bitmap != null) {
            wXMediaMessage.thumbData = com.tencent.mm.sdk.platformtools.t8.a(bitmap, true);
        } else {
            wXMediaMessage.thumbData = com.tencent.mm.sdk.platformtools.t8.a(com.tencent.mm.sdk.platformtools.x.c0(com.tencent.mm.R.drawable.f481343c15), true);
        }
        java.lang.String d17 = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).bj(ll3.j2.d(j17)) ? ll3.j2.d(j17) : "";
        com.tencent.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d;
        if (y7Var != null) {
            java.lang.String e17 = ll3.j2.e(j17);
            java.lang.String string = getResources().getString(com.tencent.mm.R.string.f490494wn);
            java.lang.String str2 = wXMediaMessage.title;
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(string);
            stringBuffer.append(str2);
            java.lang.String stringBuffer2 = stringBuffer.toString();
            r35.i1 i1Var = new r35.i1(this);
            i1Var.l(stringExtra);
            i1Var.i(stringBuffer2);
            i1Var.j(com.tencent.mm.R.string.f490941bb3);
            i1Var.g(java.lang.Boolean.TRUE);
            i1Var.a(new com.tencent.mm.app.x7(y7Var, wXMediaMessage, d17, e17, stringExtra, this));
            i1Var.k();
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicUtil", "succeed to share to friend:%s", stringExtra);
        }
    }

    public void onClickBack(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicMainUI", "onClickBack finish");
        finish();
    }

    public void onClickSend(android.view.View view) {
        b21.r j17 = kl3.t.g().j();
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicMainUI", "MusicType:%d, SongWebUrl ", java.lang.Integer.valueOf(j17.f17345d), j17.f17354p);
        if (j17.f17345d != 11) {
            if (android.text.TextUtils.isEmpty(j17.f17354p)) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String[] strArr = {getString(com.tencent.mm.R.string.h4u), getString(com.tencent.mm.R.string.h4v), getString(com.tencent.mm.R.string.b1o), getString(com.tencent.mm.R.string.c_8)};
            arrayList.add(0);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(4);
            db5.e1.e(this, "", strArr, "", new com.tencent.mm.plugin.music.ui.j0(this, j17));
            return;
        }
        com.tencent.mm.autogen.events.FetchAppBrandInfoForMusicEvent fetchAppBrandInfoForMusicEvent = new com.tencent.mm.autogen.events.FetchAppBrandInfoForMusicEvent();
        fetchAppBrandInfoForMusicEvent.e();
        am.ja jaVar = fetchAppBrandInfoForMusicEvent.f54253g;
        java.lang.String str = jaVar.f7018a;
        java.lang.String str2 = jaVar.f7020c;
        java.lang.String str3 = jaVar.f7019b;
        int i17 = jaVar.f7021d;
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicMainUI", "from app brand, appId:%s, brandName:%s, pkgType:%d, appUserName:%s", str, str2, java.lang.Integer.valueOf(i17), str3);
        java.lang.String string = getString(com.tencent.mm.R.string.f492246fs1, str2);
        if (android.text.TextUtils.isEmpty(j17.f17354p)) {
            new java.util.ArrayList().add(1);
            db5.e1.e(this, "", new java.lang.String[]{string}, "", new com.tencent.mm.plugin.music.ui.i0(this, str, str3, i17));
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.String[] strArr2 = {getString(com.tencent.mm.R.string.h4u), getString(com.tencent.mm.R.string.h4v), getString(com.tencent.mm.R.string.b1o), string};
        arrayList2.add(0);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(4);
        db5.e1.e(this, "", strArr2, "", new com.tencent.mm.plugin.music.ui.h0(this, j17, str, str3, i17));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b4  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.music.ui.MusicMainUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        q35.d dVar = this.f150707i;
        if (dVar != null) {
            dVar.b();
        }
        com.tencent.mm.plugin.music.ui.u uVar = this.f150708m;
        if (uVar != null) {
            uVar.f150807r.removeCallbacksAndMessages(null);
            ll3.r1 r1Var = uVar.f150803n;
            r1Var.f319227e.removeCallbacksAndMessages(null);
            ((lt0.f) r1Var.f319223a).clear();
        }
        com.tencent.mm.plugin.appbrand.widget.music.MusicSeekBar musicSeekBar = this.f150705g;
        if (musicSeekBar != null) {
            musicSeekBar.a(false);
        }
        java.util.concurrent.Future future = this.D;
        if (future != null) {
            future.cancel(false);
        }
        this.D = null;
        this.C.dead();
        kl3.t.g().f(this.G);
        if (!kl3.t.g().a().i()) {
            kl3.t.g().a().stopPlay();
        }
        kl3.z zVar = (kl3.z) ((kl3.i) sl3.b.b(kl3.i.class));
        if (((kl3.t) zVar.B()).a().i()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "really exit music");
        zVar.f308854c = 1;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicMainUI", "onPageSelected %d", java.lang.Integer.valueOf(i17));
        if (((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).y()) {
            this.f150706h.setCanSlide(false);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.E;
        n3Var.removeCallbacksAndMessages(null);
        n3Var.postDelayed(new com.tencent.mm.plugin.music.ui.l0(this, i17), 500L);
        if (this.F == -1) {
            this.F = i17;
        }
        if (this.F != i17) {
            this.F = i17;
            pl3.c.f356698a = true;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(285L, 3L, 1L, false);
            pl3.c.b(1, this.f150713r);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f150717v = java.lang.System.currentTimeMillis();
        b21.r j17 = kl3.t.g().j();
        ql3.a z17 = ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).z();
        if (j17 != null && z17 != null) {
            int i17 = !android.text.TextUtils.isEmpty(z17.field_songLyric) ? 1 : 0;
            if (!android.text.TextUtils.isEmpty(j17.f17344J)) {
                this.f150719x = j17.f17344J;
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[13];
            objArr[0] = "";
            objArr[1] = "";
            objArr[2] = java.lang.Long.valueOf(this.f150716u);
            objArr[3] = java.lang.Long.valueOf(this.f150717v);
            objArr[4] = z17.field_songName;
            objArr[5] = 0;
            objArr[6] = null;
            objArr[7] = java.lang.Integer.valueOf(i17);
            objArr[8] = java.lang.Integer.valueOf(this.f150718w ? 1 : 0);
            objArr[9] = java.lang.Integer.valueOf(j17.f17345d);
            objArr[10] = this.f150719x;
            objArr[11] = this.f150720y;
            objArr[12] = java.lang.Integer.valueOf(this.f150713r != 9 ? 0 : 1);
            g0Var.d(17629, objArr);
        }
        q35.d dVar = this.f150707i;
        if (dVar != null) {
            dVar.b();
        }
        kl3.t.g().f(this.G);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            r5 = this;
            super.onResume()
            long r0 = java.lang.System.currentTimeMillis()
            r5.f150716u = r0
            r0 = 0
            r5.f150718w = r0
            java.lang.Class<kl3.i> r1 = kl3.i.class
            sl3.a r2 = sl3.b.b(r1)
            kl3.i r2 = (kl3.i) r2
            kl3.z r2 = (kl3.z) r2
            ql3.a r2 = r2.z()
            r3 = 1
            if (r2 == 0) goto L2d
            int r2 = r2.field_musicType
            if (r2 == r3) goto L2b
            r4 = 4
            if (r2 == r4) goto L2b
            r4 = 6
            if (r2 == r4) goto L2b
            switch(r2) {
                case 8: goto L2b;
                case 9: goto L2b;
                case 10: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L2d
        L2b:
            r2 = r3
            goto L2e
        L2d:
            r2 = r0
        L2e:
            if (r2 == 0) goto L70
            boolean r1 = r5.f150715t
            if (r1 != 0) goto L81
            q35.d r1 = r5.f150707i
            if (r1 == 0) goto L67
            android.hardware.SensorManager r1 = r1.f359974a
            if (r1 != 0) goto L44
            java.lang.String r1 = "MicroMsg.ShakeSensorService"
            java.lang.String r2 = "cannot init sensor manager"
            com.tencent.mars.xlog.Log.e(r1, r2)
            goto L52
        L44:
            java.util.List r1 = r1.getSensorList(r3)
            if (r1 == 0) goto L52
            int r1 = r1.size()
            if (r1 <= 0) goto L52
            r1 = r3
            goto L53
        L52:
            r1 = r0
        L53:
            if (r1 == 0) goto L67
            q35.d r1 = r5.f150707i
            q35.c r2 = r1.f359975b
            if (r2 == 0) goto L5c
            r0 = r3
        L5c:
            if (r0 != 0) goto L67
            com.tencent.mm.plugin.music.ui.m0 r0 = new com.tencent.mm.plugin.music.ui.m0
            r2 = 0
            r0.<init>(r5, r2)
            r1.a(r0)
        L67:
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.A = r0
            goto L81
        L70:
            java.lang.String r0 = "MicroMsg.Music.MusicMainUI"
            java.lang.String r2 = "no need to shake music"
            com.tencent.mars.xlog.Log.i(r0, r2)
            sl3.a r0 = sl3.b.b(r1)
            kl3.i r0 = (kl3.i) r0
            kl3.z r0 = (kl3.z) r0
            r0.f308854c = r3
        L81:
            kl3.t r0 = kl3.t.g()
            com.tencent.mm.plugin.music.player.base.l r0 = r0.a()
            com.tencent.mm.plugin.music.player.base.k r1 = r5.G
            rl3.b r0 = (rl3.b) r0
            if (r1 != 0) goto L93
            r0.getClass()
            goto L9e
        L93:
            java.util.LinkedList r0 = r0.f397235j
            boolean r2 = r0.contains(r1)
            if (r2 != 0) goto L9e
            r0.add(r1)
        L9e:
            r5.Y6()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.music.ui.MusicMainUI.onResume():void");
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            getWindow().getDecorView().setSystemUiVisibility(1280);
            setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
            hideActionbarLine();
            if (this.f150721z) {
                return;
            }
            android.widget.ImageButton imageButton = this.f150703e;
            if (imageButton != null) {
                U6(imageButton);
            }
            android.widget.ImageButton imageButton2 = this.f150704f;
            if (imageButton2 != null) {
                U6(imageButton2);
            }
            this.f150721z = true;
        }
    }
}
