package mn0;

/* loaded from: classes10.dex */
public abstract class y implements mn0.b0 {
    public final jz5.g A;
    public final jz5.g B;
    public int C;
    public int D;
    public final java.lang.StringBuilder E;
    public mn0.l0 F;
    public boolean G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f329804J;
    public final jz5.g K;
    public final jz5.g L;
    public final jz5.g M;
    public final jz5.g N;
    public r45.p72 P;
    public long Q;
    public long R;
    public com.tencent.rtmp.TXLivePlayConfig S;
    public boolean T;
    public boolean U;
    public final jz5.g V;
    public final jz5.g W;
    public final jz5.g X;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f329805d;

    /* renamed from: e, reason: collision with root package name */
    public final ls5.f f329806e;

    /* renamed from: f, reason: collision with root package name */
    public final ls5.d f329807f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f329808g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f329809h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f329810i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f329811m;

    /* renamed from: n, reason: collision with root package name */
    public long f329812n;

    /* renamed from: o, reason: collision with root package name */
    public int f329813o;

    /* renamed from: p, reason: collision with root package name */
    public final co0.y f329814p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f329815q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f329816r;

    /* renamed from: s, reason: collision with root package name */
    public int f329817s;

    /* renamed from: t, reason: collision with root package name */
    public r45.ka4 f329818t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f329819u;

    /* renamed from: v, reason: collision with root package name */
    public int f329820v;

    /* renamed from: w, reason: collision with root package name */
    public int f329821w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f329822x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.live.core.core.trtc.sdkadapter.feature.WeixinAudioJitterBufferControllerFactory f329823y;

    /* renamed from: z, reason: collision with root package name */
    public int f329824z;

