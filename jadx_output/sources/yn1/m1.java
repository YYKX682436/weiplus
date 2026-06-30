package yn1;

/* loaded from: classes9.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f463753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f463755f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(yn1.r2 r2Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463754e = r2Var;
        this.f463755f = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.m1(this.f463754e, this.f463755f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.m1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f463753d;
        long j17 = this.f463755f;
        yn1.r2 r2Var = this.f463754e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                yn1.z0 z0Var = yn1.z0.f463933a;
                this.f463753d = 1;
                obj = z0Var.d(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            jz5.l lVar = (jz5.l) obj;
            if (lVar != null) {
                java.lang.String str = (java.lang.String) lVar.f302833d;
                java.lang.String str2 = (java.lang.String) lVar.f302834e;
                com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[createGroupAsync] success: networkName=" + str + ", passphrase=" + str2);
                com.tencent.wechat.aff.migration.g gVar = r2Var.f463810a;
                if (gVar == null) {
                    kotlin.jvm.internal.o.o("callback");
                    throw null;
                }
                gVar.i1(j17, str, str2);
            } else {
                com.tencent.mars.xlog.Log.e("MM.Mig.MigrationPlatformImpl", "[createGroupAsync] failed: result is null");
                com.tencent.wechat.aff.migration.g gVar2 = r2Var.f463810a;
                if (gVar2 == null) {
                    kotlin.jvm.internal.o.o("callback");
                    throw null;
                }
                gVar2.i1(j17, "", "");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationPlatformImpl", "[createGroupAsync] error", e17);
            com.tencent.wechat.aff.migration.g gVar3 = r2Var.f463810a;
            if (gVar3 == null) {
                kotlin.jvm.internal.o.o("callback");
                throw null;
            }
            gVar3.i1(j17, "", "");
        }
        return jz5.f0.f302826a;
    }
}
