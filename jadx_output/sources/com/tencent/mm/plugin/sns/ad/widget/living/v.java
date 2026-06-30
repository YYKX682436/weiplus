package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ad.widget.living.u f163766e = new com.tencent.mm.plugin.sns.ad.widget.living.u(null);

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f163767f = new com.tencent.mm.sdk.platformtools.r2(3);

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer f163768a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f163769b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f163770c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.living.t f163771d;

    public v(com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer) {
        this.f163768a = adLivingStreamContainer;
    }

    public static final boolean a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShowAdLivingStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        boolean a17 = f163766e.a(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowAdLivingStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        return a17;
    }

    public final void b() {
        r45.nw1 nw1Var;
        r45.p94 p94Var;
        r45.p94 p94Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doExitAdLiveRoom", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer = this.f163768a;
        if (adLivingStreamContainer != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doExitAdLiveRoom", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doExitAdLiveRoom, enable is ");
                r45.l71 l71Var = adLivingStreamContainer.mGetLiveInfoResp;
                sb6.append((l71Var == null || (p94Var2 = (r45.p94) l71Var.getCustom(17)) == null) ? null : java.lang.Boolean.valueOf(p94Var2.getBoolean(0)));
                sb6.append(", mIsEnterAdRoom is ");
                sb6.append(adLivingStreamContainer.mIsEnterAdRoom);
                sb6.append(", mNeedExitAdRoomReq is ");
                sb6.append(adLivingStreamContainer.mNeedExitAdRoomReq);
                sb6.append(", mIsPlayerPaused is ");
                sb6.append(adLivingStreamContainer.D);
                com.tencent.mars.xlog.Log.i("MicroMsg.AdLivingStreamContainer", sb6.toString());
                if (!adLivingStreamContainer.D) {
                    adLivingStreamContainer.f();
                }
                adLivingStreamContainer.A = adLivingStreamContainer.F;
                r45.l71 l71Var2 = adLivingStreamContainer.mGetLiveInfoResp;
                if (((l71Var2 == null || (p94Var = (r45.p94) l71Var2.getCustom(17)) == null || !p94Var.getBoolean(0)) ? false : true) && adLivingStreamContainer.mNeedExitAdRoomReq && adLivingStreamContainer.mIsEnterAdRoom) {
                    adLivingStreamContainer.mIsEnterAdRoom = false;
                    r45.l71 l71Var3 = adLivingStreamContainer.mGetLiveInfoResp;
                    java.lang.Long valueOf = l71Var3 != null ? java.lang.Long.valueOf(l71Var3.getLong(18)) : null;
                    r45.l71 l71Var4 = adLivingStreamContainer.mGetLiveInfoResp;
                    java.lang.Long valueOf2 = (l71Var4 == null || (nw1Var = (r45.nw1) l71Var4.getCustom(1)) == null) ? null : java.lang.Long.valueOf(nw1Var.getLong(0));
                    r45.l71 l71Var5 = adLivingStreamContainer.mGetLiveInfoResp;
                    java.lang.String string = l71Var5 != null ? l71Var5.getString(19) : null;
                    r45.l71 l71Var6 = adLivingStreamContainer.mGetLiveInfoResp;
                    java.lang.String string2 = l71Var6 != null ? l71Var6.getString(20) : null;
                    r45.hc1 hc1Var = adLivingStreamContainer.mFinderJoinLiveResp;
                    com.tencent.mm.protobuf.g byteString = hc1Var != null ? hc1Var.getByteString(1) : null;
                    adLivingStreamContainer.C = java.lang.System.currentTimeMillis() / 1000;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AdLivingStreamContainer", "doExitAdLiveRoom, liveId is " + valueOf2 + ", objectId is " + valueOf + ", nonceId is " + string + ", mFinderUsername is " + adLivingStreamContainer.mFinderUsername + ", sessionBuffer is " + string2 + ", mJoinLiveEndTimestamp is " + adLivingStreamContainer.C + ", liveCookies is " + byteString);
                    if (!(valueOf2 == null)) {
                        if (!(valueOf == null)) {
                            if (!(string == null)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.AdLivingStreamContainer", "do getLiveMsg");
                                adLivingStreamContainer.f163624J = new com.tencent.mm.plugin.sns.ad.widget.living.c(new java.lang.ref.WeakReference(adLivingStreamContainer));
                                ss5.k0 k0Var = (ss5.k0) i95.n0.c(ss5.k0.class);
                                java.lang.String str = adLivingStreamContainer.mFinderUsername;
                                byte[] g17 = byteString != null ? byteString.g() : null;
                                com.tencent.mm.plugin.sns.ad.widget.living.c cVar = adLivingStreamContainer.f163624J;
                                kotlin.jvm.internal.o.d(cVar);
                                kotlin.jvm.internal.o.d(k0Var);
                                ss5.k0.B4(k0Var, null, str, g17, valueOf2.longValue(), valueOf.longValue(), string, null, 11, true, 0, null, 0, null, null, cVar, null, null, null, false, null, null, 0L, null, 6176256, null).l();
                            }
                        }
                    }
                }
                adLivingStreamContainer.g();
                adLivingStreamContainer.m();
            } catch (java.lang.Throwable th6) {
                ca4.q.c("doExitAdLiveRoom error", th6);
                com.tencent.mars.xlog.Log.e("MicroMsg.AdLivingStreamContainer", "doExitAdLiveRoom, exp is" + th6);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doExitAdLiveRoom", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doExitAdLiveRoom", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r23, int r24) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.widget.living.v.c(int, int):void");
    }

    public final void d(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, r45.jj4 jj4Var, java.lang.Integer num, java.lang.Integer num2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLivingStreamHelper", "fillAdLivingStreamViewInfo, exp is " + th6);
        }
        if (snsInfo == null || jj4Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLivingStreamHelper", "fillAdLivingStreamViewInfo, but snsInfo or media is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
            return;
        }
        com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer = this.f163768a;
        if (adLivingStreamContainer == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLivingStreamHelper", "fillAdLivingStreamViewInfo, but adLivingViewContainer is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
            return;
        }
        if (!ca4.m0.V(this.f163769b, snsInfo)) {
            h();
        }
        boolean z17 = true;
        if (!ca4.m0.V(adLivingStreamContainer.getMSnsInfo(), snsInfo)) {
            this.f163770c = false;
            adLivingStreamContainer.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetParams", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            adLivingStreamContainer.startEnterAdLiveRoomTime = 0L;
            adLivingStreamContainer.F = 0L;
            adLivingStreamContainer.C = 0L;
            adLivingStreamContainer.B = 0L;
            adLivingStreamContainer.E = false;
            adLivingStreamContainer.D = true;
            adLivingStreamContainer.mIsEnterAdRoom = false;
            adLivingStreamContainer.mFinderJoinLiveResp = null;
            adLivingStreamContainer.setEventListenerEnabled(true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetParams", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
        }
        adLivingStreamContainer.setVisibility(0);
        if (com.tencent.mm.plugin.sns.ad.widget.living.i0.c(ca4.z0.T(snsInfo), 2) != 771) {
            z17 = false;
        }
        adLivingStreamContainer.setMIsPlayCompleted(z17);
        if (adLivingStreamContainer.getMSnsInfo() == null || this.f163769b == null) {
            this.f163769b = snsInfo;
            adLivingStreamContainer.setMSnsInfo(snsInfo);
            this.f163770c = false;
            c(i17, 3);
            android.widget.ImageView mStatusIcon = adLivingStreamContainer.getMStatusIcon();
            if (mStatusIcon != null) {
                mStatusIcon.setVisibility(0);
            }
            adLivingStreamContainer.n(jj4Var, num, num2);
        }
        android.widget.ImageView mThumbView = adLivingStreamContainer.getMThumbView();
        if (mThumbView != null) {
            android.content.Context context = adLivingStreamContainer.getContext();
            com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
            int hashCode = context.hashCode();
            com.tencent.mm.storage.s7 d17 = com.tencent.mm.storage.s7.d();
            d17.f195313b = snsInfo.getTimeLine().CreateTime;
            hj6.l0(jj4Var, mThumbView, -1, hashCode, d17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
    }

    public final com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdLivingViewContainer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdLivingViewContainer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        return this.f163768a;
    }

    public final void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdLivingStreamHelper", "onUIDestroy");
            f163767f.d(-1);
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer = this.f163768a;
            if (adLivingStreamContainer != null) {
                adLivingStreamContainer.l();
            }
            h();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLivingStreamHelper", "onUIDestroy, exp is " + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
    }

    public final void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlayerStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        boolean c17 = f163766e.c();
        com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer = this.f163768a;
        if (!c17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdLivingStreamHelper", "isNotAdLivingFrequencyLimit, pausePlayerStream");
            this.f163770c = false;
            if (adLivingStreamContainer != null) {
                adLivingStreamContainer.k();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlayerStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
            return;
        }
        if (adLivingStreamContainer != null ? kotlin.jvm.internal.o.b(adLivingStreamContainer.j(), java.lang.Boolean.TRUE) : false) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdLivingStreamHelper", "pausePlayerStream");
            this.f163770c = false;
            adLivingStreamContainer.k();
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AdLivingStreamHelper", "pausePlayerStream, but player is not playing");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlayerStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
    }

    public final void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        this.f163770c = false;
        this.f163769b = null;
        com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer = this.f163768a;
        if (adLivingStreamContainer != null) {
            adLivingStreamContainer.m();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
    }

    public final void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAdStreamPlayer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        boolean c17 = f163766e.c();
        com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer = this.f163768a;
        if (c17) {
            if (adLivingStreamContainer != null ? kotlin.jvm.internal.o.b(adLivingStreamContainer.j(), java.lang.Boolean.TRUE) : false) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AdLivingStreamHelper", "startAdStreamPlayer, but player is playing");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAdStreamPlayer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLivingStreamHelper", "startAdStreamPlayer");
        this.f163770c = true;
        java.lang.Integer valueOf = adLivingStreamContainer != null ? java.lang.Integer.valueOf(adLivingStreamContainer.getMPlayerStatus()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            if (adLivingStreamContainer != null) {
                adLivingStreamContainer.p();
            }
        } else if (adLivingStreamContainer != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumePlayerStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.AdLivingStreamContainer", "resumePlayerStream, mIsPlayCompleted is " + adLivingStreamContainer.mIsPlayCompleted + ", mIsPlayerPaused is " + adLivingStreamContainer.D);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AdLivingStreamContainer", "resumePlayerStream, exp is" + th6);
            }
            if (adLivingStreamContainer.mIsPlayCompleted) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumePlayerStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            } else {
                if (adLivingStreamContainer.D) {
                    adLivingStreamContainer.h();
                }
                adLivingStreamContainer.D = false;
                adLivingStreamContainer.mPlayerStatus = 1;
                android.widget.ImageView imageView = adLivingStreamContainer.mStatusIcon;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                c50.m0 m0Var = adLivingStreamContainer.mPlayer;
                if (m0Var != null) {
                    ((gp2.l0) m0Var).G();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumePlayerStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAdStreamPlayer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
    }
}
