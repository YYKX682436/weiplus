package com.tencent.paymars.smc;

/* loaded from: classes15.dex */
public class SmcProtoBufUtil {
    private static p45.o fillStrategyTable(java.util.LinkedList<r45.nf6> linkedList) {
        p45.o oVar = new p45.o();
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            r45.nf6 nf6Var = linkedList.get(i17);
            p45.m mVar = new p45.m();
            mVar.f351951d = nf6Var.f381364d;
            mVar.f351952e = nf6Var.f381365e;
            int i18 = 0;
            while (true) {
                java.util.LinkedList linkedList2 = nf6Var.f381366f;
                if (i18 < linkedList2.size()) {
                    r45.cw4 cw4Var = (r45.cw4) linkedList2.get(i18);
                    p45.n nVar = new p45.n();
                    nVar.f351954d = cw4Var.f371862d;
                    nVar.f351955e = cw4Var.f371865g;
                    nVar.f351956f = cw4Var.f371863e;
                    nVar.f351957g = cw4Var.f371864f;
                    nVar.f351958h = cw4Var.f371866h;
                    nVar.f351959i = cw4Var.f371867i;
                    nVar.f351960m = cw4Var.f371868m;
                    nVar.f351961n = cw4Var.f371869n;
                    mVar.f351953f.add(nVar);
                    i18++;
                }
            }
            oVar.f351962d.add(mVar);
        }
        return oVar;
    }

    public static r45.ed3 toMMGetStrategyReq() {
        r45.ed3 ed3Var = new r45.ed3();
        java.util.ArrayList<java.lang.Integer> strategyVersions = ((com.tencent.paymars.smc.SmcManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.smc.SmcManager.class)).getStrategyVersions();
        if (strategyVersions.size() != 6) {
            return null;
        }
        ed3Var.f373303d = strategyVersions.get(0).intValue();
        ed3Var.f373304e = strategyVersions.get(1).intValue();
        ed3Var.f373305f = strategyVersions.get(2).intValue();
        ed3Var.f373307h = strategyVersions.get(3).intValue();
        ed3Var.f373308i = strategyVersions.get(4).intValue();
        ed3Var.f373309m = strategyVersions.get(5).intValue();
        return ed3Var;
    }

    public static r45.u30 toMMReportIdkeyReq(p45.g gVar) {
        r45.u30 u30Var = new r45.u30();
        u30Var.f386978d = gVar.f351914d;
        u30Var.f386979e = gVar.f351915e;
        u30Var.f386980f = 0;
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList = gVar.f351916f;
            if (i17 >= linkedList.size()) {
                return u30Var;
            }
            p45.b bVar = (p45.b) linkedList.get(i17);
            r45.t30 t30Var = new r45.t30();
            t30Var.f386082d = bVar.f351879d;
            t30Var.f386084f = bVar.f351880e;
            t30Var.f386085g = bVar.f351882g;
            int i18 = 0;
            while (true) {
                java.util.LinkedList linkedList2 = bVar.f351881f;
                if (i18 < linkedList2.size()) {
                    p45.a aVar = (p45.a) linkedList2.get(i18);
                    r45.b44 b44Var = new r45.b44();
                    b44Var.f370513d = aVar.f351876d;
                    b44Var.f370516g = 0;
                    b44Var.f370515f = 0;
                    b44Var.f370517h = aVar.f351878f;
                    b44Var.f370514e = com.tencent.mm.protobuf.g.b(java.lang.Integer.toString(aVar.f351877e).getBytes());
                    t30Var.f386086h.add(b44Var);
                    i18++;
                }
            }
            u30Var.f386981g.add(t30Var);
            i17++;
        }
    }

    public static r45.u30 toMMReportKvReq(p45.i iVar) {
        r45.u30 u30Var = new r45.u30();
        u30Var.f386978d = iVar.f351926d;
        u30Var.f386979e = iVar.f351927e;
        u30Var.f386980f = iVar.f351928f;
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList = iVar.f351929g;
            if (i17 >= linkedList.size()) {
                return u30Var;
            }
            p45.e eVar = (p45.e) linkedList.get(i17);
            r45.t30 t30Var = new r45.t30();
            t30Var.f386082d = eVar.f351895d;
            t30Var.f386084f = eVar.f351896e;
            t30Var.f386085g = eVar.f351897f;
            t30Var.f386083e = eVar.f351901m;
            t30Var.f386087i = eVar.f351899h;
            t30Var.f386088m = eVar.f351900i;
            t30Var.f386089n = eVar.f351902n;
            t30Var.f386090o = eVar.f351903o;
            t30Var.f386091p = eVar.f351904p;
            int i18 = 0;
            while (true) {
                java.util.LinkedList linkedList2 = eVar.f351898g;
                if (i18 < linkedList2.size()) {
                    p45.d dVar = (p45.d) linkedList2.get(i18);
                    r45.b44 b44Var = new r45.b44();
                    b44Var.f370513d = dVar.f351890d;
                    b44Var.f370514e = dVar.f351891e;
                    b44Var.f370515f = dVar.f351892f;
                    b44Var.f370516g = dVar.f351893g;
                    b44Var.f370517h = dVar.f351894h;
                    t30Var.f386086h.add(b44Var);
                    i18++;
                }
            }
            u30Var.f386981g.add(t30Var);
            i17++;
        }
    }

    public static r45.zx3 toMMSelfMonitor(p45.k kVar) {
        r45.zx3 zx3Var = new r45.zx3();
        zx3Var.f392453d = kVar.f351941d;
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList = kVar.f351942e;
            if (i17 >= linkedList.size()) {
                return zx3Var;
            }
            r45.ay3 ay3Var = new r45.ay3();
            p45.l lVar = (p45.l) linkedList.get(i17);
            ay3Var.f370362d = lVar.f351943d;
            ay3Var.f370363e = lVar.f351944e;
            ay3Var.f370364f = lVar.f351945f;
            ay3Var.f370365g = lVar.f351946g;
            ay3Var.f370366h = lVar.f351947h;
            ay3Var.f370367i = lVar.f351948i;
            ay3Var.f370368m = lVar.f351949m;
            ay3Var.f370369n = lVar.f351950n;
            zx3Var.f392454e.add(ay3Var);
            i17++;
        }
    }

    public static p45.c toSmcIdkeyStrategyResp(r45.fd3 fd3Var) {
        p45.c cVar = new p45.c();
        cVar.f351883d = fd3Var.f374222d;
        cVar.f351884e = fd3Var.f374223e;
        cVar.f351885f = fd3Var.f374224f;
        cVar.f351888i = fd3Var.f374229n;
        cVar.f351889m = fd3Var.f374231p;
        cVar.f351886g = fillStrategyTable(fd3Var.f374226h);
        cVar.f351887h = fillStrategyTable(fd3Var.f374227i);
        return cVar;
    }

    public static p45.f toSmcKVStrategyResp(r45.fd3 fd3Var) {
        p45.f fVar = new p45.f();
        fVar.f351905d = fd3Var.f374222d;
        fVar.f351906e = fd3Var.f374232q;
        fVar.f351907f = fd3Var.f374233r;
        fVar.f351908g = fd3Var.f374234s;
        fVar.f351912n = fd3Var.f374229n;
        fVar.f351913o = fd3Var.f374231p;
        fVar.f351909h = fillStrategyTable(fd3Var.f374235t);
        fVar.f351910i = fillStrategyTable(fd3Var.f374236u);
        fVar.f351911m = fillStrategyTable(fd3Var.f374237v);
        return fVar;
    }

    public static p45.h toSmcReportIdkeyResp(r45.v30 v30Var) {
        p45.h hVar = new p45.h();
        hVar.f351918d = v30Var.f387836d;
        hVar.f351919e = v30Var.f387837e;
        hVar.f351920f = v30Var.f387838f;
        hVar.f351923i = v30Var.f387843n;
        hVar.f351924m = v30Var.f387844o;
        hVar.f351925n = v30Var.f387845p;
        hVar.f351921g = fillStrategyTable(v30Var.f387840h);
        hVar.f351922h = fillStrategyTable(v30Var.f387841i);
        return hVar;
    }

    public static p45.j toSmcReportKvResp(r45.v30 v30Var) {
        p45.j jVar = new p45.j();
        jVar.f351931d = v30Var.f387836d;
        jVar.f351932e = v30Var.f387837e;
        jVar.f351933f = v30Var.f387838f;
        jVar.f351934g = v30Var.f387839g;
        jVar.f351938n = v30Var.f387843n;
        jVar.f351939o = v30Var.f387844o;
        jVar.f351940p = v30Var.f387845p;
        jVar.f351935h = fillStrategyTable(v30Var.f387840h);
        jVar.f351936i = fillStrategyTable(v30Var.f387841i);
        jVar.f351937m = fillStrategyTable(v30Var.f387842m);
        return jVar;
    }
}
