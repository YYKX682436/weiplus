package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class n0 extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.modelbase.u0 {
    public java.lang.String A;
    public java.lang.String B;
    public int C;
    public boolean D;
    public int E;
    public final java.util.LinkedList F;
    public final java.util.LinkedList G;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f151305d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f151306e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Integer f151307f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f151308g;

    /* renamed from: h, reason: collision with root package name */
    public fm3.u f151309h;

    /* renamed from: i, reason: collision with root package name */
    public r45.hf2 f151310i;

    /* renamed from: m, reason: collision with root package name */
    public ll3.h1 f151311m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f151312n;

    /* renamed from: o, reason: collision with root package name */
    public long f151313o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f151314p;

    /* renamed from: q, reason: collision with root package name */
    public final r45.ws4 f151315q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f151316r;

    /* renamed from: s, reason: collision with root package name */
    public long f151317s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f151318t;

    /* renamed from: u, reason: collision with root package name */
    public int f151319u;

    /* renamed from: v, reason: collision with root package name */
    public t45.n0 f151320v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f151321w;

    /* renamed from: x, reason: collision with root package name */
    public r45.at4 f151322x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f151323y;

    /* renamed from: z, reason: collision with root package name */
    public int f151324z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f151305d = "MicroMsg.Mv.MusicMvDataUIC";
        this.f151306e = "MicroMsg.Mv.GetLyric";
        this.f151309h = new fm3.u();
        this.f151310i = new r45.hf2();
        this.f151312n = true;
        this.f151315q = new r45.ws4();
        this.f151324z = 1;
        this.A = "";
        this.B = "";
        this.E = 2;
        this.F = new java.util.LinkedList();
        this.G = new java.util.LinkedList();
    }

    public final int O6() {
        b21.r b17 = b21.m.b();
        if (android.text.TextUtils.isEmpty(b17 != null ? b17.P : null)) {
            return 1;
        }
        ka0.o0 o0Var = (ka0.o0) i95.n0.c(ka0.o0.class);
        b21.r b18 = b21.m.b();
        java.lang.String str = b18 != null ? b18.P : null;
        ((ja0.i0) o0Var).getClass();
        java.lang.Integer num = (java.lang.Integer) ml3.c.f328402d.get(str);
        return ((num != null && num.intValue() == 2) || this.f151324z == 2) ? 2 : 3;
    }

    public final java.lang.String P6() {
        int i17 = 1;
        java.lang.String string = this.f151310i.getString(1);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        r45.at4 at4Var = this.f151322x;
        if (at4Var != null && !android.text.TextUtils.isEmpty(at4Var.f370255d)) {
            r45.at4 at4Var2 = this.f151322x;
            if (at4Var2 != null && at4Var2.f370257f == 1) {
                i17 = 2;
            }
        }
        sb6.append(i17);
        jSONObject.putOpt(string, sb6.toString());
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public final int Q6() {
        return fm3.z.f264170f == 0 ? 1 : 2;
    }

    public final boolean R6(b21.r rVar) {
        if (rVar == null) {
            return false;
        }
        int i17 = rVar.f17345d;
        java.lang.Integer num = this.f151307f;
        return num != null && i17 == num.intValue() && kotlin.jvm.internal.o.b(rVar.f17346e, this.f151308g);
    }

    public final void S6() {
        r45.hf2 hf2Var = this.f151310i;
        java.lang.String string = hf2Var.getString(6);
        if (!(!(string == null || string.length() == 0))) {
            hf2Var = null;
        }
        if (hf2Var != null) {
            ll3.h1 f17 = ll3.h1.f(hf2Var.getString(6), getActivity().getString(com.tencent.mm.R.string.h4r), "", ((ja0.o0) ((ka0.r0) i95.n0.c(ka0.r0.class))).Ai(hf2Var.getString(4), hf2Var.getString(2)), hf2Var.getString(1), false, false);
            this.f151311m = f17.e() > 1 ? f17 : null;
        }
    }

    public final void T6() {
        t45.g gVar;
        t45.n0 n0Var = this.f151320v;
        boolean z17 = n0Var != null && n0Var.f415615d == 2;
        vx3.k kVar = vx3.l.E;
        if (z17 && n0Var != null && (gVar = n0Var.f415617f) != null) {
            ed0.a1 a1Var = (ed0.a1) i95.n0.c(ed0.a1.class);
            t45.n0 n0Var2 = this.f151320v;
            kotlin.jvm.internal.o.d(n0Var2);
            ((dd0.m0) a1Var).getClass();
            kVar.e(gVar, n0Var2).f441289f = this.f151320v;
        }
        t45.n0 n0Var3 = this.f151320v;
        if (n0Var3 != null && n0Var3.f415615d == 1) {
            t45.f0 f0Var = n0Var3 != null ? n0Var3.f415616e : null;
            if (f0Var == null || n0Var3 == null) {
                return;
            }
            ed0.a1 a1Var2 = (ed0.a1) i95.n0.c(ed0.a1.class);
            long j17 = f0Var.f415556i;
            ((dd0.m0) a1Var2).getClass();
            vx3.i g17 = kVar.g(0L, j17, n0Var3, null);
            if (g17 == null) {
                return;
            }
            g17.f441289f = n0Var3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0291  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 1522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.uic.n0.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        fm3.j0 j0Var;
        long j17;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = (com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.class);
        lm3.e eVar = (lm3.e) kz5.n0.a0(musicMvMainUIC.f150977g, musicMvMainUIC.f150982o);
        fm3.u uVar = eVar != null ? eVar.f319482d : null;
        fm3.j0 j0Var2 = fm3.j0.f264078a;
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        r45.hf2 songInfo = this.f151310i;
        kl3.t.g().a().a();
        int Q6 = Q6();
        int O6 = O6();
        java.lang.String P6 = P6();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 7, r45.bt4.class);
        if (bt4Var == null) {
            bt4Var = fm3.j0.f264080c;
        }
        com.tencent.mm.autogen.mmdata.rpt.MvEnterReportStruct mvEnterReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MvEnterReportStruct();
        if (bt4Var != null) {
            mvEnterReportStruct.f59499d = mvEnterReportStruct.b("ContextId", bt4Var.f371037e, true);
            mvEnterReportStruct.f59504i = bt4Var.f371036d;
            mvEnterReportStruct.f59505j = mvEnterReportStruct.b("FromSourceId", bt4Var.f371039g, true);
            mvEnterReportStruct.f59514s = bt4Var.f371040h;
            mvEnterReportStruct.f59516u = bt4Var.f371047r;
            mvEnterReportStruct.f59518w = bt4Var.f371048s;
            mvEnterReportStruct.f59519x = bt4Var.f371049t;
            mvEnterReportStruct.f59520y = bt4Var.f371050u;
            mvEnterReportStruct.f59521z = bt4Var.f371051v;
            if (bt4Var.f371054y == 3) {
                mvEnterReportStruct.A = 3L;
            } else {
                mvEnterReportStruct.A = 2L;
            }
        }
        int i17 = fm3.j0.f264079b;
        if (i17 == 18) {
            mvEnterReportStruct.f59504i = i17;
            android.content.Intent intent = context.getIntent();
            mvEnterReportStruct.B = mvEnterReportStruct.b("SceneNote", intent != null ? intent.getStringExtra("key_mv_scene_note") : null, true);
            fm3.j0.f264079b = 0;
        }
        fm3.k0 b17 = j0Var2.b(context);
        mvEnterReportStruct.f59511p = b17.f264082a;
        mvEnterReportStruct.f59512q = b17.f264083b;
        mvEnterReportStruct.f59513r = b17.f264084c;
        java.lang.String string = songInfo.getString(0);
        mvEnterReportStruct.f59500e = mvEnterReportStruct.b("SongName", string != null ? r26.i0.t(string, ",", " ", false) : null, true);
        mvEnterReportStruct.f59503h = mvEnterReportStruct.b("AppId", songInfo.getString(3), true);
        mvEnterReportStruct.f59501f = mvEnterReportStruct.b("WebUrl", songInfo.getString(4), true);
        mvEnterReportStruct.f59502g = mvEnterReportStruct.b("DataUrl", songInfo.getString(2), true);
        java.lang.String string2 = songInfo.getString(6);
        if (string2 == null || string2.length() == 0) {
            j0Var = j0Var2;
            j17 = 2;
        } else {
            j0Var = j0Var2;
            j17 = 1;
        }
        mvEnterReportStruct.f59508m = j17;
        java.lang.String string3 = songInfo.getString(5);
        mvEnterReportStruct.f59509n = mvEnterReportStruct.b("SongId", string3 != null ? r26.i0.t(string3, ",", " ", false) : null, true);
        java.lang.String string4 = songInfo.getString(1);
        mvEnterReportStruct.f59517v = mvEnterReportStruct.b("Singer", string4 != null ? r26.i0.t(string4, ",", " ", false) : null, true);
        mvEnterReportStruct.f59510o = 2L;
        long c17 = j0Var.c(context);
        mvEnterReportStruct.f59515t = c17;
        mvEnterReportStruct.C = Q6;
        mvEnterReportStruct.D = O6;
        mvEnterReportStruct.E = mvEnterReportStruct.b("JumpType", P6, true);
        long j18 = fm3.z.f264171g;
        long j19 = j18 + c17;
        fm3.z.f264171g = j19;
        mvEnterReportStruct.G = songInfo.getInteger(14);
        mvEnterReportStruct.H = j19;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvReportLogic", "songPlayDurationSoFar:" + j19 + ", currentSongPlayDurationSoFar:" + j18 + ", playMusicTime:" + c17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isMvWithBeat:");
        sb6.append(uVar != null ? java.lang.Boolean.valueOf(uVar.f264146z) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvReportLogic", sb6.toString());
        mvEnterReportStruct.I = 0L;
        mvEnterReportStruct.f59498J = mvEnterReportStruct.b("SyncBeatFeedID", "", true);
        mvEnterReportStruct.F = mvEnterReportStruct.b("PlaySameSongSessionId", fm3.z.f264173i, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvReportLogic", "songTotalDuration:" + songInfo.getInteger(14) + ", playMusicTime:" + c17 + ", syncBeatPlayDurationSoFar:" + mvEnterReportStruct.I);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvReportLogic", "struct.contextId:" + mvEnterReportStruct.f59499d + ", struct.syncBeatFeedID:" + mvEnterReportStruct.f59498J + ", playSameSongSessionId:" + mvEnterReportStruct.F);
        mvEnterReportStruct.k();
        mvEnterReportStruct.o();
        fm3.j0.f264079b = 0;
        fm3.f0 f0Var = fm3.f0.f264048a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onMvMainUIExit, songName:");
        r45.hf2 hf2Var = fm3.f0.f264056i;
        sb7.append(hf2Var != null ? hf2Var.getString(0) : null);
        sb7.append(", singer:");
        r45.hf2 hf2Var2 = fm3.f0.f264056i;
        sb7.append(hf2Var2 != null ? hf2Var2.getString(1) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvChattingDataManger", sb7.toString());
        fm3.f0.f264067t = null;
        fm3.f0.f264060m.clear();
        fm3.f0.f264061n.clear();
        fm3.f0.f264062o.clear();
        fm3.f0.f264063p.clear();
        if (2 == fm3.f0.f264065r) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvChattingDataManger", "song is stop Playing, session End");
            f0Var.b();
        }
        fm3.f0.f264066s = false;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("onMvMainUIExit, songName:");
        r45.hf2 hf2Var3 = fm3.z.f264167c;
        sb8.append(hf2Var3 != null ? hf2Var3.getString(0) : null);
        sb8.append(", singer:");
        r45.hf2 hf2Var4 = fm3.z.f264167c;
        sb8.append(hf2Var4 != null ? hf2Var4.getString(1) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvDataManager", sb8.toString());
        fm3.z.f264172h = java.lang.System.currentTimeMillis();
        if (2 == fm3.z.f264168d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvDataManager", "song is stop Playing, session End");
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("onSessionEnd, songName:");
            r45.hf2 hf2Var5 = fm3.z.f264167c;
            sb9.append(hf2Var5 != null ? hf2Var5.getString(0) : null);
            sb9.append(", singer:");
            r45.hf2 hf2Var6 = fm3.z.f264167c;
            sb9.append(hf2Var6 != null ? hf2Var6.getString(1) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvDataManager", sb9.toString());
            fm3.z.f264165a = true;
            fm3.z.f264171g = 0L;
            fm3.z.f264172h = 0L;
        }
        fm3.z.f264169e = false;
        kl3.e l17 = kl3.t.l();
        if (l17 != null) {
            if (!(l17 instanceof kl3.k)) {
                l17 = null;
            }
            if (l17 != null) {
                kl3.z zVar = (kl3.z) ((kl3.k) l17);
                if (zVar.f308860i != null) {
                    zVar.f308860i = null;
                }
            }
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i(this.f151305d, "onSceneEnd errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scene:" + m1Var);
    }
}
