package rk4;

/* loaded from: classes11.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.ting.TingAudioRecordConfiguration f396644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f396645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f396646f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.ting.TingAudioRecordCallback f396647g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(com.tencent.pigeon.ting.TingAudioRecordConfiguration tingAudioRecordConfiguration, rk4.l3 l3Var, yz5.l lVar, com.tencent.pigeon.ting.TingAudioRecordCallback tingAudioRecordCallback) {
        super(0);
        this.f396644d = tingAudioRecordConfiguration;
        this.f396645e = l3Var;
        this.f396646f = lVar;
        this.f396647g = tingAudioRecordCallback;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qk.f8 f8Var = (qk.f8) i95.n0.c(qk.f8.class);
        com.tencent.pigeon.ting.TingAudioRecordConfiguration tingAudioRecordConfiguration = this.f396644d;
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
        rk4.l3 l3Var = this.f396645e;
        rk4.b3 b3Var = new rk4.b3(l3Var);
        gf0.r rVar4 = (gf0.r) f8Var2;
        rVar4.getClass();
        rVar4.f271238n = b3Var;
        qk.f8 f8Var3 = (qk.f8) i95.n0.c(qk.f8.class);
        rk4.c3 c3Var = new rk4.c3(this.f396646f);
        gf0.r rVar5 = (gf0.r) f8Var3;
        rVar5.getClass();
        rVar5.f271236i = c3Var;
        qk.f8 f8Var4 = (qk.f8) i95.n0.c(qk.f8.class);
        rk4.e3 e3Var = new rk4.e3(this.f396647g);
        gf0.r rVar6 = (gf0.r) f8Var4;
        rVar6.getClass();
        rVar6.f271239o = e3Var;
        qk.f8 f8Var5 = (qk.f8) i95.n0.c(qk.f8.class);
        android.app.Activity activity = l3Var.f396817e;
        kotlin.jvm.internal.o.d(activity);
        ((gf0.r) f8Var5).Ai(activity);
        return jz5.f0.f302826a;
    }
}
