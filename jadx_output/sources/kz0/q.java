package kz0;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f313794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313796f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(yz5.l lVar, n0.v2 v2Var, n0.v2 v2Var2) {
        super(0);
        this.f313794d = lVar;
        this.f313795e = v2Var;
        this.f313796f = v2Var2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int h17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsTemplateShowMusicDrawerV2());
        boolean fj6 = h17 != 2 ? h17 != 3 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_musicdrawer_v2, true) : false : true;
        com.tencent.mars.xlog.Log.i("SnsMaasConfigImpl", "enableUseMusicDrawerV2: " + fj6);
        kz0.a aVar = fj6 ? kz0.a.f313647o : kz0.a.f313643h;
        int i17 = kz0.k1.f313767a;
        n0.v2 v2Var = this.f313795e;
        v2Var.setValue(aVar);
        this.f313796f.setValue(java.lang.Boolean.TRUE);
        this.f313794d.invoke((kz0.a) v2Var.getValue());
        return jz5.f0.f302826a;
    }
}
