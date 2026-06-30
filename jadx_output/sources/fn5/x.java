package fn5;

/* loaded from: classes14.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f264769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f264770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f264771f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.util.ArrayList arrayList, fn5.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264770e = arrayList;
        this.f264771f = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fn5.x(this.f264770e, this.f264771f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn5.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f264769d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.ArrayList arrayList = this.f264770e;
            boolean isEmpty = arrayList.isEmpty();
            fn5.n0 n0Var = this.f264771f;
            if (isEmpty) {
                n0Var.f264723f.setValue(fn5.o0.f264745f);
                int size = n0Var.f264731q.size();
                fn5.p0 p0Var = (fn5.p0) n0Var.f264729o.getValue();
                int size2 = kotlin.jvm.internal.o.b(p0Var != null ? p0Var.name() : null, "PERSON") ? n0Var.f264732r.size() : 0;
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReportProvider", "reportSearchIfDone >> " + size + ", " + aq.o.f12920a + ", " + size2);
                if (!aq.o.f12920a) {
                    f65.o.f259919h = size;
                    f65.o oVar = f65.o.f259912a;
                    oVar.d(size2);
                    oVar.c(size > 0 ? 56 : 57);
                }
            } else {
                this.f264769d = 1;
                if (fn5.n0.N6(n0Var, arrayList, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
