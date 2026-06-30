package on2;

/* loaded from: classes3.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f346960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on2.v0 f346961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s71.b f346962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.cz1 f346963g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(on2.v0 v0Var, s71.b bVar, r45.cz1 cz1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f346961e = v0Var;
        this.f346962f = bVar;
        this.f346963g = cz1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new on2.l0(this.f346961e, this.f346962f, this.f346963g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((on2.l0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f346960d;
        on2.v0 v0Var = this.f346961e;
        s71.b bVar = this.f346962f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            on2.l3 l3Var = on2.l3.f346966a;
            long j17 = v0Var.f347028J;
            androidx.appcompat.app.AppCompatActivity activity = v0Var.getActivity();
            java.lang.String str = "claim addr:" + bVar.f403976m;
            r45.p30 p30Var = new r45.p30();
            p30Var.set(0, bVar.f403977n);
            p30Var.set(1, bVar.f403978o);
            p30Var.set(2, l3Var.d(bVar));
            r45.cz1 it = this.f346963g;
            kotlin.jvm.internal.o.f(it, "$it");
            this.f346960d = 1;
            obj = l3Var.h(j17, null, activity, str, p30Var, it, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.yy1 yy1Var = (r45.yy1) obj;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (yy1Var != null) {
            pm0.v.X(new on2.k0(v0Var, yy1Var));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveLotteryAudienceUIC", "claim addr:" + bVar.f403976m + " but resp is null!");
        }
        return f0Var2;
    }
}
