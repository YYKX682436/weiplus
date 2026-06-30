package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class a extends tz2.e {
    public java.lang.String F;
    public java.lang.String G;
    public byte[] I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f137113J;
    public java.lang.String K;
    public float L;
    public java.lang.String M;
    public final java.lang.String P;
    public final java.lang.String Q;
    public java.lang.String R;
    public int S;
    public long T;
    public k72.v U;
    public java.lang.String H = "";
    public boolean N = false;

    public a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = com.tencent.mm.plugin.flash.r.f137249a;
        sb6.append(str);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        sb6.append(".mp4");
        this.P = sb6.toString();
        this.Q = str + android.os.SystemClock.elapsedRealtime() + "_encrypt";
        this.R = "";
        this.S = 0;
        this.T = 0L;
    }

    @Override // tz2.e, tz2.u
    public void a(android.widget.TextView textView, java.lang.String str) {
        boolean z17;
        try {
            if (java.lang.System.currentTimeMillis() - this.f423274s >= 1000) {
                this.f423274s = java.lang.System.currentTimeMillis();
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                java.lang.String c17 = wz2.a.c(textView.getContext(), str);
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionManager", "updateTipText res:%s tip:%s", str, c17);
                if (android.text.TextUtils.isEmpty(c17)) {
                    return;
                }
                textView.setText(c17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // tz2.e, tz2.u
    public void b(android.widget.TextView textView) {
        textView.setText(this.R);
    }

    @Override // tz2.e, tz2.u
    public void c(android.content.Intent intent, android.app.Activity activity) {
        super.c(intent, activity);
        this.f423263e = intent.getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.F = intent.getStringExtra("package");
        this.G = intent.getStringExtra("packageSign");
        this.N = intent.getBooleanExtra("needContract", false);
        this.H = intent.getStringExtra("otherVerifyTitle");
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionManager", "[%s]intent data, packageName:%s packageSign:%s needSignContract:%s otherVerifyTitle:%s", com.tencent.mm.plugin.flash.action.a.class.getSimpleName(), this.F, this.G, java.lang.Boolean.valueOf(this.N), this.H);
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean d17 = j35.u.d(activity, "android.permission.ACCESS_FINE_LOCATION", false);
        if (d17) {
            if (this.f423281z == null) {
                ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                this.f423281z = i11.h.e();
            }
            if (this.A == null) {
                this.A = new tz2.d(this);
            }
            ((i11.h) this.f423281z).l(this.A, true, false, false);
            com.tencent.mm.plugin.report.service.b1.f(22, 10);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "startGetLocation checkLocation: %s and ignore", java.lang.Boolean.valueOf(d17));
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_paysec_spam_report, false)) {
            k72.v vVar = new k72.v();
            this.U = vVar;
            vVar.a();
        }
    }

    @Override // tz2.e
    public int e() {
        return 16;
    }

    @Override // tz2.e, tz2.u
    public void onNetworkRequestEvent(java.lang.String str, java.lang.String str2, java.util.HashMap hashMap, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        java.lang.String str3 = this.Q;
        java.lang.String str4 = this.P;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionManager", "onNetworkRequestEvent  url:%s requestContent:%s requestHeaders:%s", str, str2, hashMap);
        this.f423262d = iYtSDKKitNetResponseParser;
        if (str.contains("wechat_face_config")) {
            vz2.c.j("reqCfg");
            i();
            vz2.b.d(16);
            j72.a aVar = new j72.a(this.f423263e, this.F, this.G);
            gm0.j1.d().a(2696, this);
            gm0.j1.d().g(aVar);
            return;
        }
        if (str.contains("wechat_face_verify")) {
            try {
                l();
                vz2.b.e(16);
                java.lang.String optString = new org.json.JSONObject(str2).optString("action_video");
                com.tencent.mm.vfs.w6.h(str4);
                com.tencent.mm.vfs.w6.h(str3);
                com.tencent.mm.vfs.w6.R(str4, android.util.Base64.decode(optString, 0));
                p(str4);
                q(this.f137113J, str4, str3);
                com.tencent.mm.vfs.w6.h(str4);
                o(str3, false);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e17, "action parse verify body error!!!", new java.lang.Object[0]);
            }
        }
    }

    @Override // tz2.e, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionManager", "onSceneEnd：errType %s ， errCode %s ，errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (!(m1Var instanceof j72.a)) {
            if (m1Var instanceof j72.c) {
                gm0.j1.d().q(2726, this);
                r45.mf3 mf3Var = ((j72.c) m1Var).f298044g;
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionManager", "scene is getFaceCheckResult get face check result, ret_code: %s, ret_msg: %s serialId:%s retry:%s", java.lang.Integer.valueOf(mf3Var.f380441d), mf3Var.f380442e, mf3Var.f380445h, java.lang.Integer.valueOf(mf3Var.f380444g));
                vz2.c.k("rspVerify", java.lang.Integer.valueOf(mf3Var.f380441d));
                vz2.c.c().f56208j = mf3Var.f380441d;
                java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("countFace", this.S);
                    jSONObject.put("err_code", mf3Var.f380441d);
                    if (i17 == 0 && i18 == 0) {
                        vz2.b.c(16);
                        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, mf3Var.f380441d);
                        jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, mf3Var.f380441d);
                        jSONObject.put("errormsg", mf3Var.f380442e);
                        jSONObject.put("err_msg", "ok");
                        jSONObject.put("token", mf3Var.f380443f);
                        jSONObject.put("serial_id", mf3Var.f380445h);
                        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f423263e);
                        if (mf3Var.f380441d != 0) {
                            jSONObject.put("err_retry", mf3Var.f380444g);
                            jSONObject.put("err_tip", mf3Var.f380442e);
                            jSONObject.put("err_msg", "fail");
                            jSONObject.put("otherVerifyTitle", this.H);
                        }
                    } else {
                        vz2.c.c().f56217s = 4;
                        vz2.b.a(16);
                        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, i18);
                        jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, i18);
                        jSONObject.put("errormsg", mf3Var.f380442e);
                        jSONObject.put("otherVerifyTitle", this.H);
                        jSONObject.put("err_code", i18);
                        jSONObject.put("err_retry", mf3Var.f380444g);
                        jSONObject.put("err_msg", "fail");
                    }
                } catch (org.json.JSONException unused) {
                }
                hashMap.put("response", jSONObject.toString());
                this.f423262d.onNetworkResponseEvent(hashMap, null);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionManager", "scene is getFaceCheckActionerrType");
        vz2.c.k("rspCfg", java.lang.Integer.valueOf(i18));
        this.S++;
        gm0.j1.d().q(2696, this);
        j72.a aVar = (j72.a) m1Var;
        vz2.c.c().f56206h = i18;
        this.T = java.lang.System.currentTimeMillis();
        if (i17 != 0 || i18 != 0) {
            vz2.c.c().f56217s = 3;
            r(i18, str, "get action data error 3");
            return;
        }
        r45.if3 if3Var = aVar.f298037f;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionManager", "[cgi-ret]NetSceneGetFaceCheckAction, ret_code: %s, ret_msg: %s, action_data: %s, reduction_ratio: %s, take_message: %s", java.lang.Integer.valueOf(if3Var.f376984d), if3Var.f376985e, if3Var.f376987g, java.lang.Float.valueOf(if3Var.f376988h), if3Var.f376989i);
        int i27 = if3Var.f376984d;
        if (i27 != 0) {
            r(i27, if3Var.f376985e, "get action data error 2");
            return;
        }
        java.lang.String str2 = if3Var.f376986f;
        this.f137113J = str2;
        java.lang.String str3 = if3Var.f376987g;
        this.K = str3;
        float f17 = if3Var.f376988h;
        this.L = f17;
        this.M = if3Var.f376989i;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionManager", "[cgi-ret]NetSceneGetFaceCheckAction personId:%s actionData:%s reductionRatio:%s", str2, str3, java.lang.Float.valueOf(f17));
        int P = com.tencent.mm.sdk.platformtools.t8.P(this.K, -1);
        if (P == 1 || P == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionManager", "user check blink eye");
            this.R = i65.a.r(this.f423271p, com.tencent.mm.R.string.c67);
            i19 = 1;
        } else if (P != 5) {
            i19 = -1;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionManager", "user check open month");
            this.R = i65.a.r(this.f423271p, com.tencent.mm.R.string.c68);
            i19 = 2;
        }
        if (i19 == -1) {
            r(-1, "", "get action data error 1");
            return;
        }
        java.lang.String str4 = i19 + "";
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionManager", "packageSuccessResult1");
        java.util.HashMap<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, 0);
            jSONObject2.put("errormsg", "OK");
            jSONObject2.put("type", 1);
            jSONObject2.put("action_data", str4);
            hashMap2.put("response", jSONObject2.toString());
        } catch (org.json.JSONException unused2) {
        }
        this.f423262d.onNetworkResponseEvent(hashMap2, null);
    }

    public final void p(java.lang.String str) {
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionManager", "MD5ForSignatureString：%s", p17);
        byte[] bytes = p17.getBytes();
        com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
        if (fo3.s.INSTANCE.f4(1, bytes, 0, bytes.length, pByteArray)) {
            this.I = pByteArray.value;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionManager", "digitalSignature failed");
            this.I = bytes;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r0 = "AES"
            com.tencent.mm.vfs.r6 r1 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.z7 r7 = com.tencent.mm.vfs.z7.a(r7)
            r1.<init>(r7)
            com.tencent.mm.vfs.r6 r7 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.z7 r8 = com.tencent.mm.vfs.z7.a(r8)
            r7.<init>(r8)
            boolean r8 = r1.m()
            if (r8 == 0) goto Lbd
            boolean r8 = r1.A()
            if (r8 == 0) goto Lbd
            com.tencent.mm.vfs.r6 r8 = r7.s()
            boolean r8 = r8.m()
            if (r8 != 0) goto L31
            com.tencent.mm.vfs.r6 r8 = r7.s()
            r8.J()
        L31:
            r7.k()
            r8 = 0
            java.io.InputStream r1 = com.tencent.mm.vfs.w6.C(r1)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La6
            java.io.OutputStream r7 = com.tencent.mm.vfs.w6.H(r7)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9b
            java.lang.String r2 = "UTF-8"
            byte[] r2 = r6.getBytes(r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            byte[] r2 = r3.getEncoded()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            java.lang.String r0 = "AES/CBC/PKCS7Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            r6 = 1
            r0.init(r6, r3, r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            javax.crypto.CipherInputStream r6 = new javax.crypto.CipherInputStream     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            r6.<init>(r1, r0)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r8]     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> Lac
        L6d:
            int r0 = r6.read(r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> Lac
            r2 = -1
            if (r0 == r2) goto L7c
            r2 = 0
            r7.write(r8, r2, r0)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> Lac
            r7.flush()     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> Lac
            goto L6d
        L7c:
            if (r7 == 0) goto L81
            r7.close()
        L81:
            r6.close()
            if (r1 == 0) goto Lbd
            r1.close()
            goto Lbd
        L8a:
            r8 = move-exception
            goto Lab
        L8c:
            r6 = move-exception
            r4 = r8
            r8 = r6
            r6 = r4
            goto Lad
        L91:
            r6 = move-exception
            r4 = r8
            r8 = r6
            r6 = r4
            goto Lab
        L96:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            goto Lad
        L9b:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            goto Lab
        La0:
            r6 = move-exception
            r7 = r8
            r1 = r7
            r8 = r6
            r6 = r1
            goto Lad
        La6:
            r6 = move-exception
            r7 = r8
            r1 = r7
            r8 = r6
            r6 = r1
        Lab:
            throw r8     // Catch: java.lang.Throwable -> Lac
        Lac:
            r8 = move-exception
        Lad:
            if (r7 == 0) goto Lb2
            r7.close()
        Lb2:
            if (r6 == 0) goto Lb7
            r6.close()
        Lb7:
            if (r1 == 0) goto Lbc
            r1.close()
        Lbc:
            throw r8
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.flash.action.a.q(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void r(int i17, java.lang.String str, java.lang.String str2) {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, i17);
            jSONObject.put("errormsg", str);
            jSONObject.put("err_code", i17);
            jSONObject.put("err_feedback", this.f423270o);
            jSONObject.put("otherVerifyTitle", this.H);
        } catch (org.json.JSONException unused) {
        }
        hashMap.put("response", jSONObject.toString());
        this.f423262d.onNetworkResponseEvent(hashMap, null);
        com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManagerError", str2);
    }

    @Override // tz2.e, dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionManager", "hy: sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
        int i18 = hVar == null ? -1 : hVar.field_retCode;
        vz2.c.k("rspCdn", java.lang.Integer.valueOf(i18));
        vz2.c.c().f56207i = i18;
        vz2.c.c().f56209k = java.lang.System.currentTimeMillis() - this.f423278w;
        java.lang.String str2 = this.Q;
        if (hVar != null && hVar.field_retCode == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionManager", "hy: upload video done. now upload");
            com.tencent.mm.vfs.w6.h(str2);
            vz2.c.j("reqVerify");
            j72.c cVar = new j72.c(this.f137113J, this.K, this.L, hVar.field_fileId, hVar.field_aesKey, this.f423263e, this.M, this.F, this.I, this.N, 1, 0L, this.C, this.B, this.U);
            gm0.j1.d().a(2726, this);
            gm0.j1.d().g(cVar);
            vz2.c.c().f56210l = java.lang.System.currentTimeMillis() - this.T;
        } else {
            if (hVar != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FaceFlashActionManager", "hy: upload video cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                com.tencent.mm.vfs.w6.h(str2);
                return 0;
            }
            if (i17 != 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FaceFlashActionManager", "hy: upload video start error!; cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                vz2.c.c().f56217s = 5;
            }
        }
        return 0;
    }

    @Override // tz2.e, tz2.u
    public void release() {
        super.release();
        gm0.j1.d().q(2696, this);
        gm0.j1.d().q(2726, this);
        com.tencent.mm.vfs.w6.h(this.P);
        com.tencent.mm.vfs.w6.h(this.Q);
        k72.v vVar = this.U;
        if (vVar != null) {
            android.hardware.SensorManager sensorManager = vVar.f304769d;
            if (sensorManager != null) {
                sensorManager.unregisterListener(vVar);
            }
            this.U = null;
        }
    }
}
