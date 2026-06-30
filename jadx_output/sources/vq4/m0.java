package vq4;

/* loaded from: classes14.dex */
public final class m0 implements vq4.z {
    public boolean A;
    public com.tencent.mm.plugin.voip.ui.f B;
    public boolean C;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f439337a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.SensorController f439338b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.s7 f439339c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f439341e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f439342f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f439344h;

    /* renamed from: i, reason: collision with root package name */
    public long f439345i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f439346j;

    /* renamed from: m, reason: collision with root package name */
    public vq4.o0 f439349m;

    /* renamed from: n, reason: collision with root package name */
    public final f25.f f439350n;

    /* renamed from: o, reason: collision with root package name */
    public f25.m0 f439351o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f439352p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f439353q;

    /* renamed from: r, reason: collision with root package name */
    public cv.v0 f439354r;

    /* renamed from: s, reason: collision with root package name */
    public cv.v0 f439355s;

    /* renamed from: t, reason: collision with root package name */
    public cv.v0 f439356t;

    /* renamed from: u, reason: collision with root package name */
    public final xm1.o f439357u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f439358v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f439359w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f439360x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f439361y;

    /* renamed from: z, reason: collision with root package name */
    public rq4.t f439362z;

    /* renamed from: d, reason: collision with root package name */
    public long f439340d = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f439343g = -1;

    /* renamed from: k, reason: collision with root package name */
    public long f439347k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f439348l = -1;

