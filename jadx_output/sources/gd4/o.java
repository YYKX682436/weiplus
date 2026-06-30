package gd4;

/* loaded from: classes4.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f270788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.i1 f270789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f270790f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.s7 f270791g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f270792h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f270793i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ gd4.r f270794m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMPinProgressBtn f270795n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f270796o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f270797p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.sns.model.i1 i1Var, r45.jj4 jj4Var, com.tencent.mm.storage.s7 s7Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, r45.jj4 jj4Var2, gd4.r rVar, com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn, kotlinx.coroutines.flow.i2 i2Var, android.widget.ImageView imageView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270789e = i1Var;
        this.f270790f = jj4Var;
        this.f270791g = s7Var;
        this.f270792h = snsInfo;
        this.f270793i = jj4Var2;
        this.f270794m = rVar;
        this.f270795n = mMPinProgressBtn;
        this.f270796o = i2Var;
        this.f270797p = imageView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1");
        gd4.o oVar = new gd4.o(this.f270789e, this.f270790f, this.f270791g, this.f270792h, this.f270793i, this.f270794m, this.f270795n, this.f270796o, this.f270797p, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1");
        return oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1");
        java.lang.Object invokeSuspend = ((gd4.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.j qVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f270788d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            n74.h0 h0Var = n74.h0.f335363a;
            com.tencent.mm.plugin.sns.model.i1 i1Var = this.f270789e;
            r45.jj4 jj4Var = this.f270790f;
            com.tencent.mm.storage.s7 s7Var = this.f270791g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getThumbDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            if (jj4Var == null) {
                qVar = new kotlinx.coroutines.flow.p(new n74.z[0]);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            } else if (i1Var == null) {
                qVar = new kotlinx.coroutines.flow.p(new n74.z[0]);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            } else {
                java.lang.String x17 = ca4.z0.x(1, jj4Var.f377855d);
                java.util.Set set = n74.h0.f335366d;
                synchronized (set) {
                    try {
                        set.add(x17 == null ? "" : x17);
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                        throw th6;
                    }
                }
                java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d);
                kotlin.jvm.internal.o.f(d17, "getMediaFilePath(...)");
                if (!com.tencent.mm.vfs.w6.j(d17 + ca4.z0.U(jj4Var))) {
                    kotlin.jvm.internal.o.d(x17);
                    ((kotlinx.coroutines.flow.h3) n74.h0.b(x17)).k(null);
                    ca4.s0 s0Var = new ca4.s0(jj4Var);
                    s0Var.d(1);
                    s0Var.e(jj4Var.f377855d);
                    com.tencent.mm.plugin.sns.model.l4.Cj().d(jj4Var, jj4Var.f377856e == 6 ? 5 : 1, s0Var, s7Var);
                }
                com.tencent.mm.memory.r k17 = i1Var.k(x17, jj4Var.f377855d);
                if (ca4.z0.g(k17)) {
                    java.lang.String Id = jj4Var.f377855d;
                    kotlin.jvm.internal.o.f(Id, "Id");
                    qVar = new kotlinx.coroutines.flow.q(new n74.z(Id, new java.lang.ref.WeakReference(k17), n74.y.f335447f));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHashSetContainsKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    boolean contains = ((java.util.HashSet) i1Var.f164274w).contains(x17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHashSetContainsKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    if (!contains) {
                        i1Var.I(1, jj4Var, s7Var, null);
                    }
                    java.lang.String Id2 = jj4Var.f377855d;
                    kotlin.jvm.internal.o.f(Id2, "Id");
                    kotlinx.coroutines.flow.g0 g0Var = new kotlinx.coroutines.flow.g0(new kotlinx.coroutines.flow.q(new n74.z(Id2, null, n74.y.f335445d)), new n74.f0(x17, null));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                    qVar = g0Var;
                }
            }
            kotlinx.coroutines.flow.j a17 = h0Var.a(this.f270792h, this.f270789e, this.f270790f, this.f270791g);
            kotlinx.coroutines.flow.j a18 = h0Var.a(this.f270792h, this.f270789e, this.f270793i, this.f270791g);
            kotlinx.coroutines.flow.j2 d18 = this.f270794m.d();
            gd4.r rVar = this.f270794m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPlayStateFlow$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
            kotlinx.coroutines.flow.j2 j2Var = rVar.f270827l;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPlayStateFlow$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
            kotlinx.coroutines.flow.j i18 = kotlinx.coroutines.flow.l.i(new kotlinx.coroutines.flow.e2(new kotlinx.coroutines.flow.j[]{qVar, a17, a18, d18, j2Var}, new gd4.l(null)));
            gd4.n nVar = new gd4.n(this.f270794m, this.f270795n, this.f270796o, this.f270789e, this.f270790f, this.f270797p);
            this.f270788d = 1;
            if (i18.a(nVar, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1");
        return f0Var;
    }
}
