package r01;

/* loaded from: classes8.dex */
public class g3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f368087d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f368088e;

    public g3(java.lang.String str, int i17, java.lang.String str2, java.util.LinkedList linkedList, java.lang.String str3) {
        this(str, i17, str2, linkedList, str3, 0, null, null);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f368087d = u0Var;
        return dispatch(sVar, this.f368088e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 359;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.mj6 mj6Var;
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.modelbase.o oVar = this.f368088e;
            r45.z30 z30Var = (r45.z30) oVar.f70710a.f70684a;
            r45.a40 a40Var = (r45.a40) oVar.f70711b.f70700a;
            if (z30Var.f391661d == 10 && z30Var.f391663f != null && ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(z30Var.f391663f) != null) {
                java.util.LinkedList linkedList = a40Var.f369714f;
                int i27 = 10002;
                int i28 = 2;
                if (linkedList == null || linkedList.size() <= 0) {
                    r45.pb7 pb7Var = a40Var.f369712d;
                    if (pb7Var != null) {
                        java.lang.String str2 = z30Var.f391663f;
                        if (pb7Var == null || com.tencent.mm.sdk.platformtools.t8.K0(pb7Var.f382934f) || com.tencent.mm.sdk.platformtools.t8.K0(pb7Var.f382933e)) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneBizClickCommand", "insertReportLocationMsg tips is null");
                        } else {
                            int i29 = pb7Var.f382932d;
                            if (i29 != 1) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneBizClickCommand", "insertReportLocationMsg %d", java.lang.Integer.valueOf(i29));
                            } else {
                                java.lang.String str3 = pb7Var.f382933e;
                                java.lang.String str4 = pb7Var.f382934f;
                                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("<sysmsg type=\"biz_services_mute\"><biz_services_mute><text><![CDATA[");
                                stringBuffer.append(str3);
                                stringBuffer.append("]]></text><link><scene>biz_services_mute</scene><text><![CDATA[");
                                stringBuffer.append(str4);
                                stringBuffer.append("]]></text></link></biz_services_mute></sysmsg>");
                                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                                f9Var.u1(str2);
                                f9Var.j1(2);
                                f9Var.setType(10002);
                                f9Var.e1(c01.w9.p());
                                f9Var.d1(stringBuffer.toString());
                                c01.w9.x(f9Var);
                            }
                        }
                    }
                } else {
                    if (a40Var.f369713e != null) {
                        com.tencent.mm.sdk.platformtools.o4.L().H("key_cookie_" + z30Var.f391663f, a40Var.f369713e.f192156a);
                    }
                    java.util.LinkedList linkedList2 = a40Var.f369714f;
                    java.lang.String str5 = z30Var.f391663f;
                    if (linkedList2 != null && linkedList2.size() != 0) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        int i37 = 0;
                        while (i37 < linkedList2.size() && (mj6Var = (r45.mj6) linkedList2.get(i37)) != null && !com.tencent.mm.sdk.platformtools.t8.K0(mj6Var.f380594e) && !com.tencent.mm.sdk.platformtools.t8.K0(mj6Var.f380595f)) {
                            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("<sysmsg type=\"biz_sys_msg_tips\"><biz_sys_msg_tips><text><![CDATA[");
                            stringBuffer2.append(mj6Var.f380594e);
                            stringBuffer2.append("]]></text><link><scene>biz_sys_msg_tips</scene><text><![CDATA[");
                            stringBuffer2.append(mj6Var.f380595f);
                            stringBuffer2.append("]]></text><action_type>");
                            stringBuffer2.append(mj6Var.f380593d);
                            stringBuffer2.append("</action_type></link></biz_sys_msg_tips></sysmsg>");
                            com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
                            f9Var2.u1(str5);
                            f9Var2.j1(i28);
                            f9Var2.setType(i27);
                            f9Var2.e1(c01.w9.p());
                            f9Var2.d1(stringBuffer2.toString());
                            c01.w9.x(f9Var2);
                            if (i37 != 0) {
                                sb6.append(";");
                            }
                            sb6.append(mj6Var.f380594e + mj6Var.f380595f);
                            i37++;
                            i27 = 10002;
                            i28 = 2;
                        }
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(30451, str5, sb6, 0, 1);
                    }
                }
            }
            r45.pb7 pb7Var2 = a40Var.f369712d;
        }
        this.f368087d.onSceneEnd(i18, i19, str, this);
    }

    public g3(java.lang.String str, int i17, java.lang.String str2, java.util.LinkedList linkedList, java.lang.String str3, int i18, r45.j16 j16Var, r45.l36 l36Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.z30();
        lVar.f70665b = new r45.a40();
        lVar.f70666c = "/cgi-bin/micromsg-bin/clickcommand";
        lVar.f70667d = 359;
        lVar.f70668e = 176;
        lVar.f70669f = 1000000176;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f368088e = a17;
        r45.z30 z30Var = (r45.z30) a17.f70710a.f70684a;
        z30Var.f391661d = i17;
        z30Var.f391662e = str2;
        z30Var.f391663f = str;
        z30Var.f391664g = c01.ia.n();
        z30Var.f391666i = i18;
        z30Var.f391667m = com.tencent.mm.storage.c2.f193803a;
        z30Var.f391670p = str3;
        if (linkedList != null) {
            z30Var.f391665h = linkedList;
        }
        if (j16Var != null) {
            z30Var.f391668n = j16Var;
        }
        if (l36Var != null) {
            z30Var.f391669o = l36Var;
        }
        if (i17 == 14) {
            com.tencent.mm.sdk.platformtools.o4.L().W("key_cookie_" + str);
        } else if (i17 == 10) {
            byte[] j17 = com.tencent.mm.sdk.platformtools.o4.L().j("key_cookie_" + str);
            if (j17 != null) {
                z30Var.f391671q = new com.tencent.mm.protobuf.g(j17, 0, j17.length);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBizClickCommand", "click command : %s, type: %s, info: %s, MsgSource : %s, MsgReport size %d, scene %d", str, java.lang.Integer.valueOf(i17), str2, z30Var.f391664g, java.lang.Integer.valueOf(z30Var.f391665h.size()), java.lang.Integer.valueOf(i18));
    }
}
