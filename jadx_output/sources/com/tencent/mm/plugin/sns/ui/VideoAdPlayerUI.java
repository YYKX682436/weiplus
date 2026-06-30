package com.tencent.mm.plugin.sns.ui;

@db5.a(19)
/* loaded from: classes4.dex */
public class VideoAdPlayerUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.plugin.sns.model.g0, com.tencent.mm.plugin.sns.model.h0 {
    public static final /* synthetic */ int T = 0;
    public java.lang.String I;
    public java.lang.String K;
    public int L;
    public java.lang.String M;
    public java.lang.String N;
    public com.tencent.mm.plugin.sns.storage.SnsInfo S;

    /* renamed from: d, reason: collision with root package name */
    public c01.k f167656d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sight.decode.ui.VideoPlayView f167657e;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f167675z;

    /* renamed from: f, reason: collision with root package name */
    public final i64.c1 f167658f = new i64.c1("VideoAdPlayerUI");

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f167659g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f167660h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f167661i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f167662m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f167663n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f167664o = "";

    /* renamed from: p, reason: collision with root package name */
    public boolean f167665p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f167666q = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f167667r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f167668s = "";

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f167669t = "";

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f167670u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f167671v = "";

    /* renamed from: w, reason: collision with root package name */
    public int f167672w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f167673x = 0;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f167674y = "";
    public java.lang.String A = "";
    public long B = 0;
    public int C = 0;
    public int D = 0;
    public java.lang.String E = "";
    public java.lang.String F = "";
    public boolean G = false;
    public boolean H = false;

    /* renamed from: J, reason: collision with root package name */
    public r45.jj4 f167655J = null;
    public boolean P = false;
    public java.lang.String[] Q = null;
    public java.lang.String[] R = null;

    public static /* synthetic */ i64.c1 T6(com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI videoAdPlayerUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        i64.c1 c1Var = videoAdPlayerUI.f167658f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        return c1Var;
    }

    public static /* synthetic */ boolean U6(com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI videoAdPlayerUI, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        videoAdPlayerUI.P = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        return z17;
    }

    public static /* synthetic */ int V6(com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI videoAdPlayerUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        int i17 = videoAdPlayerUI.f167666q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        return i17;
    }

