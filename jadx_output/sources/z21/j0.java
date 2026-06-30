package z21;

/* loaded from: classes12.dex */
public final class j0 {
    public int A;
    public boolean B;
    public int C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public int G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.String f469617J;
    public boolean K;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.y f469618a;

    /* renamed from: b, reason: collision with root package name */
    public final e70.a0 f469619b;

    /* renamed from: c, reason: collision with root package name */
    public final z21.a0 f469620c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.coroutines.LifecycleScope f469621d;

    /* renamed from: e, reason: collision with root package name */
    public final z21.b f469622e;

    /* renamed from: f, reason: collision with root package name */
    public z21.d f469623f;

    /* renamed from: g, reason: collision with root package name */
    public int f469624g;

    /* renamed from: h, reason: collision with root package name */
    public final int f469625h;

    /* renamed from: i, reason: collision with root package name */
    public final int f469626i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f469627j;

    /* renamed from: k, reason: collision with root package name */
    public int f469628k;

    /* renamed from: l, reason: collision with root package name */
    public int f469629l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f469630m;

    /* renamed from: n, reason: collision with root package name */
    public int f469631n;

    /* renamed from: o, reason: collision with root package name */
    public volatile long f469632o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f469633p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f469634q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f469635r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f469636s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f469637t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashMap f469638u;

    /* renamed from: v, reason: collision with root package name */
    public long f469639v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f469640w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f469641x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f469642y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f469643z;

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0183, code lost:
    
        if (r0 != null) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j0(androidx.lifecycle.y r20, z21.b r21, java.lang.String r22, z21.a0 r23, e70.a0 r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z21.j0.<init>(androidx.lifecycle.y, z21.b, java.lang.String, z21.a0, e70.a0, int, int):void");
    }

