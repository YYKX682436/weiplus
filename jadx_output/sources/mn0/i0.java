package mn0;

/* loaded from: classes10.dex */
public final class i0 implements com.tencent.rtmp.ITXLivePlayListener {
    public static long I;
    public static kotlinx.coroutines.r2 L;
    public final mn0.m0 A;
    public boolean B;
    public java.lang.String C;
    public int D;
    public final kotlinx.coroutines.flow.j2 E;
    public final kotlinx.coroutines.flow.f3 F;
    public com.tencent.rtmp.ITXLivePlayListener G;

    /* renamed from: d, reason: collision with root package name */
    public final mn0.b0 f329741d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f329742e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f329743f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.FinderLiveCdnPlayTimeCostStruct f329744g;

    /* renamed from: h, reason: collision with root package name */
    public long f329745h;

    /* renamed from: i, reason: collision with root package name */
    public long f329746i;

    /* renamed from: m, reason: collision with root package name */
    public long f329747m;

    /* renamed from: n, reason: collision with root package name */
    public long f329748n;

    /* renamed from: o, reason: collision with root package name */
    public long f329749o;

    /* renamed from: p, reason: collision with root package name */
    public long f329750p;

    /* renamed from: q, reason: collision with root package name */
    public long f329751q;

    /* renamed from: r, reason: collision with root package name */
    public int f329752r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f329753s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f329754t;

    /* renamed from: u, reason: collision with root package name */
    public long f329755u;

    /* renamed from: v, reason: collision with root package name */
    public long f329756v;

    /* renamed from: w, reason: collision with root package name */
    public mn0.d0 f329757w;

    /* renamed from: x, reason: collision with root package name */
    public mn0.l0 f329758x;

    /* renamed from: y, reason: collision with root package name */
    public mn0.k0 f329759y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f329760z;
    public static final mn0.g0 H = new mn0.g0(null);

    /* renamed from: J, reason: collision with root package name */
    public static final java.util.Map f329740J = java.util.Collections.synchronizedMap(new java.util.HashMap());
    public static final java.util.Map K = java.util.Collections.synchronizedMap(new java.util.HashMap());

    public i0(mn0.b0 player, boolean z17) {
        kotlin.jvm.internal.o.g(player, "player");
        this.f329741d = player;
        this.f329742e = z17;
        this.f329743f = "LiveTXPlayerTicker_" + hashCode();
        this.f329744g = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveCdnPlayTimeCostStruct();
        this.f329752r = 1;
        this.f329753s = "";
        this.f329754t = "";
        this.f329757w = mn0.d0.f329709e;
        this.A = new mn0.m0(0, 0, "", 0);
        this.C = "";
        kotlinx.coroutines.flow.j2 a17 = kotlinx.coroutines.flow.i3.a(0);
        this.E = a17;
        this.F = kotlinx.coroutines.flow.l.b(a17);
    }

