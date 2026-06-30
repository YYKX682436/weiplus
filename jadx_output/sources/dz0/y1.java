package dz0;

/* loaded from: classes5.dex */
public final class y1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f245073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f245074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f245075f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, az0.n7 n7Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f245074e = maasSdkUIC;
        this.f245075f = n7Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        dz0.y1 y1Var = new dz0.y1(this.f245074e, this.f245075f, (kotlin.coroutines.Continuation) obj3);
        y1Var.f245073d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        y1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (((java.lang.Throwable) this.f245073d) == null) {
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC = this.f245074e;
            boolean z17 = maasSdkUIC.C;
            java.util.List list = kz5.p0.f313996d;
            if (z17) {
                dz0.x xVar = maasSdkUIC.f69789m;
                az0.n7 n7Var = this.f245075f;
                java.util.List currentTemplateMusicInfos = n7Var.f15742a.getCurrentTemplateMusicInfos();
                if (currentTemplateMusicInfos != null) {
                    list = currentTemplateMusicInfos;
                }
                xVar.b(list);
                dz0.x xVar2 = maasSdkUIC.f69789m;
                com.tencent.maas.model.MJMusicInfo currentMusicInfo = n7Var.f15742a.getCurrentMusicInfo();
                if (currentMusicInfo == null) {
                    currentMusicInfo = new com.tencent.maas.model.MJMusicInfo("", "", "", com.tencent.maas.model.time.MJTime.InvalidTime, new java.lang.Object[0]);
                }
                xVar2.a(currentMusicInfo);
            } else {
                maasSdkUIC.f69789m.b(list);
                maasSdkUIC.f69789m.a(new com.tencent.maas.model.MJMusicInfo("", "", "", com.tencent.maas.model.time.MJTime.InvalidTime, new java.lang.Object[0]));
            }
        }
        return jz5.f0.f302826a;
    }
}