    public final com.tencent.mm.protobuf.g a() {
        int c17 = j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigWebSearchVoiceASRExptArg());
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputController", "[VoiceASR] GlobalSearch exptArg=" + c17);
        if (c17 == 0) {
            return null;
        }
        r45.k17 k17Var = new r45.k17();
        k17Var.f378315d = c17;
        return com.tencent.mm.protobuf.g.b(k17Var.toByteArray());
    }

    public final void b(int i17) {
        fp.k.c();
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        z21.a0 a0Var = this.f469620c;
        if (a0Var != null) {
            a0Var.c(i17);
        }
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputController", "doLastScene isAllStop:%s, isForceStop:%s", java.lang.Boolean.valueOf(this.I), java.lang.Boolean.valueOf(this.f469636s));
        z21.d dVar = this.f469623f;
        if (dVar != null) {
            java.lang.String voiceId = this.f469635r;
            kotlin.jvm.internal.o.g(voiceId, "voiceId");
            k23.v0.x(((k23.t0) dVar).f303694a, 41, "{\"voiceId\":\"" + voiceId + "\"}", null, 4, null);
        }
        if (this.I || this.f469636s) {
            return;
        }
        this.I = true;
        m();
        z21.a0 a0Var = this.f469620c;
        z21.z h17 = a0Var != null ? a0Var.h(this.G) : null;
        if (h17 != null) {
            this.H = 0;
            if (!this.D) {
                com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
                if (lifecycleScope != null) {
                    v65.i.b(lifecycleScope, null, new z21.e0(h17, this, null), 1, null);
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputController", "real doLastScene  isIlink voiceId:" + h17.f469702a + ", voiceFileMarkEnd:" + h17.f469705d);
            j();
            if (this.f469640w) {
                return;
            }
            g();
        }
    }

    public final boolean d() {
        z21.a0 a0Var = this.f469620c;
        return (a0Var != null ? a0Var.g() : false) || this.f469631n != 0;
    }

    public final boolean e() {
        ((ku5.t0) ku5.t0.f312615d).A("upload_voice");
        if ((d() && this.f469633p) || this.f469636s) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputController", "preDoScene return");
            return false;
        }
        z21.a0 a0Var = this.f469620c;
        z21.z h17 = a0Var != null ? a0Var.h(this.G) : null;
        if (h17 == null) {
            f(this.f469629l * 2);
            return true;
        }
        long min = (long) java.lang.Math.min(com.tencent.mm.vfs.w6.k(this.f469627j), h17.f469705d);
        if (min <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceInputController", "preDoScene nowMarkLen <= 0 read failed :%s", this.f469627j);
            fp.k.a();
            this.H = 0;
            c();
            n(3, -1, "ReadFileLengthError", 0);
            return false;
        }
        int i17 = (int) (min - this.G);
        this.H = i17;
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputController", "preDoScene canReadLen < 0 length:%s ", java.lang.Integer.valueOf(i17));
            fp.k.a();
            f(this.f469629l * 2);
            return false;
        }
        if (this.H >= 500 || h17.f469706e <= 5 || this.D) {
            f(this.f469629l);
        } else {
            f(this.f469629l * 2);
        }
        return true;
    }

    public final void f(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputController", "pushVoiceInput");
        pm0.v.Q("upload_voice", false, new z21.f0(this), j17, 2, null);
    }

    public final void g() {
        e70.a0 a0Var;
        if (!this.D || (a0Var = this.f469619b) == null) {
            return;
        }
        ((d83.t0) a0Var).e(this.f469617J);
    }

    public final void h() {
        java.lang.String str;
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        if (!((i17 == 788529167 || i17 == 788529166) || z65.c.a()) || (str = this.f469627j) == null || this.B) {
            return;
        }
        this.B = true;
        java.lang.String str2 = "voice_to_txt/" + this.f469635r;
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        com.tencent.mm.vfs.r6 h07 = lp0.b.h0(str2);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(h07, this.f469635r + (this.E ? ".opus" : ".silk"));
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(h07, this.f469635r + ".txt");
        r6Var.o();
        long d17 = com.tencent.mm.vfs.w6.d(str, r6Var.o(), false);
        java.lang.String str3 = this.f469630m;
        if (str3 != null && str3.length() > 0) {
            java.lang.String o17 = r6Var2.o();
            java.lang.String str4 = this.f469630m;
            java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
            kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
            byte[] bytes = str4.getBytes(UTF_8);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            com.tencent.mm.vfs.w6.S(o17, bytes, 0, bytes.length);
        }
        if (d17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceInputController", "saveVoiceFile failed ret = %s", java.lang.Long.valueOf(d17));
        }
    }

    public final void i(int i17) {
        this.C = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputController", "setEncodeType type:" + i17);
    }

    public final void j() {
        int i17;
        java.lang.Long l17;
        com.tencent.mm.protobuf.g a17;
        r45.o17 o17Var = new r45.o17();
        o17Var.f381828d = o45.wf.f343029g;
        o17Var.f381829e = com.tencent.mm.protobuf.g.a(wo.q.f447780a, com.tencent.mapsdk.internal.rv.f51270c);
        o17Var.f381831g = this.f469625h;
        z21.a0 a0Var = this.f469620c;
        jz5.f0 f0Var = null;
        z21.z h17 = a0Var != null ? a0Var.h(this.G) : null;
        if (h17 == null || this.f469634q) {
            o17Var.f381830f = this.f469640w ? this.f469635r : "0";
            o17Var.f381832h = com.tencent.mm.protobuf.g.b(new byte[0]);
            o17Var.f381833i = this.C;
            o17Var.f381834m = true;
            o17Var.f381835n = 0;
            this.f469638u.put(0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputController", "send empty isSendEmpty:" + this.f469634q + ", isResultContinue:" + this.f469640w + ", voiceId:" + o17Var.f381830f);
        } else {
            h17.f469703b = true;
            if (this.I) {
                h17.f469704c = true;
                o17Var.f381832h = com.tencent.mm.protobuf.g.b(new byte[0]);
                com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputController", "send last packet");
            } else {
                int i18 = this.H;
                int i19 = this.f469628k;
                if (i18 > i19) {
                    this.H = i19;
                    h17.f469704c = false;
                } else if (i18 <= i19 && (h17.f469705d != Integer.MAX_VALUE || this.f469633p || this.f469640w)) {
                    h17.f469704c = true;
                }
                o17Var.f381832h = com.tencent.mm.protobuf.g.b(com.tencent.mm.vfs.w6.N(this.f469627j, this.G, this.H));
            }
            o17Var.f381830f = h17.f469702a;
            o17Var.f381834m = h17.f469704c;
            o17Var.f381833i = this.C;
            int i27 = h17.f469706e + 1;
            h17.f469706e = i27;
            o17Var.f381835n = i27;
            int i28 = this.f469625h;
            if (i28 == 20) {
                r45.s17 s17Var = new r45.s17();
                java.lang.String str = this.f469641x;
                if (str != null) {
                    s17Var.f385403d = str;
                }
                o17Var.f381836o = com.tencent.mm.protobuf.g.b(s17Var.toByteArray());
            } else if (i28 == 15) {
                r45.l17 l17Var = new r45.l17();
                java.lang.String str2 = this.f469641x;
                if (str2 != null) {
                    l17Var.f379078d = str2;
                }
                l17Var.f379080f = this.F;
                l17Var.f379081g = this.f469642y;
                l17Var.f379082h = this.f469643z;
                o17Var.f381836o = com.tencent.mm.protobuf.g.b(l17Var.toByteArray());
            } else if (i28 == 33) {
                r45.j17 j17Var = new r45.j17();
                java.lang.String str3 = this.f469641x;
                if (str3 != null) {
                    j17Var.f377503d = str3;
                }
                o17Var.f381836o = com.tencent.mm.protobuf.g.b(j17Var.toByteArray());
            } else if (i28 == 39) {
                r45.n17 n17Var = new r45.n17();
                java.lang.String str4 = this.f469641x;
                if (str4 != null) {
                    n17Var.f380998d = str4;
                }
                o17Var.f381836o = com.tencent.mm.protobuf.g.b(n17Var.toByteArray());
            } else if (i28 == 23 && (a17 = a()) != null) {
                o17Var.f381836o = a17;
            }
            java.lang.String voice_id = o17Var.f381830f;
            kotlin.jvm.internal.o.f(voice_id, "voice_id");
            this.f469635r = voice_id;
            this.f469638u.put(java.lang.Integer.valueOf(o17Var.f381835n), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputController", " goNewIlink voice_id: %s, is_end:%s, seq:%s", o17Var.f381830f, java.lang.Boolean.valueOf(o17Var.f381834m), java.lang.Integer.valueOf(o17Var.f381835n));
            int length = this.G + o17Var.f381832h.f192156a.length;
            this.G = length;
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputController", "clientId %s oldReadOffset %s", h17.f469702a, java.lang.Integer.valueOf(length));
            if (h17.f469706e == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputController", "time flee send seq 1 time = %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
            java.lang.System.currentTimeMillis();
        }
        boolean z17 = o17Var.f381834m;
        com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(o17Var.toByteArray());
        e70.a0 a0Var2 = this.f469619b;
        if (a0Var2 != null) {
            java.lang.String streamId = this.f469617J;
            d83.t0 t0Var = (d83.t0) a0Var2;
            kotlin.jvm.internal.o.g(streamId, "streamId");
            t0Var.c();
            d83.h0 h0Var = (d83.h0) t0Var.f227023c.get(streamId);
            if (h0Var != null) {
                h0Var.a(true);
                com.tencent.wechat.aff.ilink_stream.a0 a0Var3 = new com.tencent.wechat.aff.ilink_stream.a0();
                a0Var3.f217218d = streamId;
                boolean[] zArr = a0Var3.f217222h;
                zArr[1] = true;
                a0Var3.f217219e = h0Var.f226970a;
                zArr[2] = true;
                a0Var3.f217221g = z17;
                zArr[4] = true;
                a0Var3.f217220f = b17;
                zArr[3] = true;
                int length2 = b17.f192156a.length;
                if (t0Var.f227022b == null) {
                    synchronized (t0Var) {
                        if (t0Var.f227022b == null) {
                            t0Var.f227022b = com.tencent.wechat.aff.ilink_stream.p.f217294b.d(t0Var.f227021a);
                            t0Var.f227027g.set(false);
                        }
                    }
                }
                d83.t0.a(t0Var);
                com.tencent.wechat.aff.ilink_stream.o oVar = t0Var.f227022b;
                if (oVar != null) {
                    oVar.d(a0Var3);
                    f0Var = jz5.f0.f302826a;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ILinkStreamController", "unreachable! " + com.tencent.mm.sdk.platformtools.z3.b(true));
                }
            }
        }
        int i29 = this.f469625h;
        if ((i29 == 15 || i29 == 17) && (i17 = o17Var.f381835n) > 0) {
            java.util.HashMap hashMap = this.f469638u;
            if (hashMap == null || (l17 = (java.lang.Long) hashMap.get(java.lang.Integer.valueOf(i17))) == null) {
                l17 = 0L;
            }
            long longValue = l17.longValue();
            b31.l lVar = b31.l.f17613a;
            long j17 = i17;
            java.lang.String voice_id2 = o17Var.f381830f;
            kotlin.jvm.internal.o.f(voice_id2, "voice_id");
            long j18 = this.f469639v;
            java.lang.String streamId2 = this.f469617J;
            kotlin.jvm.internal.o.g(streamId2, "streamId");
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("stt_req", java.lang.Long.valueOf(j17));
            linkedHashMap.put("voiceid", voice_id2);
            linkedHashMap.put("ilink_client_streamid", streamId2);
            linkedHashMap.put("stt_req_send_ts", java.lang.Long.valueOf(longValue));
            linkedHashMap.put("stt_click_ts", java.lang.Long.valueOf(j18));
            linkedHashMap.put("stt_trig_scenes", java.lang.Integer.valueOf(this.f469626i));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("stt_req_return_upward", linkedHashMap, 35963);
        }
    }

    public final void k() {
        if (this.D) {
            j();
            return;
        }
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = this.f469621d;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new z21.g0(this, null), 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z21.j0.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void m() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputController", fp.k.c());
        ((ku5.t0) ku5.t0.f312615d).A("upload_voice");
        this.f469636s = true;
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = this.f469621d;
        if (lifecycleScope != null) {
            lifecycleScope.onDestroy();
        }
    }

    public final void n(int i17, int i18, java.lang.String str, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputController", "updateVoiceInputResult errorType = %s, errorCode = %s, errMsg = %s, ret = %s, isBackendEndFlag():%s, endFlag:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(d()), java.lang.Integer.valueOf(this.f469631n));
        if (i17 == 0 && i18 == 0 && d()) {
            this.f469632o = android.os.SystemClock.elapsedRealtime();
        }
        d75.b.g(new z21.i0(i17, i18, this, str, i19));
    }
}
