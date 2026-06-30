package ll3;

/* loaded from: classes10.dex */
public final class e1 extends ll3.j0 implements ka0.g0 {

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f319151o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.music.ui.FloatBallMusicViewNew f319152p;

    /* renamed from: q, reason: collision with root package name */
    public android.os.Bundle f319153q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f319154r;

    /* renamed from: s, reason: collision with root package name */
    public r45.xs4 f319155s;

    /* renamed from: t, reason: collision with root package name */
    public final ll3.u1 f319156t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f319157u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f319158v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f319159w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f319160x;

    static {
        new ll3.a1(null);
    }

    public e1() {
        super("MicroMsg.GlobalMusicPlayerFloatBallHelper");
        this.f319151o = new java.util.concurrent.CopyOnWriteArraySet();
        this.f319156t = new ll3.u1();
        this.f319159w = true;
        this.f319160x = true;
    }

    @Override // com.tencent.mm.plugin.ball.service.d, gp1.r
    public void d() {
        super.d();
        this.f319152p = null;
    }

    @Override // ll3.j0
    public void e0(b21.r rVar) {
        super.e0(rVar);
    }

    @Override // ll3.j0
    public void f0(b21.r rVar) {
        if (rVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "addMusicFloatBall isFromNewMusicPlayer: %s, state: %s", java.lang.Boolean.valueOf(rVar.T), java.lang.Integer.valueOf(this.f93132d.H));
            if (rVar.T) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.plugin.music.ui.FloatBallMusicViewNew floatBallMusicViewNew = new com.tencent.mm.plugin.music.ui.FloatBallMusicViewNew(context, null);
                this.f319152p = floatBallMusicViewNew;
                floatBallMusicViewNew.setOnMusicCoverClickListener(new ll3.d1(this));
                com.tencent.mm.plugin.music.ui.FloatBallMusicViewNew floatBallMusicViewNew2 = this.f319152p;
                if (floatBallMusicViewNew2 != null) {
                    floatBallMusicViewNew2.setCoverPath(this.f319154r);
                }
                com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
                ballInfo.f93050h = this.f319152p;
                if (ballInfo.f93051i == null) {
                    ballInfo.f93051i = new android.graphics.Point();
                }
                this.f93132d.f93051i.x = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0f);
                this.f93132d.f93051i.y = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0c);
                com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = this.f93132d;
                ballInfo2.f93045J = false;
                ballInfo2.I = true;
                ballInfo2.F = true;
                ballInfo2.L = false;
                pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
                int i17 = this.f93132d.H;
                ((ov.p0) j0Var).getClass();
                java.lang.Boolean bool = qp1.w.f365755a;
                ballInfo2.H = i17 | 2;
                com.tencent.mm.plugin.ball.model.BallInfo ballInfo3 = this.f93132d;
                ballInfo3.K = false;
                ballInfo3.f93053n = 2;
                boolean c17 = b21.m.c();
                com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = ballInfo3.f93054o;
                ballButtonInfo.f93069d = c17;
                ballButtonInfo.f93070e = true;
                ballButtonInfo.f93073h = true;
                this.f93132d.f93055p.f93066d = this.f319154r;
                j();
            }
        }
    }

    @Override // ll3.j0
    public boolean g0(b21.r rVar) {
        return rVar != null && rVar.T;
    }

    @Override // ll3.j0
    public int h0() {
        return 23;
    }

    @Override // ll3.j0
    public java.lang.String i0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, boolean z17) {
        ql3.a z18 = ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).z();
        jz5.f0 f0Var = null;
        if (z18 != null) {
            java.lang.String format = java.lang.String.format("%s_%s_%s", java.util.Arrays.copyOf(new java.lang.Object[]{z18.field_songName, z18.field_songSinger, z18.field_songAlbum}, 3));
            kotlin.jvm.internal.o.f(format, "format(...)");
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(format.getBytes());
            kotlin.jvm.internal.o.f(b17, "getMD5String(...)");
            ll3.u1 u1Var = this.f319156t;
            u1Var.y(6, b17);
            r45.xs4 xs4Var = this.f319155s;
            android.os.Bundle bundle = this.f319153q;
            u1Var.getClass();
            if (xs4Var == null && bundle == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MusicPlayerMultiTaskHelper", "fillMultiTaskData failed");
                u1Var.f300077a = null;
            } else {
                java.lang.String str = "";
                if (xs4Var == null) {
                    xs4Var = new r45.xs4();
                    xs4Var.set(2, bundle != null ? bundle.getString("key_mv_cover_url", null) : null);
                    xs4Var.set(3, bundle != null ? bundle.getString("key_mv_poster", null) : null);
                    xs4Var.set(1, bundle != null ? bundle.getString("key_mv_nonce_id", null) : null);
                    xs4Var.set(0, bundle != null ? bundle.getString("key_mv_feed_id", null) : null);
                    xs4Var.set(14, bundle != null ? bundle.getString("key_mv_song_name", null) : null);
                    xs4Var.set(15, bundle != null ? bundle.getString("key_mv_song_lyric", "") : null);
                    xs4Var.set(4, bundle != null ? bundle.getString("key_mv_singer_name", null) : null);
                    xs4Var.set(5, bundle != null ? bundle.getString("key_mv_album_name", null) : null);
                    xs4Var.set(7, bundle != null ? bundle.getString("key_mv_music_genre", null) : null);
                    xs4Var.set(8, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.E1(bundle != null ? bundle.getString("key_mv_issue_date", "") : null)));
                    xs4Var.set(16, bundle != null ? bundle.getString("key_mv_album_cover_url", null) : null);
                    xs4Var.set(9, bundle != null ? bundle.getString("key_mv_identification", null) : null);
                    xs4Var.set(6, bundle != null ? bundle.getString("key_mv_extra_info", null) : null);
                    xs4Var.set(10, java.lang.Integer.valueOf(bundle != null ? bundle.getInt("key_mv_music_duration", 0) : 0));
                    xs4Var.set(13, bundle != null ? bundle.getString("key_mv_thumb_path", null) : null);
                    xs4Var.set(12, bundle != null ? bundle.getString("key_mv_music_operation_url", null) : null);
                }
                com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = u1Var.f300077a;
                if (multiTaskInfo != null) {
                    java.lang.String str2 = z18.field_songSinger;
                    if (!(str2 == null || str2.length() == 0)) {
                        str = " · " + z18.field_songSinger;
                    }
                    multiTaskInfo.v0().set(1, z18.field_songName + str);
                    multiTaskInfo.v0().set(0, xs4Var.getString(3));
                    r45.rs4 rs4Var = new r45.rs4();
                    rs4Var.set(0, xs4Var);
                    rs4Var.set(1, java.lang.Integer.valueOf(z18.field_musicType));
                    rs4Var.set(2, z18.field_songAlbumUrl);
                    rs4Var.set(3, z18.field_songName);
                    rs4Var.set(4, z18.field_songSinger);
                    rs4Var.set(5, z18.field_songWebUrl);
                    rs4Var.set(6, z18.field_songWapLinkUrl);
                    rs4Var.set(7, z18.field_songWifiUrl);
                    rs4Var.set(8, z18.field_musicId);
                    rs4Var.set(10, z18.field_songAlbumLocalPath);
                    rs4Var.set(11, z18.field_songAlbum);
                    rs4Var.set(12, z18.field_appId);
                    rs4Var.set(13, z18.field_songHAlbumUrl);
                    multiTaskInfo.field_data = rs4Var.toByteArray();
                }
            }
            u1Var.getClass();
            com.tencent.mm.plugin.music.player.base.l a17 = kl3.t.g().a();
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicPlayerMultiTaskHelper", "onClose " + (a17 != null ? a17.a() : 0));
            if (u1Var.f300077a != null) {
                u1Var.f300077a = null;
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "onFloatBallRemoved currentMusic is null");
        }
        return super.i0(ballInfo, z17);
    }

    @Override // com.tencent.mm.plugin.ball.service.d, gp1.r
    public void j() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "addMusicBall %s, needEnterTranslation: %s", java.lang.Boolean.valueOf(this.f319158v), java.lang.Boolean.valueOf(this.f319159w));
        if (this.f319158v) {
            return;
        }
        this.f93132d.f93058s = this.f319159w;
        super.j();
    }

    @Override // ll3.j0
    public void j0(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
        u0(false);
    }

    @Override // ll3.j0
    public void k0(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent, b21.r rVar) {
        com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = this.f93132d.f93054o;
        ballButtonInfo.f93069d = false;
        ballButtonInfo.f93070e = true;
        ballButtonInfo.f93073h = true;
        S(ballButtonInfo);
    }

    @Override // ll3.j0
    public void m0(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent, b21.r rVar) {
        u0(true);
    }

    @Override // ll3.j0
    public void n0(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
        u0(false);
    }

    @Override // ll3.j0
    public void o0() {
        pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
        int i17 = this.f93132d.H;
        ((ov.p0) j0Var).getClass();
        java.lang.Boolean bool = qp1.w.f365755a;
        b0(i17 & (-3));
    }

    @Override // ll3.j0
    public void q0(b21.r wrapper) {
        kotlin.jvm.internal.o.g(wrapper, "wrapper");
        if (wrapper.T) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
            pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
            int i17 = this.f93132d.H;
            ((ov.p0) j0Var).getClass();
            java.lang.Boolean bool = qp1.w.f365755a;
            ballInfo.H = i17 | 2;
            b0(this.f93132d.H);
        }
    }

    public final android.content.Intent s0() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String string;
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = this.f319153q;
        if (bundle != null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = bundle != null ? java.lang.Integer.valueOf(bundle.hashCode()) : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "getMusicMvUIIntent jump by extra %s", objArr);
            android.os.Bundle bundle2 = this.f319153q;
            kotlin.jvm.internal.o.d(bundle2);
            intent.putExtras(bundle2);
        } else {
            r45.xs4 xs4Var = this.f319155s;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = xs4Var != null ? java.lang.Integer.valueOf(xs4Var.hashCode()) : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "getMusicMvUIIntent jump by musicShareObject: %s", objArr2);
            intent.putExtra("key_scene", 6);
            java.lang.String str16 = "";
            if (xs4Var == null || (str = xs4Var.getString(0)) == null) {
                str = "";
            }
            intent.putExtra("key_mv_feed_id", str);
            if (xs4Var == null || (str2 = xs4Var.getString(1)) == null) {
                str2 = "";
            }
            intent.putExtra("key_mv_nonce_id", str2);
            if (xs4Var == null || (str3 = xs4Var.getString(2)) == null) {
                str3 = "";
            }
            intent.putExtra("key_mv_cover_url", str3);
            if (xs4Var == null || (str4 = xs4Var.getString(3)) == null) {
                str4 = "";
            }
            intent.putExtra("key_mv_poster", str4);
            if (xs4Var == null || (str5 = xs4Var.getString(14)) == null) {
                str5 = "";
            }
            intent.putExtra("key_mv_song_name", str5);
            if (xs4Var == null || (str6 = xs4Var.getString(15)) == null) {
                str6 = "";
            }
            intent.putExtra("key_mv_song_lyric", str6);
            if (xs4Var == null || (str7 = xs4Var.getString(4)) == null) {
                str7 = "";
            }
            intent.putExtra("key_mv_singer_name", str7);
            if (xs4Var == null || (str8 = xs4Var.getString(5)) == null) {
                str8 = "";
            }
            intent.putExtra("key_mv_album_name", str8);
            if (xs4Var == null || (str9 = xs4Var.getString(7)) == null) {
                str9 = "";
            }
            intent.putExtra("key_mv_music_genre", str9);
            if (xs4Var == null || (str10 = java.lang.Long.valueOf(xs4Var.getLong(8)).toString()) == null) {
                str10 = "";
            }
            intent.putExtra("key_mv_issue_date", str10);
            if (xs4Var == null || (str11 = xs4Var.getString(16)) == null) {
                str11 = "";
            }
            intent.putExtra("key_mv_album_cover_url", str11);
            if (xs4Var == null || (str12 = xs4Var.getString(9)) == null) {
                str12 = "";
            }
            intent.putExtra("key_mv_identification", str12);
            if (xs4Var == null || (str13 = xs4Var.getString(6)) == null) {
                str13 = "";
            }
            intent.putExtra("key_mv_extra_info", str13);
            intent.putExtra("key_mv_music_duration", xs4Var != null ? xs4Var.getInteger(10) : 0);
            if (xs4Var == null || (str14 = xs4Var.getString(13)) == null) {
                str14 = "";
            }
            intent.putExtra("key_mv_thumb_path", str14);
            if (xs4Var == null || (str15 = xs4Var.getString(12)) == null) {
                str15 = "";
            }
            intent.putExtra("key_mv_music_operation_url", str15);
            if (xs4Var != null && (string = xs4Var.getString(11)) != null) {
                str16 = string;
            }
            intent.putExtra("key_mv_song_mid", str16);
            intent.setFlags(268435456);
        }
        return intent;
    }

    public void t0() {
        this.f319159w = true;
        boolean u17 = u();
        boolean c17 = b21.m.c();
        boolean Ui = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.xlog.Log.i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "onStop canAddMusicBall: %s, inMusicPlayerPage: %s, hasCurrentBall: %s, playingMusic: %s, hasPermission: %s", java.lang.Boolean.valueOf(this.f319160x), java.lang.Boolean.valueOf(this.f319158v), java.lang.Boolean.valueOf(u17), java.lang.Boolean.valueOf(c17), java.lang.Boolean.valueOf(Ui));
        if (!Ui || !this.f319160x || this.f319158v || u17) {
            return;
        }
        super.e0(b21.m.b());
    }

    public final void u0(boolean z17) {
        com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = this.f93132d.f93054o;
        if (ballButtonInfo.f93069d != z17) {
            ballButtonInfo.f93069d = z17;
            ballButtonInfo.f93070e = true;
            ballButtonInfo.f93073h = true;
            S(ballButtonInfo);
        }
    }

    public final void v0(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "updateMusicCoverPath %s, notify: %s", str, java.lang.Boolean.valueOf(z17));
        this.f319154r = str;
        if (z17) {
            com.tencent.mm.plugin.music.ui.FloatBallMusicViewNew floatBallMusicViewNew = this.f319152p;
            if (floatBallMusicViewNew != null) {
                floatBallMusicViewNew.setCoverPath(str);
            }
            com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo ballBlurInfo = this.f93132d.f93055p;
            ballBlurInfo.f93066d = str;
            R(ballBlurInfo);
        }
    }

    public final void w0(android.os.Bundle bundle) {
        if (kotlin.jvm.internal.o.b(this.f319153q, bundle)) {
            return;
        }
        this.f319153q = bundle;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = bundle != null ? java.lang.Integer.valueOf(bundle.hashCode()) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "updateMusicMvUIExtra hashCode: %s", objArr);
        for (ll3.c1 c1Var : this.f319151o) {
            if (c1Var != null) {
                android.os.Bundle bundle2 = this.f319153q;
                com.tencent.mm.plugin.music.model.notification.e eVar = ((com.tencent.mm.plugin.music.model.notification.c) c1Var).f150636a;
                eVar.f150641b = bundle2;
                com.tencent.mm.plugin.music.player.base.l a17 = kl3.t.g().a();
                if (a17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMMusicNotification", "musicPlayer is null, return");
                } else {
                    ql3.a z17 = ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).z();
                    if (z17 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMMusicNotification", "music is null, return");
                    } else if (eVar.f150642c != null && a17.g()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMusicNotification", "update notification");
                        eVar.f150643d.notify(291, eVar.a(eVar.f150642c, z17, a17.i()));
                    }
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void x() {
        super.x();
        this.f319158v = true;
        this.f319159w = false;
        if (u()) {
            W(true);
        }
    }

    public final void x0(r45.xs4 xs4Var) {
        this.f319155s = xs4Var;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = xs4Var != null ? java.lang.Integer.valueOf(xs4Var.hashCode()) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.GlobalMusicPlayerFloatBallHelper", "updateMusicShareObject hashCode: %s", objArr);
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void z() {
        super.z();
        this.f319158v = false;
        if (u() && this.f93132d.f93045J) {
            W(false);
        }
    }
}
