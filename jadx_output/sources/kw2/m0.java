package kw2;

/* loaded from: classes15.dex */
public class m0 implements nk4.s {

    /* renamed from: a, reason: collision with root package name */
    public r45.qt2 f313056a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f313057b;

    /* renamed from: c, reason: collision with root package name */
    public int f313058c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.ConcurrentHashMap f313059d;

    /* renamed from: e, reason: collision with root package name */
    public final pw2.a f313060e;

    /* renamed from: f, reason: collision with root package name */
    public final kw2.a0 f313061f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f313062g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f313063h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f313064i;

    /* renamed from: j, reason: collision with root package name */
    public ni3.a1 f313065j;

    /* renamed from: k, reason: collision with root package name */
    public final int f313066k;

    /* renamed from: l, reason: collision with root package name */
    public nh.c f313067l;

    public m0(r45.qt2 contextObj) {
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f313056a = contextObj;
        this.f313057b = new java.util.concurrent.ConcurrentLinkedDeque();
        this.f313059d = new java.util.concurrent.ConcurrentHashMap();
        this.f313060e = new pw2.a("Finder.Stat.FirstFrame");
        this.f313061f = new kw2.a0();
        this.f313062g = true;
        this.f313063h = true;
        this.f313064i = new java.util.concurrent.ConcurrentHashMap();
        this.f313066k = hc1.i.CTRL_INDEX;
    }

    public static final float e(kw2.m0 m0Var, double d17) {
        m0Var.getClass();
        if (d17 == 0.0d) {
            return 0.0f;
        }
        java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(d17)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return java.lang.Float.parseFloat(format);
    }

