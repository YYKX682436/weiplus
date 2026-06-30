package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class da extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f200875d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f200876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ja f200877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ta f200878g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200879h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f200880i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pk4.d f200881m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f200882n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f200883o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(com.tencent.mm.ui.chatting.gallery.ja jaVar, com.tencent.mm.ui.chatting.gallery.ta taVar, com.tencent.mm.storage.f9 f9Var, int i17, pk4.d dVar, t21.v2 v2Var, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f200877f = jaVar;
        this.f200878g = taVar;
        this.f200879h = f9Var;
        this.f200880i = i17;
        this.f200881m = dVar;
        this.f200882n = v2Var;
        this.f200883o = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.ui.chatting.gallery.da daVar = new com.tencent.mm.ui.chatting.gallery.da(this.f200877f, this.f200878g, this.f200879h, this.f200880i, this.f200881m, this.f200882n, this.f200883o, continuation);
        daVar.f200876e = obj;
        return daVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.gallery.da) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        java.lang.String str = "Failed to wait video to be downloaded: ";
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f200875d;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        try {
            try {
                if (i17 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.tencent.mm.ui.chatting.gallery.ja jaVar = this.f200877f;
                    fk4.u uVar = jaVar.f201082w;
                    if (uVar != null) {
                        ((fk4.k) uVar).f263621i = jaVar.S();
                    }
                    fk4.u uVar2 = this.f200877f.f201082w;
                    if (uVar2 != null) {
                        ((fk4.k) uVar2).m();
                        f0Var = f0Var2;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        com.tencent.mm.ui.chatting.gallery.ja jaVar2 = this.f200877f;
                        com.tencent.mm.storage.f9 f9Var = this.f200879h;
                        t21.v2 v2Var = this.f200882n;
                        if (jaVar2.S()) {
                            com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct = new com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct();
                            tPVideoPlayReportStruct.f61055i = f9Var.I0();
                            ok4.c cVar = new ok4.c(jaVar2.f201077r);
                            kotlin.jvm.internal.o.d(v2Var);
                            fk4.k kVar = (fk4.k) com.tencent.mm.ui.chatting.gallery.ja.C(jaVar2, f9Var, v2Var, cVar, tPVideoPlayReportStruct);
                            kVar.f263613a.f(0);
                            com.tencent.mm.ui.chatting.gallery.p.f201254a.b();
                            kVar.o();
                        }
                    }
                    if (this.f200877f.S()) {
                        fk4.u uVar3 = this.f200877f.f201082w;
                        if (uVar3 != null) {
                            ((fk4.k) uVar3).f263621i = true;
                        }
                        this.f200877f.f200886d.f201092g.v9(com.tencent.mm.ui.chatting.gallery.s.f201348f, this.f200878g.f201425c);
                    }
                    this.f200877f.K(this.f200878g, t21.d3.g(com.tencent.mm.ui.chatting.gallery.j1.s(this.f200879h)));
                    ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.gallery.ca(this.f200877f, this.f200883o));
                    int i18 = this.f200880i;
                    if (i18 == 2) {
                        this.f200877f.getClass();
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 14L, 1L, false);
                    } else if (i18 == 1) {
                        this.f200877f.getClass();
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 11L, 1L, false);
                    }
                    com.tencent.mm.ui.chatting.gallery.ja jaVar3 = this.f200877f;
                    jaVar3.f201081v = true;
                    com.tencent.mm.storage.f9 f9Var2 = this.f200879h;
                    this.f200875d = 1;
                    java.lang.Object F = jaVar3.F(f9Var2, this);
                    str = F;
                    if (F == aVar) {
                        return aVar;
                    }
                } else {
                    if (i17 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    str = str;
                }
                if (this.f200877f.S()) {
                    com.tencent.mm.ui.chatting.gallery.ja jaVar4 = this.f200877f;
                    if (jaVar4.f201081v) {
                        jaVar4.K(this.f200878g, t21.d3.g(com.tencent.mm.ui.chatting.gallery.j1.s(this.f200879h)));
                        com.tencent.mm.ui.chatting.gallery.ja.D(this.f200877f, this.f200878g);
                    }
                } else {
                    this.f200877f.L(this.f200878g, true);
                }
                int i19 = this.f200880i;
                if (i19 == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "do restransmit video");
                    this.f200877f.getClass();
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 15L, 1L, false);
                    this.f200877f.f200886d.p(this.f200879h);
                    this.f200877f.f200886d.f201092g.Q8(-1L);
                    if (this.f200881m.getIsOnlineVideo()) {
                        t21.d3.w(this.f200882n.d(), this.f200881m.getCurrentPosition(), true);
                    }
                } else if (i19 == 2) {
                    this.f200877f.getClass();
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 16L, 1L, false);
                    com.tencent.mm.ui.chatting.gallery.ja jaVar5 = this.f200877f;
                    if (jaVar5.f201081v) {
                        com.tencent.mm.ui.chatting.gallery.k1.m(jaVar5.f200886d.f201092g, this.f200879h, true, null);
                    }
                    this.f200877f.f200886d.f201092g.Q8(-1L);
                    if (this.f200881m.getIsOnlineVideo()) {
                        t21.d3.w(this.f200882n.d(), this.f200881m.getCurrentPosition(), true);
                    }
                }
                this.f200877f.f201081v = false;
                return f0Var2;
            } catch (java.lang.IllegalStateException e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Imagegallery.handler.video.tp", str + e17.getMessage());
                if (this.f200877f.S()) {
                    com.tencent.mm.ui.chatting.gallery.ja jaVar6 = this.f200877f;
                    if (jaVar6.f201081v) {
                        jaVar6.K(this.f200878g, t21.d3.g(com.tencent.mm.ui.chatting.gallery.j1.s(this.f200879h)));
                        com.tencent.mm.ui.chatting.gallery.ja.D(this.f200877f, this.f200878g);
                    }
                } else {
                    this.f200877f.L(this.f200878g, true);
                }
                return f0Var2;
            }
        } catch (java.lang.Throwable th6) {
            if (this.f200877f.S()) {
                com.tencent.mm.ui.chatting.gallery.ja jaVar7 = this.f200877f;
                if (jaVar7.f201081v) {
                    jaVar7.K(this.f200878g, t21.d3.g(com.tencent.mm.ui.chatting.gallery.j1.s(this.f200879h)));
                    com.tencent.mm.ui.chatting.gallery.ja.D(this.f200877f, this.f200878g);
                }
            } else {
                this.f200877f.L(this.f200878g, true);
            }
            throw th6;
        }
    }
}
