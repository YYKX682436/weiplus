package com.tencent.mm.ui.tools;

@db5.a(com.tencent.mm.plugin.appbrand.jsapi.m9.CTRL_INDEX)
@ul5.d(0)
/* loaded from: classes3.dex */
public class ShowVideoUI extends com.tencent.mm.ui.MMActivity {
    public static final int M = android.view.ViewConfiguration.getDoubleTapTimeout();
    public android.widget.RelativeLayout A;
    public com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation B;
    public android.widget.ImageView C;
    public android.view.View D;

    /* renamed from: d, reason: collision with root package name */
    public android.os.Bundle f210219d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f210220e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f210221f;

    /* renamed from: g, reason: collision with root package name */
    public int f210222g;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f210224i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f210225m;
    private vj5.k mStatusBarHeightCallback;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.widget.FavVideoView f210226n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f210227o;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.tools.s4 f210235w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f210236x;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer f210238z;

    /* renamed from: h, reason: collision with root package name */
    public boolean f210223h = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f210228p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f210229q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f210230r = false;

    /* renamed from: s, reason: collision with root package name */
    public int f210231s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f210232t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f210233u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f210234v = 0;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.gallery.ActivityPullDownCloseLayout f210237y = null;
    public final com.tencent.mm.sdk.platformtools.n3 E = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    public boolean F = true;
    public final java.lang.Runnable G = new com.tencent.mm.ui.tools.fc(this);
    public boolean H = false;
    public final java.lang.Runnable I = new com.tencent.mm.ui.tools.nc(this);

    /* renamed from: J, reason: collision with root package name */
    public android.widget.RelativeLayout f210218J = null;
    public int K = 0;
    public boolean L = false;