    public final void W6(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pushVideoPlay", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        if (!this.f167665p) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pushVideoPlay", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            return;
        }
        int duration = this.f167657e.getDuration();
        i64.c1 c1Var = this.f167658f;
        c1Var.e(duration);
        j64.b bVar = c1Var.f289121i;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        bVar.f297915g = android.os.SystemClock.elapsedRealtime();
        j64.b bVar2 = c1Var.f289121i;
        bVar2.f297914f = i17 == 2 ? 2 : 1;
        bVar2.f297913e = 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerUI", "duration  orient " + c1Var.f289121i.f297914f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pushVideoPlay", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        if (this.P) {
            this.f167657e.f(-1);
        }
        i64.c1 c1Var = this.f167658f;
        if (c1Var != null && (str = this.E) != null && str.length() > 0) {
            c1Var.f();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KComponentCid", this.E);
            intent.putExtra("KStreamVideoPlayCount", c1Var.f289118f);
            intent.putExtra("KStreamVideoPlayCompleteCount", c1Var.f289119g);
            intent.putExtra("KStreamVideoTotalPlayTimeInMs", c1Var.f289120h);
            setResult(-1, intent);
        }
        super.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getForceOrientation", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        if (this.H) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getForceOrientation", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            return 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getForceOrientation", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        return 4;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        return com.tencent.mm.R.layout.d3o;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i19;
        java.lang.String str4;
        java.lang.String str5;
        java.util.Iterator it;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9 = "onActivityResult";
        java.lang.String str10 = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        java.lang.String str11 = "MicroMsg.VideoPlayerUI";
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerUI", "onActivityResult %d", java.lang.Integer.valueOf(i17));
        int i27 = -1;
        if (4097 != i17) {
            str = "onActivityResult";
            str2 = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI";
        } else if (-1 == i18) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            java.lang.String str12 = ",";
            java.util.Iterator it6 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(",")).iterator();
            while (it6.hasNext()) {
                java.lang.String str13 = (java.lang.String) it6.next();
                com.tencent.mars.xlog.Log.i(str11, "send sight to %s", str13);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendAppMsg", str10);
                ot0.q qVar = new ot0.q();
                qVar.f348654f = this.f167667r;
                qVar.f348666i = 4;
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f167655J.f377858g)) {
                    qVar.f348674k = this.f167655J.f377875x;
                } else {
                    qVar.f348674k = this.f167655J.f377858g;
                }
                qVar.f348734z = com.tencent.mm.sdk.platformtools.t8.K0(this.f167655J.B) ? this.f167655J.f377860i : this.f167655J.B;
                r45.jj4 jj4Var = this.f167655J;
                qVar.f348637a2 = jj4Var.f377875x;
                qVar.f348641b2 = jj4Var.A;
                qVar.f348645c2 = this.f167667r;
                qVar.f348653e2 = this.f167669t;
                qVar.f348649d2 = this.f167668s;
                qVar.f348657f2 = this.f167663n;
                qVar.f348661g2 = this.f167670u;
                qVar.f348665h2 = this.f167671v;
                qVar.Y1 = this.I;
                byte[] N = com.tencent.mm.vfs.w6.N(this.f167660h, 0, i27);
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Integer.valueOf(N != null ? N.length : 0);
                com.tencent.mars.xlog.Log.i(str11, "read buf size %d", objArr);
                if (ot0.j1.a() != null) {
                    ((ez.w0) ot0.j1.a()).getClass();
                    i19 = 0;
                    str3 = "sendAppMsg";
                    com.tencent.mm.pluginsdk.model.app.k0.I(qVar, "", "", str13, "", N);
                } else {
                    str3 = "sendAppMsg";
                    i19 = 0;
                }
                if (this.L != 0) {
                    j64.b bVar = this.f167658f.f289121i;
                    int i28 = bVar.f297911c;
                    if (this.P) {
                        long j17 = bVar.f297915g;
                        if (j17 != 0) {
                            i28 += (int) ((android.os.SystemClock.elapsedRealtime() - j17) / 1000);
                        }
                    }
                    com.tencent.mm.modelstat.r rVar = new com.tencent.mm.modelstat.r(13228, "1,3," + i28 + str12 + this.M + str12 + this.N + str12 + com.tencent.mm.sdk.platformtools.t8.i1() + str12 + this.K + str12 + this.f167666q, (int) com.tencent.mm.sdk.platformtools.t8.i1());
                    gm0.j1.i();
                    gm0.j1.n().f273288b.g(rVar);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str10);
                ((dk5.s5) tg3.t1.a()).Ui(stringExtra2, str13);
                if (this.f167665p) {
                    ca4.z0.x0(new com.tencent.mm.modelsns.SnsAdClick(0, 6, this.S.field_snsId, 12, 0));
                }
                if (this.f167673x != 0) {
                    boolean R4 = com.tencent.mm.storage.z3.R4(str13);
                    it = it6;
                    str6 = str11;
                    str7 = stringExtra2;
                    str8 = str12;
                    str4 = str9;
                    str5 = str10;
                    i64.s1.e(R4 ? i64.p1.Chatroom : i64.p1.Chat, this.f167671v, this.f167670u, this.f167672w, this.f167673x, this.f167674y, this.f167675z, this.A, this.B, this.C, this.D, R4 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str13) : i19);
                } else {
                    str4 = str9;
                    str5 = str10;
                    it = it6;
                    str6 = str11;
                    str7 = stringExtra2;
                    str8 = str12;
                }
                it6 = it;
                str11 = str6;
                stringExtra2 = str7;
                str12 = str8;
                str9 = str4;
                str10 = str5;
                i27 = -1;
            }
            str = str9;
            str2 = str10;
            com.tencent.mm.ui.widget.snackbar.j.c(getString(com.tencent.mm.R.string.fw6), null, this, null, null);
        } else {
            str = "onActivityResult";
            str2 = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI";
            if (this.f167665p) {
                ca4.z0.x0(new com.tencent.mm.modelsns.SnsAdClick(0, 6, this.S.field_snsId, 13, 0));
            }
        }
        if (4098 == i17) {
            int i29 = this.f167673x;
            if (i29 != 0) {
                i64.s1.e(i64.p1.Sns, this.f167671v, this.f167670u, this.f167672w, i29, this.f167674y, this.f167675z, this.A, this.B, this.C, this.D, 0);
            }
            if (-1 == i18) {
                if (this.f167665p) {
                    ca4.z0.x0(new com.tencent.mm.modelsns.SnsAdClick(0, 6, this.S.field_snsId, 15, 0));
                }
            } else if (this.f167665p) {
                ca4.z0.x0(new com.tencent.mm.modelsns.SnsAdClick(0, 6, this.S.field_snsId, 16, 0));
            }
        }
        super.onActivityResult(i17, i18, intent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        super.onConfigurationChanged(configuration);
        com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView = this.f167657e;
        videoPlayView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayView", "onConfigurationChanged " + configuration.orientation + " " + videoPlayView.G);
        int i17 = videoPlayView.G;
        int i18 = configuration.orientation;
        if (i17 != i18) {
            if (i18 == 1) {
                videoPlayView.i(1);
            } else {
                videoPlayView.i(2);
            }
            int i19 = configuration.orientation;
            videoPlayView.G = i19;
            if (i19 == 2) {
                android.view.View view = videoPlayView.f162516p;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "updateConfig", "(Landroid/content/res/Configuration;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "updateConfig", "(Landroid/content/res/Configuration;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        W6(configuration.orientation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView;
        android.widget.ImageView imageView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        super.onCreate(bundle);
        hideTitleView();
        if (com.tencent.mm.ui.bk.u(getContext(), false)) {
            getController().p0(getResources().getColor(com.tencent.mm.R.color.f478586bk));
        }
        this.Q = new java.lang.String[]{getString(com.tencent.mm.R.string.j8t), getString(com.tencent.mm.R.string.j8u), getString(com.tencent.mm.R.string.j8r)};
        this.R = new java.lang.String[]{getString(com.tencent.mm.R.string.j8t), getString(com.tencent.mm.R.string.j8u)};
        java.lang.String stringExtra = getIntent().getStringExtra("KSta_SnSId");
        this.S = com.tencent.mm.plugin.sns.model.l4.Fj().b1("" + ca4.z0.F0(stringExtra));
        this.f167656d = new c01.k();
        m21.w.f(getIntent());
        this.f167659g = getIntent().getStringExtra("KFullVideoPath");
        this.f167661i = getIntent().getStringExtra("KStremVideoUrl");
        this.f167663n = getIntent().getStringExtra("KThumUrl");
        this.f167664o = getIntent().getStringExtra("KMediaId");
        this.f167665p = getIntent().getBooleanExtra("KFromTimeLine", false);
        this.f167662m = getIntent().getStringExtra("KUrl");
        java.lang.String stringExtra2 = getIntent().getStringExtra("KMediaTitle");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f167667r = stringExtra2;
        this.f167666q = getIntent().getIntExtra("KMediaVideoTime", 0);
        this.G = getIntent().getBooleanExtra("KBlockFav", false);
        this.H = getIntent().getBooleanExtra("ForceLandscape", false);
        this.f167668s = getIntent().getStringExtra("StreamWording");
        this.f167669t = getIntent().getStringExtra("StremWebUrl");
        this.E = getIntent().getStringExtra("KComponentCid");
        this.f167670u = getIntent().getStringExtra("KSta_StremVideoAduxInfo");
        this.f167671v = getIntent().getStringExtra("KSta_StremVideoPublishId");
        this.f167672w = getIntent().getIntExtra("KSta_SourceType", 0);
        this.f167673x = getIntent().getIntExtra("KSta_Scene", 0);
        this.f167674y = getIntent().getStringExtra("KSta_FromUserName");
        this.f167675z = getIntent().getStringExtra("KSta_ChatName");
        this.A = getIntent().getStringExtra("KSta_SnSId");
        this.B = getIntent().getLongExtra("KSta_MsgId", 0L);
        this.C = getIntent().getIntExtra("KSta_FavID", 0);
        this.D = getIntent().getIntExtra("KSta_ChatroomMembercount", 0);
        this.I = getIntent().getStringExtra("KSta_SnsStatExtStr");
        java.lang.String stringExtra3 = getIntent().getStringExtra("KViewId");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.F = stringExtra3;
        java.lang.String stringExtra4 = getIntent().getStringExtra("ReportArgs");
        this.K = stringExtra4 != null ? stringExtra4 : "";
        int intExtra = getIntent().getIntExtra("NeedReportData", 0);
        this.L = intExtra;
        if (intExtra != 0) {
            com.tencent.mm.sdk.platformtools.i0 i0Var = com.tencent.mm.sdk.platformtools.v0.f193027a;
            this.M = i0Var.e(false);
            this.N = i0Var.d(false);
        }
        r45.jj4 jj4Var = new r45.jj4();
        this.f167655J = jj4Var;
        jj4Var.f377860i = this.f167663n;
        jj4Var.f377875x = this.f167661i;
        jj4Var.f377855d = this.f167664o;
        jj4Var.f377858g = this.f167662m;
        jj4Var.f377859h = 1;
        jj4Var.A = this.f167666q;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        i64.c1 c1Var = this.f167658f;
        c1Var.f289116d = elapsedRealtime;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerUI", "init streamvideo " + this.f167655J.f377855d + " attachurl:" + this.f167655J.f377875x + " videoattachTotalTime:" + this.f167655J.A + " streamvideowording: " + this.f167668s + " streamvideoweburl: " + this.f167669t + " mediaTitle: " + this.f167667r + " thumburl " + this.f167663n + " streamvideoaduxinfo " + this.f167670u + " streamvideopublishid " + this.f167671v);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f167659g)) {
            this.f167659g = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), this.f167655J.f377855d) + ca4.z0.I(this.f167655J);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f167660h) || !com.tencent.mm.vfs.w6.j(this.f167660h)) {
            java.lang.String str = "attach" + this.f167655J.f377855d;
            this.f167660h = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), str) + ca4.z0.V(str);
        }
        boolean j17 = com.tencent.mm.vfs.w6.j(this.f167660h);
        com.tencent.mm.storage.s7 s7Var = com.tencent.mm.storage.s7.f195307k;
        if (!j17) {
            try {
                r45.jj4 jj4Var2 = new r45.jj4();
                jj4Var2.parseFrom(this.f167655J.toByteArray());
                jj4Var2.f377855d = "attach" + jj4Var2.f377855d;
                ca4.s0 s0Var = new ca4.s0(this.f167655J);
                s0Var.d(1);
                s0Var.e(this.f167655J.f377855d);
                com.tencent.mm.plugin.sns.model.l4.Cj().d(jj4Var2, 7, s0Var, s7Var);
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VideoPlayerUI", "error for download thumb");
            }
            getWindow().addFlags(128);
        }
        com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView2 = (com.tencent.mm.plugin.sight.decode.ui.VideoPlayView) findViewById(com.tencent.mm.R.id.ozu);
        this.f167657e = videoPlayView2;
        com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar adVideoPlayerLoadingBar = new com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar(getContext());
        videoPlayView2.getClass();
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.bottomMargin = videoPlayView2.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479888i1);
        videoPlayView2.f162514n = adVideoPlayerLoadingBar;
        videoPlayView2.f162513m.setPlayProgressCallback(true);
        videoPlayView2.addView((android.view.View) videoPlayView2.f162514n, layoutParams);
        videoPlayView2.f162514n.setIplaySeekCallback(new m34.w(videoPlayView2));
        videoPlayView2.f162514n.setOnPlayButtonClickListener(new m34.x(videoPlayView2));
        videoPlayView2.f162514n.setIsPlay(videoPlayView2.f162513m.isPlaying());
        java.lang.Object obj = videoPlayView2.f162514n;
        if (obj != null) {
            android.view.View view = (android.view.View) obj;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "addProgressBarView", "(Lcom/tencent/mm/plugin/sight/decode/ui/IVideoPlayProgressBar;Landroid/widget/RelativeLayout$LayoutParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "addProgressBarView", "(Lcom/tencent/mm/plugin/sight/decode/ui/IVideoPlayProgressBar;Landroid/widget/RelativeLayout$LayoutParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        adVideoPlayerLoadingBar.a(0);
        this.f167657e.setVideoPlayViewEvent(new com.tencent.mm.plugin.sns.ui.iy(this));
        this.f167657e.setVideoTotalTime(this.f167655J.A);
        if (com.tencent.mm.vfs.w6.j(this.f167659g)) {
            c1Var.f289114b = 1;
            this.f167657e.setVideoPath(this.f167659g);
        } else {
            this.f167657e.f162510g.setVisibility(0);
            this.f167657e.setIsDownloading(true);
            com.tencent.mm.plugin.sns.model.l4.Cj().d(this.f167655J, 6, null, s7Var);
        }
        this.f167657e.setLeftButtonOnClickListener(new com.tencent.mm.plugin.sns.ui.jy(this));
        this.f167657e.setRightButtonOnCliclListener(new com.tencent.mm.plugin.sns.ui.ly(this));
        com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView3 = this.f167657e;
        java.lang.String str2 = this.f167668s;
        com.tencent.mm.plugin.sns.ui.ny nyVar = new com.tencent.mm.plugin.sns.ui.ny(this);
        videoPlayView3.f162518r = str2;
        videoPlayView3.f162517q.setText(str2);
        videoPlayView3.f162517q.setOnClickListener(nyVar);
        this.f167657e.d();
        if (getIntent().getIntExtra("ShareBtnHidden", 0) != 0 && (imageView = (videoPlayView = this.f167657e).f162521u) != null) {
            videoPlayView.f162522v = false;
            imageView.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        super.onDestroy();
        getWindow().clearFlags(128);
        int i17 = this.f167673x;
        if (i17 != 0) {
            i64.s1.b(i64.n1.LeaveCompleteVideo, this.f167671v, this.f167670u, this.f167672w, i17, this.f167674y, this.f167675z, this.A, this.B, this.C, this.D);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportVideo", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        boolean z17 = this.f167665p;
        i64.c1 c1Var = this.f167658f;
        if (z17) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.S;
            int adRecSrc = snsInfo == null ? 0 : snsInfo.getAdRecSrc();
            if (this.S == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportVideo", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            } else {
                java.lang.String d17 = c1Var.d();
                int i18 = c1Var.f289115c;
                long j17 = i18 - c1Var.f289117e;
                if (j17 < 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.VideoPlayerUI", "reportVideo minus staytime found! totaltime[%d], offscreenTime[%ld]", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(c1Var.f289117e));
                    j17 = c1Var.f289115c;
                }
                int i19 = (int) j17;
                com.tencent.mm.plugin.sns.storage.ADInfo adInfo = this.S.getAdInfo();
                java.lang.String str = adInfo == null ? "" : adInfo.waidPkg;
                i64.w wVar = new i64.w();
                wVar.f289349l = this.S.getAdXml().passThrough;
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new i64.m0(this.F, 6, 2, c1Var.f289115c, null, null, 2, d17, -1, adRecSrc, i19, i19, 0, this.S.getAdSnsInfo().getTimelineRemindInfoSourceInfo(), this.S.getAdSnsInfo().getTimelineRemindInfoSelfInfo(), str, wVar));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportVideo", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            }
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportVideo", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exitCgiReport", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        if (this.L != 0) {
            j64.b bVar = c1Var.f289121i;
            int i27 = bVar.f297911c;
            if (this.P) {
                long j18 = bVar.f297915g;
                if (j18 != 0) {
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    i27 += (int) ((android.os.SystemClock.elapsedRealtime() - j18) / 1000);
                }
            }
            com.tencent.mm.modelstat.r rVar = new com.tencent.mm.modelstat.r(13228, "1,2," + i27 + "," + this.M + "," + this.N + "," + com.tencent.mm.sdk.platformtools.t8.i1() + "," + this.K + "," + this.f167666q, (int) com.tencent.mm.sdk.platformtools.t8.i1());
            gm0.j1.i();
            gm0.j1.n().f273288b.g(rVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exitCgiReport", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        setResult(-1, getIntent().putExtra("key_activity_browse_time", getActivityBrowseTimeMs()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onImageFinish(java.lang.String str, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        super.onPause();
        int i17 = getResources().getConfiguration().orientation;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerUI", "onpause  " + i17);
        W6(i17);
        com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView = this.f167657e;
        if (videoPlayView != null && videoPlayView.isPlaying()) {
            this.f167657e.f(-1);
        }
        if (this.f167657e != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerUI", "onDetach");
            this.f167657e.onDetach();
        }
        com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
        Cj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeSightDownLoadEndListener", "com.tencent.mm.plugin.sns.model.DownloadManager");
        ((java.util.HashSet) Cj.f164448k).remove(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeSightDownLoadEndListener", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.tencent.mm.plugin.sns.model.l4.Cj().v(this);
        i64.c1 c1Var = this.f167658f;
        if (c1Var != null) {
            c1Var.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        super.onResume();
        com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
        Cj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addSightDownLoadEndListener", "com.tencent.mm.plugin.sns.model.DownloadManager");
        ((java.util.HashSet) Cj.f164448k).add(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSightDownLoadEndListener", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.tencent.mm.plugin.sns.model.l4.Cj().c(this);
        i64.c1 c1Var = this.f167658f;
        if (c1Var != null) {
            c1Var.c();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSetbg(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSightFinish(java.lang.String str, boolean z17) {
        r45.jj4 jj4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerUI", "onSightFinish " + str);
        this.f167657e.setIsDownloading(false);
        this.f167657e.setVideoPath(this.f167659g);
        com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView = this.f167657e;
        videoPlayView.b(videoPlayView.getLastProgresstime());
        this.f167657e.setLoop(false);
        if (this.f167665p && !com.tencent.mm.sdk.platformtools.t8.K0(str) && (jj4Var = this.f167655J) != null && str.equals(jj4Var.f377855d) && com.tencent.mm.vfs.w6.j(this.f167659g)) {
            this.f167658f.f289114b = 1;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onThumbFinish(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }
}
