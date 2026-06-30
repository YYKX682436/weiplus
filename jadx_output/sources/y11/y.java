package y11;

/* loaded from: classes11.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f458842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w11.r1 f458843e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f458844f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f458845g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(w11.r1 r1Var, long j17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f458843e = r1Var;
        this.f458844f = j17;
        this.f458845g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new y11.y(this.f458843e, this.f458844f, this.f458845g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((y11.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f458842d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            g75.k kVar = g75.r.f269391p;
            java.util.List i18 = kz5.c0.i(y11.r.class, y11.o.class, y11.q.class, y11.k.class, y11.n.class);
            w11.r1 r1Var = this.f458843e;
            r1Var.getClass();
            g75.z zVar = new g75.z();
            zVar.l("PPCKey_Params", r1Var);
            zVar.l("PPCKey_InitCreateTime", new java.lang.Long(this.f458844f));
            this.f458842d = 1;
            obj = g75.k.b(kVar, i18, zVar, "SendMsgMgr", 0L, this, 8, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.Long l17 = (java.lang.Long) ((g75.x) obj).f269405b.d("PPCKey_LocalMsgId");
        if (l17 != null) {
            this.f458845g.invoke(new java.lang.Long(l17.longValue()));
        }
        return jz5.f0.f302826a;
    }
}
