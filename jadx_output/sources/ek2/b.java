package ek2;

/* loaded from: classes3.dex */
public final class b extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.a f253412u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f253413v;

    /* renamed from: w, reason: collision with root package name */
    public final org.json.JSONObject f253414w;

    /* renamed from: x, reason: collision with root package name */
    public final org.json.JSONObject f253415x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j17, long j18, java.lang.String str, byte[] bArr, int i17, r45.ch1 msg, ek2.a aVar) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f253412u = aVar;
        this.f253413v = "Finder.CgiFinderAcceptLiveMic";
        r45.xd1 xd1Var = new r45.xd1();
        this.f253414w = new org.json.JSONObject();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.f253415x = jSONObject;
        xd1Var.set(4, java.lang.Long.valueOf(j17));
        xd1Var.set(1, db2.t4.f228171a.a(6852));
        xd1Var.set(5, java.lang.Long.valueOf(j18));
        xd1Var.set(6, str);
        xd1Var.set(2, com.tencent.mm.protobuf.g.b(bArr));
        xd1Var.set(8, xy2.c.f(this.f16135n));
        xd1Var.set(7, java.lang.Integer.valueOf(i17));
        xd1Var.set(3, msg);
        jSONObject.put("liveId", j17);
        jSONObject.put("objectId", j18);
        jSONObject.put(dm.i4.COL_USERNAME, xd1Var.getString(8));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = xd1Var;
        r45.yd1 yd1Var = new r45.yd1();
        yd1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) yd1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = yd1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveacceptmicwithaudience";
        lVar.f70667d = 6852;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.nw1 nw1Var;
        sm2.o4 startUIC;
        r45.kf5 kf5Var;
        tn0.w0 w0Var;
        java.lang.String str2 = str;
        r45.yd1 resp = (r45.yd1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f253413v, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str2 + " thread=" + java.lang.Thread.currentThread());
        ek2.a aVar = this.f253412u;
        if (aVar != null) {
            qf2.e eVar = (qf2.e) aVar;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("acceptLinkMic ");
            km2.q qVar = eVar.f362336a;
            sb6.append(qVar.f309173d);
            sb6.append(' ');
            sb6.append(qVar.f309170a);
            sb6.append(" errCode:");
            sb6.append(i18);
            sb6.append(" errType:");
            sb6.append(i17);
            sb6.append(" errMsg:");
            sb6.append(str2);
            com.tencent.mars.xlog.Log.i("AnchorMicCloudController", sb6.toString());
            boolean z17 = true;
            qf2.l lVar = eVar.f362337b;
            if (i18 == 0 && i17 == 0) {
                java.util.List list = ((mm2.y2) lVar.business(mm2.y2.class)).f329569v;
                kotlin.jvm.internal.o.d(list);
                pm0.v.G(list, new mm2.w2(qVar));
                list.add(qVar);
                com.tencent.mars.xlog.Log.i("LiveLinkMicLogicSlice", "safeAddReportAudienceMicUserList , user = " + qVar);
                com.tencent.mm.plugin.finder.assist.p8 p8Var = com.tencent.mm.plugin.finder.assist.p8.f102460a;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(com.tencent.mm.plugin.finder.assist.p8.f102463d, 60L);
                if (qVar.f309174e == 1) {
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f327819f, "", -1, -1);
                } else {
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f327820g, "", -1, -1);
                }
                fj2.s.f263183a.f(3, qVar.f309170a, "");
                ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
                ml2.q2 q2Var = ml2.q2.f327831r;
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) eVar.f362338c.getCustom(0);
                java.lang.String username = finderContact != null ? finderContact.getUsername() : null;
                ml2.h3[] h3VarArr = ml2.h3.f327522d;
                ml2.m2[] m2VarArr = ml2.m2.f327712d;
                j0Var.Vj(q2Var, username, 2, 2);
                com.tencent.mm.plugin.finder.live.plugin.o9 o9Var = (com.tencent.mm.plugin.finder.live.plugin.o9) lVar.R6(com.tencent.mm.plugin.finder.live.plugin.o9.class);
                if (o9Var != null) {
                    pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.i9(o9Var, qVar.f309170a, 0));
                }
                zl2.r4 r4Var = zl2.r4.f473950a;
                java.lang.String str3 = qVar.f309170a;
                if (str3 == null) {
                    str3 = "";
                }
                int l86 = ((mm2.c1) lVar.business(mm2.c1.class)).l8();
                km2.q l76 = ((mm2.o4) lVar.business(mm2.o4.class)).l7();
                if (r4Var.q3(str3, l86, false, l76 != null ? l76.f309175f : null) && (w0Var = dk2.ef.f233378d) != null) {
                    w0Var.M0(false);
                }
                com.tencent.mm.protobuf.g byteString = resp.getByteString(4);
                if (byteString != null) {
                    r45.t74 t74Var = new r45.t74();
                    byte[] bArr = byteString.f192156a;
                    if (bArr != null) {
                        try {
                            t74Var.parseFrom(bArr);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                        }
                    }
                    r45.il4 il4Var = t74Var.f386198g;
                    if (il4Var != null && (kf5Var = il4Var.f377132g) != null) {
                        int i19 = kf5Var.f378656d * 60;
                        com.tencent.mars.xlog.Log.i(qVar.H, "set payDuration : " + i19);
                        qVar.K = i19;
                    }
                }
                ((mm2.o4) lVar.business(mm2.o4.class)).N7(qVar);
                ((mm2.o4) lVar.business(mm2.o4.class)).f329322q.clear();
                com.tencent.mm.plugin.finder.live.plugin.c4 c4Var = (com.tencent.mm.plugin.finder.live.plugin.c4) lVar.R6(com.tencent.mm.plugin.finder.live.plugin.c4.class);
                if (c4Var != null) {
                    c4Var.E1();
                }
            } else {
                if (str2 != null && str.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    str2 = null;
                }
                if (i18 == -200074) {
                    android.content.Context O6 = lVar.O6();
                    if (str2 == null) {
                        str2 = lVar.O6().getResources().getString(com.tencent.mm.R.string.dm7);
                        kotlin.jvm.internal.o.f(str2, "getString(...)");
                    }
                    db5.t7.makeText(O6, str2, 0).show();
                } else {
                    android.content.Context O62 = lVar.O6();
                    if (str2 == null) {
                        str2 = lVar.O6().getResources().getString(com.tencent.mm.R.string.lun);
                        kotlin.jvm.internal.o.f(str2, "getString(...)");
                    }
                    db5.t7.makeText(O62, str2, 0).show();
                    mm2.e1 e1Var = (mm2.e1) lVar.business(mm2.e1.class);
                    long j17 = (e1Var == null || (nw1Var = e1Var.f328988r) == null) ? 0L : nw1Var.getLong(0);
                    com.tencent.mars.xlog.Log.i("FinderLiveMicWatcher", "onAnchorAcceptMicFail errCode: " + i18 + " errType: " + i17 + " liveId: " + j17);
                    com.tencent.mm.plugin.finder.assist.p8 p8Var2 = com.tencent.mm.plugin.finder.assist.p8.f102460a;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.B(com.tencent.mm.plugin.finder.assist.p8.f102463d, 62L);
                    pm0.z.b(xy2.b.f458155b, "mic_anchorAcceptMicFail", false, null, null, false, false, new dk2.oa(i18, i17, j17), 60, null);
                }
                mk2.h.f327133a.c(qVar.f309175f);
                com.tencent.mm.plugin.finder.live.view.ub ubVar = lVar.f291099e;
                com.tencent.mm.plugin.finder.live.view.v1 v1Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.v1 ? (com.tencent.mm.plugin.finder.live.view.v1) ubVar : null;
                if (v1Var != null && (startUIC = v1Var.getStartUIC()) != null) {
                    sm2.o4.H(startUIC, eVar.f362336a, 1, false, false, qf2.a.f362279d, 12, null);
                }
                java.util.List list2 = ((mm2.o4) lVar.business(mm2.o4.class)).f329335z;
                kotlin.jvm.internal.o.f(list2, "<get-linkMicUserInfoList>(...)");
                java.lang.String str4 = eVar.f362339d;
                pm0.v.G(list2, new qf2.b(str4));
                java.util.List list3 = ((mm2.o4) lVar.business(mm2.o4.class)).f329318o;
                if (list3 != null) {
                    pm0.v.G(list3, new qf2.c(str4));
                }
                qVar.f309181l = 0;
            }
            pm0.v.X(new qf2.d(lVar));
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f253415x;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f253414w;
    }
}
