package rm;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrm/a0;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/brandService/GetBizRequest;", "Lcom/tencent/mm/brandService/GetBizResponse;", "<init>", "()V", "biz-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class a0 implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.brandService.GetBizRequest, com.tencent.mm.brandService.GetBizResponse> {
    public static final org.json.JSONObject a(rm.a0 a0Var, int i17, com.tencent.wechat.mm.biz.b bVar) {
        org.json.JSONObject jSONObject;
        a0Var.getClass();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("bizType", i17);
        java.lang.String str = bVar.f217889e;
        if (str == null) {
            str = "";
        }
        jSONObject2.put("biz", str);
        jSONObject2.put("interactiveIdentityType", bVar.f217897p ? 1 : 0);
        jSONObject2.put("initFlag", bVar.f217894m);
        try {
            jSONObject = pm0.b0.g(bVar);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("GetPersonalCenterBizTask", "Failed to convert acct to JSON, bizType=" + i17, e17);
            jSONObject = new org.json.JSONObject();
        }
        jSONObject2.put("fullInfo", jSONObject);
        return jSONObject2;
    }

    public final void b(boolean z17, com.tencent.mm.ipcinvoker.r rVar) {
        if (!z17) {
            ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).getClass();
            com.tencent.mm.brandService.GetBizResponse getBizResponse = new com.tencent.mm.brandService.GetBizResponse(true, "", 0, "", ((r01.l1) i95.n0.c(r01.l1.class)).Di().toString(), false, null, 96, null);
            if (rVar != null) {
                rVar.a(getBizResponse);
                return;
            }
            return;
        }
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        rm.x xVar = new rm.x(rVar, this);
        ((ox.r) d0Var).getClass();
        r01.l1 l1Var = (r01.l1) i95.n0.c(r01.l1.class);
        l1Var.getClass();
        kotlinx.coroutines.l.d(l1Var.f368143e, null, null, new r01.u0(l1Var, xVar, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r13.f217897p == true) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        if (r13.f217897p == true) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(boolean r13, int r14, com.tencent.mm.ipcinvoker.r r15) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Class<rm.d0> r1 = rm.d0.class
            if (r13 != 0) goto Lac
            i95.m r13 = i95.n0.c(r1)
            rm.d0 r13 = (rm.d0) r13
            ox.r r13 = (ox.r) r13
            r13.getClass()
            r13 = 2
            java.lang.Class<r01.l1> r2 = r01.l1.class
            if (r14 == r0) goto L24
            if (r14 == r13) goto L19
            r3 = 0
            goto L2e
        L19:
            i95.m r3 = i95.n0.c(r2)
            r01.l1 r3 = (r01.l1) r3
            r01.m0 r3 = r3.f368148m
            com.tencent.wechat.mm.biz.b r3 = r3.f368154b
            goto L2e
        L24:
            i95.m r3 = i95.n0.c(r2)
            r01.l1 r3 = (r01.l1) r3
            r01.m0 r3 = r3.f368147i
            com.tencent.wechat.mm.biz.b r3 = r3.f368154b
        L2e:
            if (r3 != 0) goto L4f
            java.lang.String r13 = "GetPersonalCenterBizTask"
            java.lang.String r14 = "getBizForPublish failed, acctResp is null"
            com.tencent.mars.xlog.Log.e(r13, r14)
            if (r15 == 0) goto L4e
            com.tencent.mm.brandService.GetBizResponse r13 = new com.tencent.mm.brandService.GetBizResponse
            r1 = 0
            java.lang.String r2 = ""
            r3 = 0
            java.lang.String r4 = "getBiz failed"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 112(0x70, float:1.57E-43)
            r9 = 0
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r15.a(r13)
        L4e:
            return
        L4f:
            i95.m r1 = i95.n0.c(r1)
            rm.d0 r1 = (rm.d0) r1
            ox.r r1 = (ox.r) r1
            r1.getClass()
            r1 = 0
            if (r14 == r0) goto L72
            if (r14 == r13) goto L61
            r7 = r1
            goto L85
        L61:
            i95.m r13 = i95.n0.c(r2)
            r01.l1 r13 = (r01.l1) r13
            r01.m0 r13 = r13.f368148m
            com.tencent.wechat.mm.biz.b r13 = r13.f368154b
            if (r13 == 0) goto L83
            boolean r13 = r13.f217897p
            if (r13 != r0) goto L83
            goto L84
        L72:
            i95.m r13 = i95.n0.c(r2)
            r01.l1 r13 = (r01.l1) r13
            r01.m0 r13 = r13.f368147i
            com.tencent.wechat.mm.biz.b r13 = r13.f368154b
            if (r13 == 0) goto L83
            boolean r13 = r13.f217897p
            if (r13 != r0) goto L83
            goto L84
        L83:
            r0 = r1
        L84:
            r7 = r0
        L85:
            com.tencent.mm.brandService.GetBizResponse r13 = new com.tencent.mm.brandService.GetBizResponse
            r5 = 1
            java.lang.String r6 = r3.f217889e
            java.lang.String r14 = "biz"
            kotlin.jvm.internal.o.f(r6, r14)
            java.lang.String r8 = ""
            r9 = 0
            boolean r10 = r3.f217894m
            org.json.JSONObject r14 = pm0.b0.g(r3)
            java.lang.String r11 = r14.toString()
            java.lang.String r14 = "toString(...)"
            kotlin.jvm.internal.o.f(r11, r14)
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            if (r15 == 0) goto Lab
            r15.a(r13)
        Lab:
            return
        Lac:
            i95.m r13 = i95.n0.c(r1)
            rm.d0 r13 = (rm.d0) r13
            ox.r r13 = (ox.r) r13
            com.tencent.wechat.iam.biz.z0 r13 = r13.Bi(r14)
            rm.z r14 = new rm.z
            r14.<init>(r15)
            r13.a(r0, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rm.a0.c(boolean, int, com.tencent.mm.ipcinvoker.r):void");
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.brandService.GetBizRequest data = (com.tencent.mm.brandService.GetBizRequest) obj;
        kotlin.jvm.internal.o.g(data, "data");
        try {
            int i17 = data.f63619e;
            boolean z17 = data.f63618d;
            if (data.f63620f) {
                b(z17, rVar);
            } else {
                c(z17, i17, rVar);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("GetPersonalCenterBizTask", e17, "getBiz exception", new java.lang.Object[0]);
            if (rVar != null) {
                rVar.a(new com.tencent.mm.brandService.GetBizResponse(false, "", 0, "getBiz exception", null, false, null, 112, null));
            }
        }
    }
}
