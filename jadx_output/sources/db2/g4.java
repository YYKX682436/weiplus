package db2;

/* loaded from: classes2.dex */
public final class g4 extends az2.o {
    public final java.lang.String A;
    public final boolean B;
    public final boolean C;
    public final java.lang.String D;
    public final int E;
    public final r45.u32 F;
    public final boolean G;
    public final r45.sf6 H;
    public final com.tencent.mm.protobuf.g I;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.String f227981J;
    public final r45.a34 K;
    public final java.lang.String L;
    public final int M;
    public final java.lang.String N;
    public final r45.nv2 P;
    public final r45.tj2 Q;
    public final long R;
    public java.lang.String S;
    public long T;
    public cz2.f U;

    /* renamed from: t, reason: collision with root package name */
    public final long f227982t;

    /* renamed from: u, reason: collision with root package name */
    public final int f227983u;

    /* renamed from: v, reason: collision with root package name */
    public final int f227984v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f227985w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f227986x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.yj0 f227987y;

    /* renamed from: z, reason: collision with root package name */
    public final long f227988z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(long j17, java.lang.String str, int i17, int i18, java.lang.String feedUsername, boolean z17, com.tencent.mm.protobuf.g gVar, com.tencent.mm.plugin.finder.storage.yj0 yj0Var, long j18, java.lang.String str2, boolean z18, boolean z19, java.lang.String str3, r45.qt2 qt2Var, int i19, r45.u32 u32Var, boolean z27, r45.sf6 sf6Var, com.tencent.mm.protobuf.g gVar2, java.lang.String str4, r45.a34 a34Var, java.lang.String str5, int i27, int i28, java.lang.String str6, r45.nv2 nv2Var, boolean z28, java.lang.String str7, r45.tj2 tj2Var, int i29, kotlin.jvm.internal.i iVar) {
        super(qt2Var, null, 2, null);
        com.tencent.mm.protobuf.g gVar3;
        r45.sf6 sf6Var2;
        r45.sf6 sf6Var3;
        java.lang.String clientUdfKv;
        java.util.LinkedList<r45.fl2> list;
        r45.kv0 kv0Var;
        boolean z29 = (i29 & 32) != 0 ? false : z17;
        com.tencent.mm.protobuf.g gVar4 = (i29 & 64) != 0 ? null : gVar;
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var2 = (i29 & 128) != 0 ? null : yj0Var;
        long j19 = (i29 & 256) != 0 ? 0L : j18;
        java.lang.String username = (i29 & 512) != 0 ? "" : str2;
        boolean z37 = (i29 & 1024) != 0 ? true : z18;
        boolean z38 = (i29 & 2048) != 0 ? false : z19;
        java.lang.String encryptedObjectId = (i29 & 4096) != 0 ? "" : str3;
        int i37 = (i29 & 16384) != 0 ? 6 : i19;
        r45.u32 u32Var2 = (i29 & 32768) != 0 ? null : u32Var;
        boolean z39 = (i29 & 65536) != 0 ? true : z27;
        if ((i29 & 131072) != 0) {
            gVar3 = gVar4;
            sf6Var2 = null;
        } else {
            gVar3 = gVar4;
            sf6Var2 = sf6Var;
        }
        com.tencent.mm.protobuf.g gVar5 = (i29 & 262144) != 0 ? null : gVar2;
        if ((i29 & 524288) != 0) {
            sf6Var3 = sf6Var2;
            clientUdfKv = "";
        } else {
            sf6Var3 = sf6Var2;
            clientUdfKv = str4;
        }
        r45.a34 a34Var2 = (i29 & 1048576) != 0 ? null : a34Var;
        java.lang.String str8 = (i29 & 2097152) != 0 ? null : str5;
        int i38 = (i29 & 8388608) != 0 ? 0 : i28;
        java.lang.String str9 = (i29 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0 ? null : str6;
        r45.nv2 nv2Var2 = (i29 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0 ? null : nv2Var;
        boolean z47 = (i29 & 67108864) != 0 ? false : z28;
        java.lang.String str10 = (i29 & 134217728) != 0 ? null : str7;
        r45.tj2 tj2Var2 = (i29 & 268435456) != 0 ? null : tj2Var;
        kotlin.jvm.internal.o.g(feedUsername, "feedUsername");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(encryptedObjectId, "encryptedObjectId");
        kotlin.jvm.internal.o.g(clientUdfKv, "clientUdfKv");
        this.f227982t = j17;
        this.f227983u = i17;
        this.f227984v = i18;
        this.f227985w = feedUsername;
        this.f227986x = z29;
        this.f227987y = yj0Var2;
        this.f227988z = j19;
        this.A = username;
        this.B = z37;
        this.C = z38;
        this.D = encryptedObjectId;
        this.E = i37;
        this.F = u32Var2;
        this.G = z39;
        this.H = sf6Var3;
        this.I = gVar5;
        this.f227981J = clientUdfKv;
        r45.a34 a34Var3 = a34Var2;
        this.K = a34Var3;
        java.lang.String str11 = str8;
        this.L = str11;
        this.M = i38;
        this.N = str9;
        this.P = nv2Var2;
        r45.tj2 tj2Var3 = tj2Var2;
        this.Q = tj2Var3;
        this.R = yj0Var2 != null ? yj0Var2.t0() : 0L;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.g51 g51Var = new r45.g51();
        g51Var.set(1, java.lang.Long.valueOf(j17));
        g51Var.set(11, str);
        db2.t4 t4Var = db2.t4.f228171a;
        r45.kv0 b17 = t4Var.b(3763, qt2Var);
        if (z47) {
            cq.k1.a();
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127719ge).getValue()).r()).booleanValue()) {
                b17.set(8, java.lang.Integer.valueOf(b17.getInteger(8) | 4));
            }
        }
        g51Var.set(12, b17);
        t4Var.h((r45.kv0) g51Var.getCustom(12), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), str10)));
        t4Var.k((r45.kv0) g51Var.getCustom(12), a34Var3);
        if (!(str11 == null || str11.length() == 0) && (kv0Var = (r45.kv0) g51Var.getCustom(12)) != null) {
            kv0Var.set(14, str11);
        }
        r45.kv0 kv0Var2 = (r45.kv0) g51Var.getCustom(12);
        if (kv0Var2 != null) {
            kv0Var2.set(15, tj2Var3);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dramaSessionBuffer CgiGetFinderFeedComment ");
        sb6.append(pm0.v.u(tj2Var3 != null ? tj2Var3.getLong(0) : 0L));
        sb6.append(' ');
        sb6.append(tj2Var3 != null ? tj2Var3.getString(1) : null);
        com.tencent.mars.xlog.Log.i("FinderFeedCgi", sb6.toString());
        r45.kv0 kv0Var3 = (r45.kv0) g51Var.getCustom(12);
        if (kv0Var3 != null && (list = kv0Var3.getList(7)) != null) {
            for (r45.fl2 fl2Var : list) {
                if (fl2Var.getLong(0) == this.f227982t) {
                    fl2Var.set(7, this.I);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("objectBaseInfo.id:");
                    sb7.append(pm0.v.u(fl2Var.getLong(0)));
                    sb7.append(", shareBypData.size:");
                    com.tencent.mm.protobuf.g gVar6 = this.I;
                    sb7.append(gVar6 != null ? java.lang.Integer.valueOf(gVar6.f192156a.length) : null);
                    com.tencent.mars.xlog.Log.i("FinderFeedCgi", sb7.toString());
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f227981J)) {
                        fl2Var.set(5, this.f227981J);
                        com.tencent.mars.xlog.Log.i("FinderFeedCgi", "objectBaseInfo.clientUdfKv:" + fl2Var.getString(5));
                    }
                }
            }
        }
        g51Var.set(3, java.lang.Integer.valueOf(this.f227986x ? 1 : 0));
        com.tencent.mm.protobuf.g gVar7 = gVar3;
        g51Var.set(4, gVar7);
        g51Var.set(2, 0L);
        g51Var.set(10, this.D);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.A)) {
            g51Var.set(6, xy2.c.f(qt2Var));
        } else {
            g51Var.set(6, this.A);
        }
        long j27 = this.f227988z;
        if (j27 != 0) {
            g51Var.set(7, java.lang.Long.valueOf(j27));
        }
        g51Var.set(5, java.lang.Long.valueOf(this.R));
        g51Var.set(9, java.lang.Integer.valueOf(this.B ? 2 : 1));
        g51Var.set(8, java.lang.Integer.valueOf(this.f227983u));
        g51Var.set(25, this.H);
        int i39 = this.f227984v;
        int i47 = this.f227983u;
        java.lang.String feedUsername2 = this.f227985w;
        kotlin.jvm.internal.o.g(feedUsername2, "feedUsername");
        com.tencent.mars.xlog.Log.i("FinderFeedCgi", "getIdScene scene:" + i39 + ", commentScene:" + i47);
        int i48 = 1;
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.j().r()).intValue() == 1 || com.tencent.mm.plugin.finder.storage.t70.M != 1) {
            if (i47 != 7) {
                i48 = (i47 == 8 && i39 == 1) ? 1 : 2;
            }
        } else if (!hc2.l.g(feedUsername2)) {
            i48 = 3;
        }
        g51Var.set(13, java.lang.Integer.valueOf(i48));
        g51Var.set(14, java.lang.Integer.valueOf(this.E));
        jz5.l P6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).P6();
        g51Var.set(18, java.lang.Float.valueOf(((java.lang.Number) P6.f302833d).floatValue()));
        g51Var.set(19, java.lang.Float.valueOf(((java.lang.Number) P6.f302834e).floatValue()));
        r45.u32 u32Var3 = this.F;
        if (u32Var3 != null) {
            g51Var.set(21, u32Var3);
        }
        g51Var.set(20, db2.t4.f228171a.n());
        g51Var.set(28, java.lang.Integer.valueOf(this.M));
        g51Var.set(29, this.N);
        g51Var.set(27, this.P);
        lVar.f70664a = g51Var;
        r45.h51 h51Var = new r45.h51();
        h51Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) h51Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = h51Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetcommentdetail";
        lVar.f70667d = 3763;
        p(lVar.a());
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("CgiGetFinderFeedComment init pullScene:");
        sb8.append(this.E);
        sb8.append(" identityScene:");
        sb8.append(g51Var.getInteger(13));
        sb8.append(", feedId=");
        sb8.append(this.f227982t);
        sb8.append(" lastBuffer=");
        sb8.append(gVar7 != null);
        sb8.append(" isSecondCommentFetch=");
        sb8.append(this.f227987y != null);
        sb8.append(" scene ");
        sb8.append(g51Var.getInteger(8));
        sb8.append(", justUpdateObjectStatus:");
        sb8.append(this.C);
        sb8.append(", encryptedObjectid:");
        sb8.append(this.D);
        sb8.append(", commentScene:");
        sb8.append(qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null);
        sb8.append(", source_type:");
        r45.a34 a34Var4 = this.K;
        sb8.append(a34Var4 != null ? java.lang.Integer.valueOf(a34Var4.getInteger(0)) : null);
        sb8.append(" , source_buffer:");
        r45.a34 a34Var5 = this.K;
        sb8.append(a34Var5 != null ? a34Var5.getString(1) : null);
        sb8.append(", lastgmsgid: ");
        sb8.append(this.L);
        sb8.append(", shareUserInfo: ");
        sb8.append(this.P);
        com.tencent.mars.xlog.Log.i("FinderFeedCgi", sb8.toString());
        this.U = cz2.f.f225004f;
    }

    @Override // az2.o, az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        db2.g4 g4Var;
        com.tencent.mm.protocal.protobuf.FinderContact contact;
        java.lang.Object obj;
        jz5.f0 f0Var;
        r45.nw1 liveInfo;
        java.lang.String str2;
        cq.k kVar;
        r45.h51 resp = (r45.h51) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        super.A(i17, i18, str, resp, m1Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" resp=");
        sb6.append(resp);
        sb6.append(" thread=");
        sb6.append(java.lang.Thread.currentThread());
        sb6.append(" isNeedLoadJumperInfo: ");
        boolean z17 = this.G;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("FinderFeedCgi", sb6.toString());
        if (i17 >= 4) {
            this.U = cz2.f.f225002d;
        }
        if (((i17 == 0 && i18 == 0) || hc2.p.b(i17, i18)) && this.f227986x) {
            com.tencent.mars.xlog.Log.i("FinderFeedCgi", "need fetch object");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) resp.getCustom(2);
            if (finderObject != null) {
                r45.qt2 qt2Var = this.f16135n;
                if (qt2Var != null) {
                    java.lang.String str3 = this.S;
                    if (str3 == null || str3.length() == 0) {
                        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        ((com.tencent.mm.plugin.finder.report.o3) c17).rk(finderObject, qt2Var.getInteger(5), null);
                    } else {
                        i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                        kotlin.jvm.internal.o.f(c18, "getService(...)");
                        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c18;
                        int integer = qt2Var.getInteger(5);
                        java.lang.String str4 = this.S;
                        if (str4 == null) {
                            str4 = "";
                        }
                        o3Var.uk(finderObject);
                        if (o3Var.ek(finderObject.getId(), null, integer).length() == 0) {
                            long id6 = finderObject.getId();
                            java.lang.String sessionBuffer = finderObject.getSessionBuffer();
                            if (!(!(sessionBuffer == null || sessionBuffer.length() == 0))) {
                                sessionBuffer = null;
                            }
                            java.lang.String str5 = sessionBuffer == null ? str4 : sessionBuffer;
                            r45.hl2 client_local_buffer = finderObject.getClient_local_buffer();
                            o3Var.qk(id6, null, integer, str5, client_local_buffer != null ? client_local_buffer.getLong(0) : 0L, null);
                        }
                        long id7 = finderObject.getId();
                        r45.dm2 object_extend = finderObject.getObject_extend();
                        java.lang.String string = object_extend != null ? object_extend.getString(62) : null;
                        java.lang.String sessionBuffer2 = finderObject.getSessionBuffer();
                        if (!(!(sessionBuffer2 == null || sessionBuffer2.length() == 0))) {
                            sessionBuffer2 = null;
                        }
                        java.lang.String str6 = sessionBuffer2 == null ? str4 : sessionBuffer2;
                        r45.hl2 client_local_buffer2 = finderObject.getClient_local_buffer();
                        o3Var.qk(id7, string, integer, str6, client_local_buffer2 != null ? client_local_buffer2.getLong(0) : 0L, null);
                        ((cq.k) i95.n0.c(cq.k.class)).Ri(finderObject, integer);
                    }
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).uk(finderObject);
                }
                g4Var = this;
                java.lang.String str7 = g4Var.D;
                if (!(str7.length() > 0)) {
                    str7 = null;
                }
                if (str7 != null && (kVar = (cq.k) i95.n0.c(cq.k.class)) != null) {
                    kVar.f221224e.d(str7, java.lang.Long.valueOf(finderObject.getId()));
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("contextObj.extraInfo: ");
                sb7.append(qt2Var != null ? qt2Var.getString(11) : null);
                com.tencent.mars.xlog.Log.i("FinderFeedCgi", sb7.toString());
                if (z17) {
                    androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class);
                    kotlin.jvm.internal.o.f(a17, "get(...)");
                    xc2.k0.e7((xc2.k0) a17, finderObject, qt2Var != null ? qt2Var.getInteger(5) : 0, g4Var.f16135n, 0, resp.getByteString(14), g4Var.Q, 8, null);
                }
                if (hc2.o0.j(finderObject) == 9) {
                    r45.nw1 liveInfo2 = finderObject.getLiveInfo();
                    java.lang.String string2 = liveInfo2 != null ? liveInfo2.getString(3) : null;
                    if (!(string2 == null || string2.length() == 0) && g4Var.T > 0 && (liveInfo = finderObject.getLiveInfo()) != null) {
                        zy2.z7 z7Var = (zy2.z7) i95.n0.c(zy2.z7.class);
                        r45.nw1 liveInfo3 = finderObject.getLiveInfo();
                        if (liveInfo3 == null || (str2 = liveInfo3.getString(3)) == null) {
                            str2 = "";
                        }
                        liveInfo.set(3, ((b92.v1) z7Var).Ai("FinderGetCommentDetail", str2, g4Var.T));
                    }
                }
                if (i17 == 0 || i18 != 0) {
                }
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> list = resp.getList(1);
                kotlin.jvm.internal.o.f(list, "getCommentInfo(...)");
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo : list) {
                    java.util.Iterator it = linkedList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((com.tencent.mm.protocal.protobuf.FinderCommentInfo) obj).getCommentId() == finderCommentInfo.getCommentId()) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    if (obj == null) {
                        linkedList.add(finderCommentInfo);
                    } else {
                        com.tencent.mars.xlog.Log.w("FinderFeedCgi", "filterDuplicate " + finderCommentInfo.getCommentId() + " content " + finderCommentInfo.getContent() + " username " + finderCommentInfo.getUsername());
                    }
                }
                resp.set(1, linkedList);
                com.tencent.mm.plugin.finder.storage.yj0 yj0Var = g4Var.f227987y;
                if (yj0Var != null) {
                    yj0Var.u0().setLastBuffer(resp.getByteString(3));
                    if (g4Var.B) {
                        yj0Var.u0().setContinueFlag(resp.getInteger(6));
                    } else {
                        yj0Var.u0().setUpContinueFlag(resp.getInteger(5));
                    }
                }
                com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) resp.getCustom(2);
                if (finderObject2 != null && (contact = finderObject2.getContact()) != null) {
                    ya2.g.m(ya2.h.f460484a, contact, false, 2, null);
                }
                com.tencent.mars.xlog.Log.i("FinderFeedCgi", "[onCgiBack] feedId=" + g4Var.f227982t + "  size=" + resp.getList(1).size() + " commentCount=" + resp.getInteger(4));
                return;
            }
        }
        g4Var = this;
        if (i17 == 0) {
        }
    }

    @Override // az2.o
    public java.util.List C(com.tencent.mm.protobuf.f fVar) {
        r45.h51 resp = (r45.h51) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) resp.getCustom(2);
        return finderObject != null ? kz5.b0.c(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0)) : kz5.p0.f313996d;
    }

    @Override // az2.o
    public long D() {
        r45.kv0 kv0Var;
        com.tencent.mm.modelbase.o oVar = this.f70646f;
        kotlin.jvm.internal.o.f(oVar, "getReqResp(...)");
        com.tencent.mm.protobuf.f fVar = oVar.f70710a.f70684a;
        r45.g51 g51Var = fVar instanceof r45.g51 ? (r45.g51) fVar : null;
        if (g51Var == null || (kv0Var = (r45.kv0) g51Var.getCustom(12)) == null) {
            return 0L;
        }
        return kv0Var.getLong(5);
    }

    @Override // az2.j, com.tencent.mm.modelbase.i
    public pq5.g l() {
        this.T = android.os.SystemClock.elapsedRealtime();
        return super.l();
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return this.U;
    }
}
