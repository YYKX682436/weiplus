package com.tencent.mm.plugin.game.media;

@db5.a(19)
/* loaded from: classes8.dex */
public class GameVideoEditorProxyUI extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String f140083w = com.tencent.mm.plugin.game.commlib.util.m.b(com.tencent.mm.plugin.game.commlib.util.l.ONE_MONTH) + "haowan/";

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f140084e;

    /* renamed from: f, reason: collision with root package name */
    public int f140085f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f140086g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f140087h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f140088i;

    /* renamed from: m, reason: collision with root package name */
    public android.util.SparseArray f140089m;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f140091o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.sight.base.b f140092p;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.game.api.GameShareOption f140090n = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f140093q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f140094r = "";

    /* renamed from: s, reason: collision with root package name */
    public boolean f140095s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f140096t = false;

    /* renamed from: u, reason: collision with root package name */
    public int f140097u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final ut3.d f140098v = new i53.d4(this);

    public final java.lang.String O6(java.lang.String str, java.lang.String str2) {
        m53.t1 t1Var;
        java.lang.String str3;
        java.lang.String str4;
        if (com.tencent.mm.plugin.game.commlib.i.e() != null) {
            t1Var = com.tencent.mm.plugin.game.commlib.i.f139381a.GeneralJumpInfo;
        } else {
            com.tencent.mm.plugin.game.commlib.i.s();
            t1Var = null;
        }
        if (t1Var != null) {
            java.util.LinkedList linkedList = t1Var.f324069d;
            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    m53.o3 o3Var = (m53.o3) it.next();
                    if (o3Var.f323938d == 2 && !com.tencent.mm.sdk.platformtools.t8.K0(o3Var.f323940f)) {
                        str3 = o3Var.f323940f;
                        break;
                    }
                }
            }
        }
        str3 = "https://game.weixin.qq.com/cgi-bin/h5/static/appcenter/publish.html?ssid=5&scene=5";
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(str3);
        stringBuffer.append("?video_info=");
        if (str2 == null) {
            cl0.g gVar = new cl0.g();
            try {
                gVar.h("videoUrl", str);
                gVar.h("thumbUrl", getIntent().getStringExtra("thumb_url"));
            } catch (cl0.f unused) {
            }
            str4 = gVar.toString();
        } else {
            try {
                str4 = new org.json.JSONArray(str2).getJSONObject(0).toString();
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Haowan.GameVideoEditorProxyUI", "json_err:%s", e17.getMessage());
                str4 = "";
            }
        }
        stringBuffer.append(java.net.URLEncoder.encode(str4));
        stringBuffer.append("&from=");
        stringBuffer.append(this.f140085f);
        stringBuffer.append("&appid=");
        stringBuffer.append(this.f140087h);
        stringBuffer.append("&game_info=");
        stringBuffer.append(getIntent().getStringExtra("game_info"));
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "publish url:%s", stringBuffer.toString());
        return stringBuffer.toString();
    }

    public final com.tencent.mm.modelcontrol.VideoTransPara P6() {
        com.tencent.mm.modelcontrol.VideoTransPara mj6;
        m53.q1 q1Var;
        int i17 = this.f140085f;
        if (i17 == 3 || i17 == 5) {
            ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
            mj6 = d11.s.fj().mj(1);
        } else {
            ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
            mj6 = d11.s.fj().mj(0);
        }
        m53.q1 q1Var2 = null;
        if (com.tencent.mm.plugin.game.commlib.i.e() != null) {
            q1Var = com.tencent.mm.plugin.game.commlib.i.f139381a.GameSight;
        } else {
            com.tencent.mm.plugin.game.commlib.i.s();
            q1Var = null;
        }
        if (q1Var != null) {
            if (com.tencent.mm.plugin.game.commlib.i.e() != null) {
                q1Var2 = com.tencent.mm.plugin.game.commlib.i.f139381a.GameSight;
            } else {
                com.tencent.mm.plugin.game.commlib.i.s();
            }
            mj6.f71191d = (int) q1Var2.f323981e;
            mj6.f71192e = (int) q1Var2.f323982f;
            mj6.f71194g = (int) q1Var2.f323980d;
            mj6.f71198n = (int) q1Var2.f323983g;
            mj6.f71195h = (int) q1Var2.f323984h;
        }
        return mj6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0090, code lost:
    
        if (r3.f162385d >= r3.f162384c) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x009b, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0099, code lost:
    
        if (r3.f162384c >= r3.f162385d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q6() {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.media.GameVideoEditorProxyUI.Q6():void");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        int i19;
        int i27 = i18;
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 121) {
            if (i27 == -1) {
                if (intent != null && (this.f140085f == 3 || this.f140096t)) {
                    com.tencent.mm.sdk.platformtools.u3.i(new i53.e4(this, null, intent.getStringExtra("key_video_info")), 0L);
                    setResult(-1);
                    return;
                }
            } else if (i27 == 0 || i27 == 3000 || i27 == 3001) {
                com.tencent.mm.game.report.l.c(this, 87, 8763, 1, 2, this.f140097u, lj0.a.a(this.f140085f, null));
            } else if (i27 == 888) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "video edit in background");
                java.lang.String b17 = j53.d.b(intent.getStringExtra("key_thumb_path"), this.f140088i);
                java.lang.String stringExtra = intent.getStringExtra("key_bg_mix_task_id");
                int V1 = com.tencent.mm.sdk.platformtools.t8.V1(intent.getIntExtra("key_video_duration", 0));
                com.tencent.mm.plugin.sight.base.b bVar = this.f140092p;
                int i28 = bVar.f162384c;
                int i29 = bVar.f162385d;
                int i37 = bVar.f162395n;
                if (i37 == 90 || i37 == 270) {
                    i19 = i29;
                    i29 = i28;
                } else {
                    i19 = i28;
                }
                java.lang.String i38 = com.tencent.mm.plugin.webview.model.o5.i("weixin://bgmixid/" + stringExtra, b17, V1, i29, i19, 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "videoInfo:%s", i38);
                intent.putExtra("key_video_info", i38);
                if (this.f140085f == 3 || this.f140096t) {
                    com.tencent.mm.sdk.platformtools.u3.i(new i53.e4(this, null, intent.getStringExtra("key_video_info")), 0L);
                    return;
                }
                i27 = -1;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.Haowan.GameVideoEditorProxyUI", "video check error: [%d]", java.lang.Integer.valueOf(i18));
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("failid", java.lang.Integer.valueOf(i18));
                com.tencent.mm.game.report.l.c(this.f140084e, 87, 8763, 2, 56, this.f140097u, lj0.a.a(this.f140085f, hashMap));
                db5.t7.makeText(this.f140084e, com.tencent.mm.R.string.f492234fq3, 1).show();
                if (this.f140085f == 3) {
                    setResult(i27, intent);
                    finish();
                    ((kt.s0) ((lt.r0) i95.n0.c(lt.r0.class))).Ai(this.f140086g, "Invalid video format", this.f140087h, -3, "Invalid video format");
                    return;
                }
            }
        }
        setResult(i27, intent);
        finish();
        if (this.f140085f == 3) {
            ((kt.s0) ((lt.r0) i95.n0.c(lt.r0.class))).Ai(this.f140086g, "", this.f140087h, 0, "");
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String i17;
        super.onCreate(bundle);
        this.f140084e = this;
        this.f140085f = getIntent().getIntExtra("from", -1);
        this.f140086g = getIntent().getStringExtra("business_type");
        this.f140087h = getIntent().getStringExtra("appid");
        this.f140088i = getIntent().getStringExtra("video_path");
        android.os.Bundle bundleExtra = getIntent().getBundleExtra("ext_data");
        if (bundleExtra != null) {
            this.f140096t = bundleExtra.getBoolean("game_straight_to_publish", false);
        }
        this.f140097u = getIntent().getIntExtra("game_haowan_source_scene_id", 0);
        boolean equals = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GAME_VIDEO_IS_BG_MIX_STRING, "1").equals("1");
        boolean z17 = ((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).wi(e42.d0.clicfg_game_video_open_bg_mix, 1) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "video bg mix, debugOpen:%b, xLabOpen:%b", java.lang.Boolean.valueOf(equals), java.lang.Boolean.valueOf(z17));
        if (equals && z17) {
            this.f140095s = true;
        } else {
            this.f140095s = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "video_path:%s", this.f140088i);
        com.tencent.mm.feature.sight.api.o oVar = (com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class);
        java.lang.String str = this.f140088i;
        ((be0.e) oVar).getClass();
        this.f140092p = com.tencent.mm.plugin.sight.base.e.d(str, true);
        if (getIntent().getBooleanExtra("need_edit", false)) {
            if (this.f140092p == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Haowan.GameVideoEditorProxyUI", "video is error");
                finish();
            } else {
                Q6();
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f140088i)) {
            com.tencent.mm.sdk.platformtools.u3.i(new i53.e4(this, getIntent().getStringExtra("video_url"), null), 0L);
        } else if (this.f140092p == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Haowan.GameVideoEditorProxyUI", "video is error");
            finish();
        } else {
            com.tencent.mm.modelcontrol.VideoTransPara P6 = P6();
            if (com.tencent.mm.vfs.w6.k(this.f140088i) > com.tencent.tmassistantsdk.downloadservice.DownloadHelper.SAVE_LENGTH || P6.f71195h < this.f140092p.a()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "videoLength(%d) > %d or videoDuration(%d) > paramDuration(%d), needEdit is invalid", java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(this.f140088i)), 104857600, java.lang.Integer.valueOf(this.f140092p.a()), java.lang.Integer.valueOf(P6.f71195h));
                Q6();
            } else {
                java.lang.String str2 = f140083w + "vsg_output_" + java.lang.System.currentTimeMillis() + ".mp4";
                java.lang.String str3 = this.f140088i;
                if (!str3.equals(str2)) {
                    com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(str2));
                    com.tencent.mm.vfs.w6.c(str3, str2);
                }
                this.f140088i = str2;
                com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem c17 = j53.d.c(str2);
                if (c17 == null) {
                    i17 = null;
                } else {
                    java.lang.String b17 = j53.d.b(null, str2);
                    com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b18 = com.tencent.mm.plugin.webview.model.l4.f183002b.b(b17);
                    if (b18 != null) {
                        c17.f182737f = b18.f182738g;
                    }
                    c17.f182750v.putInt("mark_edit_flag", 0);
                    i17 = com.tencent.mm.plugin.webview.model.o5.i(c17.f182736e, b17, c17.f182754w, c17.f182745q, c17.f182744p, c17.f182743o);
                }
                if (i17 == null) {
                    finish();
                } else {
                    com.tencent.mm.sdk.platformtools.u3.i(new i53.e4(this, null, i17), 0L);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "onCreate");
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
