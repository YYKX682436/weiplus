package ek2;

/* loaded from: classes3.dex */
public final class g2 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.f2 f253453u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f253454v;

    public g2(long j17, long j18, java.lang.String str, byte[] bArr, int i17, java.lang.String str2, ek2.f2 f2Var) {
        super(null, 1, null);
        this.f253453u = f2Var;
        this.f253454v = "Finder.CgiFinderLiveRefreshMic";
        r45.z62 z62Var = new r45.z62();
        z62Var.set(3, java.lang.Long.valueOf(j17));
        z62Var.set(1, db2.t4.f228171a.a(4180));
        z62Var.set(4, java.lang.Long.valueOf(j18));
        z62Var.set(5, str);
        z62Var.set(7, xy2.c.f(this.f16135n));
        z62Var.set(6, java.lang.Integer.valueOf(i17));
        z62Var.set(2, com.tencent.mm.protobuf.g.b(bArr));
        z62Var.set(8, str2);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = z62Var;
        r45.a72 a72Var = new r45.a72();
        a72Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) a72Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = a72Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliverefreshmicwithaudience";
        lVar.f70667d = 4180;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveRefreshMic", "liveId:" + z62Var.getLong(3) + " objectId:" + z62Var.getLong(4) + " objectNonceId:" + z62Var.getString(5) + " scene:" + z62Var.getInteger(6) + " mic_sdk_user_id:" + z62Var.getString(8));
        p(a17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ma4 ma4Var;
        co0.s u07;
        kn0.i iVar;
        r45.nw1 nw1Var;
        r45.a72 resp = (r45.a72) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f253454v, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.f2 f2Var = this.f253453u;
        if (f2Var != null) {
            dk2.vd vdVar = (dk2.vd) f2Var;
            dk2.ef efVar = dk2.ef.f233372a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleRefreshMicResp errCode:");
            sb6.append(i18);
            sb6.append(", errType:");
            sb6.append(i17);
            sb6.append(", curData:");
            mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
            com.tencent.trtc.TRTCCloudDef.TRTCParams tRTCParams = null;
            boolean z17 = false;
            sb6.append((e1Var == null || (nw1Var = e1Var.f328988r) == null) ? null : java.lang.Long.valueOf(nw1Var.getLong(0)));
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", sb6.toString());
            if (i17 == 0 && i18 == 0 && (ma4Var = (r45.ma4) resp.getCustom(1)) != null) {
                mm2.e1 e1Var2 = (mm2.e1) efVar.i(mm2.e1.class);
                if (e1Var2 != null) {
                    e1Var2.f328987q = ma4Var;
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "handleRefreshMicResp updatePrivateMapKey");
                in0.q qVar = in0.q.f292769b2;
                if (qVar != null) {
                    if (qVar == null) {
                        in0.q.f292769b2 = new in0.q(rn0.a.f397609a.a());
                    }
                    in0.q qVar2 = in0.q.f292769b2;
                    kotlin.jvm.internal.o.d(qVar2);
                    qVar2.O0(ma4Var.f380299i.i());
                } else {
                    sn0.b bVar = sn0.b.f409964e2;
                    if (bVar != null) {
                        if (bVar == null) {
                            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.LiveCoreSecondaryDevice", "createInstance", new java.lang.Object[0]);
                            sn0.b.f409964e2 = new sn0.b();
                        }
                        sn0.b bVar2 = sn0.b.f409964e2;
                        kotlin.jvm.internal.o.d(bVar2);
                        bVar2.O0(ma4Var.f380299i.i());
                    } else if (efVar.u0() != null && (u07 = efVar.u0()) != null) {
                        u07.O0(ma4Var.f380299i.i());
                    }
                }
                mm2.e1 e1Var3 = (mm2.e1) efVar.i(mm2.e1.class);
                if (e1Var3 != null && (iVar = e1Var3.f328990t) != null) {
                    tRTCParams = iVar.f309557a;
                }
                if (tRTCParams != null) {
                    tRTCParams.privateMapKey = ma4Var.f380299i.i();
                }
                efVar.t0(ma4Var);
                z17 = true;
            }
            dk2.xg xgVar = dk2.ef.f233395l0;
            if (xgVar != null) {
                xgVar.a();
            }
            if (z17) {
                long j17 = (vdVar.f234248a.f328987q.f380303p - 60) * 1000;
                if (j17 < 60000) {
                    j17 = 60000;
                }
                efVar.Q(j17);
            }
        }
    }
}
