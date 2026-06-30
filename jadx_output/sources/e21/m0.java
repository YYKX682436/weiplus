package e21;

/* loaded from: classes11.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f246550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg3.q0 f246551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f246552f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f246553g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(xg3.q0 q0Var, java.lang.String str, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f246551e = q0Var;
        this.f246552f = str;
        this.f246553g = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new e21.m0(this.f246551e, this.f246552f, this.f246553g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((e21.m0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f246550d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String recordContent = this.f246552f;
                xg3.q0 q0Var = this.f246551e;
                if (q0Var != null) {
                    q0Var.f454424c = this.f246553g;
                    e21.r j17 = e21.z0.f246605d.j();
                    if (j17 != null && j17.s0(q0Var)) {
                        e21.e0 e0Var = e21.z0.f246606e;
                        e0Var.getClass();
                        kotlin.jvm.internal.o.g(recordContent, "recordContent");
                        ((ku5.t0) ku5.t0.f312615d).r(new e21.z(e0Var, q0Var, recordContent), "oplog_reporter_serial_tag");
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.OplogServiceKt", "dealWith option insert failed! stack=" + recordContent);
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealWith option ");
                sb6.append(q0Var != null ? e21.a1.a(q0Var) : null);
                sb6.append(", stack=");
                sb6.append(recordContent);
                com.tencent.mars.xlog.Log.i("MicroMsg.OplogServiceKt", sb6.toString());
                e21.z0 z0Var = e21.z0.f246605d;
                this.f246550d = 1;
                if (e21.z0.b(z0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OplogServiceKt", th6, "dealWith error", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
