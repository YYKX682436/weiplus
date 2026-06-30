package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class k2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f164348h = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.List f164349i = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f164350d;

    /* renamed from: e, reason: collision with root package name */
    public final long f164351e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f164352f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f164353g;

    public k2(long j17, int i17, java.lang.String str) {
        this.f164351e = j17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.g76();
        lVar.f70665b = new r45.h76();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnsadobjectdetail";
        lVar.f70667d = 683;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().h());
        sb6.append("ad_detail_session");
        java.lang.String sb7 = sb6.toString();
        this.f164353g = sb7;
        int E = ca4.z0.E();
        byte[] N = com.tencent.mm.vfs.w6.N(sb7, 0, -1);
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f164350d = a17;
        com.tencent.mm.modelbase.m mVar = a17.f70710a;
        com.tencent.mm.protobuf.f fVar = mVar.f70684a;
        ((r45.g76) fVar).f374960d = j17;
        ((r45.g76) fVar).f374962f = x51.j1.a(N);
        com.tencent.mm.protobuf.f fVar2 = mVar.f70684a;
        ((r45.g76) fVar2).f374961e = i17;
        ((r45.g76) fVar2).f374965i = E;
        if (str != null && str.length() > 0) {
            ((r45.g76) mVar.f70684a).f374964h = x51.j1.h(str, true);
        }
        r45.g76 g76Var = (r45.g76) mVar.f70684a;
        if (g76Var != null) {
            if (l44.h3.e()) {
                g76Var.f374969p = l44.e.b();
            }
            java.lang.String e17 = m54.j.e();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                g76Var.f374970q = e17;
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "the snsADObjectDetailRequest vangogh version is " + g76Var.f374970q);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "SupportCapability is " + g76Var.f374969p);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 32);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("NetSceneSnsAdObjectDetial, snsId=");
        sb8.append(ca4.z0.t0(j17));
        sb8.append(", scene=");
        sb8.append(i17);
        sb8.append(", buf is null?");
        sb8.append(N == null);
        sb8.append(", syncBuf=");
        sb8.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", sb8.toString());
    }

    public static boolean H(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addAtDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.util.List list = f164349i;
        if (list.contains(valueOf)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addAtDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
            return false;
        }
        list.add(java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addAtDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        return true;
    }

    public static boolean I(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeAtDetailId", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        f164349i.remove(java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeAtDetailId", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        return true;
    }

    public static boolean J(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeDetialId", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        f164348h.remove(java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeDetialId", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        return true;
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        this.f164352f = u0Var;
        int dispatch = dispatch(sVar, this.f164350d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        return 683;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        byte[] d17;
        java.lang.String str2;
        java.lang.String str3;
        boolean z17;
        r45.du5 du5Var;
        boolean z18;
        r45.du5 du5Var2;
        com.tencent.mm.protocal.protobuf.SnsObject snsObject;
        com.tencent.mm.protocal.protobuf.SnsObject snsObject2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        java.lang.String t07 = ca4.z0.t0(this.f164351e);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "onGYNetEnd, errType " + i18 + " errCode " + i19 + ", snsId=" + t07);
        boolean z19 = true;
        if (i18 != 0 || i19 != 0) {
            if (i18 == 4 && i19 == 1 && (d17 = x51.j1.d(((r45.h76) this.f164350d.f70711b.f70700a).f375921e)) != null) {
                com.tencent.mm.vfs.w6.h(this.f164353g);
                com.tencent.mm.vfs.w6.S(this.f164353g, d17, 0, d17.length);
            }
            z19 = false;
        }
        if (!z19) {
            this.f164352f.onSceneEnd(i18, i19, str, this);
            if (((r45.g76) this.f164350d.f70710a.f70684a).f374961e == 2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 1);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 0);
            }
            J(this.f164351e);
            I(this.f164351e);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 27);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
            return;
        }
        byte[] d18 = x51.j1.d(((r45.h76) this.f164350d.f70711b.f70700a).f375921e);
        if (d18 != null) {
            com.tencent.mm.vfs.w6.h(this.f164353g);
            com.tencent.mm.vfs.w6.S(this.f164353g, d18, 0, d18.length);
        }
        com.tencent.mm.modelbase.o oVar = this.f164350d;
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        r45.f76 f76Var = ((r45.h76) fVar).f375920d;
        r45.cu5 cu5Var = ((r45.h76) fVar).f375923g;
        int i27 = ((r45.g76) oVar.f70710a.f70684a).f374961e;
        if (f76Var != null) {
            str2 = "detail, isValid=";
            str3 = "detail, graySwitch=";
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "snsdetail scene=" + i27 + ", snsXml=" + x51.j1.f(f76Var.f374076d.ObjectDesc));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("adxml=");
            sb6.append(f76Var.f374077e);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", sb6.toString());
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "dynamicData=" + x51.j1.f(cu5Var));
        } else {
            str2 = "detail, isValid=";
            str3 = "detail, graySwitch=";
        }
        if (f76Var != null && (snsObject2 = f76Var.f374076d) != null && snsObject2.DeleteFlag > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", ca4.z0.t0(f76Var.f374076d.Id) + " will remove by get detail ");
            J(this.f164351e);
            I(this.f164351e);
            a84.n.d(f76Var.f374076d.Id);
            i64.u1.b(22, 1, 101);
            this.f164352f.onSceneEnd(i18, i19, str, this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
            return;
        }
        if (f76Var != null && (snsObject = f76Var.f374076d) != null) {
            java.util.LinkedList<r45.e86> linkedList = snsObject.CommentUserList;
            int size = linkedList == null ? 0 : linkedList.size();
            java.util.LinkedList<r45.e86> linkedList2 = f76Var.f374076d.LikeUserList;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "detail comment.size=" + size + " liked.size=" + (linkedList2 == null ? 0 : linkedList2.size()) + ", likeFlag=" + f76Var.f374076d.LikeFlag + ", snsId=" + ca4.z0.t0(f76Var.f374076d.Id));
        }
        if (i27 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "get atDetail %s", t07);
            r45.g5 g5Var = ((r45.h76) this.f164350d.f70711b.f70700a).f375924h;
            r45.f76 f76Var2 = g5Var != null ? g5Var.f374885d : null;
            synchronized (com.tencent.mm.plugin.sns.model.x.f164745a) {
                try {
                    boolean z27 = com.tencent.mm.plugin.sns.model.x.h() == 1;
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "atDetail, graySwitch=" + z27);
                    if (!z27 || f76Var2 == null || (du5Var2 = f76Var2.f374079g) == null || android.text.TextUtils.isEmpty(x51.j1.g(du5Var2))) {
                        z18 = false;
                    } else {
                        z18 = com.tencent.mm.plugin.sns.model.x.v(g5Var);
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "atDetail, isValid=" + z18);
                        if (z18) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1802, 4);
                        } else {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1802, 5);
                        }
                    }
                    if (g5Var != null) {
                        int i28 = (!z27 || z18) ? z27 ? 2 : 0 : 1;
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "recv at adInfoXml=" + x51.j1.g(g5Var.f374886e) + ", replaceMode=" + i28);
                        com.tencent.mm.plugin.sns.model.x.q(g5Var, i28);
                        try {
                            com.tencent.mm.plugin.sns.storage.AdSnsInfo y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(g5Var.f374885d.f374076d.Id);
                            if (y07 != null) {
                                com.tencent.mm.plugin.sns.storage.ADInfo atAdInfo = y07.getAtAdInfo();
                                if (atAdInfo == null) {
                                    atAdInfo = y07.getAdInfo();
                                }
                                n74.v1.d(y07.getTimeLine(), y07.getAdXml(), atAdInfo, 3);
                                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "preDownloadAdLandingPagesForAtMsg, id=" + t07);
                                java.lang.String str4 = y07.field_adxml;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preDownloadAdLandingPagesForAtMsg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
                                if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPagesForAtMsg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
                                } else {
                                    ((ku5.t0) ku5.t0.f312615d).g(new za4.d1(atAdInfo, str4));
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPagesForAtMsg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
                                }
                            }
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSnsAdObjectDetial", "TimeLineAdPreloadHelper->checkPreloadAdResource exp=" + th6.toString());
                            ca4.q.c("TimeLineAdPreloadHelper", th6);
                        }
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSnsAdObjectDetial", "remindObject == null");
                    }
                } finally {
                }
            }
        } else {
            synchronized (com.tencent.mm.plugin.sns.model.x.f164745a) {
                try {
                    boolean z28 = com.tencent.mm.plugin.sns.model.x.h() == 1;
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", str3 + z28);
                    java.lang.String str5 = "";
                    if (!z28 || f76Var == null || (du5Var = f76Var.f374079g) == null || android.text.TextUtils.isEmpty(x51.j1.g(du5Var))) {
                        z17 = false;
                    } else {
                        str5 = f76Var.f374079g.f372756d;
                        z17 = com.tencent.mm.plugin.sns.model.x.z(f76Var);
                        if (z17) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1802, 6);
                        } else {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1802, 7);
                        }
                    }
                    int i29 = z28 ? 2 : 0;
                    if (z28 && !z17) {
                        i29 = 1;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", str2 + z17 + ", replaceMode=" + i29 + ", dynamicAdinfo=" + str5);
                    com.tencent.mm.plugin.sns.model.x.t(f76Var, cu5Var, str5, i29);
                } finally {
                }
            }
        }
        this.f164352f.onSceneEnd(i18, i19, str, this);
        J(this.f164351e);
        I(this.f164351e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
    }

    public k2(long j17, int i17, r45.mo5 mo5Var) {
        this(j17, i17, "");
        ((r45.g76) this.f164350d.f70710a.f70684a).f374966m = mo5Var;
        if (mo5Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSnsAdObjectDetial", "NetSceneSnsAdObjectDetial, remindFriendsInfo==null");
            return;
        }
        r45.cu5 cu5Var = mo5Var.f380717h;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "NetSceneSnsAdObjectDetial, scene=" + i17 + ", ADGroupId64=" + mo5Var.f380718i + ", ADGroupId=" + mo5Var.f380713d + ", extInfo=" + (cu5Var != null ? x51.j1.f(cu5Var) : null));
    }
}
