package rk4;

/* loaded from: classes11.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f396538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f396539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f396540f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f396541g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.ting.TingAudioRecordCallback f396542h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(long j17, long j18, rk4.l3 l3Var, yz5.l lVar, com.tencent.pigeon.ting.TingAudioRecordCallback tingAudioRecordCallback) {
        super(0);
        this.f396538d = j17;
        this.f396539e = j18;
        this.f396540f = l3Var;
        this.f396541g = lVar;
        this.f396542h = tingAudioRecordCallback;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qk.f8 f8Var = (qk.f8) i95.n0.c(qk.f8.class);
        double d17 = this.f396538d;
        double d18 = this.f396539e;
        gf0.r rVar = (gf0.r) f8Var;
        rVar.f271233f = d17;
        rVar.f271234g = d18;
        gf0.r rVar2 = (gf0.r) ((qk.f8) i95.n0.c(qk.f8.class));
        rVar2.f271236i = null;
        rVar2.f271237m = null;
        rVar2.f271238n = null;
        rVar2.f271235h = null;
        rVar2.f271239o = null;
        qk.f8 f8Var2 = (qk.f8) i95.n0.c(qk.f8.class);
        rk4.l3 l3Var = this.f396540f;
        rk4.w2 w2Var = new rk4.w2(l3Var);
        gf0.r rVar3 = (gf0.r) f8Var2;
        rVar3.getClass();
        rVar3.f271238n = w2Var;
        qk.f8 f8Var3 = (qk.f8) i95.n0.c(qk.f8.class);
        rk4.x2 x2Var = new rk4.x2(this.f396541g);
        gf0.r rVar4 = (gf0.r) f8Var3;
        rVar4.getClass();
        rVar4.f271236i = x2Var;
        qk.f8 f8Var4 = (qk.f8) i95.n0.c(qk.f8.class);
        rk4.z2 z2Var = new rk4.z2(this.f396542h);
        gf0.r rVar5 = (gf0.r) f8Var4;
        rVar5.getClass();
        rVar5.f271239o = z2Var;
        qk.f8 f8Var5 = (qk.f8) i95.n0.c(qk.f8.class);
        android.app.Activity activity = l3Var.f396817e;
        kotlin.jvm.internal.o.d(activity);
        ((gf0.r) f8Var5).Ai(activity);
        return jz5.f0.f302826a;
    }
}
