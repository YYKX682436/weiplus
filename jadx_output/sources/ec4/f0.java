package ec4;

/* loaded from: classes10.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f251145d;

    /* renamed from: e, reason: collision with root package name */
    public int f251146e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC f251147f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC snsFakeVideoPlayUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251147f = snsFakeVideoPlayUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
        ec4.f0 f0Var = new ec4.f0(this.f251147f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
        return f0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
        java.lang.Object invokeSuspend = ((ec4.f0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object g17;
        com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC snsFakeVideoPlayUIC;
        java.lang.Object g18;
        com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC snsFakeVideoPlayUIC2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f251146e;
        com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC snsFakeVideoPlayUIC3 = this.f251147f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isPreview$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            boolean z17 = snsFakeVideoPlayUIC3.f168327g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isPreview$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            if (z17) {
                n55.f fVar = (n55.f) i95.n0.c(n55.f.class);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getWorkTagId$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                java.lang.String str = snsFakeVideoPlayUIC3.f168328h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getWorkTagId$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                com.tencent.mm.videocomposition.play.VideoCompositionPlayView O6 = com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC.O6(snsFakeVideoPlayUIC3);
                this.f251145d = snsFakeVideoPlayUIC3;
                this.f251146e = 1;
                ((wp4.x) fVar).getClass();
                up4.g gVar = up4.g.f429873a;
                g18 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new up4.f(str, O6, null), this);
                if (g18 == aVar) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
                    return aVar;
                }
                snsFakeVideoPlayUIC2 = snsFakeVideoPlayUIC3;
                long longValue = ((java.lang.Number) g18).longValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                snsFakeVideoPlayUIC2.f168325e = longValue;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preview initViewToPlayFakeVideo >> key: ");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                long j17 = snsFakeVideoPlayUIC3.f168325e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                sb6.append(j17);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoPlayUIC", sb6.toString());
            } else {
                n55.f fVar2 = (n55.f) i95.n0.c(n55.f.class);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSnsLocalId$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                int i18 = snsFakeVideoPlayUIC3.f168329i;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSnsLocalId$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                com.tencent.mm.videocomposition.play.VideoCompositionPlayView O62 = com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC.O6(snsFakeVideoPlayUIC3);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMutePlay$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                boolean z18 = snsFakeVideoPlayUIC3.f168331n;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMutePlay$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSnsCreateTime$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                int i19 = snsFakeVideoPlayUIC3.f168330m;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSnsCreateTime$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                this.f251145d = snsFakeVideoPlayUIC3;
                this.f251146e = 2;
                ((wp4.x) fVar2).getClass();
                up4.g gVar2 = up4.g.f429873a;
                g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new up4.c(i18, z18, i19, O62, null), this);
                if (g17 == aVar) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
                    return aVar;
                }
                snsFakeVideoPlayUIC = snsFakeVideoPlayUIC3;
                long longValue2 = ((java.lang.Number) g17).longValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                snsFakeVideoPlayUIC.f168325e = longValue2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("no preview initViewToPlayFakeVideo >> key: ");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                long j18 = snsFakeVideoPlayUIC3.f168325e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                sb7.append(j18);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoPlayUIC", sb7.toString());
            }
        } else if (i17 == 1) {
            snsFakeVideoPlayUIC2 = (com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC) this.f251145d;
            kotlin.ResultKt.throwOnFailure(obj);
            g18 = obj;
            long longValue3 = ((java.lang.Number) g18).longValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            snsFakeVideoPlayUIC2.f168325e = longValue3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            java.lang.StringBuilder sb62 = new java.lang.StringBuilder("preview initViewToPlayFakeVideo >> key: ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            long j172 = snsFakeVideoPlayUIC3.f168325e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            sb62.append(j172);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoPlayUIC", sb62.toString());
        } else {
            if (i17 != 2) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
                throw illegalStateException;
            }
            snsFakeVideoPlayUIC = (com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC) this.f251145d;
            kotlin.ResultKt.throwOnFailure(obj);
            g17 = obj;
            long longValue22 = ((java.lang.Number) g17).longValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            snsFakeVideoPlayUIC.f168325e = longValue22;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            java.lang.StringBuilder sb72 = new java.lang.StringBuilder("no preview initViewToPlayFakeVideo >> key: ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            long j182 = snsFakeVideoPlayUIC3.f168325e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            sb72.append(j182);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoPlayUIC", sb72.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$requestFoucs", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        boolean Q6 = snsFakeVideoPlayUIC3.Q6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$requestFoucs", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        if (!Q6) {
            com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC.O6(snsFakeVideoPlayUIC3).f(true);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
        return f0Var;
    }
}