    public y(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f329805d = context;
        ls5.f fVar = new ls5.f(this);
        this.f329806e = fVar;
        this.f329807f = new ls5.d(fVar.b());
        this.f329808g = new java.util.ArrayList();
        this.f329814p = new co0.y(new mn0.j(this));
        this.f329815q = "";
        this.f329816r = "";
        this.f329819u = jz5.h.b(new mn0.l(this));
        if (com.tencent.mm.live.core.core.trtc.sdkadapter.feature.WeixinAudioJitterBufferControllerFactory.f68564b == null) {
            com.tencent.mm.live.core.core.trtc.sdkadapter.feature.WeixinAudioJitterBufferControllerFactory.f68564b = new com.tencent.mm.live.core.core.trtc.sdkadapter.feature.WeixinAudioJitterBufferControllerFactory();
        }
        this.f329823y = com.tencent.mm.live.core.core.trtc.sdkadapter.feature.WeixinAudioJitterBufferControllerFactory.f68564b;
        this.A = jz5.h.b(new mn0.g(this));
        this.B = jz5.h.b(new mn0.h(this));
        this.E = new java.lang.StringBuilder("");
        this.f329804J = jz5.h.b(mn0.w.f329802d);
        this.K = jz5.h.b(mn0.k.f329763d);
        this.L = jz5.h.b(mn0.u.f329800d);
        this.M = jz5.h.b(mn0.f.f329731d);
        this.N = jz5.h.b(new mn0.q(this));
        this.V = jz5.h.b(mn0.t.f329799d);
        this.W = jz5.h.b(mn0.v.f329801d);
        this.X = jz5.h.b(new mn0.x(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(mn0.y r4, yz5.l r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof mn0.d
            if (r0 == 0) goto L13
            r0 = r6
            mn0.d r0 = (mn0.d) r0
            int r1 = r0.f329708f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f329708f = r1
            goto L18
        L13:
            mn0.d r0 = new mn0.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f329706d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f329708f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L48
        L2f:
            kotlin.ResultKt.throwOnFailure(r6)
            mn0.i0 r4 = r4.n()
            kotlinx.coroutines.flow.f3 r4 = r4.F
            mn0.e r6 = new mn0.e
            r6.<init>(r5)
            r0.f329708f = r3
            kotlinx.coroutines.flow.l2 r4 = (kotlinx.coroutines.flow.l2) r4
            java.lang.Object r4 = r4.a(r6, r0)
            if (r4 != r1) goto L48
            return r1
        L48:
            jz5.d r4 = new jz5.d
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mn0.y.c(mn0.y, yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ void u(mn0.y yVar, java.lang.String str, int i17, r45.ka4 ka4Var, int i18, r45.p72 p72Var, boolean z17, boolean z18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: realStartPlay");
        }
        yVar.t(str, i17, ka4Var, i18, p72Var, (i19 & 32) != 0 ? false : z17, (i19 & 64) != 0 ? false : z18);
    }

    @Override // mn0.b0
    public void A(int i17, int i18) {
    }

    public void E() {
        com.tencent.mars.xlog.Log.i("BaseLiveTXPlayer", "resumeRender");
        com.tencent.rtmp.TXLivePlayer p17 = p();
        nn0.i iVar = p17 instanceof nn0.i ? (nn0.i) p17 : null;
        if (iVar != null) {
            iVar.c();
        }
    }

    public void F(com.tencent.rtmp.TXLivePlayConfig tXLivePlayConfig) {
        com.tencent.mars.xlog.Log.i("BaseLiveTXPlayer", "setConfig config:" + tXLivePlayConfig);
        this.S = tXLivePlayConfig;
        p().setConfig(tXLivePlayConfig);
    }

    public void G(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f329806e.b(), "BaseLiveTXPlayer setMute: " + z17);
        H(z17, mn0.c.f329702e);
    }

    public final void H(boolean z17, mn0.c cVar) {
        int i17 = z17 ? this.f329813o | cVar.f329705d : this.f329813o & (~cVar.f329705d);
        this.f329813o = i17;
        boolean z18 = i17 != 0;
        p().setMute(z18);
        this.f329810i = z18;
        com.tencent.mars.xlog.Log.i("BaseLiveTXPlayer", "setMuteInternal: mute=" + z17 + ", scene=" + cVar + ", muteMask=" + this.f329813o + ", shouldMute=" + z18 + ", isMute=" + this.f329810i);
    }

    @Override // mn0.b0
    public void I(java.lang.String jsonStr) {
        kotlin.jvm.internal.o.g(jsonStr, "jsonStr");
        com.tencent.mars.xlog.Log.i("BaseLiveTXPlayer", "callDecryExperimentalAPI jsonStr:".concat(r26.n0.q0(jsonStr, "encKey", jsonStr)));
        if (jsonStr.length() == 0) {
            return;
        }
        p().callExperimentalAPI(jsonStr);
        int hashCode = p().hashCode();
        com.tencent.mm.sdk.platformtools.r2 r2Var = kn0.c.f309501a;
        if (hashCode != 0) {
            if (!(jsonStr.length() == 0)) {
                com.tencent.mm.sdk.platformtools.r2 r2Var2 = kn0.c.f309501a;
                kn0.b bVar = (kn0.b) r2Var2.get(java.lang.Integer.valueOf(hashCode));
                if (bVar == null) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode);
                    kn0.b bVar2 = new kn0.b(hashCode, true, jsonStr, false);
                    com.tencent.mars.xlog.Log.i("LiveCacheInfo", "setDecryptParams new, " + bVar2);
                    return;
                }
                bVar.f309497a = hashCode;
                bVar.f309498b = true;
                bVar.f309499c = jsonStr;
                bVar.f309500d = false;
                com.tencent.mars.xlog.Log.i("LiveCacheInfo", "setDecryptParams reuse, " + bVar);
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("LiveCacheInfo", "setDecryptParams error,key:" + hashCode + ",decrypString:" + jsonStr);
    }

    public void J(com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener) {
        n().G = iTXLivePlayListener;
        p().setPlayListener(n());
    }

    public void K(mn0.d0 scene, int i17) {
        kotlin.jvm.internal.o.g(scene, "scene");
        mn0.i0 n17 = n();
        n17.getClass();
        n17.f329757w = scene;
        if (!n17.B) {
            n17.B = true;
            java.util.Map map = mn0.i0.f329740J;
            synchronized (map) {
                if (!map.containsKey(scene) || map.get(scene) == null) {
                    map.put(scene, 1);
                } else {
                    java.lang.Integer num = (java.lang.Integer) map.get(scene);
                    map.put(scene, java.lang.Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                }
            }
            mn0.i0.H.a();
        }
        this.I = i17;
    }

    public void N(mn0.l0 info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.F = info;
        r45.nw1 nw1Var = info.f329775f;
        this.G = pm0.v.A(nw1Var != null ? nw1Var.getLong(32) : 0L, 256L);
        mn0.i0 n17 = n();
        mn0.k0 playStep = l();
        n17.getClass();
        kotlin.jvm.internal.o.g(playStep, "playStep");
        com.tencent.mars.xlog.Log.i(n17.f329743f, "setPlayerInfoData info:" + info + ", playStep:" + playStep);
        n17.f329758x = info;
        n17.f329759y = playStep;
    }

    public void O(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, yz5.a aVar) {
        android.view.SurfaceView f68622g;
        android.view.TextureView videoView;
        java.lang.String b17 = this.f329806e.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BaseLiveTXPlayer setPlayerView ");
        sb6.append(tXCloudVideoView != null ? java.lang.Integer.valueOf(tXCloudVideoView.hashCode()) : null);
        sb6.append(", text:");
        sb6.append((tXCloudVideoView == null || (videoView = tXCloudVideoView.getVideoView()) == null) ? null : java.lang.Integer.valueOf(videoView.hashCode()));
        sb6.append(",surface:");
        sb6.append((tXCloudVideoView == null || (f68622g = tXCloudVideoView.getF68622g()) == null) ? null : java.lang.Boolean.valueOf(f68622g.hasFocus()));
        com.tencent.mars.xlog.Log.i(b17, sb6.toString());
        if (p() instanceof nn0.i) {
            com.tencent.rtmp.TXLivePlayer p17 = p();
            kotlin.jvm.internal.o.e(p17, "null cannot be cast to non-null type com.tencent.mm.live.core.core.postprocessor.customrender.CustomTXLivePlayer<*>");
            ((nn0.i) p17).d(tXCloudVideoView, aVar != null ? new mn0.p(aVar) : null);
        } else {
            p().setPlayerView(tXCloudVideoView);
        }
        if (tXCloudVideoView != null) {
            android.view.View f68622g2 = tXCloudVideoView.getF68622g();
            if (f68622g2 == null) {
                f68622g2 = tXCloudVideoView.getVideoView();
            }
            ls5.d dVar = this.f329807f;
            if (f68622g2 != null) {
                android.app.Activity c17 = dVar.c(f68622g2);
                android.view.View rootView = f68622g2.getRootView();
                java.lang.Object layoutParams = rootView != null ? rootView.getLayoutParams() : null;
                android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
                boolean z17 = (layoutParams2 != null ? layoutParams2.type : 0) > 99;
                if (c17 != null) {
                    dVar.a(dVar.d(c17));
                } else if (z17) {
                    dVar.a("Window");
                } else {
                    f68622g2.getViewTreeObserver().addOnGlobalLayoutListener(new ls5.c(f68622g2, dVar));
                }
            } else {
                dVar.getClass();
            }
            tXCloudVideoView.post(new mn0.r(this, tXCloudVideoView));
        }
        this.f329809h = new java.lang.ref.WeakReference(tXCloudVideoView);
    }

    public void P(boolean z17) {
        int i17 = z17 ? 2 : 1;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("api", com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetPreferLocalIPStack);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("mode", i17);
            jSONObject.put("params", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            callExperimentalAPI(jSONObject3);
        } catch (org.json.JSONException unused) {
        }
    }

    public void Q(int i17) {
        com.tencent.mars.xlog.Log.i(this.f329806e.b(), "BaseLiveTXPlayer setRenderMode " + i17);
        p().setRenderMode(i17);
    }

    public void R(java.lang.String url, int i17, r45.ka4 ka4Var, r45.p72 p72Var, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(url, "url");
        t(url, i17, ka4Var, 1, p72Var, z17, z18);
        java.lang.String str = this.f329815q;
        if (str == null || str.length() == 0) {
            return;
        }
        this.f329811m = true;
    }

    public void S(r45.nw1 liveInfo, r45.p72 p72Var) {
        r45.ka4 ka4Var;
        com.tencent.mm.protobuf.g gVar;
        kotlin.jvm.internal.o.g(liveInfo, "liveInfo");
        ko0.t tVar = ko0.t.f309903a;
        r45.ma4 ma4Var = (r45.ma4) liveInfo.getCustom(23);
        if (ma4Var == null || (gVar = ma4Var.f380300m) == null) {
            ka4Var = null;
        } else {
            r45.na4 na4Var = new r45.na4();
            na4Var.parseFrom(gVar.g());
            ka4Var = na4Var.f381197f;
        }
        r45.ka4 ka4Var2 = ka4Var;
        java.lang.String string = liveInfo.getString(3);
        if (string == null) {
            string = "";
        }
        mn0.b0.D(this, string, 1, ka4Var2, p72Var, false, false, 48, null);
    }

    public void T(boolean z17, boolean z18, boolean z19) {
        boolean z27;
        mn0.i0 i0Var;
        int i17;
        java.lang.String str;
        pm0.v.X(new mn0.s(z18, this, z17, z19));
        mn0.i0 n17 = n();
        com.tencent.mars.xlog.Log.i(n17.f329743f, "stopPlay needClearLastImg: " + z17 + " hadReceiveFirstFrame: " + n17.f329760z);
        zy2.n8 n8Var = (zy2.n8) i95.n0.c(zy2.n8.class);
        long hashCode = (long) n17.hashCode();
        long j17 = n17.f329755u;
        long j18 = n17.f329756v;
        java.lang.String sessionId = n17.f329753s;
        java.lang.String commentScene = n17.f329754t;
        boolean z28 = n17.f329760z;
        b92.m2 m2Var = (b92.m2) n8Var;
        m2Var.getClass();
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(commentScene, "commentScene");
        if (j17 == 0) {
            i0Var = n17;
            z27 = true;
        } else {
            boolean z29 = m2Var.f18481d.remove(java.lang.Long.valueOf(hashCode)) != null;
            com.tencent.mars.xlog.Log.i("FinderLiveQosReportService", "onStopPlay: hadReceiveFirstFrame=" + z28 + ", hasData=" + z29 + ", commentScene=" + commentScene + ", sessionId=" + sessionId + ", objectId=" + pm0.v.u(j17) + ", liveId=" + pm0.v.u(j18) + ", tickerHashCode=" + hashCode);
            if (z28 || !z29) {
                z27 = true;
            } else {
                java.lang.Long l17 = (java.lang.Long) m2Var.f18482e.get(java.lang.Long.valueOf(hashCode));
                if (l17 == null) {
                    l17 = 0L;
                }
                long longValue = l17.longValue();
                if (j17 == 0 || longValue <= 0) {
                    z27 = true;
                    com.tencent.mars.xlog.Log.i("FinderLiveQosReportService", "reportPlayFail: error, startPlayTime=" + longValue + ", commentScene=" + commentScene + ", sessionId=" + sessionId + ", objectId=" + pm0.v.u(j17) + ", liveId=" + pm0.v.u(j18));
                } else {
                    long c17 = c01.id.c();
                    long j19 = c17 - longValue;
                    r45.he2 he2Var = new r45.he2();
                    he2Var.set(2, java.lang.Long.valueOf(longValue));
                    he2Var.set(3, java.lang.Long.valueOf(c17));
                    he2Var.set(0, java.lang.Long.valueOf(j17));
                    he2Var.set(1, java.lang.Long.valueOf(j18));
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    if (!r75.d.f393261h) {
                        i17 = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(context);
                    } else if (r75.d.f393258e == -100) {
                        i17 = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(context);
                        r75.d.f393258e = i17;
                    } else {
                        ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
                        com.tencent.mars.xlog.Log.i("NetWorkCache", "getIOSNetTypeFromCache, iosNetworkType = " + r75.d.f393258e);
                        i17 = r75.d.f393258e;
                    }
                    he2Var.set(6, java.lang.Integer.valueOf(i17));
                    he2Var.set(5, commentScene);
                    he2Var.set(4, sessionId);
                    int i18 = (int) j19;
                    he2Var.set(13, java.lang.Integer.valueOf(i18));
                    he2Var.set(14, java.lang.Integer.valueOf(i18));
                    z27 = true;
                    he2Var.set(15, 1);
                    com.tencent.mars.xlog.Log.i("FinderLiveQosReportService", "reportPlayFail: exitCost=" + j19 + ", commentScene=" + commentScene + ", sessionId=" + sessionId + ", network_type=" + he2Var.getInteger(6) + ", objectId=" + pm0.v.u(j17) + ", liveId=" + pm0.v.u(j18));
                    pm0.v.X(new b92.f2(m2Var, he2Var, "reportPlayFail"));
                }
            }
            i0Var = n17;
        }
        mn0.m0 m0Var = i0Var.A;
        m0Var.f329785a = 0;
        m0Var.f329786b = 0;
        m0Var.f329787c = "";
        m0Var.f329788d = 0;
        if (i0Var.f329746i == 0) {
            i0Var.f329746i = android.os.SystemClock.elapsedRealtime();
        }
        if (z17) {
            i0Var.f329760z = false;
        }
        ((com.tencent.mm.live.core.core.player.FinderPageExitPlayerDetector) ms5.f.f331158a.b(com.tencent.mm.live.core.core.player.FinderPageExitPlayerDetector.class)).d(this.f329806e);
        ls5.d dVar = this.f329807f;
        java.lang.String str2 = dVar.f321123c;
        if (!((str2 == null || str2.length() == 0) ? z27 : false) && dVar.f321124d > 0 && (str = dVar.f321123c) != null) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new ls5.b(6, str, dVar, null), 2, null);
        }
        ko0.t tVar = ko0.t.f309903a;
        java.lang.String d17 = tVar.d(this.f329816r);
        if (tVar.g(this.f329816r)) {
            if (ln0.p.f319671l == null) {
                ln0.p.f319671l = new ln0.p();
            }
            ln0.p pVar = ln0.p.f319671l;
            kotlin.jvm.internal.o.d(pVar);
            pVar.b(d17);
        }
        com.tencent.mars.xlog.Log.i("BaseLiveTXPlayer", "txLivePlayer stopPlay curPlayerUrl=" + this.f329815q + ", realPlayUrl=" + this.f329816r + ", streamId=" + d17);
    }

    public final boolean U() {
        com.tencent.rtmp.TXLivePlayer p17 = p();
        nn0.i iVar = p17 instanceof nn0.i ? (nn0.i) p17 : null;
        return (iVar != null && iVar.f338583a && iVar.f338584b != null) && ((java.lang.Number) this.W.getValue()).intValue() > 0;
    }

    public void V(int i17, int i18, float f17, float f18) {
        int i19;
        int i27 = this.f329821w;
        com.tencent.mm.live.core.core.trtc.sdkadapter.feature.WeixinAudioJitterBufferControllerFactory weixinAudioJitterBufferControllerFactory = this.f329823y;
        if (i27 != i17) {
            long a17 = i17 != 0 ? weixinAudioJitterBufferControllerFactory.a() : 0L;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("api", "setAudioJitterBufferFactory");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("controllerFactory", a17);
            jSONObject.put("params", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            callExperimentalAPI(jSONObject3);
            this.f329821w = i17;
        }
        jz5.g gVar = this.L;
        java.lang.Integer num = (java.lang.Integer) ((jz5.n) gVar).getValue();
        qs5.p[] pVarArr = qs5.p.f366459d;
        if (num != null && num.intValue() == 1 && (i19 = this.f329820v) > 0 && i19 < 5000) {
            i18 = 2;
        }
        com.tencent.mars.xlog.Log.i("WaveJBM:", "BaseLiveTXPlayer updateAudioJitterBufferConfigs: waveJbmFlag:" + i17 + ", waveJbmMode:" + i18 + ", waveJbmMinSpeed:" + f17 + ", waveJbmMaxSpeed:" + f18 + ", waveJbmFactoryInstance:" + weixinAudioJitterBufferControllerFactory);
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        jSONObject4.put("api", "SetJitterBufferConfigs");
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        jSONObject5.put("wavejbmMode", i18);
        jSONObject5.put("wavejbmMinSpeedRate", java.lang.Float.valueOf(f17));
        jSONObject5.put("wavejbmMaxSpeedRate", java.lang.Float.valueOf(f18));
        jSONObject5.put("wavejbmLowDelayMode", (java.lang.Integer) ((jz5.n) gVar).getValue());
        jSONObject5.put("wavejbmInitialDelay", this.f329820v);
        jSONObject4.put("params", jSONObject5);
        java.lang.String jSONObject6 = jSONObject4.toString();
        kotlin.jvm.internal.o.f(jSONObject6, "toString(...)");
        weixinAudioJitterBufferControllerFactory.c(jSONObject6);
        this.f329822x = true;
    }

    public void a(mn0.c0 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.ArrayList arrayList = this.f329808g;
        arrayList.remove(listener);
        arrayList.add(listener);
        com.tencent.mars.xlog.Log.i(this.f329806e.b(), "addStateChangeListener listener: " + listener);
    }

    public boolean b(boolean z17) {
        boolean isPlaying;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (z17 && ((java.lang.Number) this.V.getValue()).intValue() > 0 && currentTimeMillis - this.f329812n < 500) {
            return this.f329811m;
        }
        if (U()) {
            int ordinal = this.f329814p.f43744b.ordinal();
            if (ordinal != 0) {
                isPlaying = false;
                if (ordinal != 1 && ordinal != 2) {
                    throw new jz5.j();
                }
            } else {
                isPlaying = p().isPlaying();
            }
        } else {
            isPlaying = p().isPlaying();
        }
        this.f329811m = isPlaying;
        this.f329812n = currentTimeMillis;
        return isPlaying;
    }

    @Override // mn0.b0
    public void callExperimentalAPI(java.lang.String jsonStr) {
        kotlin.jvm.internal.o.g(jsonStr, "jsonStr");
        com.tencent.mars.xlog.Log.i("BaseLiveTXPlayer", "callExperimentalAPI jsonStr:".concat(jsonStr));
        if (jsonStr.length() == 0) {
            return;
        }
        p().callExperimentalAPI(jsonStr);
    }

    public final void d(mn0.d0 d0Var) {
        this.f329824z = 0;
        if (d0Var == mn0.d0.f329712h) {
            int i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_live_wave_veq_flag_android, -1) == 1 ? 1 : 0;
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_live_wave_veq_level_android, -1);
            int i18 = 10 <= Ni && Ni < 31 ? Ni : 16;
            com.tencent.mars.xlog.Log.i("BaseLiveTXPlayer", "AudioVolumeEqualizer, scene:" + d0Var + ", flag:" + i17 + ", level:" + i18);
            if (i17 == 1) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("api", "enableAudioVolumeEqualizer");
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("enable", i17);
                jSONObject2.put(ya.b.LEVEL, i18);
                jSONObject.put("params", jSONObject2);
                java.lang.String jSONObject3 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
                callExperimentalAPI(jSONObject3);
                this.f329824z = (i18 * 10) + i17;
                return;
            }
            return;
        }
        int i19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_live_wave_veq_flag2_android, -1) == 1 ? 1 : 0;
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_live_wave_veq_level2_android, -1);
        int i27 = 10 <= Ni2 && Ni2 < 31 ? Ni2 : 16;
        com.tencent.mars.xlog.Log.i("BaseLiveTXPlayer", "AudioVolumeEqualizer, scene:" + d0Var + ", flag:" + i19 + ", level:" + i27);
        if (i19 == 1) {
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put("api", "enableAudioVolumeEqualizer");
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            jSONObject5.put("enable", i19);
            jSONObject5.put(ya.b.LEVEL, i27);
            jSONObject4.put("params", jSONObject5);
            java.lang.String jSONObject6 = jSONObject4.toString();
            kotlin.jvm.internal.o.f(jSONObject6, "toString(...)");
            callExperimentalAPI(jSONObject6);
            this.f329824z = (i27 * 10) + i19;
        }
    }

    public abstract com.tencent.rtmp.TXLivePlayer e(android.content.Context context);

    public boolean f(boolean z17) {
        return p().enableHardwareDecode(z17);
    }

    public final void finalize() {
        com.tencent.mars.xlog.Log.i(this.f329806e.b(), "finalize invoke");
        com.tencent.rtmp.TXLivePlayer p17 = p();
        nn0.x xVar = p17 instanceof nn0.x ? (nn0.x) p17 : null;
        if (xVar != null) {
            ((com.tencent.mm.live.core.core.player.FinderNewLivePlayerDetector) ms5.f.f331158a.b(com.tencent.mm.live.core.core.player.FinderNewLivePlayerDetector.class)).d(xVar.f338633e);
            ((nn0.p) xVar.f338584b).release();
        }
    }

    public final void g() {
        boolean z17 = true;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_finder_live_http_header_content_params_android, "X-Tlive-Hot-Stream", true);
        if (Zi != null && Zi.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("BaseLiveTXPlayer", "no http header set!");
            return;
        }
        kotlin.jvm.internal.o.d(Zi);
        java.util.List f07 = r26.n0.f0(Zi, new java.lang.String[]{","}, false, 0, 6, null);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = f07.iterator();
        while (it.hasNext()) {
            jSONArray.put((java.lang.String) it.next());
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("api", "enableReportStreamRspInfo");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("ids", jSONArray);
        jSONObject.put("params", jSONObject2);
        java.lang.String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        p().callExperimentalAPI(jSONObject3);
        com.tencent.mars.xlog.Log.i("BaseLiveTXPlayer", "http header set:%s", jSONObject3);
    }

    @Override // ls5.m
    public ls5.k getEventDetectorAdapter() {
        return this.f329807f;
    }

    public void h(java.lang.String commentScene, java.lang.String sessionId, long j17) {
        kotlin.jvm.internal.o.g(commentScene, "commentScene");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        try {
            boolean z17 = true;
            if (commentScene.length() == 0) {
                com.tencent.mars.xlog.Log.i("BaseLiveTXPlayer", "endExternalDataReport but commentScene is empty!");
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CommentScene=" + commentScene + ';');
            if (sessionId.length() <= 0) {
                z17 = false;
            }
            if (z17) {
                sb6.append("EnterSessionID=" + sessionId + ';');
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("LiveType=");
            sb7.append(j());
            sb7.append(";PlayerScene=");
            sb7.append(this.I);
            sb7.append(";IsSmallScale=");
            r45.p72 p72Var = this.P;
            sb7.append(p72Var != null ? p72Var.getInteger(5) : 0);
            sb7.append(';');
            sb6.append(sb7.toString());
            sb6.append("FirstFrameMS=" + j17 + ';');
            this.E.append(sb6.toString());
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("api", "reportExternalBusinessData");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("endReportData", sb6.toString());
            jSONObject.put("params", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            callExperimentalAPI(jSONObject3);
        } catch (org.json.JSONException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0187 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap i(android.graphics.Bitmap.Config r23, boolean r24, double r25) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mn0.y.i(android.graphics.Bitmap$Config, boolean, double):android.graphics.Bitmap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004e, code lost:
    
        if (r5.G != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j() {
        /*
            r5 = this;
            int r0 = r5.H
            r1 = 3
            r2 = 1
            if (r0 != r2) goto L7
            goto L51
        L7:
            mn0.l0 r0 = r5.F
            r3 = 72
            r4 = 0
            if (r0 == 0) goto L1f
            r45.nw1 r0 = r0.f329775f
            if (r0 == 0) goto L1f
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r3)
            r45.q12 r0 = (r45.q12) r0
            if (r0 == 0) goto L1f
            int r0 = r0.getInteger(r4)
            goto L20
        L1f:
            r0 = r4
        L20:
            if (r0 == r2) goto L2d
            r2 = 2
            if (r0 == r2) goto L2b
            if (r0 == r1) goto L29
        L27:
            r1 = r4
            goto L51
        L29:
            r1 = 5
            goto L51
        L2b:
            r1 = r2
            goto L51
        L2d:
            mn0.l0 r0 = r5.F
            if (r0 == 0) goto L47
            r45.nw1 r0 = r0.f329775f
            if (r0 == 0) goto L47
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r3)
            r45.q12 r0 = (r45.q12) r0
            if (r0 == 0) goto L47
            int r0 = r0.getInteger(r2)
            r1 = 8
            if (r0 != r1) goto L47
            r0 = r2
            goto L48
        L47:
            r0 = r4
        L48:
            if (r0 == 0) goto L4c
            r0 = 4
            return r0
        L4c:
            boolean r0 = r5.G
            if (r0 == 0) goto L27
            goto L2b
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mn0.y.j():int");
    }

    public final int k() {
        return ((java.lang.Number) this.B.getValue()).intValue();
    }

    public final mn0.k0 l() {
        return (mn0.k0) this.K.getValue();
    }

    public long m() {
        long j17;
        long j18 = this.R;
        if (j18 == 0) {
            j18 = c01.id.c();
            j17 = this.Q;
        } else {
            j17 = this.Q;
        }
        return j18 - j17;
    }

    public final mn0.i0 n() {
        return (mn0.i0) this.f329819u.getValue();
    }

    public com.tencent.rtmp.ui.TXCloudVideoView o() {
        java.lang.ref.WeakReference weakReference = this.f329809h;
        if (weakReference != null) {
            return (com.tencent.rtmp.ui.TXCloudVideoView) weakReference.get();
        }
        return null;
    }

    public com.tencent.rtmp.TXLivePlayer p() {
        return (com.tencent.rtmp.TXLivePlayer) this.X.getValue();
    }

    public final void q() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_live_audio_jbm_param_part1_android, -1);
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_live_audio_jbm_param_part2_android, -1);
        int i17 = (Ni <= -1 || Ni2 <= -1) ? 0 : (Ni / 10000000) % 10;
        com.tencent.mars.xlog.Log.i("WaveJBM:", "BaseLiveTXPlayer init wavejbm configs: Xparams:" + Ni + ',' + Ni2 + ",initWaveJbmFlag:" + i17 + ",initWavejbmMode:1,initWavejbmMinSpeed:0.5,initWavejbmMaxSpeed:1.5");
        V(i17, 1, 0.5f, 1.5f);
    }

    public void r(java.lang.String commentScene, java.lang.String sessionId, int i17, int i18) {
        long j17;
        kotlin.jvm.internal.o.g(commentScene, "commentScene");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        try {
            this.G = pm0.v.z(i17, 2);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("api", "reportExternalBusinessData");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CommentScene=" + commentScene + ";EnterSessionID=" + sessionId + ';');
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("LiveType=");
            sb7.append(j());
            sb7.append(";PlayerScene=");
            sb7.append(this.I);
            sb7.append(";IsSmallScale=");
            r45.p72 p72Var = this.P;
            sb7.append(p72Var != null ? p72Var.getInteger(5) : 0);
            sb7.append(';');
            sb6.append(sb7.toString());
            if (i17 != 0) {
                sb6.append("AnchorStatus=" + i17 + ';');
            }
            if (i18 > 0) {
                sb6.append("DelayMs=" + i18 + ';');
            }
            mn0.b bVar = (mn0.b) ((jz5.n) this.f329804J).getValue();
            if (bVar.f329700a <= 0) {
                j17 = 0;
            } else {
                j17 = bVar.f329701b;
                if (j17 <= 0) {
                    j17 = android.os.SystemClock.elapsedRealtime() - bVar.f329700a;
                    bVar.f329701b = j17;
                }
            }
            if (j17 > 0) {
                sb6.append("SwitchFrameMs=" + j17 + ';');
            }
            jSONObject2.put("intervalReportData", sb6.toString());
            jSONObject.put("params", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            callExperimentalAPI(jSONObject3);
        } catch (org.json.JSONException unused) {
        }
    }

    public void s(boolean z17) {
        ls5.f fVar = this.f329806e;
        com.tencent.mars.xlog.Log.i(fVar.b(), "BaseLiveTXPlayer pause: isInitiative=" + z17 + ", curPlayerUrl=" + this.f329815q);
        if (U()) {
            co0.y yVar = this.f329814p;
            if (yVar.f43744b != co0.u.f43737d) {
                com.tencent.mars.xlog.Log.w("VisitorPauseStateManager", "onPause: ignore, current state=" + yVar.f43744b);
            } else {
                com.tencent.mars.xlog.Log.i("VisitorPauseStateManager", "onPause");
                yVar.f43744b = co0.u.f43738e;
                co0.v vVar = yVar.f43743a;
                if (vVar != null) {
                    com.tencent.mars.xlog.Log.i("BaseLiveTXPlayer", "onExecuteTempPause");
                    mn0.c cVar = mn0.c.f329703f;
                    mn0.y yVar2 = ((mn0.j) vVar).f329761a;
                    yVar2.H(true, cVar);
                    com.tencent.mars.xlog.Log.i("BaseLiveTXPlayer", "pauseRender");
                    com.tencent.rtmp.TXLivePlayer p17 = yVar2.p();
                    nn0.i iVar = p17 instanceof nn0.i ? (nn0.i) p17 : null;
                    if (iVar != null) {
                        iVar.b();
                    }
                }
                com.tencent.mars.xlog.Log.i("VisitorPauseStateManager", "startPauseTimeoutTimer: timeout=3000ms");
                com.tencent.mm.sdk.platformtools.b4 b4Var = yVar.f43745c;
                if (b4Var != null) {
                    b4Var.d();
                }
                com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4("VisitorPauseTimeout", (com.tencent.mm.sdk.platformtools.a4) new co0.x(yVar), false);
                yVar.f43745c = b4Var2;
                b4Var2.c(3000L, 3000L);
            }
        } else {
            com.tencent.mars.xlog.Log.i(fVar.b(), "BaseLiveTXPlayer pause not support temp pause, use default logic");
            mn0.b0.C(this, false, false, false, 6, null);
        }
        this.f329811m = false;
        pm0.v.X(new mn0.i(this));
        if (z17) {
            fn0.g gVar = fn0.g.f264195a;
            if (fn0.g.f264196b != null) {
                dk2.ef.f233372a.c();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:419:0x0124, code lost:
    
        if (r15 == xn0.e.f455414h) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0199, code lost:
    
        if (r8 == null) goto L122;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0b0f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0108 A[Catch: Exception -> 0x0128, TryCatch #2 {Exception -> 0x0128, blocks: (B:55:0x00ed, B:61:0x0108, B:416:0x011e, B:418:0x0122), top: B:54:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021a A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(java.lang.String r92, int r93, r45.ka4 r94, int r95, r45.p72 r96, boolean r97, boolean r98) {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mn0.y.t(java.lang.String, int, r45.ka4, int, r45.p72, boolean, boolean):void");
    }

    @Override // mn0.b0
    public void v(android.view.Surface surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }

    public void w() {
        if (U()) {
            co0.y yVar = this.f329814p;
            yVar.getClass();
            com.tencent.mars.xlog.Log.i("VisitorPauseStateManager", "reset");
            com.tencent.mars.xlog.Log.i("VisitorPauseStateManager", "stopPauseTimeoutTimer");
            com.tencent.mm.sdk.platformtools.b4 b4Var = yVar.f43745c;
            if (b4Var != null) {
                b4Var.d();
            }
            yVar.f43745c = null;
            yVar.f43744b = co0.u.f43737d;
        }
        com.tencent.rtmp.TXLivePlayer p17 = p();
        nn0.x xVar = p17 instanceof nn0.x ? (nn0.x) p17 : null;
        if (xVar != null) {
            ((com.tencent.mm.live.core.core.player.FinderNewLivePlayerDetector) ms5.f.f331158a.b(com.tencent.mm.live.core.core.player.FinderNewLivePlayerDetector.class)).d(xVar.f338633e);
            ((nn0.p) xVar.f338584b).release();
        }
    }

    public void x(mn0.c0 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f329808g.remove(listener);
        com.tencent.mars.xlog.Log.i(this.f329806e.b(), "removeStateChangeListener listener: " + listener);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y() {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mn0.y.y():void");
    }

    @Override // mn0.b0
    public void z(com.tencent.rtmp.ui.TXCloudVideoView glRootView, int i17, int i18) {
        kotlin.jvm.internal.o.g(glRootView, "glRootView");
    }
}