    public m0() {
        vq4.i0 i0Var = new vq4.i0(this);
        this.f439350n = i0Var;
        this.f439353q = vq4.b0.f();
        this.f439357u = new xm1.o(new vq4.e0(this));
        f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.h0.f259097c, i0Var);
        this.f439351o = m96;
        if (m96 != null && ((g25.e) m96).f267980c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIP.VoIPAudioManager", "requestAudioFocus: gain focus");
            k(false);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIP.VoIPAudioManager", "requestAudioFocus: not gain focus");
            k(true);
        }
        this.f439337a = new com.tencent.mm.sdk.platformtools.n3("mSensorHandler");
        this.f439362z = new rq4.t();
        this.f439346j = b();
        this.A = true;
    }

    public int a() {
        cv.v0 v0Var;
        if (!mx3.f0.h()) {
            cv.v0 v0Var2 = this.f439356t;
            if (v0Var2 != null) {
                return v0Var2.f222516a;
            }
            return -1;
        }
        if (this.C) {
            v0Var = this.f439354r;
            if (v0Var == null) {
                return -1;
            }
        } else {
            v0Var = this.f439355s;
            if (v0Var == null) {
                return -1;
            }
        }
        return v0Var.f222516a;
    }

    public boolean b() {
        this.f439357u.getClass();
        return ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Vi();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if ((r0 != null && r0.f222516a == 2) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0085, code lost:
    
        if ((r0 != null && r0.f222516a == 2) == false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(boolean r12) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vq4.m0.c(boolean):void");
    }

    public void d() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "end");
        bundle.putInt("streamType", ym1.f.f463134h.g(((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Vi()));
        ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Bi(mx3.i.VOIP, bundle);
    }

    public void e(java.lang.String username, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(username, "username");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("isVideoCall", !z17 ? 1 : 0);
        bundle.putString(dm.i4.COL_USERNAME, username);
        bundle.putBoolean("isOutCall", z18);
        int i17 = this.f439348l;
        boolean z19 = false;
        if (i17 != -1 ? i17 == 1 : !(z18 && !z17)) {
            z19 = true;
        }
        bundle.putBoolean("isSpeakOn", z19);
        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "start");
        com.tencent.mm.plugin.voip.model.h2 Bi = gq4.v.Bi();
        long j17 = Bi != null ? Bi.f176580w : 0L;
        long currentTimeMillis = j17 > 0 ? java.lang.System.currentTimeMillis() - j17 : 0L;
        bundle.putLong("seekStartMs", currentTimeMillis);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIP.VoIPAudioManager", "continuePlayStartRing username:" + username + ", isVideoCall:" + z17 + ", isOutCall:" + z18 + ", seekStart:" + currentTimeMillis);
        this.C = ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Bi(mx3.i.VOIP, bundle);
    }

    public void f() {
        this.f439357u.b();
        f25.m0 m0Var = this.f439351o;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        this.f439355s = null;
        this.f439354r = null;
        this.f439351o = null;
        j();
    }

    public final void g() {
        java.lang.String r17;
        java.lang.String str;
        if (this.f439349m == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIP.VoIPAudioManager", "current state machine not init,wait connect to conntinue play");
            return;
        }
        h();
        vq4.o0 o0Var = this.f439349m;
        if (o0Var != null) {
            if (!this.A || !vq4.n0.e(o0Var.f439369a)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VoIP.VoIPAudioManager", "not allow to play tts cause " + this.A + " && " + vq4.n0.e(o0Var.f439369a));
                return;
            }
            this.A = false;
            if (this.f439359w || !nq4.f.f339014a.a()) {
                if (!this.f439359w) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.VoIP.VoIPAudioManager", "direct play ringtone nor tts cause not support tts");
                }
                java.lang.String str2 = gq4.v.Bi().f176558a.f176431u;
                if (str2 == null) {
                    return;
                }
                e(str2, gq4.v.Bi().f176558a.f176432v, gq4.v.Bi().f176558a.f176433w);
                return;
            }
            java.lang.String str3 = gq4.v.Bi().f176558a.f176431u;
            if (str3 == null) {
                return;
            }
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str3);
            boolean z17 = gq4.v.Bi().f176558a.f176432v;
            boolean z18 = gq4.v.Bi().f176558a.f176433w;
            if (!ip.b.a()) {
                r17 = z17 ? i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.j4t) : i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.j4v);
            } else if (z17) {
                r17 = e17 + i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.j4s);
            } else {
                r17 = e17 + i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.j4u);
            }
            java.lang.String str4 = r17;
            if (ip.b.a()) {
                if (z17) {
                    str = "video_" + str3 + '_' + e17 + "_showDetail";
                } else {
                    str = "voice_" + str3 + '_' + e17 + "_showDetail";
                }
            } else if (z17) {
                str = "video_" + str3 + '_' + e17 + "_hideDetail";
            } else {
                str = "voice_" + str3 + '_' + e17 + "_hideDetail";
            }
            java.lang.String str5 = str;
            nq4.e eVar = nq4.e.f339008a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            eVar.c(context, new vq4.k0(str5, str4, this, str3, z17, z18));
        }
    }

    public final void h() {
        vq4.o0 o0Var = this.f439349m;
        if (o0Var != null) {
            if (!vq4.n0.h(o0Var.f439369a)) {
                int i17 = o0Var.f439369a;
                if (!(258 == i17 || 259 == i17 || 4 == i17 || 5 == i17)) {
                    if (i17 == 262 || i17 == 8) {
                        nq4.f.f339014a.d();
                        return;
                    } else if (this.f439359w) {
                        nq4.f.f339014a.f();
                        return;
                    } else {
                        nq4.f.f339014a.e();
                        return;
                    }
                }
            }
            nq4.f.f339014a.c();
        }
    }

    public void i(com.tencent.mm.plugin.voip.ui.f fVar) {
        com.tencent.mm.plugin.voip.ui.f fVar2;
        cv.v0 v0Var;
        this.B = fVar;
        if (mx3.f0.h()) {
            int i17 = -1;
            if (!this.C ? (v0Var = this.f439355s) != null : (v0Var = this.f439354r) != null) {
                i17 = v0Var.f222516a;
            }
            com.tencent.mm.plugin.voip.ui.f fVar3 = this.B;
            if (fVar3 != null) {
                fVar3.K(i17);
            }
        } else {
            cv.v0 v0Var2 = this.f439356t;
            if (v0Var2 != null && (fVar2 = this.B) != null) {
                fVar2.i2(v0Var2);
            }
        }
        com.tencent.mm.plugin.voip.ui.f fVar4 = this.B;
        if (fVar4 != null) {
            fVar4.q2(this.f439357u.a());
        }
    }

    public void j() {
        java.lang.Class cls;
        int i17;
        java.lang.String feedId;
        int i18;
        java.lang.String feedId2;
        if (this.f439362z != null) {
            this.C = false;
            nx3.a wi6 = ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).wi();
            if (kotlin.jvm.internal.o.b(rq4.q.f399079m, "") && wi6 != null) {
                rq4.q.f399079m = java.lang.String.valueOf(wi6.f341345b);
                rq4.q.f399081o = wi6.f341349f;
                java.lang.String mMusicSid = wi6.f341347d;
                kotlin.jvm.internal.o.f(mMusicSid, "mMusicSid");
                rq4.q.f399087u = mMusicSid;
                java.lang.String mFinderObjectId = wi6.f341348e;
                kotlin.jvm.internal.o.f(mFinderObjectId, "mFinderObjectId");
                rq4.q.f399084r = mFinderObjectId;
                rq4.q.f399078l = java.lang.String.valueOf(wi6.f341346c);
                rq4.q.f399083q = wi6.f341350g;
                rq4.q.f399085s = new jz5.l(java.lang.Integer.valueOf(wi6.f341352i), java.lang.Integer.valueOf(wi6.f341353j));
                rq4.q.f399086t = wi6.f341354k;
                rq4.q.f399088v = wi6.f341357n;
                java.lang.String mPlayErrorMessage = wi6.f341358o;
                kotlin.jvm.internal.o.f(mPlayErrorMessage, "mPlayErrorMessage");
                rq4.q.f399082p = mPlayErrorMessage;
            }
            rq4.t tVar = this.f439362z;
            if (tVar != null) {
                tVar.f399102b = rq4.q.f399080n;
            }
            if (this.f439359w) {
                java.lang.String mUsername = wi6.f341351h;
                kotlin.jvm.internal.o.f(mUsername, "mUsername");
                java.lang.String mMusicSid2 = wi6.f341347d;
                java.lang.String mFinderObjectId2 = wi6.f341348e;
                java.lang.String str = (mFinderObjectId2 == null || kotlin.jvm.internal.o.b(mFinderObjectId2, "0")) ? mMusicSid2 : mFinderObjectId2;
                kotlin.jvm.internal.o.d(str);
                mx3.b0.g(mUsername, str);
                rq4.t tVar2 = this.f439362z;
                if (tVar2 != null) {
                    boolean z17 = this.f439360x;
                    java.lang.String mUsername2 = wi6.f341351h;
                    kotlin.jvm.internal.o.f(mUsername2, "mUsername");
                    if (tVar2.f399101a == 0) {
                        tVar2.f399101a = wi6.f341345b;
                        kotlin.jvm.internal.o.f(mMusicSid2, "mMusicSid");
                        tVar2.f399104d = mMusicSid2;
                        kotlin.jvm.internal.o.f(mFinderObjectId2, "mFinderObjectId");
                        tVar2.f399103c = mFinderObjectId2;
                        tVar2.f399105e = wi6.f341344a;
                        int i19 = tVar2.f399107g;
                        long j17 = tVar2.f399108h;
                        int i27 = z17 ? 2 : 1;
                        if (kotlin.jvm.internal.o.b(tVar2.f399104d, "0")) {
                            i18 = kotlin.jvm.internal.o.b(tVar2.f399103c, "0") ? 1 : 2;
                        }
                        if (i18 == 1) {
                            feedId2 = tVar2.f399104d;
                        } else if (i18 == 2) {
                            feedId2 = tVar2.f399103c;
                        }
                        int i28 = tVar2.f399105e ? 2 : 1;
                        boolean z18 = tVar2.f399102b;
                        long j18 = tVar2.f399101a / 1000;
                        kotlin.jvm.internal.o.g(feedId2, "feedId");
                        com.tencent.mm.autogen.mmdata.rpt.RingtoneCallingReportStruct ringtoneCallingReportStruct = new com.tencent.mm.autogen.mmdata.rpt.RingtoneCallingReportStruct();
                        cls = mx3.j.class;
                        ringtoneCallingReportStruct.f60055g = ringtoneCallingReportStruct.b("feedId", feedId2, true);
                        int i29 = i27;
                        ringtoneCallingReportStruct.f60056h = i18;
                        ringtoneCallingReportStruct.f60057i = i28;
                        ringtoneCallingReportStruct.f60059k = z18 ? 1L : 2L;
                        ringtoneCallingReportStruct.f60060l = j18;
                        ringtoneCallingReportStruct.f60058j = ringtoneCallingReportStruct.b("toUserName", mUsername2, true);
                        ringtoneCallingReportStruct.f60053e = i19;
                        ringtoneCallingReportStruct.f60054f = j17;
                        ringtoneCallingReportStruct.f60052d = i29;
                        ringtoneCallingReportStruct.k();
                        tVar2.f399101a = 0L;
                        tVar2.f399102b = false;
                        tVar2.f399103c = "0";
                        tVar2.f399104d = "0";
                        tVar2.f399105e = false;
                        tVar2.f399107g = 0;
                        tVar2.f399108h = 0L;
                    }
                }
                cls = mx3.j.class;
            } else {
                cls = mx3.j.class;
                if (tVar != null) {
                    boolean z19 = this.f439360x;
                    java.lang.String mUsername3 = wi6.f341351h;
                    kotlin.jvm.internal.o.f(mUsername3, "mUsername");
                    if (tVar.f399101a == 0 && tVar.f399107g != 0 && tVar.f399108h != 0) {
                        tVar.f399101a = wi6.f341345b;
                        java.lang.String mMusicSid3 = wi6.f341347d;
                        kotlin.jvm.internal.o.f(mMusicSid3, "mMusicSid");
                        tVar.f399104d = mMusicSid3;
                        java.lang.String mFinderObjectId3 = wi6.f341348e;
                        kotlin.jvm.internal.o.f(mFinderObjectId3, "mFinderObjectId");
                        tVar.f399103c = mFinderObjectId3;
                        tVar.f399105e = wi6.f341344a;
                        tVar.f399106f = wi6.f341355l;
                        int i37 = tVar.f399107g;
                        long j19 = tVar.f399108h;
                        int i38 = z19 ? 2 : 1;
                        int i39 = !kotlin.jvm.internal.o.b(tVar.f399104d, "0") ? 1 : !kotlin.jvm.internal.o.b(tVar.f399103c, "0") ? 2 : 3;
                        if (i39 != 1) {
                            i17 = 2;
                            feedId = i39 != 2 ? "0" : tVar.f399103c;
                        } else {
                            i17 = 2;
                            feedId = tVar.f399104d;
                        }
                        int i47 = tVar.f399105e ? i17 : 1;
                        long j27 = tVar.f399101a / 1000;
                        boolean z27 = tVar.f399106f;
                        kotlin.jvm.internal.o.g(feedId, "feedId");
                        com.tencent.mm.autogen.mmdata.rpt.RingTonePlaySoundReportStruct ringTonePlaySoundReportStruct = new com.tencent.mm.autogen.mmdata.rpt.RingTonePlaySoundReportStruct();
                        ringTonePlaySoundReportStruct.f60034i = i38;
                        ringTonePlaySoundReportStruct.f60031f = i39;
                        ringTonePlaySoundReportStruct.f60029d = i37;
                        ringTonePlaySoundReportStruct.f60036k = j19;
                        ringTonePlaySoundReportStruct.f60030e = ringTonePlaySoundReportStruct.b("feedid", feedId, true);
                        ringTonePlaySoundReportStruct.f60032g = i47;
                        ringTonePlaySoundReportStruct.f60033h = ringTonePlaySoundReportStruct.b("tousername", mUsername3, true);
                        ringTonePlaySoundReportStruct.f60035j = j27;
                        ringTonePlaySoundReportStruct.f60037l = z27 ? 1 : 2;
                        ringTonePlaySoundReportStruct.f60038m = wi6.f341356m ? 1L : 2L;
                        ringTonePlaySoundReportStruct.k();
                        tVar.f399101a = 0L;
                        tVar.f399102b = false;
                        tVar.f399103c = "0";
                        tVar.f399104d = "0";
                        tVar.f399105e = false;
                        tVar.f399107g = 0;
                        tVar.f399108h = 0L;
                    }
                }
            }
            this.f439362z = null;
        } else {
            cls = mx3.j.class;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "close");
        ((mx3.u) ((mx3.j) i95.n0.c(cls))).Bi(mx3.i.VOIP, bundle);
    }

    public final void k(boolean z17) {
        if (j65.e.b() && j65.e.g()) {
            yx3.v Ai = ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Ai();
            if (Ai != null) {
                Ai.f467948h = z17;
                yx3.k kVar = Ai.f467943c;
                if (kVar != null) {
                    kVar.i(z17);
                }
            }
            com.tencent.mm.plugin.voip.model.i1 i1Var = gq4.v.Bi().f176558a.f176411a.A;
            i1Var.R = z17;
            if (i1Var.f176646a != null) {
                i1Var.f176646a.R = z17;
            }
        }
    }

    public final void l(int i17, boolean z17) {
        if (i17 == 3 || i17 == 4) {
            this.f439348l = a();
        }
        this.f439357u.c(i17, z17);
    }

    public boolean m(cv.v0 info) {
        kotlin.jvm.internal.o.g(info, "info");
        if (mx3.f0.h()) {
            if (this.C) {
                this.f439355s = info;
                this.f439354r = info;
            } else {
                this.f439355s = info;
            }
        }
        this.f439357u.c(info.f222516a, true);
        return true;
    }

    public void n() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f439337a;
        if (n3Var != null) {
            n3Var.post(new vq4.l0(this));
        }
    }
}