    public void A(nk4.b data) {
        kotlin.jvm.internal.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f313059d.get(java.lang.Long.valueOf(data.f338064a));
        if (d0Var != null) {
            d0Var.f312949x0 = true;
            long j17 = data.f338065b;
            d0Var.H = j17;
            long j18 = d0Var.F;
            if (j18 > 0) {
                d0Var.E += j17 - j18;
                d0Var.F = 0L;
            }
            if (d0Var.M == 0) {
                long j19 = j17 - d0Var.f312924l;
                d0Var.M = j19;
                long j27 = d0Var.F;
                if (j19 >= j27) {
                    d0Var.M = j19 - j27;
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", f("firstCallStartPlayer", d0Var) + ' ' + m("firstCallStartPlayer", d0Var));
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", f("onResume", d0Var) + " onResume:" + d0Var.E);
        }
    }

    public void B(nk4.e data) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Integer num;
        boolean E;
        r45.vf2 vf2Var;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", "onStartPlay");
        kw2.d0 d0Var = new kw2.d0();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        d0Var.f312904b = Ri;
        d0Var.f312906c = data.f338064a;
        d0Var.f312908d = data.f338066c;
        java.lang.String str3 = data.f338070d;
        kotlin.jvm.internal.o.g(str3, "<set-?>");
        d0Var.f312910e = str3;
        java.lang.String str4 = data.f338071e;
        kotlin.jvm.internal.o.g(str4, "<set-?>");
        d0Var.f312916h = str4;
        d0Var.f312918i = data.f338075i;
        d0Var.f312920j = data.f338076j;
        java.lang.String str5 = data.f338079m;
        kotlin.jvm.internal.o.g(str5, "<set-?>");
        d0Var.f312912f = str5;
        d0Var.f312914g = hc2.b0.k(data.f338080n, 0, 0, 3, null);
        d0Var.f312924l = data.f338065b;
        d0Var.f312926m = data.f338077k;
        d0Var.B = true;
        d0Var.C0 = data.f338081o;
        d0Var.D = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).getRecentAverageSpeed(2);
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        d0Var.f312927m0 = ((android.media.AudioManager) systemService).getStreamVolume(3);
        cu2.x xVar = cu2.x.f222449a;
        so2.i3 c17 = cu2.x.c(xVar, data.f338070d, false, false, false, 14, null);
        int i17 = d0Var.C0;
        d0Var.f312936r = i17 > 0 ? i17 + 1 : c17.w0() > 0 ? 1 : 0;
        d0Var.f312952z = !c17.field_hasPlayed ? 1 : 0;
        d0Var.f312938s = (int) c17.field_cacheSize;
        long[] jArr = new long[3];
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).queryDownloadedSize(c17.field_mediaId, jArr);
        long j17 = 0;
        d0Var.R0 = java.lang.Long.max(0L, jArr[0]);
        java.lang.String str6 = c17.field_fileFormat;
        if (str6 == null) {
            str6 = "";
        }
        d0Var.f312939s0 = str6;
        if (android.text.TextUtils.isEmpty(data.f338074h)) {
            int i18 = c17.field_videoCodecId;
            if (i18 == 26) {
                str = "H264";
            } else if (i18 == 172) {
                str = "H265";
            } else if (i18 != 193) {
                str = "unknown@" + c17.field_videoCodecId;
            } else {
                str = "H266";
            }
        } else {
            str = data.f338074h;
        }
        kotlin.jvm.internal.o.g(str, "<set-?>");
        d0Var.f312947w0 = str;
        java.lang.String netTypeString = com.tencent.mars.comm.NetStatusUtil.getNetTypeString(com.tencent.mm.sdk.platformtools.x2.f193071a);
        kotlin.jvm.internal.o.f(netTypeString, "getNetTypeString(...)");
        d0Var.f312948x = netTypeString;
        d0Var.f312950y = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ik();
        if (this.f313056a.getBoolean(13)) {
            java.lang.Long l17 = (java.lang.Long) ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).f125214m.get(d0Var.f312906c);
            if (l17 != null) {
                j17 = l17.longValue();
            }
        } else {
            java.lang.Long l18 = (java.lang.Long) ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).f125210f.get(d0Var.f312906c);
            if (l18 != null) {
                j17 = l18.longValue();
            }
        }
        d0Var.T = j17;
        if (cw2.l5.f223835a.e()) {
            str2 = "h266";
        } else {
            ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
            str2 = d11.s.Di(4) ? "h265" : "h264";
        }
        d0Var.f312945v0 = str2;
        d0Var.f312922k = ((c61.l7) i95.n0.c(c61.l7.class)).ek().f464695l;
        d0Var.f312953z0 = data.f338072f;
        d0Var.A0 = data.f338073g;
        d0Var.C0 = data.f338081o;
        this.f313059d.put(java.lang.Long.valueOf(data.f338064a), d0Var);
        yr2.k ek6 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
        jz5.o oVar = (jz5.o) ek6.f464701r.get(d0Var.f312910e);
        if (oVar == null || (vf2Var = (r45.vf2) oVar.f302841d) == null) {
            num = null;
        } else {
            java.lang.String string = vf2Var.getString(15);
            if (string == null) {
                string = "";
            }
            d0Var.M0 = string;
            num = java.lang.Integer.valueOf(((long) vf2Var.getInteger(2)) >= ek6.f464694k ? 1 : 0);
        }
        d0Var.J0 = num != null ? num.intValue() : -1;
        java.lang.String str7 = "Finder.Report." + data.f338083q;
        kotlin.jvm.internal.o.g(str7, "<set-?>");
        d0Var.f312902a = str7;
        d0Var.L0 = data.f338078l;
        java.lang.String mediaId = d0Var.f312910e;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        so2.i3 c18 = cu2.x.c(xVar, mediaId, false, false, false, 14, null);
        int i19 = c18.field_playCount + 1;
        c18.field_playCount = i19;
        xVar.i(mediaId, c18, false);
        d0Var.Q0 = i19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateApmInfoOnStart, lastProfiler=");
        nh.c cVar = this.f313067l;
        sb6.append(cVar != null ? java.lang.Integer.valueOf(cVar.f337069b) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", sb6.toString());
        nh.c cVar2 = this.f313067l;
        if (cVar2 != null) {
            synchronized (cVar2) {
                synchronized (cVar2) {
                    rh.c1 c1Var = cVar2.f337070c;
                    E = c1Var != null ? c1Var.E() : false;
                }
            }
            if (E) {
                com.tencent.mars.xlog.Log.w("Finder.FinderVideoPlayReporter", "still running, cancel it");
                cVar2.a();
                cVar2.b();
            }
        }
        nh.c cVar3 = new nh.c("Feed");
        com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", "newProfiler=" + java.lang.Integer.valueOf(cVar3.f337069b));
        synchronized (cVar3) {
            cVar3.d();
        }
        this.f313067l = cVar3;
        com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", "positionType:" + d0Var.L0 + ' ' + f("onStartPlay", d0Var) + " firstplay:" + d0Var.f312952z + "  hitPreloadPercent:" + d0Var.f312938s + " posterNickName:" + d0Var.f312912f + " mediaDesc:" + d0Var.f312914g);
    }

    public void C(nk4.o data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", "onStopPlay");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f313059d;
        long j17 = data.f338064a;
        kw2.d0 d0Var = (kw2.d0) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        if (d0Var != null && d0Var.f312906c == j17 && kotlin.jvm.internal.o.b(d0Var.f312910e, data.f338096d)) {
            long j18 = d0Var.f312924l;
            long j19 = data.f338065b;
            d0Var.f312928n = j19 - j18;
            nk4.a aVar = data.f338097e;
            d0Var.I0 = aVar != null ? aVar.a() : null;
            long j27 = d0Var.F;
            if (j27 > 0) {
                d0Var.E += j19 - j27;
                d0Var.F = 0L;
            }
            long j28 = d0Var.H;
            if (j28 > 0) {
                d0Var.G += j19 - j28;
                d0Var.H = 0L;
            }
            long j29 = d0Var.R;
            if (j29 > 0) {
                d0Var.S += j19 - j29;
                r45.t23 t23Var = new r45.t23();
                t23Var.set(2, java.lang.Integer.valueOf((int) (j19 - d0Var.R)));
                t23Var.set(1, java.lang.Integer.valueOf((int) d0Var.f312932p));
                t23Var.set(0, 0);
                d0Var.f312923k0.add(t23Var);
                d0Var.R = 0L;
            }
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            d0Var.f312929n0 = ((android.media.AudioManager) systemService).getStreamVolume(3);
            if (d0Var.f312901J == 0 && d0Var.B && d0Var.f312930o < 5) {
                d0Var.C = 1;
            }
            if (d0Var.Y) {
                this.f313057b.add(d0Var);
            } else {
                G(d0Var);
            }
            this.f313059d.remove(java.lang.Long.valueOf(j17));
            com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", f("onStopPlay", d0Var) + " playTime:" + d0Var.f312928n + " pauseTotalTime:" + d0Var.E + " realPlayTime:" + d0Var.G + " playStatus:" + d0Var.C + " videoPlayCodeId:" + d0Var.f312947w0);
        }
    }

    public void D(nk4.f data) {
        kotlin.jvm.internal.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f313059d.get(java.lang.Long.valueOf(data.f338064a));
        if (d0Var != null) {
            d0Var.B = true;
            d0Var.R = data.f338065b;
            boolean z17 = data.f338084d;
            d0Var.f312935q0 = z17;
            d0Var.Q++;
            if (d0Var.f312901J > 0) {
                if (z17) {
                    d0Var.f312903a0++;
                } else {
                    d0Var.Z++;
                }
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", f("onWaiting", d0Var));
            try {
                byte[] N = gm0.j1.n().f273288b.f70764d.N(120, 20);
                if (N != null) {
                    java.util.LinkedList<r45.yw0> linkedList = new java.util.LinkedList();
                    com.tencent.mars.mm.ConnectRecord[] deserialize = com.tencent.mars.mm.ConnectRecordSerializer.deserialize(N);
                    if (deserialize != null) {
                        java.util.Iterator it = ((java.util.ArrayList) kz5.v.w(deserialize, com.tencent.mars.mm.ConnectRecord.class)).iterator();
                        while (it.hasNext()) {
                            com.tencent.mars.mm.ConnectRecord connectRecord = (com.tencent.mars.mm.ConnectRecord) it.next();
                            r45.yw0 yw0Var = new r45.yw0();
                            yw0Var.set(3, java.lang.Long.valueOf(connectRecord.costMs));
                            yw0Var.set(1, java.lang.Boolean.valueOf(connectRecord.connectSucceed));
                            yw0Var.set(2, java.lang.Long.valueOf(connectRecord.beginTimestampMs));
                            yw0Var.set(0, java.lang.Integer.valueOf(connectRecord.protoType));
                            linkedList.add(yw0Var);
                        }
                    }
                    if (linkedList.size() > 1) {
                        kz5.g0.t(linkedList, new kw2.g0());
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(d0Var.f312902a);
                    sb6.append(' ');
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                    for (r45.yw0 yw0Var2 : linkedList) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append("proto:");
                        sb7.append(yw0Var2.getInteger(0) == 1 ? "QUIC" : "TCP");
                        sb7.append(" succeed:");
                        sb7.append(yw0Var2.getBoolean(1));
                        sb7.append(" begin:");
                        sb7.append(yw0Var2.getLong(2));
                        sb7.append(" cost:");
                        sb7.append(yw0Var2.getLong(3));
                        arrayList.add(sb7.toString());
                    }
                    sb6.append(arrayList);
                    com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", "dumpCgiCostInfo " + sb6.toString());
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("Finder.FinderVideoPlayReporter", d0Var.f312902a + " CGI.REC deserialize " + th6);
            }
        }
    }

    public void E(nk4.b data) {
        kotlin.jvm.internal.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f313059d.get(java.lang.Long.valueOf(data.f338064a));
        if (d0Var != null) {
            d0Var.B = false;
            long j17 = d0Var.R;
            if (j17 > 0) {
                long j18 = data.f338065b - j17;
                d0Var.S += j18;
                r45.t23 t23Var = new r45.t23();
                t23Var.set(2, java.lang.Integer.valueOf((int) j18));
                t23Var.set(1, java.lang.Integer.valueOf((int) d0Var.f312932p));
                if (d0Var.f312935q0) {
                    t23Var.set(0, 1);
                } else if (d0Var.Q == 1 && d0Var.Z == 0) {
                    t23Var.set(0, 2);
                } else {
                    t23Var.set(0, 0);
                }
                d0Var.f312923k0.add(t23Var);
                d0Var.R = 0L;
                com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", f("onWaitingEnd", d0Var) + " totalWaitingTime:" + d0Var.S);
            }
        }
    }

    public final void F(kw2.d0 d0Var) {
        if (this.f313062g) {
            com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", d0Var != null ? f("report17000", d0Var) : null);
            if (d0Var != null) {
                kw2.f0 f0Var = d0Var.W;
                kw2.e0 e0Var = d0Var.X;
                if (f0Var == null || e0Var == null) {
                    return;
                }
                com.tencent.mm.autogen.mmdata.rpt.WCStoryVideoPlayReportStruct wCStoryVideoPlayReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCStoryVideoPlayReportStruct();
                long c17 = a06.d.c(((float) (d0Var.f312938s * cu2.x.c(cu2.x.f222449a, d0Var.f312910e, false, false, false, 14, null).field_totalSize)) / 100.0f);
                wCStoryVideoPlayReportStruct.f62134d = wCStoryVideoPlayReportStruct.b("StoryId", pm0.v.u(d0Var.f312906c), true);
                wCStoryVideoPlayReportStruct.f62135e = this.f313056a.getInteger(5) + 100;
                wCStoryVideoPlayReportStruct.f62136f = d0Var.f312952z;
                wCStoryVideoPlayReportStruct.f62137g = d0Var.f312926m == 0 ? 1L : 0L;
                wCStoryVideoPlayReportStruct.f62138h = d0Var.f312918i;
                wCStoryVideoPlayReportStruct.f62139i = a06.d.c(((float) (r11 * d0Var.f312930o)) / 100.0f);
                wCStoryVideoPlayReportStruct.f62140j = d0Var.f312901J;
                wCStoryVideoPlayReportStruct.f62141k = d0Var.f312944v;
                wCStoryVideoPlayReportStruct.f62142l = d0Var.Z;
                wCStoryVideoPlayReportStruct.f62144n = 0L;
                wCStoryVideoPlayReportStruct.f62145o = 0L;
                wCStoryVideoPlayReportStruct.f62146p = e0Var.f312982b;
                wCStoryVideoPlayReportStruct.f62147q = wCStoryVideoPlayReportStruct.b("ErrorDescription", "", true);
                wCStoryVideoPlayReportStruct.f62148r = d0Var.f312941t0;
                wCStoryVideoPlayReportStruct.f62149s = wCStoryVideoPlayReportStruct.b("VideoFormat", java.lang.String.valueOf(f0Var.f313010b), true);
                wCStoryVideoPlayReportStruct.Z = wCStoryVideoPlayReportStruct.b("VideoFlag", f0Var.f313011c, true);
                wCStoryVideoPlayReportStruct.f62150t = e0Var.f312983c;
                wCStoryVideoPlayReportStruct.f62151u = e0Var.f312984d;
                wCStoryVideoPlayReportStruct.f62152v = e0Var.f312986f;
                wCStoryVideoPlayReportStruct.f62153w = e0Var.f312985e;
                wCStoryVideoPlayReportStruct.f62154x = e0Var.f312982b;
                wCStoryVideoPlayReportStruct.f62155y = e0Var.f312987g;
                wCStoryVideoPlayReportStruct.f62156z = e0Var.f312988h;
                wCStoryVideoPlayReportStruct.A = e0Var.f312989i;
                wCStoryVideoPlayReportStruct.B = e0Var.f312990j;
                wCStoryVideoPlayReportStruct.C = e0Var.f312991k ? 1L : 0L;
                wCStoryVideoPlayReportStruct.D = e0Var.f312992l;
                wCStoryVideoPlayReportStruct.E = e0Var.f312993m;
                wCStoryVideoPlayReportStruct.F = e0Var.f312994n;
                wCStoryVideoPlayReportStruct.G = e0Var.f312995o;
                wCStoryVideoPlayReportStruct.H = e0Var.f312996p;
                wCStoryVideoPlayReportStruct.I = e0Var.f312997q ? 1L : 0L;
                wCStoryVideoPlayReportStruct.f62130J = e0Var.f312998r;
                wCStoryVideoPlayReportStruct.K = e0Var.f312999s;
                wCStoryVideoPlayReportStruct.L = e0Var.f313000t;
                wCStoryVideoPlayReportStruct.M = wCStoryVideoPlayReportStruct.b("Iplist", e0Var.f313001u, true);
                wCStoryVideoPlayReportStruct.N = wCStoryVideoPlayReportStruct.b("XClientIp", e0Var.f313002v, true);
                wCStoryVideoPlayReportStruct.O = e0Var.f313003w ? 1L : 0L;
                wCStoryVideoPlayReportStruct.P = f0Var.f313012d;
                wCStoryVideoPlayReportStruct.Q = 0L;
                wCStoryVideoPlayReportStruct.R = d0Var.f312950y;
                wCStoryVideoPlayReportStruct.S = d0Var.f312924l;
                wCStoryVideoPlayReportStruct.T = c17;
                wCStoryVideoPlayReportStruct.U = 0L;
                wCStoryVideoPlayReportStruct.V = e0Var.f313004x;
                wCStoryVideoPlayReportStruct.W = e0Var.f313005y;
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                wCStoryVideoPlayReportStruct.X = 101L;
                wCStoryVideoPlayReportStruct.Y = e0Var.C;
                int i17 = d0Var.Q;
                if (i17 == 0) {
                    wCStoryVideoPlayReportStruct.f62143m = 0L;
                } else {
                    wCStoryVideoPlayReportStruct.f62143m = d0Var.S / i17;
                }
                wCStoryVideoPlayReportStruct.k();
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(wCStoryVideoPlayReportStruct);
            }
        }
    }

    public final void G(kw2.d0 d0Var) {
        jz5.f0 f0Var;
        java.lang.String str;
        java.lang.String str2;
        int o17;
        int b17;
        jz5.f0 f0Var2;
        java.lang.String str3;
        r45.vf2 vf2Var;
        r45.vf2 vf2Var2;
        org.json.JSONObject e17;
        java.lang.String jSONObject;
        r45.vf2 vf2Var3;
        java.lang.String string;
        boolean E;
        com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", d0Var != null ? f("report19059", d0Var) : null);
        if (d0Var != null) {
            if (d0Var.f312906c == 0) {
                nh.c cVar = this.f313067l;
                if (cVar != null) {
                    synchronized (cVar) {
                        synchronized (cVar) {
                            rh.c1 c1Var = cVar.f337070c;
                            E = c1Var != null ? c1Var.E() : false;
                        }
                        return;
                    }
                    if (E) {
                        com.tencent.mars.xlog.Log.w("Finder.FinderVideoPlayReporter", "cancel powerProfiler, currentFeedId=" + d0Var.f312906c);
                        cVar.a();
                        cVar.b();
                    }
                    return;
                }
                return;
            }
            com.tencent.mm.autogen.mmdata.rpt.FinderVideoPlayStruct finderVideoPlayStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderVideoPlayStruct();
            finderVideoPlayStruct.f58028d = 0L;
            finderVideoPlayStruct.U = this.f313056a.getInteger(5);
            finderVideoPlayStruct.f58032f = d0Var.f312918i;
            finderVideoPlayStruct.f58034g = d0Var.f312928n;
            finderVideoPlayStruct.f58036h = d0Var.f312936r;
            finderVideoPlayStruct.f58038i = d0Var.f312938s;
            finderVideoPlayStruct.f58040j = d0Var.f312920j;
            cu2.x xVar = cu2.x.f222449a;
            so2.i3 c17 = cu2.x.c(xVar, d0Var.f312910e, false, false, false, 14, null);
            finderVideoPlayStruct.f58040j = c17.field_totalSize;
            java.lang.String str4 = c17.field_url;
            if (str4 == null) {
                str4 = "";
            }
            finderVideoPlayStruct.f58030e = finderVideoPlayStruct.b("MediaId", str4, true);
            finderVideoPlayStruct.G0 = d0Var.L0;
            finderVideoPlayStruct.f58042k = d0Var.I;
            finderVideoPlayStruct.f58044l = d0Var.f312930o;
            finderVideoPlayStruct.f58046m = d0Var.f312940t;
            long j17 = d0Var.f312906c;
            finderVideoPlayStruct.f58048n = d0Var.f312944v;
            finderVideoPlayStruct.f58050o = d0Var.f312946w;
            finderVideoPlayStruct.f58052p = d0Var.f312924l;
            finderVideoPlayStruct.f58054q = finderVideoPlayStruct.b("NetType", d0Var.f312948x, true);
            finderVideoPlayStruct.f58056r = finderVideoPlayStruct.b("SessionId", d0Var.f312904b, true);
            finderVideoPlayStruct.f58058s = d0Var.f312926m;
            finderVideoPlayStruct.f58060t = 0L;
            finderVideoPlayStruct.f58062u = d0Var.f312942u;
            finderVideoPlayStruct.f58064v = d0Var.f312952z;
            finderVideoPlayStruct.f58066w = d0Var.A;
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            finderVideoPlayStruct.f58068x = 101L;
            finderVideoPlayStruct.f58070y = d0Var.C;
            finderVideoPlayStruct.f58072z = d0Var.D;
            finderVideoPlayStruct.A = d0Var.E;
            finderVideoPlayStruct.B = d0Var.G;
            finderVideoPlayStruct.C = d0Var.f312901J;
            finderVideoPlayStruct.K(pm0.v.u(j17));
            finderVideoPlayStruct.E = d0Var.Q;
            finderVideoPlayStruct.F = d0Var.T;
            if (this.f313056a.getBoolean(13)) {
                finderVideoPlayStruct.J(pm0.v.u(d0Var.f312906c));
            }
            kw2.e0 e0Var = d0Var.X;
            if (e0Var != null) {
                finderVideoPlayStruct.I = e0Var.f312998r;
                finderVideoPlayStruct.L = e0Var.f312999s;
                finderVideoPlayStruct.X(e0Var.f313006z);
                finderVideoPlayStruct.N = e0Var.A;
                finderVideoPlayStruct.f58027c0 = e0Var.f312982b;
                finderVideoPlayStruct.f58053p0 = e0Var.C;
                finderVideoPlayStruct.a0(e0Var.D);
                finderVideoPlayStruct.f58059s0 = finderVideoPlayStruct.b("NetConnInfo", e0Var.E, true);
                finderVideoPlayStruct.f58057r0 = e0Var.F;
                finderVideoPlayStruct.f58065v0 = e0Var.G;
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                finderVideoPlayStruct.f58059s0 = finderVideoPlayStruct.b("NetConnInfo", r26.i0.t(cu2.x.c(xVar, d0Var.f312910e, false, false, false, 14, null).v0(), ",", ";", false), true);
                com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", "netprofile query " + d0Var.f312910e + " = " + finderVideoPlayStruct.f58059s0);
            }
            finderVideoPlayStruct.f58031e0 = d0Var.S;
            finderVideoPlayStruct.f58029d0 = d0Var.B0;
            com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", "netprofile now " + d0Var.f312910e + " = " + finderVideoPlayStruct.f58059s0);
            d0Var.f312931o0 = d0Var.f312927m0 != d0Var.f312929n0 ? 1 : 0;
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            int streamMaxVolume = ((android.media.AudioManager) systemService).getStreamMaxVolume(3);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append((d0Var.f312927m0 * 100) / streamMaxVolume);
            sb6.append(';');
            sb6.append((d0Var.f312929n0 * 100) / streamMaxVolume);
            sb6.append(';');
            sb6.append(d0Var.f312931o0);
            finderVideoPlayStruct.d0(sb6.toString());
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            cw2.p4 p4Var = cw2.p4.f223911a;
            java.util.Iterator it = cw2.p4.f223912b.iterator();
            while (it.hasNext()) {
                r45.m11 m11Var = (r45.m11) it.next();
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("pos", m11Var.getInteger(12));
                    jSONObject2.put("spe", m11Var.getInteger(9));
                    jSONObject2.put("loadCost", m11Var.getInteger(13));
                    jSONObject2.put("fSize", m11Var.getInteger(5));
                    jSONArray.put(jSONObject2);
                } catch (java.lang.Exception unused) {
                }
            }
            java.lang.String jSONArray2 = jSONArray.toString();
            kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
            finderVideoPlayStruct.H(r26.i0.t(jSONArray2, ",", ";", false));
            finderVideoPlayStruct.H = d0Var.V;
            finderVideoPlayStruct.f58024J = d0Var.f312950y;
            finderVideoPlayStruct.K = d0Var.Z;
            finderVideoPlayStruct.R = ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Ni() ? 1L : 0L;
            finderVideoPlayStruct.V = d0Var.f312933p0;
            finderVideoPlayStruct.W = d0Var.f312937r0;
            if (android.text.TextUtils.isEmpty(d0Var.f312947w0) || android.text.TextUtils.equals(d0Var.f312947w0, com.eclipsesource.mmv8.Platform.UNKNOWN)) {
                int i17 = cu2.x.c(cu2.x.f222449a, d0Var.f312910e, false, false, false, 14, null).field_videoCodecId;
                d0Var.f312947w0 = i17 != 26 ? i17 != 172 ? i17 != 193 ? com.eclipsesource.mmv8.Platform.UNKNOWN : "H266" : "H265" : "H264";
            }
            if (d0Var.f312941t0 == 0) {
                so2.i3 c18 = cu2.x.c(cu2.x.f222449a, d0Var.f312910e, false, false, false, 14, null);
                d0Var.f312941t0 = c18.field_videoBitrate;
                d0Var.f312943u0 = c18.field_audioBitrate;
                d0Var.f312951y0 = c18.field_frameRate;
            }
            finderVideoPlayStruct.P(d0Var.f312947w0 + ';' + d0Var.f312941t0 + ';' + d0Var.f312939s0 + ';' + d0Var.f312943u0 + ';' + d0Var.f312951y0 + ';' + d0Var.f312953z0 + ';' + d0Var.A0 + ';');
            java.lang.String string2 = this.f313056a.getString(1);
            if (string2 == null) {
                string2 = "";
            }
            finderVideoPlayStruct.z(string2);
            java.lang.String string3 = this.f313056a.getString(2);
            if (string3 == null) {
                string3 = "";
            }
            finderVideoPlayStruct.x(string3);
            finderVideoPlayStruct.f58025a0 = finderVideoPlayStruct.b("SessionBuffer", !this.f313056a.getBoolean(13) ? ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(d0Var.f312906c, d0Var.f312908d, this.f313056a.getInteger(5)) : ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(d0Var.f312906c, d0Var.f312908d, this.f313056a.getInteger(5)), true);
            finderVideoPlayStruct.b0(((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.M2().c()).intValue());
            finderVideoPlayStruct.T(java.lang.String.valueOf(d0Var.I()));
            finderVideoPlayStruct.Z(d0Var.G());
            finderVideoPlayStruct.N(d0Var.s());
            finderVideoPlayStruct.O(d0Var.y());
            finderVideoPlayStruct.L(d0Var.r());
            finderVideoPlayStruct.F(d0Var.k());
            finderVideoPlayStruct.c0((int) (d0Var.R() * d0Var.P()));
            finderVideoPlayStruct.A(this.f313058c);
            finderVideoPlayStruct.I(this.f313056a.getString(16));
            i95.m c19 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            com.tencent.mm.plugin.finder.report.e6 hk6 = com.tencent.mm.plugin.finder.report.o3.hk((com.tencent.mm.plugin.finder.report.o3) c19, d0Var.d(), d0Var.c(), this.f313056a.getInteger(5), null, 8, null);
            r45.fl2 a17 = hk6 != null ? hk6.a() : null;
            finderVideoPlayStruct.y((a17 == null || (string = a17.getString(5)) == null) ? "" : r26.i0.v(string, ",", ";", false, 4, null));
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH, java.lang.Float.valueOf(d0Var.R()));
            jSONObject3.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT, java.lang.Float.valueOf(d0Var.P()));
            jSONObject3.put("screenWidth", com.tencent.mm.sdk.platformtools.x2.b().getResources().getDisplayMetrics().widthPixels);
            jSONObject3.put("screenHeight", com.tencent.mm.sdk.platformtools.x2.b().getResources().getDisplayMetrics().heightPixels);
            yr2.k ek6 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
            jSONObject3.put("isMultiBitRate", ek6.v());
            jSONObject3.put("isSecondPre", ek6.w());
            jSONObject3.put("playLinkCnt", ek6.o());
            jSONObject3.put("preLinkCnt", ek6.p());
            jSONObject3.put("startPrePercent", ek6.s());
            jSONObject3.put("startPreSec", ek6.t());
            jSONObject3.put("preTaskCnt", ek6.l());
            jSONObject3.put("maxPrePercent", ek6.k());
            jSONObject3.put("maxPreBytes", ek6.j());
            jSONObject3.put("prevCnt", ek6.q());
            jSONObject3.put("nextCnt", ek6.n());
            jSONObject3.put("maxPreBitRate", ek6.i());
            jz5.o oVar = (jz5.o) ek6.g().get(d0Var.f());
            if (oVar == null || (str = (java.lang.String) oVar.e()) == null) {
                str = "";
            }
            jSONObject3.put("findSpecStep", str);
            jz5.o oVar2 = (jz5.o) ek6.g().get(d0Var.f());
            if (oVar2 == null || (vf2Var3 = (r45.vf2) oVar2.d()) == null || (str2 = vf2Var3.getString(19)) == null) {
                str2 = "";
            }
            jSONObject3.put("transEnhanceInfo", str2);
            jSONObject3.put("hitPreloadBitrate", d0Var.l());
            jSONObject3.put("playDecoderType", d0Var.v());
            jSONObject3.put("fvfrd", d0Var.j());
            jSONObject3.put("mpnn", d0Var.g());
            jSONObject3.put("mpdp", d0Var.e());
            jSONObject3.put("outToMiniView", d0Var.p());
            jSONObject3.put("inFromMiniView", d0Var.n());
            so2.i3 c27 = cu2.x.c(cu2.x.f222449a, d0Var.f(), false, false, false, 14, null);
            if (d0Var.J() > 0) {
                o17 = c27.field_duration * 1000;
                b17 = o17;
            } else {
                nk4.a i18 = d0Var.i();
                long min = java.lang.Math.min(java.lang.Long.max(i18 != null ? i18.c() : 0L, c27.t0()), c27.z0());
                o17 = min >= c27.z0() ? c27.field_duration * 1000 : min <= d0Var.o() ? 0 : (int) (c27.field_duration * 1000 * (((float) (min - d0Var.o())) / ((float) (c27.z0() - d0Var.o()))));
                nk4.a i19 = d0Var.i();
                int d17 = i19 != null ? (int) i19.d() : 0;
                java.lang.Long l17 = (java.lang.Long) kz5.n0.m0(d0Var.z());
                b17 = e06.p.b(d17, (l17 != null ? (int) l17.longValue() : 0) * 1000);
            }
            float f17 = 1000;
            float min2 = java.lang.Math.min(o17, c27.field_duration * 1000) / f17;
            float min3 = java.lang.Math.min(b17, java.lang.Math.min(o17, c27.field_duration * 1000)) / f17;
            jSONObject3.put("playablePos", java.lang.Float.valueOf(min2));
            jSONObject3.put("maxPlayBufferPos", java.lang.Float.valueOf(min3));
            com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", f("maxProgressMs", d0Var) + " playablePosSec：" + min2 + " playablePosSec:" + min3);
            jSONObject3.put("enhanceStrategy", c27.field_enhanceStrategy);
            jSONObject3.put("enhanceGPUScore", c27.field_enhanceGPUScore);
            jSONObject3.put("enhanceStrength", c27.field_enhanceStrength);
            cu2.t tVar = cu2.u.f222441a;
            java.lang.String str6 = (java.lang.String) tVar.i().get(java.lang.Long.valueOf(d0Var.d()));
            if (kotlin.jvm.internal.o.b(str6, (java.lang.String) tVar.g().get(java.lang.Long.valueOf(d0Var.d())))) {
                jSONObject3.put("sspec", 0);
            } else {
                jSONObject3.put("sspec", 1);
            }
            jSONObject3.put(ya.b.SOURCE, str6);
            nk4.a i27 = d0Var.i();
            if (i27 != null) {
                i27.j(jSONObject3);
            }
            jSONObject3.put("hitPreloadSizeReal", d0Var.m());
            jSONObject3.put("playerPrepareActionMs", d0Var.H());
            jSONObject3.put("downloaderStartActionMs", d0Var.h());
            jSONObject3.put("seekBeforeFirstFrame", d0Var.L());
            jSONObject3.put("pauseBeforeFirstFrame", d0Var.q());
            java.lang.String jSONObject4 = jSONObject3.toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            finderVideoPlayStruct.Q(r26.i0.v(jSONObject4, ",", ";", false, 4, null));
            nk4.a i28 = d0Var.i();
            finderVideoPlayStruct.V(i28 != null ? i28.f() : null);
            nk4.a i29 = d0Var.i();
            finderVideoPlayStruct.W(i29 != null ? i29.f() : null);
            finderVideoPlayStruct.C(l());
            java.lang.String string4 = this.f313056a.getString(12);
            finderVideoPlayStruct.B(string4 != null ? r26.i0.v(string4, ",", ";", false, 4, null) : "");
            d0Var.T(d0Var.N0 ? d0Var.O : java.lang.Long.max(d0Var.N, d0Var.M));
            finderVideoPlayStruct.Y(d0Var.N());
            try {
                nk4.a i37 = d0Var.i();
                finderVideoPlayStruct.D((i37 == null || (e17 = i37.e()) == null || (jSONObject = e17.toString()) == null) ? "" : r26.i0.v(jSONObject, ",", ";", false, 4, null));
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("Finder.FinderVideoPlayReporter", "firstFrameDetail error", e18);
            }
            com.tencent.mm.plugin.finder.storage.FinderItem dk6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).dk(d0Var.d());
            if (dk6 != null) {
                finderVideoPlayStruct.P = finderVideoPlayStruct.b("Username", dk6.getUserName(), true);
                f0Var2 = jz5.f0.f302826a;
            } else {
                f0Var2 = null;
            }
            if (f0Var2 == null) {
                finderVideoPlayStruct.P = finderVideoPlayStruct.b("Username", "", true);
            }
            yr2.k ek7 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            jSONObject5.put("limit", ek7.m() * 1000);
            kw2.b0 g17 = g(d0Var.a());
            jSONObject5.put("min", g17.c());
            jSONObject5.put("max", g17.b());
            jSONObject5.put("avg", java.lang.Float.valueOf(g17.a()));
            jSONObject5.put("cov", java.lang.Float.valueOf(g17.d()));
            long j18 = 1000;
            kw2.c0 j19 = j(d0Var.a(), ek7.d() * j18, ek7.e() * j18, ek7.f() * j18);
            jSONObject5.put("l1", j19.d());
            jSONObject5.put("l2", j19.b());
            jSONObject5.put("l3", j19.c());
            jSONObject5.put("l4", j19.a());
            java.lang.String jSONObject6 = jSONObject5.toString();
            kotlin.jvm.internal.o.f(jSONObject6, "toString(...)");
            finderVideoPlayStruct.M(r26.i0.v(jSONObject6, ",", ";", false, 4, null));
            com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", "buffering_health " + finderVideoPlayStruct.t() + " [0~" + ek7.d() + "] [" + ek7.d() + '~' + ek7.e() + "] [" + ek7.e() + '~' + ek7.f() + "] [" + ek7.f() + "~]");
            org.json.JSONArray jSONArray3 = new org.json.JSONArray();
            for (r45.t23 t23Var : d0Var.S()) {
                try {
                    org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                    jSONObject7.put("waitMs", t23Var.getInteger(2));
                    jSONObject7.put("percent", t23Var.getInteger(1));
                    jSONObject7.put("type", t23Var.getInteger(0));
                    jSONArray3.put(jSONObject7);
                } catch (java.lang.Exception unused2) {
                }
            }
            java.lang.String jSONArray4 = jSONArray3.toString();
            kotlin.jvm.internal.o.f(jSONArray4, "toString(...)");
            finderVideoPlayStruct.e0(r26.i0.v(jSONArray4, ",", ";", false, 4, null));
            java.lang.String str7 = "";
            java.util.Iterator it6 = d0Var.z().iterator();
            while (it6.hasNext()) {
                str7 = str7 + ((java.lang.Number) it6.next()).longValue() + ';';
            }
            finderVideoPlayStruct.E((java.lang.String) cu2.u.f222441a.g().get(java.lang.Long.valueOf(d0Var.d())));
            finderVideoPlayStruct.S(str7);
            finderVideoPlayStruct.G(((ag0.o) ((bg0.w) i95.n0.c(bg0.w.class))).Ai());
            org.json.JSONObject jSONObject8 = new org.json.JSONObject();
            jSONObject8.put("playDecodingFps", java.lang.Float.valueOf(d0Var.w()));
            jSONObject8.put("playRenderingFps", java.lang.Float.valueOf(d0Var.D()));
            jSONObject8.put("playDecodeStuckCount", d0Var.t());
            jSONObject8.put("playRenderStuckCount", d0Var.B());
            jSONObject8.put("playDecodeStuckRatio", java.lang.Float.valueOf(d0Var.u()));
            jSONObject8.put("playRenderStuckRatio", java.lang.Float.valueOf(d0Var.C()));
            jSONObject8.put("playDecodingFrames", d0Var.x());
            jSONObject8.put("playRenderingFrames", d0Var.E());
            java.lang.String jSONObject9 = jSONObject8.toString();
            kotlin.jvm.internal.o.f(jSONObject9, "toString(...)");
            finderVideoPlayStruct.R(r26.i0.v(jSONObject9, ",", ";", false, 4, null));
            finderVideoPlayStruct.D0 = finderVideoPlayStruct.b("ampInfo", "", true);
            jz5.o oVar3 = (jz5.o) ((c61.l7) i95.n0.c(c61.l7.class)).ek().g().get(d0Var.f());
            d0Var.U((oVar3 == null || (vf2Var2 = (r45.vf2) oVar3.d()) == null) ? -1 : vf2Var2.getInteger(10));
            finderVideoPlayStruct.U(d0Var.Q());
            finderVideoPlayStruct.w(r26.i0.v(d0Var.b(), ",", ";", false, 4, null));
            finderVideoPlayStruct.f58025a0 = finderVideoPlayStruct.b("SessionBuffer", "", true);
            ni3.a1 a1Var = this.f313065j;
            if (a1Var != null) {
                a1Var.g(d0Var);
            }
            J(d0Var.d(), finderVideoPlayStruct);
            finderVideoPlayStruct.l();
            I(finderVideoPlayStruct, d0Var);
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderVideoPlayStruct);
            H(d0Var);
            kw2.e0 K = d0Var.K();
            if (K != null) {
                r45.m11 m11Var2 = new r45.m11();
                m11Var2.set(0, java.lang.Long.valueOf(d0Var.d()));
                m11Var2.set(1, 0);
                m11Var2.set(9, java.lang.Integer.valueOf((int) finderVideoPlayStruct.u()));
                m11Var2.set(13, java.lang.Integer.valueOf((int) finderVideoPlayStruct.r()));
                m11Var2.set(5, java.lang.Integer.valueOf((int) finderVideoPlayStruct.q()));
                m11Var2.set(3, java.lang.Integer.valueOf(a06.d.b(((float) (finderVideoPlayStruct.q() * finderVideoPlayStruct.s())) / 100.0f)));
                m11Var2.set(4, java.lang.Integer.valueOf(a06.d.b(((float) (finderVideoPlayStruct.p() * finderVideoPlayStruct.q())) / 100.0f)));
                m11Var2.set(2, java.lang.Integer.valueOf(this.f313056a.getInteger(5)));
                m11Var2.set(6, java.lang.Integer.valueOf((int) d0Var.O()));
                m11Var2.set(12, java.lang.Integer.valueOf((int) finderVideoPlayStruct.v()));
                m11Var2.set(11, java.lang.Integer.valueOf(c01.id.e()));
                m11Var2.set(7, java.lang.Integer.valueOf((int) d0Var.F()));
                m11Var2.set(8, java.lang.Integer.valueOf((int) d0Var.M()));
                m11Var2.set(10, d0Var.S());
                m11Var2.set(20, d0Var.y());
                m11Var2.set(16, java.lang.Integer.valueOf(K.a()));
                m11Var2.set(18, K.h());
                m11Var2.set(19, java.lang.Integer.valueOf(K.i()));
                m11Var2.set(17, java.lang.Integer.valueOf(K.d()));
                m11Var2.set(15, java.lang.Long.valueOf(d0Var.I()));
                m11Var2.set(21, java.lang.Long.valueOf(this.f313056a.getBoolean(13) ? d0Var.d() : 0L));
                m11Var2.set(22, java.lang.Integer.valueOf(d0Var.J()));
                r45.sf0 sf0Var = new r45.sf0();
                sf0Var.set(0, java.lang.Long.valueOf(K.f()));
                sf0Var.set(2, java.lang.Long.valueOf(K.g()));
                sf0Var.set(3, java.lang.Long.valueOf(K.c()));
                sf0Var.set(7, K.h());
                sf0Var.set(5, K.b());
                sf0Var.set(4, java.lang.Integer.valueOf(K.d()));
                sf0Var.set(6, 0);
                sf0Var.set(1, java.lang.Long.valueOf(K.e()));
                m11Var2.set(23, sf0Var);
                yr2.k ek8 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
                jz5.o oVar4 = (jz5.o) ek8.g().get(d0Var.f());
                m11Var2.set(24, java.lang.Integer.valueOf(oVar4 != null ? (int) ((java.lang.Number) oVar4.f()).longValue() : 0));
                jz5.o oVar5 = (jz5.o) ek8.g().get(d0Var.f());
                if (oVar5 == null || (vf2Var = (r45.vf2) oVar5.d()) == null || (str3 = vf2Var.getString(0)) == null) {
                    str3 = "";
                }
                m11Var2.set(25, str3);
                m11Var2.set(26, java.lang.Long.valueOf(d0Var.O() * j18));
                m11Var2.set(27, java.lang.Integer.valueOf(d0Var.A()));
                m11Var2.set(28, java.lang.Long.valueOf(K.f()));
                m11Var2.set(30, java.lang.Integer.valueOf((int) d0Var.w()));
                m11Var2.set(31, java.lang.Integer.valueOf((int) d0Var.D()));
                cw2.p4 p4Var2 = cw2.p4.f223911a;
                p4Var2.b(m11Var2, ((c61.l7) i95.n0.c(c61.l7.class)).ek().h());
                p4Var2.c(m11Var2);
                com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", "downloadInfoList " + p4Var2.i().size());
            }
        }
    }

    public final void H(kw2.d0 d0Var) {
        if (d0Var.P > 1000 || d0Var.Z > 0 || d0Var.f312903a0 > 0) {
            r45.qt2 contextObj = this.f313056a;
            this.f313061f.getClass();
            kotlin.jvm.internal.o.g(contextObj, "contextObj");
            com.tencent.mm.autogen.mmdata.rpt.FinderVideoPlayLoadingStruct finderVideoPlayLoadingStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderVideoPlayLoadingStruct();
            finderVideoPlayLoadingStruct.f58011d = finderVideoPlayLoadingStruct.b("FeedId", pm0.v.u(d0Var.f312906c), true);
            finderVideoPlayLoadingStruct.f58012e = contextObj.getInteger(5);
            finderVideoPlayLoadingStruct.f58013f = d0Var.f312926m;
            finderVideoPlayLoadingStruct.f58014g = d0Var.f312932p / 1000;
            finderVideoPlayLoadingStruct.f58015h = d0Var.f312938s;
            finderVideoPlayLoadingStruct.f58016i = finderVideoPlayLoadingStruct.b("SvrBypass", d0Var.M0, true);
            finderVideoPlayLoadingStruct.f58017j = d0Var.P;
            finderVideoPlayLoadingStruct.f58018k = (int) d0Var.Z;
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (r45.t23 t23Var : d0Var.f312923k0) {
                if (t23Var.getInteger(0) == 1) {
                    finderVideoPlayLoadingStruct.f58020m++;
                    finderVideoPlayLoadingStruct.f58021n += t23Var.getInteger(2);
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("waitMs", t23Var.getInteger(2));
                    jSONObject.put("percent", t23Var.getInteger(1));
                    jSONObject.put("type", t23Var.getInteger(0));
                    jSONArray.put(jSONObject);
                } catch (java.lang.Exception unused) {
                }
            }
            finderVideoPlayLoadingStruct.f58019l = java.lang.Math.max(0L, d0Var.S - finderVideoPlayLoadingStruct.f58021n);
            java.lang.String jSONArray2 = jSONArray.toString();
            kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
            finderVideoPlayLoadingStruct.f58022o = finderVideoPlayLoadingStruct.b("waittingDetail", r26.i0.t(jSONArray2, ",", ";", false), true);
            com.tencent.mars.xlog.Log.i("FinderVideoPlayLoading", "report waitingCountInSeeking:" + d0Var.f312903a0 + ' ' + finderVideoPlayLoadingStruct.n());
            finderVideoPlayLoadingStruct.l();
        }
    }

    public final void I(com.tencent.mm.autogen.mmdata.rpt.FinderVideoPlayStruct finderVideoPlayStruct, kw2.d0 d0Var) {
        if (this.f313063h) {
            java.util.ArrayList arrayList = new java.util.ArrayList(8);
            long j17 = finderVideoPlayStruct.K;
            int i17 = this.f313066k;
            if (j17 > 0) {
                com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
                iDKey.SetID(i17);
                iDKey.SetKey(0);
                iDKey.SetValue(finderVideoPlayStruct.K);
                arrayList.add(iDKey);
            }
            if (finderVideoPlayStruct.f58064v > 0 && finderVideoPlayStruct.K > 0) {
                com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
                iDKey2.SetID(i17);
                iDKey2.SetKey(1);
                iDKey2.SetValue(finderVideoPlayStruct.K);
                arrayList.add(iDKey2);
            }
            if (finderVideoPlayStruct.f58064v > 0 && finderVideoPlayStruct.f58036h > 0) {
                com.tencent.mars.smc.IDKey iDKey3 = new com.tencent.mars.smc.IDKey();
                iDKey3.SetID(i17);
                iDKey3.SetKey(2);
                iDKey3.SetValue(1L);
                arrayList.add(iDKey3);
            }
            if (finderVideoPlayStruct.f58064v > 0 && finderVideoPlayStruct.C > 0) {
                com.tencent.mars.smc.IDKey iDKey4 = new com.tencent.mars.smc.IDKey();
                iDKey4.SetID(i17);
                iDKey4.SetKey(3);
                iDKey4.SetValue(finderVideoPlayStruct.C);
                arrayList.add(iDKey4);
                long j18 = finderVideoPlayStruct.C;
                if (j18 <= 500) {
                    com.tencent.mars.smc.IDKey iDKey5 = new com.tencent.mars.smc.IDKey();
                    iDKey5.SetID(i17);
                    iDKey5.SetKey(5);
                    iDKey5.SetValue(1L);
                    arrayList.add(iDKey5);
                } else if (j18 <= 1000) {
                    com.tencent.mars.smc.IDKey iDKey6 = new com.tencent.mars.smc.IDKey();
                    iDKey6.SetID(i17);
                    iDKey6.SetKey(6);
                    iDKey6.SetValue(1L);
                    arrayList.add(iDKey6);
                } else if (j18 > 1000) {
                    com.tencent.mars.smc.IDKey iDKey7 = new com.tencent.mars.smc.IDKey();
                    iDKey7.SetID(i17);
                    iDKey7.SetKey(7);
                    iDKey7.SetValue(1L);
                    arrayList.add(iDKey7);
                }
            }
            if (finderVideoPlayStruct.f58064v > 0 && finderVideoPlayStruct.f58031e0 > 0) {
                com.tencent.mars.smc.IDKey iDKey8 = new com.tencent.mars.smc.IDKey();
                iDKey8.SetID(i17);
                iDKey8.SetKey(4);
                iDKey8.SetValue(finderVideoPlayStruct.f58031e0);
                arrayList.add(iDKey8);
            }
            if (finderVideoPlayStruct.R == 1) {
                com.tencent.mars.smc.IDKey iDKey9 = new com.tencent.mars.smc.IDKey();
                iDKey9.SetID(i17);
                iDKey9.SetValue(1L);
                int i18 = d0Var.U;
                if (i18 == 102) {
                    iDKey9.SetKey(104);
                    arrayList.add(iDKey9);
                } else if (i18 == 101) {
                    iDKey9.SetKey(105);
                    arrayList.add(iDKey9);
                }
            }
            com.tencent.mars.smc.IDKey iDKey10 = new com.tencent.mars.smc.IDKey();
            iDKey10.SetID(i17);
            iDKey10.SetKey(100);
            iDKey10.SetValue(1L);
            arrayList.add(iDKey10);
            if (finderVideoPlayStruct.f58064v > 0) {
                com.tencent.mars.smc.IDKey iDKey11 = new com.tencent.mars.smc.IDKey();
                iDKey11.SetID(i17);
                iDKey11.SetKey(101);
                iDKey11.SetValue(1L);
                arrayList.add(iDKey11);
            }
            if (finderVideoPlayStruct.f58064v > 0 && finderVideoPlayStruct.C > 0) {
                com.tencent.mars.smc.IDKey iDKey12 = new com.tencent.mars.smc.IDKey();
                iDKey12.SetID(i17);
                iDKey12.SetKey(102);
                iDKey12.SetValue(1L);
                arrayList.add(iDKey12);
            }
            if (finderVideoPlayStruct.f58064v > 0 && finderVideoPlayStruct.f58031e0 > 0) {
                com.tencent.mars.smc.IDKey iDKey13 = new com.tencent.mars.smc.IDKey();
                iDKey13.SetID(i17);
                iDKey13.SetKey(103);
                iDKey13.SetValue(1L);
                arrayList.add(iDKey13);
            }
            if (!arrayList.isEmpty()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, false, false);
            }
        }
    }

    public final void J(long j17, com.tencent.mm.autogen.mmdata.rpt.FinderVideoPlayStruct finderVideoPlayStruct) {
        boolean E;
        qh.b bVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateApmInfoOnStop, currProfiler=");
        nh.c cVar = this.f313067l;
        sb6.append(cVar != null ? java.lang.Integer.valueOf(cVar.f337069b) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", sb6.toString());
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.tencent.mm.sdk.platformtools.c0 c0Var = or2.j.f347658c;
            or2.h hVar = (or2.h) c0Var.b(java.lang.Long.valueOf(j17));
            if (hVar != null) {
                jSONObject.put("feed_id", pm0.v.u(j17));
                jSONObject.put("jank", hVar.f());
                jSONObject.put("big_jank", hVar.c());
                jSONObject.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS, hVar.e());
                jSONObject.put("display_fps", hVar.f347629b);
                jSONObject.put(ya.b.SCORE, 0);
                jSONObject.put("duration_ms", hVar.d());
            }
            c0Var.e(java.lang.Long.valueOf(j17));
            nh.c cVar2 = this.f313067l;
            if (cVar2 != null) {
                synchronized (cVar2) {
                    try {
                        synchronized (cVar2) {
                            rh.c1 c1Var = cVar2.f337070c;
                            E = c1Var != null ? c1Var.E() : false;
                        }
                    } catch (java.lang.Throwable th6) {
                        throw th6;
                    }
                }
                if (E) {
                    rh.c1 c17 = cVar2.c();
                    if (c17 != null && (bVar = c17.f395330l) != null) {
                        long j18 = bVar.f363321n;
                        int i17 = bVar.f363312e;
                        if (ph.t.f354283k == null) {
                            synchronized ("Matrix.battery.LifeCycle") {
                                if (ph.t.f354283k == null) {
                                    throw new java.lang.IllegalStateException("Call #init() first!".toString());
                                }
                            }
                        }
                        ph.t tVar = ph.t.f354283k;
                        kotlin.jvm.internal.o.d(tVar);
                        boolean c18 = tVar.c().c();
                        int s17 = c17.s();
                        int A = c17.A();
                        rh.b3 B = c17.B(oh.f.class);
                        float e17 = B != null ? ri.b0.e((float) B.f395316h, 2) : 0.0f;
                        jSONObject.put("duringMillis", j18);
                        jSONObject.put("devChargingRate", i17);
                        jSONObject.put("powerSaveMode", c18 ? 1 : 0);
                        jSONObject.put("cpuLoad", s17);
                        jSONObject.put("cpuLoadNor", A);
                        jSONObject.put("gpuLoad", java.lang.Float.valueOf(e17));
                        c17.C(rh.t1.class, new kw2.h0(this, jSONObject));
                        c17.C(rh.c2.class, new kw2.i0(this, jSONObject));
                        c17.C(gi.l.class, new kw2.j0(this, jSONObject));
                        c17.u(oh.b.class, new kw2.k0(jSONObject));
                        rh.b3 B2 = c17.B(oh.c.class);
                        if (B2 != null) {
                            float e18 = e(this, B2.f395316h);
                            float e19 = e(this, B2.f395314f);
                            float e27 = e(this, B2.f395315g);
                            jSONObject.put("batteryVoltageAvg", java.lang.Float.valueOf(e18));
                            jSONObject.put("batteryVoltageMax", java.lang.Float.valueOf(e19));
                            jSONObject.put("batteryVoltageMin", java.lang.Float.valueOf(e27));
                        }
                        rh.b3 B3 = c17.B(rh.r1.class);
                        if (B3 != null) {
                            float e28 = e(this, B3.f395316h);
                            float e29 = e(this, B3.f395314f);
                            float e37 = e(this, B3.f395315g);
                            jSONObject.put("batteryCurrentAvg", java.lang.Float.valueOf(e28));
                            jSONObject.put("batteryCurrentMax", java.lang.Float.valueOf(e29));
                            jSONObject.put("batteryCurrentMin", java.lang.Float.valueOf(e37));
                        }
                        c17.u(uh.g.class, new kw2.l0(this, jSONObject));
                        cw2.p4 p4Var = cw2.p4.f223911a;
                        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power");
                        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                        jSONObject.put("lowPowerMode", ((android.os.PowerManager) systemService).isPowerSaveMode() ? 1 : 0);
                        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        kotlin.jvm.internal.o.f(context, "getContext(...)");
                        jSONObject.put("thermalState", wh.m.l(context));
                        jSONObject.put("batteryChargeInfo", p4Var.f());
                        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        kotlin.jvm.internal.o.f(context2, "getContext(...)");
                        jSONObject.put("batteryInfo", wh.m.i(context2));
                        jSONObject.put("cpuUsage", 0);
                        jSONObject.put("deviceCpuUsage", p4Var.g());
                    }
                    cVar2.b();
                } else {
                    com.tencent.mars.xlog.Log.w("Finder.FinderVideoPlayReporter", "no yet started, skip it");
                }
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            finderVideoPlayStruct.D0 = finderVideoPlayStruct.b("ampInfo", r26.i0.t(jSONObject2, ",", ";", false), true);
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("Finder.FinderVideoPlayReporter", "updateApmInfoOnStop " + th7);
        }
    }

    public void K(int i17, java.lang.String contextId) {
        kotlin.jvm.internal.o.g(contextId, "contextId");
        this.f313056a.set(1, contextId);
        this.f313056a.set(5, java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", "updateReportContext " + i17 + ' ' + contextId);
    }

    @Override // nk4.s
    public void a(nk4.b data, java.lang.String str) {
        kotlin.jvm.internal.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f313059d.get(java.lang.Long.valueOf(data.f338064a));
        if (d0Var != null) {
            d0Var.Y = true;
            com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", f("onDownloadStart", d0Var));
        }
    }

    @Override // nk4.s
    public void b(nk4.i data, java.lang.String str) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", "onDownloadStop");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f313059d;
        long j17 = data.f338064a;
        kw2.d0 d0Var = (kw2.d0) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        dn.h hVar = data.f338089e;
        dn.o oVar = data.f338088d;
        if (d0Var != null && d0Var.Y) {
            if (oVar != null && d0Var.W == null) {
                d0Var.W = i(oVar);
            }
            if (hVar != null && d0Var.X == null) {
                d0Var.X = h(hVar);
            }
            d0Var.Y = false;
            com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", f("onDownloadStop", d0Var));
        }
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f313057b;
        java.util.ArrayList<kw2.d0> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : concurrentLinkedDeque) {
            if (((kw2.d0) obj).f312906c == j17) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<kw2.d0> arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (kw2.d0 d0Var2 : arrayList) {
            if (oVar != null && d0Var2.W == null) {
                d0Var2.W = i(oVar);
            }
            if (hVar != null && d0Var2.X == null) {
                d0Var2.X = h(hVar);
            }
            arrayList2.add(d0Var2);
        }
        concurrentLinkedDeque.removeAll(arrayList2);
        com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", "lazyReportDataList " + concurrentLinkedDeque.size() + " reportList " + arrayList2.size());
        for (kw2.d0 d0Var3 : arrayList2) {
            G(d0Var3);
            F(d0Var3);
        }
    }

    public final java.lang.String f(java.lang.String str, kw2.d0 d0Var) {
        return d0Var.f312902a + ' ' + str + " position:" + d0Var.f312926m + " bgPreparedStatus:" + d0Var.C0;
    }

    public final kw2.b0 g(java.util.List list) {
        if (list.isEmpty()) {
            return new kw2.b0(0L, 0L, 0.0f, 0.0f);
        }
        java.lang.Long l17 = (java.lang.Long) kz5.n0.o0(list);
        long longValue = l17 != null ? l17.longValue() : 0L;
        java.lang.Long l18 = (java.lang.Long) kz5.n0.m0(list);
        long longValue2 = l18 != null ? l18.longValue() : 0L;
        float J0 = ((float) kz5.n0.J0(list)) / list.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Float.valueOf((float) java.lang.Math.pow(((float) ((java.lang.Number) it.next()).longValue()) - J0, 2)));
        }
        return new kw2.b0(longValue, longValue2, J0, list.size() > 1 ? kz5.n0.H0(arrayList) / (list.size() - 1) : 0.0f);
    }

    public final kw2.e0 h(dn.h hVar) {
        java.lang.String str = hVar.f241766a;
        if (str == null) {
            str = "";
        }
        kw2.e0 e0Var = new kw2.e0(str);
        e0Var.f312982b = hVar.field_retCode;
        e0Var.f312983c = hVar.field_fileLength;
        e0Var.f312984d = hVar.field_recvedBytes;
        e0Var.f312985e = hVar.field_endTime;
        e0Var.f312986f = hVar.field_startTime;
        e0Var.f312987g = hVar.field_enQueueTime;
        e0Var.f312988h = hVar.field_moovRequestTimes;
        e0Var.f312989i = hVar.field_moovCost;
        e0Var.f312990j = hVar.field_moovSize;
        e0Var.f312991k = hVar.field_moovCompleted;
        e0Var.f312992l = hVar.field_moovFailReason;
        e0Var.f312993m = hVar.field_firstConnectCost;
        e0Var.f312994n = hVar.field_firstRequestCost;
        e0Var.f312995o = hVar.field_firstRequestSize;
        e0Var.f312996p = hVar.field_firstRequestDownloadSize;
        e0Var.f312997q = hVar.field_firstRequestCompleted;
        e0Var.f312998r = hVar.field_averageSpeed;
        e0Var.f312999s = hVar.field_averageConnectCost;
        e0Var.f313000t = hVar.field_netConnectTimes;
        java.lang.String a17 = hVar.a();
        if (a17 != null) {
            e0Var.f313001u = a17;
        }
        java.lang.String str2 = hVar.field_clientIP;
        if (str2 != null) {
            e0Var.f313002v = str2;
        }
        e0Var.f313003w = hVar.field_isCrossNet;
        e0Var.f313004x = hVar.f241775j;
        e0Var.f313005y = hVar.f241776k;
        java.lang.String str3 = hVar.f241769d;
        if (str3 != null) {
            e0Var.f313006z = str3;
        }
        e0Var.A = hVar.f241770e;
        e0Var.B = hVar.f241771f;
        e0Var.C = hVar.f241777l;
        java.lang.String field_videoCdnMsg = hVar.field_videoCdnMsg;
        kotlin.jvm.internal.o.f(field_videoCdnMsg, "field_videoCdnMsg");
        e0Var.D = field_videoCdnMsg;
        java.lang.String field_videoFlag = hVar.field_videoFlag;
        kotlin.jvm.internal.o.f(field_videoFlag, "field_videoFlag");
        java.lang.String profile = hVar.f241778m;
        kotlin.jvm.internal.o.f(profile, "profile");
        e0Var.E = r26.i0.t(profile, ",", ";", false);
        e0Var.F = hVar.field_waitResponseCostTime;
        e0Var.G = hVar.f241775j;
        e0Var.H = hVar.field_receiveCostTime;
        return e0Var;
    }

    public final kw2.f0 i(dn.o oVar) {
        java.lang.String str = oVar.field_mediaId;
        if (str == null) {
            str = "";
        }
        kw2.f0 f0Var = new kw2.f0(str);
        f0Var.f313010b = oVar.field_requestVideoFormat;
        java.lang.String videoFlag = oVar.X1;
        kotlin.jvm.internal.o.f(videoFlag, "videoFlag");
        f0Var.f313011c = videoFlag;
        f0Var.f313012d = oVar.W1;
        return f0Var;
    }

    public final kw2.c0 j(java.util.List list, long j17, long j18, long j19) {
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        while (it.hasNext()) {
            long longValue = ((java.lang.Number) it.next()).longValue();
            if (longValue < j17) {
                i17++;
            } else {
                if (j17 <= longValue && longValue < j18) {
                    i18++;
                } else {
                    if (j18 <= longValue && longValue < j19) {
                        i19++;
                    } else if (longValue >= j19) {
                        i27++;
                    }
                }
            }
        }
        return new kw2.c0(i17, i18, i19, i27);
    }

    public final void k(kw2.d0 d0Var) {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        d0Var.f312929n0 = ((android.media.AudioManager) systemService).getStreamVolume(3);
        com.tencent.mm.feature.sight.api.o oVar = (com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class);
        java.lang.String str = d0Var.f312916h;
        ((be0.e) oVar).getClass();
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
        if (d17 != null) {
            d0Var.f312941t0 = d17.f162383b;
            d0Var.f312943u0 = d17.f162388g;
        }
        if (d0Var.P == 0) {
            d0Var.P = d0Var.N0 ? d0Var.O : java.lang.Long.max(d0Var.N, d0Var.M);
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        if (d0Var.f312928n == 0) {
            d0Var.f312928n = uptimeMillis - d0Var.f312924l;
            long j17 = d0Var.F;
            if (j17 > 0) {
                d0Var.E += uptimeMillis - j17;
                d0Var.F = 0L;
            }
            long j18 = d0Var.H;
            if (j18 > 0) {
                d0Var.G += uptimeMillis - j18;
                d0Var.H = 0L;
            }
        }
        long j19 = d0Var.R;
        if (j19 > 0) {
            d0Var.S += uptimeMillis - j19;
            r45.t23 t23Var = new r45.t23();
            t23Var.set(2, java.lang.Integer.valueOf((int) (uptimeMillis - d0Var.R)));
            t23Var.set(1, java.lang.Integer.valueOf((int) d0Var.f312932p));
            t23Var.set(0, 0);
            d0Var.f312923k0.add(t23Var);
            d0Var.R = 0L;
        }
        if (d0Var.f312901J == 0 && d0Var.B && d0Var.f312930o < 5) {
            d0Var.C = 1;
        }
    }

    public final java.lang.String l() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String string = this.f313056a.getString(11);
            if (string != null) {
                if (string.length() > 0) {
                    jSONObject = new org.json.JSONObject(string);
                }
            }
            try {
                if (!android.text.TextUtils.isEmpty(com.tencent.mm.plugin.finder.report.r0.f125280r)) {
                    jSONObject.put("bell_info", com.tencent.mm.plugin.finder.report.r0.f125280r);
                }
            } catch (java.lang.Exception unused) {
            }
            java.lang.Object obj = this.f313064i.get("kWCFinderLVPlayerImmersiveInfo");
            java.util.Map map = obj instanceof java.util.Map ? (java.util.Map) obj : null;
            if (map != null) {
                for (java.util.Map.Entry entry : map.entrySet()) {
                    jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
                }
            }
            if (jSONObject.length() > 0) {
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                return r26.i0.t(jSONObject2, ",", ";", false);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", "generateExtraInfo error " + e17);
        }
        return null;
    }

    public final java.lang.String m(java.lang.String str, kw2.d0 d0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("kernelFirstFrameTimeInfo \n");
        sb6.append(str);
        sb6.append(" \n==> firstLoadTime:");
        sb6.append(d0Var.I);
        sb6.append(" firstFrameTime:");
        sb6.append(d0Var.f312901J);
        sb6.append(" \n==========\n==> max:");
        sb6.append(d0Var.N0 ? d0Var.O : java.lang.Long.max(d0Var.N, d0Var.M));
        sb6.append(" onStartTime:");
        sb6.append(d0Var.M);
        sb6.append(" userPrepared:");
        sb6.append(d0Var.L);
        sb6.append(" playerPrepared:");
        sb6.append(d0Var.K);
        sb6.append(" firstVideo:");
        sb6.append(d0Var.N);
        sb6.append(" firstAudio:");
        sb6.append(d0Var.O);
        return sb6.toString();
    }

    public void n(nk4.g data) {
        kotlin.jvm.internal.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f313059d.get(java.lang.Long.valueOf(data.f338064a));
        if (d0Var != null) {
            d0Var.f312940t = data.f338065b - d0Var.f312924l;
            dn.h hVar = data.f338085d;
            if (hVar != null && d0Var.X == null) {
                d0Var.X = h(hVar);
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", f("onDownloadFinish", d0Var));
        }
    }

    public void o(nk4.h data) {
        kotlin.jvm.internal.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f313059d.get(java.lang.Long.valueOf(data.f338064a));
        if (d0Var != null) {
            long j17 = data.f338087e;
            int i17 = j17 != 0 ? (int) ((((float) data.f338086d) * 100.0f) / ((float) j17)) : 0;
            if (i17 > d0Var.f312942u) {
                d0Var.f312942u = i17;
            }
        }
    }

    public void p(nk4.j data) {
        kotlin.jvm.internal.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f313059d.get(java.lang.Long.valueOf(data.f338064a));
        if (d0Var != null) {
            if (d0Var.O == 0) {
                d0Var.O = data.f338065b - d0Var.f312924l;
            }
            long j17 = d0Var.O;
            long j18 = d0Var.E;
            if (j17 > j18) {
                d0Var.O = j17 - j18;
            }
            d0Var.N0 = true;
            com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", f("onFirstAudioFrameRendered", d0Var) + " onFirstAudioFrameRendered:" + d0Var.O + ' ' + m("onFirstAudioFrameRendered", d0Var));
        }
    }

    public void q(nk4.k data) {
        kotlin.jvm.internal.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f313059d.get(java.lang.Long.valueOf(data.f338064a));
        if (d0Var != null) {
            if (d0Var.f312901J == 0) {
                long j17 = data.f338065b - d0Var.f312924l;
                d0Var.f312901J = j17;
                long j18 = d0Var.E;
                if (j17 > j18) {
                    d0Var.f312901J = j17 - j18;
                }
                if (j18 != 0) {
                    d0Var.V0 = 1;
                }
                long j19 = d0Var.f312901J;
                pw2.a aVar = this.f313060e;
                aVar.f358684d = j19;
                long j27 = aVar.f358682b + j19;
                aVar.f358682b = j27;
                int i17 = aVar.f358683c + 1;
                aVar.f358683c = i17;
                com.tencent.mars.xlog.Log.i(aVar.f358681a, "count:" + aVar.f358683c + " current:" + aVar.f358684d + ",  average:" + ((((float) j27) * 1.0f) / i17));
            }
            long j28 = d0Var.I;
            long j29 = data.f338091e;
            if (j28 == 0) {
                d0Var.I = j29;
            }
            if (d0Var.K == 0) {
                d0Var.K = j29;
            }
            d0Var.U = data.f338090d;
            if (d0Var.f312901J > 1000) {
                com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", f("firstFrameTimeCauseBuffering", d0Var) + " firstFrameTime:" + d0Var.f312901J + " firstLoadTime:" + d0Var.I + " playDecoderType=" + d0Var.U);
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", f("onFirstFrameUpdate", d0Var) + " firstFrameTime:" + d0Var.f312901J + " firstLoadTime:" + d0Var.I + " playDecoderType=" + d0Var.U + ' ' + m("onFirstFrameUpdate", d0Var));
        }
    }

    public void r(nk4.k data) {
        kotlin.jvm.internal.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f313059d.get(java.lang.Long.valueOf(data.f338064a));
        if (d0Var != null) {
            if (d0Var.N == 0) {
                long j17 = data.f338065b - d0Var.f312924l;
                d0Var.N = j17;
                long j18 = d0Var.E;
                if (j17 > j18) {
                    d0Var.N = j17 - j18;
                }
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", f("onFirstVideoFrameRendered", d0Var) + " firstVideoFrameRendered:" + d0Var.N + ' ' + m("onFirstVideoFrameRendered", d0Var));
        }
    }

    public void s(nk4.l data) {
        kotlin.jvm.internal.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f313059d.get(java.lang.Long.valueOf(data.f338064a));
        if (d0Var != null) {
            if (d0Var.f312944v == 0) {
                d0Var.f312944v = (data.f338065b - d0Var.f312924l) - d0Var.E;
            }
            d0Var.f312946w = data.f338092d + data.f338093e;
            d0Var.B = false;
            com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", f("onMoovReady", d0Var) + " moovReadyTime:" + d0Var.f312944v);
        }
    }

    public void t(nk4.m data) {
        kotlin.jvm.internal.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f313059d.get(java.lang.Long.valueOf(data.f338064a));
        if (d0Var != null) {
            nk4.a aVar = data.f338094d;
            d0Var.I0 = aVar != null ? aVar.a() : null;
            d0Var.f312949x0 = false;
            long j17 = data.f338065b;
            d0Var.F = j17;
            long j18 = d0Var.H;
            if (j18 > 0) {
                d0Var.G += j17 - j18;
                d0Var.H = 0L;
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", f("onPause", d0Var) + " realPlayTime:" + d0Var.G);
        }
    }

    public void u(nk4.n data) {
        kotlin.jvm.internal.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f313059d.get(java.lang.Long.valueOf(data.f338064a));
        if (d0Var != null) {
            d0Var.B0 = data.f338095d;
            com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", f("onPlayError", d0Var) + " playerErrCode:" + d0Var.B0);
        }
    }

    public void v(nk4.r data) {
        kotlin.jvm.internal.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f313059d.get(java.lang.Long.valueOf(data.f338064a));
        if (d0Var != null) {
            java.util.HashSet hashSet = d0Var.f312925l0;
            long j17 = data.f338100d;
            hashSet.add(java.lang.Long.valueOf(j17));
            d0Var.f312932p = j17;
            d0Var.f312934q = java.lang.Long.max(d0Var.f312934q, j17);
            long j18 = data.f338101e;
            int i17 = j18 != 0 ? (int) ((((float) j17) * 100.0f) / ((float) j18)) : 0;
            if (i17 > d0Var.f312930o) {
                d0Var.f312930o = i17;
            }
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = d0Var.W0;
            if (!copyOnWriteArrayList.isEmpty() || j17 >= 1) {
                copyOnWriteArrayList.add(java.lang.Long.valueOf(data.f338102f));
            }
        }
    }

    public void w(nk4.p data) {
        kotlin.jvm.internal.o.g(data, "data");
        nk4.t tVar = data.f338098d;
        this.f313058c = tVar != null ? tVar.f338104b : this.f313058c;
        com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", "onPlayerConfig enableRendererSharpen:" + this.f313058c);
        kw2.d0 d0Var = (kw2.d0) this.f313059d.get(java.lang.Long.valueOf(data.f338064a));
        if (d0Var != null) {
            d0Var.D0 = tVar != null ? tVar.f338103a : -1;
            d0Var.E0 = tVar != null ? tVar.f338105c : -1;
            d0Var.F0 = tVar != null ? tVar.f338106d : -1;
            java.lang.String str = tVar != null ? tVar.f338108f : null;
            if (str == null) {
                str = "0";
            }
            d0Var.G0 = str;
            d0Var.H0 = tVar != null ? tVar.f338107e : -1;
            com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", f("onPlayerConfig", d0Var) + " mediaCodecInitDuration " + d0Var.H0 + " enableMediaCodecReuse:" + d0Var.D0 + " mediaCodecReuseEnabled:" + d0Var.E0 + " mediaCodecReused:" + d0Var.F0 + " mediaCodecErrorCode:" + d0Var.G0);
        }
    }

    public void x(nk4.q data) {
        kotlin.jvm.internal.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f313059d.get(java.lang.Long.valueOf(data.f338064a));
        if (d0Var != null) {
            if (d0Var.L == 0) {
                long j17 = d0Var.f312924l;
                if (j17 != 0) {
                    d0Var.L = data.f338065b - j17;
                }
            }
            long j18 = d0Var.L;
            long j19 = d0Var.E;
            if (j18 > j19) {
                d0Var.L = j18 - j19;
            }
            if (d0Var.K == 0) {
                d0Var.K = data.f338099d;
            }
            so2.i3 c17 = cu2.x.c(cu2.x.f222449a, d0Var.f312910e, false, false, false, 14, null);
            int i17 = c17.field_videoCodecId;
            d0Var.f312947w0 = i17 != 26 ? i17 != 172 ? i17 != 193 ? com.eclipsesource.mmv8.Platform.UNKNOWN : "H266" : "H265" : "H264";
            d0Var.f312941t0 = c17.field_videoBitrate;
            d0Var.f312943u0 = c17.field_audioBitrate;
            d0Var.f312951y0 = c17.field_frameRate;
            com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", f("onPrepared", d0Var) + " playerPreparedTime:" + d0Var.L + ' ' + m("onPrepared", d0Var));
        }
    }

    public void y() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRelease(), size:");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f313059d;
        sb6.append(concurrentHashMap != null ? java.lang.Integer.valueOf(concurrentHashMap.size()) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", sb6.toString());
        java.util.Iterator it = this.f313059d.entrySet().iterator();
        while (it.hasNext()) {
            kw2.d0 d0Var = (kw2.d0) ((java.util.Map.Entry) it.next()).getValue();
            k(d0Var);
            com.tencent.mars.xlog.Log.i("Finder.FinderVideoPlayReporter", f("onRelease", d0Var) + " playTime:" + d0Var.f312928n + " pauseTotalTime:" + d0Var.E + " realPlayTime:" + d0Var.G + " playStatus:" + d0Var.C);
            G(d0Var);
            F(d0Var);
        }
        this.f313059d = new java.util.concurrent.ConcurrentHashMap();
    }

    public void z(nk4.b data) {
        kotlin.jvm.internal.o.g(data, "data");
        kw2.d0 d0Var = (kw2.d0) this.f313059d.get(java.lang.Long.valueOf(data.f338064a));
        if (d0Var != null) {
            d0Var.A++;
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.String string = this.f313056a.getString(2);
            if (string == null) {
                string = "";
            }
            hashMap.put("finder_tab_context_id", string);
            java.lang.String string2 = this.f313056a.getString(1);
            hashMap.put("finder_context_id", string2 != null ? string2 : "");
            hashMap.put("comment_scene", java.lang.Integer.valueOf(this.f313056a.getInteger(5)));
            hashMap.put("feed_id", pm0.v.u(d0Var.f312906c));
            hashMap.put("session_buffer", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(d0Var.f312906c, d0Var.f312908d, this.f313056a.getInteger(5)));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("progress_completion", null, hashMap, 1, false);
        }
    }
}
