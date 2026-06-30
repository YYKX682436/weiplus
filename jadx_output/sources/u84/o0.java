package u84;

/* loaded from: classes4.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f425617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u84.m1 f425618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425619f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f425620g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425621h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f425622i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f425623m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(u84.m1 m1Var, java.lang.String str, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, java.lang.String str2, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f425618e = m1Var;
        this.f425619f = str;
        this.f425620g = adClickActionInfo;
        this.f425621h = str2;
        this.f425622i = snsInfo;
        this.f425623m = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$dispatchOverrideAndJump$2");
        u84.o0 o0Var = new u84.o0(this.f425618e, this.f425619f, this.f425620g, this.f425621h, this.f425622i, this.f425623m, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$dispatchOverrideAndJump$2");
        return o0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$dispatchOverrideAndJump$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$dispatchOverrideAndJump$2");
        java.lang.Object invokeSuspend = ((u84.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$dispatchOverrideAndJump$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$dispatchOverrideAndJump$2");
        return invokeSuspend;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        java.lang.Object m521constructorimpl2;
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$dispatchOverrideAndJump$2");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f425617d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str2 = this.f425619f;
            kotlinx.coroutines.r0 r0Var = u84.m1.N;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$computeLocalMd5InIo", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
            this.f425618e.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("computeLocalMd5InIo", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(za4.t0.l("adId_mm", str2));
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                m521constructorimpl = null;
            }
            java.lang.String str3 = (java.lang.String) m521constructorimpl;
            boolean z17 = false;
            if (!(str3 == null || r26.n0.N(str3))) {
                try {
                    m521constructorimpl2 = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.j(str3)));
                } catch (java.lang.Throwable th7) {
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    m521constructorimpl2 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
                }
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                if (kotlin.Result.m527isFailureimpl(m521constructorimpl2)) {
                    m521constructorimpl2 = bool;
                }
                if (((java.lang.Boolean) m521constructorimpl2).booleanValue()) {
                    z17 = true;
                }
            }
            if (z17) {
                try {
                    str = kotlin.Result.m521constructorimpl(com.tencent.mm.vfs.w6.p(str3));
                } catch (java.lang.Throwable th8) {
                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                    str = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th8));
                }
                r10 = kotlin.Result.m527isFailureimpl(str) ? null : str;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("computeLocalMd5InIo", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$computeLocalMd5InIo", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            u84.n0 n0Var = new u84.n0(this.f425620g, this.f425618e, r10, this.f425621h, this.f425619f, this.f425622i, this.f425623m, null);
            this.f425617d = 1;
            if (kotlinx.coroutines.l.g(g3Var, n0Var, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$dispatchOverrideAndJump$2");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$dispatchOverrideAndJump$2");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$dispatchOverrideAndJump$2");
        return f0Var;
    }
}
