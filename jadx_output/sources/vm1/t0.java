package vm1;

/* loaded from: classes11.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.ting.TingAudioRecordConfiguration f438052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vm1.x0 f438053e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f438054f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.pigeon.ting.TingAudioRecordConfiguration tingAudioRecordConfiguration, vm1.x0 x0Var, yz5.l lVar) {
        super(0);
        this.f438052d = tingAudioRecordConfiguration;
        this.f438053e = x0Var;
        this.f438054f = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qk.f8 f8Var = (qk.f8) i95.n0.c(qk.f8.class);
        com.tencent.pigeon.ting.TingAudioRecordConfiguration tingAudioRecordConfiguration = this.f438052d;
        double minTimeInSecond = tingAudioRecordConfiguration.getMinTimeInSecond();
        double maxTimeInSecond = tingAudioRecordConfiguration.getMaxTimeInSecond();
        gf0.r rVar = (gf0.r) f8Var;
        rVar.f271233f = minTimeInSecond;
        rVar.f271234g = maxTimeInSecond;
        gf0.r rVar2 = (gf0.r) ((qk.f8) i95.n0.c(qk.f8.class));
        rVar2.f271236i = null;
        rVar2.f271237m = null;
        rVar2.f271238n = null;
        rVar2.f271235h = null;
        rVar2.f271239o = null;
        com.tencent.pigeon.ting.TingRecordFormat format = tingAudioRecordConfiguration.getFormat();
        if (format != null) {
            gf0.r rVar3 = (gf0.r) ((qk.f8) i95.n0.c(qk.f8.class));
            rVar3.getClass();
            rVar3.f271235h = format;
        }
        qk.f8 f8Var2 = (qk.f8) i95.n0.c(qk.f8.class);
        vm1.x0 x0Var = this.f438053e;
        vm1.r0 r0Var = new vm1.r0(x0Var);
        gf0.r rVar4 = (gf0.r) f8Var2;
        rVar4.getClass();
        rVar4.f271238n = r0Var;
        qk.f8 f8Var3 = (qk.f8) i95.n0.c(qk.f8.class);
        vm1.s0 s0Var = new vm1.s0(this.f438054f);
        gf0.r rVar5 = (gf0.r) f8Var3;
        rVar5.getClass();
        rVar5.f271236i = s0Var;
        qk.f8 f8Var4 = (qk.f8) i95.n0.c(qk.f8.class);
        android.app.Activity activity = x0Var.f438069e;
        kotlin.jvm.internal.o.d(activity);
        ((gf0.r) f8Var4).Ai(activity);
        return jz5.f0.f302826a;
    }
}
