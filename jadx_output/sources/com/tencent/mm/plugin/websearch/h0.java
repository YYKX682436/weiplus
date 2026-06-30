package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public class h0 implements su4.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.q0 f181535a;

    public h0(com.tencent.mm.plugin.websearch.q0 q0Var) {
        this.f181535a = q0Var;
    }

    @Override // su4.j1
    public void a(su4.d2 d2Var) {
        su4.z1 z1Var;
        byte[] bArr;
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "handleCallback %s", d2Var);
        if (d2Var == null) {
            return;
        }
        int intValue = ((java.lang.Integer) d2Var.f412855d).intValue();
        com.tencent.mm.plugin.websearch.p0 p0Var = (com.tencent.mm.plugin.websearch.p0) d2Var.f412856e;
        if (p0Var == null || (z1Var = p0Var.f181584c) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.FTSWebViewLogic", "onSceneEnd netResult invalid");
            return;
        }
        int i18 = p0Var.f181583b;
        int i19 = p0Var.f181582a;
        if (i19 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.FTSWebViewLogic", "onSceneEnd errType %d,errCode %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
            return;
        }
        su4.c cVar = new su4.c();
        cVar.f412824a = z1Var.f413151h;
        r45.th4 th4Var = z1Var.f413149f;
        cVar.f412827d = th4Var.f386439e;
        cVar.f412826c = th4Var.f386438d;
        cVar.f412828e = java.lang.System.currentTimeMillis() / 1000;
        cVar.f412829f = z1Var.f413149f.f386440f;
        cVar.f412825b = z1Var.f413150g;
        java.lang.String a17 = su4.c.a(ys3.l.a(), cVar.f412824a, cVar.f412825b, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "NetSceneWebSearchGuide cgi data %s getCacheFileName:%s, bizCacheObj.lastCacheSecond:%d", cVar.f412826c, a17, java.lang.Long.valueOf(cVar.f412828e));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f412826c)) {
            int i27 = cVar.f412824a;
            if (i27 == 103) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "Processing hot search data for scene: %d, requestId: %s", java.lang.Integer.valueOf(i27), z1Var.f413153m);
                try {
                    rv4.q.f400544a.c(cVar.f412826c);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "Hot search data processed successfully");
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.FTSWebViewLogic", "Failed to process hot search data", e17);
                }
            } else {
                java.lang.Object obj = d2Var.f412857f;
                if (obj instanceof java.lang.Integer) {
                    int intValue2 = ((java.lang.Integer) obj).intValue();
                    ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Zi(intValue2, 0, cVar.f412826c, 0, z1Var.f413153m);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "onTeachSearchDataReady2, %d", java.lang.Integer.valueOf(intValue2));
                }
                ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Zi(intValue, 0, cVar.f412826c, 0, z1Var.f413153m);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "onTeachSearchDataReady, %d, %s", java.lang.Integer.valueOf(intValue), cVar.f412826c);
            }
        }
        this.f181535a.f181594g.put(a17, cVar);
        if (cVar.f412827d == 0) {
            java.lang.String a18 = ys3.l.a();
            int i28 = cVar.f412824a;
            int i29 = cVar.f412825b;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BizCacheObj", "delete biz cache %d %d", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(a18, su4.c.a(a18, i28, i29, true));
            if (r6Var.m()) {
                r6Var.l();
            }
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(a18, su4.c.a(a18, i28, i29, false));
            if (r6Var2.m()) {
                r6Var2.l();
            }
        } else {
            java.lang.String a19 = ys3.l.a();
            r45.qh4 qh4Var = new r45.qh4();
            qh4Var.f383995d = cVar.f412824a;
            qh4Var.f383996e = cVar.f412826c;
            qh4Var.f383997f = cVar.f412827d;
            qh4Var.f383998g = cVar.f412828e;
            qh4Var.f383999h = cVar.f412829f;
            qh4Var.f384000i = cVar.f412825b;
            try {
                bArr = qh4Var.toByteArray();
            } catch (java.io.IOException unused) {
                bArr = null;
            }
            if (bArr != null) {
                com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(a19, su4.c.a(a19, cVar.f412824a, cVar.f412825b, true));
                if (!r6Var3.s().m()) {
                    r6Var3.s().J();
                }
                if (r6Var3.m()) {
                    r6Var3.l();
                }
                com.tencent.mm.vfs.w6.S(r6Var3.o(), bArr, 0, bArr.length);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BizCacheObj", "save bizCacheFile %s %d", r6Var3.o(), java.lang.Integer.valueOf(bArr.length));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BizCacheObj", "save bizCacheFile fail");
            }
        }
        int i37 = cVar.f412824a;
        if (i37 == 20 && (i17 = cVar.f412825b) == 0) {
            su4.k3.b(i37, 1, cVar.f412829f, i17, 2, cVar.b(), 1);
        } else {
            su4.k3.b(i37, 1, cVar.f412829f, cVar.f412825b, 1, "", 0);
        }
    }
}
