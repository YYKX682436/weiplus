package ek2;

/* loaded from: classes3.dex */
public final class w extends ek2.g0 {
    public final r45.k01 A;
    public final org.json.JSONObject B;
    public final org.json.JSONObject C;

    /* renamed from: u, reason: collision with root package name */
    public final r45.hn1 f253553u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f253554v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f253555w;

    /* renamed from: x, reason: collision with root package name */
    public final long f253556x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f253557y;

    /* renamed from: z, reason: collision with root package name */
    public final ek2.v f253558z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(java.lang.String str, com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc, com.tencent.mm.protobuf.g gVar, r45.fd2 fd2Var, int i17, int i18, java.util.LinkedList visibilityList, java.util.LinkedList visibilityRoomList, java.util.LinkedList visibilityUserList, java.util.LinkedList luckyMoneyChatroomList, java.util.LinkedList visibilityLabelList, java.lang.String str2, java.lang.String str3, int i19, r45.sd7 sd7Var, r45.hn1 hn1Var, boolean z17, byte[] bArr, int i27, r45.qt2 qt2Var, r45.ba4 ba4Var, java.lang.Boolean bool, int i28, long j17, r45.q12 q12Var, int i29, int i37, r45.kf5 kf5Var, r45.aa0 aa0Var, byte[] bArr2, java.lang.String str4, o0.m mVar, long j18, ek2.v callback, int i38, int i39, kotlin.jvm.internal.i iVar) {
        super(null, 1, null);
        byte[] bArr3;
        int i47;
        int i48;
        int i49;
        com.tencent.mm.protobuf.g gVar2;
        int i57;
        int i58;
        java.lang.String str5;
        r45.fd2 fd2Var2;
        byte[] bArr4;
        java.util.LinkedList linkedList;
        int i59;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        com.tencent.mm.protobuf.g gVar3 = (i38 & 4) != 0 ? null : gVar;
        int i66 = (i38 & 32) != 0 ? 0 : i18;
        r45.sd7 sd7Var2 = (i38 & 16384) != 0 ? null : sd7Var;
        r45.hn1 hn1Var2 = (32768 & i38) != 0 ? null : hn1Var;
        boolean z18 = (i38 & 65536) != 0 ? false : z17;
        byte[] bArr5 = (i38 & 131072) != 0 ? null : bArr;
        r45.qt2 qt2Var2 = (i38 & 524288) != 0 ? null : qt2Var;
        int i67 = (i38 & 4194304) != 0 ? 0 : i28;
        int i68 = (i38 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0 ? 0 : i29;
        int i69 = (i38 & 67108864) != 0 ? 0 : i37;
        r45.kf5 kf5Var2 = (i38 & 134217728) != 0 ? null : kf5Var;
        r45.aa0 aa0Var2 = (i38 & 268435456) != 0 ? r45.aa0.CREATELIVEPAGEMODE_DEFAULT_MODE : aa0Var;
        byte[] bArr6 = (i38 & com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bArr2;
        java.lang.String str6 = (i38 & 1073741824) != 0 ? null : str4;
        o0.m mVar2 = (i38 & Integer.MIN_VALUE) != 0 ? null : mVar;
        long j19 = (i39 & 1) != 0 ? 0L : j18;
        kotlin.jvm.internal.o.g(visibilityList, "visibilityList");
        kotlin.jvm.internal.o.g(visibilityRoomList, "visibilityRoomList");
        kotlin.jvm.internal.o.g(visibilityUserList, "visibilityUserList");
        kotlin.jvm.internal.o.g(luckyMoneyChatroomList, "luckyMoneyChatroomList");
        kotlin.jvm.internal.o.g(visibilityLabelList, "visibilityLabelList");
        kotlin.jvm.internal.o.g(callback, "callback");
        o0.m mVar3 = mVar2;
        this.f253553u = hn1Var2;
        this.f253554v = z18;
        this.f253555w = bArr5;
        r45.sd7 sd7Var3 = sd7Var2;
        this.f253556x = j19;
        this.f253557y = "Finder.CgiFinderCreateLive";
        this.f253558z = callback;
        r45.k01 k01Var = new r45.k01();
        this.A = k01Var;
        this.B = new org.json.JSONObject();
        this.C = new org.json.JSONObject();
        k01Var.f378249d = db2.t4.f228171a.b(3686, qt2Var2);
        k01Var.K = zl2.q4.d(zl2.q4.f473933a, null, null, 3, null);
        k01Var.f378251f = finderObjectDesc;
        k01Var.f378256n = gVar3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (str != null) {
            bArr3 = str.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bArr3, "getBytes(...)");
        } else {
            bArr3 = null;
        }
        sb6.append(kk.k.g(bArr3));
        sb6.append('_');
        sb6.append(java.lang.System.currentTimeMillis());
        k01Var.f378252g = sb6.toString();
        k01Var.f378250e = str;
        k01Var.f378258p = fd2Var;
        k01Var.U = kf5Var2;
        zl2.r4 r4Var = zl2.r4.f473950a;
        if (q12Var != null) {
            i48 = q12Var.getInteger(0);
            i47 = 3;
        } else {
            i47 = 3;
            i48 = 0;
        }
        if (!r4Var.O1(i48 == i47)) {
            k01Var.M = i66;
            k01Var.f378260q = i17;
            k01Var.f378261r = visibilityList;
            k01Var.f378263t = visibilityRoomList;
            k01Var.f378264u = visibilityUserList;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(visibilityLabelList, 10));
            java.util.Iterator it = visibilityLabelList.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.b8.a((java.lang.String) it.next())));
            }
            k01Var.Y = new java.util.LinkedList(arrayList);
        }
        r45.k01 k01Var2 = this.A;
        k01Var2.f378262s = luckyMoneyChatroomList;
        k01Var2.I = str2;
        k01Var2.S = i68;
        k01Var2.f378265v = str3;
        k01Var2.f378255m = i19;
        k01Var2.C = sd7Var3;
        k01Var2.G = this.f253554v ? 1 : 0;
        byte[] bArr7 = this.f253555w;
        if (bArr7 != null) {
            i49 = 0;
            gVar2 = new com.tencent.mm.protobuf.g(bArr7, 0, bArr7.length);
        } else {
            i49 = 0;
            gVar2 = null;
        }
        k01Var2.F = gVar2;
        r45.k01 k01Var3 = this.A;
        k01Var3.f378248J = i27;
        k01Var3.P = i67;
        r45.hn1 hn1Var3 = this.f253553u;
        if (hn1Var3 != null) {
            int integer = hn1Var3.getInteger(i49);
            int i76 = qs5.g.f366432a;
            if (integer == 2 || integer == 8 || integer == 16) {
                this.A.f378266w = this.f253553u.getInteger(0);
                this.A.f378267x = this.f253553u.getInteger(1);
                r45.k01 k01Var4 = this.A;
                r45.re2 re2Var = (r45.re2) this.f253553u.getCustom(2);
                k01Var4.f378270z = re2Var != null ? re2Var.getList(0) : null;
                r45.k01 k01Var5 = this.A;
                r45.re2 re2Var2 = (r45.re2) this.f253553u.getCustom(2);
                k01Var5.A = re2Var2 != null ? re2Var2.getList(1) : null;
                r45.k01 k01Var6 = this.A;
                r45.re2 re2Var3 = (r45.re2) this.f253553u.getCustom(2);
                if (re2Var3 == null || (list2 = re2Var3.getList(4)) == null) {
                    linkedList = null;
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list2, 10));
                    java.util.Iterator it6 = list2.iterator();
                    while (it6.hasNext()) {
                        arrayList2.add(java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.b8.a((java.lang.String) it6.next())));
                    }
                    linkedList = new java.util.LinkedList(arrayList2);
                }
                k01Var6.Z = linkedList;
                r45.re2 re2Var4 = (r45.re2) this.f253553u.getCustom(2);
                if (re2Var4 == null || (list = re2Var4.getList(3)) == null) {
                    i59 = 0;
                } else {
                    r45.k01 k01Var7 = this.A;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
                    java.util.Iterator it7 = list.iterator();
                    while (it7.hasNext()) {
                        arrayList3.add(((r45.il1) it7.next()).getString(0));
                    }
                    i59 = 0;
                    k01Var7.E = new java.util.LinkedList(arrayList3);
                }
                r45.k01 k01Var8 = this.A;
                k01Var8.f378260q = i59;
                k01Var8.L = (r45.hf5) this.f253553u.getCustom(3);
            }
        }
        this.A.N = (zl2.q4.f473933a.F(zl2.r4.f473950a.T1(q12Var)) && kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) ? 1 : 0;
        this.A.Q = j17;
        try {
            this.C.put(dm.i4.COL_USERNAME, str);
            this.C.put(com.tencent.tmassistantsdk.storage.table.ClientInfoTable.Columns.CLIENTID, this.A.f378252g);
            org.json.JSONObject jSONObject = this.C;
            r45.fd2 fd2Var3 = this.A.f378258p;
            jSONObject.put("tagId", fd2Var3 != null ? java.lang.Integer.valueOf(fd2Var3.getInteger(0)) : null);
            org.json.JSONObject jSONObject2 = this.C;
            r45.fd2 fd2Var4 = this.A.f378258p;
            jSONObject2.put("tagName", fd2Var4 != null ? fd2Var4.getString(1) : null);
            this.C.put("visibilityMode", this.A.f378260q);
            this.C.put("beautyData", dk2.b.f233228a.a());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f253557y, e17.toString());
        }
        r45.k57 k57Var = new r45.k57();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(fo3.s.INSTANCE.h());
        k57Var.f378396f = cu5Var;
        r45.kv0 kv0Var = this.A.f378249d;
        if (kv0Var != null) {
            kv0Var.set(2, new com.tencent.mm.protobuf.g(k57Var.toByteArray()));
        }
        w04.l.INSTANCE.b(540999692);
        r45.k01 k01Var9 = this.A;
        k01Var9.H = ba4Var;
        k01Var9.R = q12Var;
        k01Var9.T = i69;
        r45.aa0 aa0Var3 = aa0Var2;
        k01Var9.V = aa0Var3 != null ? aa0Var3.f369868d : 0;
        mm2.g1 g1Var = (mm2.g1) dk2.ef.f233372a.i(mm2.g1.class);
        if (g1Var == null || (bArr4 = g1Var.f329081v) == null) {
            i57 = 0;
        } else {
            i57 = 0;
            this.A.W = new com.tencent.mm.protobuf.g(bArr4, 0, bArr4.length);
        }
        byte[] bArr8 = bArr6;
        this.A.X = bArr8 != null ? new com.tencent.mm.protobuf.g(bArr8, i57, bArr8.length) : null;
        r45.k01 k01Var10 = this.A;
        k01Var10.f378259p0 = str6;
        k01Var10.F2 = mVar3;
        long j27 = this.f253556x;
        if (j27 != 0) {
            k01Var10.f378268x0 = j27;
            com.tencent.mars.xlog.Log.i(this.f253557y, "[CgiFinderCreateLive] coLiveInvitationId=" + this.f253556x);
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.k01 k01Var11 = this.A;
        lVar.f70664a = k01Var11;
        r45.l01 l01Var = new r45.l01();
        l01Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) l01Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = l01Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findercreatelive";
        lVar.f70667d = 3686;
        p(lVar.a());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("CgiFinderCreateLive init ");
        sb7.append(k01Var11.f378252g);
        sb7.append(',');
        sb7.append(k01Var11.f378250e);
        sb7.append(", liveEntranceType:");
        sb7.append(k01Var11.f378248J);
        sb7.append(", ");
        sb7.append(k01Var11.f378251f);
        sb7.append(", tag:[");
        r45.fd2 fd2Var5 = k01Var11.f378258p;
        if (fd2Var5 != null) {
            i58 = 1;
            str5 = fd2Var5.getString(1);
        } else {
            i58 = 1;
            str5 = null;
        }
        sb7.append(str5);
        sb7.append('-');
        r45.fd2 fd2Var6 = k01Var11.f378258p;
        sb7.append((fd2Var6 == null || (fd2Var2 = (r45.fd2) fd2Var6.getCustom(3)) == null) ? null : fd2Var2.getString(i58));
        sb7.append("], visibility_mode:");
        sb7.append(k01Var11.f378260q);
        sb7.append(", visible_username_list:");
        sb7.append(k01Var11.f378264u);
        sb7.append(", visibility_file_id_list:");
        sb7.append(k01Var11.f378261r);
        sb7.append(", visible_chatroom_id_list:");
        sb7.append(k01Var11.f378263t);
        sb7.append(", luckyMoneyChatroom:");
        sb7.append(k01Var11.f378262s);
        sb7.append(", gameAppId:");
        sb7.append(k01Var11.f378265v);
        sb7.append(", gameVersionType:");
        r45.sd7 sd7Var4 = k01Var11.C;
        sb7.append(sd7Var4 != null ? java.lang.Integer.valueOf(sd7Var4.getInteger(0)) : null);
        sb7.append(", scene:");
        sb7.append(k01Var11.f378255m);
        sb7.append(",liveChargePost:[");
        sb7.append(cm2.a.f43328a.k(this.f253553u));
        sb7.append("], acknowledgeSpamMsg:");
        sb7.append(this.f253554v);
        com.tencent.mars.xlog.Log.i(this.f253557y, sb7.toString());
        r45.k01 req = this.A;
        kotlin.jvm.internal.o.g(req, "req");
        java.lang.String jSONObject3 = req.toJSON().toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject3, ",", ";", false);
        com.tencent.mars.xlog.Log.i("FinderLivePostReporter", "[reportCreateLive] data = ".concat(t17));
        com.tencent.mm.autogen.mmdata.rpt.AndroidFinderLivePostReportStruct androidFinderLivePostReportStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidFinderLivePostReportStruct();
        androidFinderLivePostReportStruct.p("createLive");
        androidFinderLivePostReportStruct.q(t17);
        androidFinderLivePostReportStruct.k();
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.dm2 object_extend;
        com.tencent.mm.protocal.protobuf.FinderContact contact;
        r45.l01 resp = (r45.l01) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.String str2 = "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread();
        java.lang.String str3 = this.f253557y;
        com.tencent.mars.xlog.Log.i(str3, str2);
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i(str3, "CgiFinderCreateLive result:" + pm0.b0.g(resp));
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) resp.getCustom(1);
            if (finderObject != null && (contact = finderObject.getContact()) != null) {
                ya2.g.m(ya2.h.f460484a, contact, false, 2, null);
            }
        }
        dk2.c1 c1Var = (dk2.c1) this.f253558z;
        c1Var.getClass();
        dk2.r4 r4Var = c1Var.f233266a;
        boolean a76 = ((mm2.e1) r4Var.m(mm2.e1.class)).a7();
        java.lang.String str4 = r4Var.f234009d;
        if (!a76 && !((mm2.c1) r4Var.m(mm2.c1.class)).X7()) {
            com.tencent.mars.xlog.Log.i(str4, "current live status " + ((mm2.c1) r4Var.m(mm2.c1.class)).f328813h2 + " is illegal");
            return;
        }
        yz5.u uVar = c1Var.f233267b;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.i(str4, "launch live room failed");
            if (i18 != -200008) {
                if (uVar != null) {
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    uVar.K(bool, bool, "", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str == null ? "" : str, resp);
                    return;
                }
                return;
            }
            if (uVar != null) {
                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
                java.lang.String string = resp.getString(2);
                uVar.K(bool2, bool3, string == null ? "" : string, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str == null ? "" : str, resp);
                return;
            }
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) resp.getCustom(1);
        r45.nw1 liveInfo = finderObject2 != null ? finderObject2.getLiveInfo() : null;
        mm2.e1 e1Var = (mm2.e1) r4Var.m(mm2.e1.class);
        if (liveInfo == null) {
            liveInfo = new r45.nw1();
        }
        e1Var.m7(liveInfo);
        ((mm2.c1) r4Var.m(mm2.c1.class)).a9((com.tencent.mm.protocal.protobuf.FinderObject) resp.getCustom(1));
        mm2.e1 e1Var2 = (mm2.e1) r4Var.m(mm2.e1.class);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) resp.getCustom(1);
        e1Var2.q7(finderObject3 != null ? finderObject3.getId() : 0L);
        mm2.e1 e1Var3 = (mm2.e1) r4Var.m(mm2.e1.class);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject4 = (com.tencent.mm.protocal.protobuf.FinderObject) resp.getCustom(1);
        e1Var3.f328984n = (finderObject4 == null || (object_extend = finderObject4.getObject_extend()) == null) ? null : object_extend.getString(62);
        mm2.e1 e1Var4 = (mm2.e1) r4Var.m(mm2.e1.class);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject5 = (com.tencent.mm.protocal.protobuf.FinderObject) resp.getCustom(1);
        java.lang.String objectNonceId = finderObject5 != null ? finderObject5.getObjectNonceId() : null;
        if (objectNonceId == null) {
            objectNonceId = "";
        }
        e1Var4.f328992v = objectNonceId;
        ((mm2.s1) r4Var.m(mm2.s1.class)).S6((r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) r4Var.m(mm2.g1.class)).f329068f).getValue());
        com.tencent.mm.autogen.events.CreateLiveEvent createLiveEvent = new com.tencent.mm.autogen.events.CreateLiveEvent();
        com.tencent.mm.protocal.protobuf.FinderObject finderObject6 = (com.tencent.mm.protocal.protobuf.FinderObject) resp.getCustom(1);
        am.o3 o3Var = createLiveEvent.f54076g;
        o3Var.f7509a = finderObject6;
        o3Var.f7510b = ((mm2.s1) r4Var.m(mm2.s1.class)).D;
        createLiveEvent.e();
        if (uVar != null) {
            uVar.K(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE, "", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str == null ? "" : str, resp);
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.C;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.B;
    }
}
