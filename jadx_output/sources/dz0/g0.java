package dz0;

/* loaded from: classes5.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f244844d;

    /* renamed from: e, reason: collision with root package name */
    public int f244845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m5 f244847g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dz0.k0 f244848h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f244849i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244850m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f244851n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var, dz0.k0 k0Var, yz5.l lVar, java.lang.String str, kotlin.jvm.internal.e0 e0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f244846f = maasSdkUIC;
        this.f244847g = m5Var;
        this.f244848h = k0Var;
        this.f244849i = lVar;
        this.f244850m = str;
        this.f244851n = e0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz0.g0(this.f244846f, this.f244847g, this.f244848h, this.f244849i, this.f244850m, this.f244851n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00cc  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f244845e
            java.lang.String r2 = r10.f244850m
            kotlin.jvm.internal.e0 r3 = r10.f244851n
            dz0.k0 r4 = r10.f244848h
            r5 = 2
            r6 = 1
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r7 = r10.f244846f
            if (r1 == 0) goto L27
            if (r1 == r6) goto L23
            if (r1 != r5) goto L1b
            long r0 = r10.f244844d
            kotlin.ResultKt.throwOnFailure(r11)
            goto Lae
        L1b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L23:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L3a
        L27:
            kotlin.ResultKt.throwOnFailure(r11)
            dz0.f0 r11 = new dz0.f0
            r11.<init>(r3, r7, r4, r2)
            r10.f244845e = r6
            com.tencent.mm.mj_template.sns.compose.widget.m5 r1 = r10.f244847g
            java.lang.Object r11 = r7.e7(r1, r11, r10)
            if (r11 != r0) goto L3a
            return r0
        L3a:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            if (r11 == 0) goto L9a
            az0.e r0 = r4.f244902a
            if (r0 == 0) goto L4d
            java.lang.String r1 = r4.f244906e
            mz0.w1 r0 = (mz0.w1) r0
            r0.b(r1)
        L4d:
            yz5.l r0 = r10.f244849i
            if (r0 == 0) goto L56
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.invoke(r1)
        L56:
            r0 = -8
            if (r11 != r0) goto L60
            r0 = 2131757757(0x7f100abd, float:1.9146459E38)
            r7.r7(r0)
            goto L66
        L60:
            r0 = 2131771685(0x7f104125, float:1.9174708E38)
            r7.r7(r0)
        L66:
            az0.yb r0 = new az0.yb
            r1 = 0
            r2 = 0
            r3 = 3
            r0.<init>(r1, r2, r3, r2)
            r0.f16090a = r1
            com.tencent.mm.autogen.mmdata.rpt.MaasAITemplateMakeReportStruct r1 = oy0.a.f349833a
            if (r1 != 0) goto L75
            goto L81
        L75:
            if (r11 == 0) goto L7e
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r11 == r4) goto L7c
            goto L7f
        L7c:
            r5 = r3
            goto L7f
        L7e:
            r5 = r6
        L7f:
            r1.f58969d = r5
        L81:
            if (r1 != 0) goto L84
            goto L90
        L84:
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r3 = "failReason"
            java.lang.String r11 = r1.b(r3, r11, r6)
            r1.f58977l = r11
        L90:
            com.tencent.mm.autogen.mmdata.rpt.MaasAITemplateMakeReportStruct r11 = oy0.a.f349833a
            if (r11 == 0) goto L97
            r11.k()
        L97:
            oy0.a.f349833a = r2
            return r0
        L9a:
            long r8 = java.lang.System.currentTimeMillis()
            az0.e r11 = r4.f244902a
            float r1 = r3.f310115d
            r10.f244844d = r8
            r10.f244845e = r5
            java.lang.Object r11 = r7.T6(r2, r11, r1, r10)
            if (r11 != r0) goto Lad
            return r0
        Lad:
            r0 = r8
        Lae:
            az0.yb r11 = (az0.yb) r11
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "addMaasSwitchTemplateCostMs:"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.AITemplateReportUtils"
            com.tencent.mars.xlog.Log.i(r1, r0)
            com.tencent.mm.autogen.mmdata.rpt.MaasAITemplateMakeReportStruct r0 = oy0.a.f349833a
            if (r0 == 0) goto Ld1
            long r4 = r0.f58976k
            long r4 = r4 + r2
            r0.f58976k = r4
        Ld1:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dz0.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
