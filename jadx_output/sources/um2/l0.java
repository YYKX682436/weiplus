package um2;

/* loaded from: classes3.dex */
public final class l0 implements hn0.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428861a;

    public l0(um2.x5 x5Var) {
        this.f428861a = x5Var;
    }

    @Override // hn0.i
    public void callback(int i17, android.os.Bundle bundle) {
        co0.s y17;
        mn0.b0 b0Var;
        mm2.e1 e1Var;
        r45.nw1 nw1Var;
        java.lang.Class cls;
        long j17;
        mm2.e1 e1Var2;
        r45.nw1 nw1Var2;
        mm2.c1 c1Var;
        mm2.e1 e1Var3;
        r45.nw1 nw1Var3;
        com.tencent.mm.plugin.finder.report.p1 p1Var;
        co0.s E;
        mn0.b0 b0Var2;
        mm2.e1 e1Var4;
        r45.nw1 nw1Var4;
        um2.x5 x5Var = this.f428861a;
        boolean z17 = x5Var.f429070r1;
        java.lang.String str = x5Var.f429032f;
        if (z17 && i17 != 2033) {
            com.tencent.mars.xlog.Log.i(str, "firstFrameCallback: isPrepareLive callback, eventCode=" + i17);
            if (i17 != 2003 || (E = x5Var.E()) == null || (b0Var2 = E.R1.f282409a) == null) {
                return;
            }
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            java.lang.String str2 = a52.a.f1584l;
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            fm2.c cVar = x5Var.f19606c;
            java.lang.String valueOf = java.lang.String.valueOf(r0Var.Ri((cVar == null || (e1Var4 = (mm2.e1) cVar.business(mm2.e1.class)) == null || (nw1Var4 = e1Var4.f328988r) == null) ? 0L : nw1Var4.getLong(0)));
            kotlin.jvm.internal.o.d(str2);
            ((mn0.y) b0Var2).h(str2, valueOf + "_isPrepare", x5Var.f429076t1 > 0 ? android.os.SystemClock.elapsedRealtime() - x5Var.f429076t1 : 0L);
            x5Var.f429076t1 = 0L;
            return;
        }
        if (i17 == 2001) {
            com.tencent.mm.plugin.finder.report.p1 p1Var2 = com.tencent.mm.plugin.finder.report.q1.f125258d;
            if (p1Var2 == null) {
                return;
            }
            p1Var2.f125233d = android.os.SystemClock.elapsedRealtime();
            return;
        }
        if (i17 == 2008) {
            com.tencent.mm.plugin.finder.report.p1 p1Var3 = com.tencent.mm.plugin.finder.report.q1.f125258d;
            if (p1Var3 == null) {
                return;
            }
            p1Var3.f125234e = android.os.SystemClock.elapsedRealtime();
            return;
        }
        if (i17 == 2033) {
            com.tencent.mars.xlog.Log.i(str, "firstFrameCallback: PLAY_EVT_RENDER_FIRST_FRAME_ON_VIEW, isPrepareLive=" + x5Var.f429070r1);
            if (x5Var.f429070r1) {
                com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var = x5Var.f429038h;
                if (ob0Var != null && (y17 = ob0Var.y1()) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreVisitor", "cdnPausePlay");
                    y17.R1.i(true);
                }
                x5Var.f429073s1 = true;
            }
            x5Var.f429070r1 = false;
            x5Var.f429076t1 = 0L;
            return;
        }
        if (i17 != 2003) {
            if (i17 == 2004 && (p1Var = com.tencent.mm.plugin.finder.report.q1.f125258d) != null) {
                p1Var.f125235f = android.os.SystemClock.elapsedRealtime();
                return;
            }
            return;
        }
        ml2.r0 r0Var2 = (ml2.r0) i95.n0.c(ml2.r0.class);
        long j18 = ((mm2.e1) x5Var.c(mm2.e1.class)).f328988r.getLong(0);
        r0Var2.getClass();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#markFirstFrameAvailable " + j18);
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveCdnUserEnterLiveTimeCostStruct Ni = r0Var2.Ni(j18);
        Ni.f57086e = j18;
        if (Ni.f57090i == 0) {
            Ni.f57090i = c01.id.c();
        }
        com.tencent.mm.plugin.finder.report.r5.f125335a.a();
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) x5Var.f19609a.a(mm2.c1.class)).f328846n;
        jz5.f0 f0Var = null;
        java.lang.String nickname = finderObject != null ? finderObject.getNickname() : null;
        kn0.i iVar = ((mm2.e1) x5Var.c(mm2.e1.class)).f328990t;
        kn0.g gVar = iVar != null ? iVar.f309558b : null;
        if (gVar != null) {
            gVar.f309549p = nickname == null ? "" : nickname;
        }
        com.tencent.mm.plugin.finder.report.q1 q1Var = com.tencent.mm.plugin.finder.report.q1.f125255a;
        kn0.i iVar2 = ((mm2.e1) x5Var.c(mm2.e1.class)).f328990t;
        q1Var.d(iVar2 != null ? iVar2.f309558b : null, null);
        com.tencent.mars.xlog.Log.i(str, "TXLivePlayer:receive first frame");
        ml2.t5 t5Var = ml2.t5.f328020a;
        long j19 = ((mm2.e1) x5Var.c(mm2.e1.class)).f328988r.getLong(0);
        if (nickname == null) {
            nickname = "";
        }
        t5Var.b(j19, nickname, 1);
        fm2.c cVar2 = x5Var.f19606c;
        if (cVar2 != null) {
            qo0.c.a(cVar2, qo0.b.f365379l4, null, 2, null);
        }
        um2.m mVar = um2.m.f428873a;
        co0.s E2 = x5Var.E();
        if (E2 != null && (b0Var = E2.R1.f282409a) != null) {
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            java.lang.String str3 = a52.a.f1584l;
            ml2.r0 r0Var3 = (ml2.r0) i95.n0.c(ml2.r0.class);
            fm2.c cVar3 = x5Var.f19606c;
            java.lang.String valueOf2 = java.lang.String.valueOf(r0Var3.Ri((cVar3 == null || (e1Var3 = (mm2.e1) cVar3.business(mm2.e1.class)) == null || (nw1Var3 = e1Var3.f328988r) == null) ? 0L : nw1Var3.getLong(0)));
            ml2.q1 q1Var2 = ml2.q1.f327812e;
            if (kotlin.jvm.internal.o.b(str3, "temp_2")) {
                fm2.c cVar4 = x5Var.f19606c;
                if (cVar4 == null || (c1Var = (mm2.c1) cVar4.business(mm2.c1.class)) == null) {
                    cls = je2.z.class;
                    j17 = 0;
                } else {
                    j17 = c1Var.f328915x6;
                    cls = je2.z.class;
                    c1Var.f328915x6 = 0L;
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.qa4 qa4Var = new r45.qa4();
                qa4Var.set(0, "ScrollLive");
                qa4Var.set(1, java.lang.Long.valueOf(j17));
                linkedList.add(qa4Var);
                long elapsedRealtime = j17 > 0 ? android.os.SystemClock.elapsedRealtime() - j17 : 0L;
                mn0.y yVar = (mn0.y) b0Var;
                mn0.k0 l17 = yVar.l();
                com.tencent.mars.xlog.Log.i(str, "firstFrameReport scroll to live:" + elapsedRealtime + ',' + l17);
                kotlin.jvm.internal.o.d(str3);
                java.lang.Class cls2 = cls;
                yVar.r(str3, valueOf2, ((je2.z) x5Var.c(cls2)).f299290g, ((je2.z) x5Var.c(cls2)).f299291h);
                yVar.h(str3, valueOf2, elapsedRealtime);
                zl2.q4 q4Var = zl2.q4.f473933a;
                fm2.c cVar5 = x5Var.f19606c;
                q4Var.L(str3, (cVar5 == null || (e1Var2 = (mm2.e1) cVar5.business(mm2.e1.class)) == null || (nw1Var2 = e1Var2.f328988r) == null) ? 0L : nw1Var2.getLong(0), valueOf2, elapsedRealtime, linkedList, l17, (r21 & 64) != 0 ? "" : null);
            } else {
                java.util.LinkedList i86 = ((mm2.c1) x5Var.c(mm2.c1.class)).i8();
                mn0.y yVar2 = (mn0.y) b0Var;
                mn0.k0 l18 = yVar2.l();
                zl2.q4 q4Var2 = zl2.q4.f473933a;
                long e17 = q4Var2.e(i86, l18);
                kotlin.jvm.internal.o.d(str3);
                yVar2.r(str3, valueOf2, ((je2.z) x5Var.c(je2.z.class)).f299290g, ((je2.z) x5Var.c(je2.z.class)).f299291h);
                yVar2.h(str3, valueOf2, e17);
                fm2.c cVar6 = x5Var.f19606c;
                q4Var2.L(str3, (cVar6 == null || (e1Var = (mm2.e1) cVar6.business(mm2.e1.class)) == null || (nw1Var = e1Var.f328988r) == null) ? 0L : nw1Var.getLong(0), valueOf2, e17, i86, l18, (r21 & 64) != 0 ? "" : null);
                com.tencent.mars.xlog.Log.i(str, "firstFrameReport businessFirstFrame:" + e17 + ',' + l18);
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i(str, "firstFrameReport but player is null!");
        }
    }
}
