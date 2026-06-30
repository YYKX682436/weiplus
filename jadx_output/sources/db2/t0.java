package db2;

/* loaded from: classes2.dex */
public final class t0 extends az2.o {

    /* renamed from: t, reason: collision with root package name */
    public final long f228156t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f228157u;

    /* renamed from: v, reason: collision with root package name */
    public final int f228158v;

    /* renamed from: w, reason: collision with root package name */
    public final int f228159w;

    /* renamed from: x, reason: collision with root package name */
    public long f228160x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f228161y;

    /* renamed from: z, reason: collision with root package name */
    public int f228162z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t0(long r32, java.lang.String r34, int r35, com.tencent.mm.protobuf.g r36, java.lang.String r37, int r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, com.tencent.mm.protobuf.g r42, r45.qt2 r43, float r44, float r45, int r46, int r47, java.lang.Integer r48, r45.sf6 r49, com.tencent.mm.protobuf.g r50, r45.vx0 r51, int r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, com.tencent.mm.protobuf.g r56, r45.a34 r57, java.lang.String r58, r45.nv2 r59, r45.m54 r60, android.content.Intent r61, java.lang.String r62, int r63, kotlin.jvm.internal.i r64) {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.t0.<init>(long, java.lang.String, int, com.tencent.mm.protobuf.g, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.protobuf.g, r45.qt2, float, float, int, int, java.lang.Integer, r45.sf6, com.tencent.mm.protobuf.g, r45.vx0, int, java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.protobuf.g, r45.a34, java.lang.String, r45.nv2, r45.m54, android.content.Intent, java.lang.String, int, kotlin.jvm.internal.i):void");
    }

