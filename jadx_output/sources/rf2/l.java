package rf2;

/* loaded from: classes3.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f394794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.q f394795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s71.b f394796f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f394797g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(rf2.q qVar, s71.b bVar, r45.f02 f02Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f394795e = qVar;
        this.f394796f = bVar;
        this.f394797g = f02Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rf2.l(this.f394795e, this.f394796f, this.f394797g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rf2.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object e17;
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f394794d;
        s71.b bVar = this.f394796f;
        rf2.q qVar = this.f394795e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            on2.l3 l3Var = on2.l3.f346966a;
            long j17 = ((mm2.e1) qVar.f394854e.business(mm2.e1.class)).f328983m;
            byte[] bArr = ((mm2.e1) qVar.f394854e.business(mm2.e1.class)).f328985o;
            android.content.Context context = qVar.f394853d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String str = "claim addr:" + bVar.f403976m;
            r45.p30 p30Var = new r45.p30();
            p30Var.set(0, bVar.f403977n);
            p30Var.set(1, bVar.f403978o);
            p30Var.set(2, l3Var.d(bVar));
            java.lang.String str2 = this.f394797g.f373878d;
            this.f394794d = 1;
            e17 = l3Var.e(j17, bArr, context, str, p30Var, str2, this);
            if (e17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            e17 = obj;
        }
        r45.ul4 ul4Var = (r45.ul4) e17;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (ul4Var != null) {
            pm0.v.X(new rf2.k(qVar, ul4Var));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(qVar.f394855f, "claim addr:" + bVar.f403976m + " but resp is null!");
        }
        return f0Var2;
    }
}
