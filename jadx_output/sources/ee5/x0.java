package ee5;

/* loaded from: classes9.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f252082d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f252083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f252084f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ee5.y0 f252085g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(java.util.ArrayList arrayList, ee5.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f252084f = arrayList;
        this.f252085g = y0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ee5.x0 x0Var = new ee5.x0(this.f252084f, this.f252085g, continuation);
        x0Var.f252083e = obj;
        return x0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ot0.q v17;
        zy2.i iVar;
        r45.kv2 kv2Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f252082d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f252083e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.tencent.mm.storage.f9 f9Var : this.f252084f) {
                if (!kotlinx.coroutines.z0.h(y0Var)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemFinderFeedUIC", "is no active");
                    return f0Var;
                }
                java.lang.String j17 = f9Var.j();
                if (j17 != null && (v17 = ot0.q.v(j17)) != null && (iVar = (zy2.i) v17.y(zy2.i.class)) != null && (kv2Var = iVar.f477411b) != null) {
                    r45.bu2 bu2Var = new r45.bu2();
                    bu2Var.set(0, java.lang.Long.valueOf(f9Var.getMsgId()));
                    bu2Var.set(3, f9Var.Q0());
                    bu2Var.set(1, java.lang.Long.valueOf(f9Var.getCreateTime()));
                    bu2Var.set(2, kv2Var);
                    arrayList.add(bu2Var);
                }
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            ee5.w0 w0Var = new ee5.w0(this.f252085g, arrayList, null);
            this.f252082d = 1;
            if (kotlinx.coroutines.l.g(g3Var, w0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
