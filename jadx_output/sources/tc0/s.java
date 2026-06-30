package tc0;

@j95.b
/* loaded from: classes5.dex */
public final class s extends i95.w implements uc0.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f417131d = "MicroMsg.RemarkRecommendFeatureService";

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Ai(int r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof tc0.r
            if (r0 == 0) goto L13
            r0 = r6
            tc0.r r0 = (tc0.r) r0
            int r1 = r0.f417130g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f417130g = r1
            goto L18
        L13:
            tc0.r r0 = new tc0.r
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f417128e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f417130g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f417127d
            tc0.s r5 = (tc0.s) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            boolean r5 = r4.Bi(r5)
            if (r5 != 0) goto L3f
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L3f:
            gc0.d3 r5 = gc0.d3.f270131a
            r0.f417127d = r4
            r0.f417130g = r3
            java.lang.Object r6 = r5.h(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r5 = r4
        L4d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L5c
            java.lang.String r5 = r5.f417131d
            java.lang.String r0 = "canUseRecommendRemark() tryInitRes false"
            com.tencent.mars.xlog.Log.i(r5, r0)
        L5c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tc0.s.Ai(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean Bi(int i17) {
        java.lang.String str = this.f417131d;
        if (i17 == 1) {
            if (!(j62.e.g().c(new com.tencent.mm.repairer.config.remark.RepairerConfigRecommendRemarkVerify()) == 1)) {
                com.tencent.mars.xlog.Log.i(str, "isRecommendRemarkOpen Verify scene disable");
                return false;
            }
        } else if (i17 == 2) {
            if (!(j62.e.g().c(new com.tencent.mm.repairer.config.remark.RepairerConfigRecommendRemarkProfile()) == 1)) {
                com.tencent.mars.xlog.Log.i(str, "isRecommendRemarkOpen Profile scene disable");
                return false;
            }
        } else if (i17 == 3) {
            if (!(j62.e.g().c(new com.tencent.mm.repairer.config.remark.RepairerConfigRecommendRemarkChat()) == 1)) {
                com.tencent.mars.xlog.Log.i(str, "isRecommendRemarkOpen Chat scene disable");
                return false;
            }
        }
        return true;
    }

    public java.lang.Object wi(int i17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        if (str != null) {
            gc0.q2 q2Var = gc0.q2.f270257a;
            long b17 = q2Var.b(str);
            long a17 = q2Var.a();
            boolean z17 = c01.id.c() - a17 < b17;
            com.tencent.mars.xlog.Log.i(this.f417131d, "canRecommendRemark:" + z17 + ", " + str + ", scene:" + i17 + ' ' + b17 + ' ' + a17);
            if (!z17) {
                return java.lang.Boolean.FALSE;
            }
        }
        return Ai(i17, continuation);
    }
}
