package u84;

/* loaded from: classes4.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f425609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u84.m1 f425610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425612g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425613h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f425614i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f425615m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, u84.m1 m1Var, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f425609d = adClickActionInfo;
        this.f425610e = m1Var;
        this.f425611f = str;
        this.f425612g = str2;
        this.f425613h = str3;
        this.f425614i = snsInfo;
        this.f425615m = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$dispatchOverrideAndJump$2$1");
        u84.n0 n0Var = new u84.n0(this.f425609d, this.f425610e, this.f425611f, this.f425612g, this.f425613h, this.f425614i, this.f425615m, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$dispatchOverrideAndJump$2$1");
        return n0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$dispatchOverrideAndJump$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$dispatchOverrideAndJump$2$1");
        u84.n0 n0Var = (u84.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n0Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$dispatchOverrideAndJump$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$dispatchOverrideAndJump$2$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$dispatchOverrideAndJump$2$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.f425609d;
        adClickActionInfo.f162569a = 23;
        kotlinx.coroutines.r0 r0Var = u84.m1.N;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMOriginAdClickToTextStatusUIInfo$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        u84.m1 m1Var = this.f425610e;
        s34.d dVar = m1Var.f425593J;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMOriginAdClickToTextStatusUIInfo$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        if (dVar != null) {
            adClickActionInfo.f162610u0 = dVar;
        }
        java.lang.String str = this.f425611f;
        boolean z17 = str == null || r26.n0.N(str);
        java.lang.String str2 = this.f425612g;
        if (z17) {
            com.tencent.mars.xlog.Log.w(m1Var.j(), "dispatchOverrideAndJump: PATH C (async) — localMd5 unavailable, jump with XML default, aid=" + str2);
        } else {
            java.lang.String j17 = m1Var.j();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dispatchOverrideAndJump: PATH B (async) — md5 recomputed, aid=");
            sb6.append(str2);
            sb6.append(", urlLen=");
            java.lang.String str3 = this.f425613h;
            sb6.append(str3.length());
            sb6.append(", md5Len=");
            sb6.append(str.length());
            com.tencent.mars.xlog.Log.i(j17, sb6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$rebuildEmoticon", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
            m1Var.K(adClickActionInfo, str3, str, str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$rebuildEmoticon", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        }
        w64.n D = m1Var.D();
        if (D != null) {
            D.n(adClickActionInfo, this.f425614i);
        }
        w64.n D2 = m1Var.D();
        if (D2 != null) {
            D2.k(this.f425615m);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$dispatchOverrideAndJump$2$1");
        return f0Var;
    }
}
