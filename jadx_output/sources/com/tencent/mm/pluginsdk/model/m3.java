package com.tencent.mm.pluginsdk.model;

/* loaded from: classes11.dex */
public class m3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, ns.l {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f189377d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f189378e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f189379f;

    /* renamed from: g, reason: collision with root package name */
    public final int f189380g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f189381h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f189382i;

    public m3(int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, int i19, java.util.List list, r45.c85 c85Var) {
        this.f189379f = null;
        this.f189380g = 0;
        this.f189382i = new java.util.HashMap();
        iz5.a.g("This NetSceneVerifyUser init MUST use opcode == MM_VERIFYUSER_VERIFYOK", i17 == 3);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f189379f = linkedList;
        linkedList.add(str);
        this.f189380g = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ly6();
        lVar.f70665b = new r45.my6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/verifyuser";
        lVar.f70667d = 137;
        lVar.f70668e = 44;
        lVar.f70669f = 1000000044;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f189378e = a17;
        r45.ly6 ly6Var = (r45.ly6) a17.f70710a.f70684a;
        ly6Var.f379980d = i17;
        ly6Var.f379983g = "";
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        r45.gy6 gy6Var = new r45.gy6();
        gy6Var.f375650d = str;
        gy6Var.f375651e = str2;
        gy6Var.f375652f = g81.e.Ai().wi().z0(str, i18);
        gy6Var.f375654h = str3;
        if (!com.tencent.mm.sdk.platformtools.t8.L0(list) && N()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) it.next())));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneVerifyUser.dkverify", "getLabelIdList, %s", e17.getMessage());
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
                gy6Var.f375666w = O(arrayList);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "NetSceneVerifyUser:LabelIdList:%s ", gy6Var.f375666w);
        gy6Var.f375667x = c85Var;
        if (i19 > 0) {
            gy6Var.f375653g = i19;
        }
        linkedList2.add(gy6Var);
        ly6Var.f379982f = linkedList2;
        ly6Var.f379981e = linkedList2.size();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList3.add(java.lang.Integer.valueOf(i18));
        ly6Var.f379985i = linkedList3;
        ly6Var.f379984h = linkedList3.size();
        fo3.s sVar = fo3.s.INSTANCE;
        if (sVar.wf("ie_ver_usr")) {
            sVar.E7("ie_ver_usr");
        }
        r45.k57 k57Var = new r45.k57();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(sVar.Ph("ie_ver_usr"));
        k57Var.f378394d = cu5Var;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(sVar.Ci("ce_ver_usr"));
        k57Var.f378395e = cu5Var2;
        r45.cu5 cu5Var3 = new r45.cu5();
        cu5Var3.d(sVar.Ec(1, null));
        k57Var.f378396f = cu5Var3;
        java.lang.String Sf = sVar.Sf("ce_ver_usr");
        if (Sf != null) {
            r45.cu5 cu5Var4 = new r45.cu5();
            cu5Var4.d(Sf.getBytes());
            k57Var.f378401n = cu5Var4;
        }
        try {
            r45.cu5 cu5Var5 = new r45.cu5();
            cu5Var5.d(k57Var.toByteArray());
            ly6Var.f379989p = cu5Var5;
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify1 opCode:%s user:%d scene:%s ticket:%s anti:%s, friendFlag:%d %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(ly6Var.f379982f.size()), ly6Var.f379985i, str2, gy6Var.f375652f, java.lang.Integer.valueOf(i19), new com.tencent.mm.sdk.platformtools.z3());
    }

    public r45.v60 H() {
        java.util.Iterator it = ((r45.ly6) this.f189378e.f70710a.f70684a).f379982f.iterator();
        while (it.hasNext()) {
            r45.dz3 dz3Var = ((r45.gy6) it.next()).f375668y;
            if (dz3Var != null && dz3Var.f372868d > 0) {
                return (r45.v60) dz3Var.f372869e.get(0);
            }
        }
        return null;
    }

    public java.lang.String I() {
        com.tencent.mm.modelbase.n nVar;
        com.tencent.mm.modelbase.o oVar = this.f189378e;
        if (oVar == null || (nVar = oVar.f70711b) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneVerifyUser.dkverify", "getRespEncryptUsername failed, rr or resp is null");
            return "";
        }
        java.lang.String str = ((r45.my6) nVar.f70700a).f380931e;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "getRespEncryptUsername: %s", str);
        return str;
    }

    public java.lang.String J() {
        com.tencent.mm.modelbase.n nVar;
        com.tencent.mm.modelbase.o oVar = this.f189378e;
        return (oVar == null || (nVar = oVar.f70711b) == null) ? "" : ((r45.my6) nVar.f70700a).f380930d;
    }

    public long K() {
        com.tencent.mm.modelbase.n nVar;
        com.tencent.mm.modelbase.o oVar = this.f189378e;
        if (oVar == null || (nVar = oVar.f70711b) == null) {
            return 0L;
        }
        return ((r45.my6) nVar.f70700a).f380935i;
    }

    public java.util.List L() {
        return this.f189379f;
    }

    public int M() {
        return this.f189380g;
    }

    public final boolean N() {
        boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigVerifyUserWithLabelIdList()) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "isVerifyUserWithLabelIdList:%s ", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public final java.lang.String O(java.util.List list) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < list.size(); i17++) {
            sb6.append(list.get(i17));
            if (i17 < list.size() - 1) {
                sb6.append(",");
            }
        }
        return sb6.toString();
    }

    public void P(r45.hy6 hy6Var) {
        if (hy6Var == null) {
            return;
        }
        java.util.Iterator it = ((r45.ly6) this.f189378e.f70710a.f70684a).f379982f.iterator();
        while (it.hasNext()) {
            r45.gy6 gy6Var = (r45.gy6) it.next();
            try {
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(hy6Var.toByteArray());
                gy6Var.f375663t = cu5Var;
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneVerifyUser.dkverify", "setBizReportInfo %s", e17.getMessage());
            }
        }
    }

    public void Q(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "setClientMsgId : %s", java.lang.Long.valueOf(j17));
        ((r45.ly6) this.f189378e.f70710a.f70684a).f379992s = java.lang.String.valueOf(j17);
    }

    public void R(r45.dz3 dz3Var) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = dz3Var != null ? java.lang.Integer.valueOf(dz3Var.f372868d) : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "setImgInfoList imgInfoList:%s", objArr);
        r45.ly6 ly6Var = (r45.ly6) this.f189378e.f70710a.f70684a;
        java.util.Iterator it = ly6Var.f379982f.iterator();
        while (it.hasNext()) {
            ((r45.gy6) it.next()).f375668y = dz3Var;
        }
        if (com.tencent.mars.xlog.Log.isDebug()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "doNetSceneVerifyUser() called request:%s", ly6Var.toJSON());
        }
    }

    public void S(boolean z17) {
        r45.ly6 ly6Var = (r45.ly6) this.f189378e.f70710a.f70684a;
        if (z17) {
            ly6Var.f379990q = 1;
        } else {
            ly6Var.f379990q = 0;
        }
    }

    public void T(java.lang.String str) {
        java.util.Iterator it = ((r45.ly6) this.f189378e.f70710a.f70684a).f379982f.iterator();
        while (it.hasNext()) {
            ((r45.gy6) it.next()).f375661r = str;
        }
    }

    public void U(java.lang.String str, java.lang.String str2) {
        java.util.Iterator it = ((r45.ly6) this.f189378e.f70710a.f70684a).f379982f.iterator();
        while (it.hasNext()) {
            r45.gy6 gy6Var = (r45.gy6) it.next();
            gy6Var.f375655i = str;
            gy6Var.f375656m = str2;
        }
    }

    public void V(int i17) {
        java.util.Iterator it = ((r45.ly6) this.f189378e.f70710a.f70684a).f379982f.iterator();
        while (it.hasNext()) {
            ((r45.gy6) it.next()).f375662s = i17;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.modelbase.o oVar = this.f189378e;
        r45.ly6 ly6Var = (r45.ly6) oVar.f70710a.f70684a;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(this.f189380g);
        objArr[1] = ly6Var.f379992s;
        objArr[2] = java.lang.Integer.valueOf(ly6Var.f379990q);
        objArr[3] = this.f189381h;
        java.util.LinkedList linkedList = ly6Var.f379982f;
        objArr[4] = java.lang.Integer.valueOf(linkedList != null ? linkedList.size() : -1);
        java.util.LinkedList linkedList2 = ly6Var.f379985i;
        objArr[5] = java.lang.Integer.valueOf(linkedList2 != null ? linkedList2.size() : -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "doScene opcode:%d clientMsgId:%s needConfirm:%d verifyContent:%s userSize:%d sceneSize:%d", objArr);
        if (ly6Var.f379982f != null) {
            int i17 = 0;
            while (i17 < ly6Var.f379982f.size()) {
                r45.gy6 gy6Var = (r45.gy6) ly6Var.f379982f.get(i17);
                java.lang.Object[] objArr2 = new java.lang.Object[7];
                objArr2[0] = java.lang.Integer.valueOf(i17);
                objArr2[1] = gy6Var.f375650d;
                objArr2[2] = gy6Var.f375651e;
                objArr2[3] = gy6Var.f375652f;
                objArr2[4] = gy6Var.f375654h;
                objArr2[5] = java.lang.Integer.valueOf(gy6Var.f375653g);
                java.util.LinkedList linkedList3 = ly6Var.f379985i;
                objArr2[6] = java.lang.Integer.valueOf((linkedList3 == null || linkedList3.size() <= i17) ? -1 : ((java.lang.Integer) ly6Var.f379985i.get(i17)).intValue());
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "doScene [%d] user:%s verifyTicket:%s antispamTicket:%s chatroom:%s friendFlag:%d scene:%s", objArr2);
                i17++;
            }
        }
        this.f189377d = u0Var;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 30;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        updateDispatchId(i17);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneVerifyUser.dkverify", "onGYNetEnd errType:%d, errCode:%d errMsg:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        }
        r45.my6 my6Var = (r45.my6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "resp MsgId: %d, UserName: %s, EncryptUserName: %s", java.lang.Long.valueOf(my6Var.f380935i), my6Var.f380930d, my6Var.f380931e);
        this.f189377d.onSceneEnd(i18, i19, str, this);
    }

    public m3(int i17, java.util.List list, java.util.List list2, java.util.List list3, java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.String str3, java.lang.String str4) {
        this(i17, list, list2, list3, str, str2, map, str3, str4, null, null);
    }

    public m3(int i17, java.util.List list, java.util.List list2, java.util.List list3, java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List list4) {
        boolean z17;
        java.util.List list5 = list;
        java.util.Map map2 = map;
        this.f189379f = null;
        this.f189380g = 0;
        this.f189382i = new java.util.HashMap();
        iz5.a.g("This NetSceneVerifyUser init NEVER use opcode == MM_VERIFYUSER_VERIFYOK", i17 != 3);
        this.f189380g = i17;
        this.f189379f = list5;
        java.util.List linkedList = (list3 == null || list3.isEmpty()) ? new java.util.LinkedList() : list3;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ly6();
        lVar.f70665b = new r45.my6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/verifyuser";
        lVar.f70667d = 137;
        lVar.f70668e = 44;
        lVar.f70669f = 1000000044;
        this.f189378e = lVar.a();
        if (!linkedList.isEmpty()) {
            if (linkedList.size() != list.size()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify Error lstAntispamTicket:%d lstVerifyUser:%d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(list.size()));
            } else {
                for (int i18 = 0; i18 < linkedList.size(); i18++) {
                    g81.e.Ai().wi().y0((java.lang.String) list5.get(i18), 2147483633, (java.lang.String) linkedList.get(i18));
                }
            }
        }
        if (i17 == 2) {
            for (int i19 = 0; i19 < list.size(); i19++) {
                java.lang.String z07 = g81.e.Ai().wi().z0((java.lang.String) list5.get(i19), 2147483633);
                if (z07 == null) {
                    z07 = "";
                }
                linkedList.add(z07);
            }
        }
        r45.ly6 ly6Var = (r45.ly6) this.f189378e.f70710a.f70684a;
        ly6Var.f379980d = i17;
        ly6Var.f379983g = str;
        this.f189381h = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "opCode %d verifyContent:%s", java.lang.Integer.valueOf(i17), str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            ly6Var.f379991r = str5;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        int i27 = 0;
        while (i27 < list.size()) {
            r45.gy6 gy6Var = new r45.gy6();
            gy6Var.f375650d = (java.lang.String) list5.get(i27);
            gy6Var.f375651e = str2 == null ? "" : str2;
            java.lang.String z08 = g81.e.Ai().wi().z0(gy6Var.f375650d, ((java.lang.Integer) list2.get(i27)).intValue());
            z08 = z08 == null ? "" : z08;
            gy6Var.f375652f = z08;
            if (android.text.TextUtils.isEmpty(z08) && linkedList.size() > i27) {
                gy6Var.f375652f = (java.lang.String) linkedList.get(i27);
            }
            gy6Var.f375654h = str3;
            if (map2 != null && map2.containsKey(gy6Var.f375650d)) {
                gy6Var.f375653g = ((java.lang.Integer) map2.get(gy6Var.f375650d)).intValue();
            }
            gy6Var.f375658o = str4;
            try {
                if (!com.tencent.mm.sdk.platformtools.t8.L0(list4) && list4.get(i27) != null && N()) {
                    gy6Var.f375666w = O(new java.util.LinkedList((java.util.Collection) list4.get(i27)));
                }
                z17 = false;
            } catch (java.lang.Throwable th6) {
                z17 = false;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneVerifyUser.dkverify", th6, "VerifyUser LabelIdList", new java.lang.Object[0]);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify travesing lstVerifyUser idx:%s op:%s user:%s anti:%s chatroom:%s, reportInfo:%s, friendflag:%d LabelIdList:%s", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(this.f189380g), gy6Var.f375650d, gy6Var.f375652f, str3, str4, java.lang.Integer.valueOf(gy6Var.f375653g), gy6Var.f375666w);
            linkedList2.add(gy6Var);
            i27++;
            map2 = map;
            list5 = list;
        }
        ly6Var.f379982f = linkedList2;
        ly6Var.f379981e = linkedList2.size();
        java.util.LinkedList linkedList3 = new java.util.LinkedList(list2);
        ly6Var.f379985i = linkedList3;
        ly6Var.f379984h = linkedList3.size();
        fo3.s sVar = fo3.s.INSTANCE;
        if (sVar.wf("ie_ver_usr")) {
            sVar.E7("ie_ver_usr");
        }
        r45.k57 k57Var = new r45.k57();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(sVar.Ph("ie_ver_usr"));
        k57Var.f378394d = cu5Var;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(sVar.Ci("ce_ver_usr"));
        k57Var.f378395e = cu5Var2;
        r45.cu5 cu5Var3 = new r45.cu5();
        cu5Var3.d(sVar.Ec(1, null));
        k57Var.f378396f = cu5Var3;
        java.lang.String Sf = sVar.Sf("ce_ver_usr");
        if (Sf != null) {
            r45.cu5 cu5Var4 = new r45.cu5();
            cu5Var4.d(Sf.getBytes());
            k57Var.f378401n = cu5Var4;
        }
        try {
            r45.cu5 cu5Var5 = new r45.cu5();
            cu5Var5.d(k57Var.toByteArray());
            ly6Var.f379989p = cu5Var5;
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify construct end op:%s usersize:%s scene:%s inputAnti:%s chatroom:%s stack:%s", java.lang.Integer.valueOf(this.f189380g), java.lang.Integer.valueOf(ly6Var.f379982f.size()), ly6Var.f379985i, com.tencent.mm.sdk.platformtools.t8.c1(linkedList, ","), str3, new com.tencent.mm.sdk.platformtools.z3());
    }

    public m3(int i17, java.util.List list, java.util.List list2, java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.String str3, java.util.List list3) {
        this(i17, list, list2, null, str, str2, map, str3, "", null, list3);
    }

    public m3(int i17, java.lang.String str, java.lang.String str2, int i18) {
        this(i17, str, str2, i18, (java.lang.String) null, 0, (java.util.List) null, (r45.c85) null);
    }

    public m3(int i17, java.util.List list, java.util.List list2, java.lang.String str, java.lang.String str2) {
        this(i17, list, list2, null, str, str2, null, null, "");
    }
}