    public final void T6() {
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f210238z.getCurrentView().getGlobalVisibleRect(rect);
        android.graphics.Rect rect2 = new android.graphics.Rect();
        this.B.getGlobalVisibleRect(rect2);
        boolean intersect = rect.intersect(rect2);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteVideoPlayUI", "checkSeekBarStyle, video rect = " + rect + " seek bar rect = " + rect2 + " is intersect = " + intersect);
        if (intersect) {
            com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation redesignVideoPlayerSeekBarWithAnimation = this.B;
            redesignVideoPlayerSeekBarWithAnimation.C(redesignVideoPlayerSeekBarWithAnimation.getLightStyle());
            android.view.View view = this.D;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/ShowVideoUI", "checkSeekBarStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/tools/ShowVideoUI", "checkSeekBarStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation redesignVideoPlayerSeekBarWithAnimation2 = this.B;
        redesignVideoPlayerSeekBarWithAnimation2.C(redesignVideoPlayerSeekBarWithAnimation2.getDarkStyle());
        android.view.View view2 = this.D;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/tools/ShowVideoUI", "checkSeekBarStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/tools/ShowVideoUI", "checkSeekBarStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void U6(android.view.Window window, boolean z17, boolean z18) {
        int i17;
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        if (z17) {
            int i18 = systemUiVisibility | 1024 | 256;
            i17 = (z18 ? i18 | 4 : i18 & (-5)) | 4096;
        } else {
            int i19 = systemUiVisibility & (-1025) & (-257);
            i17 = (z18 ? i19 | 4 : i19 & (-5)) & (-4097);
        }
        window.getDecorView().setSystemUiVisibility(i17);
    }

    public final void V6(android.widget.ImageView imageView) {
        if (!this.f210229q) {
            this.f210226n.setVideoData(this.f210221f);
        }
        if (imageView != null) {
            if (com.tencent.mm.vfs.w6.j(this.f210220e)) {
                imageView.setImageBitmap(com.tencent.mm.sdk.platformtools.j.a(this.f210220e, 1.0f));
            } else {
                imageView.setImageResource(com.tencent.mm.R.drawable.f481178c02);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: fullPath is not null,but not exist  thumbPathExist:%s", java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.j(this.f210220e)));
    }

    public final void W6() {
        if (this.f210229q) {
            if (!this.f210238z.e()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteVideoPlayUI", "longClickListener onClick isPrepared:false");
                return;
            }
        } else if (!this.f210226n.f101582w) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteVideoPlayUI", "longClickListener onClick isPrepared:false");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        final com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) getContext(), !this.f210229q ? 1 : 0, false);
        k0Var.f211872n = new com.tencent.mm.ui.tools.ic(this, arrayList);
        if (this.f210229q) {
            ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
            final com.tencent.mm.pluginsdk.forward.m mVar = new com.tencent.mm.pluginsdk.forward.m();
            k0Var.f211876p = new db5.o4() { // from class: com.tencent.mm.ui.tools.ShowVideoUI$$h
                @Override // db5.o4
                public final void onCreateMMMenu(db5.g4 g4Var) {
                    int i17 = com.tencent.mm.ui.tools.ShowVideoUI.M;
                    ((com.tencent.mm.pluginsdk.forward.m) mVar).wi(com.tencent.mm.ui.tools.ShowVideoUI.this.getContext(), g4Var, k0Var);
                }
            };
            k0Var.f211885w = new db5.t4() { // from class: com.tencent.mm.ui.tools.ShowVideoUI$$i
                @Override // db5.t4
                public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
                    int i18 = com.tencent.mm.ui.tools.ShowVideoUI.M;
                    final com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = com.tencent.mm.ui.tools.ShowVideoUI.this;
                    showVideoUI.getClass();
                    yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.ui.tools.ShowVideoUI$$c
                        @Override // yz5.l
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            final java.lang.String str = (java.lang.String) obj;
                            final com.tencent.mm.ui.tools.ShowVideoUI showVideoUI2 = com.tencent.mm.ui.tools.ShowVideoUI.this;
                            final t21.v2 h17 = t21.d3.h(showVideoUI2.f210227o);
                            if (h17 == null) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteVideoPlayUI", "[recent share]video is null");
                                return null;
                            }
                            com.tencent.mm.storage.f9 Li = pt0.f0.Li(h17.h(), h17.f415016n);
                            java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(Li, bm5.f0.f22571s, h17.d(), false);
                            java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(Li, bm5.f0.f22570r, h17.d(), false);
                            if ((com.tencent.mm.sdk.platformtools.t8.K0(rj6) || !com.tencent.mm.vfs.w6.j(rj6)) && (com.tencent.mm.sdk.platformtools.t8.K0(rj7) || !com.tencent.mm.vfs.w6.j(rj7))) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteVideoPlayUI", "[recent share] doRestransmitMsg fail, compressVideoPath and originVideoPath is null, msgLocalId = " + Li.getMsgId());
                                return null;
                            }
                            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                            jd5.c cVar = new jd5.c();
                            final java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(Li, h17.d(), false);
                            cVar.o(tj6);
                            cVar.q(h17.f415015m);
                            if (com.tencent.mm.vfs.w6.j(rj7)) {
                                cVar.r(rj7);
                            } else {
                                cVar.r(rj6);
                            }
                            dk5.y yVar = (dk5.y) i95.n0.c(dk5.y.class);
                            androidx.appcompat.app.AppCompatActivity context = showVideoUI2.getContext();
                            n13.t a17 = n13.t.a(new com.tencent.mm.ui.widget.dialog.j() { // from class: com.tencent.mm.ui.tools.ShowVideoUI$$d
                                @Override // com.tencent.mm.ui.widget.dialog.j
                                public final void a(boolean z17, java.lang.String str2, int i19) {
                                    java.lang.String str3 = str;
                                    java.lang.String str4 = tj6;
                                    int i27 = com.tencent.mm.ui.tools.ShowVideoUI.M;
                                    com.tencent.mm.ui.tools.ShowVideoUI showVideoUI3 = com.tencent.mm.ui.tools.ShowVideoUI.this;
                                    showVideoUI3.getClass();
                                    if (z17) {
                                        tg3.a1 a18 = tg3.t1.a();
                                        androidx.appcompat.app.AppCompatActivity context2 = showVideoUI3.getContext();
                                        t21.v2 v2Var = h17;
                                        ((dk5.s5) a18).nj(context2, str3, v2Var.d(), str4, 1, v2Var.f415015m, true, false, "", null);
                                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                                            ((dk5.s5) tg3.t1.a()).fj(str3, str2, c01.e2.C(str3), 0);
                                        }
                                        com.tencent.mm.ui.widget.snackbar.j.c(showVideoUI3.getContext().getString(com.tencent.mm.R.string.fw6), null, showVideoUI3.getContext(), null, null);
                                    }
                                }
                            });
                            a17.f334138f.f334139a = 9;
                            yVar.wi(context, cVar, str, a17);
                            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).Zi(showVideoUI2, showVideoUI2.f210236x, showVideoUI2.K, 2, 4, 1);
                            return null;
                        }
                    };
                    ((com.tencent.mm.pluginsdk.forward.m) mVar).aj((db5.h4) menuItem, lVar);
                }
            };
            k0Var.f211874o = new com.tencent.mm.ui.tools.jc(this, arrayList);
            k0Var.f211884v = new com.tencent.mm.ui.tools.kc(this);
        }
        k0Var.f211881s = new com.tencent.mm.ui.tools.lc(this);
        k0Var.C = new com.tencent.mm.ui.tools.mc(this);
        k0Var.f211856e = new com.tencent.mm.ui.tools.oc(this, arrayList);
        k0Var.v();
        if (this.f210229q) {
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).pj();
        }
    }

    public final void X6() {
        this.B.setIsPlay(true);
        T6();
        this.B.setVideoTotalTime(this.f210222g);
        this.B.a(this.f210238z.getCurrentPosition() / 1000);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.E;
        java.lang.Runnable runnable = this.G;
        n3Var.removeCallbacks(runnable);
        n3Var.post(runnable);
    }

    public final void Y6(boolean z17) {
        int i17 = z17 ? 2 : 1;
        h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
        com.tencent.mm.storage.f9 f9Var = this.f210236x;
        g90.s sVar = (g90.s) vVar;
        sVar.getClass();
        sVar.hj(this, f9Var, 2, i17, kz5.q0.f314001d);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("pic_video_close");
        arrayList.add("pic_video_three_dot");
        arrayList.add("video_speed");
        arrayList.add("video_play_btn");
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (z17) {
                ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).Ui(this, this.f210236x, 2, str);
            } else {
                ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).Vi(this, this.f210236x, 2, str);
            }
        }
    }

    public void Z6() {
        int i17;
        if (this.f210229q) {
            finish();
            overridePendingTransition(com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477877e1);
            return;
        }
        int width = this.f210224i.getWidth();
        int height = this.f210224i.getHeight();
        int i18 = this.f210233u;
        if (i18 != 0 && (i17 = this.f210234v) != 0) {
            height = (int) ((width / i18) * i17);
        }
        com.tencent.mm.ui.tools.s4 s4Var = this.f210235w;
        s4Var.f210699f = width;
        s4Var.f210700g = height;
        s4Var.e(this.f210232t, this.f210231s, i18, this.f210234v);
        this.f210235w.d(this.f210226n, this.f210225m, false, new com.tencent.mm.ui.tools.vc(this), null);
    }

    public void a7(java.lang.String str, android.content.Context context) {
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Bi(getContext(), str, new com.tencent.mm.ui.tools.rc(this, str));
        if (this.f210229q) {
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).oj(3);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f210229q && motionEvent.getAction() == 2 && motionEvent.getPointerCount() == 2) {
            T6();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        if (this.f210229q) {
            return 4;
        }
        return super.getForceOrientation();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dnf;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        boolean z17 = true;
        if (i17 == 1 && -1 == i18) {
            java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent == null ? null : intent.getStringExtra("custom_send_text");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                return;
            }
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","));
            t21.v2 h17 = !com.tencent.mm.sdk.platformtools.t8.K0(this.f210227o) ? t21.d3.h(this.f210227o) : null;
            java.util.Iterator it = P1.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                ((dk5.s5) tg3.t1.a()).nj(getContext(), str, h17 == null ? this.f210221f : this.f210227o, this.f210220e, 1, this.f210222g, (this.f210229q || h17 != null) ? z17 : false, false, "", null);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    ((dk5.s5) tg3.t1.a()).fj(str, stringExtra2, c01.e2.C(str), 0);
                }
                z17 = true;
            }
            com.tencent.mm.ui.widget.snackbar.j.c(getString(com.tencent.mm.R.string.c9u), null, this, null, null);
            return;
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f210236x != null && this.f210229q) {
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).ij(this, this.f210236x, 2, 3, 4, new java.util.HashMap());
        }
        Z6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a5  */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.view.ViewGroup] */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r29) {
        /*
            Method dump skipped, instructions count: 1445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.ShowVideoUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        setResult(0, getIntent().putExtra("key_activity_browse_time", getActivityBrowseTimeMs()));
        if (this.f210229q) {
            this.f210238z.stop();
        } else {
            this.f210226n.e();
        }
        getWindow().clearFlags(128);
        Y6(false);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        getWindow().setFlags(2048, 2048);
        if (this.f210229q) {
            if (this.f210238z.isPlaying()) {
                this.L = true;
            }
            this.f210238z.pause();
        } else {
            if (this.f210226n.d()) {
                this.L = true;
            }
            com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = this.f210226n;
            java.lang.String str = favVideoView.f101566d;
            com.tencent.mars.xlog.Log.i(str, "VideoPlay:   onPause()");
            favVideoView.k();
            if (favVideoView.f101569g.isPlaying()) {
                com.tencent.mars.xlog.Log.i(str, "VideoPlay: pausePlay()");
                favVideoView.f101569g.pause();
            }
            favVideoView.I.d();
            favVideoView.setVideoStateIv(true);
            favVideoView.f101565J.d();
        }
        super.onPause();
        qp1.h0.b();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        getWindow().clearFlags(2048);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay:  onResume,hadOnStart is %B", java.lang.Boolean.valueOf(this.f210223h));
        this.f210223h = false;
        super.onResume();
        if (this.L) {
            if (this.f210229q) {
                com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = this.f210238z;
                if (thumbPlayerViewContainer != null && thumbPlayerViewContainer.e()) {
                    this.f210238z.start();
                    X6();
                }
            } else {
                this.f210226n.h();
            }
        }
        qp1.h0.a(true, true, true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (!this.f210229q) {
            android.os.Bundle bundle = this.f210219d;
            if (!this.f210228p) {
                this.f210228p = true;
                this.f210231s = getIntent().getIntExtra("img_gallery_top", 0);
                this.f210232t = getIntent().getIntExtra("img_gallery_left", 0);
                this.f210233u = getIntent().getIntExtra("img_gallery_width", 0);
                int intExtra = getIntent().getIntExtra("img_gallery_height", 0);
                this.f210234v = intExtra;
                this.f210235w.e(this.f210232t, this.f210231s, this.f210233u, intExtra);
                if (bundle == null) {
                    this.f210226n.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.ui.tools.tc(this));
                }
            }
        }
        super.onStart();
    }
}