    @Override // az2.o, az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList list;
        r45.nw1 liveInfo;
        java.lang.String str2;
        jz5.f0 f0Var;
        r45.aa1 resp = (r45.aa1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        super.A(i17, i18, str, resp, m1Var);
        com.tencent.mm.protobuf.f fVar2 = this.f70646f.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetRelatedListReq");
        int integer = ((r45.z91) fVar2).getInteger(27);
        int i19 = this.f228158v;
        if (integer != 2) {
            com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
            v1Var.m(i19, false);
            v1Var.h(i19, false);
        }
        java.lang.String str3 = "errType " + i17 + ", errCode " + i18 + ", errMsg " + str + ", resp=" + resp.toJSON();
        java.lang.String str4 = this.f228161y;
        com.tencent.mars.xlog.Log.i(str4, str3);
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i(str4, "feedId=" + pm0.v.u(this.f228156t) + " tabType=" + i19 + ", " + hc2.o0.k(resp.getList(1)));
            yr2.a aVar = yr2.a.f464659a;
            r45.sq2 sq2Var = (r45.sq2) resp.getCustom(5);
            java.util.LinkedList list2 = resp.getList(1);
            kotlin.jvm.internal.o.f(list2, "getObject(...)");
            aVar.b(sq2Var, list2, 3688);
            if (integer != 2) {
                com.tencent.mm.plugin.finder.report.v1.f125393a.a(i19, resp.getList(1).size());
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list3 = resp.getList(1);
                kotlin.jvm.internal.o.f(list3, "getObject(...)");
                for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list3) {
                    com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    kotlin.jvm.internal.o.d(finderObject);
                    o3Var.cl(finderObject, this.f16135n);
                }
                r45.bn3 bn3Var = (r45.bn3) resp.getCustom(14);
                if (bn3Var != null) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_MP_PREFETCH_INTERVAL_SEC_INT_SYNC, java.lang.Integer.valueOf(bn3Var.getInteger(0)));
                    r45.zm3 zm3Var = (r45.zm3) bn3Var.getCustom(1);
                    if (zm3Var != null) {
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_MP_PREFETCH_TYPE_INT_SYNC, java.lang.Integer.valueOf(zm3Var.getInteger(1)));
                        f0Var = jz5.f0.f302826a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_MP_PREFETCH_TYPE_INT_SYNC, 0);
                    }
                    if (bn3Var.getInteger(2) >= 0) {
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_SHARE_PREFETCH_LAST_FEED_OUNT_INT_SYNC, java.lang.Integer.valueOf(bn3Var.getInteger(2)));
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCgiEnd: save prefetch config, prefetch_last_feed_count=");
                    sb6.append(bn3Var.getInteger(2));
                    sb6.append(", mp_prefetch_valid_time=");
                    sb6.append(bn3Var.getInteger(0));
                    sb6.append(", prefetch_type=");
                    r45.zm3 zm3Var2 = (r45.zm3) bn3Var.getCustom(1);
                    sb6.append(zm3Var2 != null ? java.lang.Integer.valueOf(zm3Var2.getInteger(1)) : null);
                    sb6.append(", pull_type=");
                    sb6.append(this.f228162z);
                    sb6.append(", hasMore=");
                    sb6.append(resp.getInteger(3));
                    com.tencent.mars.xlog.Log.i(str4, sb6.toString());
                }
            }
            if (this.f228160x > 0 && (list = resp.getList(1)) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
                    kotlin.jvm.internal.o.d(finderObject2);
                    if (hc2.o0.j(finderObject2) == 9) {
                        arrayList.add(obj);
                    }
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) it.next();
                    r45.nw1 liveInfo2 = finderObject3.getLiveInfo();
                    java.lang.String string = liveInfo2 != null ? liveInfo2.getString(3) : null;
                    if (!(string == null || string.length() == 0) && (liveInfo = finderObject3.getLiveInfo()) != null) {
                        zy2.z7 z7Var = (zy2.z7) i95.n0.c(zy2.z7.class);
                        r45.nw1 liveInfo3 = finderObject3.getLiveInfo();
                        if (liveInfo3 == null || (str2 = liveInfo3.getString(3)) == null) {
                            str2 = "";
                        }
                        liveInfo.set(3, ((b92.v1) z7Var).Ai("FinderGetRelatedList", str2, this.f228160x));
                    }
                }
            }
            dq.b b17 = cq.k1.b();
            r45.rf6 rf6Var = (r45.rf6) resp.getCustom(22);
            b17.d(rf6Var != null ? rf6Var.getInteger(0) : 0, str4);
        }
    }

    @Override // az2.o
    public java.util.List C(com.tencent.mm.protobuf.f fVar) {
        r45.aa1 resp = (r45.aa1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = resp.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(h90Var.a(finderObject, 0));
        }
        return arrayList;
    }

    @Override // az2.o
    public long D() {
        com.tencent.mm.protobuf.f fVar = this.f70646f.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetRelatedListReq");
        r45.kv0 kv0Var = (r45.kv0) ((r45.z91) fVar).getCustom(1);
        if (kv0Var != null) {
            return kv0Var.getLong(5);
        }
        return 0L;
    }

    public final void E(r45.z91 z91Var) {
        z91Var.set(14, db2.t4.f228171a.n());
        z91Var.set(25, zl2.q4.f473933a.b());
        if (z91Var.getInteger(27) != 2) {
            com.tencent.mm.plugin.finder.report.v1.f125393a.m(this.f228158v, true);
        }
    }

    @Override // az2.j, com.tencent.mm.modelbase.i
    public pq5.g l() {
        this.f228160x = android.os.SystemClock.elapsedRealtime();
        return super.l();
    }

    @Override // az2.j, ay1.m
    /* renamed from: x */
    public java.lang.String getF123276h() {
        return "3688+" + pm0.v.u(this.f228156t) + '+' + this.f228162z + '+' + this.f228159w;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(r45.vd6 vd6Var, r45.qt2 qt2Var, r45.z91 request) {
        super(null, null, 3, null);
        int i17;
        long j17;
        r45.nm1 nm1Var;
        kotlin.jvm.internal.o.g(request, "request");
        this.f228161y = "Finder.CgiFinderGetFeedRelList";
        long j18 = request.getLong(3);
        this.f228156t = j18;
        java.lang.String string = request.getString(7);
        int integer = request.getInteger(4);
        this.f228158v = integer;
        r45.kw0 kw0Var = (r45.kw0) request.getCustom(12);
        java.lang.String string2 = kw0Var != null ? kw0Var.getString(0) : null;
        int integer2 = request.getInteger(9);
        this.f228159w = integer2;
        java.lang.String string3 = request.getString(15);
        java.lang.String string4 = request.getString(16);
        java.lang.String string5 = request.getString(18);
        com.tencent.mm.protobuf.g byteString = request.getByteString(19);
        r45.z91 z91Var = new r45.z91();
        z91Var.set(2, request.getByteString(2));
        z91Var.set(3, java.lang.Long.valueOf(request.getLong(3)));
        z91Var.set(4, java.lang.Integer.valueOf(request.getInteger(4)));
        z91Var.set(7, request.getString(7));
        z91Var.set(8, request.getString(8));
        z91Var.set(9, java.lang.Integer.valueOf(request.getInteger(9)));
        z91Var.set(10, request.getString(10));
        z91Var.set(11, (r45.xu2) request.getCustom(11));
        z91Var.set(12, (r45.kw0) request.getCustom(12));
        z91Var.set(13, request.getByteString(13));
        z91Var.set(15, request.getString(15));
        z91Var.set(16, request.getString(16));
        z91Var.set(17, (r45.y91) request.getCustom(17));
        z91Var.set(18, request.getString(18));
        z91Var.set(19, request.getByteString(19));
        z91Var.set(20, (r45.ni6) request.getCustom(20));
        z91Var.set(21, (r45.kd3) request.getCustom(21));
        z91Var.set(22, request.getList(22));
        z91Var.set(23, (r45.ym3) request.getCustom(23));
        jz5.l P6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).P6();
        z91Var.set(5, java.lang.Float.valueOf(((java.lang.Number) P6.f302833d).floatValue()));
        db2.t4 t4Var = db2.t4.f228171a;
        z91Var.set(1, t4Var.b(3688, qt2Var));
        java.lang.String str = string2;
        t4Var.h((r45.kv0) request.getCustom(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(integer2), java.lang.Long.valueOf(j18), this.f228157u)));
        r45.kv0 kv0Var = (r45.kv0) z91Var.getCustom(1);
        r45.kv0 kv0Var2 = (r45.kv0) request.getCustom(1);
        t4Var.k(kv0Var, kv0Var2 != null ? (r45.a34) kv0Var2.getCustom(13) : null);
        z91Var.set(6, java.lang.Float.valueOf(((java.lang.Number) P6.f302834e).floatValue()));
        z91Var.getList(22).add(vd6Var);
        E(z91Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 3688;
        lVar.f70664a = z91Var;
        lVar.f70665b = new r45.aa1();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetrelatedlist";
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[init1] fromUserName=");
        sb6.append(string3);
        sb6.append(",toUserName=");
        sb6.append(string4);
        sb6.append(" feedId=");
        sb6.append(pm0.v.u(j18));
        sb6.append(" tabType=");
        sb6.append(integer);
        sb6.append(" commentScene=");
        sb6.append(qt2Var != null ? qt2Var.getInteger(5) : 0);
        sb6.append(" category=");
        sb6.append(str);
        sb6.append(" nonceId=");
        sb6.append(string);
        sb6.append(" lastBuffer=");
        sb6.append(z91Var.getByteString(2));
        sb6.append(" scene=");
        sb6.append(integer2);
        sb6.append(" sessionId=");
        sb6.append(string5);
        sb6.append(" sessionBuffer=");
        sb6.append(byteString != null);
        sb6.append(" get_column_feed_info=");
        r45.kd3 kd3Var = (r45.kd3) z91Var.getCustom(21);
        if (kd3Var != null) {
            i17 = 0;
            j17 = kd3Var.getLong(0);
        } else {
            i17 = 0;
            j17 = 0;
        }
        sb6.append(pm0.v.u(j17));
        sb6.append(", switch_column_info=");
        r45.ni6 ni6Var = (r45.ni6) z91Var.getCustom(20);
        sb6.append(pm0.v.u(ni6Var != null ? ni6Var.getLong(i17) : 0L));
        sb6.append(" get_related_column_topic_info=");
        r45.ym3 ym3Var = (r45.ym3) z91Var.getCustom(23);
        sb6.append(pm0.v.u(ym3Var != null ? ym3Var.getLong(i17) : 0L));
        sb6.append(",speed=");
        r45.om1 om1Var = (r45.om1) request.getCustom(25);
        sb6.append((om1Var == null || (nm1Var = (r45.nm1) om1Var.getCustom(i17)) == null) ? null : java.lang.Integer.valueOf(nm1Var.getInteger(i17)));
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetFeedRelList", sb6.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.mm.protobuf.g gVar, int i17, java.util.List list, r45.kd3 kd3Var, r45.qt2 qt2Var, r45.a34 a34Var, java.lang.String str, int i18, kotlin.jvm.internal.i iVar) {
        super(null, null, 3, null);
        int i19;
        java.lang.Long l17;
        r45.nm1 nm1Var;
        r45.kv0 kv0Var;
        r45.kd3 kd3Var2 = (i18 & 8) != 0 ? null : kd3Var;
        r45.a34 a34Var2 = (i18 & 32) != 0 ? null : a34Var;
        java.lang.String str2 = (i18 & 64) != 0 ? null : str;
        this.f228161y = "Finder.CgiFinderGetFeedRelList";
        r45.z91 z91Var = new r45.z91();
        long j17 = z91Var.getLong(3);
        this.f228156t = j17;
        java.lang.String string = z91Var.getString(7);
        int integer = z91Var.getInteger(4);
        this.f228158v = integer;
        r45.kw0 kw0Var = (r45.kw0) z91Var.getCustom(12);
        java.lang.String string2 = kw0Var != null ? kw0Var.getString(0) : null;
        java.lang.String string3 = z91Var.getString(15);
        java.lang.String string4 = z91Var.getString(16);
        java.lang.String string5 = z91Var.getString(18);
        com.tencent.mm.protobuf.g byteString = z91Var.getByteString(19);
        this.f228159w = i17;
        z91Var.set(9, java.lang.Integer.valueOf(i17));
        if (list != null) {
            z91Var.getList(22).addAll(list);
        }
        z91Var.set(2, gVar);
        z91Var.set(21, kd3Var2);
        jz5.l P6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).P6();
        z91Var.set(5, java.lang.Float.valueOf(((java.lang.Number) P6.f302833d).floatValue()));
        db2.t4 t4Var = db2.t4.f228171a;
        z91Var.set(1, t4Var.b(3688, qt2Var));
        z91Var.set(6, java.lang.Float.valueOf(((java.lang.Number) P6.f302834e).floatValue()));
        z91Var.set(14, t4Var.n());
        E(z91Var);
        java.lang.String str3 = string2;
        t4Var.h((r45.kv0) z91Var.getCustom(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), this.f228157u)));
        t4Var.k((r45.kv0) z91Var.getCustom(1), a34Var2);
        if (!(str2 == null || str2.length() == 0) && (kv0Var = (r45.kv0) z91Var.getCustom(1)) != null) {
            kv0Var.set(14, str2);
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 3688;
        lVar.f70664a = z91Var;
        lVar.f70665b = new r45.aa1();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetrelatedlist";
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[init2] fromUserName=");
        sb6.append(string3);
        sb6.append(", toUserName=");
        sb6.append(string4);
        sb6.append(" feedId=");
        sb6.append(pm0.v.u(j17));
        sb6.append(" tabType=");
        sb6.append(integer);
        sb6.append(" commentScene=");
        sb6.append(qt2Var != null ? qt2Var.getInteger(5) : 0);
        sb6.append(" category=");
        sb6.append(str3);
        sb6.append(" nonceId=");
        sb6.append(string);
        sb6.append(" lastBuffer=");
        sb6.append(z91Var.getByteString(2));
        sb6.append(" scene=");
        sb6.append(i17);
        sb6.append(" sessionId=");
        sb6.append(string5);
        sb6.append(" sessionBuffer=");
        sb6.append(byteString != null);
        sb6.append(" get_column_feed_info=");
        r45.kd3 kd3Var3 = (r45.kd3) z91Var.getCustom(21);
        if (kd3Var3 != null) {
            i19 = 0;
            l17 = java.lang.Long.valueOf(kd3Var3.getLong(0));
        } else {
            i19 = 0;
            l17 = null;
        }
        sb6.append(l17);
        sb6.append(", switch_column_info=");
        r45.ni6 ni6Var = (r45.ni6) z91Var.getCustom(20);
        sb6.append(ni6Var != null ? java.lang.Long.valueOf(ni6Var.getLong(i19)) : null);
        sb6.append(" cardBuffer=");
        sb6.append(gVar);
        sb6.append("get_related_column_topic_info=");
        r45.ym3 ym3Var = (r45.ym3) z91Var.getCustom(23);
        sb6.append(ym3Var != null ? java.lang.Long.valueOf(ym3Var.getLong(0)) : null);
        sb6.append(" stats=");
        sb6.append(z91Var.getList(22).size());
        sb6.append(",speed=");
        r45.om1 om1Var = (r45.om1) z91Var.getCustom(25);
        sb6.append((om1Var == null || (nm1Var = (r45.nm1) om1Var.getCustom(0)) == null) ? null : java.lang.Integer.valueOf(nm1Var.getInteger(0)));
        sb6.append(", source_type:");
        sb6.append(a34Var2 != null ? java.lang.Integer.valueOf(a34Var2.getInteger(0)) : null);
        sb6.append(" , source_buffer:");
        sb6.append(a34Var2 != null ? a34Var2.getString(1) : null);
        sb6.append(", lastgmsgid: ");
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetFeedRelList", sb6.toString());
    }
}
