package yx0;

/* loaded from: classes5.dex */
public final class u5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467689e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467689e = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.u5(this.f467689e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.u5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467688d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ((yy0.k8) ((pp0.q0) i95.n0.c(pp0.q0.class))).getClass();
            az0.i5 i5Var = az0.i5.f15557a;
            if (!(az0.i5.f15560d == az0.x2.f16039f && az0.i5.f15563g)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "reportMaasCoreWillStartUp");
                pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
                pp0.m0 m0Var = (pp0.m0) i95.n0.c(pp0.m0.class);
                kotlin.jvm.internal.o.d(m0Var);
                pp0.m0.n3(m0Var, "mjpublisher_maas_core_start_up", null, 2, null);
                jz5.l[] lVarArr = new jz5.l[2];
                yy0.m7 m7Var = (yy0.m7) l0Var;
                lVarArr[0] = new jz5.l("mj_publisher_session_id", m7Var.Ri());
                lVarArr[1] = new jz5.l("is_first_init", m7Var.aj() ? "1" : "0");
                pp0.m0.V8(m0Var, kz5.c1.k(lVarArr), "mjpublisher_maas_core_start_up", null, 4, null);
            }
            pp0.q0 q0Var = (pp0.q0) i95.n0.c(pp0.q0.class);
            yx0.t5 t5Var = yx0.t5.f467659d;
            ((yy0.k8) q0Var).getClass();
            az0.i5.s(az0.i5.f15557a, true, t5Var, false, 4, null);
            yx0.b8 b8Var = this.f467689e;
            this.f467688d = 1;
            java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f467171c2;
            b8Var.getClass();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            obj = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new yx0.h2(b8Var, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
