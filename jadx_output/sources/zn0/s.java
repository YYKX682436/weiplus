package zn0;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.trtc.TRTCCloud f474383a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f474384b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f474385c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f474386d;

    /* renamed from: e, reason: collision with root package name */
    public zn0.t f474387e;

    /* renamed from: f, reason: collision with root package name */
    public zn0.t f474388f;

    /* renamed from: g, reason: collision with root package name */
    public zn0.k f474389g;

    /* renamed from: h, reason: collision with root package name */
    public int f474390h;

    /* renamed from: i, reason: collision with root package name */
    public int f474391i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f474392j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f474393k;

    /* renamed from: l, reason: collision with root package name */
    public final android.os.Handler f474394l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Runnable f474395m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Runnable f474396n;

    /* renamed from: o, reason: collision with root package name */
    public zn0.u f474397o;

    public s(com.tencent.trtc.TRTCCloud trtcInstance) {
        kotlin.jvm.internal.o.g(trtcInstance, "trtcInstance");
        this.f474383a = trtcInstance;
        this.f474389g = zn0.k.f474359d;
        this.f474394l = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public static final void a(zn0.s sVar, boolean z17) {
        if (sVar.f474389g != zn0.k.f474359d) {
            com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "currentState: " + sVar.f474389g);
            return;
        }
        if (sVar.f474388f != null) {
            com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "Has nextDataWrap");
            sVar.f474387e = sVar.f474388f;
            sVar.f474388f = null;
        } else if (!z17) {
            com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "nextDataWrap is null, forcePublish is false.");
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "forcePublish: " + z17 + ",shouldRetryPublishMediaStreamWithoutDelay: " + sVar.f474393k);
        sVar.f474393k = false;
        sVar.f();
    }

    public static final int b(zn0.s sVar, android.os.Bundle bundle) {
        boolean z17;
        java.lang.Object obj;
        int intValue;
        boolean z18;
        sVar.getClass();
        boolean z19 = false;
        if (bundle == null) {
            z17 = false;
        } else {
            z17 = true;
            if (bundle.containsKey(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE) && (obj = bundle.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE)) != null) {
                if (obj instanceof java.lang.Number) {
                    intValue = ((java.lang.Number) obj).intValue();
                    z19 = true;
                    z18 = true;
                    com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "hasExtraInfo: " + z18 + ", hasErrorCodeObj: " + z19 + ", errorCodeObjIsNumber: " + z17 + ", serverErrorCode: " + intValue);
                    return intValue;
                }
                intValue = 0;
                z18 = true;
                z19 = true;
                z17 = intValue == true ? 1 : 0;
                com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "hasExtraInfo: " + z18 + ", hasErrorCodeObj: " + z19 + ", errorCodeObjIsNumber: " + z17 + ", serverErrorCode: " + intValue);
                return intValue;
            }
        }
        intValue = 0;
        z18 = z17;
        z17 = intValue == true ? 1 : 0;
        com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "hasExtraInfo: " + z18 + ", hasErrorCodeObj: " + z19 + ", errorCodeObjIsNumber: " + z17 + ", serverErrorCode: " + intValue);
        return intValue;
    }

    public static final void c(zn0.s sVar, java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        sVar.getClass();
        if (z17) {
            if (i17 == 2000 || i17 == 2001 || i17 == 2021) {
                return;
            }
            if (i17 == 3000 || i17 == 5001 || i17 == 4006) {
                sVar.i();
                return;
            } else {
                if (i17 != 4007) {
                    sVar.i();
                    return;
                }
                return;
            }
        }
        if (i17 != 2018) {
            if (i17 != 2021) {
                if (i17 != 3000) {
                    if (i17 != 4003) {
                        switch (i17) {
                            case 2000:
                            case 2001:
                                break;
                            case 2002:
                                break;
                            default:
                                int i18 = sVar.f474391i + 1;
                                sVar.f474391i = i18;
                                if (i18 <= 5) {
                                    sVar.j();
                                    return;
                                }
                                sVar.f474391i = 0;
                                sVar.f474390h = 0;
                                sVar.f474386d = sVar.f474385c;
                                sVar.f474385c = null;
                                sVar.i();
                                return;
                        }
                    }
                    sVar.f474391i = 0;
                    sVar.f474390h = 0;
                    sVar.f474386d = sVar.f474385c;
                    sVar.f474385c = null;
                    sVar.i();
                    return;
                }
            }
            sVar.f474391i = 0;
            return;
        }
        sVar.f474391i = 0;
        sVar.j();
    }

    public final void d() {
        java.lang.Runnable runnable = this.f474396n;
        if (runnable != null) {
            this.f474394l.removeCallbacks(runnable);
            this.f474396n = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r4 = this;
            r0 = 1
            r4.f474392j = r0
            boolean r0 = r4.f474393k
            if (r0 == 0) goto L8
            goto L18
        L8:
            int r0 = r4.f474390h
            r1 = 10
            if (r0 < r1) goto L11
            r0 = 30000(0x7530, double:1.4822E-319)
            goto L1a
        L11:
            r1 = 2
            if (r0 < r1) goto L18
            int r0 = r0 * 500
            long r0 = (long) r0
            goto L1a
        L18:
            r0 = 100
        L1a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "delayTime: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = ", requestFailedCount: "
            r2.append(r3)
            int r3 = r4.f474390h
            r2.append(r3)
            java.lang.String r3 = ",shouldRetryPublishMediaStreamWithoutDelay: "
            r2.append(r3)
            boolean r3 = r4.f474393k
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FinderLivePublishMediaStream"
            com.tencent.mars.xlog.Log.i(r3, r2)
            r2 = 0
            r4.f474393k = r2
            java.lang.Runnable r2 = r4.f474395m
            android.os.Handler r3 = r4.f474394l
            if (r2 == 0) goto L50
            r3.removeCallbacks(r2)
            r2 = 0
            r4.f474395m = r2
        L50:
            zn0.m r2 = new zn0.m
            r2.<init>(r4)
            r4.f474395m = r2
            r3.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zn0.s.e():void");
    }

    public final void f() {
        if (this.f474389g == zn0.k.f474359d) {
            if (!(this.f474387e == null)) {
                boolean z17 = this.f474392j;
                android.os.Handler handler = this.f474394l;
                if (z17) {
                    com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "shouldPublishMediaStreamAfterDelay is true");
                    this.f474392j = false;
                    java.lang.Runnable runnable = this.f474395m;
                    if (runnable != null) {
                        handler.removeCallbacks(runnable);
                        this.f474395m = null;
                    }
                }
                if (this.f474393k) {
                    com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "shouldRetryPublishMediaStreamWithoutDelay is YES");
                    this.f474393k = false;
                }
                d();
                zn0.l lVar = new zn0.l(this);
                this.f474396n = lVar;
                handler.postDelayed(lVar, 12000L);
                java.lang.String str = this.f474385c;
                boolean z18 = str == null || str.length() == 0;
                com.tencent.trtc.TRTCCloud tRTCCloud = this.f474383a;
                if (z18) {
                    com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "startPublishMediaStream.");
                    this.f474389g = zn0.k.f474360e;
                    this.f474384b = true;
                    zn0.t tVar = this.f474387e;
                    kotlin.jvm.internal.o.d(tVar);
                    zn0.t tVar2 = this.f474387e;
                    kotlin.jvm.internal.o.d(tVar2);
                    zn0.t tVar3 = this.f474387e;
                    kotlin.jvm.internal.o.d(tVar3);
                    tRTCCloud.startPublishMediaStream(tVar.f474398a, tVar2.f474399b, tVar3.f474400c);
                    return;
                }
                com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "updatePublishMediaStream, publishMediaStreamTaskId: " + this.f474385c);
                this.f474389g = zn0.k.f474361f;
                java.lang.String str2 = this.f474385c;
                kotlin.jvm.internal.o.d(str2);
                zn0.t tVar4 = this.f474387e;
                kotlin.jvm.internal.o.d(tVar4);
                zn0.t tVar5 = this.f474387e;
                kotlin.jvm.internal.o.d(tVar5);
                zn0.t tVar6 = this.f474387e;
                kotlin.jvm.internal.o.d(tVar6);
                tRTCCloud.updatePublishMediaStream(str2, tVar4.f474398a, tVar5.f474399b, tVar6.f474400c);
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "realPublishMediaStream failed, currentState: " + this.f474389g + ", currentDataWrap: " + this.f474387e);
    }

    public final void g(zn0.j jVar, java.lang.String str, int i17, java.lang.String str2, int i18) {
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Long l17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        zn0.u uVar = this.f474397o;
        sb6.append(uVar != null ? uVar.f474401a : null);
        sb6.append(',');
        zn0.u uVar2 = this.f474397o;
        sb6.append((uVar2 == null || (l17 = uVar2.f474402b) == null) ? "" : pm0.v.u(l17.longValue()));
        sb6.append(',');
        zn0.u uVar3 = this.f474397o;
        if (uVar3 == null || (str3 = uVar3.f474403c) == null) {
            str3 = "";
        }
        sb6.append(str3);
        sb6.append(',');
        zn0.u uVar4 = this.f474397o;
        sb6.append(uVar4 != null ? uVar4.f474404d : null);
        sb6.append(',');
        zn0.u uVar5 = this.f474397o;
        if (uVar5 == null || (str4 = uVar5.f474405e) == null) {
            str4 = "";
        }
        sb6.append(str4);
        sb6.append(',');
        sb6.append(jVar);
        sb6.append(',');
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(',');
        sb6.append(i17);
        sb6.append(',');
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(',');
        sb6.append(this.f474390h);
        sb6.append(',');
        sb6.append(i18);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "36011, publishMediaStreamResultLogString: " + sb7);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(36011, sb7);
    }

    public final void h() {
        if (this.f474389g != zn0.k.f474359d) {
            com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "Invalid currentState: " + this.f474389g);
        } else {
            if (this.f474392j) {
                com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "shouldPublishMediaStreamAfterDelay is true");
            }
            e();
        }
    }

    public final void i() {
        if (this.f474389g != zn0.k.f474359d) {
            com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "Invalid currentState: " + this.f474389g);
            return;
        }
        java.lang.String str = this.f474386d;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "Retry start");
            h();
            return;
        }
        d();
        zn0.l lVar = new zn0.l(this);
        this.f474396n = lVar;
        this.f474394l.postDelayed(lVar, 12000L);
        com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "stopPublishMediaStream, lastPublishMediaStreamTaskId: " + this.f474386d);
        this.f474389g = zn0.k.f474362g;
        java.lang.String str2 = this.f474386d;
        kotlin.jvm.internal.o.d(str2);
        this.f474383a.stopPublishMediaStream(str2);
    }

    public final void j() {
        if (this.f474392j) {
            com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "shouldPublishMediaStreamAfterDelay is true");
        }
        e();
    }
}
