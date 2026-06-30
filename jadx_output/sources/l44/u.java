package l44;

/* loaded from: classes4.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f316366d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f316367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f316368f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f316369g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f316370h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h2 f316371i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f54.x f316372m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f316373n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.ui.widget.dialog.u3 u3Var, yz5.p pVar, android.widget.CheckBox checkBox, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h2 h2Var, f54.x xVar, android.widget.CheckBox checkBox2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f316368f = u3Var;
        this.f316369g = pVar;
        this.f316370h = checkBox;
        this.f316371i = h2Var;
        this.f316372m = xVar;
        this.f316373n = checkBox2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1");
        l44.u uVar = new l44.u(this.f316368f, this.f316369g, this.f316370h, this.f316371i, this.f316372m, this.f316373n, continuation);
        uVar.f316367e = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1");
        return uVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1");
        java.lang.Object invokeSuspend = ((l44.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00c5  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.String r1 = "invokeSuspend"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            pz5.a r3 = pz5.a.f359186d
            int r4 = r0.f316366d
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L36
            if (r4 == r6) goto L2c
            if (r4 != r5) goto L21
            java.lang.Object r3 = r0.f316367e
            l44.l r3 = (l44.l) r3
            kotlin.ResultKt.throwOnFailure(r21)
            r4 = r21
            goto L97
        L21:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            throw r3
        L2c:
            java.lang.Object r4 = r0.f316367e
            kotlinx.coroutines.f1 r4 = (kotlinx.coroutines.f1) r4
            kotlin.ResultKt.throwOnFailure(r21)
            r5 = r21
            goto L85
        L36:
            kotlin.ResultKt.throwOnFailure(r21)
            java.lang.Object r4 = r0.f316367e
            kotlinx.coroutines.y0 r4 = (kotlinx.coroutines.y0) r4
            r13 = 0
            r14 = 0
            l44.s r10 = new l44.s
            android.widget.CheckBox r7 = r0.f316370h
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h2 r15 = r0.f316371i
            f54.x r12 = r0.f316372m
            r11 = 0
            r10.<init>(r7, r15, r12, r11)
            r16 = 3
            r17 = 0
            r8 = 0
            r9 = 0
            r18 = 3
            r19 = 0
            r7 = r4
            r5 = r11
            r11 = r18
            r6 = r12
            r12 = r19
            kotlinx.coroutines.f1 r19 = kotlinx.coroutines.l.b(r7, r8, r9, r10, r11, r12)
            l44.t r10 = new l44.t
            android.widget.CheckBox r7 = r0.f316373n
            r10.<init>(r7, r15, r6, r5)
            r7 = r4
            r8 = r13
            r9 = r14
            r11 = r16
            r12 = r17
            kotlinx.coroutines.f1 r4 = kotlinx.coroutines.l.b(r7, r8, r9, r10, r11, r12)
            r0.f316367e = r4
            r5 = 1
            r0.f316366d = r5
            r5 = r19
            kotlinx.coroutines.g1 r5 = (kotlinx.coroutines.g1) r5
            java.lang.Object r5 = r5.k(r0)
            if (r5 != r3) goto L85
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        L85:
            l44.l r5 = (l44.l) r5
            r0.f316367e = r5
            r6 = 2
            r0.f316366d = r6
            java.lang.Object r4 = r4.k(r0)
            if (r4 != r3) goto L96
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        L96:
            r3 = r5
        L97:
            l44.l r4 = (l44.l) r4
            kotlinx.coroutines.r0 r5 = l44.y.f316420a
            java.lang.String r5 = "getTAG"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "scope result called "
            r5.<init>(r6)
            r5.append(r3)
            r6 = 32
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "AdCombineFollowHfScreenHelper"
            com.tencent.mars.xlog.Log.i(r6, r5)
            com.tencent.mm.ui.widget.dialog.u3 r5 = r0.f316368f
            if (r5 == 0) goto Lc8
            r5.cancel()
        Lc8:
            yz5.p r5 = r0.f316369g
            r5.invoke(r3, r4)
            jz5.f0 r3 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
