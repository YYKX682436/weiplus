package qa4;

/* loaded from: classes4.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f361082d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f361083e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f361084f;

    /* renamed from: g, reason: collision with root package name */
    public int f361085g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f361086h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f361087i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z17, r45.jj4 jj4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f361086h = z17;
        this.f361087i = jj4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        qa4.e eVar = new qa4.e(this.f361086h, this.f361087i, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        return eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        java.lang.Object invokeSuspend = ((qa4.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String i17;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        pz5.a aVar = pz5.a.f359186d;
        int i19 = this.f361085g;
        if (i19 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z17 = this.f361086h;
            r45.jj4 jj4Var = this.f361087i;
            java.lang.String U = z17 ? ca4.z0.U(jj4Var) : ca4.z0.J(jj4Var);
            if (z17) {
                i17 = com.tencent.mm.plugin.sns.model.i1.t(jj4Var);
            } else {
                i17 = com.tencent.mm.vfs.w6.i(com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + U, false);
            }
            if (com.tencent.mm.vfs.w6.j(i17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsImageLoader", "getImagePathFromMedia fileExists path:" + i17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
                return i17;
            }
            ca4.s0 s0Var = new ca4.s0(jj4Var);
            if (z17) {
                s0Var.d(1);
                i18 = jj4Var.f377856e == 6 ? 5 : 1;
            } else {
                s0Var.d(3);
                i18 = 2;
            }
            s0Var.e(jj4Var.f377855d);
            com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsImageLoader", "start downloading mediaId=" + jj4Var.f377855d);
            Cj.d(jj4Var, i18, s0Var, com.tencent.mm.storage.s7.f195303g);
            this.f361082d = i17;
            this.f361083e = Cj;
            this.f361084f = jj4Var;
            this.f361085g = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            qa4.d dVar = new qa4.d(jj4Var, i17, Cj, rVar);
            Cj.c(dVar);
            rVar.m(new qa4.c(Cj, dVar));
            obj = rVar.j();
            if (obj == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
                return aVar;
            }
        } else {
            if (i19 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        return obj;
    }
}