    public final void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f329743f, "recordFirstFrame: source=" + str + ", firstIFrameStamp=" + this.f329749o);
        if (this.f329749o == 0) {
            this.f329749o = android.os.SystemClock.elapsedRealtime();
            if (kotlin.jvm.internal.o.b(str, "Local")) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("api", "externalNotifyCustomRenderFirstFrameEvent");
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                this.f329741d.callExperimentalAPI(jSONObject2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x004a, code lost:
    
        if (r2 > r11) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mn0.i0.b():void");
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
        int i17;
        java.lang.String str;
        java.lang.String str2;
        b92.m2 m2Var;
        long j17;
        java.lang.String str3;
        java.lang.String str4;
        com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener = this.G;
        if (iTXLivePlayListener != null) {
            iTXLivePlayListener.onNetStatus(bundle);
        }
        if (bundle != null) {
            bundle.putLong("NET_STATUS_START_TIME", this.f329747m);
        }
        zy2.n8 n8Var = (zy2.n8) i95.n0.c(zy2.n8.class);
        long hashCode = hashCode();
        long j18 = this.f329755u;
        long j19 = this.f329756v;
        java.lang.String sessionId = this.f329753s;
        java.lang.String commentScene = this.f329754t;
        java.lang.String tagName = this.C;
        int i18 = this.D;
        b92.m2 m2Var2 = (b92.m2) n8Var;
        m2Var2.getClass();
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(commentScene, "commentScene");
        kotlin.jvm.internal.o.g(tagName, "tagName");
        if (j18 == 0 || bundle == null) {
            return;
        }
        if (!m2Var2.f18481d.containsKey(java.lang.Long.valueOf(hashCode))) {
            com.tencent.mars.xlog.Log.i("FinderLiveQosReportService", "onNetStatus: this live is not playing, commentScene=" + commentScene + ", sessionId=" + sessionId + ", objectId=" + pm0.v.u(j18) + ", liveId=" + pm0.v.u(j19) + ", tickerHashCode=" + hashCode);
            return;
        }
        if (!kotlin.jvm.internal.o.b(m2Var2.f18481d.get(java.lang.Long.valueOf(hashCode)), java.lang.Boolean.TRUE)) {
            com.tencent.mars.xlog.Log.i("FinderLiveQosReportService", "onNetStatus: this live has not render first frame, commentScene=" + commentScene + ", sessionId=" + sessionId + ", objectId=" + pm0.v.u(j18) + ", liveId=" + pm0.v.u(j19) + ", tickerHashCode=" + hashCode);
            return;
        }
        int i19 = bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_VIDEO_FPS);
        int i27 = bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_VIDEO_LIGHT_BLOCK_COUNT);
        int i28 = bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_VIDEO_MEDIUM_BLOCK_COUNT);
        int i29 = bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_VIDEO_LARGE_BLOCK_COUNT);
        int i37 = bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_VIDEO_BLOCK_TIME);
        int i38 = bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_NET_SPEED);
        ae2.in inVar = ae2.in.f3688a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.K).getValue()).r()).intValue();
        boolean z17 = intValue > 0 && ((j19 != 0 && m2Var2.f18489o.contains(java.lang.Long.valueOf(j19))) || r26.n0.B(sessionId, "FinderTab_", false));
        int i39 = bundle.getInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_VIDEO_CACHE);
        if (ln0.p.f319671l == null) {
            ln0.p.f319671l = new ln0.p();
        }
        ln0.p pVar = ln0.p.f319671l;
        kotlin.jvm.internal.o.d(pVar);
        java.lang.Long valueOf = java.lang.Long.valueOf(j19);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i39);
        if (pVar.f319675d.get() || valueOf == null || valueOf2 == null) {
            i17 = i18;
            str = tagName;
            str2 = commentScene;
        } else {
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            java.lang.String proxyOf = com.qcloud.qvb.XNet.proxyOf(pVar.f319674c);
            kotlin.jvm.internal.o.f(proxyOf, "proxyOf(...)");
            h0Var.f310123d = proxyOf;
            if (!kotlin.jvm.internal.o.b(proxyOf, pVar.f319674c)) {
                java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var.f310123d;
                if (!(charSequence == null || charSequence.length() == 0)) {
                    java.util.Map p2pParamsMap = pVar.f319672a;
                    kotlin.jvm.internal.o.f(p2pParamsMap, "p2pParamsMap");
                    synchronized (p2pParamsMap) {
                        java.util.Map p2pParamsMap2 = pVar.f319672a;
                        i17 = i18;
                        kotlin.jvm.internal.o.f(p2pParamsMap2, "p2pParamsMap");
                        java.util.Iterator it = p2pParamsMap2.entrySet().iterator();
                        while (it.hasNext()) {
                            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                            java.util.Iterator it6 = it;
                            java.lang.String str5 = (java.lang.String) entry.getKey();
                            ln0.q qVar = (ln0.q) entry.getValue();
                            java.lang.String str6 = tagName;
                            java.lang.String str7 = commentScene;
                            if (qVar.L == valueOf.longValue() && qVar.f319698o != 0 && qVar.f319684a != 0) {
                                ((ku5.t0) ku5.t0.f312615d).h(new ln0.o(pVar, h0Var, "buffer?xresid=" + str5 + "&bufms=" + valueOf2), pVar.f319678g);
                            }
                            tagName = str6;
                            it = it6;
                            commentScene = str7;
                        }
                        str = tagName;
                        str2 = commentScene;
                    }
                }
            }
            i17 = i18;
            str = tagName;
            str2 = commentScene;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper video cache proxy " + ((java.lang.String) h0Var.f310123d));
        }
        if (z17) {
            m2Var = m2Var2;
            str3 = str2;
            str4 = sessionId;
            j17 = j19;
            pm0.v.O("FinderLiveQosReportService", new b92.k2(m2Var2, intValue, j19, bundle, i19, i38, str, i17));
        } else {
            m2Var = m2Var2;
            j17 = j19;
            str3 = str2;
            str4 = sessionId;
        }
        pm0.v.X(new b92.l2(m2Var, hashCode, i19, i27, i28, i29, i37, i38, str3, str4, z17, intValue, j18, j17));
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        java.lang.String str = this.f329743f;
        if (i17 == 2003) {
            com.tencent.mars.xlog.Log.i(str, "PLAY_EVT_RCV_FIRST_I_FRAME " + this.G);
            mn0.k0 k0Var = this.f329759y;
            if (k0Var != null) {
                k0Var.f329768e = true;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                k0Var.f329766c = elapsedRealtime;
                k0Var.a("FirstFrame", elapsedRealtime);
                long j17 = k0Var.f329765b;
                if (j17 > 0) {
                    k0Var.f329767d = k0Var.f329766c - j17;
                    k0Var.f329765b = 0L;
                }
            }
        }
        mn0.b0 b0Var = this.f329741d;
        mn0.m0 m0Var = this.A;
        if (i17 == -2307) {
            m0Var.f329785a = com.tencent.rtmp.TXLiveConstants.PLAY_ERR_STREAM_SWITCH_FAIL;
            m0Var.f329786b = 0;
            java.lang.String str2 = ((mn0.y) b0Var).f329815q;
            kotlin.jvm.internal.o.g(str2, "<set-?>");
            m0Var.f329787c = str2;
        } else if (i17 == -2304) {
            m0Var.f329785a = -2304;
            m0Var.f329786b = 0;
            java.lang.String str3 = ((mn0.y) b0Var).f329815q;
            kotlin.jvm.internal.o.g(str3, "<set-?>");
            m0Var.f329787c = str3;
        } else if (i17 == -2301) {
            m0Var.f329785a = com.tencent.rtmp.TXLiveConstants.PLAY_ERR_NET_DISCONNECT;
            m0Var.f329786b = bundle != null ? bundle.getInt("disconnected_code") : 0;
            java.lang.String str4 = ((mn0.y) b0Var).f329815q;
            kotlin.jvm.internal.o.g(str4, "<set-?>");
            m0Var.f329787c = str4;
        } else if (i17 != 2001) {
            boolean z17 = this.f329742e;
            if (i17 == 2033) {
                com.tencent.mars.xlog.Log.i(str, "onPlayEvent: PLAY_EVT_RENDER_FIRST_FRAME_ON_VIEW, useCustomRender=" + z17 + ", firstFrameRenderTimeStamp=" + this.f329750p);
                if (this.f329750p == 0) {
                    this.f329750p = android.os.SystemClock.elapsedRealtime();
                    b();
                }
                mn0.k0 k0Var2 = this.f329759y;
                if (k0Var2 != null) {
                    k0Var2.a("FirstRender", android.os.SystemClock.elapsedRealtime());
                }
            } else if (i17 == 2103) {
                m0Var.f329785a = com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_RECONNECT;
                m0Var.f329786b = bundle != null ? bundle.getInt("disconnected_code") : 0;
                java.lang.String str5 = ((mn0.y) b0Var).f329815q;
                kotlin.jvm.internal.o.g(str5, "<set-?>");
                m0Var.f329787c = str5;
            } else if (i17 == 999999) {
                com.tencent.mars.xlog.Log.i(str, "onPlayEvent: PLAY_EVT_LOCAL_AFTER_RENDER_FIRST_FRAME, useCustomRender=" + z17);
                if (z17) {
                    a("Local");
                }
            } else if (i17 == 2003) {
                com.tencent.mars.xlog.Log.i(str, "onPlayEvent: PLAY_EVT_RCV_FIRST_I_FRAME, useCustomRender" + z17);
                if (!z17) {
                    a("sdk");
                    b();
                }
                this.f329760z = true;
            } else if (i17 == 2004) {
                com.tencent.mars.xlog.Log.i(str, "onPlayEvent: PLAY_EVT_PLAY_BEGIN");
                mn0.k0 k0Var3 = this.f329759y;
                if (k0Var3 != null) {
                    k0Var3.a("playBegin", android.os.SystemClock.elapsedRealtime());
                }
                this.f329751q = android.os.SystemClock.elapsedRealtime();
            }
        } else {
            com.tencent.mars.xlog.Log.i(str, "onPlayEvent: PLAY_EVT_CONNECT_SUCC");
            mn0.k0 k0Var4 = this.f329759y;
            if (k0Var4 != null) {
                k0Var4.a("connectSuc", android.os.SystemClock.elapsedRealtime());
            }
            this.f329748n = android.os.SystemClock.elapsedRealtime();
        }
        if (i17 != 999999) {
            ((kotlinx.coroutines.flow.h3) this.E).k(java.lang.Integer.valueOf(i17));
            com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener = this.G;
            if (iTXLivePlayListener != null) {
                iTXLivePlayListener.onPlayEvent(i17, bundle);
            }
        }
        if (i17 != 2012) {
            ko0.t tVar = ko0.t.f309903a;
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            com.tencent.mars.xlog.Log.i(str, "onPlayEvent:" + i17 + ' ');
        }
    }
}
