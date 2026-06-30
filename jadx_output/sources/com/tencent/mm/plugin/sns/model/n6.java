package com.tencent.mm.plugin.sns.model;

/* loaded from: classes2.dex */
public final class n6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.model.n6 f164514a = new com.tencent.mm.plugin.sns.model.n6();

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(2:21|22))|11|12|13))|25|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsStarCgiHelper", "doRequestSnsStarAction error >> " + r12);
        r15 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r12, long r13, kotlin.coroutines.Continuation r15) {
        /*
            r11 = this;
            java.lang.String r0 = "doRequestSnsStarAction"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsStarCgiHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r15 instanceof com.tencent.mm.plugin.sns.model.l6
            if (r2 == 0) goto L1a
            r2 = r15
            com.tencent.mm.plugin.sns.model.l6 r2 = (com.tencent.mm.plugin.sns.model.l6) r2
            int r3 = r2.f164432f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.f164432f = r3
            goto L1f
        L1a:
            com.tencent.mm.plugin.sns.model.l6 r2 = new com.tencent.mm.plugin.sns.model.l6
            r2.<init>(r11, r15)
        L1f:
            r7 = r2
            java.lang.Object r15 = r7.f164430d
            pz5.a r2 = pz5.a.f359186d
            int r3 = r7.f164432f
            java.lang.String r10 = "MicroMsg.SnsStarCgiHelper"
            r4 = 1
            if (r3 == 0) goto L3e
            if (r3 != r4) goto L33
            kotlin.ResultKt.throwOnFailure(r15)     // Catch: rm0.j -> L31
            goto L9c
        L31:
            r12 = move-exception
            goto L9f
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r12
        L3e:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r3 = "doRequestSnsStarAction >> "
            r15.<init>(r3)
            r15.append(r12)
            java.lang.String r3 = ", "
            r15.append(r3)
            r15.append(r13)
            java.lang.String r15 = r15.toString()
            com.tencent.mars.xlog.Log.i(r10, r15)
            com.tencent.mm.modelbase.i r3 = new com.tencent.mm.modelbase.i     // Catch: rm0.j -> L31
            r3.<init>()     // Catch: rm0.j -> L31
            r45.ia6 r15 = new r45.ia6     // Catch: rm0.j -> L31
            r15.<init>()     // Catch: rm0.j -> L31
            r15.f376895e = r12     // Catch: rm0.j -> L31
            r15.f376894d = r13     // Catch: rm0.j -> L31
            com.tencent.mm.modelbase.l r12 = new com.tencent.mm.modelbase.l     // Catch: rm0.j -> L31
            r12.<init>()     // Catch: rm0.j -> L31
            r12.f70664a = r15     // Catch: rm0.j -> L31
            r45.ja6 r13 = new r45.ja6     // Catch: rm0.j -> L31
            r13.<init>()     // Catch: rm0.j -> L31
            r12.f70665b = r13     // Catch: rm0.j -> L31
            r13 = 11969(0x2ec1, float:1.6772E-41)
            r12.f70667d = r13     // Catch: rm0.j -> L31
            java.lang.String r13 = "/cgi-bin/micromsg-bin/mmsnsstickyontop"
            r12.f70666c = r13     // Catch: rm0.j -> L31
            r13 = 0
            r12.f70668e = r13     // Catch: rm0.j -> L31
            r12.f70669f = r13     // Catch: rm0.j -> L31
            com.tencent.mm.modelbase.o r12 = r12.a()     // Catch: rm0.j -> L31
            r3.p(r12)     // Catch: rm0.j -> L31
            r12 = 0
            r6 = 0
            r8 = 3
            r9 = 0
            r7.f164432f = r4     // Catch: rm0.j -> L31
            r4 = r12
            java.lang.Object r15 = rm0.h.a(r3, r4, r6, r7, r8, r9)     // Catch: rm0.j -> L31
            if (r15 != r2) goto L9c
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L9c:
            r45.ja6 r15 = (r45.ja6) r15     // Catch: rm0.j -> L31
            goto Lb1
        L9f:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "doRequestSnsStarAction error >> "
            r13.<init>(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.tencent.mars.xlog.Log.e(r10, r12)
            r15 = 0
        Lb1:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.n6.a(int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(2:21|22))|11|12|13))|25|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsStarCgiHelper", "doRequestSnsStarList error >> " + r12);
        r15 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r12, long r13, kotlin.coroutines.Continuation r15) {
        /*
            r11 = this;
            java.lang.String r0 = "doRequestSnsStarList"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsStarCgiHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r15 instanceof com.tencent.mm.plugin.sns.model.m6
            if (r2 == 0) goto L1a
            r2 = r15
            com.tencent.mm.plugin.sns.model.m6 r2 = (com.tencent.mm.plugin.sns.model.m6) r2
            int r3 = r2.f164479f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.f164479f = r3
            goto L1f
        L1a:
            com.tencent.mm.plugin.sns.model.m6 r2 = new com.tencent.mm.plugin.sns.model.m6
            r2.<init>(r11, r15)
        L1f:
            r7 = r2
            java.lang.Object r15 = r7.f164477d
            pz5.a r2 = pz5.a.f359186d
            int r3 = r7.f164479f
            java.lang.String r10 = "MicroMsg.SnsStarCgiHelper"
            r4 = 1
            if (r3 == 0) goto L3e
            if (r3 != r4) goto L33
            kotlin.ResultKt.throwOnFailure(r15)     // Catch: rm0.j -> L31
            goto L9c
        L31:
            r12 = move-exception
            goto L9f
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r12
        L3e:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r3 = "doRequestSnsStarList >> "
            r15.<init>(r3)
            r15.append(r12)
            java.lang.String r3 = ", "
            r15.append(r3)
            r15.append(r13)
            java.lang.String r15 = r15.toString()
            com.tencent.mars.xlog.Log.i(r10, r15)
            com.tencent.mm.modelbase.i r3 = new com.tencent.mm.modelbase.i     // Catch: rm0.j -> L31
            r3.<init>()     // Catch: rm0.j -> L31
            r45.xa6 r15 = new r45.xa6     // Catch: rm0.j -> L31
            r15.<init>()     // Catch: rm0.j -> L31
            r15.f389918e = r13     // Catch: rm0.j -> L31
            r15.f389917d = r12     // Catch: rm0.j -> L31
            com.tencent.mm.modelbase.l r12 = new com.tencent.mm.modelbase.l     // Catch: rm0.j -> L31
            r12.<init>()     // Catch: rm0.j -> L31
            r12.f70664a = r15     // Catch: rm0.j -> L31
            r45.ya6 r13 = new r45.ya6     // Catch: rm0.j -> L31
            r13.<init>()     // Catch: rm0.j -> L31
            r12.f70665b = r13     // Catch: rm0.j -> L31
            r13 = 7678(0x1dfe, float:1.0759E-41)
            r12.f70667d = r13     // Catch: rm0.j -> L31
            java.lang.String r13 = "/cgi-bin/micromsg-bin/mmsnstoplist"
            r12.f70666c = r13     // Catch: rm0.j -> L31
            r13 = 0
            r12.f70668e = r13     // Catch: rm0.j -> L31
            r12.f70669f = r13     // Catch: rm0.j -> L31
            com.tencent.mm.modelbase.o r12 = r12.a()     // Catch: rm0.j -> L31
            r3.p(r12)     // Catch: rm0.j -> L31
            r12 = 0
            r6 = 0
            r8 = 3
            r9 = 0
            r7.f164479f = r4     // Catch: rm0.j -> L31
            r4 = r12
            java.lang.Object r15 = rm0.h.a(r3, r4, r6, r7, r8, r9)     // Catch: rm0.j -> L31
            if (r15 != r2) goto L9c
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L9c:
            r45.ya6 r15 = (r45.ya6) r15     // Catch: rm0.j -> L31
            goto Lb1
        L9f:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "doRequestSnsStarList error >> "
            r13.<init>(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.tencent.mars.xlog.Log.e(r10, r12)
            r15 = 0
        Lb1:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.n6.b(java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
